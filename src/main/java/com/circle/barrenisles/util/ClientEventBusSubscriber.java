package com.circle.barrenisles.util;

import com.circle.barrenisles.BarrenIsles;
import com.circle.barrenisles.client.render.DesertLizardRenderer;
import com.circle.barrenisles.client.render.ToxicGilaRenderer;
import com.circle.barrenisles.registries.BarrenEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BarrenIsles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {


    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(BarrenEntityType.DESERT_LIZARD.get(), DesertLizardRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(BarrenEntityType.TOXIC_GILA.get(), ToxicGilaRenderer::new);
    }

}
 