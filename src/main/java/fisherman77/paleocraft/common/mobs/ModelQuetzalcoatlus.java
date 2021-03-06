// Date: 10/26/2013 10:53:05 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fisherman77.paleocraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelQuetzalcoatlus extends ModelBase
{
  //fields
    ModelRenderer UpperBody;
    ModelRenderer LowerBody;
    ModelRenderer Neck1;
    ModelRenderer Neck2;
    ModelRenderer Head;
    ModelRenderer Crest;
    ModelRenderer BeakBase;
    ModelRenderer BeakTip;
    ModelRenderer RightWing;
    ModelRenderer LeftWing;
    ModelRenderer RightThigh;
    ModelRenderer RightLeg;
    ModelRenderer LeftThigh;
    ModelRenderer LeftLeg;
    ModelRenderer Tail;
    ModelRenderer TailTip;
  
  public ModelQuetzalcoatlus()
  {
    textureWidth = 150;
    textureHeight = 150;
    
      UpperBody = new ModelRenderer(this, 79, 81);
      UpperBody.addBox(-4F, -2F, 0F, 8, 8, 11);
      UpperBody.setRotationPoint(0F, 18F, -7F);
      UpperBody.setTextureSize(150, 150);
      UpperBody.mirror = true;
      setRotation(UpperBody, 0F, 0F, 0F);
      LowerBody = new ModelRenderer(this, 82, 64);
      LowerBody.addBox(-2F, -2F, 0F, 8, 7, 7);
      LowerBody.setRotationPoint(-2F, 18F, 4F);
      LowerBody.setTextureSize(150, 150);
      LowerBody.mirror = true;
      setRotation(LowerBody, 0F, 0F, 0F);
      Neck1 = new ModelRenderer(this, 5, 85);
      Neck1.addBox(-2F, -2F, -6F, 4, 6, 5);
      Neck1.setRotationPoint(0F, 16F, -11F);
      Neck1.setTextureSize(150, 150);
      Neck1.mirror = true;
      setRotation(Neck1, 1.570796F, 0F, 0F);
      Neck2 = new ModelRenderer(this, 27, 79);
      Neck2.addBox(-1F, -2F, -8F, 2, 15, 4);
      Neck2.setRotationPoint(0F, 13F, -26F);
      Neck2.setTextureSize(150, 150);
      Neck2.mirror = true;
      setRotation(Neck2, 1.570796F, 0F, 0F);
      Head = new ModelRenderer(this, 12, 100);
      Head.addBox(-1.5F, -3F, -11F, 3, 6, 11);
      Head.setRotationPoint(0F, 19F, -28F);
      Head.setTextureSize(150, 150);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Crest = new ModelRenderer(this, 41, 80);
      Crest.addBox(0F, -8F, -11F, 0, 5, 13);
      Crest.setRotationPoint(0F, 19F, -28F);
      Crest.setTextureSize(150, 150);
      Crest.mirror = true;
      setRotation(Crest, 0F, 0F, 0F);
      BeakBase = new ModelRenderer(this, 41, 101);
      BeakBase.addBox(-1F, -2F, -21F, 2, 5, 10);
      BeakBase.setRotationPoint(0F, 19F, -28F);
      BeakBase.setTextureSize(150, 150);
      BeakBase.mirror = true;
      setRotation(BeakBase, 0F, 0F, 0F);
      BeakTip = new ModelRenderer(this, 78, 103);
      BeakTip.addBox(-1F, -1F, -30F, 2, 4, 9);
      BeakTip.setRotationPoint(0F, 19F, -28F);
      BeakTip.setTextureSize(150, 150);
      BeakTip.mirror = true;
      setRotation(BeakTip, 0F, 0F, 0F);
      RightWing = new ModelRenderer(this, 80, -35);
      RightWing.addBox(-1F, 0F, 0F, 1, 56, 35);
      RightWing.setRotationPoint(-4F, 19F, -7F);
      RightWing.setTextureSize(150, 150);
      RightWing.mirror = true;
      setRotation(RightWing, 0F, 0F, 1.570796F);
      LeftWing = new ModelRenderer(this, 81, -35);
      LeftWing.addBox(0F, 0F, 0F, 1, 56, 35);
      LeftWing.setRotationPoint(4F, 18F, -8F);
      LeftWing.setTextureSize(150, 150);
      LeftWing.mirror = true;
      setRotation(LeftWing, 0F, 0F, -1.570796F);
      RightThigh = new ModelRenderer(this, 43, 62);
      RightThigh.addBox(-1F, 0F, -2F, 2, 10, 4);
      RightThigh.setRotationPoint(-4F, 19F, 8F);
      RightThigh.setTextureSize(150, 150);
      RightThigh.mirror = true;
      setRotation(RightThigh, 1.570796F, 0F, 0F);
      RightLeg = new ModelRenderer(this, 60, 73);
      RightLeg.addBox(-1F, 10F, -1F, 2, 14, 2);
      RightLeg.setRotationPoint(-4F, 18F, 8F);
      RightLeg.setTextureSize(150, 150);
      RightLeg.mirror = true;
      setRotation(RightLeg, 1.570796F, 0F, 0F);
      LeftThigh = new ModelRenderer(this, 43, 62);
      LeftThigh.addBox(-1F, 0F, -2F, 2, 10, 4);
      LeftThigh.setRotationPoint(4F, 19F, 8F);
      LeftThigh.setTextureSize(150, 150);
      LeftThigh.mirror = true;
      setRotation(LeftThigh, 1.570796F, 0F, 0F);
      LeftLeg = new ModelRenderer(this, 60, 73);
      LeftLeg.addBox(-1F, 10F, -1F, 2, 14, 2);
      LeftLeg.setRotationPoint(4F, 18F, 8F);
      LeftLeg.setTextureSize(150, 150);
      LeftLeg.mirror = true;
      setRotation(LeftLeg, 1.570796F, 0.0174533F, 0F);
      Tail = new ModelRenderer(this, 7, 87);
      Tail.addBox(0F, -2F, 0F, 3, 2, 5);
      Tail.setRotationPoint(-1.5F, 18F, 11F);
      Tail.setTextureSize(150, 150);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      TailTip = new ModelRenderer(this, 9, 89);
      TailTip.addBox(0F, -3F, 4F, 2, 2, 3);
      TailTip.setRotationPoint(-1F, 19F, 12F);
      TailTip.setTextureSize(150, 150);
      TailTip.mirror = true;
      setRotation(TailTip, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    UpperBody.render(f5);
    LowerBody.render(f5);
    Neck1.render(f5);
    Neck2.render(f5);
    Head.render(f5);
    Crest.render(f5);
    BeakBase.render(f5);
    BeakTip.render(f5);
    RightWing.render(f5);
    LeftWing.render(f5);
    RightThigh.render(f5);
    RightLeg.render(f5);
    LeftThigh.render(f5);
    LeftLeg.render(f5);
    Tail.render(f5);
    TailTip.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  this.LeftWing.rotateAngleZ = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.RightWing.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		Head.rotateAngleY = f3 / 57.29578F;
		  Head.rotateAngleX = f4 / 57.29578F;
  }

}
