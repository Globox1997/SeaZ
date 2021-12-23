package net.seaz.entity;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.control.AquaticMoveControl;
import net.minecraft.entity.ai.control.YawAdjustingLookControl;
import net.minecraft.entity.ai.goal.ChaseBoatGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.MoveIntoWaterGoal;
import net.minecraft.entity.ai.goal.SwimAroundGoal;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.SwimNavigation;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.packet.s2c.play.MobSpawnS2CPacket;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.seaz.SeazMain;

public class BasiliskEntity extends WaterCreatureEntity implements Monster {

    private final BasiliskPartEntity[] parts;

    public final BasiliskPartEntity body = new BasiliskPartEntity(this, "body", 3.0F, 3.0F);
    private final BasiliskPartEntity body1 = new BasiliskPartEntity(this, "body1", 3.0F, 3.0F);
    private final BasiliskPartEntity body2 = new BasiliskPartEntity(this, "body2", 3.0F, 3.0F);
    private final BasiliskPartEntity body3 = new BasiliskPartEntity(this, "body3", 3.0F, 3.0F);
    private final BasiliskPartEntity body4 = new BasiliskPartEntity(this, "body4", 3.0F, 3.0F);
    private final BasiliskPartEntity body5 = new BasiliskPartEntity(this, "body5", 3.0F, 3.0F);
    private final BasiliskPartEntity body6 = new BasiliskPartEntity(this, "body6", 3.0F, 3.0F);
    private final BasiliskPartEntity body7 = new BasiliskPartEntity(this, "body7", 3.0F, 3.0F);
    private final BasiliskPartEntity body8 = new BasiliskPartEntity(this, "body8", 3.0F, 3.0F);
    private final BasiliskPartEntity body9 = new BasiliskPartEntity(this, "body9", 3.0F, 3.0F);
    private final BasiliskPartEntity body10 = new BasiliskPartEntity(this, "body10", 3.0F, 3.0F);
    private final BasiliskPartEntity body11 = new BasiliskPartEntity(this, "body11", 3.0F, 3.0F);
    private final BasiliskPartEntity body12 = new BasiliskPartEntity(this, "body12", 3.0F, 3.0F);
    private final BasiliskPartEntity body13 = new BasiliskPartEntity(this, "body13", 3.0F, 3.0F);
    private final BasiliskPartEntity body14 = new BasiliskPartEntity(this, "body14", 3.0F, 3.0F);
    private final BasiliskPartEntity body15 = new BasiliskPartEntity(this, "body15", 3.0F, 3.0F);

    public BasiliskEntity(EntityType<? extends WaterCreatureEntity> entityType, World world) {
        super(entityType, world);
        this.parts = new BasiliskPartEntity[] { this.body, this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11,
                this.body12, this.body13, this.body14, this.body15 };

        System.out.println("Initialize Basilisk and Parts");

        for (int i = 0; i < this.parts.length; i++) {
            this.world.spawnEntity(this.parts[i]);
            // System.out.print("" + i);
        }
        this.moveControl = new AquaticMoveControl(this, 85, 10, 0.02F, 0.1F, true);
        this.lookControl = new YawAdjustingLookControl(this, 10);

    }

    public static DefaultAttributeContainer.Builder createBasiliskAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.2D).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.0D);
    }

    // public static boolean canSpawn(EntityType<BasiliskEntity> type, WorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
    // if (pos.getY() > 45 && pos.getY() < world.getSeaLevel()) {
    // Optional<RegistryKey<Biome>> optional = world.getBiomeKey(pos);
    // return (!Objects.equals(optional, Optional.of(BiomeKeys.OCEAN)) || !Objects.equals(optional, Optional.of(BiomeKeys.DEEP_OCEAN))) && world.getFluidState(pos).isIn(FluidTags.WATER);
    // } else {
    // return false;
    // }
    // }

    @Override
    protected void initGoals() {
        // // this.goalSelector.add(0, new BreatheAirGoal(this));
        // this.goalSelector.add(0, new MoveIntoWaterGoal(this));
        // // this.goalSelector.add(1, new DolphinEntity.LeadToNearbyTreasureGoal(this));
        // // this.goalSelector.add(2, new DolphinEntity.SwimWithPlayerGoal(this, 4.0D));
        // this.goalSelector.add(4, new SwimAroundGoal(this, 1.0D, 10));
        this.goalSelector.add(4, new LookAroundGoal(this));
        // // this.goalSelector.add(5, new LookAtEntityGoal(this, PlayerEntity.class,
        // // 6.0F));
        // // this.goalSelector.add(5, new DolphinJumpGoal(this, 10));
        // this.goalSelector.add(6, new MeleeAttackGoal(this, 1.2000000476837158D, true));
        // // this.goalSelector.add(8, new DolphinEntity.PlayWithItemsGoal());
        // this.goalSelector.add(8, new ChaseBoatGoal(this));
        // // this.goalSelector.add(9, new FleeEntityGoal(this, GuardianEntity.class, 8.0F,
        // // 1.0D, 1.0D));
        // // this.targetSelector.add(1, (new RevengeGoal(this, new
        // // Class[]{GuardianEntity.class})).setGroupRevenge());
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (this.canMoveVoluntarily() && this.isTouchingWater()) {
            this.updateVelocity(this.getMovementSpeed(), movementInput);
            this.move(MovementType.SELF, this.getVelocity());
            this.setVelocity(this.getVelocity().multiply(0.9D));
            if (this.getTarget() == null) {
                this.setVelocity(this.getVelocity().add(0.0D, -0.005D, 0.0D));
            }
        } else {
            super.travel(movementInput);
        }

    }

    @Override
    public boolean canBeLeashedBy(PlayerEntity player) {
        return false;
    }

    // @Override
    // protected boolean isNearTarget() {
    // BlockPos blockPos = this.getNavigation().getTargetPos();
    // return blockPos != null ? blockPos.isWithinDistance(this.getPos(), 12.0D) :
    // false;
    // }

    // protected SoundEvent getHurtSound(DamageSource source) {
    // return SoundEvents.ENTITY_DOLPHIN_HURT;
    // }

    // @Nullable
    // protected SoundEvent getDeathSound() {
    // return SoundEvents.ENTITY_DOLPHIN_DEATH;
    // }

    // @Nullable
    // protected SoundEvent getAmbientSound() {
    // return this.isTouchingWater() ? SoundEvents.ENTITY_DOLPHIN_AMBIENT_WATER :
    // SoundEvents.ENTITY_DOLPHIN_AMBIENT;
    // }

    // protected SoundEvent getSplashSound() {
    // return SoundEvents.ENTITY_DOLPHIN_SPLASH;
    // }

    // protected SoundEvent getSwimSound() {
    // return SoundEvents.ENTITY_DOLPHIN_SWIM;
    // }

    @Override
    protected EntityNavigation createNavigation(World world) {
        return new SwimNavigation(this, world);
    }

    @Override
    public boolean tryAttack(Entity target) {
        boolean bl = target.damage(DamageSource.mob(this), (float) ((int) this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)));
        if (bl) {
            this.applyDamageEffects(this, target);
            this.playSound(SoundEvents.ENTITY_DOLPHIN_ATTACK, 1.0F, 1.0F);
        }

        return bl;
    }

    // protected float getActiveEyeHeight(EntityPose pose, EntityDimensions
    // dimensions) {
    // return 0.3F;
    // }

    @Override
    protected boolean shouldDropXp() {
        return true;
    }

    @Override
    protected boolean shouldDropLoot() {
        return true;
    }

    @Override
    protected boolean isDisallowedInPeaceful() {
        return true;
    }

    @Override
    public SoundCategory getSoundCategory() {
        return SoundCategory.HOSTILE;
    }

    @Override
    public void tickMovement() {
        this.tickHandSwing();
        super.tickMovement();

        Vec3d[] vec3ds = new Vec3d[this.parts.length];

        for (int x = 0; x < this.parts.length; ++x) {
            vec3ds[x] = new Vec3d(this.parts[x].getX(), this.parts[x].getY(), this.parts[x].getZ());
        }

        // float ab = this.getYaw() * 0.017453292F;
        float ab = this.prevBodyYaw * 0.017453292F;
        float ac = MathHelper.sin(ab);
        float ad = MathHelper.cos(ab);
        // this.parts[0].setYaw(this.prevBodyYaw);
        // System.out.print(this.bodyYaw + ":::::");
        // System.out.println(ab + "::::::::" + ac + "::::::::" + ad);
        // this.movePart(this.body1, (double) (ac * 0.5F), 0.0D, (double) (-ad * 0.5F));

        // this.movePart(this.parts[0], ac * 0.5F * SeazMain.CONFIG.test, 0.0D, -ad * 0.5F * SeazMain.CONFIG.test, true);
        // for (int ah = 0; ah < this.parts.length; ++ah) {
        // for (int ah = 1; ah < this.parts.length; ++ah) {
        // // System.out.print((double) (ac * 0.5F) * ah * SeazMain.CONFIG.test + "::::");

        // // this.movePart(this.parts[ah], (double) (ac * 0.5F) * ah * SeazMain.CONFIG.test + ac * 0.5F * SeazMain.CONFIG.test, 0.0D,
        // // (double) (-ad * 0.5F) * ah * SeazMain.CONFIG.test - ad * 0.5F * SeazMain.CONFIG.test);

        // this.movePart(this.parts[ah], this.parts[ah - 1].prevX, this.parts[ah - 1].prevY, this.parts[ah - 1].prevZ, false);
        // this.parts[ah].prevX = vec3ds[ah].x;
        // this.parts[ah].prevY = vec3ds[ah].y;
        // this.parts[ah].prevZ = vec3ds[ah].z;
        // this.parts[ah].lastRenderX = vec3ds[ah].x;
        // this.parts[ah].lastRenderY = vec3ds[ah].y;
        // this.parts[ah].lastRenderZ = vec3ds[ah].z;
        // }
        moveSegments();
        // if (this.world.isClient)
        // System.out.println("Entity: " + "::" + this.prevBodyYaw + "::" + this.parts[2].prevYaw + "::" + this.parts[2].getYaw() + "::");
        // System.out.println("Entity: " + this.getYaw() + "::" + this.prevBodyYaw + "::" + this.bodyYaw + "::" + this.parts[2].prevYaw + "::" + this.parts[2].getYaw() + "::");

        this.parts[0].setYaw(this.prevBodyYaw);
        this.parts[0].setPosition(this.getX() + ac * 0.5F * SeazMain.CONFIG.test, this.prevY, this.getZ() + -ad * 0.5F * SeazMain.CONFIG.test);
        // this.movePart(this.parts[0], ac * 0.5F * SeazMain.CONFIG.test, 0.0D, -ad * 0.5F * SeazMain.CONFIG.test, true);
    }

    private void movePart(BasiliskPartEntity basiliskPartEntity, double dx, double dy, double dz) {
        // if (test)
        basiliskPartEntity.setPosition(this.getX() + dx, this.getY() + dy, this.getZ() + dz);
        // else
        // basiliskPartEntity.setPosition(dx, dy, dz);
    }

    private void moveSegments() {
        for (int i = 1; i < this.parts.length; i++) {
            // this.parts[i].tick();
            // i == 0 ? this :
            Entity leader = this.parts[i - 1];
            double followX = leader.getX();
            double followY = leader.getY();
            double followZ = leader.getZ();

            // also weight the position so that the segments straighten out a little bit, and the front ones straighten more
            float angle = (((leader.prevYaw + 180) * 3.141593F) / 180F);

            double straightenForce = 0.05D + (1.0 / (i + 1)) * 0.5D * SeazMain.CONFIG.test5;

            double idealX = -MathHelper.sin(angle) * straightenForce;
            double idealZ = MathHelper.cos(angle) * straightenForce;

            Vec3d diff = new Vec3d(parts[i].getX() - followX, parts[i].getY() - followY, parts[i].getZ() - followZ);
            diff = diff.normalize();

            // weight so segments drift towards their ideal position
            diff = diff.add(idealX, 0, idealZ).normalize();

            double f = 2.0D;

            double destX = followX + f * diff.x;
            double destY = followY + f * diff.y;
            double destZ = followZ + f * diff.z;

            parts[i].setPos(destX, destY, destZ);

            double distance = MathHelper.sqrt((float) (diff.x * diff.x + diff.z * diff.z));

            if (i == 0) {
                // tilt segment next to head up towards head
                diff = diff.add(0, -0.15, 0);
            }
            // , -(float) (Math.atan2(diff.y, distance) * 180.0D / Math.PI)
            parts[i].prevYaw = parts[i].getYaw();
            parts[i].setYaw((float) (Math.atan2(diff.z, diff.x) * 180.0D / Math.PI) + 90.0F);
        }
    }

    @Override
    public void readFromPacket(MobSpawnS2CPacket packet) {
        super.readFromPacket(packet);

        System.out.println("READFROMPACKET: " + this.world.isClient);

        BasiliskPartEntity[] basiliskPartEntities = this.getBodyParts();

        for (int i = 0; i < basiliskPartEntities.length; ++i) {
            basiliskPartEntities[i].setId(i + packet.getId());
            System.out.println("READFROMPACKET???");
        }

    }

    public BasiliskPartEntity[] getBodyParts() {
        return this.parts;
    }

    @Override
    public boolean canBreatheInWater() {
        return true;
    }

    public boolean damagePart(BasiliskPartEntity part, DamageSource source, float amount) {
        return parentDamage(source, amount);
        // if (this.phaseManager.getCurrent().getType() == PhaseType.DYING) {
        // return false;
        // } else {
        // amount = this.phaseManager.getCurrent().modifyDamageTaken(source, amount);
        // if (part != this.head) {
        // amount = amount / 4.0F + Math.min(amount, 1.0F);
        // }

        // if (amount < 0.01F) {
        // return false;
        // } else {
        // if (source.getAttacker() instanceof PlayerEntity || source.isExplosive()) {
        // float f = this.getHealth();
        // this.parentDamage(source, amount);
        // if (this.isDead() && !this.phaseManager.getCurrent().isSittingOrHovering()) {
        // this.setHealth(1.0F);
        // this.phaseManager.setPhase(PhaseType.DYING);
        // }

        // if (this.phaseManager.getCurrent().isSittingOrHovering()) {
        // this.damageDuringSitting = (int) ((float) this.damageDuringSitting + (f - this.getHealth()));
        // if ((float) this.damageDuringSitting > 0.25F * this.getMaxHealth()) {
        // this.damageDuringSitting = 0;
        // this.phaseManager.setPhase(PhaseType.TAKEOFF);
        // }
        // }
        // }

        // return true;
        // }
        // }
    }

    private boolean parentDamage(DamageSource source, float amount) {
        return super.damage(source, amount);
    }
}
