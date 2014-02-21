package mods.roborave.edm;
import java.util.Arrays;

import mods.roborave.edm.common.CommonProxy;
import mods.roborave.edm.config.Config;
import mods.roborave.edm.helper.LogHandler;
import mods.roborave.edm.helper.VersionChecker;
import mods.roborave.edm.lib.Reference;
import mods.roborave.edm.lib.Strings;
import mods.roborave.edm.server.command.EDMCommand;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class EDM
{
	
	@Instance(Strings.MODID)
	public static EDM Instance;
	
	@SidedProxy(
			clientSide="mods.roborave.edm.client.ClientProxy",
			serverSide="mods.roborave.edm.common.CommonProxy")
	public static CommonProxy proxy;
	
	public static LogHandler log;
	public Strings lib;
	
	public static CreativeTabs tabEDMBlock;
	
	public static final Block TutChest=(Block)Block.blockRegistry.getObject("Tut_Chest");
	
	/**
	 * Loads before
	 * @param PreEvent
	 */
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		
		ModMetadata meta = event.getModMetadata();
		meta.autogenerated = false;
		meta.credits = "(C) Roborave, 2013-2014";
		meta.authorList = Arrays.asList("Roborave");
		meta.name = Strings.name;
		meta.version = Strings.version;
		meta.description = "This mod Adds more diamonds to the game of minecraft.";	
	
		VersionChecker.registerMod(meta);
		Reference.logger = event.getModLog();
		Reference.config = new Config(event.getSuggestedConfigurationFile());
		Reference.config.save();
		
		proxy.PreInit();
    }
	
	/**
	 * Loads during
	 * @param event
	 */
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
	
	proxy.loadMod();
	proxy.registerRenderThings();
	
	if(Reference.config.checkForUpdates()) {
		VersionChecker.startVersionCheck();
	}

	proxy.registerTickers();
	}
	
	/**
	 * Loads after
	 * @param event
	 */
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@EventHandler
	@Subscribe
	public void serverStarting(FMLServerStartingEvent evt)
	{
		 evt.registerServerCommand(new EDMCommand(evt.getServer()));
	}

	
	
}
