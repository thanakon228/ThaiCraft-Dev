package to.uk.ilexiconn.jurassicraft.data.entity.render;

import to.uk.ilexiconn.jurassicraft.JurassiCraft;
import to.uk.ilexiconn.jurassicraft.data.entity.Dinosaur;
import to.uk.ilexiconn.jurassicraft.data.entity.RenderDinosaur;
import to.uk.ilexiconn.jurassicraft.data.entity.entity.EntityHerrerasaur;
import to.uk.ilexiconn.jurassicraft.data.entity.model.ModelHerrerasaur;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderHerrerasaur extends RenderDinosaur
{
    public RenderHerrerasaur(Dinosaur dino)
    {
        super(new ModelHerrerasaur(), dino, 1f);
    }

    public ResourceLocation getEntityTexture(Entity var1)
    {
    	EntityHerrerasaur ank = (EntityHerrerasaur)var1;
    	switch(ank.texid)
    	{
    	case 1:
    		default:
        return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/herrerasaur1.png");
    	case 0:
        return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/herrerasaur2.png");
    	}
    }
}
