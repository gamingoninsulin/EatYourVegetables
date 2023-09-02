package me.gamingoninsulin.core.datagen;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.blocks.custom.crops.CauliflowerCropBlock;
import me.gamingoninsulin.common.blocks.custom.crops.CucumberCropBlock;
import me.gamingoninsulin.common.blocks.custom.crops.EggplantCropBlock;
import me.gamingoninsulin.common.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockstatemodelgenerator) {

        // ######################################################################################################### \\
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.EMPTY_CRATE);

        // kitchen cabinets
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN);

        // kitchen cabinet corners left
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_BOTH_OPEN);

        // kitchen cabinet corners left
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_CLOSED);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_LEFT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_RIGHT_OPEN);
        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_BOTH_OPEN);

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

//        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_PRESS);
//        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_PRESS_WORKING);
//        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_PRESS_DONE);

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

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemmodelgenerator) {
        // raw food
        itemmodelgenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemmodelgenerator.register(ModItems.CUCUMBER, Models.GENERATED);

        itemmodelgenerator.register(ModItems.AVOCADO, Models.GENERATED);
        itemmodelgenerator.register(ModItems.CORN, Models.GENERATED);
        itemmodelgenerator.register(ModItems.SEA_PICKLE, Models.GENERATED);
        itemmodelgenerator.register(ModItems.EGGPLANT, Models.GENERATED);

        // prepared food
        itemmodelgenerator.register(ModItems.COOKED_CAULIFLOWER, Models.GENERATED);
        itemmodelgenerator.register(ModItems.CUT_CUCUMBER, Models.GENERATED);

        // tools
        itemmodelgenerator.register(ModItems.STONE_KNIFE, Models.HANDHELD);

    }
}
/*       //OFF\\

        // block
         blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
         blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.PEAT_BLOCK);

         blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
         blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.END_PINK_GARNET_ORE);
         blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.NETHER_PINK_GARNET_ORE);
         blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);

         blockstatemodelgenerator.registerDoor(ModBlocks.CAULIFLOWER_DOOR);
         blockstatemodelgenerator.registerTrapdoor(ModBlocks.CAULIFLOWER_TRAPDOOR);

        // item
         itemmodelgenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
         itemmodelgenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
         itemmodelgenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
         itemmodelgenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
         itemmodelgenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
         itemmodelgenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
         itemmodelgenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);
         itemmodelgenerator.register(ModItems.PINK_GARNET_PAXEL, Models.HANDHELD);
         itemmodelgenerator.register(ModItems.PEAT_BRICK, Models.GENERATED);
         itemmodelgenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

         itemmodelgenerator.registerArmor((ArmorItem) ModItems.PINK_GARNET_HELMET);
         itemmodelgenerator.registerArmor((ArmorItem) ModItems.PINK_GARNET_CHESTPLATE);
         itemmodelgenerator.registerArmor((ArmorItem) ModItems.PINK_GARNET_LEGGINGS);
         itemmodelgenerator.registerArmor((ArmorItem) ModItems.PINK_GARNET_BOOTS);
*/