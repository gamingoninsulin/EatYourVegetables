package me.gamingoninsulin.eatyourvegtablesboymod.world.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import me.gamingoninsulin.eatyourvegtablesboymod.world.tree.ModFoliagePlacerTypes;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class PinewoodFoliagePlacer extends FoliagePlacer {

    public static final Codec<PinewoodFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> fillFoliagePlacerFields(instance)
            .and(Codec.intRange(0, 12).fieldOf("height").forGetter((placer) -> placer.height)).apply(instance, PinewoodFoliagePlacer::new));
    private final int height;

    public PinewoodFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.PINEWOOD_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        int i = 0;

        for(int j = offset; j >= offset - foliageHeight; --j) {
            this.generateSquare(world, placer, random, config, treeNode.getCenter(), i, j, treeNode.isGiantTrunk());
            if (i >= 1 && j == offset - foliageHeight + 1) {
                --i;
            } else if (i < radius + treeNode.getFoliageRadius()) {
                ++i;
            }
        }
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
