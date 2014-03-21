package mods.roborave.edm.blocks.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTest extends ModelBase
{
  //fields
    ModelRenderer Side1;
    ModelRenderer Side2;
    ModelRenderer Side3;
  
  public ModelTest()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      Side1 = new ModelRenderer(this, 0, 0);
      Side1.addBox(-8F, 0F, 0F, 16, 16, 2);
      Side1.setRotationPoint(0F, 8F, 6F);
      Side1.setTextureSize(64, 32);
      Side1.mirror = true;
      setRotation(Side1, 0F, 0F, 0F);
      Side2 = new ModelRenderer(this, 40, 0);
      Side2.addBox(-8F, 0F, 0F, 16, 16, 2);
      Side2.setRotationPoint(-8F, 8F, 0F);
      Side2.setTextureSize(64, 32);
      Side2.mirror = true;
      setRotation(Side2, 0F, 1.570796F, 0F);
      Side3 = new ModelRenderer(this, 80, 0);
      Side3.addBox(-8F, 0F, 0F, 16, 16, 2);
      Side3.setRotationPoint(6F, 8F, 0F);
      Side3.setTextureSize(64, 32);
      Side3.mirror = true;
      setRotation(Side3, 0F, 1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Side1.render(f5);
    Side2.render(f5);
    Side3.render(f5);
  }
  public void render(float f1)
  {
	  Side1.render(f1);
	  Side2.render(f1);
	  Side3.render(f1);
  }
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
