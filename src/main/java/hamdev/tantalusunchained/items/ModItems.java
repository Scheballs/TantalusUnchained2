package hamdev.tantalusunchained.items;

import hamdev.tantalusunchained.TantalusUnchained;
import hamdev.tantalusunchained.util.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    //Complex Items
    public static final RegistryObject<ItemOmniTool>           OMNI_TOOL                 = Registration.ITEMS.register("omni_tool"                ,()-> new ItemOmniTool());
    public static final RegistryObject<ItemResourceScanReport> ITEM_RESOURCE_SCAN_REPORT = Registration.ITEMS.register("item_resource_scan_report",()-> new ItemResourceScanReport());

    //Simple Items
    public static final RegistryObject<Item> INGOT_TANTALUM  = Registration.ITEMS.register("ingot_tantalum" , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> DUST_TANTALUM   = Registration.ITEMS.register("dust_tantalum"  , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> NUGGET_TANTALUM = Registration.ITEMS.register("nugget_tantalum", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    //Tier 1 Raw Resources
    public static final RegistryObject<Item> T1_ATMOSPHERIC_GAS    = Registration.ITEMS.register("t1_atmospheric_gas"   , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_CRYSTALLINE_SOLIDS = Registration.ITEMS.register("t1_crystalline_solids", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_HARD_WATER         = Registration.ITEMS.register("t1_hard_water"        , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_IONIC_SOLUTIONS    = Registration.ITEMS.register("t1_ionic_solutions"   , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_LIQUID_HOT_MAGMA   = Registration.ITEMS.register("t1_liquid_hot_magma"  , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_SUSPENDED_PLASMA   = Registration.ITEMS.register("t1_suspended_plasma"  , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_UNSTABLE_GAS       = Registration.ITEMS.register("t1_unstable_gas"      , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));


    public static void register() { }
}
