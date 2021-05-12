package com.circle.barrenisles;

import com.circle.barrenisles.entities.desert_lizard.DesertLizardEntity;
import com.circle.barrenisles.registries.BlockRegistry;
import com.circle.barrenisles.registries.ItemRegistry;
import com.circle.barrenisles.registries.ModEntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.antlr.v4.runtime.misc.MurmurHash;
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

        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCKS.register(bus);
        ModEntityType.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    private void setup(final FMLCommonSetupEvent event) {

        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityType.DESERT_LIZARD.get(), DesertLizardEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityType.TOXIC_GILA.get(), DesertLizardEntity.setCustomAttributes().create());
        });
    }

    public static class BarrenGroup extends ItemGroup {

        public BarrenGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ItemRegistry.DUNERAPTOR_CLAW.get().getDefaultInstance();
        }
    }
}
