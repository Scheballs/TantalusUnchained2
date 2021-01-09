package hamdev.tantalusunchained.datagen;

import hamdev.tantalusunchained.common.TantalusUnchained;
import hamdev.tantalusunchained.common.block.TUChainBlocks;
import hamdev.tantalusunchained.common.items.TUChainItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class TUChainLanguageProvider extends LanguageProvider {

    public TUChainLanguageProvider(DataGenerator gen, String locale) {
        super(gen, TantalusUnchained.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        String locale = this.getName().replace("Languages: ", "");
        switch(locale){
            case "en_us":
                addItem(TUChainItems.OMNI_TOOL, "Omni Tool");
                addItem(TUChainItems.RESOURCE_SCAN_REPORT_BLANK, "Resource Scan Report Blank");
                addItem(TUChainItems.RESOURCE_SCAN_REPORT, "Resource Scan Report");
                addItem(TUChainItems.TANTALUM, "Tantalum");
                addItem(TUChainItems.TANTALUM_INGOT, "Tantalum Ingot");
                addItem(TUChainItems.TANTALUM_NUGGET, "Tantalum Nugget");

                addBlock(TUChainBlocks.TANTALUM_ORE, "Tantalum Ore");
                addBlock(TUChainBlocks.TANTALUM_BLOCK, "Tantalum Block");
                addBlock(TUChainBlocks.TANTALUM_TANK, "Tantalum Tank");

                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER1, "Machine Block Tier1");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER2, "Machine Block Tier2");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER3, "Machine Block Tier3");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER4, "Machine Block Tier4");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER5, "Machine Block Tier5");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER6, "Machine Block Tier6");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER7, "Machine Block Tier7");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER8, "Machine Block Tier8");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER9, "Machine Block Tier9");
                addBlock(TUChainBlocks.MACHINE_BLOCK_TIER10, "Machine Block Tier10");

                addBlock(TUChainBlocks.TANTALITE_COBBLESTONE, "Tantalite Cobblestone");
                addBlock(TUChainBlocks.TANTALITE_STONE, "Tantalite Stone");
                addBlock(TUChainBlocks.TANTALITE_STONE_BRICKS, "Tantalite Stone Bricks");
                addBlock(TUChainBlocks.TANTALITE_SMOOTH_STONE, "Tantalite Smooth Stone");
                addBlock(TUChainBlocks.TANTALITE_BRICKS, "Tantalite Bricks");

                addBlock(TUChainBlocks.TANTALIZING_STRIPPED_LOG, "Tantalizing Stripped Log");
                addBlock(TUChainBlocks.TANTALIZING_PLANKS, "Tantalizing Planks");
                addBlock(TUChainBlocks.TANTALIZING_LOG, "Tantalizing Log");
                addBlock(TUChainBlocks.TANTALIZING_WOOD, "Tantalizing Wood");
                addBlock(TUChainBlocks.TANTALIZING_LEAVES, "Tantalizing Leaves");
                addBlock(TUChainBlocks.TANTALIZING_SAPLING, "Tantalizing Sapling");

                addBlock(TUChainBlocks.TANTALUM_STAIRS, "Tantalum Stairs");
                addBlock(TUChainBlocks.TANTALUM_SLAB, "Tantalum Slab");
                addBlock(TUChainBlocks.TANTALUM_FENCE, "Tantalum Fence");
                addBlock(TUChainBlocks.TANTALUM_FENCE_GATE, "Tantalum Fence Gate");
                addBlock(TUChainBlocks.TANTALUM_WALL, "Tantalum Wall");

                addBlock(TUChainBlocks.TANTALITE_STAIRS, "Tantalite Stairs");
                addBlock(TUChainBlocks.TANTALITE_SLAB, "Tantalite Slab");
                addBlock(TUChainBlocks.TANTALITE_FENCE, "Tantalite Fence");
                addBlock(TUChainBlocks.TANTALITE_FENCE_GATE, "Tantalite Fence Gate");
                addBlock(TUChainBlocks.TANTALITE_WALL, "Tantalite Wall");

                addBlock(TUChainBlocks.TANTALIZING_STAIRS, "Tantalizing Stairs");
                addBlock(TUChainBlocks.TANTALIZING_SLAB, "Tantalizing Slab");
                addBlock(TUChainBlocks.TANTALIZING_FENCE, "Tantalizing Fence");
                addBlock(TUChainBlocks.TANTALIZING_FENCE_GATE, "Tantalizing Fence Gate");
                addBlock(TUChainBlocks.TANTALIZING_WALL, "Tantalizing Wall");

                addItem(TUChainItems.T1_AUTOTROPHS, "Autotrophs");
                addItem(TUChainItems.T1_COMPLEX_LIFEFORMS, "Complex_Lifeforms");
                addItem(TUChainItems.T1_HARD_WATER, "Hard_Water");
                addItem(TUChainItems.T1_MICROBES, "Microbes");
                addItem(TUChainItems.T1_ORGANIC_COMPOUNDS, "Organic_Compounds");
                addItem(TUChainItems.T1_PHYTOPLANKTON, "Phytoplankton");

                addItem(TUChainItems.T1_BASE_METALS, "Base_Metals");
                addItem(TUChainItems.T1_CRYSTALLINE_SOLIDS, "Crystalline_Solids");
                addItem(TUChainItems.T1_HEAVY_METALS, "Heavy_Metals");
                addItem(TUChainItems.T1_IONIC_SOLUTIONS, "Ionic_Solutions");
                addItem(TUChainItems.T1_LIQUID_HOT_MAGMA, "Liquid_Hot_Magma");

                addItem(TUChainItems.T1_ATMOSPHERIC_GAS, "Atmospheric_Gas");
                addItem(TUChainItems.T1_RARE_METALS, "Rare_Metals");
                addItem(TUChainItems.T1_SUSPENDED_PLASMA, "Suspended_Plasma");
                addItem(TUChainItems.T1_UNSTABLE_GAS, "Unstable_Gas");

                addItem(TUChainItems.T2_BACTERIA, "Bacteria");
                addItem(TUChainItems.T2_BIOFUELS, "Biofuels");
                addItem(TUChainItems.T2_BIOMASS, "Biomass");
                addItem(TUChainItems.T2_INDUSTRIAL_FIBERS, "Industrial Fibers");
                addItem(TUChainItems.T2_PROCESSED_WATER, "Processed Water");
                addItem(TUChainItems.T2_PROTEINS, "Proteins");

                addItem(TUChainItems.T2_CHIRAL_STRUCTURES, "Chiral Structures");
                addItem(TUChainItems.T2_PRECIOUS_METALS, "Precious Metals");
                addItem(TUChainItems.T2_REACTIVE_METALS, "Reactive Metals");
                addItem(TUChainItems.T2_SILICA, "Silica");
                addItem(TUChainItems.T2_TOXIC_METALS, "Toxic Metals");

                addItem(TUChainItems.T2_ELECTROLYTES, "Electrolytes");
                addItem(TUChainItems.T2_OXIDIZING_COMPOUND, "Oxidizing Compound");
                addItem(TUChainItems.T2_OXYGEN, "Oxygen");
                addItem(TUChainItems.T2_PLASMOIDS, "Plasmoids");

                addItem(TUChainItems.T3_BIOCELLS, "Biocells");
                addItem(TUChainItems.T3_CONSTRUCTION_BLOCKS, "Construction Blocks");
                addItem(TUChainItems.T3_CONSUMER_ELECTRONICS, "Consumer Electronics");
                addItem(TUChainItems.T3_COOLANT, "Coolant");
                addItem(TUChainItems.T3_ENRICHED_URANIUM, "Enriched Uranium");
                addItem(TUChainItems.T3_FERTILIZER, "Fertilizer");
                addItem(TUChainItems.T3_GENETICALLY_ENHANCED_LIVESTOCK, "Genetically Enhanced Livestock");
                addItem(TUChainItems.T3_SILICATE_GLASS, "Silicate Glass");
                addItem(TUChainItems.T3_SUPERTENSILE_PLASTICS, "Supertensile Plastics");
                addItem(TUChainItems.T3_POLYTEXTILES, "Polytextiles");
                addItem(TUChainItems.T3_LIVESTOCK, "Livestock");
                addItem(TUChainItems.T3_MECHANICAL_PARTS, "Mechanical Parts");
                addItem(TUChainItems.T3_MICROFIBER_SHIELDING, "Microfiber Shielding");
                addItem(TUChainItems.T3_MINIATURE_ELECTRONICS, "Miniature Electronics");
                addItem(TUChainItems.T3_NANITES, "Nanites");
                addItem(TUChainItems.T3_SUPERCONDUCTORS, "Superconductors");
                addItem(TUChainItems.T3_OXIDES, "Oxides");
                addItem(TUChainItems.T3_POLYARAMIDS, "Polyaramids");
                addItem(TUChainItems.T3_ROCKET_FUEL, "Rocket Fuel");
                addItem(TUChainItems.T3_SYNTHETIC_OIL, "Synthetic Oil");
                addItem(TUChainItems.T3_TEST_CULTURES, "Test Cultures");
                addItem(TUChainItems.T3_TRANSMITTER, "Transmitter");
                addItem(TUChainItems.T3_VIRAL_AGENT, "Viral Agent");
                addItem(TUChainItems.T3_WATER_COOLED_CPU, "Water-Cooled CPU");

                addItem(TUChainItems.T4_CONDENSATES, "Condensates");
                addItem(TUChainItems.T4_CRYOPROTECTANT_SOLUTION, "Cryoprotectant Solution");
                addItem(TUChainItems.T4_GEL_MATRIX_BIOPASTE, "Gel-Matrix Biopaste");
                addItem(TUChainItems.T4_GUIDANCE_SYSTEMS, "Guidance Systems");
                addItem(TUChainItems.T4_HIGH_TECH_TRANSMITTERS, "High-Tech Transmitters");
                addItem(TUChainItems.T4_INDUSTRIAL_EXPLOSIVES, "Industrial Explosives");
                addItem(TUChainItems.T4_HERMETIC_MEMBRANES, "Hermetic Membranes");
                addItem(TUChainItems.T4_DATA_CHIPS, "Data Chips");
                addItem(TUChainItems.T4_CAMERA_DRONES, "Camera Drones");
                addItem(TUChainItems.T4_BIOTECH_RESEARCH_REPORTS, "Biotech Research Reports");
                addItem(TUChainItems.T4_SMARTFAB_UNITS, "Smartfab Units");
                addItem(TUChainItems.T4_TRANSCRANIAL_MICROCONTROLLERS, "Transcranial Microcontrollers");
                addItem(TUChainItems.T4_NUCLEAR_REACTORS, "Nuclear Reactors");
                addItem(TUChainItems.T4_PLANETARY_VEHICLES, "Planetary Vehicles");
                addItem(TUChainItems.T4_ROBOTICS, "Robotics");
                addItem(TUChainItems.T4_SUPERCOMPUTERS, "Supercomputers");
                addItem(TUChainItems.T4_UKOMI_SUPERCONDUCTORS, "Ukomi Superconductors");
                addItem(TUChainItems.T4_SYNTHETIC_SYNAPSES, "Synthetic Synapses");
                addItem(TUChainItems.T4_HAZMAT_DETECTION_SYSTEMS, "Hazmat Detection Systems");
                addItem(TUChainItems.T4_NEOCOMS, "Neocoms");
                addItem(TUChainItems.T4_VACCINES, "Vaccines");

                addItem(TUChainItems.T5_SELF_HARMONIZING_POWER_CORE, "Self Harmonizing Power Core");
                addItem(TUChainItems.T5_RECURSIVE_COMPUTING_MODULE, "Recursive Computing Module");
                addItem(TUChainItems.T5_BROADCAST_NODE, "Broadcast Node");
                addItem(TUChainItems.T5_INTEGRITY_RESPONSE_DRONES, "Integrity Response Drones");
                addItem(TUChainItems.T5_ORGANIC_MORTAR_APPLICATORS, "Organic Mortar Applicators");
                addItem(TUChainItems.T5_NANO_FACTORY, "Nano Factory");
                addItem(TUChainItems.T5_WETWARE_MAINFRAME, "Wetware Mainframe");
                addItem(TUChainItems.T5_STERILE_CONDUITS, "Sterile Conduits");
                break;
            default:
                break;
        }

    }
}
