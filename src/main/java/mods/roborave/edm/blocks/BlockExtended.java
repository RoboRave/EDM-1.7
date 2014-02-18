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
     protected IIcon textureTop;
     @SideOnly(Side.CLIENT)
     protected IIcon textureBottom;
     @SideOnly(Side.CLIENT)
     protected IIcon textureSideWest;
     @SideOnly(Side.CLIENT)
     private IIcon textureSideNorth;
	 private String name;
	 @SideOnly(Side.CLIENT)
	 private IIcon textureSideEast;
	 
	 @SideOnly(Side.CLIENT)
     private IIcon[] icons;
	private IIcon textureSideSouth;
	
	
	 
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
      
      
      
       @Override
   	public IIcon getIcon(int i, int j) {
   		switch (i) {
   			case 0:
   				return textureBottom;
   			case 1:
   				return textureTop;
   			case 2:
   				return textureSideNorth;
   			case 3:
   				return textureSideEast;
   			case 4:
   				return textureSideSouth;
   			default:
   				return textureSideWest;
   		}
   	}
       @Override
   	@SideOnly(Side.CLIENT)
   	public void registerBlockIcons(IIconRegister par1IconRegister) {
   		textureTop = par1IconRegister.registerIcon(Strings.MODID+":"+this.name+"1");
   		textureSideEast=par1IconRegister.registerIcon(Strings.MODID+":"+this.name+"2");
   		textureSideNorth=par1IconRegister.registerIcon(Strings.MODID+":"+this.name+"3");
   		textureSideWest = par1IconRegister.registerIcon(Strings.MODID+":"+this.name+"4");
   		textureSideSouth= par1IconRegister.registerIcon(Strings.MODID+":"+this.name+"3");
   		textureBottom= par1IconRegister.registerIcon(Strings.MODID+":"+this.name+"5");
   	}
       
}