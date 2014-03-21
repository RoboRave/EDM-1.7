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
	
	public static ItemArmor ODH;
	public static ItemArmor ODC;
	public static ItemArmor ODP;
	public static ItemArmor ODB;
	
	public static ItemArmor PDH;
	public static ItemArmor PDC;
	public static ItemArmor PDP;
	public static ItemArmor PDB;
	
	public static ItemArmor PUDH;
	public static ItemArmor PUDC;
	public static ItemArmor PUDP;
	public static ItemArmor PUDB;
	
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

        ODH= (ItemArmor) new ItemHelmat(ClientProxy.Orange_Diamonds,1, "Orange").setUnlocalizedName("Orange_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        ODC= (ItemArmor) new ItemChest(ClientProxy.Orange_Diamonds,2,"Orange").setUnlocalizedName("Orange_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ODP= (ItemArmor) new ItemLegs(ClientProxy.Orange_Diamonds,3,"Orange").setUnlocalizedName("Orange_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        ODB= (ItemArmor) new ItemBoots(ClientProxy.Orange_Diamonds,4,"Orange").setUnlocalizedName("Orange_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);
       
        PDH= (ItemArmor) new ItemHelmat(ClientProxy.Pink_Diamonds,1, "Pink").setUnlocalizedName("Pink_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        PDC= (ItemArmor) new ItemChest(ClientProxy.Pink_Diamonds,2,"Pink").setUnlocalizedName("Pink_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        PDP= (ItemArmor) new ItemLegs(ClientProxy.Pink_Diamonds,3,"Pink").setUnlocalizedName("Pink_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        PDB= (ItemArmor) new ItemBoots(ClientProxy.Pink_Diamonds,4,"Pink").setUnlocalizedName("Pink_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);
        
        PUDH= (ItemArmor) new ItemHelmat(ClientProxy.Purple_Diamonds,1, "Purple").setUnlocalizedName("Purple_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        PUDC= (ItemArmor) new ItemChest(ClientProxy.Purple_Diamonds,2,"Purple").setUnlocalizedName("Purple_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        PUDP= (ItemArmor) new ItemLegs(ClientProxy.Purple_Diamonds,3,"Purple").setUnlocalizedName("Purple_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        PUDB= (ItemArmor) new ItemBoots(ClientProxy.Purple_Diamonds,4,"Purple").setUnlocalizedName("Purple_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        
        
        registerArmorSet(BDH,BDC,BDP,BDB);
		
        registerArmorSet(BLDH,BLDC,BLDP,BLDB);

        registerArmorSet(GDH,GDC,GDP,GDB);
		
        registerArmorSet(GRDH,GRDC,GRDP,GRDB);

		registerItem(ODH);
		registerItem(ODC);
		registerItem(ODP);
		registerItem(ODB);
		
		registerItem(PDH);
		registerItem(PDC);
		registerItem(PDP);
		registerItem(PDB);
		
		registerItem(PUDH);
		registerItem(PUDC);
		registerItem(PUDP);
		registerItem(PUDB);
		
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
		
		Items.itemList.put(ODH.getUnlocalizedName(),ODH);
		Items.itemList.put(ODC.getUnlocalizedName(),ODC);
		Items.itemList.put(ODP.getUnlocalizedName(),ODP);
		Items.itemList.put(ODB.getUnlocalizedName(),ODB);
		
		Items.itemList.put(PDH.getUnlocalizedName(),PDH);
		Items.itemList.put(PDC.getUnlocalizedName(),PDC);
		Items.itemList.put(PDP.getUnlocalizedName(),PDP);
		Items.itemList.put(PDB.getUnlocalizedName(),PDB);
		
		Items.itemList.put(PUDH.getUnlocalizedName(),PUDH);
		Items.itemList.put(PUDC.getUnlocalizedName(),PUDC);
		Items.itemList.put(PUDP.getUnlocalizedName(),PUDP);
		Items.itemList.put(PUDB.getUnlocalizedName(),PUDB);
		
		
	}
	
	private static void registerArmorSet(ItemArmor helmet, ItemArmor chestplate,
	            ItemArmor leggings, ItemArmor boots)
	    {
	        GameRegistry.registerItem(helmet, helmet.getUnlocalizedName(),Strings.MODID());
	        GameRegistry.registerItem(chestplate, chestplate.getUnlocalizedName(),Strings.MODID());
	        GameRegistry.registerItem(leggings, leggings.getUnlocalizedName(),Strings.MODID());
	        GameRegistry.registerItem(boots, boots.getUnlocalizedName(),Strings.MODID());
	    }
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName(), Strings.MODID());
	}
}
