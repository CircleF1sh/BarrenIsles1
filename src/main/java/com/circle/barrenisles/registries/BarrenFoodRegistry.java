package com.circle.barrenisles.registries;

import net.minecraft.item.Food;

public class BarrenFoodRegistry {


    public static final Food RAW_DESERT_LIZARD_MEAT = new Food.Builder()
            .hunger(2)
            .saturation(0.2F)
            .setAlwaysEdible().build();

    public static final Food COOKED_DESERT_LIZARD_MEAT = new Food.Builder()
            .hunger(4)
            .saturation(0.6F)
            .setAlwaysEdible().build();
}
