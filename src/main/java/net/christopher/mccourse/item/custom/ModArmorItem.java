package net.christopher.mccourse.item.custom;

import com.google.common.collect.ImmutableMap;
import net.christopher.mccourse.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, StatusEffectInstance> MATERIAL_TO_EFFECT_MAP =
            new ImmutableMap.Builder<ArmorMaterial, StatusEffectInstance>()
                    .put(ModArmorMaterials.PINK_GARNET, new StatusEffectInstance(StatusEffects.STRENGTH, 800, 1))
                    //.put(ModArmorMaterials.PINK_GARNET, new StatusEffects(StatusEffects.WATER_BREATHING, 9000, 1))
                    //I wanted to add 2 effects or more you can't do this



//                            ( new StatusEffectInstance(StatusEffects.STRENGTH, 9000, 1)),
//                            ( new StatusEffectInstance(StatusEffects.SPEED, 9000, 1)),
//                            ( new StatusEffectInstance(StatusEffects.RESISTANCE, 9000, 1)),
//                            ( new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1)),
//                            ( new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 9000, 1)),
//                            ( new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 9000, 1)),
//                            ( new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 9000, 1))
                    .build();


    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player) {
            if (hasFullSUitOfArmorOn(player)) {
                evaluateArmorEffects(player);

            }

        }


        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, StatusEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            StatusEffectInstance mapStatusEffect = entry.getValue();

            if (hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapStatusEffect);
                break;

            }
        }

    }

    private void addStatusEffectForMaterial(PlayerEntity player, StatusEffectInstance mapStatusEffect) {
        boolean hasPlayerEffectAlready = player.hasStatusEffect(mapStatusEffect.getEffectType());

        if (!hasPlayerEffectAlready)  {
            player.addStatusEffect(new StatusEffectInstance(mapStatusEffect.getEffectType(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
    }


    private boolean hasCorrectArmorOn(ArmorMaterial mapArmorMaterial, PlayerEntity player) {
        for (ItemStack armorStack : player.getArmorItems()) {
            if (!(armorStack.getItem()instanceof ArmorItem)) {
                return false;
            }
        }


        ArmorItem boots = ((ArmorItem) player.getInventory().getArmorStack(0).getItem());
        ArmorItem leggings = ((ArmorItem) player.getInventory().getArmorStack(1).getItem());
        ArmorItem chestplate = ((ArmorItem) player.getInventory().getArmorStack(2).getItem());
        ArmorItem helmet = ((ArmorItem) player.getInventory().getArmorStack(3).getItem());

        return helmet.getMaterial() == mapArmorMaterial && leggings.getMaterial() == mapArmorMaterial &&
                chestplate.getMaterial() == mapArmorMaterial && helmet.getMaterial() == mapArmorMaterial;
    }


    private boolean hasFullSUitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);


        return !boots.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty() && !helmet.isEmpty();
    }
}
