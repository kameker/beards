/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kameker.beards;

import net.kameker.beards.item.*;
import net.kameker.beards.item.Beards.*;

import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;


public class ModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BeardsMod.MODID);

	//public static final DeferredItem<Item> SNOUTED_KLAPPVISOR = REGISTRY.register("snouted_klappvisor", SnoutedKlappvisorItem::new);
	//public static final DeferredItem<Item> SNOUTED_KLAPPVISOR_OFF = REGISTRY.register("snouted_klappvisor_off", SnoutedKlappvisorOffItem::new);
	//public static final DeferredItem<Item> FLAT_KLAPPVISOR = REGISTRY.register("flat_klappvisor", FlatKlappvisorItem::new);
	//public static final DeferredItem<Item> FLAT_KLAPPVISOR_OFF = REGISTRY.register("flat_klappvisor_off", FlatKlappvisorOffItem::new);
	public static final DeferredItem<Item> MOUSTACHE = REGISTRY.register("moustache", MoustacheItem::new);
	public static final DeferredItem<Item> SPLIT_MOUSTACHE = REGISTRY.register("split_moustache", SplitMoustacheItem::new);
	public static final DeferredItem<Item> GOATEE = REGISTRY.register("goatee", GoateeItem::new);
	public static final DeferredItem<Item> FULLBEARD = REGISTRY.register("fullbeard", FullbeardItem::new);
	public static final DeferredItem<Item> FULLBEARD_LARGE = REGISTRY.register("fullbeard_large", FullbeardLargeItem::new);
	public static final DeferredItem<Item> FULLBEARD_LONG = REGISTRY.register("fullbeard_long", FullbeardLongItem::new);
	public static final DeferredItem<Item> GOAT_BEARD = REGISTRY.register("goat_beard", GoatBeardItem::new);
	public static final DeferredItem<Item> GOAT_BEARD_LARGE = REGISTRY.register("goat_beard_large", GoatBeardLargeItem::new);
	public static final DeferredItem<Item> FORKBEARD = REGISTRY.register("forkbeard", ForkbeardItem::new);
	public static final DeferredItem<Item> TRI_FORKBEARD = REGISTRY.register("tri_forkbeard", TriForkbeardItem::new);
	public static final DeferredItem<Item> ASIAN_GOATEE = REGISTRY.register("asian_goatee", AsianGoateeItem::new);
	public static final DeferredItem<Item> CHOPS = REGISTRY.register("chops", ChopsItem::new);
	public static final DeferredItem<Item> CHOPS_MOUSTACHE = REGISTRY.register("chops_moustache", ChopsMoustacheItem::new);
	public static final DeferredItem<Item> NORSEBEARD = REGISTRY.register("norsebeard", NorsebeardItem::new);
	public static final DeferredItem<Item> BRAIDED_BEARD = REGISTRY.register("braided_beard", BraidedBeardItem::new);
	public static final DeferredItem<Item> SNAKE_BEARD = REGISTRY.register("snake_beard", SnakeBeardItem::new);
	public static final DeferredItem<Item> ASIAN_LONG = REGISTRY.register("asian_long", AsianLongItem::new);
	//public static final DeferredItem<Item> SPARTAN_HELMET = REGISTRY.register("spartan_helmet", SpartanItem.Helmet::new);
	//public static final DeferredItem<Item> SPARTAN_CHESTPLATE = REGISTRY.register("spartan_chestplate", SpartanItem.Chestplate::new);
	//public static final DeferredItem<Item> SPARTAN_LEGGINGS = REGISTRY.register("spartan_leggings", SpartanItem.Leggings::new);
	//public static final DeferredItem<Item> SPARTAN_BOOTS = REGISTRY.register("spartan_boots", SpartanItem.Boots::new);
	//public static final DeferredItem<Item> BASCINET_HELMET = REGISTRY.register("bascinet_helmet", BascinetItem.Helmet::new);

	public static void register(IEventBus eventBus) {
		REGISTRY.register(eventBus);
	}
}