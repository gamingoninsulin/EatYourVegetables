package me.gamingoninsulin.eatyourvegtablesboymod.world.tree;

import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import me.gamingoninsulin.eatyourvegtablesboymod.mixin.TrunkPlacerTypeInvoker;
import me.gamingoninsulin.eatyourvegtablesboymod.world.tree.custom.PinewoodTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> PINEWOOD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("pinewood_trunk_placer",
            PinewoodTrunkPlacer.CODEC);

    public static void register() {
        EYVBMod.LOGGER.info("Registering Trunk Placer for " + Reference.MOD_ID);
    }
}
