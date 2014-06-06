package mods.roborave.edm.init;

import java.util.ArrayList;
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

public class Items 
{
	
	private static boolean isInitialized = false;
	
	public static HashMap<String , Item> itemList = new HashMap<String , Item>(); 

	
	public static Item BDPX, BDAX, BDSD, BDSW;
	
	public static Item BLDPX,BLDAX,BLDSD,BLDSW;
	
	public static Item GDPX, GDAX, GDSD, GDSW;
	
	public static Item GRDPX, GRDAX, GRDSD, GRDSW;
	
	public static Item ODPX, ODAX, ODSD, ODSW;
	
	public static Item PDPX, PDAX, PDSD, PDSW;
	
	public static Item PUDPX, PUDAX, PUDSD, PUDSW;
	
	public static Item RDPX, RDAX, RDSD, RDSW;
	
	public static Item WDPX, WDAX, WDSD, WDSW;
	
	public static Item YDPX, YDAX, YDSD, YDSW;
	
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
	
	public static ArrayList<Item> set;
	
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
	        
	        registerToolSet(BDPX, BDAX, BDSD, BDSW);

	        registerToolSet(BLDPX, BLDAX, BLDSD, BLDSW);
	        
	        registerToolSet(GDPX, GDAX, GDSD, GDSW);
	        
	        registerToolSet(GRDPX, GRDAX, GRDSD, GRDSW);
	        
	        registerToolSet(ODPX, ODAX, ODSD, ODSW);
	        
	        registerToolSet(PDPX, PDAX, PDSD, PDSW);
	        
	        registerToolSet(PUDPX, PUDAX, PUDSD, PUDSW);
	        
	        registerToolSet(RDPX, RDAX, RDSD, RDSW);
	        
	        registerToolSet(WDPX, WDAX, WDSD, WDSW);
	       
	        registerToolSet(YDPX, YDAX, YDSD, YDSW);
	        
	        putToolSet(BDPX, BDAX, BDSD, BDSW);

	        putToolSet(BLDPX, BLDAX, BLDSD, BLDSW);
	        
	        putToolSet(GDPX, GDAX, GDSD, GDSW);
	        
	        putToolSet(GRDPX, GRDAX, GRDSD, GRDSW);
	        
	        putToolSet(ODPX, ODAX, ODSD, ODSW);
	        
	      	putToolSet(PDPX, PDAX, PDSD, PDSW);
	        
	      	putToolSet(PUDPX, PUDAX, PUDSD, PUDSW);
	        
	      	putToolSet(RDPX, RDAX, RDSD, RDSW);
	        
	      
	      	putToolSet(WDPX, WDAX, WDSD, WDSW);
	       
	      	putToolSet(YDPX, YDAX, YDSD, YDSW);

			isInitialized = true;
			}
		    
	}
	public static void registerToolSet(Item pick, Item axe, Item spade, Item sword)
    {
        GameRegistry.registerItem(pick, pick.getUnlocalizedName(),Strings.MODID());
        GameRegistry.registerItem(axe, axe.getUnlocalizedName(),Strings.MODID());
        GameRegistry.registerItem(spade, spade.getUnlocalizedName(),Strings.MODID());
        GameRegistry.registerItem(sword, sword.getUnlocalizedName(),Strings.MODID());
    }
	
	public static void putToolSet(Item pick, Item axe,Item spade, Item sword)
    {
        Items.itemList.put(pick.getUnlocalizedName(), pick);
        Items.itemList.put(axe.getUnlocalizedName(),axe);
        Items.itemList.put(spade.getUnlocalizedName(),spade);
        Items.itemList.put(sword.getUnlocalizedName(),sword);
    }
	
	public static Item get(String itemName) 
	{
		return (Item)itemList.get(itemName);
	}
	
	public static void registerItem(Item item) 
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName(), Strings.MODID);
	}
}