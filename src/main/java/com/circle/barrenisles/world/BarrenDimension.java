package com.circle.barrenisles.world;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Dimension;

public class BarrenDimension {
    public static final RegistryKey<Dimension> BARREN_ISLES = RegistryKey.getOrCreateKey(Registry.DIMENSION_KEY, new ResourceLocation("barren_isles"));
}
