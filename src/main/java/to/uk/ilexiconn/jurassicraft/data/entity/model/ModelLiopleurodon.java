package to.uk.ilexiconn.jurassicraft.data.entity.model;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ModelLiopleurodon extends ModelBase
{
    ModelRenderer midbody;
    ModelRenderer neck;
    ModelRenderer tail;
    ModelRenderer tailmiddle;
    ModelRenderer lowerjawback;
    ModelRenderer tailtip;
    ModelRenderer upperbody;
    ModelRenderer lowerbody;
    ModelRenderer lowerjawfront;
    ModelRenderer lowerjawmid;
    ModelRenderer upperjawback;
    ModelRenderer upperjawmid;
    ModelRenderer upperjawfront;
    ModelRenderer upperleftfin;
    ModelRenderer upperrightfin;
    ModelRenderer lowerleftfin;
    ModelRenderer lowerrightfin;
    ModelRenderer teeth_top;
    ModelRenderer lowerbodytop;
    ModelRenderer midbodytop;
    ModelRenderer upperbodytop;
    ModelRenderer upperbody1;
    ModelRenderer midbodybottom;
    ModelRenderer lowerbodybottom;
    ModelRenderer neckbottom;
    ModelRenderer upperjawmid2;
    ModelRenderer lowerjawmid2;
    ModelRenderer teeth_bottom;

    public ModelLiopleurodon()
    {
        textureWidth = 512;
        textureHeight = 256;

        midbody = new ModelRenderer(this, 115, 102);
        midbody.addBox(2F, 0F, 0F, 24, 20, 32);
        midbody.setRotationPoint(-14F, 4F, 68F);
        midbody.setTextureSize(512, 256);
        midbody.mirror = true;
        setRotation(midbody, 0F, 0F, 0F);
        neck = new ModelRenderer(this, 130, 9);
        neck.addBox(0F, -1F, 0F, 14, 14, 25);
        neck.setRotationPoint(-7F, 6F, 17F);
        neck.setTextureSize(512, 256);
        neck.mirror = true;
        setRotation(neck, 0F, 0F, 0F);
        tail = new ModelRenderer(this, 0, 0);
        tail.addBox(-1F, -2F, 0F, 12, 16, 18);
        tail.setRotationPoint(-5F, 6F, 132F);
        tail.setTextureSize(512, 256);
        tail.mirror = true;
        setRotation(tail, 0F, 0F, 0F);
        tailmiddle = new ModelRenderer(this, 213, 19);
        tailmiddle.addBox(-1F, -3F, 0F, 8, 12, 25);
        tailmiddle.setRotationPoint(-3F, 8F, 148F);
        tailmiddle.setTextureSize(512, 256);
        tailmiddle.mirror = true;
        setRotation(tailmiddle, 0F, 0F, 0F);
        lowerjawback = new ModelRenderer(this, 15, 224);
        lowerjawback.addBox(-6F, 0F, 0F, 12, 5, 24);
        lowerjawback.setRotationPoint(0F, 16F, -5F);
        lowerjawback.setTextureSize(512, 256);
        lowerjawback.mirror = true;
        setRotation(lowerjawback, 0F, 0F, 0F);
        tailtip = new ModelRenderer(this, 60, 0);
        tailtip.addBox(-1F, -3F, 0F, 5, 10, 25);
        tailtip.setRotationPoint(-1.5F, 9F, 163F);
        tailtip.setTextureSize(512, 256);
        tailtip.mirror = true;
        setRotation(tailtip, 0F, 0F, 0F);
        upperbody = new ModelRenderer(this, 2, 115);
        upperbody.addBox(1F, 3F, 2F, 18, 19, 32);
        upperbody.setRotationPoint(-10F, 4F, 36F);
        upperbody.setTextureSize(512, 256);
        upperbody.mirror = true;
        setRotation(upperbody, 0F, 0F, 0F);
        lowerbody = new ModelRenderer(this, 0, 59);
        lowerbody.addBox(0F, 0F, 0F, 20, 19, 32);
        lowerbody.setRotationPoint(-10F, 4F, 100F);
        lowerbody.setTextureSize(512, 256);
        lowerbody.mirror = true;
        setRotation(lowerbody, 0F, 0F, 0F);
        lowerjawfront = new ModelRenderer(this, 7, 169);
        lowerjawfront.addBox(-4F, 0F, -12F, 8, 5, 12);
        lowerjawfront.setRotationPoint(0F, 16F, -24F);
        lowerjawfront.setTextureSize(512, 256);
        lowerjawfront.mirror = true;
        setRotation(lowerjawfront, 0F, 0F, 0F);
        lowerjawmid = new ModelRenderer(this, 7, 189);
        lowerjawmid.addBox(-5F, 0F, -12F, 10, 5, 12);
        lowerjawmid.setRotationPoint(0F, 16F, -14F);
        lowerjawmid.setTextureSize(512, 256);
        lowerjawmid.mirror = true;
        setRotation(lowerjawmid, 0F, 0F, 0F);
        upperjawback = new ModelRenderer(this, 168, 220);
        upperjawback.addBox(-6F, 0F, 0F, 12, 11, 24);
        upperjawback.setRotationPoint(0F, 4F, -5F);
        upperjawback.setTextureSize(512, 256);
        upperjawback.mirror = true;
        setRotation(upperjawback, 0.0015491F, 0F, 0F);
        upperjawmid = new ModelRenderer(this, 152, 181);
        upperjawmid.addBox(-5F, 0F, -12F, 10, 9, 12);
        upperjawmid.setRotationPoint(0F, 6F, -14F);
        upperjawmid.setTextureSize(512, 256);
        upperjawmid.mirror = true;
        setRotation(upperjawmid, 0.0015491F, 0F, 0F);
        upperjawfront = new ModelRenderer(this, 103, 164);
        upperjawfront.addBox(-4F, 0F, -12F, 8, 8, 12);
        upperjawfront.setRotationPoint(0F, 7F, -25F);
        upperjawfront.setTextureSize(512, 256);
        upperjawfront.mirror = true;
        setRotation(upperjawfront, 0.0015491F, 0F, 0F);
        upperleftfin = new ModelRenderer(this, 189, 174);
        upperleftfin.addBox(-4.5F, 0F, 0F, 10, 2, 43);
        upperleftfin.setRotationPoint(8.8F, 20F, 46F);
        upperleftfin.setTextureSize(512, 256);
        upperleftfin.mirror = true;
        setRotation(upperleftfin, 0F, 1F, 1F);
        upperleftfin.mirror = false;
        upperrightfin = new ModelRenderer(this, 189, 174);
        upperrightfin.addBox(-4.5F, 0F, 0F, 10, 2, 43);
        upperrightfin.setRotationPoint(-9F, 21F, 46F);
        upperrightfin.setTextureSize(512, 256);
        upperrightfin.mirror = true;
        setRotation(upperrightfin, 0F, -1F, -1F);
        lowerleftfin = new ModelRenderer(this, 189, 174);
        lowerleftfin.addBox(-5F, 0F, 0F, 10, 2, 43);
        lowerleftfin.setRotationPoint(8F, 21F, 110F);
        lowerleftfin.setTextureSize(512, 256);
        lowerleftfin.mirror = true;
        setRotation(lowerleftfin, 0F, 1F, 1F);
        lowerleftfin.mirror = false;
        lowerrightfin = new ModelRenderer(this, 189, 174);
        lowerrightfin.addBox(-5F, 0F, 0F, 10, 2, 43);
        lowerrightfin.setRotationPoint(-9F, 20F, 110F);
        lowerrightfin.setTextureSize(512, 256);
        lowerrightfin.mirror = true;
        setRotation(lowerrightfin, 0F, -1F, -1F);
        teeth_top = new ModelRenderer(this, 263, 175);
        teeth_top.addBox(1F, 5F, -32F, 10, 3, 26);
        teeth_top.setRotationPoint(-6F, 9F, -5F);
        teeth_top.setTextureSize(512, 256);
        teeth_top.mirror = true;
        setRotation(teeth_top, 0.0015491F, 0F, 0F);
        lowerbodytop = new ModelRenderer(this, 3, 60);
        lowerbodytop.addBox(-1F, -4F, 0F, 14, 19, 32);
        lowerbodytop.setRotationPoint(-6F, 4F, 100F);
        lowerbodytop.setTextureSize(512, 256);
        lowerbodytop.mirror = true;
        setRotation(lowerbodytop, -0.0918105F, 0F, 0F);
        midbodytop = new ModelRenderer(this, 117, 102);
        midbodytop.addBox(4F, -4F, 0F, 20, 20, 32);
        midbodytop.setRotationPoint(-14F, 4F, 68F);
        midbodytop.setTextureSize(512, 256);
        midbodytop.mirror = true;
        setRotation(midbodytop, 0F, 0F, 0F);
        upperbodytop = new ModelRenderer(this, 2, 115);
        upperbodytop.addBox(2F, 0F, 0F, 16, 19, 32);
        upperbodytop.setRotationPoint(-10F, 4F, 36F);
        upperbodytop.setTextureSize(512, 256);
        upperbodytop.mirror = true;
        setRotation(upperbodytop, 0.1115358F, 0F, 0F);
        upperbody1 = new ModelRenderer(this, 0, 115);
        upperbody1.addBox(0F, 0F, 0F, 20, 19, 32);
        upperbody1.setRotationPoint(-10F, 4F, 36F);
        upperbody1.setTextureSize(512, 256);
        upperbody1.mirror = true;
        setRotation(upperbody1, 0F, 0F, 0F);
        midbodybottom = new ModelRenderer(this, 119, 102);
        midbodybottom.addBox(4F, 2F, 0F, 20, 20, 32);
        midbodybottom.setRotationPoint(-14F, 4F, 68F);
        midbodybottom.setTextureSize(512, 256);
        midbodybottom.mirror = true;
        setRotation(midbodybottom, 0F, 0F, 0F);
        lowerbodybottom = new ModelRenderer(this, 2, 59);
        lowerbodybottom.addBox(1F, 3F, -4F, 18, 19, 32);
        lowerbodybottom.setRotationPoint(-10F, 4F, 100F);
        lowerbodybottom.setTextureSize(512, 256);
        lowerbodybottom.mirror = true;
        setRotation(lowerbodybottom, 0.1487144F, 0F, 0F);
        neckbottom = new ModelRenderer(this, 132, 9);
        neckbottom.addBox(1F, 5F, 4F, 12, 14, 25);
        neckbottom.setRotationPoint(-7F, 1F, 17F);
        neckbottom.setTextureSize(512, 256);
        neckbottom.mirror = true;
        setRotation(neckbottom, -0.2230717F, 0F, 0F);
        upperjawmid2 = new ModelRenderer(this, 152, 181);
        upperjawmid2.addBox(-5F, 0F, -11F, 10, 9, 12);
        upperjawmid2.setRotationPoint(0F, 6F, -5F);
        upperjawmid2.setTextureSize(512, 256);
        upperjawmid2.mirror = true;
        setRotation(upperjawmid2, 0.0015491F, 0F, 0F);
        lowerjawmid2 = new ModelRenderer(this, 7, 189);
        lowerjawmid2.addBox(-5F, 0F, -12F, 10, 5, 12);
        lowerjawmid2.setRotationPoint(0F, 16F, -5F);
        lowerjawmid2.setTextureSize(512, 256);
        lowerjawmid2.mirror = true;
        setRotation(lowerjawmid2, 0F, 0F, 0F);
        teeth_bottom = new ModelRenderer(this, 263, 175);
        teeth_bottom.addBox(-11.5F, 2F, -30F, 10, 3, 26);
        teeth_bottom.setRotationPoint(-6F, 19F, -5F);
        teeth_bottom.setTextureSize(512, 256);
        teeth_bottom.mirror = true;
        setRotation(teeth_bottom, -3.141593F, -3.141593F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        if (isChild)
        {
            float var8 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
            midbody.render(f5);
            neck.render(f5);
            tail.render(f5);
            tailmiddle.render(f5);
            lowerjawback.render(f5);
            tailtip.render(f5);
            upperbody.render(f5);
            lowerbody.render(f5);
            lowerjawfront.render(f5);
            lowerjawmid.render(f5);
            upperjawback.render(f5);
            upperjawmid.render(f5);
            upperjawfront.render(f5);
            upperleftfin.render(f5);
            upperrightfin.render(f5);
            lowerleftfin.render(f5);
            lowerrightfin.render(f5);
            teeth_top.render(f5);
            lowerbodytop.render(f5);
            midbodytop.render(f5);
            upperbodytop.render(f5);
            upperbody1.render(f5);
            midbodybottom.render(f5);
            lowerbodybottom.render(f5);
            neckbottom.render(f5);
            upperjawmid2.render(f5);
            lowerjawmid2.render(f5);
            teeth_bottom.render(f5);
            GL11.glPopMatrix();
        }
        else
        {
            midbody.render(f5);
            neck.render(f5);
            tail.render(f5);
            tailmiddle.render(f5);
            lowerjawback.render(f5);
            tailtip.render(f5);
            upperbody.render(f5);
            lowerbody.render(f5);
            lowerjawfront.render(f5);
            lowerjawmid.render(f5);
            upperjawback.render(f5);
            upperjawmid.render(f5);
            upperjawfront.render(f5);
            upperleftfin.render(f5);
            upperrightfin.render(f5);
            lowerleftfin.render(f5);
            lowerrightfin.render(f5);
            teeth_top.render(f5);
            lowerbodytop.render(f5);
            midbodytop.render(f5);
            upperbodytop.render(f5);
            upperbody1.render(f5);
            midbodybottom.render(f5);
            lowerbodybottom.render(f5);
            neckbottom.render(f5);
            upperjawmid2.render(f5);
            lowerjawmid2.render(f5);
            teeth_bottom.render(f5);
        }
    }

    public void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
