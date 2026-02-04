package net.kameker.beards.item.Beards;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.kameker.beards.init.ArmorExpandedMedievalModDataComponents;
import net.kameker.beards.util.BeardColorUtil;

import java.util.List;

import static net.kameker.beards.util.BeardColorUtil.getColorName;

public class BeardItem extends Item {
    public BeardItem() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> components, TooltipFlag tooltipFlag) {
        Integer color = itemStack.get(ArmorExpandedMedievalModDataComponents.BEARD_COLOR.get());
        int colorIndex = color != null ? color : BeardColorUtil.DEFAULT_COLOR;
        String colorS = getColorName(colorIndex);
        components.add(Component.nullToEmpty(colorS));
        super.appendHoverText(itemStack, tooltipContext, components, tooltipFlag);
    }
}
