package me.gamingoninsulin;

import me.gamingoninsulin.eatyourvegtablesboymod.ModItemGroup;
import me.gamingoninsulin.eatyourvegtablesboymod.blocks.ModBlocks;
import me.gamingoninsulin.eatyourvegtablesboymod.blocks.entity.ModBlockEntities;
import me.gamingoninsulin.eatyourvegtablesboymod.fluid.ModFluids;
import me.gamingoninsulin.eatyourvegtablesboymod.items.ModItems;
import me.gamingoninsulin.eatyourvegtablesboymod.recipe.ModRecipes;
import me.gamingoninsulin.eatyourvegtablesboymod.screen.ModScreenHandlers;
import me.gamingoninsulin.eatyourvegtablesboymod.util.ModRegistries;
import me.gamingoninsulin.eatyourvegtablesboymod.world.gen.ModWorldGeneration;
import me.gamingoninsulin.eatyourvegtablesboymod.world.tree.ModFoliagePlacerTypes;
import me.gamingoninsulin.eatyourvegtablesboymod.world.tree.ModTrunkPlacerTypes;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static me.gamingoninsulin.eatyourvegtablesboymod.Reference.*;

public class EYVBMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The Author Of Eat Your Vegetables Boy Mod! is " + AUTHOR);
		LOGGER.info("Starting Eat Your Vegetables Boy Mod!");

		ModItemGroup.registerItemGroups();
		//LOGGER.info("done with ItemsGroups");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();

		ModBlockEntities.RegisterModEntities();
		ModScreenHandlers.registerScreenHandler();
		ModRecipes.RegisterRecipes();

		ModFluids.registerFluid();
		ModWorldGeneration.generateModWorldGeneration();
		ModTrunkPlacerTypes.register();
		ModFoliagePlacerTypes.register();
	}
}