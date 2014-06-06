package mods.roborave.edm.init;

import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.blocks.BlockCompressed;
import mods.roborave.edm.blocks.BlockOre;
import mods.roborave.edm.helper.ore.Ores;
import mods.roborave.edm.helper.worldgen.OreConfig;
import net.minecraft.block.Block;

import org.apache.logging.log4j.Level;

public class Blocks 
{

	private static boolean isInitialized = false;
	
	/**Testing 
	 * default: public HashMap blockList = new HashMap();
	 */
	public static HashMap<String,Block> blockList = new HashMap<String, Block>();

	public Blocks instance;

	public static Blocks blocks;
	
	public static void init() 
	{
		if (isInitialized) 
		{
			EDM.Instance.getLogger().info("Block initialization failed, already initialized");
			
		}else{
		
		EDM.Instance.getLogger().log(Level.INFO,"Initializing Blocks");
		
		for (Ores ore : Ores.values()) {
			OreConfig oreConfig = ore.getDefaultConfig();
				new BlockOre(oreConfig);
		}
		
		for (Ores ore : Ores.values()) 
		{
				new BlockCompressed(ore+"_diamond_Block");
		}

		isInitialized = true;
		}
	}
	
	public static Block getBlock(String blockName) 
	{
		try 
		{
			return (Block) Blocks.blockList.get(blockName);
		} 
		catch (Throwable e)
		{
			return null;
		}
	}

}