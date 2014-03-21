package mods.roborave.edm.helper;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Some armor utilities
 */
public class ArmorHelper
{
    
    /**
     * Adds string key/value to specified itemstack
     * 
     * @param item
     *            Itemstack to add string for
     * @param key
     *            Key
     * @param value
     *            Value
     */
    public static void addStringToNBT(ItemStack item, String key, String value)
    {
        if (item.stackTagCompound == null)
        {
            item.setTagCompound(new NBTTagCompound());
        }
        
        item.stackTagCompound.setString(key, value);
    }
    
    /**
     * Gets string from itemstack's NBT Tag Compound
     * 
     * @param item
     *            Itemstack to get string from
     * @param key
     *            Key
     * @return String from itemstack.
     */
    public static String getStringFromNBT(ItemStack item, String key)
    {
        if (item.stackTagCompound == null)
        {
            item.setTagCompound(new NBTTagCompound());
        }
        
        return item.stackTagCompound.getString(key);
    }
}