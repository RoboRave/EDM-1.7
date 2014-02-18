package mods.mud.chat;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class ChatMessageHandler {

    private static final IChatComponent SkcChatComponent = createSckChatComponent("EDM".toUpperCase());

    public static void iCommandSenderReply(ICommandSender player, String message) {
        sendChatToPlayer((EntityClientPlayerMP)player, message);
    }

    private static IChatComponent createSckChatComponent(String string) {
        ChatComponentText Component = new ChatComponentText(string);
          return Component;
    }

    public static IChatComponent createChatComponent(String message) {
        ChatComponentText component = new ChatComponentText(message);
        return SkcChatComponent.appendSibling(component);
    }

    public static void sendChatToPlayer(EntityClientPlayerMP player, String message) {
        player.addChatMessage(createChatComponent(message));
    }

    public static void broadcastMessageToPlayers(String message){
        MinecraftServer.getServer().getConfigurationManager().sendChatMsg(createChatComponent(message));
    }
}