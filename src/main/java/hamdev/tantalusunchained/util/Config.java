package hamdev.tantalusunchained.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class Config {
    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    // Add new Config variables here
    public static ForgeConfigSpec.IntValue BASE_RESOURCE_YIELD;
    public static ForgeConfigSpec.DoubleValue MIN_RESOURCE_DENSITY;
    public static ForgeConfigSpec.DoubleValue MAX_RESOURCE_DENSITY;

    static {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        setMinResourceDensity(SERVER_BUILDER,CLIENT_BUILDER);
        setMaxResourceDensity(SERVER_BUILDER,CLIENT_BUILDER);
        setBaseResourceYield(SERVER_BUILDER,CLIENT_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }
    // Define new Config values here too
    private static void setMinResourceDensity(ForgeConfigSpec.Builder SERVER_BUILDER,ForgeConfigSpec.Builder CLIENT_BUILDER){
        MIN_RESOURCE_DENSITY = CLIENT_BUILDER.comment("Minimum Density Scan result as a percentage of the Base Yield config value. Default Value = 1.0% of Base Yield = 0.01 or 3 if base yield is 300.")
                .defineInRange("min_resource_density",0.01,0.01,0.5);
    }
    private static void setMaxResourceDensity(ForgeConfigSpec.Builder SERVER_BUILDER,ForgeConfigSpec.Builder CLIENT_BUILDER){
        MAX_RESOURCE_DENSITY = CLIENT_BUILDER.comment("Maximum Density Scan result as a percentage of the Base Yield config value. Default Value = 200.0% of Base Yield = 2.0 or 600 if base yield is 300.")
                .defineInRange("max_resource_density",2.0,0.02,10.0);
    }

    private static void setBaseResourceYield(ForgeConfigSpec.Builder SERVER_BUILDER,ForgeConfigSpec.Builder CLIENT_BUILDER){
        BASE_RESOURCE_YIELD = CLIENT_BUILDER.comment("Base Resource Yield output in items per hours. This is the value that is affected by the Chunk Resource Density Scan. Default Value = 300")
                .defineInRange("base_resource_yield",300,1,3000);
    }

    public static void loadConfigFile(ForgeConfigSpec config, String path){
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path))
                .sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }
}
