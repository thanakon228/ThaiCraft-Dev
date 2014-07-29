package to.uk.ilexiconn.jurassicraft.data.animation;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import thehippomaster.AnimationAPI.AIAnimation;

import to.uk.ilexiconn.jurassicraft.data.entity.entity.EntityVelociraptor;

public class AIVelociraptorLeap extends AIAnimation {
private EntityVelociraptor entityRaptor;
private EntityLivingBase attackTarget;
	
	public AIVelociraptorLeap(EntityVelociraptor raptor) {
		super(raptor);
		entityRaptor = raptor;
	}
	
	public int getAnimID() {
		return 3;
	}
	
	public boolean isAutomatic() {
		return true;
	}
	
	public int getDuration() {
		return 20;
	}
	
	public void startExecuting() {
		super.startExecuting();
		attackTarget = entityRaptor.getAttackTarget();
	}
	
	public void updateTask() {
		if(entityRaptor.getAnimTick() < 12)
			entityRaptor.getLookHelper().setLookPositionWithEntity(attackTarget, 30F, 30F);
		if(entityRaptor.getAnimTick() == 12) {
            double d0 = attackTarget.posX - entityRaptor.posX;
            double d1 = attackTarget.posZ - entityRaptor.posZ;
            float f2 = MathHelper.sqrt_double(d0 * d0 + d1 * d1);
            entityRaptor.motionX = 1.6*(d0 / (double)f2 * 0.5D * 0.800000011920929D + entityRaptor.motionX * 0.20000000298023224D);
            entityRaptor.motionZ = 1.6*(d1 / (double)f2 * 0.5D * 0.800000011920929D + entityRaptor.motionZ * 0.20000000298023224D);
            entityRaptor.motionY = 0.6D;
		}
         if(entityRaptor.getAnimTick() == 19) {
    		entityRaptor.timeSinceLeap = 150;
		}
	}
}