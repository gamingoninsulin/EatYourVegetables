package me.gamingoninsulin.common.datagen;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.datagen.recipe.CheeseFormStationRecipeGen;
import me.gamingoninsulin.common.datagen.recipe.KitchenOvenStationRecipeGen;
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
                                                COOKED COWLIFLOWER
        #########################################################################################################
    */
        new KitchenOvenStationRecipeGen(
                ModItems.CAULIFLOWER,           // ingredient
                ModItems.COOKED_CAULIFLOWER,    // result
                1)                              // amount

                .criterion(hasItem(ModItems.SALT_ITEM), conditionsFromItem(ModItems.SALT_ITEM))
                .offerTo(exporter);



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
                                                SHAPED RECIPES
        #########################################################################################################

        #########################################################################################################
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
                                                EMPTY CRATES
        #########################################################################################################
    */
        // Empty Crate
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EMPTY_CRATE)
                .pattern("F F")
                .pattern("F F")
                .pattern("SBS")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('S', Blocks.OAK_SLAB)
                .input('F', Blocks.OAK_FENCE)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EMPTY_CRATE)));

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

        // Cabinet Open Left
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_CABINET_CENTER_D_LEFT_OPEN)
                .pattern("DDD")
                .pattern(" #D")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DARK_OAK_PLANKS)
                .input('#', Items.BUCKET)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_CABINET_CENTER_D_LEFT_OPEN)));

        // Cabinet Open Right
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_CABINET_CENTER_D_RIGHT_OPEN)
                .pattern("DDD")
                .pattern("D# ")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DARK_OAK_PLANKS)
                .input('#', Items.BUCKET)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_CABINET_CENTER_D_RIGHT_OPEN)));

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

        // Kitchen Sink Open Left
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_SINK_WATER_D_LEFT_OPEN)
                .pattern("DDD")
                .pattern(" #D")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DARK_OAK_PLANKS)
                .input('#', Items.WATER_BUCKET)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_SINK_WATER_D_LEFT_OPEN)));

        // Kitchen Sink Open Right
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.KITCHEN_SINK_WATER_D_RIGHT_OPEN)
                .pattern("DDD")
                .pattern("D# ")
                .pattern("DBD")

                .input('B',ModItems.CRAFTING_BOOK)
                .input('D', Blocks.DARK_OAK_PLANKS)
                .input('#', Items.WATER_BUCKET)

                .criterion(hasItem(ModItems.CRAFTING_BOOK), conditionsFromItem(ModItems.CRAFTING_BOOK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.KITCHEN_SINK_WATER_D_RIGHT_OPEN)));

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

        // Kitchen Oven Open
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
                                                KNIFES
        #########################################################################################################
    */

        // stone knife
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STONE_KNIFE, 12)
                .pattern("C")
                .pattern("S")

                .input('C', Blocks.COBBLESTONE)
                .input('S', Items.STICK)

                .criterion(hasItem(Blocks.COBBLESTONE), conditionsFromItem(Blocks.COBBLESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_KNIFE)));

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

        // crates full of cauliflowers
        // Cauliflower \\
        // Crate with 1 layer cauliflower x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)
                .input('#', ModBlocks.EMPTY_CRATE) // previous crate that is used

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER)) // unlock by this item
                .criterion(hasItem(ModBlocks.EMPTY_CRATE), conditionsFromItem(ModBlocks.EMPTY_CRATE)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1))); // new crate as a result

        // Crate with 2 layer cauliflower x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1) // previous crate that is used

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2))); // new crate as a result

        // Crate with 3 layer cauliflower x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2) // previous crate that is used

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3))); // new crate as a result

        // Crate with 4 layer cauliflower x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3) // previous crate that is used

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4))); // new crate as a result

        // Crate with 5 layer cauliflower x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4) // previous crate that is used

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5))); // new crate as a result

        // Crate with 6 layer cauliflower x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5) // previous crate that is used

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6))); // new crate as a result

        // Crate with 7 layer cauliflower x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6) // previous crate that is used

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7))); // new crate as a result

        // Crate with 8 layer cauliflower x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CAULIFLOWER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7) // previous crate that is used

                .criterion(hasItem(ModItems.CAULIFLOWER), conditionsFromItem(ModItems.CAULIFLOWER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8))); // new crate as a result

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

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
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

        // Cucumber crates \\
        // Crate with 1 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)
                .input('#', ModBlocks.EMPTY_CRATE) // previous crate that is used

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER)) // unlock by this item
                .criterion(hasItem(ModBlocks.EMPTY_CRATE), conditionsFromItem(ModBlocks.EMPTY_CRATE)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1))); // new crate as a result

        // Crate with 2 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1) // previous crate that is used

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2))); // new crate as a result

        // Crate with 3 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2) // previous crate that is used

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3))); // new crate as a result

        // Crate with 4 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3) // previous crate that is used

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4))); // new crate as a result

        // Crate with 5 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4) // previous crate that is used

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5))); // new crate as a result

        // Crate with 6 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5) // previous crate that is used

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6))); // new crate as a result

        // Crate with 7 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6) // previous crate that is used

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7))); // new crate as a result

        // Crate with 8 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.CUCUMBER)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7) // previous crate that is used

                .criterion(hasItem(ModItems.CUCUMBER), conditionsFromItem(ModItems.CUCUMBER)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8))); // new crate as a result

        // cucumber crates \\
        // Crate with 1 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)
                .input('#', ModBlocks.EMPTY_CRATE) // previous crate that is used

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO)) // unlock by this item
                .criterion(hasItem(ModBlocks.EMPTY_CRATE), conditionsFromItem(ModBlocks.EMPTY_CRATE)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1))); // new crate as a result

        // Crate with 2 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1) // previous crate that is used

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2))); // new crate as a result

        // Crate with 3 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2) // previous crate that is used

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3))); // new crate as a result

        // Crate with 4 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3) // previous crate that is used

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4))); // new crate as a result

        // Crate with 5 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4) // previous crate that is used

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5))); // new crate as a result

        // Crate with 6 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5) // previous crate that is used

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6))); // new crate as a result

        // Crate with 7 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6) // previous crate that is used

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7))); // new crate as a result

        // Crate with 8 layer cucumber x 8
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8) // recipe for this item
                .pattern("CCC")
                .pattern("C#C")
                .pattern("CCC")

                .input('C', ModItems.AVOCADO)
                .input('#', ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7) // previous crate that is used

                .criterion(hasItem(ModItems.AVOCADO), conditionsFromItem(ModItems.AVOCADO)) // unlock by this item
                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7)) // unlock by this item
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8))); // new crate as a result

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

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
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

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
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

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
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

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
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


        /*
            #########################################################################################################
                                               SHAPELESS RECIPES
                                                   CAULIFLOWER
            #########################################################################################################
         */

        // cauliflower

        // Crate with 1 layer cauliflower x 8
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER, 8)

                .input(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1) + "_to_cauliflower" + "_1"));

        // Crate with 2 layer cauliflower x 16
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER, 16)

                .input(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2) + "_to_cauliflower" + "_2"));

        // Crate with 3 layer cauliflower x 24
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER, 24)

                .input(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3) + "_to_cauliflower" + "_3"));

        // Crate with 4 layer cauliflower x 32
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER, 32)


                .input(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4) + "_to_cauliflower" + "_4"));

        // Crate with 5 layer cauliflower x 40
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER, 40)

                .input(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5) + "_to_cauliflower" + "_5"));

        // Crate with 6 layer cauliflower x 48
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER, 48)

                .input(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6) + "_to_cauliflower" + "_6"));

        // Crate with 7 layer cauliflower x 56
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER, 56)

                .input(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7) + "_to_cauliflower" + "_7"));

        // Crate with 8 layer cauliflower x 64
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CAULIFLOWER, 64)

                .input(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8) + "_to_cauliflower" + "_8"));

        // cauliflower button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CAULIFLOWER_BUTTON, 1)

                .input(ModBlocks.CAULIFLOWER_BLOCK)

                .criterion(hasItem(ModBlocks.CAULIFLOWER_BLOCK), conditionsFromItem(ModBlocks.CAULIFLOWER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CAULIFLOWER_BUTTON)));

          /*
            #########################################################################################################
                                                      CUCUMBER
            #########################################################################################################
         */

        // stone knife and cucumber to make cut cucumber
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUT_CUCUMBER, 2)

                .input(ModItems.STONE_KNIFE)
                .input(ModItems.CUCUMBER)

                .criterion(hasItem(ModItems.STONE_KNIFE), conditionsFromItem(ModItems.STONE_KNIFE))
                .criterion(hasItem(ModItems.CUT_CUCUMBER), conditionsFromItem(ModItems.CUT_CUCUMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUT_CUCUMBER)));

        // cucumber button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUCUMBER_BUTTON, 1)

                .input(ModBlocks.CUCUMBER_BLOCK)

                .criterion(hasItem(ModBlocks.CUCUMBER_BLOCK), conditionsFromItem(ModBlocks.CUCUMBER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUCUMBER_BUTTON)));

        // Crate with 1 layer cucumber x 8
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUCUMBER, 8)

                .input(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1) + "_to_cucumber"));

        // Crate with 2 layer cucumber x 16
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUCUMBER, 16)

                .input(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2) + "_to_cucumber"));

        // Crate with 3 layer cucumber x 24
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUCUMBER, 24)

                .input(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3) + "_to_cucumber"));

        // Crate with 4 layer cucumber x 32
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUCUMBER, 32)

                .input(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4) + "_to_cucumber"));

        // Crate with 5 layer cucumber x 40
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUCUMBER, 40)

                .input(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5) + "_to_cucumber"));

        // Crate with 6 layer cucumber x 48
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUCUMBER, 48)

                .input(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6) + "_to_cucumber"));

        // Crate with 7 layer cucumber x 56
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUCUMBER, 56)

                .input(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7) + "_to_cucumber"));

        // Crate with 8 layer cucumber x 64
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUCUMBER, 64)

                .input(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8) + "_to_cucumber"));

        /*
            #########################################################################################################
                                                      AVOCADO
            #########################################################################################################
         */

        // avocado button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AVOCADO_BUTTON, 1)

                .input(ModBlocks.AVOCADO_BLOCK)

                .criterion(hasItem(ModBlocks.AVOCADO_BLOCK), conditionsFromItem(ModBlocks.AVOCADO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVOCADO_BUTTON)));

        // Crate with 1 layer avocado x 8
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AVOCADO, 8)

                .input(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_1) + "_to_avocado"));

        // Crate with 2 layer avocado x 16
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AVOCADO, 16)

                .input(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_2) + "_to_avocado"));

        // Crate with 3 layer avocado x 24
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AVOCADO, 24)

                .input(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_3) + "_to_avocado"));

        // Crate with 4 layer avocado x 32
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AVOCADO, 32)

                .input(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_4) + "_to_avocado"));

        // Crate with 5 layer avocado x 40
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AVOCADO, 40)

                .input(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_5) + "_to_avocado"));

        // Crate with 6 layer avocado x 48
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AVOCADO, 48)

                .input(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_6) + "_to_avocado"));

        // Crate with 7 layer avocado x 56
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AVOCADO, 56)

                .input(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_7) + "_to_avocado"));

        // Crate with 8 layer avocado x 64
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AVOCADO, 64)

                .input(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_AVOCADO_LAYER_8) + "_to_avocado"));

        /*
            #########################################################################################################
                                                      EGGPLANT
            #########################################################################################################
         */

        // Crate with 1 layer eggplant x 8
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EGGPLANT
                        , 8)

                .input(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_1)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_1))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_1) + "_to_eggplant"));

        // Crate with 2 layer eggplant x 16
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EGGPLANT
                        , 16)

                .input(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_2)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_2))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_2) + "_to_eggplant"));

        // Crate with 3 layer eggplant x 24
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EGGPLANT
                        , 24)

                .input(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_3)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_3))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_3) + "_to_eggplant"));

        // Crate with 4 layer eggplant x 32
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EGGPLANT
                        , 32)

                .input(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_4)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_4))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_4) + "_to_eggplant"));

        // Crate with 5 layer eggplant x 40
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EGGPLANT
                        , 40)

                .input(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_5)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_5))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_5) + "_to_eggplant"));

        // Crate with 6 layer eggplant x 48
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EGGPLANT
                        , 48)

                .input(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_6)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_6))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_6) + "_to_eggplant"));

        // Crate with 7 layer eggplant x 56
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EGGPLANT
                        , 56)

                .input(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_7)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_7))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_7) + "_to_eggplant"));

        // Crate with 8 layer eggplant x 64
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EGGPLANT
                        , 64)

                .input(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_8)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_8), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_8))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_EGGPLANT_LAYER_8) + "_to_eggplant"));

        // eggplant button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.EGGPLANT_BUTTON, 1)

                .input(ModBlocks.EGGPLANT_BLOCK)

                .criterion(hasItem(ModBlocks.EGGPLANT_BLOCK), conditionsFromItem(ModBlocks.EGGPLANT_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.EGGPLANT_BUTTON)));

        /*
            #########################################################################################################
                                                      CORN
            #########################################################################################################
         */

        // corn button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORN_BUTTON, 1)

                .input(ModBlocks.CORN_BLOCK)

                .criterion(hasItem(ModBlocks.CORN_BLOCK), conditionsFromItem(ModBlocks.CORN_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CORN_BUTTON)));

        // Crate with 1 layer corn x 8
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN
                        , 8)

                .input(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_1)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_1))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_1) + "_to_corn"));

        // Crate with 2 layer corn x 16
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN
                        , 16)

                .input(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_2)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_2))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_2) + "_to_corn"));

        // Crate with 3 layer corn x 24
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN
                        , 24)

                .input(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_3)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_3))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_3) + "_to_corn"));

        // Crate with 4 layer corn x 32
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN
                        , 32)

                .input(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_4)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_4))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_4) + "_to_corn"));

        // Crate with 5 layer corn x 40
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN
                        , 40)

                .input(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_5)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_5))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_5) + "_to_corn"));

        // Crate with 6 layer corn x 48
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN
                        , 48)

                .input(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_6)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_6))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_6) + "_to_corn"));

        // Crate with 7 layer corn x 56
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN
                        , 56)

                .input(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_7)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_7))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_7) + "_to_corn"));

        // Crate with 8 layer corn x 64
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN
                        , 64)

                .input(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_8)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_8), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_8))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_CORN_LAYER_8) + "_to_corn"));
        /*
            #########################################################################################################
                                                      SEA PICKLE
            #########################################################################################################
         */

        // sea_pickle button
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEA_PICKLE_BUTTON, 1)

                .input(ModBlocks.SEA_PICKLE_BLOCK)

                .criterion(hasItem(ModBlocks.SEA_PICKLE_BLOCK), conditionsFromItem(ModBlocks.SEA_PICKLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SEA_PICKLE_BUTTON)));

        // Crate with 1 layer sea_pickle x 8
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEA_PICKLE
                        , 8)

                .input(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_1) + "_to_sea_pickle"));

        // Crate with 2 layer sea_pickle x 16
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEA_PICKLE
                        , 16)

                .input(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_2) + "_to_sea_pickle"));

        // Crate with 3 layer sea_pickle x 24
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEA_PICKLE
                        , 24)

                .input(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_3) + "_to_sea_pickle"));

        // Crate with 4 layer sea_pickle x 32
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEA_PICKLE
                        , 32)

                .input(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_4) + "_to_sea_pickle"));

        // Crate with 5 layer sea_pickle x 40
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEA_PICKLE
                        , 40)

                .input(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_5) + "_to_sea_pickle"));

        // Crate with 6 layer sea_pickle x 48
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEA_PICKLE
                        , 48)

                .input(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_6) + "_to_sea_pickle"));

        // Crate with 7 layer sea_pickle x 56
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEA_PICKLE
                        , 56)

                .input(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_7) + "_to_sea_pickle"));

        // Crate with 8 layer sea_pickle x 64
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SEA_PICKLE
                        , 64)

                .input(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8)

                .criterion(hasItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8), conditionsFromItem(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOD_CRATE_BLOCK_SEA_PICKLE_LAYER_8) + "_to_sea_pickle"));


    /*
        #########################################################################################################
                                                BLASTED RECIPES
        #########################################################################################################








        #########################################################################################################
                                                TURNED OFF
        #########################################################################################################

         // pink garnet ore to item
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
