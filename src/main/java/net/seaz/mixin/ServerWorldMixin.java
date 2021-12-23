package net.seaz.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.entity.Entity;
import net.minecraft.server.world.ServerWorld;
import net.seaz.entity.BasiliskEntity;
import net.seaz.entity.BasiliskPartEntity;

@Mixin(ServerWorld.class)
public class ServerWorldMixin {

    // final Int2ObjectMap<BasiliskPartEntity> basiliskParts = new Int2ObjectOpenHashMap<BasiliskPartEntity>();

    // // Lnet/minecraft/server/world/ServerWorld$ServerEntityHandler;startTracking(Lnet/minecraft/entity/Entity;)V
    // @Inject(method = "Lnet/minecraft/server/world/ServerWorld$ServerEntityHandler;startTracking(Lnet/minecraft/entity/Entity;)V", at = @At(value = "HEAD"))
    // private void startTrackingMixin(Entity entity, CallbackInfo info) {
    // System.out.println("START");
    // if (entity instanceof BasiliskEntity) {
    // for (BasiliskPartEntity basiliskPartEntity : ((BasiliskEntity) entity).getBodyParts()) {
    // this.basiliskParts.put(basiliskPartEntity.getId(), basiliskPartEntity);
    // }
    // }
    // }

    // @Inject(method = "stopTracking", at = @At(value = "HEAD"))
    // private void stopTrackingMixin(Entity entity, CallbackInfo info) {
    // if (entity instanceof BasiliskEntity) {
    // for (BasiliskPartEntity basiliskPartEntity : ((BasiliskEntity) entity).getBodyParts()) {
    // this.basiliskParts.remove(basiliskPartEntity.getId());
    // }
    // }
    // }
}
