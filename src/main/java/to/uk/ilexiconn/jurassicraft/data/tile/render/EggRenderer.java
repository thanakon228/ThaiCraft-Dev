package to.uk.ilexiconn.jurassicraft.data.tile.render;

import to.uk.ilexiconn.jurassicraft.Util;
import to.uk.ilexiconn.jurassicraft.data.block.model.ModelEgg;
import to.uk.ilexiconn.jurassicraft.data.tile.TileEgg;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class EggRenderer extends TileEntitySpecialRenderer
{
    public ModelEgg model = new ModelEgg();
    public ResourceLocation texture;
    private float scale = 1.2f, translation = 1.8f;

    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float h)
    {
        TileEgg egg = (TileEgg) tileEntity;
        GL11.glPushMatrix();

        GL11.glTranslatef((float) x + 0.5f, (float) y + translation, (float) z + 0.5f);
        GL11.glScalef(scale, scale, scale);

        texture = new ResourceLocation(Util.getModId() + "textures/eggs/egg" + egg.getDinoName() + ".png");
        bindTexture(texture);
        GL11.glRotatef(180f, 0f, 0f, 1f);
        model.render();
        GL11.glPopMatrix();
    }

    public EggRenderer setScale(float scale, float translation)
    {
        this.scale = scale;
        this.translation = translation;
        return this;
    }
}
