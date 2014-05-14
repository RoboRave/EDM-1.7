package mods.roborave.edm.tick;

import mods.roborave.edm.EDM;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class CommonTickHandler 
{
	public CommonTickHandler()
	{
		FMLCommonHandler.instance().bus().register(this);
	}

	@SubscribeEvent
	public void tick(TickEvent.ClientTickEvent event)
	{
		switch(event.phase)
		{
		case START :
		{
			break;
		}
		case END :
		{
			break;
		}		
		}
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event)
	{
		switch(event.phase)
		{
		case START :
		{
			break;
		}
		case END :
		{
			EDM.ticker++;
			break;
		}		
		}
	}
}