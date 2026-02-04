package net.kameker.beards.procedures;

import net.kameker.beards.init.ArmorExpandedMedievalModItems;
import net.kameker.beards.ArmorExpandedMedievalMod;

import net.neoforged.neoforge.items.IItemHandler;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class HelmetAttachmentOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player player12) {
			IItemHandler inventory12 = ArmorExpandedMedievalMod.CuriosApiHelper.getCuriosInventory(player12);
			if (inventory12 != null) {
				for (int i = 0; i < inventory12.getSlots(); i++) {
					ItemStack itemstackiterator = inventory12.getStackInSlot(i);
					if (itemstackiterator.getItem() == ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "curios replace face 0 @s with beards:snouted_klappvisor_off");
							}
						}
					} else if (itemstackiterator.getItem() == ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR_OFF.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "curios replace face 0 @s with beards:snouted_klappvisor");
							}
						}
					} else if (itemstackiterator.getItem() == ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "curios replace face 0 @s with beards:flat_klappvisor_off");
							}
						}
					} else if (itemstackiterator.getItem() == ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR_OFF.get()) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "curios replace face 0 @s with beards:flat_klappvisor");
							}
						}
					}
				}
			}
		}
	}
}