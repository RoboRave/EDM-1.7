package mods.roborave.edm.client;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
public class ClientProxy 
{
	public static Item.ToolMaterial Black=  EnumHelper.addToolMaterial("Black_D",3, 1500, 8.0F, 3.0F, 10);
    public static Item.ToolMaterial Blue=  EnumHelper.addToolMaterial("Blue_D",3, 2000, 10.0F, 5.0F, 15);
    public static Item.ToolMaterial Gray=  EnumHelper.addToolMaterial("Gray_D",3, 2500, 12.0F, 8.0F, 20);

}
