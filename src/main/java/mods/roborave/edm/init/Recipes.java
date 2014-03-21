package mods.roborave.edm.init;

import mods.roborave.edm.helper.recipes.RecipesWeapons;
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
	 
	 public static Item BDSW;
	 public static Item BLDSW;
	 public static Item GDSW;
	 public static Item GRDSW;
	 public static Item ODSW;
	 public static Item PDSW;
	 
	 public static void init()
	 {
		 Pickaxe.Init();
		 Sword.Init();
		 //(new RecipesArmor()).addRecipes();
		 //(new RecipesTools()).addRecipes();
		 (new RecipesWeapons()).addRecipes();
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
		 }
	 }
		public final static class Pickaxe
		{
			public static void Init()
			{
				BDPX = Items.BDPX;
				GameRegistry.addRecipe(new ItemStack(BDPX,1), new Object[] {"XXX", " # ", " # ", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.BD});
		
				BLDPX = Items.BLDPX;
				GameRegistry.addRecipe(new ItemStack(BLDPX,1), new Object[] {"XXX", " # ", " # ", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.BLD});
		
				GDPX = Items.GDPX;
				GameRegistry.addRecipe(new ItemStack(GDPX,1), new Object[] {"XXX", " # ", " # ", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.GD});
		
				GRDPX = Items.GRDPX;
				GameRegistry.addRecipe(new ItemStack(GRDPX,1), new Object[] {"XXX", " # ", " # ",Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.GRD});
		
				ODPX = Items.ODPX;
				GameRegistry.addRecipe(new ItemStack(ODPX,1), new Object[] {"XXX", " # ", " # ", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.OD});
		}
	}
}
