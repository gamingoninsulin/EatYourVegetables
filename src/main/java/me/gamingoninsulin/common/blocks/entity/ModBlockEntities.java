package me.gamingoninsulin.common.blocks.entity;

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

    public static final BlockEntityType<KitchenOvenStationBlockEntity> KITCHEN_OVEN_STATION_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Reference.MOD_ID, "kitchen_oven_station_block_entity"),
                    FabricBlockEntityTypeBuilder.create(KitchenOvenStationBlockEntity::new,
                            // kitchen oven
                            ModBlocks.KITCHEN_OVEN_ON
                    ).build(null));

    public static final BlockEntityType<ModSignBlockEntity> MOD_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Reference.MOD_ID, "mod_sign_entity"),
            FabricBlockEntityTypeBuilder.create(ModSignBlockEntity::new,
                    ModBlocks.PINEWOOD_SIGN, ModBlocks.PINEWOOD_WALL_SIGN).build());

    public static final BlockEntityType<ModSignBlockEntity> MOD_HANGING_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(Reference.MOD_ID, "mod_hanging_sign_entity"),
            FabricBlockEntityTypeBuilder.create(ModSignBlockEntity::new,
                    ModBlocks.PINEWOOD_HANGING_SIGN, ModBlocks.PINEWOOD_HANGING_SIGN).build(null));

    public static void RegisterModEntities() {
        EYVBMod.LOGGER.info("Regitering Mod Entities for " + Reference.REGISTER_MOD_NAME);
    }
}
