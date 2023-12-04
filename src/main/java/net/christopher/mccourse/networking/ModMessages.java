package net.christopher.mccourse.networking;

import net.christopher.mccourse.MCCourseMod;
import net.christopher.mccourse.networking.packet.ItemStackSyncS2CPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier ITEM_SYNC = new net.minecraft.util.Identifier(MCCourseMod.MOD_ID, "item_sync");
    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(ITEM_SYNC, ItemStackSyncS2CPacket::receive);
    }
}
