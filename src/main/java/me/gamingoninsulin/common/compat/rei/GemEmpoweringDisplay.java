package me.gamingoninsulin.common.compat.rei;

//import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;

import java.util.List;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class GemEmpoweringDisplay extends BasicDisplay {
//    public GemEmpoweringDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
//        super(inputs, outputs);
//    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return null;
    }
    public GemEmpoweringDisplay(List<EntryIngredient> inputs, List<EntryIngredient> outputs) {
        super(inputs, outputs);
   }
//
//    public GemEmpoweringDisplay(GemEmpoweringRecipe recipe) {
//        super(getInputList(recipe), List.of(EntryIngredient.of(EntryStacks.of(recipe.getOutput(null)))));
//    }
//
//    private static List<EntryIngredient> getInputList(GemEmpoweringRecipe recipe) {
//        if (recipe == null) return Collections.emptyList();
//        List<EntryIngredient> list = new ArrayList<>();
//        list.add(EntryIngredients.ofIngredient(recipe.getIngredients().get(0)));
//        return list;
//    }
//
//    @Override
//    public CategoryIdentifier<?> getCategoryIdentifier() {
//        return GemEmpoweringCategory.GEM_EMPOWERING;
//    }
}