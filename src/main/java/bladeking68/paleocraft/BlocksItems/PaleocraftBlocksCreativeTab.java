package bladeking68.paleocraft.BlocksItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;

public class PaleocraftBlocksCreativeTab extends CreativeTabs {
public PaleocraftBlocksCreativeTab(int position, String tabID) {
super(position, tabID); //The constructor for your tab
}
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex() //The item it displays for your tab
{
return fisherman77.paleocraft.common.Paleocraft.fossil.itemID; 
}
public String getTranslatedTabLabel()
{
return "Paleocraft"; //The name of the tab ingame
}
}
