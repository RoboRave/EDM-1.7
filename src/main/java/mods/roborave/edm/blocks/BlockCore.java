package mods.roborave.edm.blocks;

import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockCore extends net.minecraft.block.Block {
	@SuppressWarnings("unchecked")
	public BlockCore(Material material, String blockName) {
		super(material);
		this.setBlockName(blockName); // name
		this.setBlockTextureName(Strings.MODID +":" + blockName); // texture
		this.setCreativeTab(CreativeTabs.tabBlock);
		Blocks.blockList.put(blockName, this);
		GameRegistry.registerBlock(this, blockName);
	}
	

}
