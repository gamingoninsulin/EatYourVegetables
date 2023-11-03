package me.gamingoninsulin.eatyourvegtablesboymod.world.tree.custom;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import me.gamingoninsulin.eatyourvegtablesboymod.world.tree.ModTrunkPlacerTypes;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class PinewoodTrunkPlacer extends TrunkPlacer {
    public static final Codec<PinewoodTrunkPlacer> CODEC = RecordCodecBuilder.create(driftwoodTrunkPlacerInstance ->
            fillTrunkPlacerFields(driftwoodTrunkPlacerInstance).apply(driftwoodTrunkPlacerInstance, PinewoodTrunkPlacer::new));

    public PinewoodTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return ModTrunkPlacerTypes.PINEWOOD_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random,
                                                 int height, BlockPos startPos, TreeFeatureConfig config) {
        setToDirt(world, replacer, random, startPos.down(), config);
        List<FoliagePlacer.TreeNode> list = Lists.newArrayList();
        Direction direction = Direction.Type.HORIZONTAL.random(random);
        int i = height - random.nextInt(4) - 1;
        int j = 3 - random.nextInt(3);
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int k = startPos.getX();
        int l = startPos.getZ();
        OptionalInt optionalInt = OptionalInt.empty();

        int n;
        for(int m = 0; m < height; ++m) {
            n = startPos.getY() + m;
            if (m >= i && j > 0) {
                k += direction.getOffsetX();
                l += direction.getOffsetZ();
                --j;
            }

            if (this.getAndSetState(world, replacer, random, mutable.set(k, n, l), config)) {
                optionalInt = OptionalInt.of(n + 1);
            }
        }

        if (optionalInt.isPresent()) {
            list.add(new FoliagePlacer.TreeNode(new BlockPos(k, optionalInt.getAsInt(), l), 1, false));
        }

        k = startPos.getX();
        l = startPos.getZ();
        Direction direction2 = Direction.Type.HORIZONTAL.random(random);
        if (direction2 != direction) {
            n = i - random.nextInt(2) - 1;
            int o = 1 + random.nextInt(3);
            optionalInt = OptionalInt.empty();

            for(int p = n; p < height && o > 0; --o) {
                if (p >= 1) {
                    int q = startPos.getY() + p;
                    k += direction2.getOffsetX();
                    l += direction2.getOffsetZ();
                    if (this.getAndSetState(world, replacer, random, mutable.set(k, q, l), config)) {
                        optionalInt = OptionalInt.of(q + 1);
                    }
                }

                ++p;
            }

            if (optionalInt.isPresent()) {
                list.add(new FoliagePlacer.TreeNode(new BlockPos(k, optionalInt.getAsInt(), l), 0, false));
            }
        }

        return list;
    }
}