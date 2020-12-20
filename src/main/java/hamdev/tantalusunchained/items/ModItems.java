package hamdev.tantalusunchained.items;

import hamdev.tantalusunchained.TantalusUnchained;
import hamdev.tantalusunchained.util.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    //Simple Items
    public static final RegistryObject<Item> INGOT_TANTALUM =
            Registration.ITEMS.register("ingot_tantalum",
                    ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> DUST_TANTALUM =
            Registration.ITEMS.register("dust_tantalum",
                    ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> NUGGET_TANTALUM =
            Registration.ITEMS.register("nugget_tantalum",
                    ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    //Complex Items
    public static final RegistryObject<ItemOmniTool> OMNI_TOOL =
            Registration.ITEMS.register("omni_tool",
                    ()-> new ItemOmniTool());

    public static void register() { }
}
