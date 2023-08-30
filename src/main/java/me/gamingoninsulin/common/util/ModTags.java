package me.gamingoninsulin.common.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static me.gamingoninsulin.core.Reference.*;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MOD_ID, name));
        }

        private static TagKey<Block> createCommonBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    // ##################################################


    public static class Items {
        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MOD_ID, name));
        }

        private static TagKey<Item> createCommonItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}
/*      //OFF\\

    public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS_TAG = createBlockTag("metal_detectable_blocks");
    public static final TagKey<Block> PAXEL_MINEABLE_TAG = createBlockTag("mineable/paxel");
 */