package com.circle.barrenisles.registries;

import com.circle.barrenisles.BarrenIsles;
import com.circle.barrenisles.registries.BarrenBlockRegistry;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BarrenSurfaceBuilders {
    private static final BlockState SCORCHSAND = BarrenBlockRegistry.SCORCHSAND.get().getDefaultState();
    private static final BlockState SCORCHSTONE = BarrenBlockRegistry.SCORCHSTONE.get().getDefaultState();

    public static final DeferredRegister SURFACE_BUILDERS = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, BarrenIsles.MOD_ID);


    public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> BARREN_ISLES = SURFACE_BUILDERS.register("barren_isles", () -> new BarrenSurfaceBuilders(SurfaceBuilderConfig.field_237203_a_));
    public static final SurfaceBuilderConfig BARREN_ISLES_CONFIG = new SurfaceBuilderConfig(SCORCHSAND, SCORCHSTONE, SCORCHSTONE);

    public BarrenSurfaceBuilders(Codec<SurfaceBuilderConfig> field_237203_a_) {
    }
}
