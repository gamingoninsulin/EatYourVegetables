package me.gamingoninsulin.common.fluid;

import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.core.Reference;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static final FlowableFluid STILL_CHEESE_FLUID = Registry.register(Registries.FLUID,
            new Identifier(Reference.MOD_ID, "cheese_fluid"), new CheeseFluid.Still());

    public static final FlowableFluid FLOWING_CHEESE_FLUID = Registry.register(Registries.FLUID,
            new Identifier(Reference.MOD_ID, "flowing_cheese_fluid"), new CheeseFluid.Flowing());


    public static void registerFluid() {
        EYVBMod.LOGGER.info("Registering Fluid For " + Reference.REGISTER_MOD_NAME);
    }
}
