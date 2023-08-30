package me.gamingoninsulin.common.util;

import me.gamingoninsulin.common.items.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        FuelRegistry registery = FuelRegistry.INSTANCE;

    }
}
/*      //OFF\\

    registery.add(ModItems.PEAT_BRICK, 200);
 */