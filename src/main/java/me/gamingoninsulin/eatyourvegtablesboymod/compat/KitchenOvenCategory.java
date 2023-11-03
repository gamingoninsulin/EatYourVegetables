package me.gamingoninsulin.eatyourvegtablesboymod.compat;

import me.gamingoninsulin.eatyourvegtablesboymod.blocks.ModBlocks;
import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.LinkedList;
import java.util.List;

public class KitchenOvenCategory implements DisplayCategory<BasicDisplay> {

    public static final Identifier TEXTURE =
            new Identifier(Reference.MOD_ID, "textures/gui/cooking_baking_station_gui.png");
    public static final CategoryIdentifier<KitchenOvenDisplay> KITCHENOVEN =
            CategoryIdentifier.of(Reference.MOD_ID,"kitchen_oven");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return KITCHENOVEN;
    }

    @Override
    public Text getTitle() {
        return Text.literal("Cooking & Baking Station");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.KITCHEN_OVEN_ON.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() -87, bounds.getY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE,
                new Rectangle(startPoint.x, startPoint.y, 175,82)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 9, startPoint.y + 25))
                .entries(display.getInputEntries().get(0))); // input

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 73, startPoint.y + 59))
                .markOutput().entries(display.getOutputEntries().get(0))); // output

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90; // window size
    }
}
