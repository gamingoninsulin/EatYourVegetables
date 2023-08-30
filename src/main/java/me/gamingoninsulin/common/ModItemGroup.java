package me.gamingoninsulin.common;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.items.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static me.gamingoninsulin.core.Reference.*;


public class ModItemGroup {

    // ##################################################
    public static final ItemGroup FOOD_AND_STUFFS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "food_and_stuffs"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.food_and_stuffs"))
                    .icon(() -> new ItemStack(ModItems.CAULIFLOWER)).entries((displayContext, entries) -> {
                        // SEEDS
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.CUCUMBER_SEEDS);
                        // RAW FOOD
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.CUCUMBER);
                        // COOKED FOOD
                        entries.add(ModItems.COOKED_CAULIFLOWER);
                        entries.add(ModItems.CUT_CUCUMBER);

                        // BLOCKS
                        // Cauliflower
                        entries.add(ModBlocks.CAULIFLOWER_BLOCK);
                        entries.add(ModBlocks.CAULIFLOWER_STAIRS);
                        entries.add(ModBlocks.CAULIFLOWER_SLAB);
                        entries.add(ModBlocks.CAULIFLOWER_WALL);
                        entries.add(ModBlocks.CAULIFLOWER_FENCE);
                        entries.add(ModBlocks.CAULIFLOWER_FENCE_GATE);
                        entries.add(ModBlocks.CAULIFLOWER_PRESSURE_PLATE);
                        entries.add(ModBlocks.CAULIFLOWER_BUTTON);

                        // Cucumber
                        entries.add(ModBlocks.CUCUMBER_BLOCK);
                        entries.add(ModBlocks.CUCUMBER_STAIRS);
                        entries.add(ModBlocks.CUCUMBER_SLAB);
                        entries.add(ModBlocks.CUCUMBER_WALL);
                        entries.add(ModBlocks.CUCUMBER_FENCE);
                        entries.add(ModBlocks.CUCUMBER_FENCE_GATE);
                        entries.add(ModBlocks.CUCUMBER_PRESSURE_PLATE);
                        entries.add(ModBlocks.CUCUMBER_BUTTON);

                        //  MISC
                        // empty crate
                        entries.add(ModBlocks.MOD_CRATE_BLOCK);

                        // cauliflower crates
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_1);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_2);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_3);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_4);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_5);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_6);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_7);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CAULIFLOWER_LAYER_8);

                        // cucumber crates
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_1);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_2);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_3);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_4);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_5);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_6);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_7);
                        entries.add(ModBlocks.MOD_CRATE_BLOCK_CUCUMBER_LAYER_8);
                    }).build());

    // ##################################################

    public static final ItemGroup TOOLS_AND_ARMOR = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "tools_and_armor"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.tools_and_armor"))
                    .icon(() -> new ItemStack(ModItems.STONE_KNIFE)).entries((displayContext, entries) -> {
                        // TOOLS
                        entries.add(ModItems.STONE_KNIFE);
                    }).build());


    // ##################################################

    public static void registerItemGroups() {

    }

}
/*      //OFF\\

// ##################################################

    public static final ItemGroup ORES_AND_ORE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "ores_and_ore_items"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.ores_and_ore_items"))
                    .icon(() -> new ItemStack(ModItems.RAW_PINK_GARNET)).entries((displayContext, entries) -> {
                        // ORES, & (RAW) BLOCKS
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);
                        entries.add(ModBlocks.END_PINK_GARNET_ORE);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PEAT_BLOCK);
                        // ITEMS & RAW ITEMS
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.PEAT_BRICK);
                    }).build());

    // ##################################################

    public static final ItemGroup BLOCKS_AND_DECO = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "blocks_and_deco"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eyvb.blocks_and_deco"))
                    .icon(() -> new ItemStack(ModBlocks.PINK_GARNET_FENCE)).entries((displayContext, entries) -> {
                        // BLOCKS
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);

                        // DECO
                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
                    }).build());

    // ##################################################
 */