package mods.roborave.edm.helper.ore.generate;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class RetroGenerationManager implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateSurface(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}

	}

	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVeinSize, int maxVeinSize, int spawnChance) {
		for (int i = 0; i < spawnChance; i++) {
			int defaultChunkSize = 16;

			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);

			new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), blockSpawn).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) 
	{
		
	}

	private void generateSurface(Random random, int chunkX, int chunkZ, World world) 
	{
		addOre(mods.roborave.edm.init.Blocks.getBlock("Black_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 64, 5, 7, 20);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Blue_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 60, 5, 7, 18);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Gray_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 56, 5, 7, 16);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Green_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 54, 5, 7,14);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Orange_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 52, 5, 7,12);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Pink_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 50, 5, 7, 10);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Purple_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 48, 5, 7,8);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Red_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 46, 5, 7,6);
		addOre(mods.roborave.edm.init.Blocks.getBlock("White_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 44, 5, 7,4);
		addOre(mods.roborave.edm.init.Blocks.getBlock("Yellow_diamond_Ore"), Blocks.stone, random, world, chunkX, chunkZ, 15, 42, 5, 7,2);
	
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) 
	{
		
	}

}