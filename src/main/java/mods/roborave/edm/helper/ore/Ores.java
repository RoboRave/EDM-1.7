package mods.roborave.edm.helper.ore;

import mods.roborave.edm.helper.worldgen.OreConfig;

public enum Ores {
	Black (3),
	Blue (3),
	Gold (3),
	Gray (3),
	Green (3),
	Orange (3),
	Pink (3),
	Purple (3),
	Red (3),
	White (3),
	Yellow (3);
	
	private String _name;
	private boolean _enabled;
	private int _harvestLevel;
	
	private Ores(int harvestLevel) {
		this._name = this.name()+"_diamond_Ore";
		this._enabled = true;
		this._harvestLevel = harvestLevel;
	}

	public OreConfig getDefaultConfig() {
		return new OreConfig(this._name, this._enabled, this._harvestLevel);
	}

	public boolean enabled() {
		return this._enabled;
	}

	public String oreName() {
		return this._name;
	}
}