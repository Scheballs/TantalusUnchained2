package hamdev.tantalusunchained.common.items;

import hamdev.tantalusunchained.common.TantalusUnchained;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TUChainItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TantalusUnchained.MOD_ID);
    public static final RegistryObject<ItemOmniTool> OMNI_TOOL = TUChainItems.ITEMS.register("omni_tool" , ItemOmniTool::new);
    public static final RegistryObject<Item> RESOURCE_SCAN_REPORT_BLANK = TUChainItems.ITEMS.register("resource_scan_report_blank", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> RESOURCE_SCAN_REPORT = TUChainItems.ITEMS.register("resource_scan_report", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> TANTALUM = TUChainItems.ITEMS.register("tantalum", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> TANTALUM_INGOT = TUChainItems.ITEMS.register("tantalum_ingot", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> TANTALUM_NUGGET = TUChainItems.ITEMS.register("tantalum_nugget", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T1_AUTOTROPHS = TUChainItems.ITEMS.register("t1_autotrophs", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_COMPLEX_LIFEFORMS = TUChainItems.ITEMS.register("t1_complex_lifeforms", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_HARD_WATER = TUChainItems.ITEMS.register("t1_hard_water", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_MICROBES = TUChainItems.ITEMS.register("t1_microbes", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_ORGANIC_COMPOUNDS = TUChainItems.ITEMS.register("t1_organic_compounds", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_PHYTOPLANKTON = TUChainItems.ITEMS.register("t1_phytoplankton", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T1_BASE_METALS = TUChainItems.ITEMS.register("t1_base_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_CRYSTALLINE_SOLIDS = TUChainItems.ITEMS.register("t1_crystalline_solids", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_HEAVY_METALS = TUChainItems.ITEMS.register("t1_heavy_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_IONIC_SOLUTIONS = TUChainItems.ITEMS.register("t1_ionic_solutions", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_LIQUID_HOT_MAGMA = TUChainItems.ITEMS.register("t1_liquid_hot_magma", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T1_ATMOSPHERIC_GAS = TUChainItems.ITEMS.register("t1_atmospheric_gas", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_RARE_METALS = TUChainItems.ITEMS.register("t1_rare_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_SUSPENDED_PLASMA = TUChainItems.ITEMS.register("t1_suspended_plasma", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_UNSTABLE_GAS = TUChainItems.ITEMS.register("t1_unstable_gas", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T2_BACTERIA = TUChainItems.ITEMS.register("t2_bacteria", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_BIOFUELS = TUChainItems.ITEMS.register("t2_biofuels", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_BIOMASS = TUChainItems.ITEMS.register("t2_biomass", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_INDUSTRIAL_FIBERS = TUChainItems.ITEMS.register("t2_industrial_fibers", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_PROCESSED_WATER = TUChainItems.ITEMS.register("t2_processed_water", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_PROTEINS = TUChainItems.ITEMS.register("t2_proteins", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T2_CHIRAL_STRUCTURES = TUChainItems.ITEMS.register("t2_chiral_structures", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_PRECIOUS_METALS = TUChainItems.ITEMS.register("t2_precious_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_REACTIVE_METALS = TUChainItems.ITEMS.register("t2_reactive_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_SILICA = TUChainItems.ITEMS.register("t2_silica", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_TOXIC_METALS = TUChainItems.ITEMS.register("t2_toxic_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T2_ELECTROLYTES = TUChainItems.ITEMS.register("t2_electrolytes", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_OXIDIZING_COMPOUND = TUChainItems.ITEMS.register("t2_oxidizing_compound", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_OXYGEN = TUChainItems.ITEMS.register("t2_oxygen", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_PLASMOIDS = TUChainItems.ITEMS.register("t2_plasmoids", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T3_BIOCELLS = TUChainItems.ITEMS.register("t3_biocells", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_CONSTRUCTION_BLOCKS = TUChainItems.ITEMS.register("t3_construction_blocks", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_CONSUMER_ELECTRONICS = TUChainItems.ITEMS.register("t3_consumer_electronics", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_COOLANT = TUChainItems.ITEMS.register("t3_coolant", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_ENRICHED_URANIUM = TUChainItems.ITEMS.register("t3_enriched_uranium", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_FERTILIZER = TUChainItems.ITEMS.register("t3_fertilizer", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_GENETICALLY_ENHANCED_LIVESTOCK = TUChainItems.ITEMS.register("t3_genetically_enhanced_livestock", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_SILICATE_GLASS = TUChainItems.ITEMS.register("t3_silicate_glass", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_SUPERTENSILE_PLASTICS = TUChainItems.ITEMS.register("t3_supertensile_plastics", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_POLYTEXTILES = TUChainItems.ITEMS.register("t3_polytextiles", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_LIVESTOCK = TUChainItems.ITEMS.register("t3_livestock", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_MECHANICAL_PARTS = TUChainItems.ITEMS.register("t3_mechanical_parts", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_MICROFIBER_SHIELDING = TUChainItems.ITEMS.register("t3_microfiber_shielding", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_MINIATURE_ELECTRONICS = TUChainItems.ITEMS.register("t3_miniature_electronics", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_NANITES = TUChainItems.ITEMS.register("t3_nanites", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_SUPERCONDUCTORS = TUChainItems.ITEMS.register("t3_superconductors", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_OXIDES = TUChainItems.ITEMS.register("t3_oxides", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_POLYARAMIDS = TUChainItems.ITEMS.register("t3_polyaramids", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_ROCKET_FUEL = TUChainItems.ITEMS.register("t3_rocket_fuel", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_SYNTHETIC_OIL = TUChainItems.ITEMS.register("t3_synthetic_oil", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_TEST_CULTURES = TUChainItems.ITEMS.register("t3_test_cultures", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_TRANSMITTER = TUChainItems.ITEMS.register("t3_transmitter", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_VIRAL_AGENT = TUChainItems.ITEMS.register("t3_viral_agent", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_WATER_COOLED_CPU = TUChainItems.ITEMS.register("t3_water_cooled_cpu", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T4_CONDENSATES = TUChainItems.ITEMS.register("t4_condensates", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_CRYOPROTECTANT_SOLUTION = TUChainItems.ITEMS.register("t4_cryoprotectant_solution", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_GEL_MATRIX_BIOPASTE = TUChainItems.ITEMS.register("t4_gel_matrix_biopaste", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_GUIDANCE_SYSTEMS = TUChainItems.ITEMS.register("t4_guidance_systems", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_HIGH_TECH_TRANSMITTERS = TUChainItems.ITEMS.register("t4_high_tech_transmitters", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_INDUSTRIAL_EXPLOSIVES = TUChainItems.ITEMS.register("t4_industrial_explosives", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_HERMETIC_MEMBRANES = TUChainItems.ITEMS.register("t4_hermetic_membranes", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_DATA_CHIPS = TUChainItems.ITEMS.register("t4_data_chips", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_CAMERA_DRONES = TUChainItems.ITEMS.register("t4_camera_drones", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_BIOTECH_RESEARCH_REPORTS = TUChainItems.ITEMS.register("t4_biotech_research_reports", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_SMARTFAB_UNITS = TUChainItems.ITEMS.register("t4_smartfab_units", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_TRANSCRANIAL_MICROCONTROLLERS = TUChainItems.ITEMS.register("t4_transcranial_microcontrollers", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_NUCLEAR_REACTORS = TUChainItems.ITEMS.register("t4_nuclear_reactors", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_PLANETARY_VEHICLES = TUChainItems.ITEMS.register("t4_planetary_vehicles", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_ROBOTICS = TUChainItems.ITEMS.register("t4_robotics", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_SUPERCOMPUTERS = TUChainItems.ITEMS.register("t4_supercomputers", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_UKOMI_SUPERCONDUCTORS = TUChainItems.ITEMS.register("t4_ukomi_superconductors", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_SYNTHETIC_SYNAPSES = TUChainItems.ITEMS.register("t4_synthetic_synapses", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_HAZMAT_DETECTION_SYSTEMS = TUChainItems.ITEMS.register("t4_hazmat_detection_systems", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_NEOCOMS = TUChainItems.ITEMS.register("t4_neocoms", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_VACCINES = TUChainItems.ITEMS.register("t4_vaccines", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    public static final RegistryObject<Item> T5_SELF_HARMONIZING_POWER_CORE = TUChainItems.ITEMS.register("t5_self_harmonizing_power_core", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_RECURSIVE_COMPUTING_MODULE = TUChainItems.ITEMS.register("t5_recursive_computing_module", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_BROADCAST_NODE = TUChainItems.ITEMS.register("t5_broadcast_node", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_INTEGRITY_RESPONSE_DRONES = TUChainItems.ITEMS.register("t5_integrity_response_drones", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_ORGANIC_MORTAR_APPLICATORS = TUChainItems.ITEMS.register("t5_organic_mortar_applicators", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_NANO_FACTORY = TUChainItems.ITEMS.register("t5_nano_factory", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_WETWARE_MAINFRAME = TUChainItems.ITEMS.register("t5_wetware_mainframe", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_STERILE_CONDUITS = TUChainItems.ITEMS.register("t5_sterile_conduits", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static void register() { }
}
