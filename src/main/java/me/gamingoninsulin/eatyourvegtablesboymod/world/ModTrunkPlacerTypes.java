package me.gamingoninsulin.eatyourvegtablesboymod.world;

import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import me.gamingoninsulin.eatyourvegtablesboymod.mixin.TrunkPlacerTypeInvoker;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> PINEWOOD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("pinewood_trunk_placer",
            PineWoodTrunkPlacer.CODEC);

    public static void register() {
        EYVBMod.LOGGER.info("Registering Trunk Placer for " + Reference.MOD_ID);

    }
}