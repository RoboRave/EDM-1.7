package mods.roborave.edm.init;

import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.items.ItemCore;
import mods.roborave.edm.items.ItemSpecial;
import mods.roborave.edm.items.tools.ItemAxeMain;
import mods.roborave.edm.items.tools.ItemPickaxeMain;
import mods.roborave.edm.items.tools.ItemSpadeMain;
import mods.roborave.edm.items.tools.ItemSwordMain;
import mods.roborave.edm.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	private static boolean isInitialized = false;
	public static HashMap<String , Item> itemList = new HashMap<String , Item>(); 

	public static Item BDPX;
	public static Item BDAX;
	public static Item BDSD;
	public static Item BDSW;
	
	public static Item BLDPX;
	public static Item BLDAX;
	public static Item BLDSD;
	public static Item BLDSW;
	
	public static Item GDPX;
	public static Item GDAX;
	public static Item GDSD;
	public static Item GDSW;
	
	public static Item GRDPX;
	public static Item GRDAX;
	public static Item GRDSD;
	public static Item GRDSW;
	
	public static Item ODPX;
	public static Item ODAX;
	public static Item ODSD;
	public static Item ODSW;
	
	public static Item PDPX;
	public static Item PDAX;
	public static Item PDSD;
	public static Item PDSW;
	
	public static Item PUDPX;
	public static Item PUDAX;
	public static Item PUDSD;
	public static Item PUDSW;
	
	public static Item BD;
	public static Item BLD;
	public static Item GD;
	public static Item GRD;
	public static Item OD;
	public static Item PD;
	public static Item PUD;
	public static Item RD;
	public static Item WD;
	public static Item YD;
	
	
	
	public static void init() 
	{
		if (isInitialized)
		{
			EDM.Instance.getLogger().info("Item initialization failed, already initialized");
		}
		else
		{
			//Diamonds
			EDM.Instance.getLogger().info("Initializing Items");
			
			BD =new ItemCore("Item_Black_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			BLD =new ItemCore("Item_Blue_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			GD =new ItemCore("Item_Gray_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			GRD =new ItemCore("Item_Green_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			OD =new ItemCore("Item_Orange_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			PD =new ItemCore("Item_Pink_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			PUD =new ItemCore("Item_Purple_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			RD =new ItemCore("Item_Red_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			WD =new ItemCore("Item_White_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			YD =new ItemCore("Item_Yellow_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			
			 new ItemSpecial("wip").onUse(Blocks.getBlock("Black_diamond_Block"));
			
			//Tools
			EDM.Instance.getLogger().info("Initializing Tools");
			
			EDM.Instance.getLogger().info("Initializing Tools:Black Diamond");
			BDPX = new ItemPickaxeMain(ClientProxy.Black,"Black_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        BDAX = new ItemAxeMain(ClientProxy.Black,"Black_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        BDSD = new ItemSpadeMain(ClientProxy.Black,"Black_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			BDSW = new ItemSwordMain(ClientProxy.Black, "Black_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
			
			EDM.Instance.getLogger().info("Initializing Tools:Blue Diamond");
	        BLDPX= new ItemPickaxeMain(ClientProxy.Blue,"Blue_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        BLDAX= new ItemAxeMain(ClientProxy.Blue,"Blue_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        BLDSD= new ItemSpadeMain(ClientProxy.Blue,"Blue_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			BLDSW= new ItemSwordMain(ClientProxy.Blue,"Blue_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
			EDM.Instance.getLogger().info("Initializing Tools:Gray Diamond");
	        GDPX = new ItemPickaxeMain(ClientProxy.Gray,"Gray_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        GDAX = new ItemAxeMain(ClientProxy.Gray,"Gray_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        GDSD = new ItemSpadeMain(ClientProxy.Gray,"Gray_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        GDSW = new ItemSwordMain(ClientProxy.Gray,"Gray_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
	        
	        EDM.Instance.getLogger().info("Initializing Tools:Green Diamond");
	        GRDPX = new ItemPickaxeMain(ClientProxy.Green,"Green_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        GRDAX = new ItemAxeMain(ClientProxy.Green,"Green_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        GRDSD = new ItemSpadeMain(ClientProxy.Green,"Green_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        GRDSW = new ItemSwordMain(ClientProxy.Green,"Green_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
	        EDM.Instance.getLogger().info("Initializing Tools:Orange Diamond");
	        ODPX = new ItemPickaxeMain(ClientProxy.Orange,"Orange_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        ODAX = new ItemAxeMain(ClientProxy.Orange,"Orange_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        ODSD = new ItemSpadeMain(ClientProxy.Orange,"Orange_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        ODSW = new ItemSwordMain(ClientProxy.Orange,"Orange_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
	        registerItem(BDPX);
	        registerItem(BDAX);
	        registerItem(BDSD);
	        registerItem(BDSW);

	        registerItem(BLDPX);
	        registerItem(BLDAX);
	        registerItem(BLDSD);
	        registerItem(BLDSW);
	        
	        registerItem(GDPX);
	        registerItem(GDAX);
	        registerItem(GDSD);
	        registerItem(GDSW);
	        
	        registerItem(GRDPX);
	        registerItem(GRDAX);
	        registerItem(GRDSD);
	        registerItem(GRDSW);
	        
	        registerItem(ODPX);
	        registerItem(ODAX);
	        registerItem(ODSD);
	        registerItem(ODSW);
	        
	        Items.itemList.put(BDPX.getUnlocalizedName(), BDPX);
	        Items.itemList.put(BDAX.getUnlocalizedName(), BDAX);
	        Items.itemList.put(BDSD.getUnlocalizedName(), BDSD);
	        Items.itemList.put(BDSW.getUnlocalizedName(), BDSW);
	        
	        Items.itemList.put(BLDPX.getUnlocalizedName(), BLDPX);
	        Items.itemList.put(BLDAX.getUnlocalizedName(), BLDAX);
	        Items.itemList.put(BLDSD.getUnlocalizedName(), BLDSD);
	        Items.itemList.put(BLDSW.getUnlocalizedName(), BLDSW);
	        
	        Items.itemList.put(GDPX.getUnlocalizedName(), GDPX);
	        Items.itemList.put(GDAX.getUnlocalizedName(), GDAX);
	        Items.itemList.put(GDSD.getUnlocalizedName(), GDSD);
	        Items.itemList.put(GDSW.getUnlocalizedName(), GDSW);
	        
	        Items.itemList.put(GRDPX.getUnlocalizedName(), GRDPX);
	        Items.itemList.put(GRDAX.getUnlocalizedName(), GRDAX);
	        Items.itemList.put(GRDSD.getUnlocalizedName(), GRDSD);
	        Items.itemList.put(GRDSW.getUnlocalizedName(), GRDSW);
	        
	        Items.itemList.put(ODPX.getUnlocalizedName(), ODPX);
	        Items.itemList.put(ODAX.getUnlocalizedName(), ODAX);
	        Items.itemList.put(ODSD.getUnlocalizedName(), ODSD);
	        Items.itemList.put(ODSW.getUnlocalizedName(), ODSW);
			isInitialized = true;
			}
		    
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName(), Strings.MODID);
	}
	public static Item get(String itemName) 
	{
		return (Item)itemList.get(itemName);
	}
}