package hamdev.tantalusunchained.common.block;

import hamdev.tantalusunchained.common.TantalusUnchained;
import hamdev.tantalusunchained.common.items.TUChainItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.Tree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class TUChainBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, TantalusUnchained.MOD_ID);

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = TUChainBlocks.BLOCKS.register(name, block);
        TUChainItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)) );
        return toReturn;
    }
    public static final RegistryObject<OreBlock> TANTALUM_ORE = register( "tantalum_ore",() -> new OreBlock(AbstractBlock.Properties.from(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> TANTALUM_BLOCK = register( "tantalum_block",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> TANTALUM_TANK = register( "tantalum_tank",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> TANTALITE_COBBLESTONE = register( "tantalite_cobblestone",() -> new Block(AbstractBlock.Properties.from(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> TANTALITE_STONE = register( "tantalite_stone",() -> new Block(AbstractBlock.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Block> TANTALITE_STONE_BRICKS = register( "tantalite_stone_bricks",() -> new Block(AbstractBlock.Properties.from(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> TANTALITE_SMOOTH_STONE = register( "tantalite_smooth_stone",() -> new Block(AbstractBlock.Properties.from(Blocks.SMOOTH_STONE)));
    public static final RegistryObject<Block> TANTALITE_BRICKS = register( "tantalite_bricks",() -> new Block(AbstractBlock.Properties.from(Blocks.BRICKS)));

    public static final RegistryObject<Block> TANTALIZING_PLANKS = register( "tantalizing_planks",() -> new Block(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<RotatedPillarBlock> TANTALIZING_LOG = register( "tantalizing_log",() -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> TANTALIZING_WOOD = register( "tantalizing_wood",() -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_WOOD)));
    public static final RegistryObject<LeavesBlock> TANTALIZING_LEAVES = register( "tantalizing_leaves",() -> new LeavesBlock(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> TANTALIZING_SAPLING = register( "tantalizing_sapling",() -> new TantalizingSapling(TantalizingTree::new, AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<RotatedPillarBlock> TANTALIZING_STRIPPED_LOG = register( "tantalizing_stripped_log",() -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<StairsBlock> TANTALUM_STAIRS = register( "tantalum_stairs",() -> new StairsBlock(() -> TUChainBlocks.TANTALUM_BLOCK.get().getDefaultState(),AbstractBlock.Properties.from(TUChainBlocks.TANTALUM_BLOCK.get())));
    public static final RegistryObject<SlabBlock> TANTALUM_SLAB = register( "tantalum_slab",() -> new SlabBlock(AbstractBlock.Properties.from(Blocks.SMOOTH_QUARTZ_SLAB)));
    public static final RegistryObject<FenceBlock> TANTALUM_FENCE = register( "tantalum_fence",() -> new FenceBlock(AbstractBlock.Properties.from(Blocks.NETHER_BRICK_FENCE)));
    public static final RegistryObject<FenceGateBlock> TANTALUM_FENCE_GATE = register( "tantalum_fence_gate",() -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.CRIMSON_FENCE_GATE)));
    public static final RegistryObject<WallBlock> TANTALUM_WALL = register( "tantalum_wall",() -> new WallBlock(AbstractBlock.Properties.from(Blocks.NETHER_BRICK_WALL)));

    public static final RegistryObject<StairsBlock> TANTALITE_STAIRS = register( "tantalite_stairs",() -> new StairsBlock(() -> TUChainBlocks.TANTALITE_STONE.get().getDefaultState(),AbstractBlock.Properties.from(TUChainBlocks.TANTALITE_STONE.get())));
    public static final RegistryObject<SlabBlock> TANTALITE_SLAB = register( "tantalite_slab",() -> new SlabBlock(AbstractBlock.Properties.from(Blocks.STONE_SLAB)));
    public static final RegistryObject<FenceBlock> TANTALITE_FENCE = register( "tantalite_fence",() -> new FenceBlock(AbstractBlock.Properties.from(Blocks.NETHER_BRICK_FENCE)));
    public static final RegistryObject<FenceGateBlock> TANTALITE_FENCE_GATE = register( "tantalite_fence_gate",() -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.CRIMSON_FENCE_GATE)));
    public static final RegistryObject<WallBlock> TANTALITE_WALL = register( "tantalite_wall",() -> new WallBlock(AbstractBlock.Properties.from(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<StairsBlock> TANTALIZING_STAIRS = register( "tantalizing_stairs",() -> new StairsBlock(() -> TUChainBlocks.TANTALIZING_PLANKS.get().getDefaultState(),AbstractBlock.Properties.from(TUChainBlocks.TANTALIZING_PLANKS.get())));
    public static final RegistryObject<SlabBlock> TANTALIZING_SLAB = register( "tantalizing_slab",() -> new SlabBlock(AbstractBlock.Properties.from(Blocks.OAK_SLAB)));
    public static final RegistryObject<FenceBlock> TANTALIZING_FENCE = register( "tantalizing_fence",() -> new FenceBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE)));
    public static final RegistryObject<FenceGateBlock> TANTALIZING_FENCE_GATE = register( "tantalizing_fence_gate",() -> new FenceGateBlock(AbstractBlock.Properties.from(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<WallBlock> TANTALIZING_WALL = register( "tantalizing_wall",() -> new WallBlock(AbstractBlock.Properties.from(Blocks.SANDSTONE_WALL)));

    public static final RegistryObject<Block> MACHINE_BLOCK_TIER1 = register( "machine_block_tier1",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER2 = register( "machine_block_tier2",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER3 = register( "machine_block_tier3",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER4 = register( "machine_block_tier4",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER5 = register( "machine_block_tier5",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER6 = register( "machine_block_tier6",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER7 = register( "machine_block_tier7",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER8 = register( "machine_block_tier8",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER9 = register( "machine_block_tier9",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER10 = register( "machine_block_tier10",() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_BLOCK)));

    /*
Resource Harvester
Omnibus Dongle
Storage Silo
Command and Control Center
 - Microwave Solar Power Plant
 - AI Compute Node
Space Elevator
Resource Processing Factory
Processing Refinement Factory
Refinement Specialization Factory
Advanced Component Factory
 */
    public static void register() { }

}
