package net.christopher.mccourse.item;

import net.christopher.mccourse.MCCourseMod;
import net.christopher.mccourse.block.ModBlocks;
import net.christopher.mccourse.fluid.ModFluids;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.rmi.MarshalledObject;

public class ModItemGroup {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
    new Identifier(MCCourseMod.MOD_ID, "pink_garnet_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_garnet_group"))
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.PEAT_BRICK);
                        entries.add(ModItems.CREATIVE_MODE_SWORD);
                        entries.add(ModItems.BAR_BRAWL_MUSIC_DISC);
                        entries.add(ModBlocks.GEM_EMPOWERING_STATION);
                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);


                        entries.add(ModItems.DICE);


                        entries.add(ModItems.CATTAIL);
                        entries.add(ModItems.CATTAIL_SEEDS);


                        entries.add(ModBlocks.COLORED_LEAVES);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK_1);
                        entries.add(ModBlocks.RUBY_BLOCK_2);
                        entries.add(ModBlocks.RUBY_BLOCK_3);
                        entries.add(ModBlocks.WAXED_RUBY_BLOCK);
                        entries.add(ModBlocks.WAXED_RUBY_BLOCK_1);
                        entries.add(ModBlocks.WAXED_RUBY_BLOCK_2);
                        entries.add(ModBlocks.WAXED_RUBY_BLOCK_3);





                        entries.add(ModItems.PINK_GARNET_SWORD);
                        entries.add(ModItems.PINK_GARNET_AXE);
                        entries.add(ModItems.PINK_GARNET_PICKAXE);
                        entries.add(ModItems.PINK_GARNET_SHOVEL);
                        entries.add(ModItems.PINK_GARNET_SCYTHE);
                        entries.add(ModItems.PINK_GARNET_PAXEL);
                        entries.add(ModItems.PINK_GARNET_HORSE_ARMOR);


                        entries.add(ModItems.DRIFTWOOD_CHEST_BOAT);
                        entries.add(ModItems.DRIFTWOOD_BOAT);

                        entries.add(ModItems.RADIATION_STAFF);
                        entries.add(ModItems.PINK_GARNET_BOW);
                        entries.add(ModItems.PINK_GARNET_SHIELD);

                        entries.add(ModItems.DRIFTWOOD_SIGN);
                        entries.add(ModItems.DRIFTWOOD_HANGING_SIGN);



                        entries.add(ModFluids.SOAP_WATER_BUCKET);


                        entries.add(ModItems.PINK_GARNET_HELMET);
                        entries.add(ModItems.PINK_GARNET_CHESTPLATE);
                        entries.add(ModItems.PINK_GARNET_LEGGINGS);
                        entries.add(ModItems.PINK_GARNET_BOOTS);
                        entries.add(ModItems.DATA_TABLET);
                        entries.add(ModItems.CAULIFLOWER_SEEDS);



                        entries.add(ModBlocks.KAUPEN_FURNACE);






                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.END_STONE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GARNET_LAMP_BLOCK);


                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModBlocks.DRIFTWOOD_LEAVES);
                        entries.add(ModBlocks.DRIFTWOOD_PLANKS);
                        entries.add(ModBlocks.DRIFTWOOD_LOG);
                        entries.add(ModBlocks.DRIFTWOOD_SAPLING);
                        entries.add(ModBlocks.DRIFTWOOD_WOOD);
                        entries.add(ModBlocks.STRIPPED_DRIFTWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD);


                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PETUNIA);




                    }).build());
    public  static  void  registerItemGroups () {

    }
}
