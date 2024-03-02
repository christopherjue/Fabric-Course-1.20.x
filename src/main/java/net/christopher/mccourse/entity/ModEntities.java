package net.christopher.mccourse.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.christopher.mccourse.MCCourseMod;
import net.christopher.mccourse.entity.custom.DiceProjectileEntity;
import net.christopher.mccourse.entity.custom.MagicProjectileEntity;
import net.christopher.mccourse.entity.custom.PorcupineEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCCourseMod.MOD_ID, "porcupine"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PorcupineEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());


    public static final EntityType<DiceProjectileEntity> THROWN_DICE_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCCourseMod.MOD_ID, "dice_projectile"),
            FabricEntityTypeBuilder.<DiceProjectileEntity>create(SpawnGroup.MISC, DiceProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static final EntityType<MagicProjectileEntity> MAGIC_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCCourseMod.MOD_ID, "magic_projectile"),
            FabricEntityTypeBuilder.<MagicProjectileEntity>create(SpawnGroup.MISC, MagicProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static final EntityType<PorcupineEntity> PORCUPINE_QUILL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MCCourseMod.MOD_ID, "porcupine_quill"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PorcupineEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 5f)).build());





    public static void registerModEntities() {
        MCCourseMod.LOGGER.info("Registering Mod Entities for " + MCCourseMod.MOD_ID);
    }
}