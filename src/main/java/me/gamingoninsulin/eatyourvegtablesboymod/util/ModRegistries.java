package me.gamingoninsulin.eatyourvegtablesboymod.util;

import me.gamingoninsulin.eatyourvegtablesboymod.blocks.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerStrippable();
        registerFlamables();
    }

    private static void registerFlamables() {
        // LOGS / STRIPPED
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PINE_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PINE_WOOD, 5, 5);

        // LEAVES
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_LEAVES_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_LEAVES_WALL, 30, 60);

        // PLANKS
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_PLANKS_BLOCK, 5, 20);
    }

    private static void registerStrippable() {
        StrippableBlockRegistry.register(ModBlocks.PINE_LOG, ModBlocks.STRIPPED_PINE_LOG);
        StrippableBlockRegistry.register(ModBlocks.PINE_WOOD, ModBlocks.STRIPPED_PINE_WOOD);
    }
    private static void registerFuels() {
        FuelRegistry registery = FuelRegistry.INSTANCE;

    }
}
/*      //OFF\\

    registery.add(ModItems.PEAT_BRICK, 200);
 */