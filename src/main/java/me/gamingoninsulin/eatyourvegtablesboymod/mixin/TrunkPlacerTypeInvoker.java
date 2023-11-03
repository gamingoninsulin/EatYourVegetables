package me.gamingoninsulin.eatyourvegtablesboymod.mixin;

import com.mojang.serialization.Codec;
import me.gamingoninsulin.eatyourvegtablesboymod.world.PineWoodTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(TrunkPlacerType.class)
public interface TrunkPlacerTypeInvoker {
    @Invoker("register")
    static <P extends TrunkPlacer> TrunkPlacerType<P> callRegister(String id, Codec<PineWoodTrunkPlacer> codec) {
        throw new IllegalStateException();
    }
}