package me.gamingoninsulin.eatyourvegtablesboymod.datagen;

import me.gamingoninsulin.eatyourvegtablesboymod.blocks.ModBlocks;
import me.gamingoninsulin.eatyourvegtablesboymod.datagen.recipe.CheeseFormStationRecipeGen;
import me.gamingoninsulin.eatyourvegtablesboymod.items.ModItems;
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


    /*
        #########################################################################################################
                                                CHEESE FORMING RECIPES
        #########################################################################################################
    */
    /*
        #########################################################################################################
                                                SALTED CHEESE
        #########################################################################################################
    */
        new CheeseFormStationRecipeGen(
                ModItems.SALT_ITEM,         // ingredient
                ModItems.WHEEL_OF_CHEESE,   // result
                1)                          // amount

                .criterion(hasItem(ModItems.SALT_ITEM), conditionsFromItem(ModItems.SALT_ITEM))
                .offerTo(exporter);


        /*
        #########################################################################################################
                                                COOKED CAULIFLOWER
        #########################################################################################################
    */
//        new KitchenOvenStationRecipeGen(
//                ModItems.CAULIFLOWER,           // ingredient
//                ModItems.COOKED_CAULIFLOWER,    // result
//                1)                              // amount
//
//                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER))
//                .offerTo(exporter);


        /*
        #########################################################################################################
                                                SHAPED RECIPES
                                                CRAFTING BOOK
        #########################################################################################################
    */
        // Crafting Book
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CRAFTING_BOOK)
                .pattern("BBB")

                .input('B', Items.BOOK)

                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CRAFTING_BOOK)));
    /*
        #########################################################################################################
                                                CRAFTING KNIFE
        #########################################################################################################
    */
        // Stone Crafting Knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STONE_KNIFE)
                .pattern(" B ")
                .pattern("S  ")

                .input('B', Items.STONE)
                .input('S', Items.STICK)

                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_KNIFE)));

    /*
        #########################################################################################################
                                                KITCHEN
        #########################################################################################################
    */
        // Bottom
        // Cabinet Closed
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED)
                .pattern("DDD")
                .pattern("D#D")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DARK_OAK_PLANKS)
                .input('#', Items.BUCKET)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED)));

        // Cabinet Open
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN)
                .pattern("DDD")
                .pattern(" # ")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DARK_OAK_PLANKS)
                .input('#', Items.BUCKET)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN)));

        // sink
        // Kitchen Sink Closed
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_SINK_WATER_D_CLOSED)
                .pattern("DDD")
                .pattern("D#D")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DARK_OAK_PLANKS)
                .input('#', Items.WATER_BUCKET)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_SINK_WATER_D_CLOSED)));

        // Kitchen Sink Open
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN)
                .pattern("DDD")
                .pattern(" # ")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DARK_OAK_PLANKS)
                .input('#', Items.WATER_BUCKET)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN)));

        // Kitchen Oven Off
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_OVEN_OFF)
                .pattern("DDD")
                .pattern("D#D")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DEEPSLATE)
                .input('#', Blocks.COAL_BLOCK)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_OVEN_OFF)));

        // Kitchen Extractor Hood
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_EXTRACTOR_HOOD)
                .pattern(" B ")
                .pattern(" C ")
                .pattern("IBI")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('C', Blocks.CAMPFIRE)
                .input('I', Blocks.IRON_BLOCK)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_EXTRACTOR_HOOD)));

    /*
        #########################################################################################################
                                                CAULIFLOWER
        #########################################################################################################
    */

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

    /*
        #########################################################################################################
                                                CUCUMBER
        #########################################################################################################
    */

        // Raw Cucumber Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_BLOCK)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUCUMBER) + "_to_" + "cucumber_block"));

        // Raw cucumber Stairs (LEFT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_STAIRS)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_STAIRS) + "_left"));

        // Raw Cucumber Stairs (RIGHT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_STAIRS)
                .pattern("  C")
                .pattern(" CC")
                .pattern("CCC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_STAIRS) + "_right"));

        // Raw Cucumber Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_SLAB)
                .pattern("CCC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_SLAB)));

        // Raw Cucumber Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_FENCE, 3)
                .pattern("SCS")
                .pattern("SCS")


                .input('C', ModBlocks.CUCUMBER_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_FENCE)));

        // Raw Cucumber Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_FENCE_GATE, 1)
                .pattern("CSC")
                .pattern("CSC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_FENCE_GATE)));

        // Raw Cucumber Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_PRESSURE_PLATE)
                .pattern("CC")


                .input('C', ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_PRESSURE_PLATE)));

    /*
        #########################################################################################################
                                                AVOCADO
        #########################################################################################################
    */

        // Raw avocado Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_BLOCK)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AVOCADO) + "_to_" + "avocado_block"));

        // Raw AVOCADO Stairs (LEFT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_STAIRS)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")


                .input('C', ModBlocks.AVOCADO_BLOCK)

                .criterion(hasItem(ModBlocks.AVOCADO_BLOCK), conditionsFromItem(ModBlocks.AVOCADO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVOCADO_STAIRS) + "_left"));

        // Raw avocado Stairs (RIGHT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_STAIRS)
                .pattern("  C")
                .pattern(" CC")
                .pattern("CCC")


                .input('C', ModBlocks.AVOCADO_BLOCK)

                .criterion(hasItem(ModBlocks.AVOCADO_BLOCK), conditionsFromItem(ModBlocks.AVOCADO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVOCADO_STAIRS) + "_right"));

        // Raw avocado Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_SLAB)
                .pattern("CCC")


                .input('C', ModBlocks.AVOCADO_BLOCK)

                .criterion(hasItem(ModBlocks.AVOCADO_BLOCK), conditionsFromItem(ModBlocks.AVOCADO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVOCADO_SLAB)));

        // Raw avocado Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_FENCE, 3)
                .pattern("SCS")
                .pattern("SCS")


                .input('C', ModBlocks.AVOCADO_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.AVOCADO_BLOCK), conditionsFromItem(ModBlocks.AVOCADO_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVOCADO_FENCE)));

        // Raw avocado Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_FENCE_GATE, 1)
                .pattern("CSC")
                .pattern("CSC")


                .input('C', ModBlocks.AVOCADO_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.AVOCADO_BLOCK), conditionsFromItem(ModBlocks.AVOCADO_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVOCADO_FENCE_GATE)));

        // Raw avocado Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_PRESSURE_PLATE)
                .pattern("CC")


                .input('C', ModBlocks.AVOCADO_BLOCK)

                .criterion(hasItem(ModBlocks.AVOCADO_BLOCK), conditionsFromItem(ModBlocks.AVOCADO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVOCADO_PRESSURE_PLATE)));

    /*
        #########################################################################################################
                                                EGGPLANT
        #########################################################################################################
    */
        // Raw eggplant Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_BLOCK)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")

                .input('C', ModItems.EGGPLANT)

                .criterion(hasItem(ModItems.EGGPLANT), conditionsFromItem(ModItems.EGGPLANT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.EGGPLANT) + "_to_" + "eggplant_block"));

        // Raw eggplant Stairs (LEFT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_STAIRS)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")


                .input('C', ModBlocks.EGGPLANT_BLOCK)

                .criterion(hasItem(ModBlocks.EGGPLANT_BLOCK), conditionsFromItem(ModBlocks.EGGPLANT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EGGPLANT_STAIRS) + "_left"));

        // Raw eggplant Stairs (RIGHT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_STAIRS)
                .pattern("  C")
                .pattern(" CC")
                .pattern("CCC")


                .input('C', ModBlocks.EGGPLANT_BLOCK)

                .criterion(hasItem(ModBlocks.EGGPLANT_BLOCK), conditionsFromItem(ModBlocks.EGGPLANT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EGGPLANT_STAIRS) + "_right"));

        // Raw eggplant Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_SLAB)
                .pattern("CCC")


                .input('C', ModBlocks.EGGPLANT_BLOCK)

                .criterion(hasItem(ModBlocks.EGGPLANT_BLOCK), conditionsFromItem(ModBlocks.EGGPLANT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EGGPLANT_SLAB)));

        // Raw eggplant Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_FENCE, 3)
                .pattern("SCS")
                .pattern("SCS")


                .input('C', ModBlocks.EGGPLANT_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.EGGPLANT_BLOCK), conditionsFromItem(ModBlocks.EGGPLANT_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EGGPLANT_FENCE)));

        // Raw eggplant Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_FENCE_GATE, 1)
                .pattern("CSC")
                .pattern("CSC")


                .input('C', ModBlocks.EGGPLANT_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.EGGPLANT_BLOCK), conditionsFromItem(ModBlocks.EGGPLANT_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EGGPLANT_FENCE_GATE)));

        // Raw eggplant Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_PRESSURE_PLATE)
                .pattern("CC")


                .input('C', ModBlocks.EGGPLANT_BLOCK)

                .criterion(hasItem(ModBlocks.EGGPLANT_BLOCK), conditionsFromItem(ModBlocks.EGGPLANT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EGGPLANT_PRESSURE_PLATE)));

    /*
        #########################################################################################################
                                                CORN
        #########################################################################################################
    */
        // Raw corn Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_BLOCK)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")

                .input('C', ModItems.CORN)

                .criterion(hasItem(ModItems.CORN), conditionsFromItem(ModItems.CORN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CORN) + "_to_" + "corn_block"));

        // Raw corn Stairs (LEFT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_STAIRS)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")


                .input('C', ModBlocks.CORN_BLOCK)

                .criterion(hasItem(ModBlocks.CORN_BLOCK), conditionsFromItem(ModBlocks.CORN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORN_STAIRS) + "_left"));

        // Raw corn Stairs (RIGHT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_STAIRS)
                .pattern("  C")
                .pattern(" CC")
                .pattern("CCC")


                .input('C', ModBlocks.CORN_BLOCK)

                .criterion(hasItem(ModBlocks.CORN_BLOCK), conditionsFromItem(ModBlocks.CORN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORN_STAIRS) + "_right"));

        // Raw corn Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_SLAB)
                .pattern("CCC")


                .input('C', ModBlocks.CORN_BLOCK)

                .criterion(hasItem(ModBlocks.CORN_BLOCK), conditionsFromItem(ModBlocks.CORN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORN_SLAB)));

        // Raw corn Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_FENCE, 3)
                .pattern("SCS")
                .pattern("SCS")


                .input('C', ModBlocks.CORN_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.CORN_BLOCK), conditionsFromItem(ModBlocks.CORN_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORN_FENCE)));

        // Raw corn Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_FENCE_GATE, 1)
                .pattern("CSC")
                .pattern("CSC")


                .input('C', ModBlocks.CORN_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.CORN_BLOCK), conditionsFromItem(ModBlocks.CORN_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORN_FENCE_GATE)));

        // Raw corn Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_PRESSURE_PLATE)
                .pattern("CC")


                .input('C', ModBlocks.CORN_BLOCK)

                .criterion(hasItem(ModBlocks.CORN_BLOCK), conditionsFromItem(ModBlocks.CORN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORN_PRESSURE_PLATE)));


    /*
        #########################################################################################################
                                                SEA PICKLE
        #########################################################################################################
    */

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_BLOCK)
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")

                .input('C', ModItems.SEA_PICKLE)

                .criterion(hasItem(ModItems.SEA_PICKLE), conditionsFromItem(ModItems.SEA_PICKLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SEA_PICKLE) + "_to_" + "sea_pickle_block"));

        // Raw sea_pickle Stairs (LEFT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_STAIRS)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")


                .input('C', ModBlocks.SEA_PICKLE_BLOCK)

                .criterion(hasItem(ModBlocks.SEA_PICKLE_BLOCK), conditionsFromItem(ModBlocks.SEA_PICKLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_PICKLE_STAIRS) + "_left"));

        // Raw sea_pickle Stairs (RIGHT)
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_STAIRS)
                .pattern("  C")
                .pattern(" CC")
                .pattern("CCC")


                .input('C', ModBlocks.SEA_PICKLE_BLOCK)

                .criterion(hasItem(ModBlocks.SEA_PICKLE_BLOCK), conditionsFromItem(ModBlocks.SEA_PICKLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_PICKLE_STAIRS) + "_right"));

        // Raw sea_pickle Slab
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_SLAB)
                .pattern("CCC")


                .input('C', ModBlocks.SEA_PICKLE_BLOCK)

                .criterion(hasItem(ModBlocks.SEA_PICKLE_BLOCK), conditionsFromItem(ModBlocks.SEA_PICKLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_PICKLE_SLAB)));

        // Raw sea_pickle Fence
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_FENCE, 3)
                .pattern("SCS")
                .pattern("SCS")


                .input('C', ModBlocks.SEA_PICKLE_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.SEA_PICKLE_BLOCK), conditionsFromItem(ModBlocks.SEA_PICKLE_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_PICKLE_FENCE)));

        // Raw sea_pickle Fence Gate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_FENCE_GATE, 1)
                .pattern("CSC")
                .pattern("CSC")


                .input('C', ModBlocks.SEA_PICKLE_BLOCK)
                .input('S', Items.STICK)

                .criterion(hasItem(ModBlocks.SEA_PICKLE_BLOCK), conditionsFromItem(ModBlocks.SEA_PICKLE_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_PICKLE_FENCE_GATE)));

        // Raw sea_pickle Pressure Plate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_PRESSURE_PLATE)
                .pattern("CC")


                .input('C', ModBlocks.SEA_PICKLE_BLOCK)

                .criterion(hasItem(ModBlocks.SEA_PICKLE_BLOCK), conditionsFromItem(ModBlocks.SEA_PICKLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_PICKLE_PRESSURE_PLATE)));

        // sea_pickle button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_BUTTON, 1)

                .input(ModBlocks.SEA_PICKLE_BLOCK)

                .criterion(hasItem(ModBlocks.SEA_PICKLE_BLOCK), conditionsFromItem(ModBlocks.SEA_PICKLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_PICKLE_BUTTON)));

        /*
            #########################################################################################################
                                               SHAPELESS RECIPES
                                                   CAULIFLOWER
            #########################################################################################################
         */

        // cauliflower button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_BUTTON, 1)

                .input(ModBlocks.CAULIFLOWER_BLOCK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_BUTTON)));

          /*
            #########################################################################################################
                                                      CUCUMBER SHAPELESS
            #########################################################################################################
         */

        // stone knife and cucumber to make cut cucumber
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUT_CUCUMBER, 2)

                .input(ModItems.STONE_KNIFE)
                .input(ModItems.CUCUMBER)

                .criterion(hasItem(ModItems.STONE_KNIFE), conditionsFromItem(ModItems.STONE_KNIFE))
                .criterion(hasItem(ModItems.CUT_CUCUMBER), conditionsFromItem(ModItems.CUT_CUCUMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUT_CUCUMBER)));

        // stone knife and rice panicle to make rice
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RICE, 2)

                .input(ModItems.STONE_KNIFE)
                .input(ModItems.RICE_PANICLE)

                .criterion(hasItem(ModItems.RICE_PANICLE), conditionsFromItem(ModItems.RICE_PANICLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RICE)));

        // cucumber button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_BUTTON, 1)

                .input(ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_BUTTON)));

        /*
            #########################################################################################################
                                                      AVOCADO SHAPLESS
            #########################################################################################################
         */

        // avocado button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_BUTTON, 1)

                .input(ModBlocks.AVOCADO_BLOCK)

                .criterion(hasItem(ModBlocks.AVOCADO_BLOCK), conditionsFromItem(ModBlocks.AVOCADO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVOCADO_BUTTON)));

        /*
            #########################################################################################################
                                                      EGGPLANT SHAPELESS
            ########################################################################################################
         */

        // eggplant button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_BUTTON, 1)

                .input(ModBlocks.EGGPLANT_BLOCK)

                .criterion(hasItem(ModBlocks.EGGPLANT_BLOCK), conditionsFromItem(ModBlocks.EGGPLANT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EGGPLANT_BUTTON)));

        /*
            #########################################################################################################
                                                      CORN SHAPELESS
            #########################################################################################################
         */

        // corn button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_BUTTON, 1)

                .input(ModBlocks.CORN_BLOCK)

                .criterion(hasItem(ModBlocks.CORN_BLOCK), conditionsFromItem(ModBlocks.CORN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORN_BUTTON)));

    /*
        #########################################################################################################
                                                FURNACE RECIPES
        #########################################################################################################

        #########################################################################################################
                                                CAULIFLOWER
        #########################################################################################################
    */
        // cooked cauliflower
        offerSmelting(exporter, List.of(
                        ModItems.CAULIFLOWER
                ),
                RecipeCategory.MISC, ModItems.COOKED_CAULIFLOWER, 0.25f, 200, "vegetables");


    /*
        #########################################################################################################
                                                BLASTED RECIPES
        #########################################################################################################








        #########################################################################################################
                                                TURNED OFF
        #########################################################################################################

         // pink garnet ore to item for blasting
             offerBlasting(exporter, List.of(
                ModItems.RAW_PINK_GARNET,
                ModBlocks.PINK_GARNET_ORE,
                ModBlocks.DEEPSLATE_PINK_GARNET_ORE,
                ModBlocks.NETHER_PINK_GARNET_ORE,
                ModBlocks.END_PINK_GARNET_ORE),
             RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");
    */
    }
}
