package net.seaz.mixin;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.entity.Entity;
import net.minecraft.server.network.EntityTrackerEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.seaz.entity.BasiliskEntity;
import net.seaz.entity.BasiliskPartEntity;

@Mixin(EntityTrackerEntry.class)
public class EntityTrackerEntryMixin {

    @Shadow
    @Final
    private Entity entity;

    // @Inject(method = "startTracking", at = @At(value = "TAIL"))
    // private void startTrackingMixin(ServerPlayerEntity serverPlayer, CallbackInfo info) {
    //     if (entity instanceof BasiliskEntity) {
    //         for (BasiliskPartEntity basiliskPartEntity : ((BasiliskEntity) entity).getBodyParts()) {
    //             this.basiliskParts.put(basiliskPartEntity.getId(), basiliskPartEntity);
    //         }
    //     }
    // }

    // @Inject(method = "stopTracking", at = @At(value = "TAIL"))
    // private void stopTrackingMixin(ServerPlayerEntity player, CallbackInfo info) {
    //     // this.entity.onStoppedTrackingBy(player);
    //     // player.networkHandler.sendPacket(new EntitiesDestroyS2CPacket(this.entity.getId()));
    //     if (entity instanceof BasiliskEntity) {
    //         for (BasiliskPartEntity basiliskPartEntity : ((BasiliskEntity) entity).getBodyParts()) {
    //             this.basiliskParts.remove(basiliskPartEntity.getId());
    //         }
    //     }
    // }

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
