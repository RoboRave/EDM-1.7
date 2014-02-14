package mods.roborave.edm.init;

import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;

import mods.roborave.edm.EDM;
import mods.roborave.edm.blocks.Block2;
import mods.roborave.edm.blocks.BlockCore;
import mods.roborave.edm.blocks.BlockExtended;
import mods.roborave.edm.blocks.BlockFrozenDiamond;
import mods.roborave.edm.blocks.BlockSpecial;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks 
{

	private static boolean isInitialized = false;
	@SuppressWarnings("rawtypes")
	public static HashMap blockList = new HashMap();

	public static Block BlockFrozenDiamond= (Block) Blocks.blockList.get("wip");
	@SuppressWarnings("static-access")
	public static void init() 
	{
		if (isInitialized) 
		{
			EDM.log.info("Block initialization failed, already initialized");
			return;
		}
		
		EDM.log.info("Initializing Blocks");
		new BlockFrozenDiamond("wip").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock, "Black_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"Blue_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock, "Gold_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"Gray_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"Green_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"Orange_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"Pink_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"Purple_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"Red_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"White_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCore(Material.rock,"Yellow_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		
		isInitialized = true;
	}

	public static Block getBlock(String blockName) 
	{
		try 
		{
			return (Block) blockList.get(blockName);
		} 
		catch (Throwable e)
		{
			return null;
		}
	}

}