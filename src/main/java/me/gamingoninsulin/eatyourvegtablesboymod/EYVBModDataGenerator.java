package me.gamingoninsulin.eatyourvegtablesboymod;

import me.gamingoninsulin.eatyourvegtablesboymod.datagen.*;
import me.gamingoninsulin.eatyourvegtablesboymod.world.ModConfiguredFeatures;
import me.gamingoninsulin.eatyourvegtablesboymod.world.ModPlacedFeatures;
import me.gamingoninsulin.eatyourvegtablesboymod.world.biome.ModBiomes;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class EYVBModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModBlockLoottableGen::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModFluidTagProvider::new);
		pack.addProvider(ModRecipeGen::new);
		pack.addProvider(ModWorldGenerator::new);
	}
	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, ModBiomes::bootstrap);
	}
}
