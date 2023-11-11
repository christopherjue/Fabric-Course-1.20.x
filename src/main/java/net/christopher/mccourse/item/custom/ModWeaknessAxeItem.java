package net.christopher.mccourse.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModWeaknessAxeItem extends AxeItem {

    public ModWeaknessAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 600, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 900, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 900, 1), attacker);
        return super.postHit(stack, target, attacker);
    }
}


