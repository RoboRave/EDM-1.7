package mods.roborave.edm.blocks;

import mods.roborave.edm.EDM;
import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.lib.Strings;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockExtended extends BlockRender
{
	@SideOnly(Side.CLIENT)
	  private IIcon iconTop;
	  @SideOnly(Side.CLIENT)
	  private IIcon iconBottom;
	  @SideOnly(Side.CLIENT)
	  private IIcon iconRight;
	  @SideOnly(Side.CLIENT)
	  private IIcon iconBack;
	  @SideOnly(Side.CLIENT)
	  private IIcon iconLeft;
	  
	 
	 @SideOnly(Side.CLIENT)
     private IIcon[] icons;
	private String name;
	
	
	 
       @SuppressWarnings({ "unchecked", "static-access" })
	public BlockExtended(String name)
       {
             super(name);
             this.name = name;
             this.setBlockTextureName(EDM.Instance.lib.MODID+":"+name);
             this.setBlockName(name);
             this.setCreativeTab(CreativeTabs.tabBlock);
             Blocks.blockList.put(name,this);
       }
      
      
       public IIcon getIcon(int paramInt1, int paramInt2)
       {
         if (paramInt1 == 0) {
           return this.iconBottom;
         }
         if (paramInt1 == 1) {
           return this.iconTop;
         }
         if (paramInt1 == 2) {
           return this.blockIcon;
         }
         if (paramInt1 == 3) {
           return this.iconBack;
         }
         if (paramInt1 == 4) {
           return this.iconRight;
         }
         if (paramInt1 == 5) {
           return this.iconLeft;
         }
         return null;
       }
       public void registerBlockIcons(IIconRegister paramly)
       {
         this.blockIcon = paramly.registerIcon(Strings.MODID+":"+this.name+"_front");
         this.iconTop = paramly.registerIcon(Strings.MODID+":"+this.name+"_top");
         this.iconBottom = paramly.registerIcon(Strings.MODID+":"+this.name+"_bottom");
         this.iconRight = paramly.registerIcon(Strings.MODID+":"+this.name+"_right");
         this.iconBack = paramly.registerIcon(Strings.MODID+":"+this.name+"_back");
         this.iconLeft = paramly.registerIcon(Strings.MODID+":"+this.name+"_left");
       }
       
}