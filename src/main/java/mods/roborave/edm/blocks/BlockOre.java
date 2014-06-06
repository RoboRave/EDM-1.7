package mods.roborave.edm.blocks;

import mods.roborave.edm.EDM;
import mods.roborave.edm.helper.worldgen.OreConfig;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockCore 
{
	
	public BlockOre(OreConfig ore) 
	{
		super (Material.rock, ore.name);
		this.setCreativeTab(EDM.tabEDMBlock);
		OreDictionary.registerOre(ore.name, this);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", ore.harvestLevel);
	}
}