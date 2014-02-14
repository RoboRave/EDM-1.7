package mods.roborave.edm.blocks;

import javax.swing.Icon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.roborave.edm.EDM;
import mods.roborave.edm.client.DoubleRenderClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockFrozenDiamond extends BlockCore{

        public BlockFrozenDiamond(String name)
        {
        super(Material.ice, name );
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.slipperiness = 0.98F;
        
        }
        
        @Override
        public boolean renderAsNormalBlock()
    {
        return false;
    }
        
        @Override
        public int getRenderType()
    {
        return DoubleRenderClientProxy.frozenDiamondRenderType;
    }
        
        @Override
        public boolean isOpaqueCube()
    {
        return false;
    }
        
        @Override
        public int getRenderBlockPass()
    {
                return 1;
    }
        @SideOnly(Side.CLIENT)
        private IIcon[] icons;
       
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister par1IconRegister)
        {
              icons = new IIcon[4];
             
              for(int i = 0; i < icons.length; i++)
              {
                     icons[i] = par1IconRegister.registerIcon(EDM.Instance.lib.MODID + ":" + (this.getUnlocalizedName().substring(5)) + i);
              }
        }
        @SideOnly(Side.CLIENT)
        public IIcon getIcon(int par1, int par2)
        {
              switch(par2)
              {
                     case 0:
                            return icons[0];
                     case 1:
                     {
                            switch(par1)
                            {
                                   case 0:
                                         return icons[1];
                                   case 1:
                                         return icons[2];
                                   default:
                                         return icons[3];
                            }
                     }
                     default:
                     {
                            System.out.println("Invalid metadata for " + this.getUnlocalizedName());
                            return icons[0];
                     }
              }
        }
        
        @Override
        public boolean canRenderInPass(int pass)
    {
                //Set the static var in the client proxy
                DoubleRenderClientProxy.renderPass = pass;
                //the block can render in both passes, so return true always
        return true;
    }
        
}