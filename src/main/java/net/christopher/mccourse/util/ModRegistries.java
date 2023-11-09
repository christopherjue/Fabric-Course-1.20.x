package net.christopher.mccourse.util;

import net.christopher.mccourse.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();

    }

    private  static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;



        registry.add(ModItems.PEAT_BRICK, 900);

    }
}
