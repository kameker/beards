/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.kameker.beards.init;

import net.kameker.beards.client.model.Modelmedievalbeards;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class ArmorExpandedMedievalModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmedievalbeards.LAYER_LOCATION, Modelmedievalbeards::createBodyLayer);
	}
}