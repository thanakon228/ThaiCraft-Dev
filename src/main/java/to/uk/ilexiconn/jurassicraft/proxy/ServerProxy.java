package to.uk.ilexiconn.jurassicraft.proxy;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

public class ServerProxy
{
    public void renderEntity(Class<? extends EntityLiving> entity, RenderLiving renderLiving)
    {

    }

    public void renderTileEntity(Class<? extends TileEntity> tileEntity, TileEntitySpecialRenderer renderer)
    {

    }

    public void renderItem(Item item, IItemRenderer render)
    {

    }
}
