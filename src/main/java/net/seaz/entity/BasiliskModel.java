package net.seaz.entity;

import com.google.common.collect.ImmutableList;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class BasiliskModel<T extends BasiliskEntity> extends CompositeEntityModel<T> {
    private final ModelPart originhead;
    private final ModelPart headR;
    private final ModelPart headteethR;
    private final ModelPart headRglow;
    private final ModelPart eyeflameR1;
    private final ModelPart eyeflameR2;
    private final ModelPart headL;
    private final ModelPart headteethL;
    private final ModelPart headLglow;
    private final ModelPart eyeflameL1;
    private final ModelPart eyeflameL2;
    private final ModelPart lowerjaw1;
    private final ModelPart lowerjaw2;
    private final ModelPart lowerteeth;
    private final ModelPart body1;
    private final ModelPart body2;
    private final ModelPart body3;
    private final ModelPart body4;
    private final ModelPart body5;
    private final ModelPart body6;
    private final ModelPart body7;
    private final ModelPart body8;
    private final ModelPart body9;
    private final ModelPart body10;
    private final ModelPart body11;
    private final ModelPart body12;
    private final ModelPart body13;
    private final ModelPart body14;
    private final ModelPart body15;
    private final ModelPart tailfin;
    private final ModelPart body13glow2;
    private final ModelPart body14glow;
    private final ModelPart body13glow;
    private final ModelPart body12glow;
    private final ModelPart body11glow;
    private final ModelPart body10glow;
    private final ModelPart body9glow;
    private final ModelPart body8glow;
    private final ModelPart body7glow;
    private final ModelPart body6glow;
    private final ModelPart bodycrest5;
    private final ModelPart body5glow2;
    private final ModelPart body5glow;
    private final ModelPart bodycrest4;
    private final ModelPart body4glow;
    private final ModelPart bodycrest3;
    private final ModelPart body3tendrilsR;
    private final ModelPart body3tendrilsL;
    private final ModelPart body3glow;
    private final ModelPart bodycrest2;
    private final ModelPart body2tendrilsR;
    private final ModelPart body2tendrilsL;
    private final ModelPart body2glow;
    private final ModelPart bodycrest1;
    private final ModelPart body1tendrilsL;
    private final ModelPart body1tendrilsR;
    private final ModelPart body1glow;
    private final ModelPart headcrestR;
    private final ModelPart headcrestL;
    private final ModelPart headcrestM;

    public BasiliskModel(ModelPart root) {
        this.originhead = root.getChild("originhead");
        this.headcrestM = this.originhead.getChild("headcrestM");
        this.headcrestL = this.originhead.getChild("headcrestL");
        this.headcrestR = this.originhead.getChild("headcrestR");
        this.body1 = this.originhead.getChild("body1");
        this.body1glow = this.body1.getChild("body1glow");
        this.body1tendrilsR = this.body1.getChild("body1tendrilsR");
        this.body1tendrilsL = this.body1.getChild("body1tendrilsL");
        this.bodycrest1 = this.body1.getChild("bodycrest1");
        this.body2 = this.body1.getChild("body2");
        this.body2glow = this.body2.getChild("body2glow");
        this.body2tendrilsL = this.body2.getChild("body2tendrilsL");
        this.body2tendrilsR = this.body2.getChild("body2tendrilsR");
        this.bodycrest2 = this.body2.getChild("bodycrest2");
        this.body3 = this.body2.getChild("body3");
        this.body3glow = this.body3.getChild("body3glow");
        this.body3tendrilsL = this.body3.getChild("body3tendrilsL");
        this.body3tendrilsR = this.body3.getChild("body3tendrilsR");
        this.bodycrest3 = this.body3.getChild("bodycrest3");
        this.body4 = this.body3.getChild("body4");
        this.body4glow = this.body4.getChild("body4glow");
        this.bodycrest4 = this.body4.getChild("bodycrest4");
        this.body5 = this.body4.getChild("body5");
        this.body5glow = this.body5.getChild("body5glow");
        this.body5glow2 = this.body5.getChild("body5glow2");
        this.bodycrest5 = this.body5.getChild("bodycrest5");
        this.body6 = this.body5.getChild("body6");
        this.body6glow = this.body6.getChild("body6glow");
        this.body7 = this.body6.getChild("body7");
        this.body7glow = this.body7.getChild("body7glow");
        this.body8 = this.body7.getChild("body8");
        this.body8glow = this.body8.getChild("body8glow");
        this.body9 = this.body8.getChild("body9");
        this.body9glow = this.body9.getChild("body9glow");
        this.body10 = this.body9.getChild("body10");
        this.body10glow = this.body10.getChild("body10glow");
        this.body11 = this.body10.getChild("body11");
        this.body11glow = this.body11.getChild("body11glow");
        this.body12 = this.body11.getChild("body12");
        this.body12glow = this.body12.getChild("body12glow");
        this.body13 = this.body12.getChild("body13");
        this.body13glow = this.body13.getChild("body13glow");
        this.body14 = this.body13.getChild("body14");
        this.body14glow = this.body14.getChild("body14glow");
        this.body15 = this.body14.getChild("body15");
        this.body13glow2 = this.body15.getChild("body13glow2");
        this.tailfin = this.body15.getChild("tailfin");
        this.lowerjaw1 = this.originhead.getChild("lowerjaw1");
        this.lowerteeth = this.lowerjaw1.getChild("lowerteeth");
        this.lowerjaw2 = this.lowerjaw1.getChild("lowerjaw2");
        this.headL = this.originhead.getChild("headL");
        this.eyeflameL2 = this.headL.getChild("eyeflameL2");
        this.eyeflameL1 = this.headL.getChild("eyeflameL1");
        this.headLglow = this.headL.getChild("headLglow");
        this.headteethL = this.headL.getChild("headteethL");
        this.headR = this.originhead.getChild("headR");
        this.eyeflameR2 = this.headR.getChild("eyeflameR2");
        this.eyeflameR1 = this.headR.getChild("eyeflameR1");
        this.headRglow = this.headR.getChild("headRglow");
        this.headteethR = this.headR.getChild("headteethR");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData1 = modelPartData.addChild("originhead", ModelPartBuilder.create().uv(0, 460).cuboid(-13.0F, -6.5F, -30.0F, 26.0F, 11.0F, 31.0F),
                ModelTransform.pivot(0.0F, -4.0F, 0.0F));
        ModelPartData modelPartData2 = modelPartData1.addChild("headR", ModelPartBuilder.create().uv(130, 450).cuboid(0.0F, 0.0F, -22.5F, 16.0F, 15.0F, 43.0F, true),
                ModelTransform.pivot(1.3F, -6.9F, -16.0F));
        modelPartData2.addChild("headteethR", ModelPartBuilder.create().uv(0, 380).cuboid(-8.0F, 0.0F, -22.5F, 16.0F, 15.0F, 43.0F), ModelTransform.pivot(8.0F, 15.0F, 0.0F));
        modelPartData2.addChild("headRglow", ModelPartBuilder.create().uv(1, 0).cuboid(0.0F, 0.0F, -22.5F, 16.0F, 15.0F, 43.0F, new Dilation(0.3F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData2.addChild("eyeflameR1", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -8.0F, 0.0F, 0.0F, 12.0F, 14.0F), ModelTransform.pivot(16.0F, 10.0F, -2.0F));
        modelPartData2.addChild("eyeflameR2", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -7.7F, 0.0F, 0.0F, 12.0F, 14.0F), ModelTransform.pivot(16.0F, 11.0F, -10.0F));
        ModelPartData modelPartData3 = modelPartData1.addChild("headL", ModelPartBuilder.create().uv(130, 450).cuboid(-16.0F, 0.0F, -22.5F, 16.0F, 15.0F, 43.0F),
                ModelTransform.pivot(-1.3F, -6.9F, -16.0F));
        modelPartData3.addChild("headteethL", ModelPartBuilder.create().uv(0, 380).cuboid(-8.0F, 0.0F, -22.5F, 16.0F, 15.0F, 43.0F, true), ModelTransform.pivot(-8.0F, 15.0F, 0.0F));
        modelPartData3.addChild("headLglow", ModelPartBuilder.create().uv(1, 0).cuboid(-16.0F, 0.0F, -22.5F, 16.0F, 15.0F, 43.0F, new Dilation(0.3F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("eyeflameL1", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -8.0F, 0.0F, 0.0F, 12.0F, 14.0F, true), ModelTransform.pivot(-16.0F, 10.0F, -2.0F));
        modelPartData3.addChild("eyeflameL2", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -7.7F, 0.0F, 0.0F, 12.0F, 14.0F, true), ModelTransform.pivot(-16.0F, 11.0F, -10.0F));
        ModelPartData modelPartData4 = modelPartData1.addChild("lowerjaw1", ModelPartBuilder.create().uv(260, 470).cuboid(-17.5F, -7.0F, -23.0F, 35.0F, 14.0F, 23.0F),
                ModelTransform.pivot(0.0F, 12.0F, 4.0F));
        modelPartData4.addChild("lowerjaw2", ModelPartBuilder.create().uv(400, 470).cuboid(-13.5F, -5.0F, -25.0F, 27.0F, 11.0F, 25.0F), ModelTransform.pivot(0.0F, -1.9F, -18.5F));
        modelPartData4.addChild("lowerteeth", ModelPartBuilder.create().uv(130, 385).cuboid(-12.5F, -16.0F, -19.0F, 25.0F, 16.0F, 38.0F), ModelTransform.pivot(0.0F, -5.3F, -24.0F));
        ModelPartData modelPartData5 = modelPartData1.addChild("body1", ModelPartBuilder.create().uv(0, 520).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 41.0F),
                ModelTransform.pivot(0.0F, 5.0F, -3.0F));
        ModelPartData modelPartData6 = modelPartData5.addChild("body2", ModelPartBuilder.create().uv(160, 515).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(-0.01F)),
                ModelTransform.pivot(0.0F, 0.0F, 34.0F));
        ModelPartData modelPartData7 = modelPartData6.addChild("body3", ModelPartBuilder.create().uv(330, 515).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(-0.02F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData8 = modelPartData7.addChild("body4", ModelPartBuilder.create().uv(0, 610).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(-0.03F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData9 = modelPartData8.addChild("body5", ModelPartBuilder.create().uv(160, 515).cuboid(-16.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(-0.04F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData10 = modelPartData9.addChild("body6", ModelPartBuilder.create().uv(330, 515).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(-0.05F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData11 = modelPartData10.addChild("body7", ModelPartBuilder.create().uv(0, 610).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(0.1F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData12 = modelPartData11.addChild("body8", ModelPartBuilder.create().uv(160, 515).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(-0.11F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData13 = modelPartData12.addChild("body9", ModelPartBuilder.create().uv(330, 515).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(-0.12F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData14 = modelPartData13.addChild("body10", ModelPartBuilder.create().uv(0, 610).cuboid(-15.5F, -14.5F, 0.0F, 31.0F, 29.0F, 48.0F, new Dilation(-0.13F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData15 = modelPartData14.addChild("body11", ModelPartBuilder.create().uv(170, 610).cuboid(-14.0F, -13.5F, 0.0F, 28.0F, 27.0F, 48.0F, new Dilation(-0.14F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData16 = modelPartData15.addChild("body12", ModelPartBuilder.create().uv(170, 610).cuboid(-14.0F, -13.5F, 0.0F, 28.0F, 27.0F, 48.0F, new Dilation(-0.15F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData17 = modelPartData16.addChild("body13", ModelPartBuilder.create().uv(330, 610).cuboid(-13.0F, -12.0F, 0.0F, 26.0F, 24.0F, 48.0F, new Dilation(-0.16F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData18 = modelPartData17.addChild("body14", ModelPartBuilder.create().uv(330, 610).cuboid(-13.0F, -12.0F, 0.0F, 26.0F, 24.0F, 48.0F, new Dilation(-0.17F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        ModelPartData modelPartData19 = modelPartData18.addChild("body15", ModelPartBuilder.create().uv(250, 30).cuboid(-11.0F, -10.5F, 0.0F, 22.0F, 21.0F, 48.0F, new Dilation(-0.18F)),
                ModelTransform.pivot(0.0F, 0.0F, 38.0F));
        modelPartData19.addChild("tailfin", ModelPartBuilder.create().uv(295, 0).cuboid(-1.0F, -47.5F, 0.0F, 1.0F, 95.0F, 105.0F), ModelTransform.pivot(0.0F, 2.4F, 31.1F));
        modelPartData19.addChild("body13glow2", ModelPartBuilder.create().uv(590, 250).cuboid(-11.0F, -3.5F, 0.0F, 22.0F, 7.0F, 48.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));
        modelPartData18.addChild("body14glow", ModelPartBuilder.create().uv(590, 330).cuboid(-13.0F, -3.5F, 0.0F, 26.0F, 7.0F, 48.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, -2.5F, 0.0F));
        modelPartData17.addChild("body13glow", ModelPartBuilder.create().uv(590, 330).cuboid(-13.0F, -3.5F, 0.0F, 26.0F, 7.0F, 48.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, -2.5F, 0.0F));
        modelPartData16.addChild("body12glow", ModelPartBuilder.create().uv(590, 170).cuboid(-14.0F, -3.5F, 0.0F, 28.0F, 7.0F, 48.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, -3.0F, 0.0F));
        modelPartData15.addChild("body11glow", ModelPartBuilder.create().uv(590, 170).cuboid(-14.0F, -3.5F, 0.0F, 28.0F, 7.0F, 48.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, -3.0F, 0.0F));
        modelPartData14.addChild("body10glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData13.addChild("body9glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData12.addChild("body8glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData11.addChild("body7glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData10.addChild("body6glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData9.addChild("bodycrest5", ModelPartBuilder.create().uv(230, 310).cuboid(-5.5F, -7.0F, -7.0F, 10.0F, 9.0F, 23.0F), ModelTransform.pivot(0.0F, -11.0F, 17.0F));
        modelPartData9.addChild("body5glow2", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -5.5F, 0.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.1F)), ModelTransform.pivot(-1.5F, 0.0F, 0.0F));
        modelPartData9.addChild("body5glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 48.0F), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData8.addChild("bodycrest4", ModelPartBuilder.create().uv(230, 310).cuboid(-5.5F, -7.0F, -7.0F, 10.0F, 9.0F, 23.0F), ModelTransform.pivot(0.0F, -11.0F, 17.0F));
        modelPartData8.addChild("body4glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, -1.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData7.addChild("bodycrest3", ModelPartBuilder.create().uv(230, 310).cuboid(-5.5F, -7.0F, -7.0F, 10.0F, 9.0F, 23.0F), ModelTransform.pivot(0.0F, -11.0F, 17.0F));
        modelPartData7.addChild("body3tendrilsR", ModelPartBuilder.create().uv(110, 300).cuboid(0.0F, -5.9F, -24.0F, 30.0F, 0.0F, 48.0F, true), ModelTransform.pivot(15.0F, 6.0F, 24.0F));
        modelPartData7.addChild("body3tendrilsL", ModelPartBuilder.create().uv(110, 300).cuboid(-30.0F, -5.9F, -24.0F, 30.0F, 0.0F, 48.0F), ModelTransform.pivot(-15.0F, 6.0F, 24.0F));
        modelPartData7.addChild("body3glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.1F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData6.addChild("bodycrest2", ModelPartBuilder.create().uv(230, 310).cuboid(-5.5F, -7.0F, -7.0F, 10.0F, 9.0F, 23.0F), ModelTransform.pivot(0.0F, -11.0F, 17.0F));
        modelPartData6.addChild("body2tendrilsR", ModelPartBuilder.create().uv(40, 300).cuboid(0.0F, 0.0F, -24.0F, 30.0F, 0.0F, 48.0F, true), ModelTransform.pivot(15.0F, 0.05F, 24.0F));
        modelPartData6.addChild("body2tendrilsL", ModelPartBuilder.create().uv(40, 300).cuboid(-30.0F, 0.0F, -24.0F, 30.0F, 0.0F, 48.0F), ModelTransform.pivot(-15.0F, 0.05F, 24.0F));
        modelPartData6.addChild("body2glow", ModelPartBuilder.create().uv(590, 80).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 48.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData5.addChild("bodycrest1", ModelPartBuilder.create().uv(230, 310).cuboid(-5.5F, -7.0F, -7.0F, 10.0F, 9.0F, 23.0F), ModelTransform.pivot(0.0F, -11.0F, 17.0F));
        modelPartData5.addChild("body1tendrilsL", ModelPartBuilder.create().uv(-30, 300).cuboid(-30.0F, 0.0F, -20.5F, 30.0F, 0.0F, 41.0F), ModelTransform.pivot(-15.0F, 0.0F, 20.5F));
        modelPartData5.addChild("body1tendrilsR", ModelPartBuilder.create().uv(-30, 300).cuboid(0.0F, 0.0F, -20.5F, 30.0F, 0.0F, 41.0F, true), ModelTransform.pivot(15.0F, 0.0F, 20.5F));
        modelPartData5.addChild("body1glow", ModelPartBuilder.create().uv(590, 0).cuboid(-15.5F, -3.5F, 0.0F, 31.0F, 7.0F, 41.0F, new Dilation(0.2F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        modelPartData1.addChild("headcrestR", ModelPartBuilder.create().uv(270, 400).cuboid(0.0F, -7.0F, -15.0F, 11.0F, 8.0F, 30.0F), ModelTransform.pivot(2.0F, -3.0F, -21.0F));
        modelPartData1.addChild("headcrestL", ModelPartBuilder.create().uv(270, 400).cuboid(-11.0F, -7.0F, -15.0F, 11.0F, 8.0F, 30.0F, true), ModelTransform.pivot(-2.0F, -3.0F, -21.0F));
        modelPartData1.addChild("headcrestM", ModelPartBuilder.create().uv(360, 400).cuboid(-6.5F, -7.0F, -5.0F, 13.0F, 9.0F, 28.0F), ModelTransform.pivot(0.0F, -4.7F, -20.0F));
        return TexturedModelData.of(modelData, 1028, 1028);
    }

    @Override
    public Iterable<ModelPart> getParts() {
        return ImmutableList.of(this.originhead);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.headR.yaw = 0.2269F;
        this.headR.roll = -0.1222F;
        this.eyeflameR1.pitch = 0.3491F;
        this.eyeflameR1.yaw = 0.1396F;
        this.eyeflameR2.pitch = 0.4014F;
        this.eyeflameR2.yaw = 0.1222F;
        this.headL.yaw = -0.2269F;
        this.headL.roll = 0.1222F;
        this.eyeflameL1.pitch = 0.3491F;
        this.eyeflameL1.yaw = -0.1396F;
        this.eyeflameL2.pitch = 0.4014F;
        this.eyeflameL2.yaw = -0.1222F;
        this.lowerjaw1.pitch = 0.7037F;
        this.lowerjaw2.pitch = 0.0349F;
        this.bodycrest5.pitch = 0.4887F;
        this.bodycrest4.pitch = 0.4887F;
        this.bodycrest3.pitch = 0.4887F;
        this.body3tendrilsR.roll = 0.3142F;
        this.body3tendrilsL.roll = -0.3142F;
        this.bodycrest2.pitch = 0.4887F;
        this.body2tendrilsR.roll = 0.3142F;
        this.body2tendrilsL.roll = -0.3159F;
        this.bodycrest1.pitch = 0.4887F;
        this.body1tendrilsL.roll = -0.3142F;
        this.body1tendrilsR.roll = 0.3142F;
        this.headcrestR.pitch = 0.1396F;
        this.headcrestR.yaw = 0.2269F;
        this.headcrestR.roll = -0.2793F;
        this.headcrestL.pitch = 0.1396F;
        this.headcrestL.yaw = -0.2269F;
        this.headcrestL.roll = 0.2793F;
        this.headcrestM.pitch = 0.3491F;
        // this.amethyst2.pitch = -0.1745F;
        // this.amethyst2.yaw = 0.1745F;
        // this.amethyst2_r1.yaw = 0.3927F;
        // this.amethyst3.pitch = 1.2217F;
        // this.amethyst3.yaw = 0.4363F;
        // this.head_r1.pitch = -0.0436F;
        // this.amethyst.roll = 0.6981F;
        // this.amethyst4.roll = -0.6981F;
        // this.head.yaw = headYaw * 0.0089453292F;
        // this.head.pitch = headPitch * 0.0047453292F;
        // this.right_leg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
        // this.left_leg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        // this.right_arm.pitch = -MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 2.0F * limbDistance * 0.3F;
        // this.left_arm.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 2.0F * limbDistance * 0.3F;
        // float k = MathHelper.sin(entity.handSwingProgress * 3.1415927F);
        // if (k > 0) {
        // this.right_arm.pitch = -k;
        // }
        // if (entity.getDataTracker().get(AmethystGolemEntity.BACK_CRYSTALS) == 4) {
        // amethyst.visible = true;
        // amethyst2.visible = true;
        // amethyst3.visible = true;
        // amethyst4.visible = true;
        // } else if (entity.getDataTracker().get(AmethystGolemEntity.BACK_CRYSTALS) == 3) {
        // amethyst.visible = true;
        // amethyst2.visible = true;
        // amethyst3.visible = false;
        // amethyst4.visible = true;
        // } else if (entity.getDataTracker().get(AmethystGolemEntity.BACK_CRYSTALS) == 2) {
        // amethyst.visible = true;
        // amethyst2.visible = true;
        // amethyst3.visible = false;
        // amethyst4.visible = false;
        // } else if (entity.getDataTracker().get(AmethystGolemEntity.BACK_CRYSTALS) == 1) {
        // amethyst.visible = false;
        // amethyst2.visible = true;
        // amethyst3.visible = false;
        // amethyst4.visible = false;
        // } else if (entity.getDataTracker().get(AmethystGolemEntity.BACK_CRYSTALS) == 0) {
        // amethyst.visible = false;
        // amethyst2.visible = false;
        // amethyst3.visible = false;
        // amethyst4.visible = false;
        // }
    }

}
