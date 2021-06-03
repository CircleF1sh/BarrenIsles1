package com.circle.barrenisles.world.biomes;

import com.circle.barrenisles.registries.BarrenBlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import static com.circle.barrenisles.world.biomes.BiomeHelper.*;

public class BiomeMaker {
        public static final SurfaceBuilderConfig THE_ISLES_BUILDER_CONFIG = new SurfaceBuilderConfig(
                BarrenBlockRegistry.SCORCHSAND.get().getDefaultState(),
                BarrenBlockRegistry.SCORCHSTONE.get().getDefaultState(),
                BarrenBlockRegistry.SCORCHSTONE.get().getDefaultState()
        );

        public static final SurfaceBuilderConfig UMBRAL_BUILDER_CONFIG = new SurfaceBuilderConfig(
                BarrenBlockRegistry.UMBRAL_SCORCHSAND.get().getDefaultState(),
                BarrenBlockRegistry.UMBRAL_SCORCHSTONE.get().getDefaultState(),
                BarrenBlockRegistry.UMBRAL_SCORCHSTONE.get().getDefaultState()
                );

        public static final SurfaceBuilderConfig PRISMATIC_BUILDER_CONFIG = new SurfaceBuilderConfig(
                BarrenBlockRegistry.PRISMATIC_SCORCHSTONE.get().getDefaultState(),
                BarrenBlockRegistry.PRISMATIC_SCORCHSTONE.get().getDefaultState(),
                BarrenBlockRegistry.PRISMATIC_SCORCHSTONE.get().getDefaultState()
        );


        public static Biome theIsles() {
                final BiomeGenerationSettings.Builder genSettings = genSettings(SurfaceBuilder.DEFAULT, THE_ISLES_BUILDER_CONFIG);

                final MobSpawnInfo.Builder spawnSettings = spawnSettings();

                addSpawn(spawnSettings, EntityClassification.MONSTER,
                        EntityType.ENDERMAN, 4, 1, 4);


                final BiomeAmbience.Builder effects = effects(0x8F877B,
                        0xA28565,
                        DEFAULT_GRASS_COLOR,
                        DEFAULT_FOLIAGE_COLOR,
                        0,
                        DEFAULT_SKY_FOG_COLOR
                );

                return biome(
                        Biome.RainType.NONE,
                        Biome.Category.DESERT,
                        0.125F,
                        0.07F,
                        0F,
                        0.0001F,
                        effects,
                        genSettings,
                        MobSpawnInfo.EMPTY
                );
        }

        public static Biome umbral() {
                final BiomeGenerationSettings.Builder genSettings = genSettings(SurfaceBuilder.DEFAULT, UMBRAL_BUILDER_CONFIG);

                final MobSpawnInfo.Builder spawnSettings = spawnSettings();

                addSpawn(spawnSettings, EntityClassification.MONSTER,
                        EntityType.ENDERMAN, 4, 1, 4);


                final BiomeAmbience.Builder effects = effects(0x786C66,
                        0x8F877B,
                        DEFAULT_GRASS_COLOR,
                        DEFAULT_FOLIAGE_COLOR,
                        0,
                        DEFAULT_SKY_FOG_COLOR
                );

                return biome(
                        Biome.RainType.NONE,
                        Biome.Category.DESERT,
                        0.125F,
                        0.07F,
                        1.4F,
                        0.0001F,
                        effects,
                        genSettings,
                        MobSpawnInfo.EMPTY
                );
        }

        public static Biome prismatic() {
                final BiomeGenerationSettings.Builder genSettings = genSettings(SurfaceBuilder.DEFAULT, PRISMATIC_BUILDER_CONFIG);

                final MobSpawnInfo.Builder spawnSettings = spawnSettings();

                addSpawn(spawnSettings, EntityClassification.MONSTER,
                        EntityType.ENDERMAN, 4, 1, 4);


                final BiomeAmbience.Builder effects = effects(0x786C66,
                        0x8F877B,
                        DEFAULT_GRASS_COLOR,
                        DEFAULT_FOLIAGE_COLOR,
                        0,
                        DEFAULT_SKY_FOG_COLOR
                );

                return biome(
                        Biome.RainType.NONE,
                        Biome.Category.DESERT,
                        0.125F,
                        0.07F,
                        1.4F,
                        0.0001F,
                        effects,
                        genSettings,
                        MobSpawnInfo.EMPTY
                );
        }

}
