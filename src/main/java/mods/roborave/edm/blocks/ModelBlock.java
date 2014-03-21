package mods.roborave.edm.blocks;


import mods.roborave.edm.lib.Strings;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class ModelBlock
{
  private IModelCustom modelBlock;
  
  public ModelBlock()
  {
	  this.modelBlock = AdvancedModelLoader.loadModel(new ResourceLocation(Strings.MODID+":"+"textures/models/SwordsFrame.obj"));
  }
  
  public void render()
  {
    this.modelBlock.renderAll();
  }
  
  public void render(double x, double y, double z)
  {
    GL11.glPushMatrix();
    
    FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Strings.MODID, "textures/sword" + ".png"));
    render();
    GL11.glPopMatrix();
  }
}
