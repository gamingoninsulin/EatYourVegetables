package me.gamingoninsulin.core.datagen;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;


public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // shovel
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(
                        // cauliflower deco
                        ModBlocks.CAULIFLOWER_BLOCK,
                        ModBlocks.CAULIFLOWER_STAIRS,
                        ModBlocks.CAULIFLOWER_SLAB,
                        ModBlocks.CAULIFLOWER_PRESSURE_PLATE,
                        ModBlocks.CAULIFLOWER_BUTTON,
                        ModBlocks.CAULIFLOWER_FENCE,
                        ModBlocks.CAULIFLOWER_FENCE_GATE,
                        ModBlocks.CAULIFLOWER_WALL,

                        // cucumber deco
                        ModBlocks.CUCUMBER_BLOCK,
                        ModBlocks.CUCUMBER_STAIRS,
                        ModBlocks.CUCUMBER_SLAB,
                        ModBlocks.CUCUMBER_PRESSURE_PLATE,
                        ModBlocks.CUCUMBER_BUTTON,
                        ModBlocks.CUCUMBER_FENCE,
                        ModBlocks.CUCUMBER_FENCE_GATE,
                        ModBlocks.CUCUMBER_WALL
                );

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(
                        // empty crate
                        ModBlocks.MOD_CRATE_BLOCK,

                        // cauliflower
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8,

                        // cucumbers
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8
                );

    }
}
/*      //OFF\\

        // metal detector
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS_TAG)
                .add(ModBlocks.PINK_GARNET_ORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES
                );

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PINK_GARNET_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PINK_GARNET_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PINK_GARNET_FENCE_GATE);


        // Tag for Tool Material Netherite
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.NETHER_PINK_GARNET_ORE);

        // Tag for our custom Tool Material (Pink Garnet)
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE)
                .add(ModBlocks.END_PINK_GARNET_ORE);


        getOrCreateTagBuilder(ModTags.Blocks.PAXEL_MINEABLE_TAG)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE);
        // sword
        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
               .add(

               );

         pickaxe
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(

                );

         axe
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(
                );

        // needs tool

        // needs diamond +
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE
                );

        // needs iron +
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_ORE,
                        ModBlocks.PINK_GARNET_BLOCK,
                        ModBlocks.RAW_PINK_GARNET_BLOCK
                );

         needs stone +
      getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
              .add(

              );
 */