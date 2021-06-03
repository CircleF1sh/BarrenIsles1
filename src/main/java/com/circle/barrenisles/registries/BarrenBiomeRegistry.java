package com.circle.barrenisles.registries;

import com.circle.barrenisles.BarrenIsles;
import com.circle.barrenisles.world.biomes.BiomeMaker;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BarrenBiomeRegistry {

    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, BarrenIsles.MOD_ID);

    public static final RegistryObject<Biome> THE_ISLES = BIOMES.register("the_isles", BiomeMaker::theIsles);
    public static final RegistryKey<Biome> THE_ISLES_BUILDER_KEY =
            RegistryKey.getOrCreateKey(Registry.BIOME_KEY, BarrenIsles.id("the_isles"));

    public static final RegistryObject<Biome> UMBRAL = BIOMES.register("umbral", BiomeMaker::umbral);
    public static final RegistryKey<Biome> UMBRAL_BUILDER_KEY =
            RegistryKey.getOrCreateKey(Registry.BIOME_KEY, BarrenIsles.id("umbral"));

    public static final RegistryObject<Biome> PRISMATIC = BIOMES.register("prismatic", BiomeMaker::prismatic);
    public static final RegistryKey<Biome> PRISMATIC_BUILDER_KEY =
            RegistryKey.getOrCreateKey(Registry.BIOME_KEY, BarrenIsles.id("prismatic"));

    public static void biomeLoading(FMLCommonSetupEvent event) {
        BiomeDictionary.addTypes(THE_ISLES_BUILDER_KEY, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.DRY, BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.DEAD);
        BiomeDictionary.addTypes(UMBRAL_BUILDER_KEY, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.DRY, BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.DEAD);
        BiomeDictionary.addTypes(PRISMATIC_BUILDER_KEY, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.DRY, BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.DEAD);
    }
}
