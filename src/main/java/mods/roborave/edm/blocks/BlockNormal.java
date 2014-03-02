package mods.roborave.edm.blocks;

import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNormal extends Block {

	private String name;
	
	public BlockNormal(String name) 
	{
		super(Material.rock);
		this.name=name;
		Blocks.blockList.put(name, this);
		GameRegistry.registerBlock(this, name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(name);
		this.setBlockTextureName(Strings.MODID()+":"+name);
		
	}
	 @SideOnly(Side.CLIENT)
	    public String getItemIconName()
	    {
	        return Strings.MODID+":"+this.name;
	    }
	

}
