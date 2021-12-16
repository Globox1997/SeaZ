package net.seaz.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.seaz.SeazClient;

@Environment(EnvType.CLIENT)
public class BasiliskRenderer extends MobEntityRenderer<BasiliskEntity, BasiliskModel<BasiliskEntity>> {
    private static final Identifier TEXTURE = new Identifier("seaz:textures/entity/basilisk.png");

    public BasiliskRenderer(EntityRendererFactory.Context context) {
        super(context, new BasiliskModel<>(context.getPart(SeazClient.BASILISK_LAYER)), 2.0F);
    }

    @Override
    public Identifier getTexture(BasiliskEntity basiliskEntity) {
        return TEXTURE;
    }

    @Override
    public void render(BasiliskEntity basiliskEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(basiliskEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
