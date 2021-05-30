package com.circle.barrenisles.registries;

import com.circle.barrenisles.BarrenIsles;
import com.circle.barrenisles.items.BarrenSpawnEggItem;
import com.circle.barrenisles.items.tools.BarrenItemTier;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BarrenItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BarrenIsles.MOD_ID);

    public static final RegistryObject<Item> RAW_DUNESTEEL = ITEMS.register("raw_dunesteel",
            () -> new Item(new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<Item> DUNESTEEL_INGOT = ITEMS.register("dunesteel_ingot",
            () -> new Item(new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<Item> DUNESTEEL_NUGGET = ITEMS.register("dunesteel_nugget",
            () -> new Item(new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<Item> CHITIN = ITEMS.register("chitin",
            () -> new Item(new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<Item> DUNERAPTOR_CLAW = ITEMS.register("duneraptor_claw",
            () -> new Item(new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<Item> RAW_DESERT_LIZARD_MEAT = ITEMS.register("raw_desert_lizard_meat",
            () -> new Item(new Item.Properties().group(BarrenIsles.BARREN_GROUP).food(BarrenFoodRegistry.RAW_DESERT_LIZARD_MEAT)));

    public static final RegistryObject<Item> COOKED_DESERT_LIZARD_MEAT = ITEMS.register("cooked_desert_lizard_meat",
            () -> new Item(new Item.Properties().group(BarrenIsles.BARREN_GROUP).food(BarrenFoodRegistry.RAW_DESERT_LIZARD_MEAT)));

    public static final RegistryObject<BarrenSpawnEggItem> DESERT_LIZARD_SPAWN_EGG = ITEMS.register("desert_lizard_spawn_egg",
            () -> new BarrenSpawnEggItem(BarrenEntityType.DESERT_LIZARD, 0xDDC368, 0x3A3A3A, new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BarrenSpawnEggItem> TOXIC_GILA_SPAWN_EGG = ITEMS.register("toxic_gila_spawn_egg",
            () -> new BarrenSpawnEggItem(BarrenEntityType.TOXIC_GILA, 0x94623C, 0xA556FF, new Item.Properties().group(BarrenIsles.BARREN_GROUP)));


    public static final RegistryObject<SwordItem> DUNESTEEL_SWORD = ITEMS.register("dunesteel_sword",
            () -> new SwordItem(BarrenItemTier.DUNESTEEL, 2, -2.4F, new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<PickaxeItem> DUNESTEEL_PICKAXE = ITEMS.register("dunesteel_pickaxe",
            () -> new PickaxeItem(BarrenItemTier.DUNESTEEL, 0, -2.8F, new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<AxeItem> DUNESTEEL_AXE = ITEMS.register("dunesteel_axe",
            () -> new AxeItem(BarrenItemTier.DUNESTEEL, 4, -3.0F, new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<ShovelItem> DUNESTEEL_SHOVEL = ITEMS.register("dunesteel_shovel",
            () -> new ShovelItem(BarrenItemTier.DUNESTEEL, 0, -2.5F, new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<HoeItem> DUNESTEEL_HOE = ITEMS.register("dunesteel_hoe",
            () -> new HoeItem(BarrenItemTier.DUNESTEEL, 1, -2.3F, new Item.Properties().group(BarrenIsles.BARREN_GROUP)));



    public static final RegistryObject<BlockItem> DUNESTEEL_ORE = ITEMS.register("dunesteel_ore",
            () -> new BlockItem(BarrenBlockRegistry.DUNESTEEL_ORE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> SCORCHSTONE = ITEMS.register("scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> POLISHED_SCORCHSTONE = ITEMS.register("polished_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.POLISHED_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> SCORCHSTONE_TILES = ITEMS.register("scorchstone_tiles",
            () -> new BlockItem(BarrenBlockRegistry.SCORCHSTONE_TILES.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> SCORCHSTONE_BRICKS = ITEMS.register("scorchstone_bricks",
            () -> new BlockItem(BarrenBlockRegistry.SCORCHSTONE_BRICKS.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> LUMINOUS_SCORCHSTONE = ITEMS.register("luminous_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.LUMINOUS_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> RED_SCORCHSTONE = ITEMS.register("red_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.RED_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> POLISHED_RED_SCORCHSTONE = ITEMS.register("polished_red_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.POLISHED_RED_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> RED_SCORCHSTONE_TILES = ITEMS.register("red_scorchstone_tiles",
            () -> new BlockItem(BarrenBlockRegistry.RED_SCORCHSTONE_TILES.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> LUMINOUS_RED_SCORCHSTONE = ITEMS.register("luminous_red_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.LUMINOUS_RED_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> BLUE_SCORCHSTONE = ITEMS.register("blue_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.BLUE_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> POLISHED_BLUE_SCORCHSTONE = ITEMS.register("polished_blue_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.POLISHED_BLUE_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> BLUE_SCORCHSTONE_TILES = ITEMS.register("blue_scorchstone_tiles",
            () -> new BlockItem(BarrenBlockRegistry.BLUE_SCORCHSTONE_TILES.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> GREEN_SCORCHSTONE = ITEMS.register("green_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.GREEN_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> MOSSY_SCORCHSTONE = ITEMS.register("mossy_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.MOSSY_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> POLISHED_GREEN_SCORCHSTONE = ITEMS.register("polished_green_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.POLISHED_GREEN_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> GREEN_SCORCHSTONE_TILES = ITEMS.register("green_scorchstone_tiles",
            () -> new BlockItem(BarrenBlockRegistry.GREEN_SCORCHSTONE_TILES.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> PURPLE_SCORCHSTONE = ITEMS.register("purple_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.PURPLE_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> POLISHED_PURPLE_SCORCHSTONE = ITEMS.register("polished_purple_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.POLISHED_PURPLE_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> PURPLE_SCORCHSTONE_TILES = ITEMS.register("purple_scorchstone_tiles",
            () -> new BlockItem(BarrenBlockRegistry.PURPLE_SCORCHSTONE_TILES.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> SCORCHSAND = ITEMS.register("scorchsand",
            () -> new BlockItem(BarrenBlockRegistry.SCORCHSAND.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> RED_SCORCHSTONE_BRICKS = ITEMS.register("red_scorchstone_bricks",
            () -> new BlockItem(BarrenBlockRegistry.RED_SCORCHSTONE_BRICKS.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> BLUE_SCORCHSTONE_BRICKS = ITEMS.register("blue_scorchstone_bricks",
            () -> new BlockItem(BarrenBlockRegistry.BLUE_SCORCHSTONE_BRICKS.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> GREEN_SCORCHSTONE_BRICKS = ITEMS.register("green_scorchstone_bricks",
            () -> new BlockItem(BarrenBlockRegistry.GREEN_SCORCHSTONE_BRICKS.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> PURPLE_SCORCHSTONE_BRICKS = ITEMS.register("purple_scorchstone_bricks",
            () -> new BlockItem(BarrenBlockRegistry.PURPLE_SCORCHSTONE_BRICKS.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> POLISHED_PRISMATIC_SCORCHSTONE = ITEMS.register("polished_prismatic_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.POLISHED_PRISMATIC_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> PRISMATIC_SCORCHSTONE = ITEMS.register("prismatic_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.PRISMATIC_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> UMBRAL_SCORCHSTONE = ITEMS.register("umbral_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.UMBRAL_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> BLOOMING_SCORCHSTONE = ITEMS.register("blooming_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.BLOOMING_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> SCORCHSTONE_COAL_ORE = ITEMS.register("scorchstone_coal_ore",
            () -> new BlockItem(BarrenBlockRegistry.SCORCHSTONE_COAL_ORE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> POLISHED_UMBRAL_SCORCHSTONE = ITEMS.register("polished_umbral_scorchstone",
            () -> new BlockItem(BarrenBlockRegistry.POLISHED_UMBRAL_SCORCHSTONE.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

    public static final RegistryObject<BlockItem> UMBRAL_SCORCHSAND = ITEMS.register("umbral_scorchsand",
            () -> new BlockItem(BarrenBlockRegistry.UMBRAL_SCORCHSAND.get(), new Item.Properties().group(BarrenIsles.BARREN_GROUP)));

}
