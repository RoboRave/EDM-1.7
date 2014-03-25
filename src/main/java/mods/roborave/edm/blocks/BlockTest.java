package mods.roborave.edm.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockTest extends BlockContainer {

	@SuppressWarnings("rawtypes")
	public Class TileEntityBlock;
	
	public BlockTest(String name,@SuppressWarnings("rawtypes") Class tclass) 
	{
		super(Material.rock);
		this.TileEntityBlock=tclass;
		this.setBlockName(name);
		
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) 
	{
		try
		{
			return (TileEntity) (TileEntityBlock).newInstance();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		
	}
	public int getRenderType()
	{
		return -1;
	}
	 /**
     * Is this block (a) opaque and (b) a full 1m cube?  
     * This determines whether or not to render the shared face of two adjacent blocks 
     * and also whether the player can attach torches, redstone wire, etc to this block.
     */
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
	@Override
	  public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
	  {
	  if (entity == null)
	  {
	  return;
	  }
	  mods.roborave.edm.blocks.tileentity.TileEntityBlock tile = (mods.roborave.edm.blocks.tileentity.TileEntityBlock) world.getTileEntity(x, y, z);
	  tile.direction = MathHelper.floor_double((double)(entity.rotationYaw * 4F / 360.0F) + 2.5D) & 3;
	  }
	
}
