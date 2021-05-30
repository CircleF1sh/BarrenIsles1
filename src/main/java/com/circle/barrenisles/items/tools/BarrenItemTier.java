package com.circle.barrenisles.items.tools;

import com.circle.barrenisles.registries.BarrenItemRegistry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum BarrenItemTier implements IItemTier {

    DUNESTEEL(2, 450, 7.0F, 3.0F, 12, () -> {
        return Ingredient.fromItems(BarrenItemRegistry.DUNESTEEL_INGOT.get());
    }, 0);

    private final int harvestLevel;
    private final int maxUses;
    private final float attackDamage;
    private final float efficiency;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    BarrenItemTier(int maxUses, int harvestLevel, float effeiciency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial, int harvestLevel1) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.attackDamage = attackDamage;
        this.efficiency = effeiciency;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
