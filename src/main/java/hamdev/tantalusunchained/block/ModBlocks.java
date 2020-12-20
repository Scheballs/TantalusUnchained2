package hamdev.tantalusunchained.block;

import hamdev.tantalusunchained.TantalusUnchained;
import hamdev.tantalusunchained.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final RegistryObject<Block> BLOCK_TANTALUM = register( "block_tantalum",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance( 3f, 10f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> ORE_TANTALUM = register( "ore_tantalum",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance( 3f, 10f)
                    .sound(SoundType.STONE)));

    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)) );
        return toReturn;
    }
}
