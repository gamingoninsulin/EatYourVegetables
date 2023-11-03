package me.gamingoninsulin.eatyourvegtablesboymod.network;

import me.gamingoninsulin.eatyourvegtablesboymod.network.packet.ItemStackSyncS2CPacket;
import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier ITEM_SYNC = new Identifier(Reference.MOD_ID, "item_sync");


    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(ITEM_SYNC, ItemStackSyncS2CPacket::receive);
    }
}
