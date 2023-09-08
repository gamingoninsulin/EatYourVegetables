package me.gamingoninsulin.common.items;


import me.gamingoninsulin.EYVBMod;
import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.fluid.ModFluids;
import me.gamingoninsulin.common.food.ModFoodComponent;
import me.gamingoninsulin.common.materials.ModToolMaterial;
import me.gamingoninsulin.core.Reference;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {
    /*
       ##############################################################################################################
                                                      TOOLS
       ##############################################################################################################
    */
    // cheese fluid
    public static final Item FLUID_CHEESE_BUCKET = Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID,
            "fluid_cheese_bucket"), new BucketItem(ModFluids.STILL_CHEESE_FLUID,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    // stone knife
    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new SwordItem(ModToolMaterial.CRAFTING_MATERIAL, 0,0f, new FabricItemSettings()
                    .recipeRemainder(ModItems.STONE_KNIFE).maxCount(1)));

    // stone knife
    public static final Item CRAFTING_BOOK = registerItem("crafting_book",
            new Item(new FabricItemSettings()));
   /*
       ##############################################################################################################
                                                     CROP SEEDS
       ##############################################################################################################
    */

    // cauliflower seeds
    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
            new AliasedBlockItem(ModBlocks.CAULIFLOWER_CROP, new FabricItemSettings()));

    // Cucumber Seeds
    public static final Item CUCUMBER_SEEDS = registerItem("cucumber_seeds",
            new AliasedBlockItem(ModBlocks.CUCUMBER_CROP, new FabricItemSettings()));

    // Eggplant Seeds
    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP, new FabricItemSettings()));


    /*
       ##############################################################################################################
                                                      CROPS ITEM
       ##############################################################################################################
    */

    // cauliflower
    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new Item(new FabricItemSettings().food(ModFoodComponent.CAULIFLOWER)));

    // Cucumber
    public static final Item CUCUMBER = registerItem("cucumber",
            new Item(new FabricItemSettings().food(ModFoodComponent.CUCUMBER)));

    // Cucumber
    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().food(ModFoodComponent.EGGPLANT)));

    // Cucumber
    public static final Item CORN = registerItem("corn_cob",
            new Item(new FabricItemSettings().food(ModFoodComponent.CORN)));

    // Cucumber
    public static final Item AVOCADO = registerItem("avocado",
            new Item(new FabricItemSettings().food(ModFoodComponent.AVOCADO)));

    // Cucumber
    public static final Item SEA_PICKLE = registerItem("sea_pickle",
            new Item(new FabricItemSettings().food(ModFoodComponent.SEA_PICKLE)));

    // cauliflower
    public static final Item SALT_ITEM = registerItem("salt_item",
            new Item(new FabricItemSettings().food(ModFoodComponent.SALT_ITEM)));

    /*
       ##############################################################################################################
                                                    COOKED CROP ITEMS
       ##############################################################################################################
    */

    // cooked cauliflower
    public static final Item COOKED_CAULIFLOWER = registerItem("cooked_cauliflower",
            new Item(new FabricItemSettings().food(ModFoodComponent.COOKED_CAULIFLOWER)));

    // Cut Cucumber
    public static final Item CUT_CUCUMBER = registerItem("cut_cucumber",
            new Item(new FabricItemSettings().food(ModFoodComponent.CUCUMBER)));

    // Wheel of Salted Cheese
    public static final Item WHEEL_OF_CHEESE = registerItem("wheel_of_cheese",
            new Item(new FabricItemSettings().food(ModFoodComponent.WHEEL_OF_CHEESE)));

    /*
       ##############################################################################################################
                                                DO NOT TOUCH DOWN HERE!
       ##############################################################################################################
    */

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reference.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EYVBMod.LOGGER.info("Registering Mod Items for " + Reference.REGISTER_MOD_NAME);
    }
}
/*

       ##############################################################################################################
                                                    TURNED OFF
       ##############################################################################################################


    //  ore blocks
    // pink garnet
    public static final Item PINK_GARNET = registerItem("pink_garnet",
            new Item(new FabricItemSettings()));

    // raw pink garnet
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet",
            new Item(new FabricItemSettings()));

       ##############################################################################################################

       ##############################################################################################################

    // tools
    // metal detector
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(256)));

    // sword
    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new SwordItem(ModToolMaterial.PINK_GARNET_MATERIAL, 0,0f, new FabricItemSettings()));

    // axe
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterial.PINK_GARNET_MATERIAL, 1,1f,new FabricItemSettings()));

    // pickaxe
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterial.PINK_GARNET_MATERIAL, 0,0f,new FabricItemSettings()));

    // shovel
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterial.PINK_GARNET_MATERIAL, 6,-2f,new FabricItemSettings()));

    // hoe
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterial.PINK_GARNET_MATERIAL, 0,0f,new FabricItemSettings()));

    // paxel
    public static final Item PINK_GARNET_PAXEL = registerItem("pink_garnet_paxel",
            new PaxelItem(ModToolMaterial.PINK_GARNET_MATERIAL, 0, 0f, new FabricItemSettings()));

       ##############################################################################################################

       ##############################################################################################################

   // armor
   // helmet
    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET ,  new FabricItemSettings()));

    // chestplate
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE ,  new FabricItemSettings()));

    // leggings
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS ,  new FabricItemSettings()));

    // boots
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS ,  new FabricItemSettings()));

       ##############################################################################################################

       ##############################################################################################################

    // fuel items
    // peat brick
    public static final Item PEAT_BRICK = registerItem("peat_brick",
            new Item(new FabricItemSettings()));

       ##############################################################################################################

       ##############################################################################################################
 */
