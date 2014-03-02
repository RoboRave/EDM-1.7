package mods.roborave.edm.helper.ore.generate;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	private String blockname;
	private int firstBlockXCoord;
	private int firstBlockYCoord;
	private int firstBlockZCoord;
	private int intX;
	private int intZ;
	private int intY;
	public void gererateBlock(String block, int x, int y, int z, int iX, int iY, int iZ)
	{
    	
		this.blockname=block;
		this.firstBlockXCoord=x;
		this.firstBlockYCoord=y;
		this.firstBlockZCoord=z;
		this.intX=iX;
		this.intY=iY;
		this.intZ=iZ;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {}

	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for(int k = 0; k < 10; k++){
        	int firstBlockXCoord1 = firstBlockXCoord; 
        		firstBlockXCoord1 = chunkX + rand.nextInt(this.intX);
        		
        	int firstBlockYCoord1= firstBlockYCoord; 
        		firstBlockYCoord1 = rand.nextInt(this.intY);
        		
        	int firstBlockZCoord1 = firstBlockZCoord;
        		firstBlockZCoord1 = chunkZ + rand.nextInt(this.intZ);
        	
        	(new WorldGenMinable(net.minecraft.block.Block.getBlockFromName(this.blockname), 7)).generate(world, rand, firstBlockXCoord1, firstBlockYCoord1, firstBlockZCoord1);
        	
        	
        }
	}

	private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
}