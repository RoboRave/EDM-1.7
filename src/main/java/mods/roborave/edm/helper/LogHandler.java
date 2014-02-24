package mods.roborave.edm.helper;

import mods.roborave.edm.lib.Strings;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHandler {
	public static Logger log;

	private static boolean configured = false;

	public static void init(){
		log = LogManager.getLogger(Strings.MODID);
		configured = true;
		//log.setParent(LogManager.getLogger("FML"));
	}

	public static void log(Level level, String message){
		if (!configured){
			init();
		}
		log.log(level, "[" + Strings.version + "] " + message, new Object[0]);
	}

	public static void info(String message) {
		log(Level.INFO, message);
	}

}