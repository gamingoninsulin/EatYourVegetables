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
                        ModBlocks.CUCUMBER_WALL,

                        // eggplant deco
                        ModBlocks.EGGPLANT_BLOCK,
                        ModBlocks.EGGPLANT_STAIRS,
                        ModBlocks.EGGPLANT_SLAB,
                        ModBlocks.EGGPLANT_PRESSURE_PLATE,
                        ModBlocks.EGGPLANT_BUTTON,
                        ModBlocks.EGGPLANT_FENCE,
                        ModBlocks.EGGPLANT_FENCE_GATE,
                        ModBlocks.EGGPLANT_WALL,

                        // avocado deco
                        ModBlocks.AVOCADO_BLOCK,
                        ModBlocks.AVOCADO_STAIRS,
                        ModBlocks.AVOCADO_SLAB,
                        ModBlocks.AVOCADO_PRESSURE_PLATE,
                        ModBlocks.AVOCADO_BUTTON,
                        ModBlocks.AVOCADO_FENCE,
                        ModBlocks.AVOCADO_FENCE_GATE,
                        ModBlocks.AVOCADO_WALL,

                        // sea pickle deco
                        ModBlocks.SEA_PICKLE_BLOCK,
                        ModBlocks.SEA_PICKLE_STAIRS,
                        ModBlocks.SEA_PICKLE_SLAB,
                        ModBlocks.SEA_PICKLE_PRESSURE_PLATE,
                        ModBlocks.SEA_PICKLE_BUTTON,
                        ModBlocks.SEA_PICKLE_FENCE,
                        ModBlocks.SEA_PICKLE_FENCE_GATE,
                        ModBlocks.SEA_PICKLE_WALL,

                        // corn deco
                        ModBlocks.CORN_BLOCK,
                        ModBlocks.CORN_STAIRS,
                        ModBlocks.CORN_SLAB,
                        ModBlocks.CORN_PRESSURE_PLATE,
                        ModBlocks.CORN_BUTTON,
                        ModBlocks.CORN_FENCE,
                        ModBlocks.CORN_FENCE_GATE,
                        ModBlocks.CORN_WALL
                );

        // pickaxe
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(
                        // kitchen oven on / off
                        ModBlocks.KITCHEN_OVEN_OFF,
                        ModBlocks.KITCHEN_OVEN_ON,

                        // kitchen sinks
                        ModBlocks.KITCHEN_SINK_WATER_D_CLOSED,
                        ModBlocks.KITCHEN_SINK_WATER_D_RIGHT_OPEN,
                        ModBlocks.KITCHEN_SINK_WATER_D_LEFT_OPEN,
                        ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN,

                        // kitchen sink with water
                        ModBlocks.KITCHEN_SINK_EMPTY_D_CLOSED,
                        ModBlocks.KITCHEN_SINK_EMPTY_D_LEFT_OPEN,
                        ModBlocks.KITCHEN_SINK_EMPTY_D_RIGHT_OPEN,
                        ModBlocks.KITCHEN_SINK_EMPTY_D_BOTH_OPEN,

                        // kitchen corner left
                        ModBlocks.KITCHEN_CABINET_LCORNER_D_CLOSED,
                        ModBlocks.KITCHEN_CABINET_LCORNER_D_LEFT_OPEN,
                        ModBlocks.KITCHEN_CABINET_LCORNER_D_RIGHT_OPEN,
                        ModBlocks.KITCHEN_CABINET_LCORNER_D_BOTH_OPEN,

                        // kitchen corner right
                        ModBlocks.KITCHEN_CABINET_RCORNER_D_CLOSED,
                        ModBlocks.KITCHEN_CABINET_RCORNER_D_RIGHT_OPEN,
                        ModBlocks.KITCHEN_CABINET_RCORNER_D_LEFT_OPEN,
                        ModBlocks.KITCHEN_CABINET_RCORNER_D_BOTH_OPEN
                );

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(
                        // empty crate
                        ModBlocks.EMPTY_CRATE,

                        // cabinets (closed, open left, open right, open)
                        ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED,
                        ModBlocks.KITCHEN_CABINET_CENTER_D_LEFT_OPEN,
                        ModBlocks.KITCHEN_CABINET_CENTER_D_RIGHT_OPEN,
                        ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN,

//                        ModBlocks.CHEESE_PRESS,
//                        ModBlocks.CHEESE_PRESS_WORKING,
//                        ModBlocks.CHEESE_PRESS_DONE,



                        // cauliflower 1 - 8
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7,
                        ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8,

                        // cucumbers 1 - 8
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7,
                        ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8,

                        // eggplant 1 - 8
                        ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_1,
                        ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_2,
                        ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_3,
                        ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_4,
                        ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_5,
                        ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_6,
                        ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_7,
                        ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_8,

                        // avocado 1 - 8
                        ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1,
                        ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2,
                        ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3,
                        ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4,
                        ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5,
                        ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6,
                        ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7,
                        ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8,

                        // corn 1 - 8
                        ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_1,
                        ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_2,
                        ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_3,
                        ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_4,
                        ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_5,
                        ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_6,
                        ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_7,
                        ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_8,

                        // sea_pickle 1 - 8
                        ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1,
                        ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2,
                        ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3,
                        ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4,
                        ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5,
                        ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6,
                        ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7,
                        ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8
                );

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(
                        ModBlocks.CAULIFLOWER_FENCE,
                        ModBlocks.CUCUMBER_FENCE,
                        ModBlocks.AVOCADO_FENCE,
                        ModBlocks.CORN_FENCE,
                        ModBlocks.EGGPLANT_FENCE,
                        ModBlocks.SEA_PICKLE_FENCE
                );

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(
                        ModBlocks.CAULIFLOWER_FENCE_GATE,
                        ModBlocks.CUCUMBER_FENCE_GATE,
                        ModBlocks.AVOCADO_FENCE_GATE,
                        ModBlocks.CORN_FENCE_GATE,
                        ModBlocks.EGGPLANT_FENCE_GATE,
                        ModBlocks.SEA_PICKLE_FENCE_GATE
                );

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(
                        ModBlocks.CAULIFLOWER_WALL,
                        ModBlocks.CUCUMBER_WALL,
                        ModBlocks.AVOCADO_WALL,
                        ModBlocks.CORN_WALL,
                        ModBlocks.EGGPLANT_WALL,
                        ModBlocks.SEA_PICKLE_WALL
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