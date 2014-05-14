package mods.roborave.edm.init;

import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.items.armor.ItemBoots;
import mods.roborave.edm.items.armor.ItemChest;
import mods.roborave.edm.items.armor.ItemHelmat;
import mods.roborave.edm.items.armor.ItemLegs;
import mods.roborave.edm.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import cpw.mods.fml.common.registry.GameRegistry;

public class Armor 
{
	
	public static HashMap<String , Item> itemList = new HashMap<String , Item>(); 
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
	
	public static ItemArmor RDH;
	public static ItemArmor RDC;
	public static ItemArmor RDP;
	public static ItemArmor RDB;
	
	public static ItemArmor WDH;
	public static ItemArmor WDC;
	public static ItemArmor WDP;
	public static ItemArmor WDB;
	
	public static ItemArmor YDH;
	public static ItemArmor YDC;
	public static ItemArmor YDP;
	public static ItemArmor YDB;
	
	public static void init()
	{
		
		EDM.Instance.getLogger().info("Initializing Armor");
        BDH = (ItemArmor) new ItemHelmat(ClientProxy.Black_Diamonds,1, "Black").setUnlocalizedName("Black_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        BDC= (ItemArmor) new ItemChest(ClientProxy.Black_Diamonds,2 ,"Black").setUnlocalizedName("Black_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        BDP= (ItemArmor) new ItemLegs(ClientProxy.Black_Diamonds, 3,"Black").setUnlocalizedName("Black_Diamond_Legs").setCreativeTab(EDM.tabEDMArmor);
        BDB= (ItemArmor) new ItemBoots(ClientProxy.Black_Diamonds, 4,"Black").setUnlocalizedName("Black_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        BLDH= (ItemArmor) new ItemHelmat(ClientProxy.Blue_Diamonds, 1, "Blue").setUnlocalizedName("Blue_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        BLDC= (ItemArmor) new ItemChest(ClientProxy.Blue_Diamonds,  2, "Blue").setUnlocalizedName("Blue_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        BLDP= (ItemArmor) new ItemLegs(ClientProxy.Blue_Diamonds, 3, "Blue").setUnlocalizedName("Blue_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        BLDB= (ItemArmor) new ItemBoots(ClientProxy.Blue_Diamonds, 4,"Blue").setUnlocalizedName("Blue_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        GDH= (ItemArmor) new ItemHelmat(ClientProxy.Gray_Diamonds,1, "Gray").setUnlocalizedName("Gray_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        GDC= (ItemArmor) new ItemChest(ClientProxy.Gray_Diamonds,2,"Gray").setUnlocalizedName("Gray_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        GDP= (ItemArmor) new ItemLegs(ClientProxy.Gray_Diamonds,3,"Gray").setUnlocalizedName("Gray_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        GDB= (ItemArmor) new ItemBoots(ClientProxy.Gray_Diamonds,4,"Gray").setUnlocalizedName("Gray_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        GRDH= (ItemArmor) new ItemHelmat(ClientProxy.Green_Diamonds, 1,"Green").setUnlocalizedName("Green_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        GRDC= (ItemArmor) new ItemChest(ClientProxy.Green_Diamonds, 2,"Green").setUnlocalizedName("Green_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        GRDP= (ItemArmor) new ItemLegs(ClientProxy.Green_Diamonds, 3,"Green").setUnlocalizedName("Green_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        GRDB= (ItemArmor) new ItemBoots(ClientProxy.Green_Diamonds, 4,"Green").setUnlocalizedName("Green_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        ODH= (ItemArmor) new ItemHelmat(ClientProxy.Orange_Diamonds,1, "Orange").setUnlocalizedName("Orange_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        ODC= (ItemArmor) new ItemChest(ClientProxy.Orange_Diamonds,2,"Orange").setUnlocalizedName("Orange_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        ODP= (ItemArmor) new ItemLegs(ClientProxy.Orange_Diamonds,3,"Orange").setUnlocalizedName("Orange_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        ODB= (ItemArmor) new ItemBoots(ClientProxy.Orange_Diamonds,4,"Orange").setUnlocalizedName("Orange_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
       
        PDH= (ItemArmor) new ItemHelmat(ClientProxy.Pink_Diamonds,1, "Pink").setUnlocalizedName("Pink_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        PDC= (ItemArmor) new ItemChest(ClientProxy.Pink_Diamonds,2,"Pink").setUnlocalizedName("Pink_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        PDP= (ItemArmor) new ItemLegs(ClientProxy.Pink_Diamonds,3,"Pink").setUnlocalizedName("Pink_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        PDB= (ItemArmor) new ItemBoots(ClientProxy.Pink_Diamonds,4,"Pink").setUnlocalizedName("Pink_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
        
        PUDH= (ItemArmor) new ItemHelmat(ClientProxy.Purple_Diamonds,1, "Purple").setUnlocalizedName("Purple_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        PUDC= (ItemArmor) new ItemChest(ClientProxy.Purple_Diamonds,2,"Purple").setUnlocalizedName("Purple_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        PUDP= (ItemArmor) new ItemLegs(ClientProxy.Purple_Diamonds,3,"Purple").setUnlocalizedName("Purple_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        PUDB= (ItemArmor) new ItemBoots(ClientProxy.Purple_Diamonds,4,"Purple").setUnlocalizedName("Purple_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        RDH= (ItemArmor) new ItemHelmat(ClientProxy.Red_Diamonds,1, "Red").setUnlocalizedName("Red_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        RDC= (ItemArmor) new ItemChest(ClientProxy.Red_Diamonds,2,"Red").setUnlocalizedName("Red_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        RDP= (ItemArmor) new ItemLegs(ClientProxy.Red_Diamonds,3,"Red").setUnlocalizedName("Red_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        RDB= (ItemArmor) new ItemBoots(ClientProxy.Red_Diamonds,4,"Red").setUnlocalizedName("Red_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
        
        WDH= (ItemArmor) new ItemHelmat(ClientProxy.White_Diamonds,1, "White").setUnlocalizedName("White_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        WDC= (ItemArmor) new ItemChest(ClientProxy.White_Diamonds,2,"White").setUnlocalizedName("White_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        WDP= (ItemArmor) new ItemLegs(ClientProxy.White_Diamonds,3,"White").setUnlocalizedName("White_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        WDB= (ItemArmor) new ItemBoots(ClientProxy.White_Diamonds,4,"White").setUnlocalizedName("White_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
        
        YDH= (ItemArmor) new ItemHelmat(ClientProxy.Yellow_Diamonds,1, "Yellow").setUnlocalizedName("Yellow_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        YDC= (ItemArmor) new ItemChest(ClientProxy.Yellow_Diamonds,2,"Yellow").setUnlocalizedName("Yellow_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        YDP= (ItemArmor) new ItemLegs(ClientProxy.Yellow_Diamonds,3,"Yellow").setUnlocalizedName("Yellow_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        YDB= (ItemArmor) new ItemBoots(ClientProxy.Yellow_Diamonds,4,"Yellow").setUnlocalizedName("Yellow_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
        
        
        
        
        registerArmorSet(BDH,BDC,BDP,BDB);
		
        registerArmorSet(BLDH,BLDC,BLDP,BLDB);

        registerArmorSet(GDH,GDC,GDP,GDB);
		
        registerArmorSet(GRDH,GRDC,GRDP,GRDB);

        registerArmorSet(ODH,ODC,ODP,ODB);
        
        registerArmorSet(PDH,PDC,PDP,PDB);
        
        registerArmorSet(PUDH,PUDC,PUDP,PUDB);
        
		registerArmorSet(RDH,RDC,RDP,RDB);
		
		registerArmorSet(WDH,WDC,WDP,WDB);
		
		registerArmorSet(YDH,YDC,YDP,YDB);
		
		itemList.put(BDH.getUnlocalizedName(),BDH);
		itemList.put(BDC.getUnlocalizedName(),BDC);
		itemList.put(BDP.getUnlocalizedName(),BDP);
		itemList.put(BDB.getUnlocalizedName(),BDB);
		
		itemList.put(BLDH.getUnlocalizedName(),BLDH);
		itemList.put(BLDC.getUnlocalizedName(),BLDC);
		itemList.put(BLDP.getUnlocalizedName(),BLDP);
		itemList.put(BLDB.getUnlocalizedName(),BLDB);

		itemList.put(GDH.getUnlocalizedName(),GDH);
		itemList.put(GDC.getUnlocalizedName(),GDC);
		itemList.put(GDP.getUnlocalizedName(),GDP);
		itemList.put(GDB.getUnlocalizedName(),GDB);
		
		itemList.put(GRDH.getUnlocalizedName(),GRDH);
		itemList.put(GRDC.getUnlocalizedName(),GRDC);
		itemList.put(GRDP.getUnlocalizedName(),GRDP);
		itemList.put(GRDB.getUnlocalizedName(),GRDB);
		
		itemList.put(ODH.getUnlocalizedName(),ODH);
		itemList.put(ODC.getUnlocalizedName(),ODC);
		itemList.put(ODP.getUnlocalizedName(),ODP);
		itemList.put(ODB.getUnlocalizedName(),ODB);
		
		itemList.put(PDH.getUnlocalizedName(),PDH);
		itemList.put(PDC.getUnlocalizedName(),PDC);
		itemList.put(PDP.getUnlocalizedName(),PDP);
		itemList.put(PDB.getUnlocalizedName(),PDB);
		
		itemList.put(PUDH.getUnlocalizedName(),PUDH);
		itemList.put(PUDC.getUnlocalizedName(),PUDC);
		itemList.put(PUDP.getUnlocalizedName(),PUDP);
		itemList.put(PUDB.getUnlocalizedName(),PUDB);
		
		itemList.put(RDH.getUnlocalizedName(),RDH);
		itemList.put(RDC.getUnlocalizedName(),RDC);
		itemList.put(RDP.getUnlocalizedName(),RDP);
		itemList.put(RDB.getUnlocalizedName(),RDB);
		
		itemList.put(WDH.getUnlocalizedName(),WDH);
		itemList.put(WDC.getUnlocalizedName(),WDC);
		itemList.put(WDP.getUnlocalizedName(),WDP);
		itemList.put(WDB.getUnlocalizedName(),WDB);
		
		itemList.put(YDH.getUnlocalizedName(),YDH);
		itemList.put(YDC.getUnlocalizedName(),YDC);
		itemList.put(YDP.getUnlocalizedName(),YDP);
		itemList.put(YDB.getUnlocalizedName(),YDB);
		
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
