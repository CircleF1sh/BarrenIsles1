package com.circle.barrenisles.world.gen.surfacebuilder;

import com.circle.barrenisles.registries.BarrenSurfaceBuilders;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class BarrenIslesSurfaceBuilder {

    public BarrenIslesSurfaceBuilder(Codec<SurfaceBuilderConfig> p_i232129_1_) {
        super(p_i232129_1_);
    }

    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        if (noise > 1.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, BarrenSurfaceBuilders.BARREN_ISLES_CONFIG);
        }

    }
}
