package mods.roborave.edm.init;

import java.util.HashMap;

import org.apache.logging.log4j.Level;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.helper.ore.items.OreItems;
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
	private static Item OPPX;
	private static Item OPAX;
	private static Item OPSD;
	private static Item OPSW;
	
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
			for (OreItems item : OreItems.values())
			{
				new ItemCore("Item_"+item.name()+"_diamond").setCreativeTab(CreativeTabs.tabMaterials);
			}
			
			//Tools
			EDM.Instance.getLogger().info("Initializing Tools");
			EDM.Instance.getLogger().info("Initializing Tools:Black Diamond");
			BDPX = new ItemPickaxeMain(ClientProxy.Black,"BLack_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
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
		
	        EDM.Instance.getLogger().log(Level.WARN, "Initializing Tools:OverPowerd Tools");
	        OPPX = new ItemPickaxeMain(ClientProxy.OLTM,"White_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        OPAX = new ItemAxeMain(ClientProxy.OLTM,"White_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        OPSD = new ItemSpadeMain(ClientProxy.OLTM,"White_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        OPSW = new ItemSwordMain(ClientProxy.OLTM,"White_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
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
	        
	        registerItem(OPPX);
	        registerItem(OPAX);
	        registerItem(OPSD);
	        registerItem(OPSW);
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