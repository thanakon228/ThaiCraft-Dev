package to.uk.ilexiconn.jurassicraft.data.entity;

import to.uk.ilexiconn.jurassicraft.Util;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import thehippomaster.AnimationAPI.IAnimatedEntity;

public abstract class EntityDinosaurMonster extends EntityMob implements IAnimatedEntity
{
    public int animID;
    public int animTick;
    public int dinoID;
    
    public int frame;

    public EntityDinosaurMonster(World world, int id)
    {
        super(world);
        dinoID = id;
        setSize(Util.getDinos().get(dinoID).hitboxSizeXZ, Util.getDinos().get(dinoID).hitboxSizeY);
        getNavigator().setAvoidsWater(true);
    }

    public boolean isAIEnabled()
    {
        return true;
    }

    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(Util.getDinos().get(dinoID).dinoHealth * 2);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(Util.getDinos().get(dinoID).dinoSpeed);
        //getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(Util.getDinos().get(dinoID).dinoStrenght);
    }
    
    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
        float f = (float)this.getAttackStrength(this);
        int i = 0;

        if (p_70652_1_ instanceof EntityLivingBase)
        {
            f += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLivingBase)p_70652_1_);
            i += EnchantmentHelper.getKnockbackModifier(this, (EntityLivingBase)p_70652_1_);
        }

        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), f);

        if (flag)
        {
            if (i > 0)
            {
                p_70652_1_.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)i * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)i * 0.5F));
                this.motionX *= 0.6D;
                this.motionZ *= 0.6D;
            }

            int j = EnchantmentHelper.getFireAspectModifier(this);

            if (j > 0)
            {
                p_70652_1_.setFire(j * 4);
            }

            if (p_70652_1_ instanceof EntityLivingBase)
            {
                EnchantmentHelper.func_151384_a((EntityLivingBase)p_70652_1_, this);
            }

            EnchantmentHelper.func_151385_b(this, p_70652_1_);
        }

        return flag;
    }

    /**
    * Returns the amount of damage a mob should deal.
    */
   public int getAttackStrength(Entity par1Entity)
   {
       return (int)Util.getDinos().get(dinoID).dinoStrenght;
   }
    
    public String getLivingSound()
    {
        int I = rand.nextInt(1)+1;
        if(I == 1)
        {
            return Util.getDinos().get(dinoID).livingSound1;
        }
        else
        {
            return Util.getDinos().get(dinoID).livingSound2;
        }
    }

    public String getHurtSound()
    {
        return Util.getDinos().get(dinoID).hurtSound;
    }

    public String getDeathSound()
    {
        return Util.getDinos().get(dinoID).deathSound;
    }

    public float getSoundVolume()
    {
        return 0.4F;
    }

    public boolean canDespawn()
    {
        return false;
    }
    
    public int getAnimTick()
    {
        return animTick;
    }

    public int getAnimID()
    {
        return animID;
    }

    public void setAnimID(int id)
    {
        animID = id;
    }

    public void setAnimTick(int tick)
    {
        animTick = tick;
    }

    public Item getDropItem()
    {
        return Util.getMeat(dinoID);
    }

    public void onUpdate()
    {
        super.onUpdate();
        if(animID != 0) animTick++;
        frame++;
    }
}
