package net.kameker.beards.init;

import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.CuriosCapability;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ArmorExpandedMedievalModCuriosCompat {
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_iron")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_iron")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR_OFF.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_iron")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_iron")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR_OFF.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.MOUSTACHE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.SPLIT_MOUSTACHE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.GOATEE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.FULLBEARD.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.FULLBEARD_LARGE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.FULLBEARD_LONG.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.GOAT_BEARD.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.GOAT_BEARD_LARGE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.FORKBEARD.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.TRI_FORKBEARD.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.ASIAN_GOATEE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.CHOPS.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.CHOPS_MOUSTACHE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.NORSEBEARD.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.BRAIDED_BEARD.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.SNAKE_BEARD.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public SoundInfo getEquipSound(SlotContext slotContext) {
				return new SoundInfo(DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("entity.villager.celebrate")).value(), 1, 1);
			}
		}, ArmorExpandedMedievalModItems.ASIAN_LONG.get());
	}
}