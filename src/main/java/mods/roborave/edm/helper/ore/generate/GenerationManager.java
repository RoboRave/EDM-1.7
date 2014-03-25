package mods.roborave.edm.helper.ore.generate;

import java.util.Random;

import org.apache.logging.log4j.Level;

import mods.roborave.edm.EDM;
import mods.roborave.edm.helper.LogHandler;
import mods.roborave.edm.helper.ore.GeneratorOre;
import mods.roborave.edm.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderHell;

import cpw.mods.fml.common.IWorldGenerator;

public class GenerationManager implements IWorldGenerator
{
    public static GenerationManager instance = new GenerationManager();

    @Override
    public void generate(Random r, int chunkX, int chunkZ, World w, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if (chunkGenerator instanceof ChunkProviderHell || chunkGenerator instanceof ChunkProviderEnd)
            return;

        if (w.provider.terrainType == WorldType.FLAT)
            return;

        if (w.provider.dimensionId == -1 || w.provider.dimensionId == 1)
            return;

        if (w.provider.dimensionId == 0)
            runOverworldGeneration(r, chunkX, chunkZ, w);

    }
    public static void runOverworldGeneration(Random r, int chunkX, int chunkZ, World w)
    {
    	 for (int i = 0; i < 2; i++)
         {
    		
             int xPos = chunkX + r.nextInt(16);
 			int yPos = 20 + r.nextInt(64 - 20);
 			int zPos = chunkZ + r.nextInt(16);
             new GeneratorOre(Blocks.getBlock("Black_diamond_Block"),0, 2).generate(w, r, xPos, yPos, zPos);
             //EDM.Instance.logger.log(Level.INFO, "generated ore at "+ xPos +" , "+yPos+" , "+zPos);
         }
    }
}