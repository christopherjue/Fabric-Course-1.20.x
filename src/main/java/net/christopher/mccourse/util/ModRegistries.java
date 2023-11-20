package net.christopher.mccourse.util;

import net.christopher.mccourse.command.ReturnHomeCommand;
import net.christopher.mccourse.command.SetHomeCommand;
import net.christopher.mccourse.event.AttackEntityHandler;
import net.christopher.mccourse.event.PlayerCopyHandler;
import net.christopher.mccourse.item.ModItems;
import net.christopher.mccourse.mixin.BrewingRecipeRegistryMixin;
import net.christopher.mccourse.potion.ModPotions;
import net.christopher.mccourse.villager.ModVillagers;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModCompostables();
        registerCommands();
        registerEvents();
        registerPotionRecipes();
        registerCustomTrades();

    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;


        registry.add(ModItems.PEAT_BRICK, 9000000);

    }


    private static void registerModCompostables() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER, 0.999f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER_SEEDS, 0.5f);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);


    }

    private static void registerEvents() {
        AttackEntityCallback.EVENT.register(new AttackEntityHandler());
        ServerPlayerEvents.COPY_FROM.register(new PlayerCopyHandler());

    }


    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.PINK_GARNET, ModPotions.SLIMEY_POTION);


    }

    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 13),
                            new ItemStack(ModItems.CAULIFLOWER, 1), 1, 1500, 2f


                    ));

                });



        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.IRON_INGOT, 20),
                            new ItemStack(ModItems.METAL_DETECTOR, 1), 2, 200, 2f


                    ));

                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.NETHERITE_BLOCK, 5),
                            new ItemStack(Items.DIAMOND_BLOCK, 25),
                            new ItemStack(ModItems.PINK_GARNET, 3), 1, 50, 0.03f




                    ));

                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.RADIATION_STAFF, 1), 1, 5, 0.03f




                    ));

                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND_BLOCK, 20),
                            new ItemStack(Items.NETHERITE_INGOT, 2),
                            new ItemStack(Items.NETHERITE_BLOCK, 4), 1, 500, 30f




                    ));

                });





    }
}