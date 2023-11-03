package me.gamingoninsulin.eatyourvegtablesboymod.blocks.entity.renderer;

import me.gamingoninsulin.eatyourvegtablesboymod.blocks.custom.kitchen.CheesePressBlock;
import me.gamingoninsulin.eatyourvegtablesboymod.blocks.entity.CheesePressStationBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class CheesePressStationBlockRenderer implements BlockEntityRenderer<CheesePressStationBlockEntity> {
    public CheesePressStationBlockRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(CheesePressStationBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack itemStack = entity.getRenderStack();
        matrices.push();

        matrices.translate(0.5f, 0.30f, 0.5f); // item location
        matrices.scale(0.35f, 0.35f, 0.35f); // item size

        matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(entity.getCachedState().get(CheesePressBlock.FACING).asRotation()));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(270));

        itemRenderer.renderItem(itemStack, ModelTransformationMode.GUI, getLightLevel(entity.getWorld(),
                entity.getPos()), OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 1);
        matrices.pop();
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}
