package me.gamingoninsulin.eatyourvegtablesboymod.world.tree;

import me.gamingoninsulin.eatyourvegtablesboymod.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class PineWoodSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.PINEWOOD_KEY;
    }
}
