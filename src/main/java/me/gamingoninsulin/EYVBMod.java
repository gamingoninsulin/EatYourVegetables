package me.gamingoninsulin;

import me.gamingoninsulin.common.ModItemGroup;
import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.items.ModItems;
import me.gamingoninsulin.common.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static me.gamingoninsulin.core.Reference.*;

public class EYVBMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The Author Of Eat Your Vegetables Boy Mod! is " + AUTHOR);
		LOGGER.info("Starting Eat Your Vegetables Boy Mod!");

		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
	}
}