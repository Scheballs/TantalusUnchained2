package hamdev.tantalusunchained.common.world;

import hamdev.tantalusunchained.common.block.TUChainBlocks;
import net.minecraft.block.Block;

public enum OreType
{
    /*
    public static final ConfiguredFeature<?, ?>
    ORE_LAPIS = register("ore_lapis",Feature.ORE.withConfiguration(
    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD
    , Features.States.LAPIS_ORE, 7)).withPlacement(
    Placement.DEPTH_AVERAGE.configure(new DepthAverageConfig(16, 16))).square());
    */
    ORE_TANTALITE(TUChainBlocks.TANTALITE_STONE.get(),33,1,250),
    ORE_TANTALUM(TUChainBlocks.TANTALUM_ORE.get(), 7, 1, 24);

    private final Block block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Block block, int maxVeinSize, int minHeight, int maxHeight)
    {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }


    public Block getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if (block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
