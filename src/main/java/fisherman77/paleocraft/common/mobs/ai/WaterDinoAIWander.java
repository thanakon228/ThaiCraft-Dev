package fisherman77.paleocraft.common.mobs.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.Vec3;

public class WaterDinoAIWander extends EntityAIBase
{
    private EntityCreature entity;
    private double xPosition;
    private double yPosition;
    private double zPosition;
    private double speed;

    public WaterDinoAIWander(EntityCreature par1EntityCreature, double par2)
    {
        this.entity = par1EntityCreature;
        this.speed = par2;
        this.setMutexBits(1);
        par1EntityCreature.getNavigator().setCanSwim(true);

    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
    	if(entity.isInWater())
    	{
	        Vec3 vec3 = RandomPositionGenerator.findRandomTarget(this.entity, 30, 10);
	
	        if (vec3 == null)
	        {
	            return false;
	        }
	        else
	        {
	            this.xPosition = vec3.xCoord;
	            this.yPosition = vec3.yCoord;
	            this.zPosition = vec3.zCoord;
	            
	            if(this.yPosition > 63.0D)
	            {
	            	return true;
	            }
	            else
	            {
	            	return false;
	            }
	            
	        }
    	}
    	else
    	{
    		return false;
    	}
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return !this.entity.getNavigator().noPath();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
    		this.entity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, this.speed);
    }
}
