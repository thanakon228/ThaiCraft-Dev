package to.uk.ilexiconn.jurassicraft.data.block;

import to.uk.ilexiconn.jurassicraft.Util;
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

public class BlockFossilSandstoneOre extends Block
{
    protected IIcon[] topIcons = new IIcon[6];
    protected IIcon[] normalIcons = new IIcon[6];
    protected IIcon[] bottomIcons = new IIcon[6];

    public BlockFossilSandstoneOre()
    {
        super(Material.ground);
        setBlockName("fossil_sandstone_ore");
        setBlockTextureName(Util.getModId() + "fossil_sandstone_ore");
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

    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        for (int i = 0; i < 6; ++i)
            topIcons[i] = register.registerIcon(Util.getModId() + "fossil_side_" + i + "_sandstone_top");

        for (int i = 0; i < 6; ++i)
            normalIcons[i] = register.registerIcon(Util.getModId() + "fossil_side_" + i + "_sandstone_normal");

        for (int i = 0; i < 6; ++i)
            bottomIcons[i] = register.registerIcon(Util.getModId() + "fossil_side_" + i + "_sandstone_bottom");
    }

    @Override
    public IIcon getIcon(int side, int metadata)
    {
        if (metadata > 5)
            return topIcons[0];

        switch (side)
        {
            case 0: return bottomIcons[metadata];
            case 1: return topIcons[metadata];
            default:return normalIcons[metadata];
        }
    }
}
