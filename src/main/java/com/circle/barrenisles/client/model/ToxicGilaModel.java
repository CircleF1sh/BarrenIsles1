package com.circle.barrenisles.client.model;

import com.circle.barrenisles.entities.toxic_gila.ToxicGilaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;


public class ToxicGilaModel<T extends ToxicGilaEntity> extends EntityModel<T> {
    private final ModelRenderer Body;
    private final ModelRenderer head;
    private final ModelRenderer mouth;
    private final ModelRenderer toxin_pouch;
    private final ModelRenderer Tail;
    private final ModelRenderer front_leg_l;
    private final ModelRenderer front_leg_r;
    private final ModelRenderer back_leg_l;
    private final ModelRenderer back_leg_r;

    public ToxicGilaModel() {
        textureWidth = 32;
        textureHeight = 32;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(-0.55F, 20.0F, 0.2F);
        Body.setTextureOffset(0, 0).addBox(-1.85F, -2.0F, -5.2F, 5.0F, 4.0F, 11.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(3.15F, 4.0F, -0.2F);
        Body.addChild(head);
        head.setTextureOffset(13, 15).addBox(-4.0F, -5.9F, -8.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        mouth = new ModelRenderer(this);
        mouth.setRotationPoint(-2.4F, -3.8F, -9.0F);
        head.addChild(mouth);
        mouth.setTextureOffset(20, 21).addBox(-1.1F, -1.1F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        toxin_pouch = new ModelRenderer(this);
        toxin_pouch.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.addChild(toxin_pouch);
        toxin_pouch.setTextureOffset(22, 15).addBox(-3.5F, -2.9F, -8.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setRotationPoint(3.15F, 4.0F, -0.2F);
        Body.addChild(Tail);
        Tail.setTextureOffset(0, 15).addBox(-4.0F, -5.9F, 6.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);

        front_leg_l = new ModelRenderer(this);
        front_leg_l.setRotationPoint(3.15F, 4.0F, -0.2F);
        Body.addChild(front_leg_l);
        front_leg_l.setTextureOffset(21, 5).addBox(-1.9F, -3.0F, -4.65F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        front_leg_r = new ModelRenderer(this);
        front_leg_r.setRotationPoint(0.15F, 4.0F, -0.2F);
        Body.addChild(front_leg_r);
        front_leg_r.setTextureOffset(0, 5).addBox(-2.1F, -3.0F, -4.65F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        back_leg_l = new ModelRenderer(this);
        back_leg_l.setRotationPoint(3.15F, 4.0F, 5.8F);
        Body.addChild(back_leg_l);
        back_leg_l.setTextureOffset(21, 0).addBox(-1.9F, -3.0F, -4.65F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        back_leg_r = new ModelRenderer(this);
        back_leg_r.setRotationPoint(0.15F, 4.0F, 5.8F);
        Body.addChild(back_leg_r);
        back_leg_r.setTextureOffset(0, 0).addBox(-2.1F, -3.0F, -4.65F, 2.0F, 3.0F, 2.0F, 0.0F, false);
    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.Body.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.Body.rotateAngleY = ((float)Math.PI / 2F);
        this.back_leg_r.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.3F * limbSwingAmount;
        this.back_leg_l.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.3F * limbSwingAmount;
        this.front_leg_r.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.3F * limbSwingAmount;
        this.front_leg_l.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.3F * limbSwingAmount;
    }
}