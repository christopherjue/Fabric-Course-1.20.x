package net.christopher.mccourse.entity.client;//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Made with Blockbench 4.9.4
//// Paste this class into your mod and generate all required imports


public class giraffe<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "giraffe,,py"), "main");
    private final ModelPart Giraffe;
    private final ModelPart bb_main;

    public giraffe,,Py(ModelPart root) {
        this.Giraffe = root.getChild("Giraffe");
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Giraffe = partdefinition.addOrReplaceChild("Giraffe", CubeListBuilder.create(), PartPose.offset(-3.0F, 24.0F, 0.0F));

        PartDefinition leg2 = Giraffe.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 42).addBox(9.0F, -39.0F, 12.0F, 4.0F, 39.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Leg1 = Giraffe.addOrReplaceChild("Leg1", CubeListBuilder.create().texOffs(63, 42).addBox(-6.0F, -40.0F, 12.0F, 4.0F, 40.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Leg3 = Giraffe.addOrReplaceChild("Leg3", CubeListBuilder.create().texOffs(64, 0).addBox(-5.25F, -41.0F, -13.0F, 4.0F, 41.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Leg4 = Giraffe.addOrReplaceChild("Leg4", CubeListBuilder.create().texOffs(40, 150).addBox(7.5F, -42.0F, -14.0F, 4.0F, 42.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Body = Giraffe.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 42).addBox(-5.0F, -21.0F, -27.0F, 16.0F, 9.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -26.0F, 13.0F));

        PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(111, 20).addBox(-4.0F, -10.0F, -8.0F, 13.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 22).addBox(-5.0F, -12.0F, -20.0F, 15.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.0F, -7.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -9.0F, -27.0F, 14.0F, 6.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.0F, -7.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition Neck = Giraffe.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = Neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(145, 81).addBox(-4.0F, -4.0F, -43.0F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -38.0F, 13.0F, -0.733F, 0.0F, 0.0F));

        PartDefinition cube_r5 = Neck.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 136).addBox(-20.0F, 1.0F, -81.0F, 7.0F, 2.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(145, 0).addBox(-20.0F, -5.0F, -81.0F, 7.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, -16.0F, 0.0F, 1.0385F, 1.5708F));

        PartDefinition cube_r6 = Neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(116, 71).addBox(-2.5F, -20.0F, -77.0F, 8.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -39.0F, 3.0F, -0.6021F, 0.0F, 0.0F));

        PartDefinition cube_r7 = Neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(102, 150).addBox(-3.1F, -15.0F, -77.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -39.0F, 3.0F, -0.6021F, 0.0F, 0.0F));

        PartDefinition cube_r8 = Neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 13).addBox(-20.0F, -4.7F, -77.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -39.0F, 3.0F, 0.0F, 0.6021F, 1.5708F));

        PartDefinition cube_r9 = Neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-20.0F, 0.9F, -76.9F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -39.0F, 3.0F, 0.0F, 0.6021F, 1.5708F));

        PartDefinition cube_r10 = Neck.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(83, 111).addBox(-2.6F, -21.0F, -81.0F, 8.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(145, 50).addBox(-2.6F, -15.0F, -81.0F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, -16.0F, -1.0385F, 0.0F, 0.0F));

        PartDefinition cube_r11 = Neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(145, 108).addBox(-2.0F, -2.0F, -54.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -38.0F, 13.0F, -0.672F, 0.0F, 0.0F));

        PartDefinition cube_r12 = Neck.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(145, 32).addBox(-2.6F, 3.5F, -74.7F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -38.0F, 13.0F, -0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r13 = Neck.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 147).addBox(-2.8F, -0.5F, -65.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -38.0F, 13.0F, -0.6807F, 0.0F, 0.0F));

        PartDefinition cube_r14 = Neck.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(111, 0).addBox(-4.0F, -15.0F, -46.0F, 8.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -38.0F, 13.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r15 = Neck.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(149, 121).addBox(-4.0F, -12.0F, -29.0F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(144, 71).addBox(-4.0F, -7.0F, -8.0F, 13.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(145, 22).addBox(-3.75F, -9.0F, -8.0F, 13.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -38.0F, 13.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition cube_r16 = Neck.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(114, 90).addBox(-2.0F, -1.0F, -41.0F, 7.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -50.0F, 10.0F, -0.5672F, 0.0F, 0.0F));

        PartDefinition cube_r17 = Neck.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(106, 132).addBox(-2.0F, 17.0F, -34.0F, 7.0F, 3.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(135, 135).addBox(-1.6F, 18.0F, -41.0F, 7.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -50.0F, 10.0F, -1.0036F, 0.0F, 0.0F));

        PartDefinition cube_r18 = Neck.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(31, 132).addBox(-2.0F, 16.0F, -41.0F, 7.0F, 3.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(77, 129).addBox(-2.0F, 19.0F, -41.0F, 7.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -62.0F, 7.0F, -0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r19 = Neck.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(116, 53).addBox(-1.6F, 19.0F, -41.0F, 7.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -66.0F, -1.0F, -0.829F, 0.0F, 0.0F));

        PartDefinition cube_r20 = Neck.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(116, 32).addBox(-1.6F, 14.0F, -41.0F, 7.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -66.0F, -1.0F, -0.829F, 0.0F, 0.0F));

        PartDefinition cube_r21 = Neck.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(46, 114).addBox(0.0F, 17.0F, -41.8F, 6.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -54.0F, 2.0F, -1.0472F, 0.0F, 0.0F));

        PartDefinition cube_r22 = Neck.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(116, 114).addBox(-1.9F, 17.0F, -41.0F, 7.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -62.0F, 7.0F, -0.6981F, 0.0F, 0.0F));

        PartDefinition cube_r23 = Neck.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 87).addBox(-3.9F, -11.0F, -27.0F, 11.0F, 2.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(78, 90).addBox(-3.4F, -12.0F, -30.0F, 8.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -41.0F, 6.0F, -0.48F, 0.0F, 0.0F));

        PartDefinition cube_r24 = Neck.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(80, 32).addBox(-3.0F, -14.0F, -41.0F, 8.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -41.0F, 6.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r25 = Neck.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(64, 0).addBox(-3.0F, -9.0F, -26.25F, 8.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -41.0F, 6.0F, -0.6109F, 0.0F, 0.0F));

        PartDefinition Tail = Giraffe.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -26.0F, 13.0F));

        PartDefinition cube_r26 = Tail.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(25, 13).addBox(1.0F, 7.0F, 6.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(0.0F, 1.0F, 6.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition cube_r27 = Tail.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -2.0F, 6.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r28 = Tail.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(25, 0).addBox(0.0F, -8.0F, 5.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition Head = Giraffe.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -78.0F, 16.0F));

        PartDefinition cube_r29 = Head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(-10, -10).addBox(-3.0F, -106.0F, -59.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 80.0F, -9.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, -7.0F));

        PartDefinition cube_r30 = Ears.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 42).addBox(-5.0F, -64.25F, 23.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(16, 46).addBox(4.0F, -65.25F, 24.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 7.0F, 1.6232F, 0.0F, 0.0F));

        PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create(), PartPose.offset(0.0F, 78.0F, -16.0F));

        PartDefinition cube_r31 = Horns.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 50).addBox(-2.9F, -73.25F, 11.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(16, 50).addBox(3.0F, -73.25F, 11.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -78.0F, 16.0F, 1.4486F, 0.0F, 0.0F));

        PartDefinition Nose = Giraffe.addOrReplaceChild("Nose", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r32 = Nose.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(24, 26).addBox(-0.5F, -84.25F, 26.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -78.0F, 23.0F, 1.7104F, 0.0F, 0.0F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r33 = bb_main.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(60, 53).addBox(-3.9F, -12.0F, -39.0F, 11.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -41.0F, 6.0F, -0.3491F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Giraffe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}