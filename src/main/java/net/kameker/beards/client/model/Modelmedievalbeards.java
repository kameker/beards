package net.kameker.beards.client.model;

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
public class Modelmedievalbeards<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("beards", "modelmedievalbeards"), "main");
	public final ModelPart Beards;
	public final ModelPart Mustache;
	public final ModelPart SplitMoustache;
	public final ModelPart Goatee;
	public final ModelPart FullBeard;
	public final ModelPart XLFullbeard;
	public final ModelPart LFullbeard;
	public final ModelPart GoatBeard;
	public final ModelPart LGoatBeard;
	public final ModelPart Forkbeard;
	public final ModelPart TriForkbeard;
	public final ModelPart AsianGoatee;
	public final ModelPart Chops;
	public final ModelPart ChopsMustache;
	public final ModelPart NorseBeard;
	public final ModelPart BraidedBeard;
	public final ModelPart Snake;
	public final ModelPart AsianLong;

	public Modelmedievalbeards(ModelPart root) {
		this.Beards = root.getChild("Beards");
		this.Mustache = this.Beards.getChild("Mustache");
		this.SplitMoustache = this.Beards.getChild("SplitMoustache");
		this.Goatee = this.Beards.getChild("Goatee");
		this.FullBeard = this.Beards.getChild("FullBeard");
		this.XLFullbeard = this.Beards.getChild("XLFullbeard");
		this.LFullbeard = this.Beards.getChild("LFullbeard");
		this.GoatBeard = this.Beards.getChild("GoatBeard");
		this.LGoatBeard = this.Beards.getChild("LGoatBeard");
		this.Forkbeard = this.Beards.getChild("Forkbeard");
		this.TriForkbeard = this.Beards.getChild("TriForkbeard");
		this.AsianGoatee = this.Beards.getChild("AsianGoatee");
		this.Chops = this.Beards.getChild("Chops");
		this.ChopsMustache = this.Beards.getChild("ChopsMustache");
		this.NorseBeard = this.Beards.getChild("NorseBeard");
		this.BraidedBeard = this.Beards.getChild("BraidedBeard");
		this.Snake = this.Beards.getChild("Snake");
		this.AsianLong = this.Beards.getChild("AsianLong");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Beards = partdefinition.addOrReplaceChild("Beards", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Mustache = Beards.addOrReplaceChild("Mustache", CubeListBuilder.create().texOffs(40, 49).addBox(-1.5F, -2.9F, -4.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.09F)).texOffs(56, 53)
				.addBox(0.2F, -2.8F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(56, 56).addBox(-2.15F, -2.8F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition SplitMoustache = Beards.addOrReplaceChild("SplitMoustache", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = SplitMoustache.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 4).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.15F, -1.75F, -3.5F, 0.0F, 0.0F, -0.192F));
		PartDefinition cube_r2 = SplitMoustache.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 42).addBox(0.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.15F, -1.75F, -3.5F, 0.0F, 0.0F, 0.192F));
		PartDefinition Goatee = Beards.addOrReplaceChild("Goatee",
				CubeListBuilder.create().texOffs(44, 36).addBox(-2.0F, -2.7F, -4.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 28).addBox(-2.0F, -0.6F, -4.45F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(60, 6)
						.addBox(-1.0F, -1.3F, -4.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(60, 0).addBox(1.25F, -2.55F, -4.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(28, 50)
						.addBox(-2.25F, -2.6F, -4.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition FullBeard = Beards.addOrReplaceChild("FullBeard",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.9F, -4.1F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(56, 28).addBox(-1.5F, -2.8F, -4.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
						.addBox(-4.0F, -1.9F, -2.1F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)).texOffs(60, 8).addBox(1.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 11)
						.addBox(-2.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition XLFullbeard = Beards.addOrReplaceChild("XLFullbeard",
				CubeListBuilder.create().texOffs(0, 6).addBox(-4.0F, -0.9F, -4.1F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(22, 38).addBox(-3.5F, 1.35F, -3.6F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(40, 38)
						.addBox(-3.0F, -0.15F, -4.35F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 42).addBox(-3.0F, 6.35F, -3.6F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 57)
						.addBox(-1.5F, -2.8F, -4.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55).addBox(1.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 60)
						.addBox(-2.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 22).addBox(-4.0F, -1.9F, -2.1F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LFullbeard = Beards.addOrReplaceChild("LFullbeard",
				CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, -0.9F, -4.1F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(44, 30).addBox(-3.5F, 1.35F, -3.6F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(32, 45)
						.addBox(-3.0F, -0.15F, -4.35F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(46, 22).addBox(-3.0F, 2.35F, -3.6F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 58)
						.addBox(-1.5F, -2.8F, -4.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 14).addBox(1.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 60)
						.addBox(-2.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 26).addBox(-4.0F, -1.9F, -2.1F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition GoatBeard = Beards.addOrReplaceChild("GoatBeard",
				CubeListBuilder.create().texOffs(0, 18).addBox(-4.0F, -0.9F, -4.1F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(0, 30).addBox(-4.0F, -1.9F, -2.1F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition LGoatBeard = Beards.addOrReplaceChild("LGoatBeard",
				CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, -0.9F, -4.1F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(44, 33).addBox(-3.5F, 1.35F, -3.6F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(46, 18)
						.addBox(-3.0F, -0.15F, -4.35F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(46, 25).addBox(-3.0F, 2.35F, -3.6F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 30)
						.addBox(-4.0F, -1.9F, -2.1F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Forkbeard = Beards.addOrReplaceChild("Forkbeard",
				CubeListBuilder.create().texOffs(24, 6).addBox(-4.0F, -0.9F, -4.1F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(58, 51).addBox(-1.5F, -2.8F, -4.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 34)
						.addBox(-4.0F, -1.9F, -2.1F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)).texOffs(40, 60).addBox(1.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(1.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 27).addBox(-2.0F, 1.25F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(16, 63)
						.addBox(-2.0F, 0.45F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 63).addBox(-2.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 64)
						.addBox(1.0F, 1.25F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(62, 34).addBox(1.0F, 0.45F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 30)
						.addBox(1.5F, 0.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 61).addBox(-2.5F, -0.75F, -4.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(62, 32)
						.addBox(-2.5F, 0.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 17).addBox(1.5F, -0.75F, -4.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(60, 44)
						.addBox(-2.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition TriForkbeard = Beards.addOrReplaceChild("TriForkbeard",
				CubeListBuilder.create().texOffs(24, 12).addBox(-4.0F, -0.9F, -4.1F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(8, 59).addBox(-1.5F, -2.8F, -4.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-4.0F, -1.9F, -2.1F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)).texOffs(60, 59).addBox(1.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 63)
						.addBox(1.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 64).addBox(-2.0F, 1.25F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(36, 63)
						.addBox(-2.0F, 0.45F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 63).addBox(-2.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 64)
						.addBox(-0.5F, 1.2F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 38).addBox(-0.5F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(12, 61)
						.addBox(-0.5F, 2.75F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 36).addBox(1.0F, 1.25F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(56, 63)
						.addBox(1.0F, 0.45F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(1.5F, 0.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 19)
						.addBox(-2.5F, -0.75F, -4.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(64, 2).addBox(-2.5F, 0.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 21)
						.addBox(1.5F, -0.75F, -4.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(8, 61).addBox(-2.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition AsianGoatee = Beards.addOrReplaceChild("AsianGoatee",
				CubeListBuilder.create().texOffs(24, 59).addBox(-1.5F, -2.8F, -4.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 45).addBox(-1.5F, -0.9F, -4.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 47)
						.addBox(-0.5F, -1.0F, -4.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 61).addBox(1.2F, -2.25F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(28, 61)
						.addBox(-2.2F, -2.25F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Chops = Beards.addOrReplaceChild("Chops",
				CubeListBuilder.create().texOffs(0, 47).addBox(2.1F, -0.9F, -4.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(40, 52).addBox(2.35F, 0.1F, -4.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 55)
						.addBox(3.2F, -1.9F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)).texOffs(64, 8).addBox(3.3F, -2.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 10)
						.addBox(-4.3F, -2.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 53).addBox(-4.35F, 0.1F, -4.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-4.1F, -0.9F, -4.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(36, 56).addBox(-4.2F, -1.9F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition ChopsMustache = Beards.addOrReplaceChild("ChopsMustache",
				CubeListBuilder.create().texOffs(48, 6).addBox(2.1F, -0.9F, -4.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(48, 53).addBox(2.35F, 0.1F, -4.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 59)
						.addBox(-1.5F, -2.8F, -4.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 61).addBox(1.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 61)
						.addBox(-2.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 36).addBox(3.2F, -1.9F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)).texOffs(12, 64)
						.addBox(3.3F, -2.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 12).addBox(-4.3F, -2.9F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 54)
						.addBox(-4.35F, 0.1F, -4.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 12).addBox(-4.1F, -0.9F, -4.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(56, 40)
						.addBox(-4.2F, -1.9F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition NorseBeard = Beards.addOrReplaceChild("NorseBeard",
				CubeListBuilder.create().texOffs(24, 0).addBox(-4.0F, -0.9F, -4.1F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(58, 49).addBox(-1.5F, -2.8F, -4.4F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 50)
						.addBox(-1.0F, 1.2F, -3.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(50, 49).addBox(-1.0F, 3.0F, -3.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(12, 50)
						.addBox(-1.0F, 4.2F, -3.9F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F)).texOffs(0, 34).addBox(-4.0F, -1.9F, -2.1F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.09F)).texOffs(20, 60)
						.addBox(1.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 23).addBox(1.5F, 0.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 47)
						.addBox(-2.5F, -0.75F, -4.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(62, 25).addBox(-2.5F, 0.0F, -4.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 57)
						.addBox(1.5F, -0.75F, -4.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(36, 60).addBox(-2.5F, -2.55F, -4.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition BraidedBeard = Beards.addOrReplaceChild("BraidedBeard",
				CubeListBuilder.create().texOffs(16, 45).addBox(-2.0F, -0.65F, -4.25F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).texOffs(0, 57).addBox(-1.0F, 0.35F, -3.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(8, 55)
						.addBox(-1.0F, 1.0F, -3.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(32, 49).addBox(-1.0F, 2.2F, -3.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Snake = Beards.addOrReplaceChild("Snake", CubeListBuilder.create().texOffs(64, 14).addBox(-0.5F, -0.05F, -3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 40)
				.addBox(-0.5F, 0.75F, -3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(52, 61).addBox(-0.5F, 1.5F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition AsianLong = Beards.addOrReplaceChild("AsianLong",
				CubeListBuilder.create().texOffs(52, 59).addBox(-1.5F, -2.8F, -4.3F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 59).addBox(1.2F, -2.25F, -4.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(0, 60)
						.addBox(-2.2F, -2.25F, -4.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(8, 53).addBox(-0.5F, -0.7F, -4.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Beards.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}