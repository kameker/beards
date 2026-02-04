package net.kameker.beards.init;

import net.kameker.beards.ModItems;
import net.kameker.beards.client.renderer.UniversalBeardRenderer;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

public class ArmorExpandedMedievalModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(ModItems.MOUSTACHE.get(),
				() -> new UniversalBeardRenderer("moustache", false));
		CuriosRendererRegistry.register(ModItems.SPLIT_MOUSTACHE.get(),
				() -> new UniversalBeardRenderer("split_moustache", false));
		CuriosRendererRegistry.register(ModItems.GOATEE.get(),
				() -> new UniversalBeardRenderer("goatee", false));
		CuriosRendererRegistry.register(ModItems.FULLBEARD.get(),
				() -> new UniversalBeardRenderer("fullbeard", false));
		CuriosRendererRegistry.register(ModItems.FULLBEARD_LARGE.get(),
				() -> new UniversalBeardRenderer("fullbeard_l", false));
		CuriosRendererRegistry.register(ModItems.FULLBEARD_LONG.get(),
				() -> new UniversalBeardRenderer("fullbeard_xl", false));
		CuriosRendererRegistry.register(ModItems.GOAT_BEARD.get(),
				() -> new UniversalBeardRenderer("goat_beard", false));
		CuriosRendererRegistry.register(ModItems.GOAT_BEARD_LARGE.get(),
				() -> new UniversalBeardRenderer("goat_beard_l", false));
		CuriosRendererRegistry.register(ModItems.FORKBEARD.get(),
				() -> new UniversalBeardRenderer("forkbeard", false));
		CuriosRendererRegistry.register(ModItems.TRI_FORKBEARD.get(),
				() -> new UniversalBeardRenderer("tri_forkbeard", false));
		CuriosRendererRegistry.register(ModItems.ASIAN_GOATEE.get(),
				() -> new UniversalBeardRenderer("asian_goatee", false));
		CuriosRendererRegistry.register(ModItems.CHOPS.get(),
				() -> new UniversalBeardRenderer("chops", false));
		CuriosRendererRegistry.register(ModItems.CHOPS_MOUSTACHE.get(),
				() -> new UniversalBeardRenderer("chops_moustache", false));
		CuriosRendererRegistry.register(ModItems.NORSEBEARD.get(),
				() -> new UniversalBeardRenderer("norse_beard", false));
		CuriosRendererRegistry.register(ModItems.BRAIDED_BEARD.get(),
				() -> new UniversalBeardRenderer("braided_beard", false));
		CuriosRendererRegistry.register(ModItems.SNAKE_BEARD.get(),
				() -> new UniversalBeardRenderer("snake_beard", false));
		CuriosRendererRegistry.register(ModItems.ASIAN_LONG.get(),
				() -> new UniversalBeardRenderer("asian_long", false));


	}
}