package hamdev.tantalusunchained.datagen;

import hamdev.tantalusunchained.common.TantalusUnchained;
import hamdev.tantalusunchained.common.block.TUChainBlocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TUChainBlockStateProvider extends BlockStateProvider {

    public TUChainBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TantalusUnchained.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(TUChainBlocks.TANTALUM_ORE.get());
        simpleBlock(TUChainBlocks.TANTALUM_BLOCK.get());

        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER1.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER2.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER3.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER4.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER5.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER6.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER7.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER8.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER9.get());
        simpleBlock(TUChainBlocks.MACHINE_BLOCK_TIER10.get());

        simpleBlock(TUChainBlocks.TANTALITE_COBBLESTONE.get());
        simpleBlock(TUChainBlocks.TANTALITE_STONE.get());
        simpleBlock(TUChainBlocks.TANTALITE_SMOOTH_STONE.get());
        simpleBlock(TUChainBlocks.TANTALITE_BRICKS.get());

        logBlock(TUChainBlocks.TANTALIZING_STRIPPED_LOG.get());
        simpleBlock(TUChainBlocks.TANTALIZING_PLANKS.get());
        logBlock(TUChainBlocks.TANTALIZING_LOG.get());
        simpleBlock(TUChainBlocks.TANTALIZING_WOOD.get());
        simpleBlock(TUChainBlocks.TANTALIZING_LEAVES.get());
        simpleBlock(TUChainBlocks.TANTALIZING_SAPLING.get());

        simpleBlock(TUChainBlocks.TANTALUM_STAIRS.get());
        simpleBlock(TUChainBlocks.TANTALUM_SLAB.get());
        simpleBlock(TUChainBlocks.TANTALUM_FENCE.get());
        simpleBlock(TUChainBlocks.TANTALUM_FENCE_GATE.get());
        simpleBlock(TUChainBlocks.TANTALUM_WALL.get());

        simpleBlock(TUChainBlocks.TANTALITE_STAIRS.get());
        simpleBlock(TUChainBlocks.TANTALITE_SLAB.get());
        simpleBlock(TUChainBlocks.TANTALITE_FENCE.get());
        simpleBlock(TUChainBlocks.TANTALITE_FENCE_GATE.get());
        simpleBlock(TUChainBlocks.TANTALITE_WALL.get());

        simpleBlock(TUChainBlocks.TANTALIZING_STAIRS.get());
        simpleBlock(TUChainBlocks.TANTALIZING_SLAB.get());
        simpleBlock(TUChainBlocks.TANTALIZING_FENCE.get());
        simpleBlock(TUChainBlocks.TANTALIZING_FENCE_GATE.get());
        simpleBlock(TUChainBlocks.TANTALIZING_WALL.get());
    }
}
