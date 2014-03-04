package mods.roborave.edm.helper.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.roborave.edm.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesWeapons
{
    private String[][] recipePatterns = new String[][] {{"X", "X", "#"}};
    private Object[][] recipeItems;
    private static final String __OBFID = "CL_00000097";

    public RecipesWeapons()
    {
        this.recipeItems = new Object[][] 
        {
        		{
        			Items.get("Item_Black_diamond"), 
        			Items.get("Item_Blue_diamond"), 
        			Items.get("Item_Gray_diamond"), 
        			Items.get("Item_Green_diamond"), 
        			Items.get("Item_Orange_diamond")
        		}, 
        		{
        			Items.BDSW,
        			Items.BLDSW, 
        			Items.GDSW, 
        			Items.GRDSW, 
        			Items.ODSW
        		}
        };
    }

    /**
     * Adds the weapon recipes to the CraftingManager.
     */
    public void addRecipes()
    {
        for (int i = 0; i < this.recipeItems[0].length; ++i)
        {
            Object object = this.recipeItems[0][i];

            for (int j = 0; j < this.recipeItems.length - 1; ++j)
            {
                Item item = (Item)this.recipeItems[j + 1][i];
               GameRegistry.addRecipe(new ItemStack(item), new Object[] {this.recipePatterns[j], '#', net.minecraft.init.Items.stick, 'X', object});
            }
        }

    }
}