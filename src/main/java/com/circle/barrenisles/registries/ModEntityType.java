package com.circle.barrenisles.registries;

import com.circle.barrenisles.BarrenIsles;
import com.circle.barrenisles.entities.desert_lizard.DesertLizardEntity;
import com.circle.barrenisles.entities.toxic_gila.ToxicGilaEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, BarrenIsles.MOD_ID);

    public static final RegistryObject<EntityType<DesertLizardEntity>> DESERT_LIZARD = ENTITY_TYPES.register("desert_lizard",
            () -> EntityType.Builder.create(DesertLizardEntity::new, EntityClassification.AMBIENT)
            .size(0.2F, 0.2F)
            .build(new ResourceLocation(BarrenIsles.MOD_ID, "desert_lizard").toString()));

    public static final RegistryObject<EntityType<ToxicGilaEntity>> TOXIC_GILA = ENTITY_TYPES.register("toxic_gila",
            () -> EntityType.Builder.create(ToxicGilaEntity::new, EntityClassification.AMBIENT)
                    .size(0.15F, 0.15F)
                    .build(new ResourceLocation(BarrenIsles.MOD_ID, "toxic_gila").toString()));
}
