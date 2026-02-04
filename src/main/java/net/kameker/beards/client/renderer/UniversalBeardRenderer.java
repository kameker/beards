package net.kameker.beards.client.renderer;

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
import net.kameker.beards.client.model.Modelmedievalbeards;
import net.kameker.beards.client.model.Modelhelmetattachment;
import net.kameker.beards.util.BeardColorUtil;
import net.kameker.beards.init.ArmorExpandedMedievalModDataComponents;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UniversalBeardRenderer implements ICurioRenderer {
    private static final Map<String, ModelPart> BEARD_MODELS = new HashMap<>();
    private static final Map<Integer, ResourceLocation> COLOR_TEXTURES = new HashMap<>();

    private final String beardType;
    private final boolean isVisor;
    private HumanoidModel humanoidModel;

    public UniversalBeardRenderer(String beardType, boolean isVisor) {
        this.beardType = beardType;
        this.isVisor = isVisor;
    }

    private void initializeModel() {
        if (humanoidModel != null) return;

        ModelPart beardPart = getBeardModelPart();

        this.humanoidModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of(
                "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "head", beardPart,
                "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap())
        )));
    }

    private ModelPart getBeardModelPart() {
        if (BEARD_MODELS.containsKey(beardType)) {
            return BEARD_MODELS.get(beardType);
        }

        ModelPart part;
        if (isVisor) {
            Modelhelmetattachment model = new Modelhelmetattachment(
                    Minecraft.getInstance().getEntityModels().bakeLayer(Modelhelmetattachment.LAYER_LOCATION));

            switch (beardType) {
                case "snouted_visor" -> part = model.snoutvisor;
                case "snouted_visor_up" -> part = model.snoutvisorup;
                case "flat_visor" -> part = model.flatvisor;
                case "flat_visor_up" -> part = model.flatvisorup;
                default -> part = model.snoutvisor;
            }
        } else {
            Modelmedievalbeards model = new Modelmedievalbeards(
                    Minecraft.getInstance().getEntityModels().bakeLayer(Modelmedievalbeards.LAYER_LOCATION));

            switch (beardType) {
                case "asian_goatee" -> part = model.AsianGoatee;
                case "asian_long" -> part = model.AsianLong;
                case "braided_beard" -> part = model.BraidedBeard;
                case "chops" -> part = model.Chops;
                case "chops_moustache" -> part = model.ChopsMustache;
                case "forkbeard" -> part = model.Forkbeard;
                case "fullbeard" -> part = model.FullBeard;
                case "fullbeard_l" -> part = model.LFullbeard;
                case "fullbeard_xl" -> part = model.XLFullbeard;
                case "goat_beard" -> part = model.GoatBeard;
                case "goat_beard_l" -> part = model.LGoatBeard;
                case "goatee" -> part = model.Goatee;
                case "moustache" -> part = model.Mustache;
                case "norse_beard" -> part = model.NorseBeard;
                case "snake_beard" -> part = model.Snake;
                case "split_moustache" -> part = model.SplitMoustache;
                case "tri_forkbeard" -> part = model.TriForkbeard;
                default -> part = model.Mustache;
            }
        }

        BEARD_MODELS.put(beardType, part);
        return part;
    }

    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack,
                                                                          SlotContext slotContext, PoseStack matrixStack, RenderLayerParent<T, M> renderLayerParent,
                                                                          MultiBufferSource renderTypeBuffer, int light, float limbSwing, float limbSwingAmount,
                                                                          float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {

        initializeModel();
        LivingEntity entity = slotContext.entity();

        ICurioRenderer.followHeadRotations(entity, this.humanoidModel.head);
        ICurioRenderer.followBodyRotations(entity, this.humanoidModel);
        this.humanoidModel.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);

        ResourceLocation texture = getTextureForItem(stack);
        VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(
                renderTypeBuffer,
                RenderType.armorCutoutNoCull(texture),
                stack.hasFoil()
        );

        this.humanoidModel.renderToBuffer(matrixStack, vertexconsumer, light, OverlayTexture.NO_OVERLAY);
    }

    private ResourceLocation getTextureForItem(ItemStack stack) {
        if (isVisor) {
            return ResourceLocation.parse("beards:textures/entities/helmet_visor_noised.png");
        }

        // Получаем цвет из Data Components
        Integer color = stack.get(ArmorExpandedMedievalModDataComponents.BEARD_COLOR.get());
        int colorIndex = color != null ? color : BeardColorUtil.DEFAULT_COLOR;

        if (colorIndex == BeardColorUtil.DEFAULT_COLOR) {
            return ResourceLocation.parse("beards:textures/entities/beards_texture_noised.png");
        }

        return COLOR_TEXTURES.computeIfAbsent(colorIndex,
                key -> ResourceLocation.parse(
                        String.format("beards:textures/entities/beards/beard_%d.png", key)
                )
        );
    }
}