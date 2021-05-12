package com.circle.barrenisles.client.render;

import com.circle.barrenisles.BarrenIsles;
import com.circle.barrenisles.client.model.ToxicGilaModel;
import com.circle.barrenisles.entities.toxic_gila.ToxicGilaEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ToxicGilaRenderer extends MobRenderer<ToxicGilaEntity, ToxicGilaModel<ToxicGilaEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(BarrenIsles.MOD_ID, "textures/entity/toxic_gila.png");


    public ToxicGilaRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ToxicGilaModel<>(), 0.2F);
    }

    @Override
    public ResourceLocation getEntityTexture(ToxicGilaEntity entity) {
        return TEXTURE;
    }
}
