package mods.roborave.edm.blocks;

import mods.roborave.edm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRender extends BlockCore{

	public BlockRender(String name) {
		super(Material.rock, name);
		this.setBlockTextureName(Strings.MODID+":"+"diamond_sword");
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
        this.setTickRandomly(true);
		this.func_150089_b(0);
	}
	public boolean isOpaqueCube()
	{
		return false;
	}
	 /**
     * If this block doesn't render as an ordinary block it will return False 
     * (examples: signs, buttons, stairs, etc)
     */
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
        return p_149646_5_ == 1 ? true : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
    }

	 /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        byte b0 = 0;
        float f = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB((double)p_149668_2_ + this.minX, (double)p_149668_3_ + this.minY, (double)p_149668_4_ + this.minZ, (double)p_149668_2_ + this.maxX, (double)((float)p_149668_3_ + (float)b0 * f), (double)p_149668_4_ + this.maxZ);
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        this.func_150089_b(0);
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
    {
        this.func_150089_b(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));
    }

    protected void func_150089_b(int p_150089_1_)
    {
        byte b0 = (byte)p_150089_1_;
        float f = (float)(1 * (1 + b0)) / 16.0F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
    }
}
