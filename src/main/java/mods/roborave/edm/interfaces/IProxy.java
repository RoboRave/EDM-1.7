package mods.roborave.edm.interfaces;

public interface IProxy {
	void loadMod();
	void load();
	void PreInit();
	void Init();
	void PostInit();
	void announce(String announcement);
}
