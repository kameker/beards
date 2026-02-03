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
public class Modelhelmetattachment<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("armor_expanded_medieval", "modelhelmetattachment"), "main");
	public final ModelPart snoutvisor;
	public final ModelPart snoutvisorup;
	public final ModelPart snoutvisoroff;
	public final ModelPart flatvisor;
	public final ModelPart flatvisorup;
	public final ModelPart flatvisoroff;

	public Modelhelmetattachment(ModelPart root) {
		this.snoutvisor = root.getChild("snoutvisor");
		this.snoutvisorup = root.getChild("snoutvisorup");
		this.snoutvisoroff = this.snoutvisorup.getChild("snoutvisoroff");
		this.flatvisor = root.getChild("flatvisor");
		this.flatvisorup = root.getChild("flatvisorup");
		this.flatvisoroff = this.flatvisorup.getChild("flatvisoroff");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition snoutvisor = partdefinition.addOrReplaceChild("snoutvisor",
				CubeListBuilder.create().texOffs(20, 14).addBox(-4.5F, -6.0F, -4.75F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 5).addBox(-1.0F, -4.0F, -4.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-5.0F, -6.8F, -4.75F, 10.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(24, 41).addBox(3.75F, -5.5F, -4.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 41)
						.addBox(-4.75F, -5.5F, -4.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(3.75F, -6.0F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(32, 23)
						.addBox(-4.75F, -6.0F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 14).addBox(-4.5F, -3.0F, -4.75F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 7)
						.addBox(-1.5F, -2.25F, -6.75F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = snoutvisor.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 11).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2706F, -4.0967F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r2 = snoutvisor.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4207F, -1.25F, -5.6348F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r3 = snoutvisor.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 24).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4207F, -1.25F, -5.6348F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r4 = snoutvisor.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 29).addBox(-3.0F, 0.0431F, -0.0228F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -2.2976F, -6.7392F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r5 = snoutvisor.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.092F, -5.8103F, -0.3491F, 0.0F, 0.0F));
		PartDefinition snoutvisorup = partdefinition.addOrReplaceChild("snoutvisorup", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition snoutvisoroff = snoutvisorup.addOrReplaceChild("snoutvisoroff",
				CubeListBuilder.create().texOffs(20, 20).addBox(-4.5F, 0.0F, -5.25F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-1.0F, 2.0F, -5.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.0F, -0.8F, -5.25F, 10.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(36, 41).addBox(3.75F, 0.5F, -5.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 11)
						.addBox(-4.75F, 0.5F, -5.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 35).addBox(3.75F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(24, 35)
						.addBox(-4.75F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 20).addBox(-4.5F, 3.0F, -5.25F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 19)
						.addBox(-1.5F, 3.75F, -7.25F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.5F, -1.309F, 0.0F, 0.0F));
		PartDefinition cube_r6 = snoutvisoroff.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 23).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4207F, 4.75F, -6.1348F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r7 = snoutvisoroff.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 41).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4207F, 4.75F, -6.1348F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r8 = snoutvisoroff.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 37).addBox(-3.0F, 0.0431F, -0.0228F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 3.7024F, -7.2392F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r9 = snoutvisoroff.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 33).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 6.092F, -6.3103F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r10 = snoutvisoroff.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(22, 17).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.2706F, -4.5967F, 0.3927F, 0.0F, 0.0F));
		PartDefinition flatvisor = partdefinition.addOrReplaceChild("flatvisor",
				CubeListBuilder.create().texOffs(20, 2).addBox(-4.5F, -6.0F, -4.75F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -6.8F, -4.75F, 10.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(0, 40)
						.addBox(3.75F, -5.5F, -4.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 40).addBox(-4.75F, -5.5F, -4.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 23)
						.addBox(3.75F, -6.0F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 24).addBox(-4.75F, -6.0F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 2)
						.addBox(-4.5F, -3.0F, -4.75F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 46).addBox(-0.5F, -5.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r11 = flatvisor.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(22, 0).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2706F, -4.0967F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r12 = flatvisor.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 48).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5412F, -3.6934F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r13 = flatvisor.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(48, 5).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -4.6173F, -4.0761F, -0.3927F, 0.0F, 0.0F));
		PartDefinition flatvisorup = partdefinition.addOrReplaceChild("flatvisorup", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition flatvisoroff = flatvisorup.addOrReplaceChild("flatvisoroff",
				CubeListBuilder.create().texOffs(20, 8).addBox(-4.5F, 0.0F, -5.25F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-5.0F, -0.8F, -5.25F, 10.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(12, 41)
						.addBox(3.75F, 0.5F, -5.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 41).addBox(-4.75F, 0.5F, -5.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 29)
						.addBox(3.75F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(24, 29).addBox(-4.75F, 0.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 8)
						.addBox(-4.5F, 3.0F, -5.25F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 46).addBox(-0.5F, 1.0F, -5.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.5F, -1.309F, 0.0F, 0.0F));
		PartDefinition cube_r14 = flatvisoroff.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(48, 13).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 6.5412F, -4.1934F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r15 = flatvisoroff.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 11).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.3827F, -4.5761F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r16 = flatvisoroff.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(22, 5).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.2706F, -4.5967F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		snoutvisor.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		snoutvisorup.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		flatvisor.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		flatvisorup.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}