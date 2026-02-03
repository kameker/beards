/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.safaribjarne.armorexpandedmedieval.init;

import net.safaribjarne.armorexpandedmedieval.item.*;
import net.safaribjarne.armorexpandedmedieval.ArmorExpandedMedievalMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;
import net.safaribjarne.armorexpandedmedieval.item.Beards.*;

public class ArmorExpandedMedievalModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ArmorExpandedMedievalMod.MODID);
	public static final DeferredItem<Item> BASCINET_HELMET;
	public static final DeferredItem<Item> SNOUTED_KLAPPVISOR;
	public static final DeferredItem<Item> SNOUTED_KLAPPVISOR_OFF;
	public static final DeferredItem<Item> FLAT_KLAPPVISOR;
	public static final DeferredItem<Item> FLAT_KLAPPVISOR_OFF;
	public static final DeferredItem<Item> MOUSTACHE;
	public static final DeferredItem<Item> SPLIT_MOUSTACHE;
	public static final DeferredItem<Item> GOATEE;
	public static final DeferredItem<Item> FULLBEARD;
	public static final DeferredItem<Item> FULLBEARD_LARGE;
	public static final DeferredItem<Item> FULLBEARD_LONG;
	public static final DeferredItem<Item> GOAT_BEARD;
	public static final DeferredItem<Item> GOAT_BEARD_LARGE;
	public static final DeferredItem<Item> FORKBEARD;
	public static final DeferredItem<Item> TRI_FORKBEARD;
	public static final DeferredItem<Item> ASIAN_GOATEE;
	public static final DeferredItem<Item> CHOPS;
	public static final DeferredItem<Item> CHOPS_MOUSTACHE;
	public static final DeferredItem<Item> NORSEBEARD;
	public static final DeferredItem<Item> BRAIDED_BEARD;
	public static final DeferredItem<Item> SNAKE_BEARD;
	public static final DeferredItem<Item> ASIAN_LONG;
	public static final DeferredItem<Item> SPARTAN_HELMET;
	public static final DeferredItem<Item> SPARTAN_CHESTPLATE;
	public static final DeferredItem<Item> SPARTAN_LEGGINGS;
	public static final DeferredItem<Item> SPARTAN_BOOTS;
	static {
		BASCINET_HELMET = REGISTRY.register("bascinet_helmet", BascinetItem.Helmet::new);
		SNOUTED_KLAPPVISOR = REGISTRY.register("snouted_klappvisor", SnoutedKlappvisorItem::new);
		SNOUTED_KLAPPVISOR_OFF = REGISTRY.register("snouted_klappvisor_off", SnoutedKlappvisorOffItem::new);
		FLAT_KLAPPVISOR = REGISTRY.register("flat_klappvisor", FlatKlappvisorItem::new);
		FLAT_KLAPPVISOR_OFF = REGISTRY.register("flat_klappvisor_off", FlatKlappvisorOffItem::new);
		MOUSTACHE = REGISTRY.register("moustache", MoustacheItem::new);
		SPLIT_MOUSTACHE = REGISTRY.register("split_moustache", SplitMoustacheItem::new);
		GOATEE = REGISTRY.register("goatee", GoateeItem::new);
		FULLBEARD = REGISTRY.register("fullbeard", FullbeardItem::new);
		FULLBEARD_LARGE = REGISTRY.register("fullbeard_large", FullbeardLargeItem::new);
		FULLBEARD_LONG = REGISTRY.register("fullbeard_long", FullbeardLongItem::new);
		GOAT_BEARD = REGISTRY.register("goat_beard", GoatBeardItem::new);
		GOAT_BEARD_LARGE = REGISTRY.register("goat_beard_large", GoatBeardLargeItem::new);
		FORKBEARD = REGISTRY.register("forkbeard", ForkbeardItem::new);
		TRI_FORKBEARD = REGISTRY.register("tri_forkbeard", TriForkbeardItem::new);
		ASIAN_GOATEE = REGISTRY.register("asian_goatee", AsianGoateeItem::new);
		CHOPS = REGISTRY.register("chops", ChopsItem::new);
		CHOPS_MOUSTACHE = REGISTRY.register("chops_moustache", ChopsMoustacheItem::new);
		NORSEBEARD = REGISTRY.register("norsebeard", NorsebeardItem::new);
		BRAIDED_BEARD = REGISTRY.register("braided_beard", BraidedBeardItem::new);
		SNAKE_BEARD = REGISTRY.register("snake_beard", SnakeBeardItem::new);
		ASIAN_LONG = REGISTRY.register("asian_long", AsianLongItem::new);
		SPARTAN_HELMET = REGISTRY.register("spartan_helmet", SpartanItem.Helmet::new);
		SPARTAN_CHESTPLATE = REGISTRY.register("spartan_chestplate", SpartanItem.Chestplate::new);
		SPARTAN_LEGGINGS = REGISTRY.register("spartan_leggings", SpartanItem.Leggings::new);
		SPARTAN_BOOTS = REGISTRY.register("spartan_boots", SpartanItem.Boots::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}