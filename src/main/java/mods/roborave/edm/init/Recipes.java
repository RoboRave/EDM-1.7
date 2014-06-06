package mods.roborave.edm.init;

import mods.roborave.edm.helper.recipes.RecipesArmor;
import mods.roborave.edm.helper.recipes.RecipesTools;
import mods.roborave.edm.helper.recipes.SmeltOre;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	 public static Item BDPX;
	 public static Item BLDPX;
	 public static Item GDPX;
	 public static Item GRDPX;
	 public static Item ODPX;
	 public static Item PDPX;
	 public static Item PUDPX;
	 public static Item RDPX;
	 
	 public static Item BDSW;
	 public static Item BLDSW;
	 public static Item GDSW;
	 public static Item GRDSW;
	 public static Item ODSW;
	 public static Item PDSW;
	 public static Item PUDSW;
	 public static Item RDSW;
	 public static Item WDSW;
	 public static Item YDSW;
	 
	 public static void init()
	 {
		 Sword.Init();
		 (new RecipesArmor()).addRecipes();
		 (new RecipesTools()).addRecipes();
		 (new SmeltOre()).addRecipes();
		
	 }
	
	 public final static class Sword
	 {
		public static void Init()
		{
			 	BDSW = Items.BDSW;
				GameRegistry.addRecipe(new ItemStack(BDSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.BD});
		
				BLDSW = Items.BLDSW;
				GameRegistry.addRecipe(new ItemStack(BLDSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.BLD});
		
				GDSW = Items.GDSW;
				GameRegistry.addRecipe(new ItemStack(GDSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.GD});
		
				GRDSW = Items.GRDSW;
				GameRegistry.addRecipe(new ItemStack(GRDSW,1), new Object[] {"X", "X", "#",Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.GRD});
		
				ODSW = Items.ODSW;
				GameRegistry.addRecipe(new ItemStack(ODSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.OD});
				
				PDSW = Items.PDSW;
				GameRegistry.addRecipe(new ItemStack(PDSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.PD});
				
				PUDSW = Items.PUDSW;
				GameRegistry.addRecipe(new ItemStack(PUDSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.PUD});
		 
				RDSW = Items.RDSW;
				GameRegistry.addRecipe(new ItemStack(RDSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.RD});
				
				WDSW = Items.WDSW;
				GameRegistry.addRecipe(new ItemStack(WDSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.WD});
				
				YDSW = Items.YDSW;
				GameRegistry.addRecipe(new ItemStack(YDSW,1), new Object[] {"X", "X", "#", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.YD});
		}
	 }
}
