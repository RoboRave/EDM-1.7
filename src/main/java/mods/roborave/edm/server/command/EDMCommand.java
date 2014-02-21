package mods.roborave.edm.server.command;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;

public class EDMCommand extends CommandBase
{
	@SuppressWarnings("unused")
	private MinecraftServer server;
	
    private String Version="300";
    
    public String ID= "EDM";
    
	private String Url="http://www.minecraftforum.net/topic/2059368-";
	
	private static String VersionUrl = "https://dl.dropboxusercontent.com/u/100336313/minecraft/mods/";

    public EDMCommand(MinecraftServer server)
    {
        this.server = server;
    }
    @SuppressWarnings("unused")
	private static final DecimalFormat timeFormatter = new DecimalFormat("########0.000");

    @Override
    public String getCommandName()
    {
        return "edm";
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender)
    {
        return "commands.edm.usage";
    }

    @Override
    public int getRequiredPermissionLevel()
    {
        return 0;
    }
    @Override
    public void processCommand(ICommandSender sender, String[] args)
    {
        if (args.length == 0)
        {
            throw new WrongUsageException("commands.edm.usage");
        }
        else if ("version".equals(args[0]))
        {
            displayVersion(sender,args);
        }
        else if ("help".equals(args[0]))
        {
            displayHelp(sender,args);
        }
        else
        {
            throw new WrongUsageException("commands.edm.usage");
        }
    }

    private void displayVersion(ICommandSender sender, String[] args)
    {
    	    	String ModName = ID;

    			try {

    				URL url = new URL(VersionUrl + ModName + "/version/1.7.2/1.7.2.version");
    		        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    		        String Result = in.readLine();
    		        in.close();

    		        int newVersion = Integer.parseInt(Result);
    		        int oldVersion = Integer.parseInt(Version);

    				if (oldVersion < newVersion) {

    					sender.addChatMessage(new ChatComponentTranslation("message.outdated",ID,Url,Result));

    				} else if (oldVersion == newVersion) {

    					sender.addChatMessage(new ChatComponentTranslation("message.uptodate",ID,Result));

    				} else {
    					
    					sender.addChatMessage(new ChatComponentTranslation("message.error.version",ID));
    					
    					}
    				
    				} catch (Exception e) {
    					
    					e.printStackTrace();
    					
    					sender.addChatMessage(new ChatComponentTranslation("message.error.version",ID));

    			}

    	    }
    	
    	private void displayHelp(ICommandSender sender, String[] args)
    	{
    		sender.addChatMessage(new ChatComponentTranslation("message.version.help",ID));
    	}
    
    }