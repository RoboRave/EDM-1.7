package mods.roborave.edm.client;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
public class ClientProxy 
{
	public static Item.ToolMaterial Black=  EnumHelper.addToolMaterial("Black_D",3, 1500, 8.0F, 3.0F, 10);
    public static Item.ToolMaterial Blue=  EnumHelper.addToolMaterial("Blue_D",3, 2000, 10.0F, 5.0F, 15);
    public static Item.ToolMaterial Gray=  EnumHelper.addToolMaterial("Gray_D",3, 2500, 12.0F, 8.0F, 20);
    public static ArmorMaterial Black_Diamonds = EnumHelper.addArmorMaterial("Black", 30,new int[] { 1, 6, 4, 1 }, 10);
	public static ArmorMaterial Blue_Diamonds = EnumHelper.addArmorMaterial("Blue", 35, new int[] { 3, 8, 6, 3 }, 15);
	public static ArmorMaterial Gray_Diamonds= EnumHelper.addArmorMaterial("Gray", 40, new int[] { 5, 10,8, 5 }, 20);
	public static ArmorMaterial Green_Diamonds= EnumHelper.addArmorMaterial("Green", 45, new int[] { 7, 12,10,7 }, 25);
	
	
	
}
