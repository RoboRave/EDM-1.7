package mods.roborave.edm.blocks;

import java.util.ArrayList;

import mods.roborave.edm.helper.ore.OreDrops;
import mods.roborave.edm.helper.worldgen.OreConfig;
import mods.roborave.edm.init.Items;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockCore {
	private OreDrops drops;

	public BlockOre(OreConfig ore) {
		super (Material.rock, ore.name);
		this.drops = ore.drops;
		this.setCreativeTab(CreativeTabs.tabBlock);
		OreDictionary.registerOre(ore.name, this);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", ore.harvestLevel);
	}

	@Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
		ArrayList<ItemStack> rList = new ArrayList<ItemStack>();
		switch (this.drops)
		{
		case Black:
			rList.add(new ItemStack(Items.get("Item_Black_diamond"), this.fortuneHelper(world, 1, fortune)));
			break;
		case Blue:
			rList.add(new ItemStack(Items.get("Item_Blue_diamond"), this.fortuneHelper(world, 1 + world.rand.nextInt(4), fortune)));
			break;
		case Gold:
			rList.add(new ItemStack(Items.get("Item_Gold_diamond"), this.fortuneHelper(world, 2 + world.rand.nextInt(4), fortune)));
			break;
		case Gray: // cinnabar = 1 cinnabar & 1/4 redstone (gregstech)
			rList.add(new ItemStack(Items.get("Item_Gray_diamond"), this.fortuneHelper(world, 1, fortune)));
			if (world.rand.nextInt(4) == 0)
			{
				rList.add(new ItemStack(net.minecraft.init.Items.redstone, this.fortuneHelper(world, 1, fortune)));
			}
			break;
		case Green:
			rList.add(new ItemStack(Items.get("Item_Green_diamond"), this.fortuneHelper(world, 1, fortune)));
			break;
		default:
			rList.add(new ItemStack(this.getItemDropped(metadata, world.rand, fortune), 1));
		}
		return rList;
    }

	private int fortuneHelper(World world, int stackSize, int fortune) {
		switch (this.drops){
		case Black:
		case Gray:
		case Green:
		case Orange:
		case Pink:
		case Purple:
		case Red:
		case White:
		case Yellow:
			switch (fortune) {
			case 1:
				if (world.rand.nextInt(3) == 0)
					stackSize = stackSize * 2;
				break;
			case 2:
				switch (world.rand.nextInt(4)) {
				case 0:
					stackSize = stackSize * 2;
					break;
				case 1: 
					stackSize = stackSize * 3;
					break;
				}
				break;
			case 3:
				switch (world.rand.nextInt(5)) {
				case 0:
					stackSize = stackSize * 2;
					break;
				case 1:
					stackSize = stackSize * 3;
					break;
				case 2:
					stackSize = stackSize * 4;
					break;
				}
				break;
			}
			break;
		default:
		}
		return stackSize;
	}

}