package net.christopher.mccourse.item.custom;

import net.christopher.mccourse.block.ModBlocks;
import net.christopher.mccourse.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;

public class PaxelItem extends MiningToolItem {

    public PaxelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL_MINEABLE, settings);
    }
}
