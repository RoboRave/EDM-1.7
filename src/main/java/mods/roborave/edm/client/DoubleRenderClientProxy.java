package mods.roborave.edm.client;

import mods.roborave.edm.common.DoubleRenderCommonProxy;
import mods.roborave.edm.render.FrozenDiamondRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class DoubleRenderClientProxy extends DoubleRenderCommonProxy {

        public static int frozenDiamondRenderType;
        public static int renderPass;
        
        public static void setCustomRenderers()
        {
        	DoubleRenderClientProxy.renderPass= 0;
                frozenDiamondRenderType = RenderingRegistry.getNextAvailableRenderId();
                RenderingRegistry.registerBlockHandler(new FrozenDiamondRenderer());
        }
        
}