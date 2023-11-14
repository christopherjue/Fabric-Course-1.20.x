package net.christopher.mccourse.datagen;

import net.christopher.mccourse.block.ModBlocks;
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
                .input('V', ModItems.PINK_GARNET_PICKAXE)
                .input('O', ModItems.PINK_GARNET_AXE)
                .input('P', ModItems.PINK_GARNET_SWORD)
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














        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PINK_GARNET, RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK);
        offerSmelting(exporter, List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                ModBlocks.NETHER_PINK_GARNET_ORE, ModBlocks.END_STONE_PINK_GARNET_ORE), RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 10, "pink_garnet");
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.PINK_GARNET, RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK);
        offerBlasting(exporter, List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                        ModBlocks.NETHER_PINK_GARNET_ORE, ModBlocks.END_STONE_PINK_GARNET_ORE), RecipeCategory.MISC, ModItems.PINK_GARNET,
                0.25f, 10, "pink_garnet");
    }
}
