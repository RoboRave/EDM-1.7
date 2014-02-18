package mods.roborave.edm.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import net.minecraft.command.ICommandSender;
import mods.roborave.edm.EDM;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.ChatComponentTranslation;

public class Version {

	
	private static String VersionUrl = "https://dl.dropboxusercontent.com/u/100336313/minecraft/mods/";

    public static void check(String ID, String Version, String Url){        

    	String ModName = ID;

		try {

			URL url = new URL(VersionUrl + ModName + "/Versions/1.7.2.version");
	        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
	        String Result = in.readLine();
	        in.close();

	        int newVersion = Integer.parseInt(Result.substring(6));
	        int oldVersion = Integer.parseInt(Version.substring(6));

			if (oldVersion < newVersion) {

				EDM.Instance.player.addChatComponentMessage(new ChatComponentTranslation("message.outdated",ID,Url,Version));

			} else if (oldVersion == newVersion) {

				EDM.Instance.player.addChatComponentMessage(new ChatComponentTranslation("message.uptodate",ID,Version));

			} else {

				EDM.Instance.player.addChatComponentMessage(new ChatComponentTranslation("[" + ID + "] Could not check the version of " + ModName + "!"));

			}

		} catch (Exception e) {

			EDM.Instance.player.addChatComponentMessage(new ChatComponentTranslation("[" + ID + "] Could not check the version of " + ModName + "!"));

		}

    }
}