package me.gamingoninsulin.eatyourvegtablesboymod.compat;

import me.gamingoninsulin.eatyourvegtablesboymod.blocks.ModBlocks;
import me.gamingoninsulin.eatyourvegtablesboymod.recipe.CheeseFormPressRecipe;
import me.gamingoninsulin.eatyourvegtablesboymod.recipe.KitchenOvenRecipe;
import me.gamingoninsulin.eatyourvegtablesboymod.screen.CheeseFormPressScreen;
import me.gamingoninsulin.eatyourvegtablesboymod.screen.KitchenOvenScreen;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;

public class EYVB_REIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new CheeseFormingCategory());
        registry.add(new KitchenOvenCategory());

        registry.addWorkstations(CheeseFormingCategory.CHEESE_FORMING, EntryStacks.of(ModBlocks.CHEESE_FORM_PRESS));
        registry.addWorkstations(KitchenOvenCategory.KITCHENOVEN, EntryStacks.of(ModBlocks.KITCHEN_OVEN_ON));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(CheeseFormPressRecipe.class, CheeseFormPressRecipe.Type.INSTANCE, CheeseFormingDisplay::new);
        registry.registerRecipeFiller(KitchenOvenRecipe.class, KitchenOvenRecipe.Type.INSTANCE, KitchenOvenDisplay::new);

    }

    @Override
    public void registerScreens(ScreenRegistry registry) {

        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), CheeseFormPressScreen.class, CheeseFormingCategory.CHEESE_FORMING);

        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), KitchenOvenScreen.class, KitchenOvenCategory.KITCHENOVEN);
    }
}
