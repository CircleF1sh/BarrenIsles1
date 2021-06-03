package com.circle.barrenisles.registries;

import com.circle.barrenisles.BarrenIsles;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Dimension;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.DimensionSettings;


public class BarrenDimensionRegistry {
    public static final RegistryKey<DimensionType> BARREN_DIMENSION = RegistryKey.getOrCreateKey(Registry.DIMENSION_TYPE_KEY, name("barren"));
    public static final RegistryKey<Dimension> BARREN_WORLD = RegistryKey.getOrCreateKey(Registry.DIMENSION_KEY, name("barren"));

    private static ResourceLocation name(String name) {
        return new ResourceLocation(BarrenIsles.MOD_ID, name);
    }
}
