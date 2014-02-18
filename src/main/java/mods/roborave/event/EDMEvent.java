package mods.roborave.event;

import mods.roborave.edm.EDM;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class EDMEvent {

    @SuppressWarnings("static-access")
	@SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
    	
        PlayerLoginEvent.playerLogin(event.player);
        
        EDM.log.info(event.player.getDisplayName() + " logged In!");
        
    }

}