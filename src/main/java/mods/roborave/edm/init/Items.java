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
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	private static boolean isInitialized = false;
	@SuppressWarnings("rawtypes")
	public static HashMap itemList = new HashMap(); 

	
	public static Object object;
	

	@SuppressWarnings("static-access")
	public static void init() 
	{
		if (isInitialized)
		{
			EDM.log.info("Item initialization failed, already initialized");
		}
		else
		{
			//Diamonds
			EDM.log.info("Initializing Items");
			new ItemCore("Item_Black_Diamond");
			new ItemCore("Item_Blue_Diamond");
			new ItemCore("Item_Gold_Diamond");
			new ItemCore("Item_Gray_Diamond");
			new ItemCore("Item_Green_Diamond");
			new ItemCore("Item_Orange_Diamond");
			new ItemCore("Item_Pink_Diamond");
			new ItemCore("Item_Purple_Diamond");
			new ItemCore("Item_Red_Diamond");
			new ItemCore("Item_White_Diamond");
			new ItemCore("Item_Yellow_Diamond");
			new ItemSpecial("wip", "WW").onUse(Blocks.getBlock("wip"));
			
			//Tools
			EDM.log.info("Initializing Tools");
			
			EDM.log.info("Initializing Tools:Black Diamond");
			new ItemPickaxeMain(ClientProxy.Black,"BLack_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        new ItemAxeMain(ClientProxy.Black,"Black_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSpadeMain(ClientProxy.Black,"Black_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			new ItemSwordMain(ClientProxy.Black, "Black_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
			
			EDM.log.info("Initializing Tools:Blue Diamond");
	        new ItemPickaxeMain(ClientProxy.Blue,"Blue_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        new ItemAxeMain(ClientProxy.Blue,"Blue_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSpadeMain(ClientProxy.Blue,"Blue_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			new ItemSwordMain(ClientProxy.Blue,"Blue_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
			
			EDM.log.info("Initializing Tools:Gray Diamond");
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