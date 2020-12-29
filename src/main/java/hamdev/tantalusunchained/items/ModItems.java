package hamdev.tantalusunchained.items;

import hamdev.tantalusunchained.TantalusUnchained;
import hamdev.tantalusunchained.util.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    //Complex Items
    public static final RegistryObject<ItemOmniTool>           OMNI_TOOL                       = Registration.ITEMS.register("omni_tool"                      , ItemOmniTool::new);
    public static final RegistryObject<ItemResourceScanReport> ITEM_RESOURCE_SCAN_REPORT       = Registration.ITEMS.register("item_resource_scan_report"      , ItemResourceScanReport::new);
    public static final RegistryObject<ItemResourceScanReport> ITEM_RESOURCE_SCAN_REPORT_BLANK = Registration.ITEMS.register("item_resource_scan_report_blank", ItemResourceScanReport::new);

    //Simple Items
    public static final RegistryObject<Item> INGOT_TANTALUM  = Registration.ITEMS.register("ingot_tantalum" , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> DUST_TANTALUM   = Registration.ITEMS.register("dust_tantalum"  , ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> NUGGET_TANTALUM = Registration.ITEMS.register("nugget_tantalum", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    //Tier 1 Overworld Raw Resources
    public static final RegistryObject<Item> T1_AUTOTROPHS = Registration.ITEMS.register("t1_autotrophs", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_COMPLEX_LIFEFORMS = Registration.ITEMS.register("t1_complex_lifeforms", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_HARD_WATER = Registration.ITEMS.register("t1_hard_water", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_MICROBES = Registration.ITEMS.register("t1_microbes", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_ORGANIC_COMPOUNDS = Registration.ITEMS.register("t1_organic_compounds", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_PHYTOPLANKTON = Registration.ITEMS.register("t1_phytoplankton", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    //Tier 1 The Nether Raw Resources
    public static final RegistryObject<Item> T1_BASE_METALS = Registration.ITEMS.register("t1_base_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_CRYSTALLINE_SOLIDS = Registration.ITEMS.register("t1_crystalline_solids", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_HEAVY_METALS = Registration.ITEMS.register("t1_heavy_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_IONIC_SOLUTIONS = Registration.ITEMS.register("t1_ionic_solutions", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_LIQUID_HOT_MAGMA = Registration.ITEMS.register("t1_liquid_hot_magma", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    //Tier 1 The End Raw Resources
    public static final RegistryObject<Item> T1_ATMOSPHERIC_GAS = Registration.ITEMS.register("t1_atmospheric_gas", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_RARE_METALS = Registration.ITEMS.register("t1_rare_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_SUSPENDED_PLASMA = Registration.ITEMS.register("t1_suspended_plasma", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T1_UNSTABLE_GAS = Registration.ITEMS.register("t1_unstable_gas", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    //Tier 2 Overworld Processed Resources
    public static final RegistryObject<Item> T2_BACTERIA = Registration.ITEMS.register("t2_bacteria", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_BIOFUELS = Registration.ITEMS.register("t2_biofuels", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_BIOMASS = Registration.ITEMS.register("t2_biomass", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_CELLULOSE_FIBRES = Registration.ITEMS.register("t2_cellulose_fibres", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_PROCESSED_WATER = Registration.ITEMS.register("t2_processed_water", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_PROTEINS = Registration.ITEMS.register("t2_proteins", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    //Tier 2 The Nether Processed Resources
    public static final RegistryObject<Item> T2_CHIRAL_STRUCTURES = Registration.ITEMS.register("t2_chiral_structures", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_PRECIOUS_METALS = Registration.ITEMS.register("t2_precious_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_REACTIVE_METALS = Registration.ITEMS.register("t2_reactive_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_SILICA = Registration.ITEMS.register("t2_silica", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_TOXIC_METALS = Registration.ITEMS.register("t2_toxic_metals", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    //Tier 2 The End Processed Resources
    public static final RegistryObject<Item> T2_ELECTROLYTES = Registration.ITEMS.register("t2_electrolytes", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_OXIDIZING_AGENT = Registration.ITEMS.register("t2_oxidizing_agent", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_OXYGEN = Registration.ITEMS.register("t2_oxygen", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T2_PLASMOIDS = Registration.ITEMS.register("t2_plasmoids", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    //Tier 3 Refined Commodity
    public static final RegistryObject<Item> T3_BIOCELLS = Registration.ITEMS.register("t3_biocells", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_CONSTRUCTION_BLOCKS = Registration.ITEMS.register("t3_construction_blocks", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_CONSUMER_ELECTRONICS = Registration.ITEMS.register("t3_consumer_electronics", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_COOLANT = Registration.ITEMS.register("t3_coolant", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_ENRICHED_URANIUM = Registration.ITEMS.register("t3_enriched_uranium", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_FERTILIZER = Registration.ITEMS.register("t3_fertilizer", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_GENETICALLY_MODIFIED_LIVESTOCK = Registration.ITEMS.register("t3_genetically_modified_livestock", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_GORILLA_GLASS = Registration.ITEMS.register("t3_gorilla_glass", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_HIGH_STRENGTH_BIOPLASTICS = Registration.ITEMS.register("t3_high_strength_bioplastics", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_HIGH_STRENGTH_TEXTILES = Registration.ITEMS.register("t3_high_strength_textiles", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_LIVESTOCK = Registration.ITEMS.register("t3_livestock", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_MECHANICAL_PARTS = Registration.ITEMS.register("t3_mechanical_parts", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_MICROFIBER_SHIELDING = Registration.ITEMS.register("t3_microfiber_shielding", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_MINIATURE_ELECTRONICS = Registration.ITEMS.register("t3_miniature_electronics", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_NANITES = Registration.ITEMS.register("t3_nanites", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_NATURAL_SUPERCONDUCTORS = Registration.ITEMS.register("t3_natural_superconductors", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_OXIDES = Registration.ITEMS.register("t3_oxides", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_POLYARAMIDS = Registration.ITEMS.register("t3_polyaramids", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_ROCKET_FUEL = Registration.ITEMS.register("t3_rocket_fuel", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_SYNTHETIC_OIL = Registration.ITEMS.register("t3_synthetic_oil", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_TEST_CULTURES = Registration.ITEMS.register("t3_test_cultures", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_TRANSMITTER = Registration.ITEMS.register("t3_transmitter", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_VIRAL_AGENT = Registration.ITEMS.register("t3_viral_agent", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T3_WATER_COOLED_CPU = Registration.ITEMS.register("t3_water_cooled_cpu", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    //Tier 4 Specialized Component
    public static final RegistryObject<Item> T4_CONDENSATES = Registration.ITEMS.register("t4_condensates", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_CRYOPROTECTANT_SOLUTION = Registration.ITEMS.register("t4_cryoprotectant_solution", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_CYBERNETIC_BIO_GEL = Registration.ITEMS.register("t4_cybernetic_bio_gel", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_GUIDANCE_SYSTEMS = Registration.ITEMS.register("t4_guidance_systems", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_HIGH_TECH_TRANSMITTERS = Registration.ITEMS.register("t4_high-tech_transmitters", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_INDUSTRIAL_EXPLOSIVES = Registration.ITEMS.register("t4_industrial_explosives", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_INTELLIGENT_KEVLAR = Registration.ITEMS.register("t4_intelligent_kevlar", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_MEMORY_CRYSTAL = Registration.ITEMS.register("t4_memory_crystal", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_NANO_CAMERA = Registration.ITEMS.register("t4_nano_camera", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_NANO_ORGANIC_FABRICATION_UNIT = Registration.ITEMS.register("t4_nano_organic_fabrication_unit", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_NANOMANUFACTURING_UNIT = Registration.ITEMS.register("t4_nanomanufacturing_unit", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_NEURAL_NETWORK_INTERFACE = Registration.ITEMS.register("t4_neural_network_interface", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_NUCLEAR_REACTORS = Registration.ITEMS.register("t4_nuclear_reactors", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_PLANETARY_VEHICLES = Registration.ITEMS.register("t4_planetary_vehicles", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_ROBOTICS = Registration.ITEMS.register("t4_robotics", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_SUPERCOMPUTERS = Registration.ITEMS.register("t4_supercomputers", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_SYNTHETIC_SUPERCONDUCTORS = Registration.ITEMS.register("t4_synthetic_superconductors", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_SYNTHETIC_SYNAPSES = Registration.ITEMS.register("t4_synthetic_synapses", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_THREAT_DETECTION_SYSTEM = Registration.ITEMS.register("t4_threat_detection_system", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_USER_INTERFACE = Registration.ITEMS.register("t4_user_interface", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T4_VACCINES = Registration.ITEMS.register("t4_vaccines", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));

    //Tier 5 Advanced Products
    public static final RegistryObject<Item> T5_ADAPTIVE_POWER_CORE = Registration.ITEMS.register("t5_adaptive_power_core", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_AI_CENTRAL_PROCESSING_CORE = Registration.ITEMS.register("t5_ai_central_processing_core", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_CONNECTED_SMART_CONTROLLER = Registration.ITEMS.register("t5_connected_smart_controller", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_CYBERNETIC_CUSTODIAL_DRONES = Registration.ITEMS.register("t5_cybernetic_custodial_drones", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_INTELLIGENT_BONDING_AGENTS = Registration.ITEMS.register("t5_intelligent_bonding_agents", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_LIMITED_NANO_ASSEMBLER = Registration.ITEMS.register("t5_limited_nano_assembler", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_NEURAL_NETWORK_MAINFRAME = Registration.ITEMS.register("t5_neural_network_mainframe", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
    public static final RegistryObject<Item> T5_STERILE_CONDUITS = Registration.ITEMS.register("t5_sterile_conduits", ()-> new Item(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB)));
/*
  t1_autotrophs": "§2Autotrophs",
  t1_complex_lifeforms": "§2Complex Lifeforms",
  t1_hard_water": "§2Hard Water",
  t1_microbes": "§2Microbes",
  t1_organic_compounds": "§2Organic Compounds",
  t1_phytoplankton": "§2Phytoplankton",

  t1_base_metals": "§4Base Metals",
  t1_crystalline_solids": "§4Crystalline Solids",
  t1_heavy_metals": "§4Heavy Metals",
  t1_ionic_solutions": "§4Ionic Solutions",
  t1_liquid_hot_magma": "§4Liquid Hot Magma",

  t1_atmospheric_gas": "§3Atmospheric Gas",
  t1_rare_metals": "§3Rare Metals",
  t1_suspended_plasma": "§3Suspended Plasma",
  t1_unstable_gas": "§3Unstable Gas"
* */
    public static void register() { }
}
