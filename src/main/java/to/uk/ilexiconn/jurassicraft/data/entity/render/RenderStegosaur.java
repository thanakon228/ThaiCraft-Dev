package to.uk.ilexiconn.jurassicraft.data.entity.render;

import to.uk.ilexiconn.jurassicraft.JurassiCraft;
import to.uk.ilexiconn.jurassicraft.data.entity.Dinosaur;
import to.uk.ilexiconn.jurassicraft.data.entity.RenderDinosaur;
import to.uk.ilexiconn.jurassicraft.data.entity.entity.EntityStegosaur;
import to.uk.ilexiconn.jurassicraft.data.entity.model.ModelStegosaur;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderStegosaur extends RenderDinosaur
{
    public RenderStegosaur(Dinosaur dino)
    {
        super(new ModelStegosaur(), dino, 1f);
    }

    public ResourceLocation getEntityTexture(Entity var1)
    {
    	EntityStegosaur ank = (EntityStegosaur)var1;
    	switch(ank.texid)
    	{
    	case 1:
    		default:
        return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/stegosaur1.png");
    	case 0:
        return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/stegosaur2.png");
    	}
    }
}
