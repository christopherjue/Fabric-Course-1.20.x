package net.christopher.mccourse;

import net.christopher.mccourse.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.christopher.mccourse.block.ModBlocks;
import net.christopher.mccourse.block.entity.ModBlockEntities;
import net.christopher.mccourse.effect.ModEffects;
import net.christopher.mccourse.enchantment.ModEnchantments;
import net.christopher.mccourse.fluid.ModFluids;
import net.christopher.mccourse.item.ModItemGroup;
import net.christopher.mccourse.item.ModItems;
import net.christopher.mccourse.painting.ModPainting;
import net.christopher.mccourse.particle.ModParticles;
import net.christopher.mccourse.potion.ModPotions;
import net.christopher.mccourse.recipe.ModRecipes;
import net.christopher.mccourse.screen.ModScreenHandlers;
import net.christopher.mccourse.sound.ModSounds;
import net.christopher.mccourse.util.ModLootTableModifiers;
import net.christopher.mccourse.util.ModRegistries;
import net.christopher.mccourse.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
		ModEnchantments.registerModEnchantmnets();

		ModSounds.registerSounds();
		ModLootTableModifiers.modifyLootTables();

		ModPainting.registerPaintings();
		ModEffects.registerEffects();

		ModPotions.registerPotions();
		ModParticles.registerParticles();

		ModVillagers.registerVillagers();
		ModFluids.registerFluids();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandler();

		ModRecipes.registerRecipes();
		ModWorldGeneration.generateModWorldGeneration();
	}
}