package net.christopher.mccourse.datagen;

import net.christopher.mccourse.block.ModBlocks;
import net.christopher.mccourse.datagen.recipe.GemEmpoweringRecipeBuilder;
import net.christopher.mccourse.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET)
                .pattern("SSS")
                .pattern("SPS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('P', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_PINK_GARNET) + "_"));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTOR)
                .pattern("VVV")
                .pattern("VIV")
                .pattern(" I ")
                .input('V', Items.STICK)
                .input('I', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTOR) + "_"));




        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_PRESSURE_PLATE)
                .pattern("   ")
                .pattern("   ")
                .pattern("II ")

                .input('I', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_PRESSURE_PLATE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK)
                .pattern("WBW")
                .pattern("WPW")
                .pattern("WBW")

                .input('P', ModItems.PINK_GARNET)
                .input('W', Items.WHITE_CONCRETE)
                .input('B', Items.BLACK_CONCRETE)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SOUND_BLOCK) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BUTTON)
                .pattern("   ")
                .pattern("   ")
                .pattern("I  ")

                .input('I', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_BUTTON) + "_"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HELMET)
                .pattern("III")
                .pattern("I I")
                .pattern("   ")

                .input('I', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HELMET) + "_"));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_CHESTPLATE)
                .pattern("I I")
                .pattern("III")
                .pattern("III")

                .input('I', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_CHESTPLATE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_LEGGINGS)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")

                .input('I', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_LEGGINGS) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_BOOTS)
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")

                .input('I', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_BOOTS) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_SWORD)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" V ")
                .input('V', Items.STICK)
                .input('I', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_SWORD) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_AXE)
                .pattern(" II")
                .pattern(" VI")
                .pattern(" V ")
                .input('V', Items.STICK)
                .input('I', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_AXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_PICKAXE)
                .pattern("III")
                .pattern(" V ")
                .pattern(" V ")
                .input('V', Items.STICK)
                .input('I', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PICKAXE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_SHOVEL)
                .pattern(" I ")
                .pattern(" V ")
                .pattern(" V ")
                .input('V', Items.STICK)
                .input('I', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_SHOVEL) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_PAXEL)
                .pattern("VOP")
                .pattern(" IL")
                .pattern(" I ")
                .input('V', ModItems.PINK_GARNET_SWORD)
                .input('O', ModItems.PINK_GARNET_AXE)
                .input('P', ModItems.PINK_GARNET_PICKAXE)
                .input('L', ModItems.PINK_GARNET_SHOVEL)
                .input('I', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET_PICKAXE), conditionsFromItem(ModItems.PINK_GARNET_PICKAXE))
                .criterion(hasItem(ModItems.PINK_GARNET_AXE), conditionsFromItem(ModItems.PINK_GARNET_AXE))
                .criterion(hasItem(ModItems.PINK_GARNET_SHOVEL), conditionsFromItem(ModItems.PINK_GARNET_SHOVEL))
                .criterion(hasItem(ModItems.PINK_GARNET_SWORD), conditionsFromItem(ModItems.PINK_GARNET_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PAXEL) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CREATIVE_MODE_SWORD)
                .pattern("BLB")
                .pattern("KVK")
                .pattern("INI")
                .input('V', ModItems.PINK_GARNET_SWORD)
                .input('I', ModItems.PINK_GARNET)
                .input('L', ModItems.PINK_GARNET_PAXEL)
                .input('K', Items.NETHER_STAR)
                .input('N', Items.DRAGON_EGG)
                .input('B', Items.NETHERITE_BLOCK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(ModItems.PINK_GARNET_PAXEL), conditionsFromItem(ModItems.PINK_GARNET_PAXEL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CREATIVE_MODE_SWORD) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HORSE_ARMOR)
                .pattern("III")
                .pattern("IV ")
                .pattern("   ")
                .input('V', Items.LEATHER)
                .input('I', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HORSE_ARMOR) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HOE)
                .pattern(" II")
                .pattern(" V ")
                .pattern(" V ")
                .input('V', Items.STICK)
                .input('I', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HOE) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER_SEEDS)
                .pattern("   ")
                .pattern(" I ")
                .pattern("   ")
                .input('I', ModItems.CAULIFLOWER)
                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CAULIFLOWER_SEEDS) + "_"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GEM_EMPOWERING_STATION)
                .pattern("VIV")
                .pattern("III")
                .pattern("IHI")
                .input('V', Items.POLISHED_BLACKSTONE)
                .input('I', Items.CALCITE)
                .input('H', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.CALCITE), conditionsFromItem(Items.CALCITE))
                .criterion(hasItem(Items.POLISHED_BLACKSTONE), conditionsFromItem(Items.POLISHED_BLACKSTONE))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GEM_EMPOWERING_STATION) + "_"));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_BOW)
                .pattern("DWS")
                .pattern("PNS")
                .pattern("DWS")
                .input('D', Items.DIAMOND_BLOCK)
                .input('W', Items.WARPED_PLANKS)
                .input('N', Items.NETHERITE_INGOT)
                .input('S', Items.STRING)
                .input('P', ModItems.PINK_GARNET)
                .criterion(hasItem(Items.WARPED_PLANKS), conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(hasItem(Items.DIAMOND_BLOCK), conditionsFromItem(Items.DIAMOND_BLOCK))
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_BOW) + "_"));














        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PINK_GARNET, RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                ModBlocks.NETHER_PINK_GARNET_ORE, ModBlocks.END_STONE_PINK_GARNET_ORE), RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 10, "pink_garnet");
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PINK_GARNET, RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK);
        offerBlasting(exporter, List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                        ModBlocks.NETHER_PINK_GARNET_ORE, ModBlocks.END_STONE_PINK_GARNET_ORE), RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 10, "pink_garnet");


        new GemEmpoweringRecipeBuilder(ModItems.RAW_PINK_GARNET, ModItems.PINK_GARNET, 3)
                .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                .offerTo(exporter);

        new GemEmpoweringRecipeBuilder(Items.STICK, Items.END_ROD, 1)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        new GemEmpoweringRecipeBuilder(Items.BLAZE_POWDER, Items.ENDER_EYE, 1)
                .criterion(hasItem(Items.BLAZE_POWDER), conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter);


    }
}
