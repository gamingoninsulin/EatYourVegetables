package me.gamingoninsulin.core;

import net.minecraft.registry.tag.ItemTags;

/*
        Mod Idea's {
        // here will be new mod ideas before I make them in the mod!
        - kitchen table
        - dishwasher
        - refrigerator
        - fridge

        - special type of flooring
        - multi-block structure for kitchen
        - recipe book
        - a crafting book for crafting all base block and items (recipe remainder (fabric api))

        - implement gui for oven, fridge, refrigerator, cabinets
        }

          // add recipes for top part of the kitchen above hood.

        - Added Blocks {
           - kitchen Cabinet center bottom version
           - kitchen Cabinet left corner bottom version
           - kitchen Cabinet right corner bottom version

           - kitchen cabinet center top version
           - kitchen cabinet center left corner top version
           - kitchen cabinet center right corner top version

           - kitchen  Sink empty
           - kitchen Sink water
           - kitchen Oven On
           - kitchen Oven off
        }

        - Added Crop's {
        // added
            - Cauliflower
            - Sea Pickle
            - Cucumber
            - Corn
            - Eggplant
            - avocado
           }
        // future to be implemented {
             - Radish
             - Lettuce
             - Tomatoes
            }

        - Added Trees {
        // none yet
        }
        // future to be implemented {
             - Avocado
             - Coconut
             - Banana
             - Mango
             - Peach
          }

     */
public class Reference {
    public static final String MOD_ID = "eyvb";
    public static final String AUTHOR = "Gaming On Insulin";
    public static final String REGISTER_MOD_NAME = "Eat Your Vegetables Boy";
}
//
//     ################################################################################################
//                                         BLOCK LOOTTABLE TAG PROVIDER
//     ################################################################################################
//
//      addDrop(ModBlocks.PEAT_BLOCK, oreDrops(ModBlocks.PEAT_BLOCK, ModItems.PEAT_BRICK));
//      addDrop(ModBlocks.PINK_GARNET_ORE, oreDrops(ModBlocks.PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
//      addDrop(ModBlocks.NETHER_PINK_GARNET_ORE, oreDrops(ModBlocks.NETHER_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
//      addDrop(ModBlocks.END_PINK_GARNET_ORE, oreDrops(ModBlocks.END_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
//      addDrop(ModBlocks.DEEPSLATE_PINK_GARNET_ORE, oreDrops(ModBlocks.DEEPSLATE_PINK_GARNET_ORE, ModItems.RAW_PINK_GARNET));
//
//     ################################################################################################
//                                         BLOCK TAG PROVIDER
//     ################################################################################################
//
//       // metal detector
//        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS_TAG)
//                .add(ModBlocks.PINK_GARNET_ORE)
//                .forceAddTag(BlockTags.GOLD_ORES)
//                .forceAddTag(BlockTags.COAL_ORES)
//                .forceAddTag(BlockTags.DIAMOND_ORES)
//                .forceAddTag(BlockTags.IRON_ORES)
//                .forceAddTag(BlockTags.LAPIS_ORES)
//                .forceAddTag(BlockTags.COPPER_ORES)
//                .forceAddTag(BlockTags.REDSTONE_ORES)
//                .forceAddTag(BlockTags.EMERALD_ORES
//                );
//
//        // Tag for Tool Material Netherite
//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
//                .add(ModBlocks.NETHER_PINK_GARNET_ORE);
//
//        // Tag for our custom Tool Material (Pink Garnet)
//        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
//                .add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE)
//                .add(ModBlocks.END_PINK_GARNET_ORE);
//
//        getOrCreateTagBuilder(ModTags.Blocks.PAXEL_MINEABLE_TAG)
//                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
//                .forceAddTag(BlockTags.AXE_MINEABLE)
//                .forceAddTag(BlockTags.SHOVEL_MINEABLE);
//        // sword
//        getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT)
//               .add(
//
//               );
//
//         pickaxe
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//                .add(
//
//                );
//
//         axe
//        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
//                .add(
//                );
//
//        // needs tool
//
//        // needs diamond +
//        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
//                .add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE
//                );
//
//        // needs iron +
//        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
//                .add(ModBlocks.PINK_GARNET_ORE,
//                        ModBlocks.PINK_GARNET_BLOCK,
//                        ModBlocks.RAW_PINK_GARNET_BLOCK
//                );
//
//         needs stone +
//      getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//              .add(
//
//              );
//
//     ################################################################################################
//                                         FLUID TAG PROVIDER
//     ################################################################################################
//
//     this.getOrCreateTagBuilder(FluidTags.WATER)
//                    .add(ModFluids.FLOWING_CHEESE_FLUID)
//                    .add(ModFluids.STILL_CHEESE_FLUID);
//
//     ################################################################################################
//                                         ITEM TAG PROVIDER
//     ################################################################################################
//
//    getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
//                .add(ModItems.PINK_GARNET_HELMET, ModItems.PINK_GARNET_CHESTPLATE, ModItems.PINK_GARNET_LEGGINGS, ModItems.PINK_GARNET_BOOTS);
//
//     ################################################################################################
//                                         MODEL PROVIDER
//     ################################################################################################
//
// // block
//  blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);
//  blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.PEAT_BLOCK);
//
//  blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_ORE);
//  blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.END_PINK_GARNET_ORE);
//  blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.NETHER_PINK_GARNET_ORE);
//  blockstatemodelgenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
//
//  blockstatemodelgenerator.registerDoor(ModBlocks.CAULIFLOWER_DOOR);
//  blockstatemodelgenerator.registerTrapdoor(ModBlocks.CAULIFLOWER_TRAPDOOR);
//
// // item
//  itemmodelgenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
//  itemmodelgenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
//  itemmodelgenerator.register(ModItems.PINK_GARNET_SWORD, Models.HANDHELD);
//  itemmodelgenerator.register(ModItems.PINK_GARNET_PICKAXE, Models.HANDHELD);
//  itemmodelgenerator.register(ModItems.PINK_GARNET_SHOVEL, Models.HANDHELD);
//  itemmodelgenerator.register(ModItems.PINK_GARNET_AXE, Models.HANDHELD);
//  itemmodelgenerator.register(ModItems.PINK_GARNET_HOE, Models.HANDHELD);
//  itemmodelgenerator.register(ModItems.PINK_GARNET_PAXEL, Models.HANDHELD);
//  itemmodelgenerator.register(ModItems.PEAT_BRICK, Models.GENERATED);
//  itemmodelgenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
//
//  itemmodelgenerator.registerArmor((ArmorItem) ModItems.PINK_GARNET_HELMET);
//  itemmodelgenerator.registerArmor((ArmorItem) ModItems.PINK_GARNET_CHESTPLATE);
//  itemmodelgenerator.registerArmor((ArmorItem) ModItems.PINK_GARNET_LEGGINGS);
//  itemmodelgenerator.registerArmor((ArmorItem) ModItems.PINK_GARNET_BOOTS);
//
//     ################################################################################################
//                                         RECIPES
//     ################################################################################################
//         // peat block
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PEAT_BLOCK)
//                 .pattern("PPP")
//                 .pattern("PPP")
//                 .pattern("PPP")
//
//                 .input('P', ModItems.PEAT_BRICK)
//
//                 .criterion(hasItem(ModBlocks.PEAT_BLOCK), conditionsFromItem(ModBlocks.PEAT_BLOCK))
//                 .criterion(hasItem(ModItems.PEAT_BRICK), conditionsFromItem(ModItems.PEAT_BRICK))
//                 .offerTo(exporter, new Identifier(getRecipeName(ModItems.PEAT_BRICK) + "_to_" + "peat_block"));
//
//                 // pink garnet block
//                 ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK)
//                 .pattern("PPP")
//                 .pattern("PPP")
//                 .pattern("PPP")
//
//         .input('P', ModItems.PINK_GARNET)
//
//         .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET) + "_to_" + "pink_garnet_block"));
//
//         // pink garnet stair left
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_STAIRS,4)
//         .pattern("P  ")
//         .pattern("PP ")
//         .pattern("PPP")
//
//         .input('P', ModBlocks.PINK_GARNET_BLOCK)
//
//         .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_STAIRS) + "_" + "left"));
//
//         // pink garnet stair right
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_STAIRS,4)
//         .pattern("  P")
//         .pattern(" PP")
//         .pattern("PPP")
//
//         .input('P', ModBlocks.PINK_GARNET_BLOCK)
//
//         .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_STAIRS) + "_" + "right"));
//
//         // pink garnet slab
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_SLAB,6)
//         .pattern("PPP")
//
//         .input('P', ModBlocks.PINK_GARNET_BLOCK)
//
//         .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_SLAB)));
//
//         // pink garnet trapdoor
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_TRAPDOOR,2)
//         .pattern("PPP")
//         .pattern("PPP")
//
//         .input('P', ModBlocks.PINK_GARNET_SLAB)
//
//         .criterion(hasItem(ModBlocks.PINK_GARNET_SLAB), conditionsFromItem(ModBlocks.PINK_GARNET_SLAB))
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_TRAPDOOR)));
//
//         // pink garnet door
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_DOOR,3)
//         .pattern("PP")
//         .pattern("PP")
//         .pattern("PP")
//
//         .input('P', ModBlocks.PINK_GARNET_BLOCK)
//
//         .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_DOOR)));
//
//         // pink garnet fence
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_FENCE,3)
//         .pattern("BPB")
//         .pattern("BPB")
//
//         .input('P', ModItems.PINK_GARNET)
//         .input('B', ModBlocks.PINK_GARNET_BLOCK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_FENCE)));
//
//         // pink garnet fence gate
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_FENCE_GATE)
//         .pattern("PBP")
//         .pattern("PBP")
//
//         .input('P', ModItems.PINK_GARNET)
//         .input('B', ModBlocks.PINK_GARNET_BLOCK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_FENCE_GATE)));
//
//         // pink garnet wall
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_WALL,6)
//         .pattern("PPP")
//         .pattern("PPP")
//
//         .input('P', ModBlocks.PINK_GARNET_BLOCK)
//
//         .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_WALL)));
//
//         // pink garnet pressure plate
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_PRESSURE_PLATE)
//         .pattern("PP")
//
//         .input('P', ModItems.PINK_GARNET)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_PRESSURE_PLATE)));
//
//         //
//         // pink garnet
//         ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET, 9)
//
//         .input(ModBlocks.PINK_GARNET_BLOCK)
//
//         .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
//         .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET) + "_from_block"));
//
//         // peat block to peat brick
//         ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PEAT_BRICK, 9)
//
//         .input(ModBlocks.PEAT_BLOCK)
//
//         .criterion(hasItem(ModItems.PEAT_BRICK), conditionsFromItem(ModItems.PEAT_BRICK))
//         .criterion(hasItem(ModBlocks.PEAT_BLOCK), conditionsFromItem(ModBlocks.PEAT_BLOCK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PEAT_BLOCK) + "_to_" + "peat_brick"));
//
//         // pink garnet button
//         ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BUTTON, 1)
//
//         .input(ModItems.PINK_GARNET)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_BUTTON)));
//
//
//         // axes \\
//         // pink garnet axe left
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_AXE)
//         .pattern("PP")
//         .pattern("PS")
//         .pattern(" S")
//
//         .input('P', ModItems.PINK_GARNET)
//         .input('S', STICK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .criterion(hasItem(STICK), conditionsFromItem(STICK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_AXE) + "_left"));
//
//         // pink garnet axe right
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_AXE)
//         .pattern("PP")
//         .pattern("SP")
//         .pattern("S ")
//
//         .input('P', ModItems.PINK_GARNET)
//         .input('S', STICK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .criterion(hasItem(STICK), conditionsFromItem(STICK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_AXE) + "_right"));
//
//
//         // pickaxe \\
//         // pink garnet pickaxe
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_PICKAXE)
//         .pattern("PPP")
//         .pattern(" S ")
//         .pattern(" S ")
//
//         .input('P', ModItems.PINK_GARNET)
//         .input('S', STICK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .criterion(hasItem(STICK), conditionsFromItem(STICK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PICKAXE)));
//
//         // shovel \\
//         // pink garnet shovel
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_SHOVEL)
//         .pattern("P")
//         .pattern("S")
//         .pattern("S")
//
//         .input('P', ModItems.PINK_GARNET)
//         .input('S', STICK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .criterion(hasItem(STICK), conditionsFromItem(STICK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_SHOVEL)));
//
//         // hoe \\
//         // pink garnet hoe left
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HOE)
//         .pattern("PP")
//         .pattern(" S")
//         .pattern(" S")
//
//         .input('P', ModItems.PINK_GARNET)
//         .input('S', STICK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .criterion(hasItem(STICK), conditionsFromItem(STICK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HOE) + "_left"));
//
//
//         // pink garnet hoe right
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HOE)
//         .pattern("PP")
//         .pattern("S ")
//         .pattern("S ")
//
//         .input('P', ModItems.PINK_GARNET)
//         .input('S', STICK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .criterion(hasItem(STICK), conditionsFromItem(STICK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HOE) + "_right"));
//
//         // paxels \\
//         // pink garnet paxel left
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_PAXEL)
//         .pattern("PHS")
//         .pattern("@# ")
//         .pattern(" # ")
//
//         .input('P', ModItems.PINK_GARNET_PICKAXE)
//         .input('S', ModItems.PINK_GARNET_SWORD)
//         .input('H', ModItems.PINK_GARNET_HOE)
//         .input('@', ModItems.PINK_GARNET_SHOVEL)
//         .input('#', STICK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET_SWORD), conditionsFromItem(ModItems.PINK_GARNET_SWORD))
//         .criterion(hasItem(ModItems.PINK_GARNET_SHOVEL), conditionsFromItem(ModItems.PINK_GARNET_SHOVEL))
//         .criterion(hasItem(ModItems.PINK_GARNET_HOE), conditionsFromItem(ModItems.PINK_GARNET_HOE))
//         .criterion(hasItem(ModItems.PINK_GARNET_PICKAXE), conditionsFromItem(ModItems.PINK_GARNET_PICKAXE))
//         .criterion(hasItem(STICK), conditionsFromItem(STICK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PAXEL) + "_" + "left"));
//
//         // pink garnet paxel right
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_PAXEL)
//         .pattern("PHS")
//         .pattern("@# ")
//         .pattern(" # ")
//
//         .input('P', ModItems.PINK_GARNET_PICKAXE)
//         .input('S', ModItems.PINK_GARNET_SWORD)
//         .input('H', ModItems.PINK_GARNET_HOE)
//         .input('@', ModItems.PINK_GARNET_SHOVEL)
//         .input('#', STICK)
//
//         .criterion(hasItem(ModItems.PINK_GARNET_SWORD), conditionsFromItem(ModItems.PINK_GARNET_SWORD))
//         .criterion(hasItem(ModItems.PINK_GARNET_SHOVEL), conditionsFromItem(ModItems.PINK_GARNET_SHOVEL))
//         .criterion(hasItem(ModItems.PINK_GARNET_HOE), conditionsFromItem(ModItems.PINK_GARNET_HOE))
//         .criterion(hasItem(ModItems.PINK_GARNET_PICKAXE), conditionsFromItem(ModItems.PINK_GARNET_PICKAXE))
//         .criterion(hasItem(STICK), conditionsFromItem(STICK))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PAXEL) + "_" + "right"));
//
//         ######################################################################################################### \\
//         ### ARMOR ### \\
//         pink garnet helmet
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HELMET)
//         .pattern("PPP")
//         .pattern("P P")
//
//         .input('P', ModItems.PINK_GARNET)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HELMET)));
//
//         // pink garnet chestplate
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_CHESTPLATE)
//         .pattern("P P")
//         .pattern("PPP")
//         .pattern("PPP")
//
//         .input('P', ModItems.PINK_GARNET)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_CHESTPLATE)));
//
//         // pink garnet leggings
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_LEGGINGS)
//         .pattern("PPP")
//         .pattern("P P")
//         .pattern("P P")
//
//         .input('P', ModItems.PINK_GARNET)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_LEGGINGS)));
//
//         // pink garnet boots
//         ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_BOOTS)
//         .pattern("P P")
//         .pattern("P P")
//
//         .input('P', ModItems.PINK_GARNET)
//
//         .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
//         .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_BOOTS)));
//
//         // ######################################################################################################### \\
//
//         //  ### SMELTING & BLASTING ###  \\
//         //  ores \\
//         //  ### furnace recipes ### \\
//         //  pink garnet
//         offerSmelting(exporter, List.of(
//         ModItems.RAW_PINK_GARNET,
//         ModBlocks.PINK_GARNET_ORE,
//         ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
//         ModBlocks.NETHER_PINK_GARNET_ORE,
//         ModBlocks.END_PINK_GARNET_ORE
//         ),
//         RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
//
//         // ### blasting recipes ### \\
//         // ores
//         // pink garnet
//         offerBlasting(exporter, List.of(
//         ModItems.RAW_PINK_GARNET,
//         ModBlocks.PINK_GARNET_ORE,
//         ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
//         ModBlocks.NETHER_PINK_GARNET_ORE,
//         ModBlocks.END_PINK_GARNET_ORE
//         ), RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");
