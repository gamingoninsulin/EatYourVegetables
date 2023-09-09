package me.gamingoninsulin.common.blocks;

import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.common.blocks.custom.*;
import me.gamingoninsulin.common.blocks.custom.crops.CauliflowerCropBlock;
import me.gamingoninsulin.common.blocks.custom.crops.CucumberCropBlock;
import me.gamingoninsulin.common.blocks.custom.crops.EggplantCropBlock;
import me.gamingoninsulin.common.blocks.custom.kitchen.*;
import me.gamingoninsulin.common.blocks.custom.signs.ModHangingSignBlock;
import me.gamingoninsulin.common.blocks.custom.signs.ModStandingSignBlock;
import me.gamingoninsulin.common.blocks.custom.signs.ModWallHangingSignBlock;
import me.gamingoninsulin.common.blocks.custom.signs.ModWallSignBlock;
import me.gamingoninsulin.common.fluid.ModFluids;
import me.gamingoninsulin.common.util.ModWoodTypes;
import me.gamingoninsulin.core.Reference;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static me.gamingoninsulin.core.Reference.*;

public class ModBlocks {
    /*
       ##############################################################################################################
                                                TREES
       ##############################################################################################################
    */
    // pine
    // log
    public static final Block PINE_LOG = registerBlock("pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    // wood
    public static final Block PINE_WOOD = registerBlock("pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    // stripped log
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    // stripped wood
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    // planks
    public static final Block PINE_PLANKS_BLOCK = registerBlock("pine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));

// ############################################################################################################

    // PINE PLANKS VARIANT
    public static final Block PINE_PLANKS_STAIRS = registerBlock("pine_planks_stairs",
            new StairsBlock(ModBlocks.PINE_PLANKS_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PINE_PLANKS_SLAB = registerBlock("pine_planks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PINE_PLANKS_BUTTON = registerBlock("pine_planks_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK, 10, true));
    public static final Block PINE_PLANKS_PRESSURE_PLATE = registerBlock("pine_planks_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));

    public static final Block PINE_PLANKS_FENCE = registerBlock("pine_planks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PINE_PLANKS_FENCE_GATE = registerBlock("pine_planks_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), WoodType.OAK));

    public static final Block PINE_PLANKS_WALL = registerBlock("pine_planks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PINEWOOD_SIGN = registerBlockWithoutBlockItem("pinewood_sign",
            new ModStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), ModWoodTypes.PINEWOOD));
    public static final Block PINEWOOD_WALL_SIGN = registerBlockWithoutBlockItem("pinewood_wall_sign",
            new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), ModWoodTypes.PINEWOOD));
    public static final Block PINEWOOD_HANGING_SIGN = registerBlockWithoutBlockItem("pinewood_hanging_sign",
            new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), ModWoodTypes.PINEWOOD));
    public static final Block PINEWOOD_HANGING_WALL_SIGN = registerBlockWithoutBlockItem("pinewood_hanging_wall_sign",
            new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.PINEWOOD));

    // ############################################################################################################

    public static final Block PINE_LEAVES_WALL = registerBlock("pine_leaves_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    // ############################################################################################################

    // leaves
    public static final Block PINE_LEAVES_BLOCK = registerBlock("pine_leaves_block",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(1f)));

    // sapping
    public static final Block PINE_SAPLING = registerBlock("pine_sapling",
            new SaplingBlock(null, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4f)));
    /*
       ##############################################################################################################
                                                FLUIDS
       ##############################################################################################################
    */

    public static final Block CHEESE_FLUID_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Reference.MOD_ID,
            "cheese_fluid_block"), new FluidBlock(ModFluids.STILL_CHEESE_FLUID, FabricBlockSettings.copyOf(Blocks.WATER)
            .replaceable().liquid()));
    /*
       ##############################################################################################################
                                                Empty crate
       ##############################################################################################################
    */

    public static final Block EMPTY_CRATE = registerBlock("empty_crate",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                               BOTTOM CABINETS
       ##############################################################################################################
    */
    // cabinet center closed
    public static final Block KITCHEN_CABINET_CENTER_D_CLOSED = registerBlock("kitchen_cabinet_center_d_closed",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet center open left
    public static final Block KITCHEN_CABINET_CENTER_D_LEFT_OPEN = registerBlock("kitchen_cabinet_center_d_left_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet center open right
    public static final Block KITCHEN_CABINET_CENTER_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_center_d_right_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet center open
    public static final Block KITCHEN_CABINET_CENTER_D_BOTH_OPEN = registerBlock("kitchen_cabinet_center_d_both_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                                    BOTTOM CABINET
       ##############################################################################################################
    */
    // cabinet center no drawers closed
    public static final Block KITCHEN_CABINET_CENTER_NO_DRAWERS_D_CLOSED = registerBlock("kitchen_cabinet_center_no_drawers_d_closed",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet center no drawers open left
    public static final Block KITCHEN_CABINET_CENTER_NO_DRAWERS_D_LEFT_OPEN = registerBlock("kitchen_cabinet_center_no_drawers_d_left_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet center no drawers open right
    public static final Block KITCHEN_CABINET_CENTER_NO_DRAWERS_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_center_no_drawers_d_right_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet center no drawers open
    public static final Block KITCHEN_CABINET_CENTER_NO_DRAWERS_D_BOTH_OPEN = registerBlock("kitchen_cabinet_center_no_drawers_d_both_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                                     LCORNER CABINET
       ##############################################################################################################
    */

    // cabinet corner left closed
    public static final Block KITCHEN_CABINET_LCORNER_D_CLOSED = registerBlock("kitchen_cabinet_lcorner_d_closed",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner left open left
    public static final Block KITCHEN_CABINET_LCORNER_D_LEFT_OPEN = registerBlock("kitchen_cabinet_lcorner_d_left_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner left open right
    public static final Block KITCHEN_CABINET_LCORNER_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_lcorner_d_right_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet corner left open
    public static final Block KITCHEN_CABINET_LCORNER_D_BOTH_OPEN = registerBlock("kitchen_cabinet_lcorner_d_both_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                               LCORNER NO DRAWERS
       ##############################################################################################################
    */

    public static final Block KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_CLOSED = registerBlock("kitchen_cabinet_lcorner_no_drawers_d_closed",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner no drawers left open left
    public static final Block KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_LEFT_OPEN = registerBlock("kitchen_cabinet_lcorner_no_drawers_d_left_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner no drawers left open right
    public static final Block KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_lcorner_no_drawers_d_right_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet corner no drawers left open
    public static final Block KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_BOTH_OPEN = registerBlock("kitchen_cabinet_lcorner_no_drawers_d_both_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                               RCORNER CABINET
       ##############################################################################################################
    */

    // cabinet corner right closed
    public static final Block KITCHEN_CABINET_RCORNER_D_CLOSED = registerBlock("kitchen_cabinet_rcorner_d_closed",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner right open left
    public static final Block KITCHEN_CABINET_RCORNER_D_LEFT_OPEN = registerBlock("kitchen_cabinet_rcorner_d_left_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner right open right
    public static final Block KITCHEN_CABINET_RCORNER_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_rcorner_d_right_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet corner right open
    public static final Block KITCHEN_CABINET_RCORNER_D_BOTH_OPEN = registerBlock("kitchen_cabinet_rcorner_d_both_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                             RCORNER NO DRAWERS CABINET
       ##############################################################################################################
    */

    // cabinet corner no drawers right closed
    public static final Block KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_CLOSED = registerBlock("kitchen_cabinet_rcorner_no_drawers_d_closed",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner no drawers right open left
    public static final Block KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_LEFT_OPEN = registerBlock("kitchen_cabinet_rcorner_no_drawers_d_left_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner no drawers right open right
    public static final Block KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_rcorner_no_drawers_d_right_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet corner no drawers right open
    public static final Block KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_BOTH_OPEN = registerBlock("kitchen_cabinet_rcorner_no_drawers_d_both_open",
            new CabinetBottomBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                               CENTER TOP CABINETS
       ##############################################################################################################
    */
    // cabinet closed
    public static final Block KITCHEN_CABINET_TOP_CENTER_D_CLOSED = registerBlock("kitchen_cabinet_top_center_d_closed",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet open left
    public static final Block KITCHEN_CABINET_TOP_CENTER_D_LEFT_OPEN = registerBlock("kitchen_cabinet_top_center_d_left_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet open right
    public static final Block KITCHEN_CABINET_TOP_CENTER_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_top_center_d_right_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet open
    public static final Block KITCHEN_CABINET_TOP_CENTER_D_BOTH_OPEN = registerBlock("kitchen_cabinet_top_center_d_both_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                                TOP LEFT
       ##############################################################################################################
    */

    // cabinet corner left closed
    public static final Block KITCHEN_CABINET_TOP_LCORNER_D_CLOSED = registerBlock("kitchen_cabinet_top_lcorner_d_closed",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner left open left
    public static final Block KITCHEN_CABINET_TOP_LCORNER_D_LEFT_OPEN = registerBlock("kitchen_cabinet_top_lcorner_d_left_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner left open right
    public static final Block KITCHEN_CABINET_TOP_LCORNER_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_top_lcorner_d_right_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet corner left open
    public static final Block KITCHEN_CABINET_TOP_LCORNER_D_BOTH_OPEN = registerBlock("kitchen_cabinet_top_lcorner_d_both_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                               TOP RCORNER NO DRAWERS
       ##############################################################################################################
    */

    // cabinet corner right closed
    public static final Block KITCHEN_CABINET_TOP_RCORNER_D_CLOSED = registerBlock("kitchen_cabinet_top_rcorner_d_closed",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner right open left
    public static final Block KITCHEN_CABINET_TOP_RCORNER_D_LEFT_OPEN = registerBlock("kitchen_cabinet_top_rcorner_d_left_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cabinet corner right open right
    public static final Block KITCHEN_CABINET_TOP_RCORNER_D_RIGHT_OPEN = registerBlock("kitchen_cabinet_top_rcorner_d_right_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    //  cabinet corner right open
    public static final Block KITCHEN_CABINET_TOP_RCORNER_D_BOTH_OPEN = registerBlock("kitchen_cabinet_top_rcorner_d_both_open",
            new CabinetTopBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                               OVEN
       ##############################################################################################################
    */

    // oven off
    public static final Block KITCHEN_OVEN_OFF = registerBlock("kitchen_oven_off",
            new KitchenOvenBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    // oven on
    public static final Block KITCHEN_OVEN_ON = registerBlock("kitchen_oven_on",
            new KitchenOvenBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    /*
       ##############################################################################################################
                                                KITCHEN SINK
       ##############################################################################################################
    */

    // kitchen sink
    public static final Block KITCHEN_SINK_WATER_D_CLOSED = registerBlock("kitchen_sink_water_d_closed",
            new KitchenSinkWaterBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    // kitchen sink
    public static final Block KITCHEN_SINK_WATER_D_RIGHT_OPEN = registerBlock("kitchen_sink_water_d_right_open",
            new KitchenSinkWaterBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    // kitchen sink
    public static final Block KITCHEN_SINK_WATER_D_LEFT_OPEN = registerBlock("kitchen_sink_water_d_left_open",
            new KitchenSinkWaterBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    // kitchen sink
    public static final Block KITCHEN_SINK_WATER_D_BOTH_OPEN = registerBlock("kitchen_sink_water_d_both_open",
            new KitchenSinkWaterBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    /*
       ##############################################################################################################
                                                KITCHEN SINK WATER
       ##############################################################################################################
    */

    // kitchen empty facet sink
    public static final Block KITCHEN_SINK_EMPTY_D_CLOSED = registerBlock("kitchen_sink_empty_d_closed",
            new KitchenSinkBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    // kitchen empty facet sink
    public static final Block KITCHEN_SINK_EMPTY_D_RIGHT_OPEN = registerBlock("kitchen_sink_empty_d_right_open",
            new KitchenSinkBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    // kitchen empty facet sink
    public static final Block KITCHEN_SINK_EMPTY_D_LEFT_OPEN = registerBlock("kitchen_sink_empty_d_left_open",
            new KitchenSinkBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    // kitchen empty facet sink
    public static final Block KITCHEN_SINK_EMPTY_D_BOTH_OPEN = registerBlock("kitchen_sink_empty_d_both_open",
            new KitchenSinkBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    /*
       ##############################################################################################################
                                             KITCHEN EXTRACTOR HOOD
       ##############################################################################################################
    */

    // kitchen extractor hood
    public static final Block KITCHEN_EXTRACTOR_HOOD = registerBlock("kitchen_extractor_hood",
            new KitchenSinkBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    /*
       ##############################################################################################################
                                             CHEESE FORM PRESS
       ##############################################################################################################
    */

    // cheese press
    public static final Block CHEESE_FORM_PRESS = registerBlock("cheese_form_press",
            new CheesePressBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cheese press working
    public static final Block CHEESE_FORM_PRESS_WORKING = registerBlock("cheese_form_press_working",
            new CheesePressBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    // cheese press done
    public static final Block CHEESE_FORM_PRESS_DONE = registerBlock("cheese_form_press_done",
            new CheesePressBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                                CAULIFLOWER
       ##############################################################################################################
    */

    // Cauliflower Block
    public static final Block CAULIFLOWER_BLOCK = registerBlock("cauliflower_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // Cauliflower Crop
    public static final Block CAULIFLOWER_CROP = registerBlockWithoutBlockItem("cauliflower_crop",
            new CauliflowerCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    // Cauliflower Decorations
    public static final Block CAULIFLOWER_STAIRS = registerBlock("cauliflower_stairs",
            new StairsBlock(ModBlocks.CAULIFLOWER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CAULIFLOWER_SLAB = registerBlock("cauliflower_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CAULIFLOWER_BUTTON = registerBlock("cauliflower_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT), BlockSetType.OAK, 10, true));
    public static final Block CAULIFLOWER_PRESSURE_PLATE = registerBlock("cauliflower_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT), BlockSetType.OAK));
    public static final Block CAULIFLOWER_FENCE = registerBlock("cauliflower_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CAULIFLOWER_FENCE_GATE = registerBlock("cauliflower_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT), WoodType.OAK));

    public static final Block CAULIFLOWER_WALL = registerBlock("cauliflower_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // cauliflower crates
    // layer 1
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1 = registerBlock("mod_crate_block_cauliflower_layer_1",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    // layer 2
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2 = registerBlock("mod_crate_block_cauliflower_layer_2",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    // later 3
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3 = registerBlock("mod_crate_block_cauliflower_layer_3",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    // layer 4
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4 = registerBlock("mod_crate_block_cauliflower_layer_4",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    // later 5
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5 = registerBlock("mod_crate_block_cauliflower_layer_5",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    // later 6
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6 = registerBlock("mod_crate_block_cauliflower_layer_6",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    // later 7
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7 = registerBlock("mod_crate_block_cauliflower_layer_7",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    // later 8
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8 = registerBlock("mod_crate_block_cauliflower_layer_8",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    /*
       ##############################################################################################################
                                                CUCUMBER
       ##############################################################################################################
    */

    // Cucumber Block
    public static final Block CUCUMBER_BLOCK = registerBlock(    "cucumber_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // Cucumber Crop
    public static final Block CUCUMBER_CROP = registerBlockWithoutBlockItem("cucumber_crop",
            new CucumberCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    // Cucumber Decorations
    public static final Block CUCUMBER_STAIRS = registerBlock("cucumber_stairs",
            new StairsBlock(ModBlocks.CUCUMBER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CUCUMBER_SLAB = registerBlock("cucumber_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CUCUMBER_BUTTON = registerBlock("cucumber_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT), BlockSetType.OAK, 10, true));
    public static final Block CUCUMBER_PRESSURE_PLATE = registerBlock("cucumber_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT), BlockSetType.OAK));
    public static final Block CUCUMBER_FENCE = registerBlock("cucumber_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CUCUMBER_FENCE_GATE = registerBlock("cucumber_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT), WoodType.OAK));
    public static final Block CUCUMBER_WALL = registerBlock("cucumber_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // Cucumber Crates
    // layer 1
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_1 = registerBlock("mod_crate_block_cucumber_layer_1",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 2
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_2 = registerBlock("mod_crate_block_cucumber_layer_2",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 3
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_3 = registerBlock("mod_crate_block_cucumber_layer_3",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 4
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_4 = registerBlock("mod_crate_block_cucumber_layer_4",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 5
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_5 = registerBlock("mod_crate_block_cucumber_layer_5",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 6
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_6 = registerBlock("mod_crate_block_cucumber_layer_6",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 7
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_7 = registerBlock("mod_crate_block_cucumber_layer_7",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 8
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_8 = registerBlock("mod_crate_block_cucumber_layer_8",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));

   /*
       ##############################################################################################################
                                                AVOCADO
       ##############################################################################################################
    */

    // Avocado Block
    public static final Block AVOCADO_BLOCK = registerBlock(    "avocado_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    // Avocado Decorations
    public static final Block AVOCADO_STAIRS = registerBlock("avocado_stairs",
            new StairsBlock(ModBlocks.AVOCADO_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block AVOCADO_SLAB = registerBlock("avocado_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block AVOCADO_BUTTON = registerBlock("avocado_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK, 10, true));
    public static final Block AVOCADO_PRESSURE_PLATE = registerBlock("avocado_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block AVOCADO_FENCE = registerBlock("avocado_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block AVOCADO_FENCE_GATE = registerBlock("avocado_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.STONE), WoodType.OAK));
    public static final Block AVOCADO_WALL = registerBlock("avocado_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    // Avocado Crates
    // layer 1
    public static final Block MOD_CRATE_BLOCK_AVOCADO_LAYER_1 = registerBlock("mod_crate_block_avocado_layer_1",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 2
    public static final Block MOD_CRATE_BLOCK_AVOCADO_LAYER_2 = registerBlock("mod_crate_block_avocado_layer_2",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 3
    public static final Block MOD_CRATE_BLOCK_AVOCADO_LAYER_3 = registerBlock("mod_crate_block_avocado_layer_3",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 4
    public static final Block MOD_CRATE_BLOCK_AVOCADO_LAYER_4 = registerBlock("mod_crate_block_avocado_layer_4",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 5
    public static final Block MOD_CRATE_BLOCK_AVOCADO_LAYER_5 = registerBlock("mod_crate_block_avocado_layer_5",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 6
    public static final Block MOD_CRATE_BLOCK_AVOCADO_LAYER_6 = registerBlock("mod_crate_block_avocado_layer_6",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 7
    public static final Block MOD_CRATE_BLOCK_AVOCADO_LAYER_7 = registerBlock("mod_crate_block_avocado_layer_7",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 8
    public static final Block MOD_CRATE_BLOCK_AVOCADO_LAYER_8 = registerBlock("mod_crate_block_avocado_layer_8",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));

    /*
       ##############################################################################################################
                                                EGGPLANT
       ##############################################################################################################
    */

    // Eggplant Block
    public static final Block EGGPLANT_BLOCK = registerBlock(    "eggplant_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    // Eggplant Crop
    public static final Block EGGPLANT_CROP = registerBlockWithoutBlockItem("eggplant_crop",
            new EggplantCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    // Eggplant Decorations
    public static final Block EGGPLANT_STAIRS = registerBlock("eggplant_stairs",
            new StairsBlock(ModBlocks.EGGPLANT_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block EGGPLANT_SLAB = registerBlock("eggplant_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block EGGPLANT_BUTTON = registerBlock("eggplant_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK, 10, true));
    public static final Block EGGPLANT_PRESSURE_PLATE = registerBlock("eggplant_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK));
    public static final Block EGGPLANT_FENCE = registerBlock("eggplant_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block EGGPLANT_FENCE_GATE = registerBlock("eggplant_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.STONE), WoodType.OAK));
    public static final Block EGGPLANT_WALL = registerBlock("eggplant_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    // Eggplant Crates
    // layer 1
    public static final Block MOD_CRATE_BLOCK_EGGPLANT_LAYER_1 = registerBlock("mod_crate_block_eggplant_layer_1",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 2
    public static final Block MOD_CRATE_BLOCK_EGGPLANT_LAYER_2 = registerBlock("mod_crate_block_eggplant_layer_2",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 3
    public static final Block MOD_CRATE_BLOCK_EGGPLANT_LAYER_3 = registerBlock("mod_crate_block_eggplant_layer_3",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 4
    public static final Block MOD_CRATE_BLOCK_EGGPLANT_LAYER_4 = registerBlock("mod_crate_block_eggplant_layer_4",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 5
    public static final Block MOD_CRATE_BLOCK_EGGPLANT_LAYER_5 = registerBlock("mod_crate_block_eggplant_layer_5",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 6
    public static final Block MOD_CRATE_BLOCK_EGGPLANT_LAYER_6 = registerBlock("mod_crate_block_eggplant_layer_6",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 7
    public static final Block MOD_CRATE_BLOCK_EGGPLANT_LAYER_7 = registerBlock("mod_crate_block_eggplant_layer_7",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 8
    public static final Block MOD_CRATE_BLOCK_EGGPLANT_LAYER_8 = registerBlock("mod_crate_block_eggplant_layer_8",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));

    /*
       ##############################################################################################################
                                                   CORN
       ##############################################################################################################
    */

    // Corn Block
    public static final Block CORN_BLOCK = registerBlock(    "corn_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    // Corn Crop

    // CORN
    public static final Block CORN_STAIRS = registerBlock("corn_stairs",
            new StairsBlock(ModBlocks.CORN_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block CORN_SLAB = registerBlock("corn_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block CORN_BUTTON = registerBlock("corn_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK, 10, true));
    public static final Block CORN_PRESSURE_PLATE = registerBlock("corn_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK));
    public static final Block CORN_FENCE = registerBlock("corn_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block CORN_FENCE_GATE = registerBlock("corn_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.STONE), WoodType.OAK));
    public static final Block CORN_WALL = registerBlock("corn_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    // Cron Crates
    // layer 1
    public static final Block MOD_CRATE_BLOCK_CORN_LAYER_1 = registerBlock("mod_crate_block_corn_layer_1",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 2
    public static final Block MOD_CRATE_BLOCK_CORN_LAYER_2 = registerBlock("mod_crate_block_corn_layer_2",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 3
    public static final Block MOD_CRATE_BLOCK_CORN_LAYER_3 = registerBlock("mod_crate_block_corn_layer_3",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 4
    public static final Block MOD_CRATE_BLOCK_CORN_LAYER_4 = registerBlock("mod_crate_block_corn_layer_4",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 5
    public static final Block MOD_CRATE_BLOCK_CORN_LAYER_5 = registerBlock("mod_crate_block_corn_layer_5",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 6
    public static final Block MOD_CRATE_BLOCK_CORN_LAYER_6 = registerBlock("mod_crate_block_corn_layer_6",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 7
    public static final Block MOD_CRATE_BLOCK_CORN_LAYER_7 = registerBlock("mod_crate_block_corn_layer_7",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 8
    public static final Block MOD_CRATE_BLOCK_CORN_LAYER_8 = registerBlock("mod_crate_block_corn_layer_8",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));

    /*
       ##############################################################################################################
                                                SEA PICKLE
       ##############################################################################################################
    */

    // Sea Pickle Block
    public static final Block SEA_PICKLE_BLOCK = registerBlock(    "sea_pickle_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    // Sea Pickle Decorations
    public static final Block SEA_PICKLE_STAIRS = registerBlock("sea_pickle_stairs",
            new StairsBlock(ModBlocks.SEA_PICKLE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block SEA_PICKLE_SLAB = registerBlock("sea_pickle_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block SEA_PICKLE_BUTTON = registerBlock("sea_pickle_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK, 10, true));
    public static final Block SEA_PICKLE_PRESSURE_PLATE = registerBlock("sea_pickle_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK));
    public static final Block SEA_PICKLE_FENCE = registerBlock("sea_pickle_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block SEA_PICKLE_FENCE_GATE = registerBlock("sea_pickle_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.STONE), WoodType.OAK));
    public static final Block SEA_PICKLE_WALL = registerBlock("sea_pickle_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));

    // Sea Pickle Crates
    // layer 1
    public static final Block MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1 = registerBlock("mod_crate_block_sea_pickle_layer_1",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 2
    public static final Block MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2 = registerBlock("mod_crate_block_sea_pickle_layer_2",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 3
    public static final Block MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3 = registerBlock("mod_crate_block_sea_pickle_layer_3",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 4
    public static final Block MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4 = registerBlock("mod_crate_block_sea_pickle_layer_4",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 5
    public static final Block MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5 = registerBlock("mod_crate_block_sea_pickle_layer_5",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 6
    public static final Block MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6 = registerBlock("mod_crate_block_sea_pickle_layer_6",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 7
    public static final Block MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7 = registerBlock("mod_crate_block_sea_pickle_layer_7",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 8
    public static final Block MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8 = registerBlock("mod_crate_block_sea_pickle_layer_8",
            new EmptyCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));

    /*
       ##############################################################################################################
                                             DONT'T TOUCH DOWN HERE!
       ##############################################################################################################
    */

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }

    // register blocks
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name),block);
    }

    // register block items
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        EYVBMod.LOGGER.info("Registering Mod Blocks for " + REGISTER_MOD_NAME);
    }

}
/*
       ##############################################################################################################
                                                TURNED OFF
       ##############################################################################################################

 //PINK GARNET
    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));


       ##############################################################################################################
                                               BLOCKS
       ##############################################################################################################
    public static final Block NETHER_PINK_GARNET_ORE = registerBlock("nether_pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block END_PINK_GARNET_ORE = registerBlock("end_pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

     public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

     public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), WoodType.ACACIA));

     public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

       ##############################################################################################################
                                           CROPS
       ##############################################################################################################


    public static final Block CAULIFLOWER_DOOR = registerBlock("cauliflower_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.BAMBOO));
    public static final Block CAULIFLOWER_TRAPDOOR = registerBlock("cauliflower_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.BAMBOO));

       ##############################################################################################################
                                             FUELS
       ##############################################################################################################

// FUELS
    public static final Block PEAT_BLOCK = registerBlock("peat_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

*/