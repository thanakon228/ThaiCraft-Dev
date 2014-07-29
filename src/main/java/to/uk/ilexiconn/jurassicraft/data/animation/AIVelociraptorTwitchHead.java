package to.uk.ilexiconn.jurassicraft.data.animation;

import to.uk.ilexiconn.jurassicraft.data.entity.entity.EntityVelociraptor;

import net.minecraft.entity.EntityLiving;
import thehippomaster.AnimationAPI.AIAnimation;
import thehippomaster.AnimationAPI.IAnimatedEntity;

public class AIVelociraptorTwitchHead extends AIAnimation {
	private EntityVelociraptor raptor;
	public AIVelociraptorTwitchHead(IAnimatedEntity animraptor) {
		super(animraptor);
		this.raptor = (EntityVelociraptor) animraptor;
	}
	
	public int getAnimID() {
		return 1;
	}
	
	public boolean isAutomatic() {
		return false;
	}
	
	public int getDuration() {
		return 30;
	}
	
	public boolean shouldAnimate() {
		EntityLiving living = getEntity();
		IAnimatedEntity entity = (IAnimatedEntity)living;
		return entity.getAnimID() == 0 && living.getRNG().nextInt(45) == 0;
	}
}
