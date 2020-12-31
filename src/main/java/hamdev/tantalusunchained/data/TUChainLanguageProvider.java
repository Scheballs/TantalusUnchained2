package hamdev.tantalusunchained.data;

import hamdev.tantalusunchained.common.TantalusUnchained;
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
                addItem(TUChainItems.ITEM_RESOURCE_SCAN_REPORT_BLANK, "Resource Scan Report Blank");
                addItem(TUChainItems.ITEM_RESOURCE_SCAN_REPORT, "Resource Scan Report");
                addItem(TUChainItems.INGOT_TANTALUM, "Tantalum Ingot");
                addItem(TUChainItems.DUST_TANTALUM, "Tantalum Dust");
                addItem(TUChainItems.NUGGET_TANTALUM, "Tantalum Nugget");
                addItem(TUChainItems.ITEM_RESOURCE_SCAN_REPORT, "Resource Scan Report");
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
                addItem(TUChainItems.T2_CELLULOSE_FIBRES, "Cellulose Fibres");
                addItem(TUChainItems.T2_PROCESSED_WATER, "Processed Water");
                addItem(TUChainItems.T2_PROTEINS, "Proteins");

                addItem(TUChainItems.T2_CHIRAL_STRUCTURES, "Chiral Structures");
                addItem(TUChainItems.T2_PRECIOUS_METALS, "Precious Metals");
                addItem(TUChainItems.T2_REACTIVE_METALS, "Reactive Metals");
                addItem(TUChainItems.T2_SILICA, "Silica");
                addItem(TUChainItems.T2_TOXIC_METALS, "Toxic Metals");

                addItem(TUChainItems.T2_ELECTROLYTES, "Electrolytes");
                addItem(TUChainItems.T2_OXIDIZING_AGENT, "Oxidizing Agent");
                addItem(TUChainItems.T2_OXYGEN, "Oxygen");
                addItem(TUChainItems.T2_PLASMOIDS, "Plasmoids");

                addItem(TUChainItems.T3_BIOCELLS, "Biocells");
                addItem(TUChainItems.T3_CONSTRUCTION_BLOCKS, "Construction Blocks");
                addItem(TUChainItems.T3_CONSUMER_ELECTRONICS, "Consumer Electronics");
                addItem(TUChainItems.T3_COOLANT, "Coolant");
                addItem(TUChainItems.T3_ENRICHED_URANIUM, "Enriched Uranium");
                addItem(TUChainItems.T3_FERTILIZER, "Fertilizer");
                addItem(TUChainItems.T3_GENETICALLY_MODIFIED_LIVESTOCK, "Genetically Modified Livestock");
                addItem(TUChainItems.T3_GORILLA_GLASS, "Gorilla Glass");
                addItem(TUChainItems.T3_HIGH_STRENGTH_BIOPLASTICS, "High Strength Bioplastics");
                addItem(TUChainItems.T3_HIGH_STRENGTH_TEXTILES, "High Strength Textiles");
                addItem(TUChainItems.T3_LIVESTOCK, "Livestock");
                addItem(TUChainItems.T3_MECHANICAL_PARTS, "Mechanical Parts");
                addItem(TUChainItems.T3_MICROFIBER_SHIELDING, "Microfiber Shielding");
                addItem(TUChainItems.T3_MINIATURE_ELECTRONICS, "Miniature Electronics");
                addItem(TUChainItems.T3_NANITES, "Nanites");
                addItem(TUChainItems.T3_NATURAL_SUPERCONDUCTORS, "Natural Superconductors");
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
                addItem(TUChainItems.T4_CYBERNETIC_BIO_GEL, "Cybernetic Bio-Gel");
                addItem(TUChainItems.T4_GUIDANCE_SYSTEMS, "Guidance Systems");
                addItem(TUChainItems.T4_HIGH_TECH_TRANSMITTERS, "High-Tech Transmitters");
                addItem(TUChainItems.T4_INDUSTRIAL_EXPLOSIVES, "Industrial Explosives");
                addItem(TUChainItems.T4_INTELLIGENT_KEVLAR, "Intelligent Kevlar");
                addItem(TUChainItems.T4_MEMORY_CRYSTAL, "Memory Crystal");
                addItem(TUChainItems.T4_NANO_CAMERA, "Nano Camera");
                addItem(TUChainItems.T4_NANO_ORGANIC_FABRICATION_UNIT, "Nano Organic Fabrication Unit");
                addItem(TUChainItems.T4_NANOMANUFACTURING_UNIT, "Nanomanufacturing Unit");
                addItem(TUChainItems.T4_NEURAL_NETWORK_INTERFACE, "Neural Network Interface");
                addItem(TUChainItems.T4_NUCLEAR_REACTORS, "Nuclear Reactors");
                addItem(TUChainItems.T4_PLANETARY_VEHICLES, "Planetary Vehicles");
                addItem(TUChainItems.T4_ROBOTICS, "Robotics");
                addItem(TUChainItems.T4_SUPERCOMPUTERS, "Supercomputers");
                addItem(TUChainItems.T4_SYNTHETIC_SUPERCONDUCTORS, "Synthetic Superconductors");
                addItem(TUChainItems.T4_SYNTHETIC_SYNAPSES, "Synthetic Synapses");
                addItem(TUChainItems.T4_THREAT_DETECTION_SYSTEM, "Threat Detection System");
                addItem(TUChainItems.T4_USER_INTERFACE, "User Interface");
                addItem(TUChainItems.T4_VACCINES, "Vaccines");

                addItem(TUChainItems.T5_ADAPTIVE_POWER_CORE, "Adaptive Power Core");
                addItem(TUChainItems.T5_AI_CENTRAL_PROCESSING_CORE, "AI Central Processing Core");
                addItem(TUChainItems.T5_CONNECTED_SMART_CONTROLLER, "Connected Smart Controller");
                addItem(TUChainItems.T5_CYBERNETIC_CUSTODIAL_DRONES, "Cybernetic Custodial Drones");
                addItem(TUChainItems.T5_INTELLIGENT_BONDING_AGENTS, "Intelligent Bonding Agents");
                addItem(TUChainItems.T5_LIMITED_NANO_ASSEMBLER, "Limited Nano Assembler");
                addItem(TUChainItems.T5_NEURAL_NETWORK_MAINFRAME, "Neural Network Mainframe");
                addItem(TUChainItems.T5_STERILE_CONDUITS, "Sterile Conduits");
                break;
            default:
                break;
        }

    }
}
