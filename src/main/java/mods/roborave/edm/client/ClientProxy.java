package mods.roborave.edm.client;

import mods.roborave.edm.EDM;
import mods.roborave.edm.common.CommonProxy;
import mods.roborave.edm.creativetabs.MainTab;
import mods.roborave.edm.interfaces.IProxy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.FMLClientHandler;
public class ClientProxy extends CommonProxy implements IProxy
{
	public static Item.ToolMaterial Black=  EnumHelper.addToolMaterial("Black_D",3, 1500, 8.0F, 3.0F, 10);
    public static Item.ToolMaterial Blue=  EnumHelper.addToolMaterial("Blue_D",3, 2000, 10.0F, 5.0F, 15);
    public static Item.ToolMaterial Gray=  EnumHelper.addToolMaterial("Gray_D",3, 2500, 12.0F, 7.0F, 20);
    public static Item.ToolMaterial OLTM=  EnumHelper.addToolMaterial("OverPowered_D",3, 10000000, 10000.0F, 100.0F, 20);

    public static ArmorMaterial Black_Diamonds = EnumHelper.addArmorMaterial("Black", 30,new int[] { 1, 6, 4, 1 }, 10);
	public static ArmorMaterial Blue_Diamonds = EnumHelper.addArmorMaterial("Blue", 35, new int[] { 3, 8, 6, 3 }, 15);
	public static ArmorMaterial Gray_Diamonds= EnumHelper.addArmorMaterial("Gray", 40, new int[] { 5, 10,8, 5 }, 20);
	public static ArmorMaterial Green_Diamonds= EnumHelper.addArmorMaterial("Green", 45, new int[] { 7, 12,10,7 }, 25);
	
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
	
	
}
