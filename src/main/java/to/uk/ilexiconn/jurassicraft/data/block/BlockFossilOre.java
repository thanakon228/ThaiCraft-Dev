package to.uk.ilexiconn.jurassicraft.data.block;

import to.uk.ilexiconn.jurassicraft.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class BlockFossilOre extends Block
{
    @SideOnly(Side.CLIENT)
    public IIcon icon_0;
    @SideOnly(Side.CLIENT)
    public IIcon icon_1;
    @SideOnly(Side.CLIENT)
    public IIcon icon_2;
    @SideOnly(Side.CLIENT)
    public IIcon icon_3;
    @SideOnly(Side.CLIENT)
    public IIcon icon_4;
    @SideOnly(Side.CLIENT)
    public IIcon icon_5;


    public BlockFossilOre()
    {
        super(Material.ground);
        setBlockName("fossil_ore");
        setBlockTextureName(Util.getModId() + "fossil_ore");
        setHardness(3.0F);
        setResistance(5.0F);
        setCreativeTab(Util.getCreativeTab(0));
        setStepSound(Block.soundTypeStone);
        setHarvestLevel("pickaxe", 0);
    }

    public Item getItemDropped(int value, Random random, int thing)
    {
        return Util.getItem(2);
    }

    public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int h)
    {
        if (!world.isRemote)
        {
            ItemStack equippedByPlayer = player.getCurrentEquippedItem();
            if (equippedByPlayer != null && equippedByPlayer.getItem() instanceof ItemPickaxe && Enum.valueOf(Item.ToolMaterial.class, ((ItemPickaxe) equippedByPlayer.getItem()).getToolMaterialName()).getHarvestLevel() >= 2)
                super.harvestBlock(world, player, x, y, z, h);
        }
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack)
    {
        world.setBlockMetadataWithNotify(x, y, z, new Random().nextInt(6), 2);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        icon_0 = iconRegister.registerIcon(Util.getModId() + "fossil_side_0");
        icon_1 = iconRegister.registerIcon(Util.getModId() + "fossil_side_1");
        icon_2 = iconRegister.registerIcon(Util.getModId() + "fossil_side_2");
        icon_3 = iconRegister.registerIcon(Util.getModId() + "fossil_side_3");
        icon_4 = iconRegister.registerIcon(Util.getModId() + "fossil_side_4");
        icon_5 = iconRegister.registerIcon(Util.getModId() + "fossil_side_5");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        switch (metadata)
        {
            case 0:
                return icon_0;
            case 1:
                return icon_1;
            case 2:
                return icon_2;
            case 3:
                return icon_3;
            case 4:
                return icon_4;
            case 5:
                return icon_5;
            default:
                return icon_0;
        }
    }
}
