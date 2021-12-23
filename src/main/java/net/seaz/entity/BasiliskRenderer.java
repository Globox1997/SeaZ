package net.seaz.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Frustum;
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
        // if (basiliskEntity instanceof BasiliskEntity)
        super.render(basiliskEntity, f, g, matrixStack, vertexConsumerProvider, i);

    }

    @Override
    public boolean shouldRender(BasiliskEntity basiliskEntity, Frustum frustum, double d, double e, double f) {
        if (super.shouldRender(basiliskEntity, frustum, d, e, f))
            return true;
            else return false;
     //   else// if(basiliskEntity.getBodyParts()[10].isv)
      //      System.out.println(basiliskEntity.getBodyParts()[13].getBoundingBox().expand(3.0D).isValid() + "::" + basiliskEntity.getBodyParts()[10].getVisibilityBoundingBox());
     //   for (int i = 0; i < basiliskEntity.getBodyParts().length; i++)

        //    if (frustum.isVisible(basiliskEntity.getBodyParts()[i].getVisibilityBoundingBox().expand(3.0D)))
       //         return true;
        // return if (guardianEntity.hasBeamTarget() && (livingEntity = guardianEntity.getBeamTarget()) != null) {
        // Vec3d vec3d = this.fromLerpedPosition(livingEntity, (double)livingEntity.getHeight() * 0.5, 1.0f);
        // Vec3d vec3d2 = this.fromLerpedPosition(guardianEntity, guardianEntity.getStandingEyeHeight(), 1.0f);
        // return frustum.isVisible(new Box(vec3d2.x, vec3d2.y, vec3d2.z, vec3d.x, vec3d.y, vec3d.z));
        // }
    //    return false;// frustum.isVisible(basiliskEntity.getBodyParts()[10].getBoundingBox());
        // Entity entity = ((MobEntity)mobEntity).getHoldingEntity();
        // if (entity != null) {
        // return frustum.isVisible(entity.getVisibilityBoundingBox());
        // }
        // return false;
        // return super.shouldRender(basiliskEntity, frustum, d, e, f);
    }
}
