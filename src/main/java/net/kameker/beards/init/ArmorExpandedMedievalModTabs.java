/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kameker.beards.init;

import net.kameker.beards.BeardsMod;

import net.kameker.beards.ModItems;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class ArmorExpandedMedievalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeardsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = REGISTRY.register("creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.beards.creative_tab")).icon(() -> new ItemStack(ModItems.FULLBEARD_LONG.get())).displayItems((parameters, tabData) -> {
				//tabData.accept(ModItems.BASCINET_HELMET.get());
				//tabData.accept(ModItems.SNOUTED_KLAPPVISOR.get());
				//tabData.accept(ModItems.SNOUTED_KLAPPVISOR_OFF.get());
				//tabData.accept(ModItems.FLAT_KLAPPVISOR.get());
				//tabData.accept(ModItems.FLAT_KLAPPVISOR_OFF.get());
				tabData.accept(ModItems.MOUSTACHE.get());
				tabData.accept(ModItems.SPLIT_MOUSTACHE.get());
				tabData.accept(ModItems.GOATEE.get());
				tabData.accept(ModItems.FULLBEARD.get());
				tabData.accept(ModItems.FULLBEARD_LARGE.get());
				tabData.accept(ModItems.FULLBEARD_LONG.get());
				tabData.accept(ModItems.GOAT_BEARD.get());
				tabData.accept(ModItems.GOAT_BEARD_LARGE.get());
				tabData.accept(ModItems.FORKBEARD.get());
				tabData.accept(ModItems.TRI_FORKBEARD.get());
				tabData.accept(ModItems.ASIAN_GOATEE.get());
				tabData.accept(ModItems.CHOPS.get());
				tabData.accept(ModItems.CHOPS_MOUSTACHE.get());
				tabData.accept(ModItems.NORSEBEARD.get());
				tabData.accept(ModItems.BRAIDED_BEARD.get());
				tabData.accept(ModItems.SNAKE_BEARD.get());
				tabData.accept(ModItems.ASIAN_LONG.get());
				//tabData.accept(ModItems.SPARTAN_HELMET.get());
				//tabData.accept(ModItems.SPARTAN_CHESTPLATE.get());
				//tabData.accept(ModItems.SPARTAN_LEGGINGS.get());
				//tabData.accept(ModItems.SPARTAN_BOOTS.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
	}
}