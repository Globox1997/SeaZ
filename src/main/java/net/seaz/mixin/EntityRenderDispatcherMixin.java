package net.seaz.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.seaz.entity.BasiliskEntity;
import net.seaz.entity.BasiliskPartEntity;

@Environment(EnvType.CLIENT)
@Mixin(EntityRenderDispatcher.class)
public class EntityRenderDispatcherMixin {

    @Inject(method = "renderHitbox", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;drawBox(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/util/math/Box;FFFF)V", ordinal = 0, shift = Shift.AFTER))
    private static void renderHitboxMixin(MatrixStack matrices, VertexConsumer vertices, Entity entity, float tickDelta, CallbackInfo info) {
        // if (entity instanceof BasiliskPartEntity) {
        // double d = -MathHelper.lerp((double) tickDelta, entity.lastRenderX, entity.getX());
        // double e = -MathHelper.lerp((double) tickDelta, entity.lastRenderY, entity.getY());
        // double f = -MathHelper.lerp((double) tickDelta, entity.lastRenderZ, entity.getZ());
        // for (BasiliskPartEntity basiliskPartEntity : ((BasiliskEntity) entity).getBodyParts()) {
        // matrices.push();
        // double g = d + MathHelper.lerp((double) tickDelta, basiliskPartEntity.lastRenderX, basiliskPartEntity.getX());
        // double h = e + MathHelper.lerp((double) tickDelta, basiliskPartEntity.lastRenderY, basiliskPartEntity.getY());
        // double i = f + MathHelper.lerp((double) tickDelta, basiliskPartEntity.lastRenderZ, basiliskPartEntity.getZ());
        // matrices.translate(g, h, i);
        // WorldRenderer.drawBox(matrices, vertices, basiliskPartEntity.getBoundingBox().offset(-basiliskPartEntity.getX(), -basiliskPartEntity.getY(), -basiliskPartEntity.getZ()), 0.25f, 1.0f,
        // 0.0f, 1.0f);
        // matrices.pop();
        // }
        // }
    }
}
