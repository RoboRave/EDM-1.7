package mods.roborave.edm.init;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.items.armor.ItemBoots;
import mods.roborave.edm.items.armor.ItemChest;
import mods.roborave.edm.items.armor.ItemHelmat;
import mods.roborave.edm.items.armor.ItemLegs;
import mods.roborave.edm.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Armor 
{
	
	public static ItemArmor BDH;
	public static ItemArmor BDC;
	public static ItemArmor BDP;
	public static ItemArmor BDB;
	
	public static ItemArmor BLDH;
	public static ItemArmor BLDC;
	public static ItemArmor BLDP;
	public static ItemArmor BLDB;

	public static ItemArmor GDH;
	public static ItemArmor GDC;
	public static ItemArmor GDP;
	public static ItemArmor GDB;
	
	public static ItemArmor GRDH;
	public static ItemArmor GRDC;
	public static ItemArmor GRDP;
	public static ItemArmor GRDB;
	
	public static void init()
	{
		
		EDM.Instance.getLogger().info("Initializing Armor");
        BDH = (ItemArmor) new ItemHelmat(ClientProxy.Black_Diamonds,1, "Black").setUnlocalizedName("Black_Diamond_Helmat").setCreativeTab(CreativeTabs.tabCombat);
        BDC= (ItemArmor) new ItemChest(ClientProxy.Black_Diamonds,2 ,"Black").setUnlocalizedName("Black_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        BDP= (ItemArmor) new ItemLegs(ClientProxy.Black_Diamonds, 3,"Black").setUnlocalizedName("Black_Diamond_Legs").setCreativeTab(CreativeTabs.tabCombat);
        BDB= (ItemArmor) new ItemBoots(ClientProxy.Black_Diamonds, 4,"Black").setUnlocalizedName("Black_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        BLDH= (ItemArmor) new ItemHelmat(ClientProxy.Blue_Diamonds, 1, "Blue").setUnlocalizedName("Blue_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        BLDC= (ItemArmor) new ItemChest(ClientProxy.Blue_Diamonds,  2, "Blue").setUnlocalizedName("Blue_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        BLDP= (ItemArmor) new ItemLegs(ClientProxy.Blue_Diamonds, 3, "Blue").setUnlocalizedName("Blue_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        BLDB= (ItemArmor) new ItemBoots(ClientProxy.Blue_Diamonds, 4,"Blue").setUnlocalizedName("Blue_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        GDH= (ItemArmor) new ItemHelmat(ClientProxy.Gray_Diamonds,1, "Gray").setUnlocalizedName("Gray_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        GDC= (ItemArmor) new ItemChest(ClientProxy.Gray_Diamonds,2,"Gray").setUnlocalizedName("Gray_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        GDP= (ItemArmor) new ItemLegs(ClientProxy.Gray_Diamonds,3,"Gray").setUnlocalizedName("Gray_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        GDB= (ItemArmor) new ItemBoots(ClientProxy.Gray_Diamonds,4,"Gray").setUnlocalizedName("Gray_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        GRDH= (ItemArmor) new ItemHelmat(ClientProxy.Green_Diamonds, 1,"Green").setUnlocalizedName("Green_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        GRDC= (ItemArmor) new ItemChest(ClientProxy.Green_Diamonds, 2,"Green").setUnlocalizedName("Green_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        GRDP= (ItemArmor) new ItemLegs(ClientProxy.Green_Diamonds, 3,"Green").setUnlocalizedName("Green_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        GRDB= (ItemArmor) new ItemBoots(ClientProxy.Green_Diamonds, 4,"Green").setUnlocalizedName("Green_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

		registerItem(BDH);
		registerItem(BDC);
		registerItem(BDP);
		registerItem(BDB);
		
		registerItem(BLDH);
		registerItem(BLDC);
		registerItem(BLDP);
		registerItem(BLDB);

		registerItem(GDH);
		registerItem(GDC);
		registerItem(GDP);
		registerItem(GDB);
		
		registerItem(GRDH);
		registerItem(GRDC);
		registerItem(GRDP);
		registerItem(GRDB);

		Items.itemList.put(BDH.getUnlocalizedName(),BDH);
		Items.itemList.put(BDC.getUnlocalizedName(),BDC);
		Items.itemList.put(BDP.getUnlocalizedName(),BDP);
		Items.itemList.put(BDB.getUnlocalizedName(),BDB);
		
		Items.itemList.put(BLDH.getUnlocalizedName(),BLDH);
		Items.itemList.put(BLDC.getUnlocalizedName(),BLDC);
		Items.itemList.put(BLDP.getUnlocalizedName(),BLDP);
		Items.itemList.put(BLDB.getUnlocalizedName(),BLDB);

		Items.itemList.put(GDH.getUnlocalizedName(),GDH);
		Items.itemList.put(GDC.getUnlocalizedName(),GDC);
		Items.itemList.put(GDP.getUnlocalizedName(),GDP);
		Items.itemList.put(GDB.getUnlocalizedName(),GDB);
		
		Items.itemList.put(GRDH.getUnlocalizedName(),GRDH);
		Items.itemList.put(GRDC.getUnlocalizedName(),GRDC);
		Items.itemList.put(GRDP.getUnlocalizedName(),GRDP);
		Items.itemList.put(GRDB.getUnlocalizedName(),GRDB);
		
	}
	
	public static void registerItem(Item item)
	{
		EDM.Instance.getString();
		GameRegistry.registerItem(item, item.getUnlocalizedName(), Strings.MODID());
	}
}
