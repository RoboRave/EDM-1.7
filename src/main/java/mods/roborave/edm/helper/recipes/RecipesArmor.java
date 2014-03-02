package mods.roborave.edm.helper.recipes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesArmor
{
    private String[][] recipePatterns = new String[][] {{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Object[][] recipeItems;
    public RecipesArmor()
    {
        this.recipeItems = new Object[][] 
        {
        		{
        			mods.roborave.edm.init.Items.get("Item_Black_diamond"),
        			mods.roborave.edm.init.Items.get("Item_Blue_diamond"),
        			mods.roborave.edm.init.Items.get("Item_Gold_diamond"), 
        			mods.roborave.edm.init.Items.get("Item_Green_diamond")
        		}, 
        		{
        			mods.roborave.edm.init.Items.get("Black_Diamond_Helm"), 
        			mods.roborave.edm.init.Items.get("Blue_Diamond_Helm"), 
        			mods.roborave.edm.init.Items.get("Gray_Diamond_Helm"), 
        			mods.roborave.edm.init.Items.get("Green_Diamond_Helm"),
        		}, 
        		{
            		mods.roborave.edm.init.Items.get("Black_Diamond_Chest"), 
            		mods.roborave.edm.init.Items.get("Blue_Diamond_Chest"),
            		mods.roborave.edm.init.Items.get("Gray_Diamond_Chest"),
            		mods.roborave.edm.init.Items.get("Green_Diamond_Chest"),
            	}, 
            	{
            		mods.roborave.edm.init.Items.get("Black_Diamond_Pants"), 
            		mods.roborave.edm.init.Items.get("Blue_Diamond_Pants"), 
            		mods.roborave.edm.init.Items.get("Gray_Diamond_Pants"), 
            		mods.roborave.edm.init.Items.get("Green_Diamond_Pants"), 
            	}, 
            	{
            		mods.roborave.edm.init.Items.get("Black_Diamond_Boots"),
            		mods.roborave.edm.init.Items.get("Blue_Diamond_Boots"), 
            		mods.roborave.edm.init.Items.get("Gray_Diamond_Boots"), 
            		mods.roborave.edm.init.Items.get("Green_Diamond_Boots"), 
            	}
          };
    }

    /**
     * Adds the armor recipes to the CraftingManager.
     */
    public void addRecipes()
    {
        for (int i = 0; i < this.recipeItems[0].length; ++i)
        {
            Object object = this.recipeItems[0][i];

            for (int j = 0; j < this.recipeItems.length - 1; ++j)
            {
                Item item = (Item)this.recipeItems[j + 1][i];
                GameRegistry.addRecipe(new ItemStack(item), new Object[] {this.recipePatterns[j], 'X', object});
            }
        }
    }
}