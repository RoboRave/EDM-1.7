package mods.roborave.edm.blocks;

import mods.roborave.edm.EDM;
import net.minecraft.block.material.Material;

public class BlockCompressed extends BlockCore
{
    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000268";

    public BlockCompressed(String name)
    {
        super(Material.iron, name);
        this.setCreativeTab(EDM.tabEDMBlock);
    }

   
}