package me.gamingoninsulin.eatyourvegtablesboymod.datagen;

import me.gamingoninsulin.eatyourvegtablesboymod.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;


public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(
                // LOGS
                ModBlocks.PINE_WOOD,
                ModBlocks.PINE_LOG,

                // STRIPPED
                ModBlocks.STRIPPED_PINE_WOOD,
                ModBlocks.STRIPPED_PINE_LOG
        );
        getOrCreateTagBuilder(BlockTags.FENCES).add(
                ModBlocks.CAULIFLOWER_FENCE,
                ModBlocks.CUCUMBER_FENCE,
                ModBlocks.AVOCADO_FENCE,
                ModBlocks.CORN_FENCE,
                ModBlocks.EGGPLANT_FENCE,
                ModBlocks.SEA_PICKLE_FENCE,
                ModBlocks.PINE_PLANKS_FENCE
        );

        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(
                ModBlocks.CAULIFLOWER_FENCE_GATE,
                ModBlocks.CUCUMBER_FENCE_GATE,
                ModBlocks.AVOCADO_FENCE_GATE,
                ModBlocks.CORN_FENCE_GATE,
                ModBlocks.EGGPLANT_FENCE_GATE,
                ModBlocks.SEA_PICKLE_FENCE_GATE,
                ModBlocks.PINE_PLANKS_FENCE_GATE

        );

        getOrCreateTagBuilder(BlockTags.WALLS).add(
                ModBlocks.CAULIFLOWER_WALL,
                ModBlocks.CUCUMBER_WALL,
                ModBlocks.AVOCADO_WALL,
                ModBlocks.CORN_WALL,
                ModBlocks.EGGPLANT_WALL,
                ModBlocks.SEA_PICKLE_WALL,
                ModBlocks.PINE_PLANKS_WALL,
                ModBlocks.PINE_LEAVES_WALL
        );

        getOrCreateTagBuilder(BlockTags.LEAVES).add(
                ModBlocks.PINE_LEAVES_BLOCK,
                ModBlocks.PINE_LEAVES_WALL
        );

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(
                // kitchen oven on / off
                ModBlocks.KITCHEN_OVEN_OFF,
                ModBlocks.KITCHEN_OVEN_ON,

                // kitchen sinks
                ModBlocks.KITCHEN_SINK_WATER_D_CLOSED,
                ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN,


                // kitchen extractor hood
                ModBlocks.KITCHEN_EXTRACTOR_HOOD
        );

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(

                // BOTTOM
                // cabinets center
                ModBlocks.KITCHEN_CABINET_CENTER_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_CENTER_D_BOTH_OPEN,

                // no drawers
                // cabinets center
                ModBlocks.KITCHEN_CABINET_CENTER_NO_DRAWERS_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_CENTER_NO_DRAWERS_D_BOTH_OPEN,

                // kitchen corner left
                ModBlocks.KITCHEN_CABINET_LCORNER_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_LCORNER_D_BOTH_OPEN,

                // no drawers
                // kitchen corner left
                ModBlocks.KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_LCORNER_NO_DRAWERS_D_BOTH_OPEN,

                // kitchen corner right
                ModBlocks.KITCHEN_CABINET_RCORNER_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_RCORNER_D_BOTH_OPEN,

                // no drawers
                // kitchen corner right
                ModBlocks.KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_RCORNER_NO_DRAWERS_D_BOTH_OPEN,

                // TOP
                // cabinets (closed, open left, open right, open)
                ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_TOP_CENTER_D_BOTH_OPEN,

                // kitchen corner left
                ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_TOP_LCORNER_D_BOTH_OPEN,

                // kitchen corner right
                ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_CLOSED,
                ModBlocks.KITCHEN_CABINET_TOP_RCORNER_D_BOTH_OPEN,

                // cheese press
                ModBlocks.CHEESE_FORM_PRESS,
                ModBlocks.CHEESE_FORM_PRESS_WORKING,
                ModBlocks.CHEESE_FORM_PRESS_DONE

        );

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE).add(
                ModBlocks.PINE_LEAVES_BLOCK,
                ModBlocks.PINE_LEAVES_WALL,
                ModBlocks.CAULIFLOWER_WALL,
                ModBlocks.CUCUMBER_WALL,
                ModBlocks.AVOCADO_WALL,
                ModBlocks.CORN_WALL,
                ModBlocks.EGGPLANT_WALL,
                ModBlocks.SEA_PICKLE_WALL,
                ModBlocks.PINE_PLANKS_WALL,

                ModBlocks.CAULIFLOWER_FENCE,
                ModBlocks.CUCUMBER_FENCE,
                ModBlocks.AVOCADO_FENCE,
                ModBlocks.CORN_FENCE,
                ModBlocks.EGGPLANT_FENCE,
                ModBlocks.SEA_PICKLE_FENCE,
                ModBlocks.PINE_PLANKS_FENCE,

                ModBlocks.CAULIFLOWER_FENCE_GATE,
                ModBlocks.CUCUMBER_FENCE_GATE,
                ModBlocks.AVOCADO_FENCE_GATE,
                ModBlocks.CORN_FENCE_GATE,
                ModBlocks.EGGPLANT_FENCE_GATE,
                ModBlocks.SEA_PICKLE_FENCE_GATE,
                ModBlocks.PINE_PLANKS_FENCE_GATE,

                // cauliflower deco
                ModBlocks.CAULIFLOWER_BLOCK,
                ModBlocks.CAULIFLOWER_STAIRS,
                ModBlocks.CAULIFLOWER_SLAB,
                ModBlocks.CAULIFLOWER_PRESSURE_PLATE,
                ModBlocks.CAULIFLOWER_BUTTON,
                ModBlocks.CAULIFLOWER_FENCE,
                ModBlocks.CAULIFLOWER_FENCE_GATE,
                ModBlocks.CAULIFLOWER_WALL,

                // cucumber deco
                ModBlocks.CUCUMBER_BLOCK,
                ModBlocks.CUCUMBER_STAIRS,
                ModBlocks.CUCUMBER_SLAB,
                ModBlocks.CUCUMBER_PRESSURE_PLATE,
                ModBlocks.CUCUMBER_BUTTON,
                ModBlocks.CUCUMBER_FENCE,
                ModBlocks.CUCUMBER_FENCE_GATE,
                ModBlocks.CUCUMBER_WALL,

                // eggplant deco
                ModBlocks.EGGPLANT_BLOCK,
                ModBlocks.EGGPLANT_STAIRS,
                ModBlocks.EGGPLANT_SLAB,
                ModBlocks.EGGPLANT_PRESSURE_PLATE,
                ModBlocks.EGGPLANT_BUTTON,
                ModBlocks.EGGPLANT_FENCE,
                ModBlocks.EGGPLANT_FENCE_GATE,
                ModBlocks.EGGPLANT_WALL,

                // avocado deco
                ModBlocks.AVOCADO_BLOCK,
                ModBlocks.AVOCADO_STAIRS,
                ModBlocks.AVOCADO_SLAB,
                ModBlocks.AVOCADO_PRESSURE_PLATE,
                ModBlocks.AVOCADO_BUTTON,
                ModBlocks.AVOCADO_FENCE,
                ModBlocks.AVOCADO_FENCE_GATE,
                ModBlocks.AVOCADO_WALL,

                // sea pickle deco
                ModBlocks.SEA_PICKLE_BLOCK,
                ModBlocks.SEA_PICKLE_STAIRS,
                ModBlocks.SEA_PICKLE_SLAB,
                ModBlocks.SEA_PICKLE_PRESSURE_PLATE,
                ModBlocks.SEA_PICKLE_BUTTON,
                ModBlocks.SEA_PICKLE_FENCE,
                ModBlocks.SEA_PICKLE_FENCE_GATE,
                ModBlocks.SEA_PICKLE_WALL,

                // corn deco
                ModBlocks.CORN_BLOCK,
                ModBlocks.CORN_STAIRS,
                ModBlocks.CORN_SLAB,
                ModBlocks.CORN_PRESSURE_PLATE,
                ModBlocks.CORN_BUTTON,
                ModBlocks.CORN_FENCE,
                ModBlocks.CORN_FENCE_GATE,
                ModBlocks.CORN_WALL
        );
    }
}