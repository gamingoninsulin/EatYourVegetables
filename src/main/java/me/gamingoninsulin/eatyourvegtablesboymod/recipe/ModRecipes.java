package me.gamingoninsulin.eatyourvegtablesboymod.recipe;

import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void RegisterRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reference.MOD_ID, CheeseFormPressRecipe.Serializer.ID),
                CheeseFormPressRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reference.MOD_ID, CheeseFormPressRecipe.Type.ID),
                CheeseFormPressRecipe.Type.INSTANCE);


        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Reference.MOD_ID, KitchenOvenRecipe.Serializer.ID),
                KitchenOvenRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_TYPE, new Identifier(Reference.MOD_ID, KitchenOvenRecipe.Type.ID),
                KitchenOvenRecipe.Type.INSTANCE);
    }

}
