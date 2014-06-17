package mods.roborave.edm.api.plugin;

import mods.common.addon.plugin.Plugin;
import mods.common.addon.plugin.PluginMetadata;
import mods.common.addon.plugin.common.Info;

/**
 * @author Zach
 *
 */
@Info(name = "EDM", version = "3.1.5")
public class EDMPlugin implements Plugin
{

	@Override
	public void preInit()
	{
	//TODO fix this 
	//McLogger
	}

	@Override
	public void init()
	{
		
	}

	@Override
	public void postInit()
	{
		
	}

	@Override
	public PluginMetadata meta()
	{
		return new PluginMetadata(this.getClass());
	}

	@Override
	public String desc()
	{
		return "this a plugin for my mod EDM";
	}
	
}
