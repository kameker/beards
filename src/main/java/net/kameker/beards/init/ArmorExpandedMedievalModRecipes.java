package net.kameker.beards.init;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.kameker.beards.recipe.BeardDyeRecipe;

public class ArmorExpandedMedievalModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> REGISTRY =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, "beards");

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<BeardDyeRecipe>> BEARD_DYE_SERIALIZER =
            REGISTRY.register("beard_dye", () -> new BeardDyeRecipe.Serializer());
}