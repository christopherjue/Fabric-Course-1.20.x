package net.christopher.mccourse.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(1000).saturationModifier(15f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 14000, 3), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 19000, 3), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 14000, 3), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 14000, 3), 1.0f).alwaysEdible().build();

    public static final FoodComponent STRENGTHFOOD = new FoodComponent.Builder().hunger(25).saturationModifier(15f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 14000, 2), 1.0f).alwaysEdible().build();

    public static final FoodComponent SPEEDFOOD = new FoodComponent.Builder().hunger(25).saturationModifier(15f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 14000, 2), 1.0f).alwaysEdible().build();

}





