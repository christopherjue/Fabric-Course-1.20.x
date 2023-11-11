package net.christopher.mccourse.enchantment;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class LightningStrikerEnchantment extends Enchantment {
    public LightningStrikerEnchantment(Rarity rarity, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(rarity, target, slotTypes);
    }


    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient()) {
            ServerWorld world = ((ServerWorld) user.getWorld());
            BlockPos position = target.getBlockPos();


            if (level == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);

            }

            if (level == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            }
            if (level == 3) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            }

            if (level == 4) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            }

            if (level == 5) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            }

            if (level == 6) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            }

            if (level == 7) {
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
            }

            if (level == 8) {
                EntityType.END_CRYSTAL.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.END_CRYSTAL.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.END_CRYSTAL.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.END_CRYSTAL.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.END_CRYSTAL.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.END_CRYSTAL.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.END_CRYSTAL.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.LIGHTNING_BOLT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);
                EntityType.TNT.spawn(world, position, SpawnReason.TRIGGERED);

            }
        }

        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 8;
    }
}
