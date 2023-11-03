package me.gamingoninsulin.eatyourvegtablesboymod.food;


import net.minecraft.item.FoodComponent;

public class ModFoodComponent {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent RICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent EGGPLANT = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent AVOCADO = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent SEA_PICKLE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent COOKED_CAULIFLOWER = new FoodComponent.Builder().hunger(8).saturationModifier(0.12f).build();

    public static final FoodComponent SALT_ITEM = new FoodComponent.Builder().hunger(-5).saturationModifier(-0.4F).build();

    public static final FoodComponent WHEEL_OF_CHEESE = new FoodComponent.Builder().hunger(10).saturationModifier(0.16f).build();

}
