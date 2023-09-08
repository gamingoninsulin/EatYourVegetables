package me.gamingoninsulin.common;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static me.gamingoninsulin.core.Reference.*;


public class ModItemGroup {

    // ##################################################
    public static final ItemGroup FOOD_AND_STUFFS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "food_and_stuffs"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.food_and_stuffs"))
                    .icon(() -> new ItemStack(ModItems.CAULIFLOWER)).entries((displayContext, entries) -> {
                        // ##################################################

                        // Cauliflower Item & Tree/Crop
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.COOKED_CAULIFLOWER);

                        // Cauliflower Decorations
                        entries.add(ModBlocks.CAULIFLOWER_BLOCK);
                        entries.add(ModBlocks.CAULIFLOWER_STAIRS);
                        entries.add(ModBlocks.CAULIFLOWER_SLAB);
                        entries.add(ModBlocks.CAULIFLOWER_WALL);
                        entries.add(ModBlocks.CAULIFLOWER_FENCE);
                        entries.add(ModBlocks.CAULIFLOWER_FENCE_GATE);
                        entries.add(ModBlocks.CAULIFLOWER_PRESSURE_PLATE);
                        entries.add(ModBlocks.CAULIFLOWER_BUTTON);

                        // Cauliflower Crates
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8);

                        // ##################################################

                        // Cucumber Item & Tree/Crop
                        entries.add(ModItems.CUCUMBER_SEEDS);
                        entries.add(ModItems.CUCUMBER);
                        entries.add(ModItems.CUT_CUCUMBER);

                        // Cucumber Decorations
                        entries.add(ModBlocks.CUCUMBER_BLOCK);
                        entries.add(ModBlocks.CUCUMBER_STAIRS);
                        entries.add(ModBlocks.CUCUMBER_SLAB);
                        entries.add(ModBlocks.CUCUMBER_WALL);
                        entries.add(ModBlocks.CUCUMBER_FENCE);
                        entries.add(ModBlocks.CUCUMBER_FENCE_GATE);
                        entries.add(ModBlocks.CUCUMBER_PRESSURE_PLATE);
                        entries.add(ModBlocks.CUCUMBER_BUTTON);

                        // Cucumber Crates
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8);

                        // ##################################################

                        // Avocado Item & Tree/Crop
                        entries.add(ModItems.AVOCADO);

                        // Avocado Decorations
                        entries.add(ModBlocks.AVOCADO_BLOCK);
                        entries.add(ModBlocks.AVOCADO_STAIRS);
                        entries.add(ModBlocks.AVOCADO_SLAB);
                        entries.add(ModBlocks.AVOCADO_WALL);
                        entries.add(ModBlocks.AVOCADO_FENCE);
                        entries.add(ModBlocks.AVOCADO_FENCE_GATE);
                        entries.add(ModBlocks.AVOCADO_PRESSURE_PLATE);
                        entries.add(ModBlocks.AVOCADO_BUTTON);

                        // Avocado Crates
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8);

                        // ##################################################

                        // Eggplant Item & Tree/Crop
                        entries.add(ModItems.EGGPLANT_SEEDS);
                        entries.add(ModItems.EGGPLANT);

                        // Eggplant Decorations
                        entries.add(ModBlocks.EGGPLANT_BLOCK);
                        entries.add(ModBlocks.EGGPLANT_STAIRS);
                        entries.add(ModBlocks.EGGPLANT_SLAB);
                        entries.add(ModBlocks.EGGPLANT_WALL);
                        entries.add(ModBlocks.EGGPLANT_FENCE);
                        entries.add(ModBlocks.EGGPLANT_FENCE_GATE);
                        entries.add(ModBlocks.EGGPLANT_PRESSURE_PLATE);
                        entries.add(ModBlocks.EGGPLANT_BUTTON);

                        // Eggplant Crates
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_1);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_2);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_3);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_4);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_5);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_6);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_7);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_8);

                        // ##################################################

                        // Corn Item & Tree/Crop
                        entries.add(ModItems.CORN);

                        // Corn Decorations
                        entries.add(ModBlocks.CORN_BLOCK);
                        entries.add(ModBlocks.CORN_STAIRS);
                        entries.add(ModBlocks.CORN_SLAB);
                        entries.add(ModBlocks.CORN_WALL);
                        entries.add(ModBlocks.CORN_FENCE);
                        entries.add(ModBlocks.CORN_FENCE_GATE);
                        entries.add(ModBlocks.CORN_PRESSURE_PLATE);
                        entries.add(ModBlocks.CORN_BUTTON);

                        // Corn Crates
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_1);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_2);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_3);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_4);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_5);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_6);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_7);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_8);

                        // ##################################################

                        // Sea Pickle Item & Tree/Crop
                        entries.add(ModItems.SEA_PICKLE);

                        entries.add(ModBlocks.SEA_PICKLE_BLOCK);
                        entries.add(ModBlocks.SEA_PICKLE_STAIRS);
                        entries.add(ModBlocks.SEA_PICKLE_SLAB);
                        entries.add(ModBlocks.SEA_PICKLE_WALL);
                        entries.add(ModBlocks.SEA_PICKLE_FENCE);
                        entries.add(ModBlocks.SEA_PICKLE_FENCE_GATE);
                        entries.add(ModBlocks.SEA_PICKLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SEA_PICKLE_BUTTON);

                        // Sea Pickle Crates
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8);

                        // ##################################################
                        // TREES

                        // pine
                        entries.add(ModBlocks.PINE_LOG);
                        entries.add(ModBlocks.PINE_WOOD);
                        entries.add(ModBlocks.STRIPPED_PINE_LOG);
                        entries.add(ModBlocks.STRIPPED_PINE_WOOD);
                        entries.add(ModBlocks.PINE_PLANKS_BLOCK);
                        entries.add(ModBlocks.PINE_LEAVES_BLOCK);
                        entries.add(ModBlocks.PINE_SAPLING);

                        entries.add(ModBlocks.PINE_PLANKS_STAIRS);
                        entries.add(ModBlocks.PINE_PLANKS_SLAB);
                        entries.add(ModBlocks.PINE_PLANKS_BUTTON);
                        entries.add(ModBlocks.PINE_PLANKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINE_PLANKS_FENCE);
                        entries.add(ModBlocks.PINE_PLANKS_FENCE_GATE);
                        entries.add(ModBlocks.PINE_PLANKS_WALL);

                        entries.add(ModBlocks.PINE_LEAVES_STAIRS);
                        entries.add(ModBlocks.PINE_LEAVES_SLAB);
                        entries.add(ModBlocks.PINE_LEAVES_WALL);

                        // ##################################################
                        // APPETIZERS
                        entries.add(ModItems.SALT_ITEM);
                        // MISC FOOD
                        entries.add(ModItems.WHEEL_OF_CHEESE);
                        entries.add(ModItems.FLUID_CHEESE_BUCKET);
                    }).build());

    // ##################################################

    public static final ItemGroup TOOLS_AND_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "tools_and_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.tools_and_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.EMPTY_CRATE)).entries((displayContext, entries) -> {
                        // ##################################################
                        // empty crate
                        entries.add(ModBlocks.EMPTY_CRATE);

                        // BOTTOM
                        // cabinet closed, open left, open right and open
                        entries.add(ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_CENTER_D_LEFT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_CENTER_D_RIGHT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN);

                        // kitchen cabinet corner left
                        entries.add(ModBlocks.KITCHEN_CABINET_LCORNER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_LCORNER_D_LEFT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_LCORNER_D_RIGHT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_LCORNER_D_BOTH_OPEN);

                        // kitchen cabinet corner right
                        entries.add(ModBlocks.KITCHEN_CABINET_RCORNER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_RCORNER_D_LEFT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_RCORNER_D_RIGHT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_RCORNER_D_BOTH_OPEN);

                        // TOP
                        // cabinet closed, open left, open right and open
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_LEFT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_RIGHT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_BOTH_OPEN);

                        // kitchen cabinet corner left
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_LEFT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_RIGHT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_BOTH_OPEN);

                        // kitchen cabinet corner right
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_LEFT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_RIGHT_OPEN);
                        entries.add(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_BOTH_OPEN);

                        // Kitchen ovens

                        // on
                        entries.add(ModBlocks.KITCHEN_OVEN_ON);
                        // off
                        entries.add(ModBlocks.KITCHEN_OVEN_OFF);

                        // kitchen sink
                        entries.add(ModBlocks.KITCHEN_SINK_WATER_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_SINK_WATER_D_LEFT_OPEN);
                        entries.add(ModBlocks.KITCHEN_SINK_WATER_D_RIGHT_OPEN);
                        entries.add(ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN);

                        // kitchen sink with water
                        entries.add(ModBlocks.KITCHEN_SINK_EMPTY_D_CLOSED);
                        entries.add(ModBlocks.KITCHEN_SINK_EMPTY_D_LEFT_OPEN);
                        entries.add(ModBlocks.KITCHEN_SINK_EMPTY_D_RIGHT_OPEN);
                        entries.add(ModBlocks.KITCHEN_SINK_EMPTY_D_BOTH_OPEN);

                        // kitchen extractor hood
                        entries.add(ModBlocks.KITCHEN_EXTRACTOR_HOOD);
                        // cheese press
                        // default
                        entries.add(ModBlocks.CHEESE_FORM_PRESS);
                        // working
                        entries.add(ModBlocks.CHEESE_FORM_PRESS_WORKING);
                        // done
                        entries.add(ModBlocks.CHEESE_FORM_PRESS_DONE);

                        // ##################################################
                        // stone knife
                        entries.add(ModItems.STONE_KNIFE);

                        // ##################################################
                    }).build());


    // ##################################################

    public static void registerItemGroups() {

    }

}
/*      //OFF\\

// ##################################################

    public static final ItemGroup ORES_AND_ORE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "ores_and_ore_items"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.ores_and_ore_items"))
                    .icon(() -> new ItemStack(ModItems.RAW_PINK_GARNET)).entries((displayContext, entries) -> {
                        // ORES, & (RAW) BLOCKS
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);
                        entries.add(ModBlocks.END_PINK_GARNET_ORE);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PEAT_BLOCK);
                        // ITEMS & RAW ITEMS
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.PEAT_BRICK);
                    }).build());

    // ##################################################

    public static final ItemGroup BLOCKS_AND_DECO = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "blocks_and_deco"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.blocks_and_deco"))
                    .icon(() -> new ItemStack(ModBlocks.PINK_GARNET_FENCE)).entries((displayContext, entries) -> {
                        // BLOCKS
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);

                        // DECO
                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
                    }).build());

    // ##################################################
 */