package mods.roborave.edm.blocks;

import java.util.List;

import mods.roborave.edm.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSpecial extends BlockBreakable
{

	@SuppressWarnings("unused")
	private String name;

	public BlockSpecial(String name) {
		super(name, Material.rock, true, name);
		this.name = name;
	    /**
	     * Sets the bounds of the block.  minX, minY, minZ, maxX, maxY, maxZ
	     */
		this.setBlockBounds(0.0F, 0.0F,0.0F,1.0F,1.0F,1.0F);
	}
	 /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 0;
    }
    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
    		
    		blockIcon= par1IconRegister.registerIcon(Strings.MODID+":"+"wip");
    	
    	
    }

    @SideOnly(Side.CLIENT)
	@SuppressWarnings("unchecked")
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, @SuppressWarnings("rawtypes") List par3List ,boolean par4)
	{
		par3List.add("hi");
	}
}
