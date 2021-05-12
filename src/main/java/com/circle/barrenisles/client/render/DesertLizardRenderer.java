package com.circle.barrenisles.client.render;

import com.circle.barrenisles.BarrenIsles;
import com.circle.barrenisles.client.model.DesertLizardModel;
import com.circle.barrenisles.entities.desert_lizard.DesertLizardEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DesertLizardRenderer extends MobRenderer<DesertLizardEntity, DesertLizardModel<DesertLizardEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(BarrenIsles.MOD_ID, "textures/entity/desert_lizard.png");

    public DesertLizardRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DesertLizardModel<>(), 0.25F);
    }

    @Override
    public ResourceLocation getEntityTexture(DesertLizardEntity entity) {
        return TEXTURE;
    }
}
