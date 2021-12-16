package net.seaz;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.seaz.config.SeaConfig;
import net.seaz.entity.BasiliskEntity;
import net.seaz.entity.BasiliskPartEntity;

public class SeazMain implements ModInitializer {
    public static SeaConfig CONFIG = new SeaConfig();
    public static final EntityType<BasiliskEntity> BASILISK_ENTITY = FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, BasiliskEntity::new).fireImmune()
            .dimensions(EntityDimensions.changing(3.0F, 3.0F)).build();
    public static final EntityType<BasiliskPartEntity> BASILISK_PART_ENTITY = FabricEntityTypeBuilder.<BasiliskPartEntity>create(SpawnGroup.MISC, BasiliskPartEntity::new).fireImmune()
            .dimensions(EntityDimensions.changing(2.5F, 2.5F)).build();

    @Override
    public void onInitialize() {
        AutoConfig.register(SeaConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(SeaConfig.class).getConfig();

        Registry.register(Registry.ENTITY_TYPE, new Identifier("seaz", "basilisk"), BASILISK_ENTITY);
        Registry.register(Registry.ENTITY_TYPE, new Identifier("seaz", "basilisk_part"), BASILISK_PART_ENTITY);
        FabricDefaultAttributeRegistry.register(BASILISK_ENTITY, BasiliskEntity.createBasiliskAttributes());
        Registry.register(Registry.ITEM, new Identifier("seaz", "spawn_basilisk"), new SpawnEggItem(BASILISK_ENTITY, 2573385, 6349296, new Item.Settings().group(ItemGroup.MISC)));
    }

}
