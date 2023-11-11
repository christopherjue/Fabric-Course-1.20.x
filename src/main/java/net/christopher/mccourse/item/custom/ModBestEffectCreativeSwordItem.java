package net.christopher.mccourse.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModBestEffectCreativeSwordItem extends SwordItem {
    public ModBestEffectCreativeSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // BAD EFFECTS
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1500, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 450, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 450, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 900, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 900, 1), attacker);


        // GOOD EFFECTS
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 900, 1), attacker);

        return super.postHit(stack, target, attacker);
    }
}
