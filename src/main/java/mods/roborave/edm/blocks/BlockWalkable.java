package mods.roborave.edm.blocks;

import mods.roborave.edm.EDM;
import mods.roborave.edm.lib.Strings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWalkable extends BlockRender {
	public static AxisAlignedBB b;

	
	@SuppressWarnings("static-access")
	public BlockWalkable(String name) {
		super(name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(name);
		EDM.Instance.log.info(name.toString().toLowerCase());
		//this.setBlockBounds(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    } 
	
	/**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return -1;
    }

	

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
	/* public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
	 {
	        return null;
	 }*/

	 @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister p_149651_1_)
	    {
	        this.blockIcon = p_149651_1_.registerIcon(Strings.MODID+":"+"blank");
	    }
}
