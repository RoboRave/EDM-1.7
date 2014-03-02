package mods.roborave.edm.items.tools;

import mods.roborave.edm.lib.Strings;
import net.minecraft.item.ItemSword;

public class ItemSwordMain extends ItemSword{

	public ItemSwordMain(ToolMaterial p_i45356_1_, String par1Str) {
		super(p_i45356_1_);
		this.setUnlocalizedName(par1Str);
		this.setTextureName(Strings.MODID()+":"+par1Str);
	}

}
