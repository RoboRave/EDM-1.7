package mods.roborave.edm.helper.ore;

import java.io.File;

import mods.roborave.edm.EDM;
import mods.roborave.edm.helper.LogHandler;
import mods.roborave.edm.helper.worldgen.OreConfig;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {
	private static final String CAT_ORES = "ores";
	private static final String CAT_ORE_GEN = "ore_generation";
	public static FMLPreInitializationEvent event;
	private static LogHandler log = EDM.Instance.getLogger();
	private static boolean configured;
	private static Configuration configFile;

	public static void init(FMLPreInitializationEvent event) 
	{
		log.info("Initializing Configuration");
		configFile = new Configuration(new File(event.getModConfigurationDirectory()+"ores.cfg"));
		configured = true;
	}

	public void load() {
		if (!configured) {
			log.info("Error - configuration not initialized!");
			return;
		}
		log.info("Loading Configuration");
		configFile.load();

		configFile.addCustomCategoryComment(CAT_ORES, "Ore configuration = oreEnabled,oreSource");
		//configFile.addCustomCategoryComment(CAT_ORES, "oreEnabled = true or false   // enables or disables the ore");
		//configFile.addCustomCategoryComment(CAT_ORES, "oreSource = DEFAULT          // sets the ore source, DEFAULT is mod gen, used to generate ores from other mods");
	}

	public void save() {
		if (!configured) {
			log.info("Error - configuration not initialized!");
			return;		
		}
		log.info("Saving Configuration");
		if (configFile.hasChanged())
			configFile.save();
	}

	private static boolean getProp(String key, boolean defaultValue, String comment) {
		Property prop = configFile.get(Configuration.CATEGORY_GENERAL, key, defaultValue);
		if (comment != "")
			prop.comment = comment;
		return prop.getBoolean(defaultValue);
	}

	@SuppressWarnings("unused")
	private static boolean getProp(String key, boolean defaultValue) {
		return getProp(key, defaultValue, "");
	}

	private static String getProp(String key, String defaultValue, String comment) {
		Property prop = configFile.get(Configuration.CATEGORY_GENERAL, key, defaultValue);
		if (comment != "")
			prop.comment = comment;
		return prop.getString();
	}

	@SuppressWarnings("unused")
	private static String getProp(String key, String defaultValue) {
		return getProp(key, defaultValue, "");
	}

	public static String getCatOreGen() {
		return CAT_ORE_GEN;
	}
}