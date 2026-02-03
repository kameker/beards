package net.safaribjarne.armorexpandedmedieval.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhelmetbase<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("armor_expanded_medieval", "modelhelmetbase"), "main");
	public final ModelPart helmet;

	public Modelhelmetbase(ModelPart root) {
		this.helmet = root.getChild("helmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition helmet = partdefinition.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.65F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = helmet.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 10).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8429F, -6.5233F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r2 = helmet.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8429F, -6.5233F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r3 = helmet.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 25).addBox(-4.0F, -2.0F, -0.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, -6.4905F, -3.797F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r4 = helmet.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 21).addBox(-4.0F, -2.0F, -0.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.4905F, 3.797F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r5 = helmet.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 31).addBox(-1.0F, -3.0F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.4691F, 0.3971F, 2.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r6 = helmet.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -3.0F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6F, -2.6F, 2.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r7 = helmet.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 21).addBox(0.0F, -3.0F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4691F, 0.3971F, 2.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r8 = helmet.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 21).addBox(0.0F, -3.0F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6F, -2.6F, 2.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r9 = helmet.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 0).addBox(-7.0F, -6.0F, 0.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.5F, 3.95F, 0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}