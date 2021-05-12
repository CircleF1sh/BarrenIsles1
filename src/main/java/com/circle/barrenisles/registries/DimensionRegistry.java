package com.circle.barrenisles.registries;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.DimensionType;

public class DimensionRegistry {

    public static final RegistryKey<DimensionType> BARREN_ISLES = RegistryKey.getOrCreateKey(Registry.DIMENSION_TYPE_KEY, new ResourceLocation("barren_isles"));
}
