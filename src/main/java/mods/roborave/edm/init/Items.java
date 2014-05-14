package mods.roborave.edm.init;

import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.items.ItemCore;
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
	
	public static Item RDPX;
	public static Item RDAX;
	public static Item RDSD;
	public static Item RDSW;
	
	public static Item WDPX;
	public static Item WDAX;
	public static Item WDSD;
	public static Item WDSW;
	
	public static Item YDPX;
	public static Item YDAX;
	public static Item YDSD;
	public static Item YDSW;
	
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
			
			BD =new ItemCore("Item_Black_diamond").setCreativeTab(EDM.tabEDMItems);
			BLD =new ItemCore("Item_Blue_diamond").setCreativeTab(EDM.tabEDMItems);
			GD =new ItemCore("Item_Gray_diamond").setCreativeTab(EDM.tabEDMItems);
			GRD =new ItemCore("Item_Green_diamond").setCreativeTab(EDM.tabEDMItems);
			OD =new ItemCore("Item_Orange_diamond").setCreativeTab(EDM.tabEDMItems);
			PD =new ItemCore("Item_Pink_diamond").setCreativeTab(EDM.tabEDMItems);
			PUD =new ItemCore("Item_Purple_diamond").setCreativeTab(EDM.tabEDMItems);
			RD =new ItemCore("Item_Red_diamond").setCreativeTab(EDM.tabEDMItems);
			WD =new ItemCore("Item_White_diamond").setCreativeTab(EDM.tabEDMItems);
			YD =new ItemCore("Item_Yellow_diamond").setCreativeTab(EDM.tabEDMItems);
			
			// new ItemSpecial("wip").onUse(Blocks.getBlock("Black_diamond_Block"));
			
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
	        
	        EDM.Instance.getLogger().info("Initializing Tools:Pink Diamond");
	        PDPX = new ItemPickaxeMain(ClientProxy.Pink,"Pink_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        PDAX = new ItemAxeMain(ClientProxy.Pink,"Pink_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        PDSD = new ItemSpadeMain(ClientProxy.Pink,"Pink_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        PDSW = new ItemSwordMain(ClientProxy.Pink,"Pink_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
	        
	        EDM.Instance.getLogger().info("Initializing Tools:Purple Diamond");
	        PUDPX = new ItemPickaxeMain(ClientProxy.Purple,"Purple_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        PUDAX = new ItemAxeMain(ClientProxy.Purple,"Purple_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        PUDSD = new ItemSpadeMain(ClientProxy.Purple,"Purple_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        PUDSW = new ItemSwordMain(ClientProxy.Purple,"Purple_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
	        
	        EDM.Instance.getLogger().info("Initializing Tools:Red Diamond");
	        RDPX = new ItemPickaxeMain(ClientProxy.Red,"Red_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        RDAX = new ItemAxeMain(ClientProxy.Red,"Red_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        RDSD = new ItemSpadeMain(ClientProxy.Red,"Red_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        RDSW = new ItemSwordMain(ClientProxy.Red,"Red_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
	        EDM.Instance.getLogger().info("Initializing Tools:White Diamond");
	        WDPX = new ItemPickaxeMain(ClientProxy.White,"White_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        WDAX = new ItemAxeMain(ClientProxy.White,"White_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        WDSD = new ItemSpadeMain(ClientProxy.White,"White_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        WDSW = new ItemSwordMain(ClientProxy.White,"White_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
	        EDM.Instance.getLogger().info("Initializing Tools:Yellow Diamond");
	        YDPX = new ItemPickaxeMain(ClientProxy.Yellow,"Yellow_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        YDAX = new ItemAxeMain(ClientProxy.Yellow,"Yellow_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        YDSD = new ItemSpadeMain(ClientProxy.Yellow,"Yellow_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        YDSW = new ItemSwordMain(ClientProxy.White,"Yellow_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
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
	        
	        registerItem(PDPX);
	        registerItem(PDAX);
	        registerItem(PDSD);
	        registerItem(PDSW);
	        
	        registerItem(PUDPX);
	        registerItem(PUDAX);
	        registerItem(PUDSD);
	        registerItem(PUDSW);
	        
	        registerItem(RDPX);
	        registerItem(RDAX);
	        registerItem(RDSD);
	        registerItem(RDSW);
	        
	        registerItem(WDPX);
	        registerItem(WDAX);
	        registerItem(WDSD);
	        registerItem(WDSW);
	        
	        registerItem(YDPX);
	        registerItem(YDAX);
	        registerItem(YDSD);
	        registerItem(YDSW);
	        
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
	        
	        Items.itemList.put(PDPX.getUnlocalizedName(), PDPX);
	        Items.itemList.put(PDAX.getUnlocalizedName(), PDAX);
	        Items.itemList.put(PDSD.getUnlocalizedName(), PDSD);
	        Items.itemList.put(PDSW.getUnlocalizedName(), PDSW);

	        Items.itemList.put(PDPX.getUnlocalizedName(), PUDPX);
	        Items.itemList.put(PDAX.getUnlocalizedName(), PUDAX);
	        Items.itemList.put(PDSD.getUnlocalizedName(), PUDSD);
	        Items.itemList.put(PDSW.getUnlocalizedName(), PUDSW);
	        
	        Items.itemList.put(PDPX.getUnlocalizedName(), RDPX);
	        Items.itemList.put(PDAX.getUnlocalizedName(), RDAX);
	        Items.itemList.put(PDSD.getUnlocalizedName(), RDSD);
	        Items.itemList.put(PDSW.getUnlocalizedName(), RDSW);
	        
	        Items.itemList.put(PDPX.getUnlocalizedName(), WDPX);
	        Items.itemList.put(PDAX.getUnlocalizedName(), WDAX);
	        Items.itemList.put(PDSD.getUnlocalizedName(), WDSD);
	        Items.itemList.put(PDSW.getUnlocalizedName(), WDSW);

	        Items.itemList.put(YDPX.getUnlocalizedName(), YDPX);
	        Items.itemList.put(YDAX.getUnlocalizedName(), YDAX);
	        Items.itemList.put(YDSD.getUnlocalizedName(), YDSD);
	        Items.itemList.put(YDSW.getUnlocalizedName(), YDSW);

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