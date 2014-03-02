package mods.roborave.edm.init;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.items.armor.ItemBoots;
import mods.roborave.edm.items.armor.ItemChest;
import mods.roborave.edm.items.armor.ItemHelm;
import mods.roborave.edm.items.armor.ItemLegs;
import mods.roborave.edm.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Armor {
	
	public static void init(){
		
		EDM.Instance.getLogger().info("Initializing Armor");
        ItemArmor BDH= (ItemArmor) new ItemHelm(ClientProxy.Black_Diamonds,1, "Black").setUnlocalizedName("Black_Diamond_Helmat").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BDC= (ItemArmor) new ItemChest(ClientProxy.Black_Diamonds,2 ,"Black").setUnlocalizedName("Black_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BDP= (ItemArmor) new ItemLegs(ClientProxy.Black_Diamonds, 3,"Black").setUnlocalizedName("Black_Diamond_Legs").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BDB= (ItemArmor) new ItemBoots(ClientProxy.Black_Diamonds, 4,"Black").setUnlocalizedName("Black_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        ItemArmor BLDH= (ItemArmor) new ItemHelm(ClientProxy.Blue_Diamonds, 1, "Blue").setUnlocalizedName("Blue_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BLDC= (ItemArmor) new ItemChest(ClientProxy.Blue_Diamonds,  2, "Blue").setUnlocalizedName("Blue_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BLDP= (ItemArmor) new ItemLegs(ClientProxy.Blue_Diamonds, 3, "Blue").setUnlocalizedName("Blue_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BLDB= (ItemArmor) new ItemBoots(ClientProxy.Blue_Diamonds, 4,"Blue").setUnlocalizedName("Blue_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        ItemArmor GDH= (ItemArmor) new ItemHelm(ClientProxy.Gray_Diamonds,1, "Gray").setUnlocalizedName("Gray_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GDC= (ItemArmor) new ItemChest(ClientProxy.Gray_Diamonds,2,"Gray").setUnlocalizedName("Gray_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GDP= (ItemArmor) new ItemLegs(ClientProxy.Gray_Diamonds,3,"Gray").setUnlocalizedName("Gray_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GDB= (ItemArmor) new ItemBoots(ClientProxy.Gray_Diamonds,4,"Gray").setUnlocalizedName("Gray_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        ItemArmor GRDH= (ItemArmor) new ItemHelm(ClientProxy.Green_Diamonds, 1,"Green").setUnlocalizedName("Green_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GRDC= (ItemArmor) new ItemChest(ClientProxy.Green_Diamonds, 2,"Green").setUnlocalizedName("Green_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GRDP= (ItemArmor) new ItemLegs(ClientProxy.Green_Diamonds, 3,"Green").setUnlocalizedName("Green_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GRDB= (ItemArmor) new ItemBoots(ClientProxy.Green_Diamonds, 4,"Green").setUnlocalizedName("Green_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

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
	@SideOnly(Side.CLIENT)
	public static void registerItem(Item item)
	{
		EDM.Instance.getString();
		GameRegistry.registerItem(item, item.getUnlocalizedName(), Strings.MODID());
	}
}
