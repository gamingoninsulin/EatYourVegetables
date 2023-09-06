package me.gamingoninsulin.common.datagen;

import me.gamingoninsulin.common.fluid.ModFluids;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.FluidTags;

import java.util.concurrent.CompletableFuture;

public class ModFluidTagProvider extends FabricTagProvider.FluidTagProvider {
    public ModFluidTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(FluidTags.LAVA)
                .add(ModFluids.FLOWING_CHEESE_FLUID)
                .add(ModFluids.STILL_CHEESE_FLUID);
    }
}

/*
       ##############################################################################################################
                                                TURNED OFF
       ##############################################################################################################

    this.getOrCreateTagBuilder(FluidTags.WATER)
                    .add(ModFluids.FLOWING_CHEESE_FLUID)
                    .add(ModFluids.STILL_CHEESE_FLUID);
 */
