package net.christopher.mccourse.item;

import net.christopher.mccourse.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BEST_FOOD_IN_MINECRAFT = new FoodComponent.Builder().hunger(99999).saturationModifier(999999999f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 700000, 90), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 700000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 700000, 20), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 700000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 700000, 290), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(ModEffects.SLIMEY, 700000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 700000, 90), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 700000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 700000, 20), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 700000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 700000, 290), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 700000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(ModEffects.SLIMEY, 700000, 1), 1.0f)

            .alwaysEdible().build();

    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(10).saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 500, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 0), 1.0f)



            .alwaysEdible().build();

    public static final FoodComponent STRENGTHFOOD = new FoodComponent.Builder().hunger(25).saturationModifier(15f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 14000, 2), 1.0f).alwaysEdible().build();

    public static final FoodComponent SPEEDFOOD = new FoodComponent.Builder().hunger(25).saturationModifier(15f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 14000, 2), 1.0f).alwaysEdible().build();



}





