package me.gamingoninsulin.common.datagen;

import me.gamingoninsulin.common.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(
                        // LOGS
                        ModBlocks.PINE_WOOD.asItem(),
                        ModBlocks.PINE_LOG.asItem(),

                        // STRIPPED
                        ModBlocks.STRIPPED_PINE_WOOD.asItem(),
                        ModBlocks.STRIPPED_PINE_LOG.asItem()
                );

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(
                        // PLANKS
                        ModBlocks.PINE_PLANKS_BLOCK.asItem()
                );
    }
}