package me.gamingoninsulin.core.datagen;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGen extends FabricRecipeProvider {
    public ModRecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // ### shaped recipes ### \\
        // BLOCKS \\
        // Raw Cauliflower Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_BLOCK)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CAULIFLOWER) + "_to_" + "cauliflower_block"));

        // Raw Cauliflower Stairs (LEFT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_STAIRS)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")


                .input('C', ModBlocks.CAULIFLOWER_BLOCK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_STAIRS) + "_left"));

        // Raw Cauliflower Stairs (RIGHT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_STAIRS)
                .pattern("  C")
                .pattern(" CC")
                .pattern("CCC")


                .input('C', ModBlocks.CAULIFLOWER_BLOCK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_STAIRS) + "_right"));

        // Raw Cauliflower Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_SLAB)
                .pattern("CCC")


                .input('C', ModBlocks.CAULIFLOWER_BLOCK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_SLAB)));

        // Raw Cauliflower Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_FENCE, 3)
                .pattern("SCS")
                .pattern("SCS")


                .input('C', ModBlocks.CAULIFLOWER_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_FENCE)));

        // Raw Cauliflower Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_FENCE_GATE, 1)
                .pattern("CSC")
                .pattern("CSC")


                .input('C', ModBlocks.CAULIFLOWER_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_FENCE_GATE)));

        // Raw Cauliflower Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_PRESSURE_PLATE)
                .pattern("CC")


                .input('C', ModBlocks.CAULIFLOWER_BLOCK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_PRESSURE_PLATE)));

        // ######################################################################################################### \\

        // Raw Cucumber Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_BLOCK)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUCUMBER) + "_to_" + "cucumber_block"));

        // Raw Cauliflower Stairs (LEFT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_STAIRS)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_STAIRS) + "_left"));

        // Raw Cauliflower Stairs (RIGHT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_STAIRS)
                .pattern("  C")
                .pattern(" CC")
                .pattern("CCC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_STAIRS) + "_right"));

        // Raw Cauliflower Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_SLAB)
                .pattern("CCC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_SLAB)));

        // Raw Cauliflower Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_FENCE, 3)
                .pattern("SCS")
                .pattern("SCS")


                .input('C', ModBlocks.CUCUMBER_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_FENCE)));

        // Raw Cauliflower Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_FENCE_GATE, 1)
                .pattern("CSC")
                .pattern("CSC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_FENCE_GATE)));

        // Raw Cauliflower Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_PRESSURE_PLATE)
                .pattern("CC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_PRESSURE_PLATE)));

        // ######################################################################################################### \\

        // Crate Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRATEBLOCK)
                .pattern("F F")
                .pattern("SSS")

                .input('S', Blocks.OAK_SLAB)
                .input('F', Blocks.OAK_FENCE)

                .criterion(hasItem(Blocks.OAK_PLANKS), conditionsFromItem(Blocks.OAK_PLANKS))
                .criterion(hasItem(Blocks.OAK_FENCE), conditionsFromItem(Blocks.OAK_FENCE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRATEBLOCK)));

        // Crate Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRATE_BLOCK)
                .pattern("S S")
                .pattern("SSS")

                .input('S', Blocks.OAK_SLAB)

                .criterion(hasItem(Blocks.OAK_SLAB), conditionsFromItem(Blocks.OAK_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRATE_BLOCK)));

        // ######################################################################################################### \\
        // ### TOOLS ### \\
        // pink garnet sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STONE_KNIFE, 4)
                .pattern("C")
                .pattern("S")

                .input('C', Blocks.COBBLESTONE)
                .input('S', Items.STICK)

                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_KNIFE)));


        // ######################################################################################################### \\

        // ### shapeless recipes ### \\
        // stone knife
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUT_CUCUMBER, 2)

                .input(ModItems.STONE_KNIFE)
                .input(ModItems.CUCUMBER)

                .criterion(hasItem(ModItems.STONE_KNIFE), conditionsFromItem(ModItems.STONE_KNIFE))
                .criterion(hasItem(ModItems.CUT_CUCUMBER), conditionsFromItem(ModItems.CUT_CUCUMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUT_CUCUMBER)));

        // cauliflower button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_BUTTON, 1)

                .input(ModBlocks.CAULIFLOWER_BLOCK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_BUTTON)));

        // cauliflower button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_BUTTON, 1)

                .input(ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_BUTTON)));

        // ######################################################################################################### \\
        //  ### SMELTING & BLASTING ###  \\
        //  ### furnace recipes ### \\
        // food
        // cooked cauliflower
        offerSmelting(exporter, List.of(
                        ModItems.CAULIFLOWER
                ),
                RecipeCategory.MISC, ModItems.COOKED_CAULIFLOWER, 0.25f, 200, "vegetables");

        // ### blasting recipes ### \\

        // ######################################################################################################### \\
    }
}
/*      //OFF\\

        // BLOCKS
        // peat block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PEAT_BLOCK)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")

                .input('P', ModItems.PEAT_BRICK)

                .criterion(hasItem(ModBlocks.PEAT_BLOCK), conditionsFromItem(ModBlocks.PEAT_BLOCK))
                .criterion(hasItem(ModItems.PEAT_BRICK), conditionsFromItem(ModItems.PEAT_BRICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PEAT_BRICK) + "_to_" + "peat_block"));

        // pink garnet block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")

                .input('P', ModItems.PINK_GARNET)

                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET) + "_to_" + "pink_garnet_block"));

        // pink garnet stair left
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_STAIRS,4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")

                .input('P', ModBlocks.PINK_GARNET_BLOCK)

                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_STAIRS) + "_" + "left"));

        // pink garnet stair right
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_STAIRS,4)
                .pattern("  P")
                .pattern(" PP")
                .pattern("PPP")

                .input('P', ModBlocks.PINK_GARNET_BLOCK)

                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_STAIRS) + "_" + "right"));

        // pink garnet slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_SLAB,6)
                .pattern("PPP")

                .input('P', ModBlocks.PINK_GARNET_BLOCK)

                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_SLAB)));

        // pink garnet trapdoor
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_TRAPDOOR,2)
                .pattern("PPP")
                .pattern("PPP")

                .input('P', ModBlocks.PINK_GARNET_SLAB)

                .criterion(hasItem(ModBlocks.PINK_GARNET_SLAB), conditionsFromItem(ModBlocks.PINK_GARNET_SLAB))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_TRAPDOOR)));

        // pink garnet door
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_DOOR,3)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")

                .input('P', ModBlocks.PINK_GARNET_BLOCK)

                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_DOOR)));

        // pink garnet fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_FENCE,3)
                .pattern("BPB")
                .pattern("BPB")

                .input('P', ModItems.PINK_GARNET)
                .input('B', ModBlocks.PINK_GARNET_BLOCK)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_FENCE)));

        // pink garnet fence gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_FENCE_GATE)
                .pattern("PBP")
                .pattern("PBP")

                .input('P', ModItems.PINK_GARNET)
                .input('B', ModBlocks.PINK_GARNET_BLOCK)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_FENCE_GATE)));

        // pink garnet wall
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_WALL,6)
                .pattern("PPP")
                .pattern("PPP")

                .input('P', ModBlocks.PINK_GARNET_BLOCK)

                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_WALL)));

        // pink garnet pressure plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_PRESSURE_PLATE)
                .pattern("PP")

                .input('P', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_PRESSURE_PLATE)));

                //
        // pink garnet
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET, 9)

                .input(ModBlocks.PINK_GARNET_BLOCK)

                .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET) + "_from_block"));

        // peat block to peat brick
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PEAT_BRICK, 9)

                .input(ModBlocks.PEAT_BLOCK)

                .criterion(hasItem(ModItems.PEAT_BRICK), conditionsFromItem(ModItems.PEAT_BRICK))
                .criterion(hasItem(ModBlocks.PEAT_BLOCK), conditionsFromItem(ModBlocks.PEAT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PEAT_BLOCK) + "_to_" + "peat_brick"));

        // pink garnet button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BUTTON, 1)

                .input(ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_GARNET_BUTTON)));


        // axes \\
        // pink garnet axe left
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_AXE)
                .pattern("PP")
                .pattern("PS")
                .pattern(" S")

                .input('P', ModItems.PINK_GARNET)
                .input('S', STICK)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(STICK), conditionsFromItem(STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_AXE) + "_left"));

        // pink garnet axe right
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_AXE)
                .pattern("PP")
                .pattern("SP")
                .pattern("S ")

                .input('P', ModItems.PINK_GARNET)
                .input('S', STICK)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(STICK), conditionsFromItem(STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_AXE) + "_right"));


        // pickaxe \\
        // pink garnet pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_PICKAXE)
                .pattern("PPP")
                .pattern(" S ")
                .pattern(" S ")

                .input('P', ModItems.PINK_GARNET)
                .input('S', STICK)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(STICK), conditionsFromItem(STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PICKAXE)));

        // shovel \\
        // pink garnet shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_SHOVEL)
                .pattern("P")
                .pattern("S")
                .pattern("S")

                .input('P', ModItems.PINK_GARNET)
                .input('S', STICK)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(STICK), conditionsFromItem(STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_SHOVEL)));

        // hoe \\
        // pink garnet hoe left
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HOE)
                .pattern("PP")
                .pattern(" S")
                .pattern(" S")

                .input('P', ModItems.PINK_GARNET)
                .input('S', STICK)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(STICK), conditionsFromItem(STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HOE) + "_left"));


        // pink garnet hoe right
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HOE)
                .pattern("PP")
                .pattern("S ")
                .pattern("S ")

                .input('P', ModItems.PINK_GARNET)
                .input('S', STICK)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .criterion(hasItem(STICK), conditionsFromItem(STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HOE) + "_right"));

        // paxels \\
        // pink garnet paxel left
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_PAXEL)
                .pattern("PHS")
                .pattern("@# ")
                .pattern(" # ")

                .input('P', ModItems.PINK_GARNET_PICKAXE)
                .input('S', ModItems.PINK_GARNET_SWORD)
                .input('H', ModItems.PINK_GARNET_HOE)
                .input('@', ModItems.PINK_GARNET_SHOVEL)
                .input('#', STICK)

                .criterion(hasItem(ModItems.PINK_GARNET_SWORD), conditionsFromItem(ModItems.PINK_GARNET_SWORD))
                .criterion(hasItem(ModItems.PINK_GARNET_SHOVEL), conditionsFromItem(ModItems.PINK_GARNET_SHOVEL))
                .criterion(hasItem(ModItems.PINK_GARNET_HOE), conditionsFromItem(ModItems.PINK_GARNET_HOE))
                .criterion(hasItem(ModItems.PINK_GARNET_PICKAXE), conditionsFromItem(ModItems.PINK_GARNET_PICKAXE))
                .criterion(hasItem(STICK), conditionsFromItem(STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PAXEL) + "_" + "left"));

        // pink garnet paxel right
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_PAXEL)
                .pattern("PHS")
                .pattern("@# ")
                .pattern(" # ")

                .input('P', ModItems.PINK_GARNET_PICKAXE)
                .input('S', ModItems.PINK_GARNET_SWORD)
                .input('H', ModItems.PINK_GARNET_HOE)
                .input('@', ModItems.PINK_GARNET_SHOVEL)
                .input('#', STICK)

                .criterion(hasItem(ModItems.PINK_GARNET_SWORD), conditionsFromItem(ModItems.PINK_GARNET_SWORD))
                .criterion(hasItem(ModItems.PINK_GARNET_SHOVEL), conditionsFromItem(ModItems.PINK_GARNET_SHOVEL))
                .criterion(hasItem(ModItems.PINK_GARNET_HOE), conditionsFromItem(ModItems.PINK_GARNET_HOE))
                .criterion(hasItem(ModItems.PINK_GARNET_PICKAXE), conditionsFromItem(ModItems.PINK_GARNET_PICKAXE))
                .criterion(hasItem(STICK), conditionsFromItem(STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_PAXEL) + "_" + "right"));

         ######################################################################################################### \\
         ### ARMOR ### \\
         pink garnet helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_HELMET)
                .pattern("PPP")
                .pattern("P P")

                .input('P', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_HELMET)));

        // pink garnet chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_CHESTPLATE)
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")

                .input('P', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_CHESTPLATE)));

        // pink garnet leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_LEGGINGS)
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")

                .input('P', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_LEGGINGS)));

        // pink garnet boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PINK_GARNET_BOOTS)
                .pattern("P P")
                .pattern("P P")

                .input('P', ModItems.PINK_GARNET)

                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.PINK_GARNET_BOOTS)));

        // ######################################################################################################### \\

       //  ### SMELTING & BLASTING ###  \\
       //  ores \\
       //  ### furnace recipes ### \\
       //  pink garnet
        offerSmelting(exporter, List.of(
                ModItems.RAW_PINK_GARNET,
                ModBlocks.PINK_GARNET_ORE,
                ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                ModBlocks.NETHER_PINK_GARNET_ORE,
                ModBlocks.END_PINK_GARNET_ORE
        ),
                RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");

        // ### blasting recipes ### \\
        // ores
        // pink garnet
        offerBlasting(exporter, List.of(
                ModItems.RAW_PINK_GARNET,
                ModBlocks.PINK_GARNET_ORE,
                ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                ModBlocks.NETHER_PINK_GARNET_ORE,
                ModBlocks.END_PINK_GARNET_ORE
        ), RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");
 */