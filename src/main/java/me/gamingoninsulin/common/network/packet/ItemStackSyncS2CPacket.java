package me.gamingoninsulin.common.network.packet;

import me.gamingoninsulin.common.blocks.entity.CheesePressStationBlockEntity;
import me.gamingoninsulin.common.blocks.entity.KitchenOvenStationBlockEntity;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class ItemStackSyncS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        int size = buf.readInt();
        DefaultedList<ItemStack> list = DefaultedList.ofSize(size, ItemStack.EMPTY);
        for(int i = 0; i < size; i++) {
            list.set(i, buf.readItemStack());
        }
        BlockPos position = buf.readBlockPos();

        if(client.world.getBlockEntity(position) instanceof CheesePressStationBlockEntity blockEntity) {
            blockEntity.setInventory(list);
        }

        if(client.world.getBlockEntity(position) instanceof KitchenOvenStationBlockEntity blockEntity) {
            blockEntity.setInventory(list);
        }
        
    }
}
