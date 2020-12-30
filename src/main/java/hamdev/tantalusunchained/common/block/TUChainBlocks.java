package hamdev.tantalusunchained.common.block;

import hamdev.tantalusunchained.common.TantalusUnchained;
import hamdev.tantalusunchained.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class TUChainBlocks {

    //Ore Blocks
    public static final RegistryObject<Block> ORE_TANTALUM        = register( "ore_tantalum"       ,() -> new OreBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.0F, 3.0F)));
    //Storage Blocks
    public static final RegistryObject<Block> BLOCK_TANTALUM      = register( "block_tantalum"     ,() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 5f, 10f).sound(SoundType.METAL)));
   //Machine Blocks
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER1 = register( "machine_block_tier1",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER2 = register( "machine_block_tier2",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER3 = register( "machine_block_tier3",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER4 = register( "machine_block_tier4",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER5 = register( "machine_block_tier5",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER6 = register( "machine_block_tier6",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER7 = register( "machine_block_tier7",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER8 = register( "machine_block_tier8",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER9 = register( "machine_block_tier9",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MACHINE_BLOCK_TIER10 = register( "machine_block_tier10",() -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance( 3f, 10f).sound(SoundType.METAL)));

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

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)) );
        return toReturn;
    }
}
