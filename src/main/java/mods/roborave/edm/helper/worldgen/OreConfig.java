package mods.roborave.edm.helper.worldgen;

import mods.roborave.edm.helper.ore.OreDrops;
import mods.roborave.edm.helper.ore.OreSources;

public class OreConfig {
	public String name;
	public boolean enabled;
	public int harvestLevel;
	public OreDrops drops;
	public OreSources source;

	public OreConfig(String oreName, boolean oreEnabled, int hLevel, OreDrops oreDrops) {
		this.name = oreName;
		this.enabled = true;
		this.harvestLevel = hLevel;
		this.drops = oreDrops;
	}

}