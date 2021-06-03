package com.circle.barrenisles;

import com.circle.barrenisles.entities.desert_lizard.DesertLizardEntity;
import com.circle.barrenisles.registries.*;
import com.circle.barrenisles.world.gen.BarrenOreGeneration;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("barrenisles")
public class BarrenIsles
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "barrenisles";
    public static final ItemGroup BARREN_GROUP = new BarrenGroup("barrentab");

    public BarrenIsles() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
                bus.addListener(this::setup);
                bus.addListener(EventPriority.HIGH, BarrenBiomeRegistry::biomeLoading);

        BarrenItemRegistry.ITEMS.register(bus);
        BarrenBlockRegistry.BLOCKS.register(bus);
        BarrenEntityType.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        BarrenBiomeRegistry.BIOMES.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, BarrenOreGeneration::generateOres);
    }
    private void setup(final FMLCommonSetupEvent event) {

        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(BarrenEntityType.DESERT_LIZARD.get(), DesertLizardEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(BarrenEntityType.TOXIC_GILA.get(), DesertLizardEntity.setCustomAttributes().create());
        });
    }

    public static class BarrenGroup extends ItemGroup {

        public BarrenGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return BarrenItemRegistry.DUNERAPTOR_CLAW.get().getDefaultInstance();
        }
    }




    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
