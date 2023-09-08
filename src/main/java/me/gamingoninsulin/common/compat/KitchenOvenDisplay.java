package me.gamingoninsulin.common.compat;

import me.gamingoninsulin.common.recipe.KitchenOvenRecipe;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KitchenOvenDisplay extends BasicDisplay {
    public KitchenOvenDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
        super(inputs, outputs);
    }

    public KitchenOvenDisplay(KitchenOvenRecipe recipe) {
        super(getInputList(recipe), List.of(EntryIngredient.of(EntryStacks.of(recipe.getOutput(null)))));
    }

    private static List<EntryIngredient> getInputList(KitchenOvenRecipe recipe) {
        if(recipe == null) return Collections.emptyList();
        List<EntryIngredient> list = new ArrayList<>();
        list.add(EntryIngredients.ofIngredient(recipe.getIngredients().get(0)));
        return list;
    }


    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return KitchenOvenCategory.KITCHENOVEN;
    }
}
