// Date: 3/30/2013 10:37:05 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fisherman77.paleocraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCompsognathus extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Neck1;
    ModelRenderer Neck2;
    ModelRenderer Head;
    ModelRenderer Snout;
    ModelRenderer SnoutTip;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail5;
    ModelRenderer RightArm;
    ModelRenderer LeftArm;
    ModelRenderer RightThigh;
    ModelRenderer RightLeg;
    ModelRenderer RightFoot;
    ModelRenderer LeftThigh;
    ModelRenderer LeftLeg;
    ModelRenderer LeftFoot;
    ModelRenderer TailFan;
    ModelRenderer Crest;
  
  public ModelCompsognathus()
  {
    textureWidth = 100;
    textureHeight = 100;
    
      Body = new ModelRenderer(this, 56, 79);
      Body.addBox(0F, 0F, 0F, 6, 7, 14);
      Body.setRotationPoint(-2.5F, 6F, -8F);
      Body.setTextureSize(100, 100);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Neck1 = new ModelRenderer(this, 52, 75);
      Neck1.addBox(-2.5F, -3F, -5F, 4, 5, 5);
      Neck1.setRotationPoint(1F, 11F, -5F);
      Neck1.setTextureSize(100, 100);
      Neck1.mirror = true;
      setRotation(Neck1, -0.4712389F, 0F, 0F);
      Neck2 = new ModelRenderer(this, 43, 86);
      Neck2.addBox(-1.5F, -10F, -2F, 2, 10, 4);
      Neck2.setRotationPoint(1F, 9F, -8F);
      Neck2.setTextureSize(100, 100);
      Neck2.mirror = true;
      setRotation(Neck2, 0.837758F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 90);
      Head.addBox(-1.5F, -2F, -6F, 3, 4, 6);
      Head.setRotationPoint(0.5F, 2F, -14F);
      Head.setTextureSize(100, 100);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Snout = new ModelRenderer(this, 19, 92);
      Snout.addBox(-1F, -1F, -11F, 2, 3, 5);
      Snout.setRotationPoint(0.5F, 2F, -14F);
      Snout.setTextureSize(100, 100);
      Snout.mirror = true;
      setRotation(Snout, 0F, 0F, 0F);
      SnoutTip = new ModelRenderer(this, 35, 97);
      SnoutTip.addBox(-1F, 0F, -12F, 2, 2, 1);
      SnoutTip.setRotationPoint(0.5F, 2F, -14F);
      SnoutTip.setTextureSize(100, 100);
      SnoutTip.mirror = true;
      setRotation(SnoutTip, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 23, 51);
      Tail1.addBox(0F, 0F, 0F, 5, 6, 4);
      Tail1.setRotationPoint(-2F, 6F, 5F);
      Tail1.setTextureSize(100, 100);
      Tail1.mirror = true;
      setRotation(Tail1, 0.0872665F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 2, 51);
      Tail2.addBox(0F, 0F, 0F, 4, 5, 6);
      Tail2.setRotationPoint(-1.5F, 6F, 8F);
      Tail2.setTextureSize(100, 100);
      Tail2.mirror = true;
      setRotation(Tail2, 0.0872665F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 50, 43);
      Tail3.addBox(0F, 0F, 0F, 3, 4, 12);
      Tail3.setRotationPoint(-1F, 6F, 14F);
      Tail3.setTextureSize(100, 100);
      Tail3.mirror = true;
      setRotation(Tail3, 0.0349066F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 60, 1);
      Tail4.addBox(-2F, 0F, 0F, 2, 3, 15);
      Tail4.setRotationPoint(1.5F, 6F, 26F);
      Tail4.setTextureSize(100, 100);
      Tail4.mirror = true;
      setRotation(Tail4, 0F, 0F, 0F);
      Tail5 = new ModelRenderer(this, 38, 9);
      Tail5.addBox(0F, 0F, 0F, 1, 2, 17);
      Tail5.setRotationPoint(0F, 6F, 41F);
      Tail5.setTextureSize(100, 100);
      Tail5.mirror = true;
      setRotation(Tail5, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 83, 62);
      RightArm.addBox(-1F, 0F, -3F, 1, 12, 8);
      RightArm.setRotationPoint(-2.5F, 12F, -7F);
      RightArm.setTextureSize(100, 100);
      RightArm.mirror = true;
      setRotation(RightArm, 0.2443461F, -0.0698132F, 0.3316126F);
      LeftArm = new ModelRenderer(this, 1, 63);
      LeftArm.addBox(0F, 0F, -3F, 1, 12, 8);
      LeftArm.setRotationPoint(3.5F, 12F, -7F);
      LeftArm.setTextureSize(100, 100);
      LeftArm.mirror = true;
      setRotation(LeftArm, 0.2443461F, 0.0698132F, -0.3316126F);
      RightThigh = new ModelRenderer(this, 45, 60);
      RightThigh.addBox(-2F, -1F, -3F, 2, 8, 6);
      RightThigh.setRotationPoint(-1F, 9F, 3F);
      RightThigh.setTextureSize(100, 100);
      RightThigh.mirror = true;
      setRotation(RightThigh, 0F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 34, 85);
      RightLeg.addBox(0F, 6F, 2F, 2, 8, 2);
      RightLeg.setRotationPoint(2F, 9F, 3F);
      RightLeg.setTextureSize(100, 100);
      RightLeg.mirror = true;
      setRotation(RightLeg, 0F, 0F, 0F);
      RightFoot = new ModelRenderer(this, 33, 78);
      RightFoot.addBox(-2.5F, 14F, -1F, 3, 1, 5);
      RightFoot.setRotationPoint(-1F, 9F, 3F);
      RightFoot.setTextureSize(100, 100);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0F, 0F, 0F);
      LeftThigh = new ModelRenderer(this, 26, 63);
      LeftThigh.addBox(0F, -1F, -3F, 2, 8, 6);
      LeftThigh.setRotationPoint(2F, 9F, 3F);
      LeftThigh.setTextureSize(100, 100);
      LeftThigh.mirror = true;
      setRotation(LeftThigh, 0F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 34, 85);
      LeftLeg.addBox(-2F, 6F, 2F, 2, 8, 2);
      LeftLeg.setRotationPoint(-1F, 9F, 3F);
      LeftLeg.setTextureSize(100, 100);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 0F, 0F, 0F);
      LeftFoot = new ModelRenderer(this, 33, 78);
      LeftFoot.addBox(-0.5F, 14F, -1F, 3, 1, 5);
      LeftFoot.setRotationPoint(2F, 9F, 3F);
      LeftFoot.setTextureSize(100, 100);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0F, 0F, 0F);
      TailFan = new ModelRenderer(this, -36, 0);
      TailFan.addBox(0F, 0F, 0F, 9, 1, 36);
      TailFan.setRotationPoint(-4F, 7F, 29F);
      TailFan.setTextureSize(100, 100);
      TailFan.mirror = true;
      setRotation(TailFan, 0F, 0F, 0F);
      Crest = new ModelRenderer(this, 25, -7);
      Crest.addBox(0F, -5F, -6F, 0, 4, 7);
      Crest.setRotationPoint(0.5F, 2F, -14F);
      Crest.setTextureSize(100, 100);
      Crest.mirror = true;
      setRotation(Crest, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Neck1.render(f5);
    Neck2.render(f5);
    Head.render(f5);
    Snout.render(f5);
    SnoutTip.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Tail4.render(f5);
    Tail5.render(f5);
    RightArm.render(f5);
    LeftArm.render(f5);
    RightThigh.render(f5);
    RightLeg.render(f5);
    RightFoot.render(f5);
    LeftThigh.render(f5);
    LeftLeg.render(f5);
    LeftFoot.render(f5);
    TailFan.render(f5);
    Crest.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    //super.setRotationAngles(f, f1, f2, f3, f4, f5);
    this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.RightFoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.RightThigh.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	  this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.LeftFoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  this.LeftThigh.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
	  Head.rotateAngleY = f3 / 57.29578F;
	  Head.rotateAngleX = f4 / 57.29578F;
	  Snout.rotateAngleY = f3 / 57.29578F;
	  Snout.rotateAngleX = f4 / 57.29578F;
	  SnoutTip.rotateAngleY = f3 / 57.29578F;
	  SnoutTip.rotateAngleX = f4 / 57.29578F;
	  Crest.rotateAngleY = f3 / 57.29578F;
	  Crest.rotateAngleX = f4 / 57.29578F;
  }

}
