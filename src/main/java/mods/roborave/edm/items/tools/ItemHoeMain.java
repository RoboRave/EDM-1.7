package mods.roborave.edm.items.tools;

import mods.roborave.edm.lib.Strings;
import net.minecraft.item.ItemHoe;

public class ItemHoeMain extends ItemHoe {

	public ItemHoeMain(ToolMaterial p_i45343_1_, String par1Str) {
		super(p_i45343_1_);
		this.setUnlocalizedName(par1Str);
		this.setTextureName(Strings.MODID+":"+par1Str);
		// TODO Auto-generated constructor stub
	}

}
