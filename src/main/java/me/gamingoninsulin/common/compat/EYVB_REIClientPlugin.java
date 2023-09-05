package me.gamingoninsulin.common.compat;

import me.gamingoninsulin.common.blocks.ModBlocks;
import me.gamingoninsulin.common.recipe.CheeseFormPressRecipe;
import me.gamingoninsulin.common.screen.CheeseFormPressScreen;
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

        registry.addWorkstations(CheeseFormingCategory.CHEESE_FORMING, EntryStacks.of(ModBlocks.CHEESE_FORM_PRESS));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(CheeseFormPressRecipe.class, CheeseFormPressRecipe.Type.INSTANCE,
                CheeseFormingDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), CheeseFormPressScreen.class,
                CheeseFormingCategory.CHEESE_FORMING);
    }
}
