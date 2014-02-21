package mods.roborave.edm.init;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Armor {
	
	public static void init(){
		
		EDM.log.info("Initializing Armor");
        ItemArmor BDH= (ItemArmor) new ItemArmor(ClientProxy.Black_Diamonds,RenderingRegistry.addNewArmourRendererPrefix("black"), 0).setUnlocalizedName("Black_Diamond_Helmat").setTextureName(Strings.MODID+":"+"Black_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BDC= (ItemArmor) new ItemArmor(ClientProxy.Black_Diamonds,RenderingRegistry.addNewArmourRendererPrefix("black"), 1).setUnlocalizedName("Black_Diamond_Chest").setTextureName(Strings.MODID+":"+"Black_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BDP= (ItemArmor) new ItemArmor(ClientProxy.Black_Diamonds,  RenderingRegistry.addNewArmourRendererPrefix("black"), 2).setUnlocalizedName("Black_Diamond_Legs").setTextureName(Strings.MODID+":"+"Black_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BDB= (ItemArmor) new ItemArmor(ClientProxy.Black_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("black"), 3).setUnlocalizedName("Black_Diamond_Boots").setTextureName(Strings.MODID+":"+"Black_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        ItemArmor BLDH= (ItemArmor) new ItemArmor(ClientProxy.Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 0).setUnlocalizedName("Blue_Diamond_Helm").setTextureName(Strings.MODID+":"+"Blue_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BLDC= (ItemArmor) new ItemArmor(ClientProxy.Blue_Diamonds,  RenderingRegistry.addNewArmourRendererPrefix("blue"), 1).setUnlocalizedName("Blue_Diamond_Chest").setTextureName(Strings.MODID+":"+"Blue_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BLDP= (ItemArmor) new ItemArmor(ClientProxy.Blue_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("blue"), 2).setUnlocalizedName("Blue_Diamond_Pants").setTextureName(Strings.MODID+":"+"Blue_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor BLDB= (ItemArmor) new ItemArmor(ClientProxy.Blue_Diamonds,  RenderingRegistry.addNewArmourRendererPrefix("blue"), 3).setUnlocalizedName("Blue_Diamond_Boots").setTextureName(Strings.MODID+":"+"Blue_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        ItemArmor GDH= (ItemArmor) new ItemArmor(ClientProxy.Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 0).setUnlocalizedName("Gray_Diamond_Helm").setTextureName(Strings.MODID+":"+"Gray_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GDC= (ItemArmor) new ItemArmor(ClientProxy.Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 1).setUnlocalizedName("Gray_Diamond_Chest").setTextureName(Strings.MODID+":"+"Gray_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GDP= (ItemArmor) new ItemArmor(ClientProxy.Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 2).setUnlocalizedName("Gray_Diamond_Pants").setTextureName(Strings.MODID+":"+"Gray_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GDB= (ItemArmor) new ItemArmor(ClientProxy.Gray_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("gray"), 3).setUnlocalizedName("Gray_Diamond_Boots").setTextureName(Strings.MODID+":"+"Gray_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

        ItemArmor GRDH= (ItemArmor) new ItemArmor(ClientProxy.Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 0).setUnlocalizedName("Green_Diamond_Helm").setTextureName(Strings.MODID+":"+"Green_Diamond_Helm").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GRDC= (ItemArmor) new ItemArmor(ClientProxy.Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 1).setUnlocalizedName("Green_Diamond_Chest").setTextureName(Strings.MODID+":"+"Green_Diamond_Chest").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GRDP= (ItemArmor) new ItemArmor(ClientProxy.Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 2).setUnlocalizedName("Green_Diamond_Pants").setTextureName(Strings.MODID+":"+"Green_Diamond_Pants").setCreativeTab(CreativeTabs.tabCombat);
        ItemArmor GRDB= (ItemArmor) new ItemArmor(ClientProxy.Green_Diamonds, RenderingRegistry.addNewArmourRendererPrefix("green"), 3).setUnlocalizedName("Green_Diamond_Boots").setTextureName(Strings.MODID+":"+"Green_Diamond_Boots").setCreativeTab(CreativeTabs.tabCombat);

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

		Items.itemList.put(BDH,BDH.getUnlocalizedName());
		Items.itemList.put(BDC,BDC.getUnlocalizedName());
		Items.itemList.put(BDP,BDP.getUnlocalizedName());
		Items.itemList.put(BDB,BDB.getUnlocalizedName());
		
		Items.itemList.put(BLDH,BLDH.getUnlocalizedName());
		Items.itemList.put(BLDC,BLDC.getUnlocalizedName());
		Items.itemList.put(BLDP,BLDP.getUnlocalizedName());
		Items.itemList.put(BLDB,BLDB.getUnlocalizedName());

		Items.itemList.put(GDH,GDH.getUnlocalizedName());
		Items.itemList.put(GDC,GDC.getUnlocalizedName());
		Items.itemList.put(GDP,GDP.getUnlocalizedName());
		Items.itemList.put(GDB,GDB.getUnlocalizedName());
		
		Items.itemList.put(GRDH,GRDH.getUnlocalizedName());
		Items.itemList.put(GRDC,GRDC.getUnlocalizedName());
		Items.itemList.put(GRDP,GRDP.getUnlocalizedName());
		Items.itemList.put(GRDB,GRDB.getUnlocalizedName());
		
	}
	@SideOnly(Side.CLIENT)
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName(), Strings.MODID);
	}
}
