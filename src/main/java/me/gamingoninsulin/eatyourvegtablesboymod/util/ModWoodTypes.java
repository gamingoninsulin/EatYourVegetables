package me.gamingoninsulin.eatyourvegtablesboymod.util;

import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeRegistry;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class ModWoodTypes {
    public static final WoodType PINEWOOD = WoodTypeRegistry.register(new Identifier(Reference.MOD_ID, "pinewood"), BlockSetType.OAK);
}
