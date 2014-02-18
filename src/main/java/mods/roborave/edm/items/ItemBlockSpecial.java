package mods.roborave.edm.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class ItemBlockSpecial extends ItemBlock
{
	@SideOnly(Side.CLIENT)
    private IIcon field_150938_b;
	
	 public final Block field_150939_b;
	@SuppressWarnings("unused")
	private String message;
    public ItemBlockSpecial(Block block,String message)
    {
        super(block);
        this.field_150939_b = block;
        this.message= message;
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        return this.field_150939_a.getUnlocalizedName();
    }
 
    
    @Override
    public int getMetadata(int par1)
    {
        return par1;
    }


   
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        String s = this.field_150939_a.getItemIconName();

        if (s != null)
        {
            this.field_150938_b = par1IconRegister.registerIcon(s);
        }
    }
}