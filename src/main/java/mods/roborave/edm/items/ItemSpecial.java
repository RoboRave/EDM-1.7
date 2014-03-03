package mods.roborave.edm.items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSpecial extends ItemCore{

	
	private Block block;
	private ItemStack par1ItemStack;
	private EntityPlayer par2EntityPlayer;
	private World par3World;
	private int par4;
	private int par5;
	private int par6;
	private int par7;
	private float par8;
	private float par9;
	private float par10;
	private ItemSpecial Useable;
	public ItemSpecial(String itemName, String message) 
	{
		super(itemName);
	}
	@SideOnly(Side.CLIENT)
	@SuppressWarnings("unchecked")
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, @SuppressWarnings("rawtypes") List par3List ,boolean par4)
	{
			par3List.add("Hold Shift for more info");
			par3List.add(StatCollector.translateToLocal(this.getUnlocalizedName()+".desc"));
		
		
	}
	
	
	public ItemSpecial onUse(Block block)
	{
		this.block = block;
		return this;
		
	}
	public ItemSpecial getItemUseEvent()
	{
		this.onItemUse(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10);
		return Useable;
		
	}
	 public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	    {
	        if (par7 == 0)
	        {
	            --par5;
	        }

	        if (par7 == 1)
	        {
	            ++par5;
	        }

	        if (par7 == 2)
	        {
	            --par6;
	        }

	        if (par7 == 3)
	        {
	            ++par6;
	        }

	        if (par7 == 4)
	        {
	            --par4;
	        }

	        if (par7 == 5)
	        {
	            ++par4;
	        }

	        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
	        {
	            return false;
	        }
	        else
	        {
	            if (par3World.isAirBlock(par4, par5, par6))
	            {
	                par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "dig.stone", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
	                par3World.setBlock(par4, par5, par6, block);
	            }

	            
	            return true;
	        }
	    }
}
