package mods.roborave.edm.items.tools;

import mods.roborave.edm.lib.Strings;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeMain extends ItemPickaxe {

	public ItemPickaxeMain(ToolMaterial p_i45347_1_, String par1Str) 
	{
		super(p_i45347_1_);
		this.setUnlocalizedName(par1Str);
		this.setTextureName(Strings.MODID()+":"+par1Str);
	}

}
