package net.christopher.mccourse.item;

import net.christopher.mccourse.MCCourseMod;
import net.christopher.mccourse.block.ModBlocks;
import net.christopher.mccourse.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public  static  final  Item PINK_GARNET = registerItem("pink_garnet",
            new Item(new FabricItemSettings()));
 public static final  Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
         new Item(new FabricItemSettings()));
 public static final  Item METAL_DETECTOR = registerItem("metal_detector",
         new MetalDetectorItem(new FabricItemSettings().maxDamage(256)));

 public static final  Item CAULIFLOWER = registerItem("cauliflower",
         new Item(new FabricItemSettings().food(ModFoodComponents.CAULIFLOWER)));

 public static final  Item PEAT_BRICK = registerItem("peat_brick",
         new Item(new FabricItemSettings()));

    public static final  Item  PINK_GARNET_SWORD= registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterial.PINK_GARNET, 5, -2.5f, new FabricItemSettings()));

    public static final  Item  PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterial.PINK_GARNET, 4.25f, -1f,new FabricItemSettings()));

    public static final  Item  PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterial.PINK_GARNET, 6, -2.5f,new FabricItemSettings()));

    public static final  Item  PINK_GARNET_HOE= registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterial.PINK_GARNET, 10, -3.5f, new FabricItemSettings()));

    public static final  Item  PINK_GARNET_PICKAXE= registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterial.PINK_GARNET, 3, -0.1f, new FabricItemSettings()));

    public static final  Item SPEEDFOOD = registerItem("speedfood",
            new Item(new FabricItemSettings().food(ModFoodComponents.SPEEDFOOD)));


    public static final  Item STRENGTHFOOD = registerItem("strengthfood",
            new Item(new FabricItemSettings().food(ModFoodComponents.STRENGTHFOOD)));



private static Item registerItem(String name, Item item) {

    return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name),item);
}



    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
    entries.add(PINK_GARNET);
    entries.add(RAW_PINK_GARNET);
    entries.add(METAL_DETECTOR);

    entries.add(ModBlocks.PINK_GARNET_BLOCK);
    entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
    entries.add(ModBlocks.PINK_GARNET_ORE);
    entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);
    entries.add(ModBlocks.END_STONE_PINK_GARNET_ORE);



}

    public  static void registerModItems() {
        MCCourseMod.LOGGER.info("Registering Mod Items for " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
