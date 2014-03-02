package mods.roborave.edm.items.tools;

import mods.roborave.edm.lib.Strings;
import net.minecraft.item.ItemAxe;

public class ItemAxeMain extends ItemAxe {

	public ItemAxeMain(ToolMaterial p_i45327_1_, String par1Str) {
		super(p_i45327_1_);
		this.setUnlocalizedName(par1Str);
		this.setTextureName(Strings.MODID()+":"+par1Str);
	}

}
