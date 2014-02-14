package mods.roborave.edm.blocks;

import javax.swing.Icon;

import mods.roborave.edm.EDM;
import mods.roborave.edm.lib.Strings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockExtended extends BlockRender
{
	 @SideOnly(Side.CLIENT)
     protected IIcon field_149944_M;
     @SideOnly(Side.CLIENT)
     protected IIcon field_149945_N;
     @SideOnly(Side.CLIENT)
     protected IIcon field_149946_O;
	 private String name;
	 
	 @SideOnly(Side.CLIENT)
     private IIcon[] icons;
	 
       public BlockExtended(String name)
       {
             super(name);
             this.name = name;
             this.setBlockTextureName(EDM.Instance.lib.MODID+":"+name);
             this.setBlockName(name);
       }
      
      
       /**
        * Gets the block's texture. Args: side, meta
        */
       @SideOnly(Side.CLIENT)
       public IIcon getIcon(int p_149691_1_, int p_149691_2_)
       {
           int k = p_149691_2_ & 7;
           return p_149691_1_ == k ? (k != 1 && k != 0 ? this.field_149945_N : this.field_149946_O) : (k != 1 && k != 0 ? (p_149691_1_ != 1 && p_149691_1_ != 0 ? this.blockIcon : this.field_149944_M) : this.field_149944_M);
       }


       @SideOnly(Side.CLIENT)
       public void registerBlockIcons(IIconRegister p_149651_1_)
       {
    	   
          
                 icons = new IIcon[4];
                
                 this.blockIcon= p_149651_1_.registerIcon(Strings.MODID + ":" + this.name);
                 this.field_149945_N=    p_149651_1_.registerIcon(Strings.MODID + ":" + this.name+"1");
                 this.field_149944_M=    p_149651_1_.registerIcon(Strings.MODID + ":" + this.name+"2");
                 this.field_149946_O=    p_149651_1_.registerIcon(Strings.MODID + ":" + this.name+"3");


           }
      
       
}