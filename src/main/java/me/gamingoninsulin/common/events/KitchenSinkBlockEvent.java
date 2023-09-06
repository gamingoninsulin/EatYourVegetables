package me.gamingoninsulin.common.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

/**
 * Callback for left-clicking ("attacking") a block.
 * Is hooked in before the spectator check, so make sure to check for the player's game mode as well!
 *
 *  Upon return:
 *  SUCCESS cancels further processing and, on the client, sends a packet to the server.
 *  PASS falls back to further processing.
 *  FAIL cancels further processing and does not send a packet to the server.
 *
 *  ATTACK_BLOCK does not let you control the packet sending process yet.
 */

public interface KitchenSinkBlockEvent {
    Event<AttackBlockCallback> EVENT = EventFactory.createArrayBacked(AttackBlockCallback.class,
            (listeners) -> (player, world, hand, pos, direction) -> {
                for (AttackBlockCallback event : listeners) {
                    ActionResult result = event.interact(player, world, hand, pos, direction);

                    if (result != ActionResult.PASS) {
                        return result;
                    }
                }

                return ActionResult.SUCCESS;
            }
    );

    ActionResult interact(PlayerEntity player, World world, Hand hand, BlockPos pos, Direction direction);
}
