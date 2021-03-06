package mods.roborave.edm.helper.ore.generate;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class EDMWorld {
	public static void init()
	{
		initialiseWorldGen();
	}

	public static void initialiseWorldGen()
	{
		try{
			registerWorldGen(new RetroGenerationManager(), 1);
		}
			catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProberblity)
	{
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberblity);
	}
}