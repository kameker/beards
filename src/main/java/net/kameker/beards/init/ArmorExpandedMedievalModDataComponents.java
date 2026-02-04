package net.kameker.beards.init;

import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import java.util.function.UnaryOperator;

public class ArmorExpandedMedievalModDataComponents {
    public static final DeferredRegister<DataComponentType<?>> REGISTRY =
            DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, "beards");

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> BEARD_COLOR =
            REGISTRY.register("beard_color",
                    () -> DataComponentType.<Integer>builder()
                            .persistent(Codec.INT) // Кодец для целых чисел
                            .build());
}