package mods.roborave.edm.common;

import mods.roborave.edm.helper.LocalizationHandler;
import mods.roborave.edm.init.Armor;
import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.init.Items;
import mods.roborave.edm.interfaces.IProxy;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.ClientRegistry;

public class CommonProxy implements IProxy
{

	@Override
	public void loadMod() 
	{
		
	}

	@Override
	public void load() 
	{
		
	}

	@Override
	public void PreInit() 
	{
		LocalizationHandler.init();
		Blocks.init();
		Items.init();
		Armor.init();
		Blocks.TestBlocks();
	}

	@Override
	public void Init() 
	{
		
	}

	@Override
	public void PostInit() 
	{

	}

	public void registerRenderThings() 
	{
		// TODO Auto-generated method stub
	}

	public World getClientWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerTickers() {
		// TODO Auto-generated method stub
		
	}
}
