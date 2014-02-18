package mods.roborave.edm.items;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ItemSpadeMain extends ItemToolMain
{
    @SuppressWarnings("rawtypes")
	private static final Set field_150916_c = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000063";

    public ItemSpadeMain(Item.ToolMaterial p_i45353_1_, String itemname)
    {
        super(1.0F, p_i45353_1_, field_150916_c, itemname);
    }

    public boolean func_150897_b(Block p_150897_1_)
    {
        return p_150897_1_ == Blocks.snow_layer ? true : p_150897_1_ == Blocks.snow;
    }
}