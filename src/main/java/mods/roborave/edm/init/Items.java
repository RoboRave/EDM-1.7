package mods.roborave.edm.init;

import java.util.HashMap;

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
	public static HashMap<String,Item> itemList = new HashMap<String, Item>(); 

	
	public static Object object;
	

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
			new ItemPickaxeMain(ClientProxy.Black,"BLack_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        new ItemAxeMain(ClientProxy.Black,"Black_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSpadeMain(ClientProxy.Black,"Black_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			new ItemSwordMain(ClientProxy.Black, "Black_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
			
			EDM.Instance.getLogger().info("Initializing Tools:Blue Diamond");
	        new ItemPickaxeMain(ClientProxy.Blue,"Blue_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        new ItemAxeMain(ClientProxy.Blue,"Blue_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSpadeMain(ClientProxy.Blue,"Blue_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			new ItemSwordMain(ClientProxy.Blue,"Blue_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
			
			EDM.Instance.getLogger().info("Initializing Tools:Gray Diamond");
	        new ItemPickaxeMain(ClientProxy.Gray,"Gray_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        new ItemAxeMain(ClientProxy.Gray,"Gray_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSpadeMain(ClientProxy.Gray,"Gray_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSwordMain(ClientProxy.Gray,"Gray_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
		
	        
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