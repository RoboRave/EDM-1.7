package mods.roborave.edm.init;

import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.blocks.BlockCompressed;
import mods.roborave.edm.blocks.BlockExtended;
import mods.roborave.edm.blocks.BlockWalkable;
import net.minecraft.block.Block;

public class Blocks 
{

	private static boolean isInitialized = false;
	@SuppressWarnings("rawtypes")
	public static HashMap blockList = new HashMap();

	public static void init() 
	{
		if (isInitialized) 
		{
			EDM.log.info("Block initialization failed, already initialized");
			return;
		}
		
		EDM.log.info("Initializing Blocks");
		new BlockCompressed("Black_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Blue_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Gold_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Gray_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Green_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Orange_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Pink_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Purple_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Red_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("White_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockCompressed("Yellow_diamond_Block").setHardness(2.0F).setResistance(5.0F);
		new BlockExtended("wip");
		new BlockWalkable("wip1").setBlockUnbreakable();
		isInitialized = true;
	}

	public static void TestBlocks()
	{
		
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