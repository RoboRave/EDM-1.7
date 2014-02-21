package mods.roborave.creativetabs;

import mods.roborave.edm.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MainTab extends CreativeTabs {

	public MainTab(String label) 
	{
		super(CreativeTabs.getNextID(),label);
	}
	  @SideOnly(Side.CLIENT)
	  public Item getTabIconItem()
	  {
	        return Item.getItemFromBlock(Blocks.getBlock("Black_diamond_Block"));
	  }
}
