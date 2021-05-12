package com.circle.barrenisles.util;

import com.circle.barrenisles.BarrenIsles;
import com.circle.barrenisles.client.render.DesertLizardRenderer;
import com.circle.barrenisles.client.render.ToxicGilaRenderer;
import com.circle.barrenisles.items.CustomSpawnEggItem;
import com.circle.barrenisles.registries.ModEntityType;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = BarrenIsles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {


    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityType.DESERT_LIZARD.get(), DesertLizardRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityType.TOXIC_GILA.get(), ToxicGilaRenderer::new);
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void itemColors(ColorHandlerEvent.Item event) {
        ItemColors handler = event.getItemColors();
        IItemColor eggColor = (stack, tintIndex) -> ((SpawnEggItem) stack.getItem()).getColor(tintIndex);
        for (SpawnEggItem e : CustomSpawnEggItem.UNADDED_EGGS) handler.register(eggColor, e);
    }
}
 