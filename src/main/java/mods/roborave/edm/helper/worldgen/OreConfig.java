package mods.roborave.edm.helper.worldgen;

public class OreConfig {
	public String name;
	public boolean enabled;
	public int harvestLevel;

	public OreConfig(String oreName, boolean oreEnabled, int hLevel) {
		this.name = oreName;
		this.enabled = true;
		this.harvestLevel = hLevel;
	}

}