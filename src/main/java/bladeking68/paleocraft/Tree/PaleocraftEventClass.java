package bladeking68.paleocraft.Tree;

import java.awt.Event;
import java.util.ArrayList;
import java.util.Random;

import bladeking68.paleocraft.BlocksItems.Blocktree1sapling;
import bladeking68.paleocraft.BlocksItems.Blocktree2sapling;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
public class PaleocraftEventClass
{
private int BlockID;
/** Used to make the sapling grow the tree **/
@ForgeSubscribe
public void bonemealUsed(BonemealEvent event)
{
if(event.world.getBlockId(event.X, event.Y, event.Z) == fisherman77.paleocraft.common.Paleocraft.treesapling1.blockID)
	//if(event.world.getBlockId(event.X, event.Y, event.Z) == fisherman77.paleocraft.common.Paleocraft.treesapling2.blockID)
{
((Blocktree1sapling)fisherman77.paleocraft.common.Paleocraft.treesapling1).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
//((Blocktree2sapling)fisherman77.paleocraft.common.Paleocraft.treesapling2).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
}
}


}
