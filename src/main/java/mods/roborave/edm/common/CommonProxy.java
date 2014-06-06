package mods.roborave.edm.common;

import mods.roborave.edm.helper.ore.generate.EDMWorld;
import mods.roborave.edm.init.Armor;
import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.init.Items;
import mods.roborave.edm.init.Recipes;
import mods.roborave.edm.interfaces.IProxy;
import mods.roborave.edm.tick.VersionTicker;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;

public class CommonProxy implements IProxy
{

	@Override
	public void PreInit() 
	{
		Blocks.init();
		Items.init();
		Armor.init();
		Recipes.init();
		
	}

	@Override
	public void Init() 
	{
		EDMWorld.init();
	}

	public World getClientWorld() 
	{
		return null;
	}

	public void registerTickers() 
	{
		FMLCommonHandler.instance().bus().register(new VersionTicker());
	}
	public void announce(String announcement)
    {
        FMLCommonHandler.instance().getMinecraftServerInstance().logInfo(announcement);
    }
}
