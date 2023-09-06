package me.gamingoninsulin.core;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.fluid.ModFluids;
import me.gamingoninsulin.common.screen.CheeseFormPressScreen;
import me.gamingoninsulin.common.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class EYVBClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAULIFLOWER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CUCUMBER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EGGPLANT_CROP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_EXTRACTOR_HOOD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_SINK_WATER_D_CLOSED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_SINK_WATER_D_LEFT_OPEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_SINK_WATER_D_RIGHT_OPEN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KITCHEN_SINK_WATER_D_BOTH_OPEN, RenderLayer.getCutout());


        HandledScreens.register(ModScreenHandlers.CHEESE_FORM_PRESS_STATION_SCREEN_HANDLER, CheeseFormPressScreen::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHEESE_FLUID, ModFluids.FLOWING_CHEESE_FLUID,
                SimpleFluidRenderHandler.coloredWater(0xc68747));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_CHEESE_FLUID, ModFluids.FLOWING_CHEESE_FLUID);
    }
}
/*      //OFF\\

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());
 */
