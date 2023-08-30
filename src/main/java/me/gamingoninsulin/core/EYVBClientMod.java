package me.gamingoninsulin.core;

import me.gamingoninsulin.common.blocks.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class EYVBClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAULIFLOWER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CUCUMBERS_CROP, RenderLayer.getCutout());

        // empty crate
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK, RenderLayer.getCutout());
        // cauliflower \\
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8, RenderLayer.getCutout());

        // cucumber \\
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8, RenderLayer.getCutout());
    }
}
/*      //OFF\\

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());
 */
