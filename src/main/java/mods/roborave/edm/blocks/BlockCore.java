package mods.roborave.edm.blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashMultimap;

import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCore extends net.minecraft.block.Block {
	@SuppressWarnings("unchecked")
	public BlockCore(Material material, String blockName) {
		super(material);
		this.setBlockName(blockName); // name
		this.setBlockTextureName(Strings.MODID +":" + blockName); // texture
		this.setCreativeTab(CreativeTabs.tabBlock);
		Blocks.blockList.put(blockName, this);
		GameRegistry.registerBlock(this, blockName);
	}
	

}
