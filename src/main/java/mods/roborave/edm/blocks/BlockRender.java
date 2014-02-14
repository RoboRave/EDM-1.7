package mods.roborave.edm.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRender extends Block {

	protected BlockRender(String name) {
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		// TODO Auto-generated constructor stub
	}

}
