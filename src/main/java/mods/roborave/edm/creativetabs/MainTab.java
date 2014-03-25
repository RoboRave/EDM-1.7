package mods.roborave.edm.creativetabs;

import mods.roborave.edm.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MainTab extends CreativeTabs {

	private String block;
	public MainTab(String label, String par1Block) 
	{
		super(CreativeTabs.getNextID(),label);
		this.block = par1Block;
	}
	  @SideOnly(Side.CLIENT)
	  public Item getTabIconItem()
	  {
	        return Item.getItemFromBlock(Blocks.getBlock(this.block));
	  }
}
