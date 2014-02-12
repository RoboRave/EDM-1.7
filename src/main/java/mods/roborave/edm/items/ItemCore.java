package mods.roborave.edm.items;

import mods.roborave.edm.init.Items;
import mods.roborave.edm.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemCore extends Item{
	protected int itemId;

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