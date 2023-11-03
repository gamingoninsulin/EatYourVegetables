package me.gamingoninsulin.eatyourvegtablesboymod.datagen;

import me.gamingoninsulin.eatyourvegtablesboymod.blocks.ModBlocks;
import me.gamingoninsulin.eatyourvegtablesboymod.blocks.custom.crops.CauliflowerCropBlock;
import me.gamingoninsulin.eatyourvegtablesboymod.blocks.custom.crops.CucumberCropBlock;
import me.gamingoninsulin.eatyourvegtablesboymod.blocks.custom.crops.EggplantCropBlock;
import me.gamingoninsulin.eatyourvegtablesboymod.blocks.custom.crops.tall.RiceCropBlock;
import me.gamingoninsulin.eatyourvegtablesboymod.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamilies;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        // ######################################################################################################### \\

        // BOTTOM
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_D_BOTH_OPEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_D_BOTH_OPEN);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_NO_DRAWERS_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_CENTER_NO_DRAWERS_D_BOTH_OPEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_BOTH_OPEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_BOTH_OPEN);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_OVEN_OFF);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_OVEN_ON);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_WATER_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_EXTRACTOR_HOOD);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_FORM_PRESS);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_FORM_PRESS_WORKING);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CHEESE_FORM_PRESS_DONE);

        // ######################################################################################################### \\

        // TOP
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_BOTH_OPEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_BOTH_OPEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_CLOSED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_BOTH_OPEN);

        // ######################################################################################################### \\

        //  CAULIFLOWER BLOCK
        BlockStateModelGenerator.BlockTexturePool CauliflowerTexture = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CAULIFLOWER_BLOCK);

        // CROP
        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        CauliflowerTexture.stairs(ModBlocks.CAULIFLOWER_STAIRS);
        CauliflowerTexture.slab(ModBlocks.CAULIFLOWER_SLAB);
        CauliflowerTexture.button(ModBlocks.CAULIFLOWER_BUTTON);
        CauliflowerTexture.pressurePlate(ModBlocks.CAULIFLOWER_PRESSURE_PLATE);
        CauliflowerTexture.fence(ModBlocks.CAULIFLOWER_FENCE);
        CauliflowerTexture.fenceGate(ModBlocks.CAULIFLOWER_FENCE_GATE);
        CauliflowerTexture.wall(ModBlocks.CAULIFLOWER_WALL);

        // ######################################################################################################### \\

        // CUCUMBER BLOCK
        BlockStateModelGenerator.BlockTexturePool CucumberTexture = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUCUMBER_BLOCK);

        // CROP
        blockStateModelGenerator.registerCrop(ModBlocks.CUCUMBER_CROP, CucumberCropBlock.AGE, 0, 1, 2, 3, 4, 5);

        CucumberTexture.stairs(ModBlocks.CUCUMBER_STAIRS);
        CucumberTexture.slab(ModBlocks.CUCUMBER_SLAB);
        CucumberTexture.button(ModBlocks.CUCUMBER_BUTTON);
        CucumberTexture.pressurePlate(ModBlocks.CUCUMBER_PRESSURE_PLATE);
        CucumberTexture.fence(ModBlocks.CUCUMBER_FENCE);
        CucumberTexture.fenceGate(ModBlocks.CUCUMBER_FENCE_GATE);
        CucumberTexture.wall(ModBlocks.CUCUMBER_WALL);

        // ######################################################################################################### \\

        //  AVOCADO BLOCK
        BlockStateModelGenerator.BlockTexturePool AvocadoTexture = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AVOCADO_BLOCK);

        // CROP
//        blockStateModelGenerator.registerCrop(ModBlocks.AVOCADO_CROP, AvocadoCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        AvocadoTexture.stairs(ModBlocks.AVOCADO_STAIRS);
        AvocadoTexture.slab(ModBlocks.AVOCADO_SLAB);
        AvocadoTexture.button(ModBlocks.AVOCADO_BUTTON);
        AvocadoTexture.pressurePlate(ModBlocks.AVOCADO_PRESSURE_PLATE);
        AvocadoTexture.fence(ModBlocks.AVOCADO_FENCE);
        AvocadoTexture.fenceGate(ModBlocks.AVOCADO_FENCE_GATE);
        AvocadoTexture.wall(ModBlocks.AVOCADO_WALL);

        // ######################################################################################################### \\

        //  EGGPLANT BLOCK
        BlockStateModelGenerator.BlockTexturePool EggplantTexture = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EGGPLANT_BLOCK);

        // CROP
        blockStateModelGenerator.registerCrop(ModBlocks.EGGPLANT_CROP, EggplantCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        EggplantTexture.stairs(ModBlocks.EGGPLANT_STAIRS);
        EggplantTexture.slab(ModBlocks.EGGPLANT_SLAB);
        EggplantTexture.button(ModBlocks.EGGPLANT_BUTTON);
        EggplantTexture.pressurePlate(ModBlocks.EGGPLANT_PRESSURE_PLATE);
        EggplantTexture.fence(ModBlocks.EGGPLANT_FENCE);
        EggplantTexture.fenceGate(ModBlocks.EGGPLANT_FENCE_GATE);
        EggplantTexture.wall(ModBlocks.EGGPLANT_WALL);

        // ######################################################################################################### \\

        //  CORN BLOCK
        BlockStateModelGenerator.BlockTexturePool CornTexture = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORN_BLOCK);

        // CROP
        // blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        CornTexture.stairs(ModBlocks.CORN_STAIRS);
        CornTexture.slab(ModBlocks.CORN_SLAB);
        CornTexture.button(ModBlocks.CORN_BUTTON);
        CornTexture.pressurePlate(ModBlocks.CORN_PRESSURE_PLATE);
        CornTexture.fence(ModBlocks.CORN_FENCE);
        CornTexture.fenceGate(ModBlocks.CORN_FENCE_GATE);
        CornTexture.wall(ModBlocks.CORN_WALL);

        // ######################################################################################################### \\

        //  SEA PICKLE BLOCK
        BlockStateModelGenerator.BlockTexturePool SeaPickleTexture = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SEA_PICKLE_BLOCK);

        // CROP
//        blockStateModelGenerator.registerCrop(ModBlocks.SEA_PICKLE_CROP, SeaPickleCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);

        SeaPickleTexture.stairs(ModBlocks.SEA_PICKLE_STAIRS);
        SeaPickleTexture.slab(ModBlocks.SEA_PICKLE_SLAB);
        SeaPickleTexture.button(ModBlocks.SEA_PICKLE_BUTTON);
        SeaPickleTexture.pressurePlate(ModBlocks.SEA_PICKLE_PRESSURE_PLATE);
        SeaPickleTexture.fence(ModBlocks.SEA_PICKLE_FENCE);
        SeaPickleTexture.fenceGate(ModBlocks.SEA_PICKLE_FENCE_GATE);
        SeaPickleTexture.wall(ModBlocks.SEA_PICKLE_WALL);

        // TREES
        // PINE
        blockStateModelGenerator.registerLog(ModBlocks.PINE_LOG).log(ModBlocks.PINE_LOG).wood(ModBlocks.PINE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PINE_LOG).log(ModBlocks.STRIPPED_PINE_LOG).wood(ModBlocks.STRIPPED_PINE_WOOD);

        // blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINE_PLANK_BLOCK);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINE_LEAVES_BLOCK);

        BlockStateModelGenerator.BlockTexturePool PinePlanksTexture = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINE_PLANKS_BLOCK);
        PinePlanksTexture.family(BlockFamilies.register(ModBlocks.PINE_PLANKS_BLOCK).sign(ModBlocks.PINEWOOD_SIGN, ModBlocks.PINEWOOD_WALL_SIGN).build());
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_PINE_LOG, ModBlocks.PINEWOOD_HANGING_SIGN, ModBlocks.PINEWOOD_HANGING_WALL_SIGN);

        PinePlanksTexture.stairs(ModBlocks.PINE_PLANKS_STAIRS);
        PinePlanksTexture.slab(ModBlocks.PINE_PLANKS_SLAB);
        PinePlanksTexture.button(ModBlocks.PINE_PLANKS_BUTTON);
        PinePlanksTexture.pressurePlate(ModBlocks.PINE_PLANKS_PRESSURE_PLATE);
        PinePlanksTexture.fence(ModBlocks.PINE_PLANKS_FENCE);
        PinePlanksTexture.fenceGate(ModBlocks.PINE_PLANKS_FENCE_GATE);
        PinePlanksTexture.wall(ModBlocks.PINE_PLANKS_WALL);


        BlockStateModelGenerator.BlockTexturePool PineLeavesTexture = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINE_LEAVES_BLOCK);


        PineLeavesTexture.wall(ModBlocks.PINE_LEAVES_WALL);

        // SAPLING
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PINE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        // ######################################################################################################### \\

        // RICE BLOCK
        // CROP
        blockStateModelGenerator.registerCrop(ModBlocks.RICE_CROP, RiceCropBlock.AGE, 0, 1, 2, 3, 4, 5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemmodelgenerator) {
        // misc
        itemmodelgenerator.register(ModItems.RICE_PANICLE, Models.GENERATED);

        // raw food
        itemmodelgenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemmodelgenerator.register(ModItems.RICE, Models.GENERATED);
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