package me.gamingoninsulin.eatyourvegtablesboymod.world.tree;

import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import me.gamingoninsulin.eatyourvegtablesboymod.mixin.FoliagePlacerTypeInvoker;
import me.gamingoninsulin.eatyourvegtablesboymod.world.tree.custom.PinewoodFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> PINEWOOD_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister(
            "pinewood_foliage_placer", PinewoodFoliagePlacer.CODEC);

    public static void register() {
        EYVBMod.LOGGER.info("Registering the Foliage Placers for " + Reference.MOD_ID);
    }
}