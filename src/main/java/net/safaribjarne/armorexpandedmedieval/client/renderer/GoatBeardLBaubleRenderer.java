package net.safaribjarne.armorexpandedmedieval.client.renderer;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.safaribjarne.armorexpandedmedieval.client.model.Modelhelmetattachment;
import net.safaribjarne.armorexpandedmedieval.client.model.Modelmedievalbeards;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

import java.util.Collections;
import java.util.Map;
public class GoatBeardLBaubleRenderer implements ICurioRenderer {
	private static final ResourceLocation TEXTURE = ResourceLocation.parse("armor_expanded_medieval:textures/entities/beards_texture_noised.png");
	private final HumanoidModel humanoidModel;

	public GoatBeardLBaubleRenderer() {
        Modelmedievalbeards model = new Modelmedievalbeards(Minecraft.getInstance().getEntityModels().bakeLayer(Modelmedievalbeards.LAYER_LOCATION));
        this.humanoidModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of(
            "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
               "head", model.LGoatBeard,
                "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap())
        )));
	}

    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack,
		SlotContext slotContext, PoseStack matrixStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer,
	    int light, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
	    LivingEntity entity = slotContext.entity();
	    ICurioRenderer.followHeadRotations(entity, this.humanoidModel.head);
	    ICurioRenderer.followBodyRotations(entity, this.humanoidModel);
	    this.humanoidModel.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
	    VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(renderTypeBuffer, RenderType.armorCutoutNoCull(TEXTURE), stack.hasFoil());
	    this.humanoidModel.renderToBuffer(matrixStack, vertexconsumer, light, OverlayTexture.NO_OVERLAY);
  }

}