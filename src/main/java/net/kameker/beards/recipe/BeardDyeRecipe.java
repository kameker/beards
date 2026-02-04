package net.kameker.beards.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.core.NonNullList;
import net.minecraft.world.level.Level;
import net.kameker.beards.util.BeardColorUtil;
import net.kameker.beards.init.ArmorExpandedMedievalModDataComponents;
import net.kameker.beards.init.ArmorExpandedMedievalModRecipes;
import net.minecraft.world.item.DyeItem;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;

public class BeardDyeRecipe extends CustomRecipe {
    public BeardDyeRecipe(CraftingBookCategory category) {
        super(category);
    }

    @Override
    public boolean matches(CraftingInput input, Level level) {
        ItemStack beard = ItemStack.EMPTY;
        ItemStack dye = ItemStack.EMPTY;
        int itemCount = 0;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (!stack.isEmpty()) {
                itemCount++;
                if (itemCount > 2) return false;

                if (BeardColorUtil.isDyeableBeard(stack)) {
                    if (!beard.isEmpty()) return false;
                    beard = stack;
                } else if (stack.getItem() instanceof DyeItem) {
                    if (!dye.isEmpty()) return false;
                    dye = stack;
                } else {
                    return false;
                }
            }
        }

        return !beard.isEmpty() && !dye.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingInput input, HolderLookup.Provider registries) {
        ItemStack beard = ItemStack.EMPTY;
        DyeItem dye = null;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (!stack.isEmpty()) {
                if (BeardColorUtil.isDyeableBeard(stack)) {
                    beard = stack;
                } else if (stack.getItem() instanceof DyeItem dyeItem) {
                    dye = dyeItem;
                }
            }
        }

        if (beard.isEmpty() || dye == null) {
            return ItemStack.EMPTY;
        }

        ItemStack result = beard.copyWithCount(1);
        int color = BeardColorUtil.getDyeColorIndex(dye);
        result.set(ArmorExpandedMedievalModDataComponents.BEARD_COLOR.get(), color);

        return result;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ArmorExpandedMedievalModRecipes.BEARD_DYE_SERIALIZER.get();
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingInput input) {
        NonNullList<ItemStack> remaining = NonNullList.withSize(input.size(), ItemStack.EMPTY);

        for (int i = 0; i < remaining.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.getItem() instanceof DyeItem) {
                if (stack.hasCraftingRemainingItem()) {
                    remaining.set(i, stack.getCraftingRemainingItem());
                }
            }
        }

        return remaining;
    }

    public static class Serializer implements RecipeSerializer<BeardDyeRecipe> {
        public static final MapCodec<BeardDyeRecipe> CODEC = RecordCodecBuilder.mapCodec(
                instance -> instance.group(
                        CraftingBookCategory.CODEC.fieldOf("category").orElse(CraftingBookCategory.MISC).forGetter(recipe -> recipe.category())
                ).apply(instance, BeardDyeRecipe::new)
        );

        public static final StreamCodec<RegistryFriendlyByteBuf, BeardDyeRecipe> STREAM_CODEC = StreamCodec.of(
                Serializer::toNetwork,
                Serializer::fromNetwork
        );

        @Override
        public MapCodec<BeardDyeRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, BeardDyeRecipe> streamCodec() {
            return STREAM_CODEC;
        }

        private static void toNetwork(RegistryFriendlyByteBuf buffer, BeardDyeRecipe recipe) {
            buffer.writeEnum(recipe.category());
        }

        private static BeardDyeRecipe fromNetwork(RegistryFriendlyByteBuf buffer) {
            CraftingBookCategory category = buffer.readEnum(CraftingBookCategory.class);
            return new BeardDyeRecipe(category);
        }
    }
}