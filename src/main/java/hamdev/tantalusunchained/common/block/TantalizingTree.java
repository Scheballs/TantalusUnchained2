package hamdev.tantalusunchained.common.block;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import javax.annotation.Nullable;
import java.util.Random;

public class TantalizingTree extends Tree {
    private static final int BASE_HEIGHT = 5;
    private static final int FIRST_RANDOM_HEIGHT = 3;
    private static final int SECOND_RANDOM_HEIGHT = 9;

    private static final int LEAVE_RADIUS = 4;
    private static final int LEAVE_OFFSET = 4;
    private static final int LEAVE_HEIGHT = 5;

    public static final BaseTreeFeatureConfig TANTALIZING_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(TUChainBlocks.TANTALIZING_LOG.get().getDefaultState()),
            new SimpleBlockStateProvider(TUChainBlocks.TANTALIZING_LEAVES.get().getDefaultState()),
            new BlobFoliagePlacer(FeatureSpread.func_242252_a(LEAVE_RADIUS),
                    FeatureSpread.func_242252_a(LEAVE_OFFSET), LEAVE_HEIGHT),
            new StraightTrunkPlacer(BASE_HEIGHT, FIRST_RANDOM_HEIGHT, SECOND_RANDOM_HEIGHT),
            new TwoLayerFeature(1, 0, 1)
    )).build();

    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean largeHive)
    {
        return Feature.TREE.withConfiguration(TANTALIZING_TREE_CONFIG);
    }
}
