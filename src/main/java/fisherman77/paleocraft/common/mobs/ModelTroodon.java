// Date: 3/18/2013 4:27:56 PM
// Template version 1.1
// Date: 3/18/2013 4:27:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fisherman77.paleocraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.MathHelper;

public class ModelTroodon extends ModelBase
{
	  //fields
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer Neck1;
    ModelRenderer Neck2;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer TailFan;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer Snout;
    ModelRenderer Crest;
    ModelRenderer RightThigh;
    ModelRenderer RightLeg;
    ModelRenderer RightFoot;
    ModelRenderer RightClaw;
    ModelRenderer LeftThigh;
    ModelRenderer LeftClaw;
    ModelRenderer LeftLeg;
    ModelRenderer LeftFoot;
  
  public ModelTroodon()
  {
    textureWidth = 200;
    textureHeight = 200;
    
      LeftArm = new ModelRenderer(this, 102, 128);
      LeftArm.addBox(0F, 0F, -3F, 1, 11, 7);
      LeftArm.setRotationPoint(2F, 11F, -2F);
      LeftArm.setTextureSize(200, 200);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0.3316126F, 0.3665191F, -0.5410521F);
      RightArm = new ModelRenderer(this, 102, 128);
      RightArm.addBox(0F, 0F, -3F, 1, 11, 7);
      RightArm.setRotationPoint(-2F, 11F, -2F);
      RightArm.setTextureSize(200, 200);
      RightArm.mirror = true;
      setRotation(RightArm, 0.3316126F, -0.3665191F, 0.5410521F);
      Neck1 = new ModelRenderer(this, 54, 72);
      Neck1.addBox(-2.5F, -4F, -4F, 3, 5, 4);
      Neck1.setRotationPoint(1F, 13F, -3F);
      Neck1.setTextureSize(200, 200);
      Neck1.mirror = true;
      setRotation(Neck1, -0.418879F, 0F, 0F);
      Neck2 = new ModelRenderer(this, 3, 62);
      Neck2.addBox(-1F, -2F, -7F, 2, 3, 8);
      Neck2.setRotationPoint(0F, 11F, -6F);
      Neck2.setTextureSize(200, 200);
      Neck2.mirror = true;
      setRotation(Neck2, -1.151917F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 39, 59);
      Tail1.addBox(-2F, -2F, 0F, 4, 5, 3);
      Tail1.setRotationPoint(0F, 10F, 4.5F);
      Tail1.setTextureSize(200, 200);
      Tail1.mirror = true;
      setRotation(Tail1, 0.122173F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 62, 58);
      Tail2.addBox(-1.5F, -2F, 0F, 3, 4, 5);
      Tail2.setRotationPoint(0F, 10F, 7F);
      Tail2.setTextureSize(200, 200);
      Tail2.mirror = true;
      setRotation(Tail2, 0.0872665F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 9, 41);
      Tail3.addBox(-1F, -1F, 0F, 2, 3, 10);
      Tail3.setRotationPoint(0F, 9F, 11F);
      Tail3.setTextureSize(200, 200);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 39, 40);
      Tail4.addBox(-1F, -1F, 0F, 2, 2, 11);
      Tail4.setRotationPoint(0F, 9F, 21F);
      Tail4.setTextureSize(200, 200);
      Tail4.mirror = true;
      setRotation(Tail4, 0F, 0F, 0F);
      Tail5 = new ModelRenderer(this, 71, 42);
      Tail5.addBox(-1F, 0F, 0F, 2, 1, 9);
      Tail5.setRotationPoint(0F, 8F, 32F);
      Tail5.setTextureSize(200, 200);
      Tail5.mirror = true;
      setRotation(Tail5, 0F, 0F, 0F);
      TailFan = new ModelRenderer(this, 69, 16);
      TailFan.addBox(-3F, 0F, 0F, 6, 1, 13);
      TailFan.setRotationPoint(0F, 8F, 32F);
      TailFan.setTextureSize(200, 200);
      TailFan.mirror = true;
      setRotation(TailFan, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 26, 83);
      Body.addBox(-2.5F, -3F, 0F, 5, 6, 11);
      Body.setRotationPoint(0F, 11F, -5F);
      Body.setTextureSize(200, 200);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 29, 74);
      Head.addBox(-1.5F, -1F, -4F, 3, 3, 5);
      Head.setRotationPoint(0F, 4F, -8F);
      Head.setTextureSize(200, 200);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Snout = new ModelRenderer(this, 0, 93);
      Snout.addBox(-1F, 0F, -9F, 2, 2, 5);
      Snout.setRotationPoint(0F, 4F, -8F);
      Snout.setTextureSize(200, 200);
      Snout.mirror = true;
      setRotation(Snout, 0F, 0F, 0F);
      Crest = new ModelRenderer(this, 25, 7);
      Crest.addBox(0F, -6F, -4F, 0, 7, 8);
      Crest.setRotationPoint(0F, 4F, -8F);
      Crest.setTextureSize(200, 200);
      Crest.mirror = true;
      setRotation(Crest, 0F, 0F, 0F);
      RightThigh = new ModelRenderer(this, 48, 13);
      RightThigh.addBox(-2F, -2F, -1F, 2, 8, 4);
      RightThigh.setRotationPoint(-1.5F, 11F, 3F);
      RightThigh.setTextureSize(200, 200);
      RightThigh.mirror = true;
      setRotation(RightThigh, 0F, 0F, -0.0174533F);
      RightLeg = new ModelRenderer(this, 55, 30);
      RightLeg.addBox(-2F, 5F, 2F, 2, 7, 2);
      RightLeg.setRotationPoint(-1.5F, 11F, 3F);
      RightLeg.setTextureSize(200, 200);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, -0.0174533F);
      RightFoot = new ModelRenderer(this, 64, 30);
      RightFoot.addBox(-2F, 12F, 0F, 2, 1, 4);
      RightFoot.setRotationPoint(-1.5F, 11F, 3F);
      RightFoot.setTextureSize(200, 200);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0F, 0F, -0.0174533F);
      RightClaw = new ModelRenderer(this, 20, 0);
      RightClaw.addBox(0F, 10F, 0F, 0, 2, 2);
      RightClaw.setRotationPoint(-1.5F, 11F, 3F);
      RightClaw.setTextureSize(200, 200);
      RightClaw.mirror = true;
      setRotation(RightClaw, 0F, 0F, -0.0174533F);
      LeftThigh = new ModelRenderer(this, 34, 27);
      LeftThigh.addBox(0F, -2F, -1F, 2, 8, 4);
      LeftThigh.setRotationPoint(1.5F, 11F, 3F);
      LeftThigh.setTextureSize(200, 200);
      LeftThigh.mirror = true;
      setRotation(LeftThigh, 0F, 0F, 0F);
      LeftClaw = new ModelRenderer(this, 20, 0);
      LeftClaw.addBox(0F, 10F, 0F, 0, 2, 2);
      LeftClaw.setRotationPoint(1.5F, 11F, 3F);
      LeftClaw.setTextureSize(200, 200);
      LeftClaw.mirror = true;
      setRotation(LeftClaw, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 55, 30);
      LeftLeg.addBox(0F, 5F, 2F, 2, 7, 2);
      LeftLeg.setRotationPoint(1.5F, 11F, 3F);
      LeftLeg.setTextureSize(200, 200);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftFoot = new ModelRenderer(this, 64, 30);
      LeftFoot.addBox(0F, 12F, 0F, 2, 1, 4);
      LeftFoot.setRotationPoint(1.5F, 11F, 3F);
      LeftFoot.setTextureSize(200, 200);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    LeftArm.render(f5);
    RightArm.render(f5);
    Neck1.render(f5);
    Neck2.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Tail4.render(f5);
    Tail5.render(f5);
    TailFan.render(f5);
    Body.render(f5);
    Head.render(f5);
    Snout.render(f5);
    Crest.render(f5);
    RightThigh.render(f5);
    RightLeg.render(f5);
    RightFoot.render(f5);
    RightClaw.render(f5);
    LeftThigh.render(f5);
    LeftClaw.render(f5);
    LeftLeg.render(f5);
    LeftFoot.render(f5);
  }
  
  public void setLivingAnimations(EntityLiving par1EntityLiving, float par2, float par3, float par4)
  {
      super.setLivingAnimations(par1EntityLiving, par2, par3, par4);
      //this.Head.rotationPointY = 4.0F + ((EntityTroodon)par1EntityLiving).func_70894_j(par4) * 9.0F;
      //this.field_78152_i = ((EntityTroodon)par1EntityLiving).func_70890_k(par4);
  }

  
  
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
   
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.LeftThigh.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.LeftFoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.LeftClaw.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.RightFoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.RightThigh.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.RightClaw.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  Head.rotateAngleY = f3 / 57.29578F;
	  Head.rotateAngleX = f4 / 57.29578F;
	 Crest.rotateAngleY = f3 / 57.29578F;
	 Crest.rotateAngleX = f4 / 57.29578F;
	 Snout.rotateAngleY = f3 / 57.29578F;
	 Snout.rotateAngleX = f4 / 57.29578F;
  }
}