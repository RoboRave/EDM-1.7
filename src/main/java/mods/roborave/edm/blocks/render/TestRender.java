package mods.roborave.edm.blocks.render;

import mods.roborave.edm.blocks.ModelBlock;
import mods.roborave.edm.blocks.tileentity.TileEntityBlock;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

public class TestRender extends TileEntitySpecialRenderer 
{

	public TestRender()
	{
		model = new ModelBlock();
	}
	
	public void renderModel(TileEntityBlock par1, double par2, double par3, double par4, float par5 )
	{
		int direction = par1.direction;
		   GL11.glPushMatrix();
		   GL11.glTranslatef((float)par2 + 0.5F, (float)par3 + 0.205F, (float)par4 + 0.5F);
		   GL11.glRotatef(-120.0F, -1.0F, 1.0F, 1.0F);
		   GL11.glScaled(0.5D, 1.0D, 1.0D);
		   GL11.glPushMatrix();
		   this.model.render(par2, par3, par4);
		   GL11.glPopMatrix();
		   GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) 
	{
		renderModel((TileEntityBlock)var1, var2, var4, var6, var8);
	}
	private ModelBlock model;
}
