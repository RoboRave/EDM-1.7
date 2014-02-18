package mods.roborave.edm.init;

import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.items.ItemAxeMain;
import mods.roborave.edm.items.ItemCore;
import mods.roborave.edm.items.ItemPickaxeMain;
import mods.roborave.edm.items.ItemSpadeMain;
import mods.roborave.edm.items.ItemSwordMain;
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
	@SuppressWarnings({ "static-access"})
	public static void init() 
	{
		if (isInitialized)
		{
			EDM.log.info("Item initialization failed, already initialized");
		}
		else
		{
			EDM.log.info("Initializing Items");
			//TODO Items
			
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
		
			///

			//Black Diamond
			new ItemPickaxeMain(ClientProxy.Black,"BLack_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        new ItemAxeMain(ClientProxy.Black,"Black_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSpadeMain(ClientProxy.Black,"Black_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			new ItemSwordMain(ClientProxy.Black, "Black_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
			//Blue Diamond
	        new ItemPickaxeMain(ClientProxy.Blue,"Blue_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        new ItemAxeMain(ClientProxy.Blue,"Blue_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSpadeMain(ClientProxy.Blue,"Blue_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			new ItemSwordMain(ClientProxy.Blue,"Blue_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
			
			//Blue Diamond
	        new ItemPickaxeMain(ClientProxy.Gray,"Gray_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        new ItemAxeMain(ClientProxy.Gray,"Gray_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSpadeMain(ClientProxy.Gray,"Gray_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        new ItemSwordMain(ClientProxy.Gray,"Gray_Diamond_Sword").setCreativeTab(CreativeTabs.tabTools);
		
	        ItemArmor BDH= (ItemArmor) new ItemArmor(ClientProxy.Black_Diamonds,RenderingRegistry.addNewArmourRendererPrefix("black"), 0).setUnlocalizedName("Black_Diamond_Helmat").setTextureName(Strings.MODID+":"+"Black_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor BDC= (ItemArmor) new ItemArmor(ClientProxy.Black_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("black"), 1).setUnlocalizedName("Black_Diamond_Chest").setTextureName(Strings.MODID+":"+"Black_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor BDP= (ItemArmor) new ItemArmor(ClientProxy.Black_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("black"), 2).setUnlocalizedName("Black_Diamond_Legs").setTextureName(Strings.MODID+":"+"Black_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor BDB= (ItemArmor) new ItemArmor(ClientProxy.Black_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("black"), 3).setUnlocalizedName("Black_Diamond_Boots").setTextureName(Strings.MODID+":"+"Black_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

	        ItemArmor BLDH= (ItemArmor) new ItemArmor(ClientProxy.Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 0).setUnlocalizedName("Blue_Diamond_Helm").setTextureName(Strings.MODID+":"+"Blue_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor BLDC= (ItemArmor) new ItemArmor(ClientProxy.Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 1).setUnlocalizedName("Blue_Diamond_Chest").setTextureName(Strings.MODID+":"+"Blue_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor BLDP= (ItemArmor) new ItemArmor(ClientProxy.Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 2).setUnlocalizedName("Blue_Diamond_Pants").setTextureName(Strings.MODID+":"+"Blue_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor BLDB= (ItemArmor) new ItemArmor(ClientProxy.Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 3).setUnlocalizedName("Blue_Diamond_Boots").setTextureName(Strings.MODID+":"+"Blue_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

	        ItemArmor GDH= (ItemArmor) new ItemArmor(ClientProxy.Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 0).setUnlocalizedName("Gray_Diamond_Helm").setTextureName(Strings.MODID+":"+"Gray_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor GDC= (ItemArmor) new ItemArmor(ClientProxy.Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 1).setUnlocalizedName("Gray_Diamond_Chest").setTextureName(Strings.MODID+":"+"Gray_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor GDP= (ItemArmor) new ItemArmor(ClientProxy.Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 2).setUnlocalizedName("Gray_Diamond_Pants").setTextureName(Strings.MODID+":"+"Gray_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor GDB= (ItemArmor) new ItemArmor(ClientProxy.Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 3).setUnlocalizedName("Gray_Diamond_Boots").setTextureName(Strings.MODID+":"+"Gray_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

	        ItemArmor GRDH= (ItemArmor) new ItemArmor(ClientProxy.Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 0).setUnlocalizedName("Green_Diamond_Helm").setTextureName(Strings.MODID+":"+"Green_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor GRDC= (ItemArmor) new ItemArmor(ClientProxy.Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 1).setUnlocalizedName("Green_Diamond_Chest").setTextureName(Strings.MODID+":"+"Green_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor GRDP= (ItemArmor) new ItemArmor(ClientProxy.Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 2).setUnlocalizedName("Green_Diamond_Pants").setTextureName(Strings.MODID+":"+"Green_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
	        ItemArmor GRDB= (ItemArmor) new ItemArmor(ClientProxy.Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 3).setUnlocalizedName("Green_Diamond_Boots").setTextureName(Strings.MODID+":"+"Green_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

			isInitialized = true;
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