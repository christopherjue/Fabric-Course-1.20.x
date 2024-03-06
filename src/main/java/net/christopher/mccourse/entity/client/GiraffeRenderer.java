package net.christopher.mccourse.entity.client;

import net.christopher.mccourse.MCCourseMod;
import net.christopher.mccourse.entity.custom.GiraffeEntity;
import net.christopher.mccourse.entity.layer.ModModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GiraffeRenderer extends MobEntityRenderer<GiraffeEntity, GiraffeModel<GiraffeEntity>> {
    private static final Identifier TEXTURE = new Identifier(MCCourseMod.MOD_ID, "textures/entity/porcupine.png");

    public GiraffeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GiraffeModel<>(ctx.getPart(ModModelLayers.GIRAFFE)), 0.6f);
    }

    @Override
    public Identifier getTexture(GiraffeEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(GiraffeEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}