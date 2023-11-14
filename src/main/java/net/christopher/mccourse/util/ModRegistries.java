package net.christopher.mccourse.util;

import net.christopher.mccourse.command.ReturnHomeCommand;
import net.christopher.mccourse.command.SetHomeCommand;
import net.christopher.mccourse.item.ModItems;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.ComposterBlock;
import net.minecraft.command.CommandRegistryAccess;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerModCompostables();
        registerCommands();

    }

    private  static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;



        registry.add(ModItems.PEAT_BRICK, 900);

    }


    private static void registerModCompostables() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER, 0.999f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CAULIFLOWER_SEEDS, 0.5f);
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand ::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);

    }
}
