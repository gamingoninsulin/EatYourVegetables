package me.gamingoninsulin.common.food;


import net.minecraft.item.FoodComponent;

public class ModFoodComponent {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();

    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent COOKED_CAULIFLOWER = new FoodComponent.Builder().hunger(8).saturationModifier(0.12f).build();

}
