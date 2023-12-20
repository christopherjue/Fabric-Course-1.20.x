package net.christopher.mccourse.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.christopher.mccourse.MCCourseMod;
import net.christopher.mccourse.block.ModBlocks;
import net.christopher.mccourse.entity.ModBoats;
import net.christopher.mccourse.entity.ModEntities;
import net.christopher.mccourse.item.custom.*;
import net.christopher.mccourse.sound.ModSounds;
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
            new ModPoisonSwordItem(ModToolMaterial.PINK_GARNET, 5, -2.5f, new FabricItemSettings()));

    public static final  Item  PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterial.PINK_GARNET, 4.25f, -1f,new FabricItemSettings()));

    public static final  Item  PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new ModWeaknessAxeItem(ModToolMaterial.PINK_GARNET, 6, -3.0f,new FabricItemSettings()));

    public static final  Item  PINK_GARNET_SCYTHE= registerItem("pink_garnet_scythe",
            new ModSlownessHoeItem(ModToolMaterial.PINK_GARNET, 10, -2.98f, new FabricItemSettings()));

    public static final  Item  PINK_GARNET_PICKAXE= registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterial.PINK_GARNET, 3, -2f, new FabricItemSettings()));

    public static final  Item  PINK_GARNET_PAXEL= registerItem("pink_garnet_paxel",
            new PaxelItem(ModToolMaterial.PINK_GARNET, 5, -3f, new FabricItemSettings()));

    public static final  Item  PINK_GARNET_HELMET =  registerItem("pink_garnet_helmet",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET, ArmorItem.Type.HELMET ,new FabricItemSettings()));

    public static final  Item  PINK_GARNET_CHESTPLATE =  registerItem("pink_garnet_chestplate",
            new ModArmorItem((ModArmorMaterials.PINK_GARNET), ArmorItem.Type.CHESTPLATE ,new FabricItemSettings()));

    public static final  Item  PINK_GARNET_LEGGINGS =  registerItem("pink_garnet_leggings",
            new ModArmorItem((ModArmorMaterials.PINK_GARNET), ArmorItem.Type.LEGGINGS ,new FabricItemSettings()));

    public static final  Item  PINK_GARNET_BOOTS =  registerItem("pink_garnet_boots",
            new ModArmorItem((ModArmorMaterials.PINK_GARNET), ArmorItem.Type.BOOTS ,new FabricItemSettings()));

    public static final Item PINK_GARNET_HORSE_ARMOR = registerItem("pink_garnet_horse_armor",
            new HorseArmorItem(14, "pink_garnet", new FabricItemSettings()));

    public static final Item DRIFTWOOD_SIGN = registerItem("driftwood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.DRIFTWOOD_SIGN, ModBlocks.DRIFTWOOD_WALL_SIGN));
    public static final Item DRIFTWOOD_HANGING_SIGN = registerItem("driftwood_hanging_sign",
            new HangingSignItem(ModBlocks.DRIFTWOOD_HANGING_SIGN, ModBlocks.DRIFTWOOD_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));





    public static final  Item BEST_FOOD_IN_MINECRAFT = registerItem("best_food_in_minecraft",
            new Item(new FabricItemSettings().food(ModFoodComponents.BEST_FOOD_IN_MINECRAFT)));




    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new MusicDiscItem(9, ModSounds.BAR_BRAWL, new FabricItemSettings().maxCount(1), 122));

    public static final Item RADIATION_STAFF = registerItem("radiation_staff",
            new RadiationStaffItem(new FabricItemSettings().maxDamage(1024)));

    public static final Item PINK_GARNET_BOW = registerItem("pink_garnet_bow",
            new BowItem(new FabricItemSettings().maxDamage(5515)));

    public static final Item PINK_GARNET_SHIELD = registerItem("pink_garnet_shield",
            new ShieldItem(new FabricItemSettings().maxDamage(5000)));

    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b26f, new FabricItemSettings()));




    public static final  Item  CREATIVE_MODE_SWORD = registerItem("creative_mode_sword",
            new ModBestEffectCreativeSwordItem(ModToolMaterial.PINK_GARNET, 5, -1f,new FabricItemSettings()));

    public static final Item DATA_TABLET = registerItem("data_tablet",
            new DataTabletItem(new FabricItemSettings().maxCount(1)));


    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
            new AliasedBlockItem(ModBlocks.CAULIFLOWER_CROP , new  FabricItemSettings()));

    public static final Item DICE = registerItem("dice",
            new DiceItem(new  FabricItemSettings()));


    public static final Item CATTAIL_SEEDS = registerItem("cattail_seeds",
            new AliasedBlockItem(ModBlocks.CATTAIL_CROP, new FabricItemSettings()));
    public static final Item CATTAIL = registerItem("cattail",
            new Item(new FabricItemSettings()));



    public static final Item DRIFTWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.DRIFTWOOD_BOAT_ID, ModBoats.DRIFTWOOD_BOAT_KEY, false);
    public static final Item DRIFTWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.DRIFTWOOD_CHEST_BOAT_ID, ModBoats.DRIFTWOOD_BOAT_KEY, true);












    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(PINK_GARNET);
        entries.add(RAW_PINK_GARNET);

        entries.add(ModBlocks.PINK_GARNET_BLOCK);
        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
    }

    public static void registerModItems() {
        MCCourseMod.LOGGER.info("Registering Mod Items for " + MCCourseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}