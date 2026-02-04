/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.kameker.beards.init;

import org.lwjgl.glfw.GLFW;

import net.kameker.beards.network.HelmetAttachmentMessage;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@EventBusSubscriber(Dist.CLIENT)
public class ArmorExpandedMedievalModKeyMappings {
	public static final KeyMapping HELMET_ATTACHMENT = new KeyMapping("key.beards.helmet_attachment", GLFW.GLFW_KEY_DOWN, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new HelmetAttachmentMessage(0, 0));
				HelmetAttachmentMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(HELMET_ATTACHMENT);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				HELMET_ATTACHMENT.consumeClick();
			}
		}
	}
}