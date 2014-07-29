package fisherman77.paleocraft.common.mobs;

import java.util.Random;

import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.world.World;


public class EntityBaryonyx extends EntityMob
{

public EntityBaryonyx(World par1World) 
 {
  super(par1World);
  
  this.setSize(this.width * 2.5F, this.height * 2.5F);
  
  this.tasks.addTask(0, new EntityAISwimming(this));
 
  this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.4D, false));
  this.tasks.addTask(2, new EntityAIWander(this, 0.4));
  this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
  this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true)); 
  this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
  }

	@Override
	protected void applyEntityAttributes() {
	    super.applyEntityAttributes();
	    
	    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8);
	    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20);
	    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10);
	}
 
	 /**
	  * Returns the sound this mob makes while it's alive.
	  */
	 protected String getLivingSound()
	 {
	     return "paleocraft:baryliving";
	 }
	
	 /**
	  * Returns the sound this mob makes when it is hurt.
	  */
	 protected String getHurtSound()
	 {
	     return "paleocraft:baryhurt";
	 }
	
	 /**
	  * Returns the sound this mob makes on death.
	  */
	 protected String getDeathSound()
	 {
	     return "paleocraft:baryhurt";
	 }
	 
	 public EnumCreatureAttribute getCreatureAttribute()
	    {
	        return EnumCreatureAttribute.UNDEAD;
	    }
	
	protected boolean isAIEnabled()
	{
	    return true;
	}
	
	protected boolean canDespawn()
	{
	return false;
	}
	
	protected void dropFewItems(boolean par1, int par2)
	{
	  this.dropItem(Items.fish, 3);
	}
}
