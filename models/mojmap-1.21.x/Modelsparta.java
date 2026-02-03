// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsparta<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sparta"), "main");
	private final ModelPart helm;
	private final ModelPart shirt;
	private final ModelPart leftArm2;
	private final ModelPart rightarm2;
	private final ModelPart rightleg2;
	private final ModelPart leftleg2;
	private final ModelPart bootright;
	private final ModelPart bootleft;

	public Modelsparta(ModelPart root) {
		this.helm = root.getChild("helm");
		this.shirt = root.getChild("shirt");
		this.leftArm2 = root.getChild("leftArm2");
		this.rightarm2 = root.getChild("rightarm2");
		this.rightleg2 = root.getChild("rightleg2");
		this.leftleg2 = root.getChild("leftleg2");
		this.bootright = root.getChild("bootright");
		this.bootleft = root.getChild("bootleft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition helm = partdefinition.addOrReplaceChild("helm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.01F)).texOffs(46, 43)
						.addBox(-2.0F, -10.0F, -5.0F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.01F)).texOffs(0, 27)
						.addBox(-1.0F, -15.0F, -5.0F, 2.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-1.0F, -14.3F, -9.25F, 2.0F, 3.0F, 13.0F, new CubeDeformation(0.01F)).texOffs(48, 18)
						.addBox(-1.0F, -15.9F, -2.3F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.002F)).texOffs(62, 10)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0003F)).texOffs(56, 76)
						.addBox(-1.0F, -9.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 43)
						.addBox(4.0F, -9.0F, -5.0F, 1.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(74, 46)
						.addBox(1.0F, -3.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(74, 50)
						.addBox(-5.0F, -3.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.101F)).texOffs(46, 54)
						.addBox(-5.0F, -9.0F, 4.0F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-5.0F, -9.0F, -5.0F, 1.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = helm.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(76, 54).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.1469F, -0.7082F, -4.5F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Head_r2 = helm.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(48, 76).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.1469F, -0.7082F, -4.5F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Head_r3 = helm.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(8, 75)
						.addBox(-1.5F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).texOffs(80, 38)
						.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(-3.25F, -7.25F, -4.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Head_r4 = helm.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(28, 76).addBox(-1.5F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.003F)),
				PartPose.offsetAndRotation(-3.45F, -7.1F, -4.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Head_r5 = helm.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(28, 73).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.003F)),
				PartPose.offsetAndRotation(3.5F, -7.5F, -4.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition Head_r6 = helm.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(48, 80)
						.addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)).texOffs(66, 75)
						.addBox(-2.5F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(3.25F, -7.25F, -4.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition Head_r7 = helm.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(38, 76).addBox(-2.5F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F,
						new CubeDeformation(0.002F)),
				PartPose.offsetAndRotation(3.45F, -7.1F, -4.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition Head_r8 = helm.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(18, 58).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(-3.5F, -7.5F, -4.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Head_r9 = helm.addOrReplaceChild("Head_r9",
				CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.125F, -5.525F, -1.3404F, 0.0F, 0.0F));

		PartDefinition Head_r10 = helm.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(68, 54).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.5F, -5.65F, 1.0908F, 0.0F, 0.0F));

		PartDefinition Head_r11 = helm.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(52, 63).addBox(-1.0F, -3.5F, -3.5F, 2.0F, 3.0F, 5.0F,
						new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(0.0F, -2.7F, 4.1F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Head_r12 = helm.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(66, 63).addBox(-1.0F, -2.5F, -3.5F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -2.7F, 5.75F, -2.3126F, 0.0F, 0.0F));

		PartDefinition Head_r13 = helm.addOrReplaceChild("Head_r13",
				CubeListBuilder.create().texOffs(18, 61).addBox(-1.0F, -2.5F, -3.5F, 2.0F, 5.0F, 7.0F,
						new CubeDeformation(0.003F)),
				PartPose.offsetAndRotation(0.0F, -7.1F, 7.45F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Head_r14 = helm.addOrReplaceChild("Head_r14",
				CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -2.5F, -3.5F, 2.0F, 5.0F, 7.0F,
						new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, -11.6F, 5.875F, -0.8901F, 0.0F, 0.0F));

		PartDefinition shirt = partdefinition.addOrReplaceChild("shirt",
				CubeListBuilder.create().texOffs(24, 27)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(30, 11)
						.addBox(-3.0F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).texOffs(74, 41)
						.addBox(2.0F, -0.1F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(18, 73)
						.addBox(2.0F, 0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(56, 71)
						.addBox(2.35F, 0.2F, -3.075F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)).texOffs(46, 71)
						.addBox(1.7F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).texOffs(36, 71)
						.addBox(2.0F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).texOffs(70, 36)
						.addBox(-3.3F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(66, 70)
						.addBox(-2.7F, 0.2F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(8, 70)
						.addBox(-3.0F, 0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(70, 31)
						.addBox(-3.0F, -0.1F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 31)
						.addBox(-3.9F, 2.1F, -2.6F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(0, 44)
						.addBox(-4.55F, 0.25F, 1.0F, 9.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = shirt.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(68, 23)
						.addBox(-2.0F, -2.5F, -3.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(62, 0)
						.addBox(-7.1F, -2.5F, -3.0F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(3.1F, 4.6F, 0.4F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftArm2 = partdefinition.addOrReplaceChild("leftArm2", CubeListBuilder.create().texOffs(62, 13)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition rightarm2 = partdefinition.addOrReplaceChild("rightarm2", CubeListBuilder.create()
				.texOffs(68, 18).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition rightleg2 = partdefinition.addOrReplaceChild("rightleg2", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition rightleg_r1 = rightleg2.addOrReplaceChild("rightleg_r1",
				CubeListBuilder.create().texOffs(62, 76)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(76, 58)
						.addBox(-2.4F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.4F, 3.0F, -2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightleg_r2 = rightleg2.addOrReplaceChild("rightleg_r2",
				CubeListBuilder.create().texOffs(16, 78)
						.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(40, 79)
						.addBox(-0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-2.45F, 3.0436F, -1.3019F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightleg_r3 = rightleg2.addOrReplaceChild("rightleg_r3",
				CubeListBuilder.create().texOffs(12, 78)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(78, 13)
						.addBox(2.4F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-2.0F, 3.0F, 2.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightleg_r4 = rightleg2.addOrReplaceChild("rightleg_r4",
				CubeListBuilder.create().texOffs(0, 79)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(4, 79)
						.addBox(-2.5F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, 3.0F, 2.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightleg_r5 = rightleg2.addOrReplaceChild("rightleg_r5",
				CubeListBuilder.create().texOffs(80, 28)
						.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(80, 33)
						.addBox(-0.5F, -2.0F, -3.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.85F, 3.0436F, 1.1981F, 0.0F, 0.0F, 0.0873F));

		PartDefinition rightleg_r6 = rightleg2.addOrReplaceChild("rightleg_r6",
				CubeListBuilder.create().texOffs(24, 78)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(20, 78)
						.addBox(-2.5F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, 3.0F, -2.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftleg2 = partdefinition.addOrReplaceChild("leftleg2", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition leftleg_r1 = leftleg2.addOrReplaceChild("leftleg_r1",
				CubeListBuilder.create().texOffs(80, 23)
						.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(44, 79)
						.addBox(-0.5F, -2.0F, 2.1F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.85F, 3.0436F, -1.4019F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftleg_r2 = leftleg2.addOrReplaceChild("leftleg_r2",
				CubeListBuilder.create().texOffs(36, 79)
						.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(78, 0)
						.addBox(-0.5F, -2.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(2.45F, 3.0436F, 1.1981F, 0.0F, 0.0F, -0.0873F));

		PartDefinition leftleg_r3 = leftleg2.addOrReplaceChild("leftleg_r3",
				CubeListBuilder.create().texOffs(78, 5)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(8, 78)
						.addBox(-2.3F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(1.2F, 3.0F, 2.3F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftleg_r4 = leftleg2.addOrReplaceChild("leftleg_r4",
				CubeListBuilder.create().texOffs(76, 75)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(76, 70)
						.addBox(-2.3F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(1.2F, 3.0F, -2.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftleg_r5 = leftleg2.addOrReplaceChild("leftleg_r5",
				CubeListBuilder.create().texOffs(66, 78)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(70, 78)
						.addBox(-2.5F, -2.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.45F, 3.0F, -2.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftleg_r6 = leftleg2.addOrReplaceChild("leftleg_r6",
				CubeListBuilder.create().texOffs(28, 79)
						.addBox(0.0F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(32, 79)
						.addBox(2.5F, -2.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.05F, 3.0F, 2.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bootright = partdefinition.addOrReplaceChild("bootright", CubeListBuilder.create()
				.texOffs(36, 63).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition bootleft = partdefinition.addOrReplaceChild("bootleft", CubeListBuilder.create().texOffs(30, 18)
				.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		helm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bootright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bootleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}