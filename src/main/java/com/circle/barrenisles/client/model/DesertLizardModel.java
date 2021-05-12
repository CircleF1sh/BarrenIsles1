package com.circle.barrenisles.client.model;

import com.circle.barrenisles.entities.desert_lizard.DesertLizardEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.PigModel;
import net.minecraft.client.renderer.entity.model.SpiderModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DesertLizardModel<T extends DesertLizardEntity> extends EntityModel<T> {

    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer front_leg_l;
    private final ModelRenderer front_leg_r;
    private final ModelRenderer back_leg_l;
    private final ModelRenderer back_leg_r;
    private final ModelRenderer tail;

    public DesertLizardModel() {
        textureWidth = 32;
        textureHeight = 32;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.3F, 21.0F, -1.2F);
        body.setTextureOffset(0, 0).addBox(-2.3F, -2.2F, -3.8F, 4.0F, 4.0F, 9.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 20.7F, -7.5F);
        setRotationAngle(head, -0.0524F, 0.0F, 0.0F);
        head.setTextureOffset(0, 13).addBox(-2.0F, -2.0921F, -2.427F, 4.0F, 4.0F, 5.0F, 0.0F, false);

        front_leg_l = new ModelRenderer(this);
        front_leg_l.setRotationPoint(1.5F, 23.8F, 0.0F);
        setRotationAngle(front_leg_l, 0.0F, -0.1571F, -1.0123F);
        front_leg_l.setTextureOffset(23, 3).addBox(0.5F, -1.5F, -3.6F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        front_leg_r = new ModelRenderer(this);
        front_leg_r.setRotationPoint(-3.4F, 21.3F, 0.3F);
        setRotationAngle(front_leg_r, 0.0F, 0.1571F, 1.0123F);
        front_leg_r.setTextureOffset(17, 0).addBox(0.5F, -1.7F, -3.6F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        back_leg_l = new ModelRenderer(this);
        back_leg_l.setRotationPoint(1.5F, 23.8F, 3.7F);
        setRotationAngle(back_leg_l, 0.0F, -0.1571F, -1.0123F);
        back_leg_l.setTextureOffset(0, 22).addBox(0.5F, -1.5F, -3.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        back_leg_r = new ModelRenderer(this);
        back_leg_r.setRotationPoint(-3.4F, 21.3F, 4.8F);
        setRotationAngle(back_leg_r, 0.0F, 0.1571F, 1.0123F);
        back_leg_r.setTextureOffset(0, 0).addBox(0.6F, -1.7F, -3.6F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 24.0F, 0.0F);
        tail.setTextureOffset(12, 16).addBox(-1.5F, -4.3F, 4.0F, 3.0F, 3.0F, 6.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        front_leg_l.render(matrixStack, buffer, packedLight, packedOverlay);
        front_leg_r.render(matrixStack, buffer, packedLight, packedOverlay);
        back_leg_l.render(matrixStack, buffer, packedLight, packedOverlay);
        back_leg_r.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}