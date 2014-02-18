package mods.roborave.edm.Handler;

import mods.roborave.edm.helper.LogHandler;
import mods.roborave.event.EDMEvent;
import net.minecraftforge.common.MinecraftForge;

public class EDMEventHandler {

    public static void init(){
    	
        MinecraftForge.EVENT_BUS.register(new EDMEvent());
        
        LogHandler.info("Event Handler Initialized");
        
    }
}