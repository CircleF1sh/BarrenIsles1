package com.circle.barrenisles.registries;

import com.circle.barrenisles.BarrenIsles;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BarrenBlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            BarrenIsles.MOD_ID);

    public static final RegistryObject<Block> SCORCHSTONE = BLOCKS.register("scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(-1)
            .hardnessAndResistance(4.5F, 6F)
            .setRequiresTool()));

    public static final RegistryObject<Block> DUNESTEEL_ORE = BLOCKS.register("dunesteel_ore",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .hardnessAndResistance(5.5F, 7F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> POLISHED_SCORCHSTONE = BLOCKS.register("polished_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> SCORCHSTONE_TILES = BLOCKS.register("scorchstone_tiles",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> SCORCHSTONE_BRICKS = BLOCKS.register("scorchstone_bricks",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> LUMINOUS_SCORCHSTONE = BLOCKS.register("luminous_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> RED_SCORCHSTONE = BLOCKS.register("red_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> POLISHED_RED_SCORCHSTONE = BLOCKS.register("polished_red_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> RED_SCORCHSTONE_TILES = BLOCKS.register("red_scorchstone_tiles",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> LUMINOUS_RED_SCORCHSTONE = BLOCKS.register("luminous_red_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> BLUE_SCORCHSTONE = BLOCKS.register("blue_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> POLISHED_BLUE_SCORCHSTONE = BLOCKS.register("polished_blue_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> BLUE_SCORCHSTONE_TILES = BLOCKS.register("blue_scorchstone_tiles",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> GREEN_SCORCHSTONE = BLOCKS.register("green_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> MOSSY_SCORCHSTONE = BLOCKS.register("mossy_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));
    public static final RegistryObject<Block> POLISHED_GREEN_SCORCHSTONE = BLOCKS.register("polished_green_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> GREEN_SCORCHSTONE_TILES = BLOCKS.register("green_scorchstone_tiles",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> PURPLE_SCORCHSTONE = BLOCKS.register("purple_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> POLISHED_PURPLE_SCORCHSTONE = BLOCKS.register("polished_purple_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> PURPLE_SCORCHSTONE_TILES = BLOCKS.register("purple_scorchstone_tiles",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> SCORCHSAND = BLOCKS.register("scorchsand",
            () -> new SandBlock(21, SandBlock.Properties.create(Material.SAND)
                    .harvestTool(ToolType.SHOVEL)
                    .harvestLevel(-1)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.5F, 0.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> RED_SCORCHSTONE_BRICKS = BLOCKS.register("red_scorchstone_bricks",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> BLUE_SCORCHSTONE_BRICKS = BLOCKS.register("blue_scorchstone_bricks",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> GREEN_SCORCHSTONE_BRICKS = BLOCKS.register("green_scorchstone_bricks",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> PURPLE_SCORCHSTONE_BRICKS = BLOCKS.register("purple_scorchstone_bricks",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5.5F, 6.5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> PRISMATIC_SCORCHSTONE = BLOCKS.register("prismatic_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> POLISHED_PRISMATIC_SCORCHSTONE = BLOCKS.register("polished_prismatic_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> UMBRAL_SCORCHSTONE = BLOCKS.register("umbral_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> BLOOMING_SCORCHSTONE = BLOCKS.register("blooming_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> SCORCHSTONE_COAL_ORE = BLOCKS.register("scorchstone_coal_ore",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(3.6F, 5F)
                    .setRequiresTool()));

    public static final RegistryObject<Block> POLISHED_UMBRAL_SCORCHSTONE = BLOCKS.register("polished_umbral_scorchstone",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(-1)
                    .hardnessAndResistance(5F, 6F)
                    .setRequiresTool()));

    public static final RegistryObject<SandBlock> UMBRAL_SCORCHSAND = BLOCKS.register("umbral_scorchsand",
            () -> new SandBlock(22, SandBlock.Properties.create(Material.SAND)
                    .harvestTool(ToolType.SHOVEL)
                    .harvestLevel(-1)
                    .sound(SoundType.SAND)
                    .hardnessAndResistance(0.5F, 0.5F)
                    .setRequiresTool()));
}
