package net.seaz;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EmptyEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.seaz.entity.BasiliskModel;
import net.seaz.entity.BasiliskRenderer;

public class SeazClient implements ClientModInitializer {

    public static final EntityModelLayer BASILISK_LAYER = new EntityModelLayer(new Identifier("seaz:basilisk_render_layer"), "basilisk_render_layer");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(SeazMain.BASILISK_ENTITY, BasiliskRenderer::new);
        EntityRendererRegistry.register(SeazMain.BASILISK_PART_ENTITY, EmptyEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(BASILISK_LAYER, BasiliskModel::getTexturedModelData);
    }

}
