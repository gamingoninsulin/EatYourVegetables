package me.gamingoninsulin.core.datagen;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.blocks.custom.CauliflowerCropBlock;
import me.gamingoninsulin.common.blocks.custom.CucumberCropBlock;
import me.gamingoninsulin.common.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockstatemodelgenerator) {
        BlockStateModelGenerator.BlockTexturePool CauliflowerTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.CAULIFLOWER_BLOCK);
        BlockStateModelGenerator.BlockTexturePool CucumberTexture = blockstatemodelgenerator.registerCubeAllModelTexturePool(ModBlocks.CUCUMBER_BLOCK);

        CauliflowerTexture.stairs(ModBlocks.CAULIFLOWER_STAIRS);
        CauliflowerTexture.slab(ModBlocks.CAULIFLOWER_SLAB);
        CauliflowerTexture.button(ModBlocks.CAULIFLOWER_BUTTON);
        CauliflowerTexture.pressurePlate(ModBlocks.CAULIFLOWER_PRESSURE_PLATE);
        CauliflowerTexture.fence(ModBlocks.CAULIFLOWER_FENCE);
        CauliflowerTexture.fenceGate(ModBlocks.CAULIFLOWER_FENCE_GATE);
        CauliflowerTexture.wall(ModBlocks.CAULIFLOWER_WALL);

        CucumberTexture.stairs(ModBlocks.CUCUMBER_STAIRS);
        CucumberTexture.slab(ModBlocks.CUCUMBER_SLAB);
        CucumberTexture.button(ModBlocks.CUCUMBER_BUTTON);
        CucumberTexture.pressurePlate(ModBlocks.CUCUMBER_PRESSURE_PLATE);
        CucumberTexture.fence(ModBlocks.CUCUMBER_FENCE);
        CucumberTexture.fenceGate(ModBlocks.CUCUMBER_FENCE_GATE);
        CucumberTexture.wall(ModBlocks.CUCUMBER_WALL);

        blockstatemodelgenerator.registerNorthDefaultHorizontalRotation(ModBlocks.CRATEBLOCK);
        blockstatemodelgenerator.registerCrop(ModBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
        blockstatemodelgenerator.registerCrop(ModBlocks.CUCUMBERS_CROP, CucumberCropBlock.AGE, 0, 1, 2, 3, 4, 5);

  }

    @Override
    public void generateItemModels(ItemModelGenerator itemmodelgenerator) {
        // raw food
        itemmodelgenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemmodelgenerator.register(ModItems.CUCUMBER, Models.GENERATED);

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