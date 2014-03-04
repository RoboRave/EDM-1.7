package mods.roborave.edm.helper.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesTools
{
    private String[][] recipePatterns = new String[][] {{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}};
    private Object[][] recipeItems;
    private static final String __OBFID = "CL_00000096";

    public RecipesTools()
    {
        this.recipeItems = new Object[][] {
        		{
        			Items.get("Item_Black_diamond"), 
        			Items.get("Item_Blue_diamond"), 
        			Items.get("Item_Gray_diamond"), 
        			Items.get("Item_Green_diamond"),
        			Items.get("Item_Orange_diamond")
        		}, 
        		{
        			Items.BDPX, 
        			Items.BLDPX, 
        			Items.GDPX, 
        			Items.GRDPX,
        			Items.ODPX
        		}, 
        		{
        			Items.BDSD, 
        			Items.BLDSD, 
        			Items.GDSD, 
        			Items.GRDSD,
        			Items.ODSD
        		}, 
        		{
        			Items.BDAX, 
        			Items.BLDAX, 
        			Items.GDAX,
        			Items.GRDAX, 
        			Items.ODAX, 
        		}
        	};
    }

    /**
     * Adds the tool recipes to the CraftingManager.
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