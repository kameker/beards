package net.kameker.beards.util;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.kameker.beards.init.ArmorExpandedMedievalModDataComponents;

public class BeardColorUtil {
    public static final int DEFAULT_COLOR = 0; // Белый

    // Цвета соответствуют красителям Minecraft
    public static final int[] DYE_COLORS = {
            0xFFFFFF, // Белый
            0xD87F33, // Оранжевый
            0xB24CD8, // Пурпурный
            0x6699D8, // Голубой
            0xE5E533, // Жёлтый
            0x7FCC19, // Лаймовый
            0xF27FA5, // Розовый
            0x4C4C4C, // Серый
            0x999999, // Светло-серый
            0x4C7F99, // Бирюзовый
            0x7F3FB2, // Фиолетовый
            0x334CB2, // Синий
            0x664C33, // Коричневый
            0x667F33, // Зелёный
            0x993333, // Красный
            0x191919  // Чёрный
    };

    public static int getColor(ItemStack stack) {
        Integer color = stack.get(ArmorExpandedMedievalModDataComponents.BEARD_COLOR.get());
        return color != null ? color : DEFAULT_COLOR;
    }

    public static void setColor(ItemStack stack, int color) {
        stack.set(ArmorExpandedMedievalModDataComponents.BEARD_COLOR.get(), color);
    }

    public static void removeColor(ItemStack stack) {
        stack.remove(ArmorExpandedMedievalModDataComponents.BEARD_COLOR.get());
    }

    public static boolean isDyeableBeard(ItemStack stack) {
        String itemId = stack.getItem().toString();
        return itemId.contains("moustache") ||
                itemId.contains("beard") ||
                itemId.contains("goatee") ||
                itemId.contains("chops") ||
                itemId.contains("norse") ||
                itemId.contains("asian");
    }

    public static String getColorName(int color) {
        String[] colorNames = {
                "White", "Orange", "Magenta", "Light Blue",
                "Yellow", "Lime", "Pink", "Gray",
                "Light Gray", "Cyan", "Purple", "Blue",
                "Brown", "Green", "Red", "Black"
        };
        return colorNames[color % colorNames.length];
    }

    public static int getDyeColorIndex(net.minecraft.world.item.Item dyeItem) {
        if (dyeItem == Items.WHITE_DYE) return 0;
        if (dyeItem == Items.ORANGE_DYE) return 1;
        if (dyeItem == Items.MAGENTA_DYE) return 2;
        if (dyeItem == Items.LIGHT_BLUE_DYE) return 3;
        if (dyeItem == Items.YELLOW_DYE) return 4;
        if (dyeItem == Items.LIME_DYE) return 5;
        if (dyeItem == Items.PINK_DYE) return 6;
        if (dyeItem == Items.GRAY_DYE) return 7;
        if (dyeItem == Items.LIGHT_GRAY_DYE) return 8;
        if (dyeItem == Items.CYAN_DYE) return 9;
        if (dyeItem == Items.PURPLE_DYE) return 10;
        if (dyeItem == Items.BLUE_DYE) return 11;
        if (dyeItem == Items.BROWN_DYE) return 12;
        if (dyeItem == Items.GREEN_DYE) return 13;
        if (dyeItem == Items.RED_DYE) return 14;
        if (dyeItem == Items.BLACK_DYE) return 15;
        return DEFAULT_COLOR;
    }
}