package hamdev.tantalusunchained.common;

import hamdev.tantalusunchained.common.block.TUChainBlocks;
import hamdev.tantalusunchained.client.proxy.ClientProxy;
import hamdev.tantalusunchained.common.proxy.IProxy;
import hamdev.tantalusunchained.common.items.TUChainItems;
import hamdev.tantalusunchained.server.proxy.ServerProxy;
import hamdev.tantalusunchained.util.Config;
import hamdev.tantalusunchained.util.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TantalusUnchained.MOD_ID)
public class TantalusUnchained
{
    public static final String MOD_ID = "tantalusunchained";
    public final IProxy PROXY = DistExecutor.safeRunForDist(() -> ClientProxy::new, ()-> ServerProxy::new);
    public static final String MOD_NAME = "Tantalus Unchained";
    public static final String MOD_SHORT_NAME = "TUChain";
    public static final String MOD_TOML_FILE_LOC = "tantalusunchained-server.toml";

    private static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup CREATIVE_TAB = new ItemGroup("creative_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(TUChainItems.OMNI_TOOL.get());
        }
    };

    public TantalusUnchained() {
        IEventBus mod = FMLJavaModLoadingContext.get().getModEventBus(),
                forge = MinecraftForge.EVENT_BUS;
        PROXY.setup(mod, forge);
        addRegistries(mod);
        mod.addListener(this::commonSetup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);

        Registration.register();
        TUChainBlocks.register();
        TUChainItems.register();

        // Load Config Files
        Config.loadConfigFile(Config.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_TOML_FILE_LOC).toString());
        Config.loadConfigFile(Config.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_TOML_FILE_LOC).toString());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) { }

    private void addRegistries(IEventBus mod){ }

    private void gatherData(final GatherDataEvent event) { }

}
