package mods.roborave.event;

import mods.roborave.edm.chat.ChatMessageHandler;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerLoginEvent {

    public static void playerLogin(EntityPlayer player) {
    	
    	ChatMessageHandler.broadcastMessageToPlayers(player.getDisplayName()+ " is testing chat messages");

    }
}