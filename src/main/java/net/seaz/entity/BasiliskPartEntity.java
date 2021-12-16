package net.seaz.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.boss.dragon.EnderDragonPart;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.world.World;

public class BasiliskPartEntity extends Entity {
    public final BasiliskEntity owner;
    public final String name;
    private final EntityDimensions partDimensions;

    public BasiliskPartEntity(EntityType<? extends Entity> entityType, World world) {
        super(entityType, world);
        this.partDimensions = EntityDimensions.changing(2.5F, 2.5F);
        this.owner = null;
        this.name = "";
    }

    public BasiliskPartEntity(BasiliskEntity owner, String name, float width, float height) {
        super(owner.getType(), owner.world);
        this.partDimensions = EntityDimensions.changing(width, height);
        this.calculateDimensions();
        this.owner = owner;
        this.name = name;
    }

    @Override
    protected void initDataTracker() {
    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
    }

    @Override
    public boolean collides() {
        return true;
    }

    @Override
    public boolean damage(DamageSource source, float amount) {

        System.out.println("DAMAGE PART!!!");
        this.discard();

        return this.isInvulnerableTo(source) ? false : this.owner.damagePart(this, source, amount);
    }

    @Override
    public boolean isPartOf(Entity entity) {
        return this == entity || this.owner == entity;
    }

    @Override
    public Packet<?> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    public EntityDimensions getDimensions(EntityPose pose) {
        return this.partDimensions;
    }

    @Override
    public boolean shouldSave() {
        return false;
    }

    @Override
    public boolean shouldRender(double distance) {
        System.out.println("?X");
        return super.shouldRender(distance);
    }

    @Override
    public boolean shouldRender(double cameraX, double cameraY, double cameraZ) {
        System.out.println("?");
        return super.shouldRender(cameraX, cameraY, cameraZ);
    }

}
