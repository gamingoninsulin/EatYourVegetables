package me.gamingoninsulin.core;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.blocks.entity.ModBlockEntities;
import me.gamingoninsulin.common.blocks.entity.renderer.CheesePressStationBlockRenderer;
import me.gamingoninsulin.common.fluid.ModFluids;
import me.gamingoninsulin.common.network.ModMessages;
import me.gamingoninsulin.common.screen.CheeseFormPressScreen;
import me.gamingoninsulin.common.screen.ModScreenHandlers;
import me.gamingoninsulin.common.util.ModWoodTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;

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
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHEESE_FORM_PRESS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHEESE_FORM_PRESS_WORKING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHEESE_FORM_PRESS_DONE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_PLANKS_STAIRS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_PLANKS_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_PLANKS_BUTTON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_PLANKS_PRESSURE_PLATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_PLANKS_FENCE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_PLANKS_FENCE_GATE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_PLANKS_WALL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_LEAVES_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINE_LEAVES_WALL, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.CHEESE_FORM_PRESS_STATION_SCREEN_HANDLER, CheeseFormPressScreen::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_CHEESE_FLUID, ModFluids.FLOWING_CHEESE_FLUID,
                SimpleFluidRenderHandler.coloredWater(0xc68747));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_CHEESE_FLUID, ModFluids.FLOWING_CHEESE_FLUID);

        ModMessages.registerS2CPackets();

        BlockEntityRendererFactories.register(ModBlockEntities.CHEESE_FORM_PRESS_STATION_BE, CheesePressStationBlockRenderer::new);

        BlockEntityRendererFactories.register(ModBlockEntities.MOD_SIGN_BLOCK_ENTITY, SignBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MOD_HANGING_SIGN_BLOCK_ENTITY, HangingSignBlockEntityRenderer::new);

        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(ModWoodTypes.PINEWOOD, TexturedRenderLayers.getSignTextureId(ModWoodTypes.PINEWOOD));
    }
}
/*      //OFF\\

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());
 */
