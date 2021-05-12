package com.circle.barrenisles.registries;

import com.circle.barrenisles.BarrenIsles;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BiomeRegistry {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, BarrenIsles.MOD_ID);

    static {
        createBiome("barren_isles", BiomeMaker::makeVoidBiome);
    }

    public static RegistryObject<Biome> createBiome(String name, Supplier<Biome> biome) {
        return BIOMES.register(name, biome);
    }

}
