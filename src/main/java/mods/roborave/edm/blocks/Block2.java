package mods.roborave.edm.blocks;

import java.util.List;

import mods.roborave.edm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block2 extends ItemBlock {
	
	
	public Block2(Block p_i45328_1_) {
		super(p_i45328_1_);
		this.setCreativeTab(CreativeTabs.tabBlock);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	@SuppressWarnings("unchecked")
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List ,boolean par4)
	{
		
		par3List.add(this.getIconString());
	}
}
