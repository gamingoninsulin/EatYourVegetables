package me.gamingoninsulin.common.compat.rei;

//import me.shedaniel.math.Point;
//import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
//import me.shedaniel.rei.api.client.gui.widgets.Widget;
//import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
//import net.minecraft.util.Identifier;

//import java.util.LinkedList;
//import java.util.List;

//import static me.gamingoninsulin.core.Reference.*;
import static me.gamingoninsulin.common.blocks.ModBlocks.*;
import static me.gamingoninsulin.common.items.ModItems.*;

// Done with the help:
// https://github.com/TeamGalacticraft/Galacticraft/tree/main (MIT License)
public class GemEmpoweringCategory implements DisplayCategory<BasicDisplay> {
//    public static final Identifier TEXTURE =
//            new Identifier(MOD_ID, "textures/gui/gem_empowering_station_gui.png");
//    public static final CategoryIdentifier<GemEmpoweringDisplay> GEM_EMPOWERING =
//            CategoryIdentifier.of(MOD_ID, "gem_empowering");
//
    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {

        return null; //RAW_PINK_GARNET_BLOCK;
    }

    @Override
    public Text getTitle() {
        return Text.literal("Gem Empowering Station");
    }

   @Override
   public Renderer getIcon() {
        return null; //EntryStacks.of(RAW_PINK_GARNET_BLOCK.asItem().getDefaultStack());
    }
//
//    @Override
//    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
//        Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
//        List<Widget> widgets = new LinkedList<>();
//        widgets.add(Widgets.createTexturedWidget(TEXTURE,
//                new Rectangle(startPoint.x, startPoint.y, 175, 82)));
//
//        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 11))
//                .entries(display.getInputEntries().get(0)));
//
//        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 59))
//                .markOutput().entries(display.getOutputEntries().get(0)));
//
//        return widgets;
//    }
//
//    @Override
//    public int getDisplayHeight() {
//        return 90;
//    }
}