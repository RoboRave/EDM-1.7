package mods.roborave.edm.items;

import java.util.List;

import mods.roborave.edm.init.Items;
import mods.roborave.edm.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCore extends Item{
	protected int itemId;
	private String message;

	@SuppressWarnings("unchecked")
	public ItemCore(String itemName) {
		super();
		this.setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(itemName);
		setTextureName(Strings.MODID + ":" + itemName);
		Items.itemList.put(itemName, this);
		GameRegistry.registerItem(this, itemName);
	}
	

		
}