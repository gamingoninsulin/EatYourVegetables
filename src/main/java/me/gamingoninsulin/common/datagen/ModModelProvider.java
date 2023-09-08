package me.gamingoninsulin.common.datagen;

import dev.architectury.platform.Mod;
import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.blocks.custom.crops.CauliflowerCropBlock;
import me.gamingoninsulin.common.blocks.custom.crops.CucumberCropBlock;
import me.gamingoninsulin.common.blocks.custom.crops.EggplantCropBlock;
import me.gamingoninsulin.common.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamilies;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockstatemodelgenerator) {

        // ######################################################################################################### \\
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EMPTY_CRATE);

        // BOTTOM
        // kitchen cabinets
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN);

        // NO DRAWERS
        // kitchen cabinets
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_NO_DRAWERS_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_NO_DRAWERS_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_NO_DRAWERS_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_NO_DRAWERS_D_BOTH_OPEN);

        // ######################################################################################################### \\

        // kitchen cabinet corners left
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_BOTH_OPEN);

        // NO DRAWERS
        // kitchen cabinet corners left
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_BOTH_OPEN);

        // ######################################################################################################### \\

        // kitchen cabinet corners left
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_BOTH_OPEN);

        // NO DRAWERS
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_BOTH_OPEN);

        // ######################################################################################################### \\

        // TOP
        // kitchen cabinets
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_BOTH_OPEN);

        // kitchen cabinet corners left
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_BOTH_OPEN);

        // kitchen cabinet corners left
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_BOTH_OPEN);

        // ######################################################################################################### \\

        // kitchen ovens
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_OVEN_OFF);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_OVEN_ON);

        // ######################################################################################################### \\

        // kitchens sinks
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_WATER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_WATER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_WATER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN);

        // kitchen sink with water
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_EMPTY_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_EMPTY_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_EMPTY_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_EMPTY_D_BOTH_OPEN);

        // ######################################################################################################### \\

        // kitchen extractor hood
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_EXTRACTOR_HOOD);

        // ######################################################################################################### \\

        // cheese press
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_FORM_PRESS);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_FORM_PRESS_WORKING);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_FORM_PRESS_DONE);

        // ######################################################################################################### \\

        //  CAULIFLOWER BLOCK
        BlockStateModelGenerator.BlockTexturePool CauliflowerTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.CAULIFLOWER_BLOCK);

        // CROP
        blockstatemodelgenerator.registerCrop(ModBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        CauliflowerTexture.stairs(ModBlocks.CAULIFLOWER_STAIRS);
        CauliflowerTexture.slab(ModBlocks.CAULIFLOWER_SLAB);
        CauliflowerTexture.button(ModBlocks.CAULIFLOWER_BUTTON);
        CauliflowerTexture.pressurePlate(ModBlocks.CAULIFLOWER_PRESSURE_PLATE);
        CauliflowerTexture.fence(ModBlocks.CAULIFLOWER_FENCE);
        CauliflowerTexture.fenceGate(ModBlocks.CAULIFLOWER_FENCE_GATE);
        CauliflowerTexture.wall(ModBlocks.CAULIFLOWER_WALL);

        // layer 1
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1);

        // layer 2
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2);

        // layer 3
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3);

        // layer 4
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4);

        // layer 5
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5);

        // layer
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6);

        // layer 7
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7);

        // layer 8
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8);

        // ######################################################################################################### \\

        // CUCUMBER BLOCK
        BlockStateModelGenerator.BlockTexturePool CucumberTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.CUCUMBER_BLOCK);

        // CROP
        blockstatemodelgenerator.registerCrop(ModBlocks.CUCUMBER_CROP, CucumberCropBlock.AGE, 0, 1, 2, 3, 4, 5);

        CucumberTexture.stairs(ModBlocks.CUCUMBER_STAIRS);
        CucumberTexture.slab(ModBlocks.CUCUMBER_SLAB);
        CucumberTexture.button(ModBlocks.CUCUMBER_BUTTON);
        CucumberTexture.pressurePlate(ModBlocks.CUCUMBER_PRESSURE_PLATE);
        CucumberTexture.fence(ModBlocks.CUCUMBER_FENCE);
        CucumberTexture.fenceGate(ModBlocks.CUCUMBER_FENCE_GATE);
        CucumberTexture.wall(ModBlocks.CUCUMBER_WALL);

        // layer 1
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1);

        // layer 2
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2);

        // layer 3
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3);

        // layer 4
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4);

        // layer 5
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5);

        // layer
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6);

        // layer 7
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7);

        // layer 8
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8);

        // ######################################################################################################### \\

        //  AVOCADO BLOCK
        BlockStateModelGenerator.BlockTexturePool AvocadoTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.AVOCADO_BLOCK);

        // CROP
//        blockstatemodelgenerator.registerCrop(ModBlocks.AVOCADO_CROP, AvocadoCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        AvocadoTexture.stairs(ModBlocks.AVOCADO_STAIRS);
        AvocadoTexture.slab(ModBlocks.AVOCADO_SLAB);
        AvocadoTexture.button(ModBlocks.AVOCADO_BUTTON);
        AvocadoTexture.pressurePlate(ModBlocks.AVOCADO_PRESSURE_PLATE);
        AvocadoTexture.fence(ModBlocks.AVOCADO_FENCE);
        AvocadoTexture.fenceGate(ModBlocks.AVOCADO_FENCE_GATE);
        AvocadoTexture.wall(ModBlocks.AVOCADO_WALL);

        // layer 1
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1);

        // layer 2
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2);

        // layer 3
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3);

        // layer 4
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4);

        // layer 5
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5);

        // layer
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6);

        // layer 7
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7);

        // layer 8
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8);

        // ######################################################################################################### \\

        //  EGGPLANT BLOCK
        BlockStateModelGenerator.BlockTexturePool EggplantTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.EGGPLANT_BLOCK);

        // CROP
        blockstatemodelgenerator.registerCrop(ModBlocks.EGGPLANT_CROP, EggplantCropBlock.AGE, 0, 1, 2, 3, 4, 5);

        EggplantTexture.stairs(ModBlocks.EGGPLANT_STAIRS);
        EggplantTexture.slab(ModBlocks.EGGPLANT_SLAB);
        EggplantTexture.button(ModBlocks.EGGPLANT_BUTTON);
        EggplantTexture.pressurePlate(ModBlocks.EGGPLANT_PRESSURE_PLATE);
        EggplantTexture.fence(ModBlocks.EGGPLANT_FENCE);
        EggplantTexture.fenceGate(ModBlocks.EGGPLANT_FENCE_GATE);
        EggplantTexture.wall(ModBlocks.EGGPLANT_WALL);

        // layer 1
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_1);

        // layer 2
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_2);

        // layer 3
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_3);

        // layer 4
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_4);

        // layer 5
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_5);

        // layer
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_6);

        // layer 7
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_7);

        // layer 8
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_8);

        // ######################################################################################################### \\

        //  CORN BLOCK
        BlockStateModelGenerator.BlockTexturePool CornTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.CORN_BLOCK);

        // CROP
//        blockstatemodelgenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        CornTexture.stairs(ModBlocks.CORN_STAIRS);
        CornTexture.slab(ModBlocks.CORN_SLAB);
        CornTexture.button(ModBlocks.CORN_BUTTON);
        CornTexture.pressurePlate(ModBlocks.CORN_PRESSURE_PLATE);
        CornTexture.fence(ModBlocks.CORN_FENCE);
        CornTexture.fenceGate(ModBlocks.CORN_FENCE_GATE);
        CornTexture.wall(ModBlocks.CORN_WALL);

        // layer 1
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_1);

        // layer 2
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_2);

        // layer 3
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_3);

        // layer 4
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_4);

        // layer 5
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_5);

        // layer
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_6);

        // layer 7
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_7);

        // layer 8
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_8);

        // ######################################################################################################### \\

        //  SEA PICKLE BLOCK
        BlockStateModelGenerator.BlockTexturePool SeaPickleTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.SEA_PICKLE_BLOCK);

        // CROP
//        blockstatemodelgenerator.registerCrop(ModBlocks.SEA_PICKLE_CROP, SeaPickleCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        SeaPickleTexture.stairs(ModBlocks.SEA_PICKLE_STAIRS);
        SeaPickleTexture.slab(ModBlocks.SEA_PICKLE_SLAB);
        SeaPickleTexture.button(ModBlocks.SEA_PICKLE_BUTTON);
        SeaPickleTexture.pressurePlate(ModBlocks.SEA_PICKLE_PRESSURE_PLATE);
        SeaPickleTexture.fence(ModBlocks.SEA_PICKLE_FENCE);
        SeaPickleTexture.fenceGate(ModBlocks.SEA_PICKLE_FENCE_GATE);
        SeaPickleTexture.wall(ModBlocks.SEA_PICKLE_WALL);



        // layer 1
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1);

        // layer 2
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2);

        // layer 3
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3);

        // layer 4
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4);

        // layer 5
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5);

        // layer
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6);

        // layer 7
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7);

        // layer 8
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8);


        // TREES
        // PINE
        blockstatemodelgenerator.registerLog(ModBlocks.PINE_LOG).log(ModBlocks.PINE_LOG).wood(ModBlocks.PINE_WOOD);
        blockstatemodelgenerator.registerLog(ModBlocks.STRIPPED_PINE_LOG).log(ModBlocks.STRIPPED_PINE_LOG).wood(ModBlocks.STRIPPED_PINE_WOOD);

        // blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.PINE_PLANK_BLOCK);
        //blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.PINE_LEAVES_BLOCK);

        BlockStateModelGenerator.BlockTexturePool PinePlanksTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.PINE_PLANKS_BLOCK);

        PinePlanksTexture.family(BlockFamilies.register(ModBlocks.PINE_PLANKS_BLOCK).sign(ModBlocks.PINEWOOD_SIGN, ModBlocks.PINEWOOD_WALL_SIGN).build());

        PinePlanksTexture.stairs(ModBlocks.PINE_PLANKS_STAIRS);
        PinePlanksTexture.slab(ModBlocks.PINE_PLANKS_SLAB);
        PinePlanksTexture.button(ModBlocks.PINE_PLANKS_BUTTON);
        PinePlanksTexture.pressurePlate(ModBlocks.PINE_PLANKS_PRESSURE_PLATE);
        PinePlanksTexture.fence(ModBlocks.PINE_PLANKS_FENCE);
        PinePlanksTexture.fenceGate(ModBlocks.PINE_PLANKS_FENCE_GATE);
        PinePlanksTexture.wall(ModBlocks.PINE_PLANKS_WALL);


        BlockStateModelGenerator.BlockTexturePool PineLeavesTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.PINE_LEAVES_BLOCK);

        PineLeavesTexture.stairs(ModBlocks.PINE_LEAVES_STAIRS);
        PineLeavesTexture.slab(ModBlocks.PINE_LEAVES_SLAB);
        PineLeavesTexture.wall(ModBlocks.PINE_LEAVES_WALL);

        // SAPLING
        blockstatemodelgenerator.registerTintableCrossBlockState(ModBlocks.PINE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemmodelgenerator) {
        // raw food
        itemmodelgenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemmodelgenerator.register(ModItems.CUCUMBER, Models.GENERATED);
        itemmodelgenerator.register(ModItems.SALT_ITEM, Models.GENERATED);

        itemmodelgenerator.register(ModItems.AVOCADO, Models.GENERATED);
        itemmodelgenerator.register(ModItems.CORN, Models.GENERATED);
        itemmodelgenerator.register(ModItems.SEA_PICKLE, Models.GENERATED);
        itemmodelgenerator.register(ModItems.EGGPLANT, Models.GENERATED);

        // prepared food
        itemmodelgenerator.register(ModItems.COOKED_CAULIFLOWER, Models.GENERATED);
        itemmodelgenerator.register(ModItems.CUT_CUCUMBER, Models.GENERATED);
        itemmodelgenerator.register(ModItems.WHEEL_OF_CHEESE, Models.GENERATED);

        // tools
        itemmodelgenerator.register(ModItems.STONE_KNIFE, Models.HANDHELD);
        itemmodelgenerator.register(ModItems.CRAFTING_BOOK, Models.HANDHELD);
        itemmodelgenerator.register(ModItems.FLUID_CHEESE_BUCKET, Models.HANDHELD);

    }
}