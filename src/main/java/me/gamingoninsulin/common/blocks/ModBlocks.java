package me.gamingoninsulin.common.blocks;

import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.common.blocks.custom.CauliflowerCropBlock;
import me.gamingoninsulin.common.blocks.custom.CucumberCropBlock;
import me.gamingoninsulin.common.blocks.custom.EggplantCropBlock;
import me.gamingoninsulin.common.blocks.custom.ModCrateBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static me.gamingoninsulin.core.Reference.*;

public class ModBlocks {
    // ##################################################
    // CAULIFLOWER

    // Cauliflower Block
    public static final Block CAULIFLOWER_BLOCK = registerBlock(    "cauliflower_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    public static final Block CAULIFLOWER_STAIRS = registerBlock("cauliflower_stairs",
            new StairsBlock(ModBlocks.CAULIFLOWER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CAULIFLOWER_SLAB = registerBlock("cauliflower_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CAULIFLOWER_BUTTON = registerBlock("cauliflower_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.BAMBOO, 10, true));
    public static final Block CAULIFLOWER_PRESSURE_PLATE = registerBlock("cauliflower_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.BAMBOO));

    public static final Block CAULIFLOWER_FENCE = registerBlock("cauliflower_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block CAULIFLOWER_FENCE_GATE = registerBlock("cauliflower_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block CAULIFLOWER_WALL = registerBlock("cauliflower_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    // ##################################################

    // Cucumber
    public static final Block CUCUMBER_BLOCK = registerBlock(    "cucumber_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // CUCUMBER
    public static final Block CUCUMBER_STAIRS = registerBlock("cucumber_stairs",
            new StairsBlock(ModBlocks.CUCUMBER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CUCUMBER_SLAB = registerBlock("cucumber_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CUCUMBER_BUTTON = registerBlock("cucumber_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.BAMBOO, 10, true));
    public static final Block CUCUMBER_PRESSURE_PLATE = registerBlock("cucumber_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.BAMBOO));

    public static final Block CUCUMBER_FENCE = registerBlock("cucumber_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block CUCUMBER_FENCE_GATE = registerBlock("cucumber_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block CUCUMBER_WALL = registerBlock("cucumber_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    // ##################################################

    // Avocado Block
    public static final Block AVOCADO_BLOCK = registerBlock(    "avocado_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // AVOCADO
    public static final Block AVOCADO_STAIRS = registerBlock("avocado_stairs",
            new StairsBlock(ModBlocks.AVOCADO_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block AVOCADO_SLAB = registerBlock("avocado_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block AVOCADO_BUTTON = registerBlock("avocado_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.BAMBOO, 10, true));
    public static final Block AVOCADO_PRESSURE_PLATE = registerBlock("avocado_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.BAMBOO));
    public static final Block AVOCADO_FENCE = registerBlock("avocado_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block AVOCADO_FENCE_GATE = registerBlock("avocado_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block AVOCADO_WALL = registerBlock("avocado_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    // ##################################################

    // Eggplant Block
    public static final Block EGGPLANT_BLOCK = registerBlock(    "eggplant_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // EGGPLANT
    public static final Block EGGPLANT_STAIRS = registerBlock("eggplant_stairs",
            new StairsBlock(ModBlocks.EGGPLANT_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block EGGPLANT_SLAB = registerBlock("eggplant_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block EGGPLANT_BUTTON = registerBlock("eggplant_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.BAMBOO, 10, true));
    public static final Block EGGPLANT_PRESSURE_PLATE = registerBlock("eggplant_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.BAMBOO));
    public static final Block EGGPLANT_FENCE = registerBlock("eggplant_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block EGGPLANT_FENCE_GATE = registerBlock("eggplant_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block EGGPLANT_WALL = registerBlock("eggplant_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    // ##################################################

    // Corn Block
    public static final Block CORN_BLOCK = registerBlock(    "corn_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // CORN
    public static final Block CORN_STAIRS = registerBlock("corn_stairs",
            new StairsBlock(ModBlocks.CORN_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CORN_SLAB = registerBlock("corn_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block CORN_BUTTON = registerBlock("corn_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.BAMBOO, 10, true));
    public static final Block CORN_PRESSURE_PLATE = registerBlock("corn_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.BAMBOO));
    public static final Block CORN_FENCE = registerBlock("corn_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block CORN_FENCE_GATE = registerBlock("corn_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block CORN_WALL = registerBlock("corn_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    // ##################################################

    // Sea Pickle Block
    public static final Block SEA_PICKLE_BLOCK = registerBlock(    "sea_pickle_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));

    // SEA PICKLE
    public static final Block SEA_PICKLE_STAIRS = registerBlock("sea_pickle_stairs",
            new StairsBlock(ModBlocks.SEA_PICKLE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block SEA_PICKLE_SLAB = registerBlock("sea_pickle_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ROOTED_DIRT)));
    public static final Block SEA_PICKLE_BUTTON = registerBlock("sea_pickle_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.BAMBOO, 10, true));
    public static final Block SEA_PICKLE_PRESSURE_PLATE = registerBlock("sea_pickle_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.BAMBOO));
    public static final Block SEA_PICKLE_FENCE = registerBlock("sea_pickle_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SEA_PICKLE_FENCE_GATE = registerBlock("sea_pickle_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block SEA_PICKLE_WALL = registerBlock("sea_pickle_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));

    // ##################################################
    
    // FOOD
    // CROPS
    public static final Block CAULIFLOWER_CROP = registerBlockWithoutBlockItem("cauliflower_crop",
            new CauliflowerCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block CUCUMBER_CROP = registerBlockWithoutBlockItem("cucumber_crop",
            new CucumberCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block EGGPLANT_CROP = registerBlockWithoutBlockItem("eggplant_crop",
            new EggplantCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));



    // ##################################################
    // MISC
    // empty crate
    public static final Block MOD_CRATE_BLOCK = registerBlock("mod_crate_block",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));

    // CAULIFLOWER \\
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1 = registerBlock("mod_crate_block_cauliflower_layer_1",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 2
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2 = registerBlock("mod_crate_block_cauliflower_layer_2",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 3
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3 = registerBlock("mod_crate_block_cauliflower_layer_3",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4 = registerBlock("mod_crate_block_cauliflower_layer_4",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 4
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5 = registerBlock("mod_crate_block_cauliflower_layer_5",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 5
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6 = registerBlock("mod_crate_block_cauliflower_layer_6",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 6
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7 = registerBlock("mod_crate_block_cauliflower_layer_7",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 7
    public static final Block MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8 = registerBlock("mod_crate_block_cauliflower_layer_8",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));

    // CUCUMBER \\
    // layer 1
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_1 = registerBlock("mod_crate_block_cucumber_layer_1",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // layer 2
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_2 = registerBlock("mod_crate_block_cucumber_layer_2",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 3
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_3 = registerBlock("mod_crate_block_cucumber_layer_3",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_4 = registerBlock("mod_crate_block_cucumber_layer_4",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 4
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_5 = registerBlock("mod_crate_block_cucumber_layer_5",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 5
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_6 = registerBlock("mod_crate_block_cucumber_layer_6",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 6
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_7 = registerBlock("mod_crate_block_cucumber_layer_7",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));
    // later 7
    public static final Block MOD_CRATE_BLOCK_CUCUMBER_LAYER_8 = registerBlock("mod_crate_block_cucumber_layer_8",
            new ModCrateBlock(FabricBlockSettings.copyOf(Blocks.CHEST).nonOpaque()));

    // ##################################################

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
/*     //OFF\\
// ##################################################

 PINK GARNET
    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

// ##################################################
    public static final Block NETHER_PINK_GARNET_ORE = registerBlock("nether_pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block END_PINK_GARNET_ORE = registerBlock("end_pink_garnet_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

// ##################################################


    public static final Block CAULIFLOWER_DOOR = registerBlock("cauliflower_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.BAMBOO));
    public static final Block CAULIFLOWER_TRAPDOOR = registerBlock("cauliflower_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.BAMBOO));

// ##################################################

// FUELS
    public static final Block PEAT_BLOCK = registerBlock("peat_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

*/