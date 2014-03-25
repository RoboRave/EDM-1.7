package mods.roborave.edm.client;

import mods.roborave.edm.EDM;
import mods.roborave.edm.common.CommonProxy;
import mods.roborave.edm.creativetabs.MainTab;
import mods.roborave.edm.interfaces.IProxy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.FMLClientHandler;
public class ClientProxy extends CommonProxy implements IProxy
{
	public static Item.ToolMaterial Black = EnumHelper.addToolMaterial("Black_D", 3, 1200, 8.0F,  3.0F, 10);
    public static Item.ToolMaterial Blue  = EnumHelper.addToolMaterial("Blue_D",  3, 1400, 10.0F, 5.0F, 12);
    public static Item.ToolMaterial Gray  = EnumHelper.addToolMaterial("Gray_D",  3, 1600, 12.0F, 7.0F, 14);
    public static Item.ToolMaterial Green = EnumHelper.addToolMaterial("Green_D", 3, 1800, 14.0F, 9.0F, 16);
    public static Item.ToolMaterial Orange= EnumHelper.addToolMaterial("Orange_D",3, 2000, 16.0F, 11.0F,18);
    public static Item.ToolMaterial Pink=   EnumHelper.addToolMaterial("Pink_D",  3, 2200, 18.0F, 13.0F,20);
    public static Item.ToolMaterial Purple= EnumHelper.addToolMaterial("Purple_D",3, 2400, 20.0F, 16.0F,22);
    public static Item.ToolMaterial Red=    EnumHelper.addToolMaterial("Red_D",   3, 2600, 22.0F, 19.0F,24);
    
    public static ArmorMaterial Black_Diamonds = EnumHelper.addArmorMaterial("Black", 30,new int[]  { 1, 6,   4, 1 }, 10);
	public static ArmorMaterial Blue_Diamonds = EnumHelper.addArmorMaterial("Blue", 35, new int[]   { 3, 8,   6, 3 }, 15);
	public static ArmorMaterial Gray_Diamonds= EnumHelper.addArmorMaterial("Gray", 40, new int[]    { 5, 10,  8, 5 }, 20);
	public static ArmorMaterial Green_Diamonds= EnumHelper.addArmorMaterial("Green", 45, new int[]  { 7, 12, 10, 7 }, 25);
	public static ArmorMaterial Orange_Diamonds= EnumHelper.addArmorMaterial("Orange", 50, new int[]{ 9, 14, 12, 9 }, 30);
	public static ArmorMaterial Pink_Diamonds= EnumHelper.addArmorMaterial("Pink", 55, new int[]    {11, 16, 14,11 }, 35);
	public static ArmorMaterial Purple_Diamonds= EnumHelper.addArmorMaterial("Purple", 60, new int[]{13, 18, 16,13 }, 40);
	
	@Override
	public void loadMod() 
	{
		super.loadMod();
		EDM.tabEDMBlock= new MainTab("EDM:Blocks", "Black_diamond_Block");
		EDM.tabEDMItems= new MainTab("EDM:Items", "Blue_diamond_Block");
	}
	
	@Override
	public void load()
	{
		super.load();
	}
	
	@Override
	public void PreInit()
	{
		super.PreInit();
	
	}
	
	@Override
	public void Init()
	{
		super.Init();
	}
	
	@Override
	public void PostInit() 
	{
		super.PostInit();
	}
	@Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }
	
	@Override
	public void registerTickers() 
	{
		super.registerTickers();
	}

    public void announce(String announcement)
    {
        FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(new ChatComponentText(announcement));
    }

	
}
