package net.safaribjarne.armorexpandedmedieval.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.safaribjarne.armorexpandedmedieval.client.renderer.*;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class ArmorExpandedMedievalModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.MOUSTACHE.get(),
				() -> new UniversalBeardRenderer("moustache", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.SPLIT_MOUSTACHE.get(),
				() -> new UniversalBeardRenderer("split_moustache", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.GOATEE.get(),
				() -> new UniversalBeardRenderer("goatee", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.FULLBEARD.get(),
				() -> new UniversalBeardRenderer("fullbeard", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.FULLBEARD_LARGE.get(),
				() -> new UniversalBeardRenderer("fullbeard_l", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.FULLBEARD_LONG.get(),
				() -> new UniversalBeardRenderer("fullbeard_xl", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.GOAT_BEARD.get(),
				() -> new UniversalBeardRenderer("goat_beard", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.GOAT_BEARD_LARGE.get(),
				() -> new UniversalBeardRenderer("goat_beard_l", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.FORKBEARD.get(),
				() -> new UniversalBeardRenderer("forkbeard", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.TRI_FORKBEARD.get(),
				() -> new UniversalBeardRenderer("tri_forkbeard", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.ASIAN_GOATEE.get(),
				() -> new UniversalBeardRenderer("asian_goatee", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.CHOPS.get(),
				() -> new UniversalBeardRenderer("chops", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.CHOPS_MOUSTACHE.get(),
				() -> new UniversalBeardRenderer("chops_moustache", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.NORSEBEARD.get(),
				() -> new UniversalBeardRenderer("norse_beard", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.BRAIDED_BEARD.get(),
				() -> new UniversalBeardRenderer("braided_beard", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.SNAKE_BEARD.get(),
				() -> new UniversalBeardRenderer("snake_beard", false));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.ASIAN_LONG.get(),
				() -> new UniversalBeardRenderer("asian_long", false));

		// Визоры (не окрашиваются)
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR.get(),
				() -> new UniversalBeardRenderer("snouted_visor", true));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.SNOUTED_KLAPPVISOR_OFF.get(),
				() -> new UniversalBeardRenderer("snouted_visor_up", true));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR.get(),
				() -> new UniversalBeardRenderer("flat_visor", true));
		CuriosRendererRegistry.register(ArmorExpandedMedievalModItems.FLAT_KLAPPVISOR_OFF.get(),
				() -> new UniversalBeardRenderer("flat_visor_up", true));
	}
}