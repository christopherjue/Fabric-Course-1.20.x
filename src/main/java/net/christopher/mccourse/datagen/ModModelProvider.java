package net.christopher.mccourse.datagen;

import net.christopher.mccourse.block.ModBlocks;
import net.christopher.mccourse.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
     public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
         BlockStateModelGenerator.BlockTexturePool pinkGarnetTexurePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);


         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_PINK_GARNET_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_PINK_GARNET_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);



         blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

         pinkGarnetTexurePool.stairs(ModBlocks.PINK_GARNET_STAIRS);
         pinkGarnetTexurePool.slab(ModBlocks.PINK_GARNET_SLAB);
         pinkGarnetTexurePool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
         pinkGarnetTexurePool.button(ModBlocks.PINK_GARNET_BUTTON);
         pinkGarnetTexurePool.wall(ModBlocks.PINK_GARNET_WALL);
         pinkGarnetTexurePool.fence(ModBlocks.PINK_GARNET_FENCE);
         pinkGarnetTexurePool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);

         blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
         blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
         itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
         itemModelGenerator.register(ModItems.RAW_PINK_GARNET  , Models.GENERATED);
         itemModelGenerator.register(ModItems.PEAT_BRICK, Models.GENERATED);
         itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
         itemModelGenerator.register(ModItems.SPEEDFOOD, Models.GENERATED);
         itemModelGenerator.register(ModItems.STRENGTHFOOD, Models.GENERATED);
         itemModelGenerator.register(ModItems.METAL_DETECTOR.asItem(), Models.GENERATED);



         itemModelGenerator.register(ModItems.PINK_GARNET_SWORD.asItem(), Models.HANDHELD);
         itemModelGenerator.register(ModItems.PINK_GARNET_AXE.asItem(), Models.HANDHELD);
         itemModelGenerator.register(ModItems.PINK_GARNET_PICKAXE.asItem(), Models.HANDHELD);
         itemModelGenerator.register(ModItems.PINK_GARNET_HOE.asItem(), Models.HANDHELD);
         itemModelGenerator.register(ModItems.PINK_GARNET_SHOVEL.asItem(), Models.HANDHELD);

    }
}
