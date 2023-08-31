package me.gamingoninsulin.core.datagen;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.blocks.custom.CauliflowerCropBlock;
import me.gamingoninsulin.common.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModBlockLoottableGen extends FabricBlockLootTableProvider {

    public ModBlockLoottableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

// ##################################################
        // EMPTY CRATE
        addDrop(ModBlocks.MOD_CRATE_BLOCK);
// ##################################################

        // CAULIFLOWER CROP
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, 6));
        this.addDrop(ModBlocks.CAULIFLOWER_CROP, this.cropDrops(ModBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder2));

        // CAULIFLOWER DECO
        addDrop(ModBlocks.CAULIFLOWER_SLAB, slabDrops(ModBlocks.CAULIFLOWER_SLAB));
        addDrop(ModBlocks.CAULIFLOWER_BUTTON);
        addDrop(ModBlocks.CAULIFLOWER_PRESSURE_PLATE);
        addDrop(ModBlocks.CAULIFLOWER_FENCE);
        addDrop(ModBlocks.CAULIFLOWER_FENCE_GATE);
        addDrop(ModBlocks.CAULIFLOWER_WALL);

        // cauliflower crates
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8);

        // ##################################################

        // CUCUMBER CROP
        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.CUCUMBER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, 5));
        this.addDrop(ModBlocks.CUCUMBER_CROP, this.cropDrops(ModBlocks.CUCUMBER_CROP, ModItems.CUCUMBER, ModItems.CUCUMBER_SEEDS, builder3));

        // CUCUMBER DECO
        addDrop(ModBlocks.CUCUMBER_SLAB, slabDrops(ModBlocks.CUCUMBER_SLAB));
        addDrop(ModBlocks.CUCUMBER_BUTTON);
        addDrop(ModBlocks.CUCUMBER_PRESSURE_PLATE);
        addDrop(ModBlocks.CUCUMBER_FENCE);
        addDrop(ModBlocks.CUCUMBER_FENCE_GATE);
        addDrop(ModBlocks.CUCUMBER_WALL);

        // cucumber crates
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7);
        addDrop(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8);

        // ##################################################

        // EGGPLANT CROP
        BlockStatePropertyLootCondition.Builder builder4 = BlockStatePropertyLootCondition.builder(ModBlocks.EGGPLANT_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, 5));
        this.addDrop(ModBlocks.EGGPLANT_CROP, this.cropDrops(ModBlocks.EGGPLANT_CROP, ModItems.EGGPLANT, ModItems.EGGPLANT_SEEDS, builder4));


        // EGGPLANT  DECO
        addDrop(ModBlocks.EGGPLANT_SLAB, slabDrops(ModBlocks.EGGPLANT_SLAB));
        addDrop(ModBlocks.EGGPLANT_BUTTON);
        addDrop(ModBlocks.EGGPLANT_PRESSURE_PLATE);
        addDrop(ModBlocks.EGGPLANT_FENCE);
        addDrop(ModBlocks.EGGPLANT_FENCE_GATE);
        addDrop(ModBlocks.EGGPLANT_WALL);

        // eggplant crates
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_1);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_2);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_3);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_4);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_5);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_6);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_7);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_8);

        // ##################################################

        // AVOCADO DECO
        addDrop(ModBlocks.AVOCADO_SLAB, slabDrops(ModBlocks.AVOCADO_SLAB));
        addDrop(ModBlocks.AVOCADO_BUTTON);
        addDrop(ModBlocks.AVOCADO_PRESSURE_PLATE);
        addDrop(ModBlocks.AVOCADO_FENCE);
        addDrop(ModBlocks.AVOCADO_FENCE_GATE);
        addDrop(ModBlocks.AVOCADO_WALL);

        // eggplant crates
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8);
        // ##################################################

        // CORN DECO
        addDrop(ModBlocks.CORN_SLAB, slabDrops(ModBlocks.CORN_SLAB));
        addDrop(ModBlocks.CORN_BUTTON);
        addDrop(ModBlocks.CORN_PRESSURE_PLATE);
        addDrop(ModBlocks.CORN_FENCE);
        addDrop(ModBlocks.CORN_FENCE_GATE);
        addDrop(ModBlocks.CORN_WALL);

        // corn crates
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_1);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_2);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_3);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_4);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_5);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_6);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_7);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_8);
        // ##################################################

        // SEA PICKLE DECO
        addDrop(ModBlocks.SEA_PICKLE_SLAB, slabDrops(ModBlocks.SEA_PICKLE_SLAB));
        addDrop(ModBlocks.SEA_PICKLE_BUTTON);
        addDrop(ModBlocks.SEA_PICKLE_PRESSURE_PLATE);
        addDrop(ModBlocks.SEA_PICKLE_FENCE);
        addDrop(ModBlocks.SEA_PICKLE_FENCE_GATE);
        addDrop(ModBlocks.SEA_PICKLE_WALL);

        // sea pickle crates
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7);
//        addDrop(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8);

        // ##################################################
    }
}
/*      //OFF\\

        addDrop(ModBlocks.PEAT_BLOCK, oreDrops(ModBlocks.PEAT_BLOCK, ModItems.PEAT_BRICK));
        addDrop(ModBlocks.PINK_GARNET_ORE, oreDrops(ModBlocks.PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.NETHER_PINK_GARNET_ORE, oreDrops(ModBlocks.NETHER_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.END_PINK_GARNET_ORE, oreDrops(ModBlocks.END_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
        addDrop(ModBlocks.DEEPSLATE_PINK_GARNET_ORE, oreDrops(ModBlocks.DEEPSLATE_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
*/