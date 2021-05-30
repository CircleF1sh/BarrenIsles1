package com.circle.barrenisles.world.gen;

import com.circle.barrenisles.registries.BarrenBlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class BarrenOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) ||
                event.getCategory().equals(Biome.Category.THEEND) ||
                event.getCategory().equals(Biome.Category.BEACH) ||
                event.getCategory().equals(Biome.Category.ICY) ||
                event.getCategory().equals(Biome.Category.RIVER) ||
                event.getCategory().equals(Biome.Category.MESA) ||
                event.getCategory().equals(Biome.Category.MUSHROOM) ||
                event.getCategory().equals(Biome.Category.OCEAN) ||
                event.getCategory().equals(Biome.Category.SAVANNA) ||
                event.getCategory().equals(Biome.Category.TAIGA) ||
                event.getCategory().equals(Biome.Category.EXTREME_HILLS) ||
                event.getCategory().equals(Biome.Category.JUNGLE) ||
                event.getCategory().equals(Biome.Category.PLAINS) ||
                event.getCategory().equals(Biome.Category.FOREST))) {
            generateOres(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    BarrenBlockRegistry.SCORCHSTONE.get().getDefaultState(), 5, 13, 62, 38);
        }
    }

    private static void generateOres(BiomeGenerationSettingsBuilder settings, RuleTest fillerType,
                                     BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().func_242731_b(amount));
    }
}

