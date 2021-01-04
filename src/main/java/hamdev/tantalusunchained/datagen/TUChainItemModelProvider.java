package hamdev.tantalusunchained.datagen;

import hamdev.tantalusunchained.common.TantalusUnchained;
import hamdev.tantalusunchained.common.block.TUChainBlocks;
import hamdev.tantalusunchained.common.items.TUChainItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import java.util.function.Supplier;


public class TUChainItemModelProvider extends ItemModelProvider {

    public TUChainItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TantalusUnchained.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(TUChainBlocks.TANTALUM_ORE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalum_ore"));
        singleTexture(TUChainBlocks.TANTALUM_BLOCK.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalum_block"));
        singleTexture(TUChainBlocks.TANTALUM_TANK.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalum_tank"));

        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER1.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier1"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER2.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier2"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER3.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier3"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER4.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier4"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER5.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier5"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER6.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier6"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER7.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier7"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER8.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier8"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER9.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier9"));
        singleTexture(TUChainBlocks.MACHINE_BLOCK_TIER10.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/machine_block_tier10"));

        singleTexture(TUChainBlocks.TANTALITE_COBBLESTONE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_cobblestone"));
        singleTexture(TUChainBlocks.TANTALITE_STONE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_stone"));
        singleTexture(TUChainBlocks.TANTALITE_SMOOTH_STONE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_smooth_stone"));
        singleTexture(TUChainBlocks.TANTALITE_BRICKS.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_bricks"));

        singleTexture(TUChainBlocks.TANTALIZING_STRIPPED_LOG.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_stripped_log"));
        singleTexture(TUChainBlocks.TANTALIZING_PLANKS.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_planks"));
        singleTexture(TUChainBlocks.TANTALIZING_LOG.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_log"));
        singleTexture(TUChainBlocks.TANTALIZING_WOOD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_wood"));
        singleTexture(TUChainBlocks.TANTALIZING_LEAVES.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_leaves"));
        singleTexture(TUChainBlocks.TANTALIZING_SAPLING.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_sapling"));

        singleTexture(TUChainBlocks.TANTALUM_STAIRS.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalum_stair"));
        singleTexture(TUChainBlocks.TANTALUM_SLAB.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalum_slab"));
        singleTexture(TUChainBlocks.TANTALUM_FENCE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalum_fence"));
        singleTexture(TUChainBlocks.TANTALUM_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalum_fence_gate"));
        singleTexture(TUChainBlocks.TANTALUM_WALL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalum_wall"));

        singleTexture(TUChainBlocks.TANTALITE_STAIRS.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_stair"));
        singleTexture(TUChainBlocks.TANTALITE_SLAB.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_slab"));
        singleTexture(TUChainBlocks.TANTALITE_FENCE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_fence"));
        singleTexture(TUChainBlocks.TANTALITE_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_fence_gate"));
        singleTexture(TUChainBlocks.TANTALITE_WALL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalite_wall"));

        singleTexture(TUChainBlocks.TANTALIZING_STAIRS.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_stair"));
        singleTexture(TUChainBlocks.TANTALIZING_SLAB.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_slab"));
        singleTexture(TUChainBlocks.TANTALIZING_FENCE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_fence"));
        singleTexture(TUChainBlocks.TANTALIZING_FENCE_GATE.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_fence_gate"));
        singleTexture(TUChainBlocks.TANTALIZING_WALL.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(TantalusUnchained.MOD_ID, "block/tantalizing_wall"));
        simpleItem(TUChainItems.RESOURCE_SCAN_REPORT_BLANK);
        simpleItem(TUChainItems.RESOURCE_SCAN_REPORT);
        simpleItem(TUChainItems.TANTALUM);
        simpleItem(TUChainItems.TANTALUM_INGOT);
        simpleItem(TUChainItems.TANTALUM_NUGGET);

        simpleItem(TUChainItems.T1_AUTOTROPHS);
        simpleItem(TUChainItems.T1_COMPLEX_LIFEFORMS);
        simpleItem(TUChainItems.T1_HARD_WATER);
        simpleItem(TUChainItems.T1_MICROBES);
        simpleItem(TUChainItems.T1_ORGANIC_COMPOUNDS);
        simpleItem(TUChainItems.T1_PHYTOPLANKTON);

        simpleItem(TUChainItems.T1_BASE_METALS);
        simpleItem(TUChainItems.T1_CRYSTALLINE_SOLIDS);
        simpleItem(TUChainItems.T1_HEAVY_METALS);
        simpleItem(TUChainItems.T1_IONIC_SOLUTIONS);
        simpleItem(TUChainItems.T1_LIQUID_HOT_MAGMA);

        simpleItem(TUChainItems.T1_ATMOSPHERIC_GAS);
        simpleItem(TUChainItems.T1_RARE_METALS);
        simpleItem(TUChainItems.T1_SUSPENDED_PLASMA);
        simpleItem(TUChainItems.T1_UNSTABLE_GAS);

        simpleItem(TUChainItems.T2_BACTERIA);
        simpleItem(TUChainItems.T2_BIOFUELS);
        simpleItem(TUChainItems.T2_BIOMASS);
        simpleItem(TUChainItems.T2_CELLULOSE_FIBRES);
        simpleItem(TUChainItems.T2_PROCESSED_WATER);
        simpleItem(TUChainItems.T2_PROTEINS);

        simpleItem(TUChainItems.T2_CHIRAL_STRUCTURES);
        simpleItem(TUChainItems.T2_PRECIOUS_METALS);
        simpleItem(TUChainItems.T2_REACTIVE_METALS);
        simpleItem(TUChainItems.T2_SILICA);
        simpleItem(TUChainItems.T2_TOXIC_METALS);

        simpleItem(TUChainItems.T2_ELECTROLYTES);
        simpleItem(TUChainItems.T2_OXIDIZING_AGENT);
        simpleItem(TUChainItems.T2_OXYGEN);
        simpleItem(TUChainItems.T2_PLASMOIDS);

        simpleItem(TUChainItems.T3_BIOCELLS);
        simpleItem(TUChainItems.T3_CONSTRUCTION_BLOCKS);
        simpleItem(TUChainItems.T3_CONSUMER_ELECTRONICS);
        simpleItem(TUChainItems.T3_COOLANT);
        simpleItem(TUChainItems.T3_ENRICHED_URANIUM);
        simpleItem(TUChainItems.T3_FERTILIZER);
        simpleItem(TUChainItems.T3_GENETICALLY_MODIFIED_LIVESTOCK);
        simpleItem(TUChainItems.T3_GORILLA_GLASS);
        simpleItem(TUChainItems.T3_HIGH_STRENGTH_BIOPLASTICS);
        simpleItem(TUChainItems.T3_HIGH_STRENGTH_TEXTILES);
        simpleItem(TUChainItems.T3_LIVESTOCK);
        simpleItem(TUChainItems.T3_MECHANICAL_PARTS);
        simpleItem(TUChainItems.T3_MICROFIBER_SHIELDING);
        simpleItem(TUChainItems.T3_MINIATURE_ELECTRONICS);
        simpleItem(TUChainItems.T3_NANITES);
        simpleItem(TUChainItems.T3_NATURAL_SUPERCONDUCTORS);
        simpleItem(TUChainItems.T3_OXIDES);
        simpleItem(TUChainItems.T3_POLYARAMIDS);
        simpleItem(TUChainItems.T3_ROCKET_FUEL);
        simpleItem(TUChainItems.T3_SYNTHETIC_OIL);
        simpleItem(TUChainItems.T3_TEST_CULTURES);
        simpleItem(TUChainItems.T3_TRANSMITTER);
        simpleItem(TUChainItems.T3_VIRAL_AGENT);
        simpleItem(TUChainItems.T3_WATER_COOLED_CPU);

        simpleItem(TUChainItems.T4_CONDENSATES);
        simpleItem(TUChainItems.T4_CRYOPROTECTANT_SOLUTION);
        simpleItem(TUChainItems.T4_CYBERNETIC_BIO_GEL);
        simpleItem(TUChainItems.T4_GUIDANCE_SYSTEMS);
        simpleItem(TUChainItems.T4_HIGH_TECH_TRANSMITTERS);
        simpleItem(TUChainItems.T4_INDUSTRIAL_EXPLOSIVES);
        simpleItem(TUChainItems.T4_INTELLIGENT_KEVLAR);
        simpleItem(TUChainItems.T4_MEMORY_CRYSTAL);
        simpleItem(TUChainItems.T4_NANO_CAMERA);
        simpleItem(TUChainItems.T4_NANO_ORGANIC_FABRICATION_UNIT);
        simpleItem(TUChainItems.T4_NANOMANUFACTURING_UNIT);
        simpleItem(TUChainItems.T4_NEURAL_NETWORK_INTERFACE);
        simpleItem(TUChainItems.T4_NUCLEAR_REACTORS);
        simpleItem(TUChainItems.T4_PLANETARY_VEHICLES);
        simpleItem(TUChainItems.T4_ROBOTICS);
        simpleItem(TUChainItems.T4_SUPERCOMPUTERS);
        simpleItem(TUChainItems.T4_SYNTHETIC_SUPERCONDUCTORS);
        simpleItem(TUChainItems.T4_SYNTHETIC_SYNAPSES);
        simpleItem(TUChainItems.T4_THREAT_DETECTION_SYSTEM);
        simpleItem(TUChainItems.T4_USER_INTERFACE);
        simpleItem(TUChainItems.T4_VACCINES);

        simpleItem(TUChainItems.T5_ADAPTIVE_POWER_CORE);
        simpleItem(TUChainItems.T5_AI_CENTRAL_PROCESSING_CORE);
        simpleItem(TUChainItems.T5_CONNECTED_SMART_CONTROLLER);
        simpleItem(TUChainItems.T5_CYBERNETIC_CUSTODIAL_DRONES);
        simpleItem(TUChainItems.T5_INTELLIGENT_BONDING_AGENTS);
        simpleItem(TUChainItems.T5_LIMITED_NANO_ASSEMBLER);
        simpleItem(TUChainItems.T5_NEURAL_NETWORK_MAINFRAME);
        simpleItem(TUChainItems.T5_STERILE_CONDUITS);
    }

    public void simpleItem(Supplier<? extends Item> itemSupplier) {
        ResourceLocation location = itemSupplier.get().getRegistryName();
        this.getBuilder(location.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(location.getNamespace(), ITEM_FOLDER + "/" + location.getPath()));
    }
}
