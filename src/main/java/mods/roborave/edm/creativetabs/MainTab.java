package mods.roborave.edm.creativetabs;

import mods.roborave.edm.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MainTab extends CreativeTabs {

	private String block;
	public MainTab(String label, String par1Block) 
	{
		super(CreativeTabs.getNextID(),label);
		this.block = par1Block;
		
	}
	 
	  @Override
		public ItemStack getIconItemStack()
		{
			
			return new ItemStack(Blocks.getBlock(this.block));
		}
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
