package me.gamingoninsulin.common.blocks.entity;

import dev.architectury.platform.Mod;
import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.core.Reference;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<CheesePressStationBlockEntity> CHEESE_FORM_PRESS_STATION_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Reference.MOD_ID, "cheese_form_press_station_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CheesePressStationBlockEntity::new,
                            // cheese form press
                            ModBlocks.CHEESE_FORM_PRESS
                    ).build(null));

    public static void RegisterModEntities() {
        EYVBMod.LOGGER.info("Regitering Mod Entities for " + Reference.REGISTER_MOD_NAME);
    }
}
