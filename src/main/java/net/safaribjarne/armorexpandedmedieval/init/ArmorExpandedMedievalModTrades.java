/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.safaribjarne.armorexpandedmedieval.init;

import net.neoforged.neoforge.event.village.WandererTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class ArmorExpandedMedievalModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(ArmorExpandedMedievalModItems.MOUSTACHE.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.SPLIT_MOUSTACHE.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.GOATEE.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.FULLBEARD.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.FULLBEARD_LARGE.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.FULLBEARD_LONG.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.GOAT_BEARD.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.GOAT_BEARD_LARGE.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.FORKBEARD.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.TRI_FORKBEARD.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.ASIAN_GOATEE.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.CHOPS.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.CHOPS_MOUSTACHE.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.NORSEBEARD.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.BRAIDED_BEARD.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.SNAKE_BEARD.get()), 3, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(ArmorExpandedMedievalModItems.ASIAN_LONG.get()), 3, 5, 0.05f));
	}
}