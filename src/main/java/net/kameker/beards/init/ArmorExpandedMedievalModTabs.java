/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kameker.beards.init;

import net.kameker.beards.ArmorExpandedMedievalMod;

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
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArmorExpandedMedievalMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = REGISTRY.register("creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.beards.creative_tab")).icon(() -> new ItemStack(ArmorExpandedMedievalModItems.FULLBEARD_LONG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ArmorExpandedMedievalModItems.BASCINET_HELMET.get());
				tabData.accept(ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR.get());
				tabData.accept(ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR_OFF.get());
				tabData.accept(ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR.get());
				tabData.accept(ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR_OFF.get());
				tabData.accept(ArmorExpandedMedievalModItems.MOUSTACHE.get());
				tabData.accept(ArmorExpandedMedievalModItems.SPLIT_MOUSTACHE.get());
				tabData.accept(ArmorExpandedMedievalModItems.GOATEE.get());
				tabData.accept(ArmorExpandedMedievalModItems.FULLBEARD.get());
				tabData.accept(ArmorExpandedMedievalModItems.FULLBEARD_LARGE.get());
				tabData.accept(ArmorExpandedMedievalModItems.FULLBEARD_LONG.get());
				tabData.accept(ArmorExpandedMedievalModItems.GOAT_BEARD.get());
				tabData.accept(ArmorExpandedMedievalModItems.GOAT_BEARD_LARGE.get());
				tabData.accept(ArmorExpandedMedievalModItems.FORKBEARD.get());
				tabData.accept(ArmorExpandedMedievalModItems.TRI_FORKBEARD.get());
				tabData.accept(ArmorExpandedMedievalModItems.ASIAN_GOATEE.get());
				tabData.accept(ArmorExpandedMedievalModItems.CHOPS.get());
				tabData.accept(ArmorExpandedMedievalModItems.CHOPS_MOUSTACHE.get());
				tabData.accept(ArmorExpandedMedievalModItems.NORSEBEARD.get());
				tabData.accept(ArmorExpandedMedievalModItems.BRAIDED_BEARD.get());
				tabData.accept(ArmorExpandedMedievalModItems.SNAKE_BEARD.get());
				tabData.accept(ArmorExpandedMedievalModItems.ASIAN_LONG.get());
				tabData.accept(ArmorExpandedMedievalModItems.SPARTAN_HELMET.get());
				tabData.accept(ArmorExpandedMedievalModItems.SPARTAN_CHESTPLATE.get());
				tabData.accept(ArmorExpandedMedievalModItems.SPARTAN_LEGGINGS.get());
				tabData.accept(ArmorExpandedMedievalModItems.SPARTAN_BOOTS.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ArmorExpandedMedievalModItems.BASCINET_HELMET.get());
			tabData.accept(ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR.get());
			tabData.accept(ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR_OFF.get());
			tabData.accept(ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR.get());
			tabData.accept(ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR_OFF.get());
			tabData.accept(ArmorExpandedMedievalModItems.SPARTAN_HELMET.get());
			tabData.accept(ArmorExpandedMedievalModItems.SPARTAN_CHESTPLATE.get());
			tabData.accept(ArmorExpandedMedievalModItems.SPARTAN_LEGGINGS.get());
			tabData.accept(ArmorExpandedMedievalModItems.SPARTAN_BOOTS.get());
		}
	}
}