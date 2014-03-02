package mods.roborave.edm.items.tools;

import mods.roborave.edm.lib.Strings;
import net.minecraft.item.ItemSpade;

public class ItemSpadeMain extends ItemSpade{

	public ItemSpadeMain(ToolMaterial p_i45353_1_, String par1Str) {
		super(p_i45353_1_);
		this.setUnlocalizedName(par1Str);
		this.setTextureName(Strings.MODID+":"+par1Str);
	}

}
