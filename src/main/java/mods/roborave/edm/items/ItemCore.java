package mods.roborave.edm.items;

import mods.roborave.edm.EDM;
import mods.roborave.edm.init.Items;
import mods.roborave.edm.lib.Strings;
import net.minecraft.item.Item;

public class ItemCore extends Item{
	protected int itemId;
	
	public ItemCore(String itemName) {
		super();
		this.setCreativeTab(EDM.tabEDMItems);
		setUnlocalizedName(itemName);
		setTextureName(Strings.MODID + ":" + itemName);
		Items.itemList.put(itemName, this);
		Items.registerItem(this);
	}
	

		
}