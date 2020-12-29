package hamdev.tantalusunchained.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

import static net.minecraft.util.math.MathHelper.abs;
import static net.minecraft.util.math.MathHelper.floor;

public class helpers {

    private static final Logger LOGGER = LogManager.getLogger();

    public static String[] resourcesOverworld() {
        return new String[]{"\uA0072Autotrophs", "\uA0072Hard Water", "\uA0072Organic Compounds", "\uA0072Microbes", "\uA0072Phytoplankton", "\uA0072Complex Lifeforms"};
    }
    public static String[] resourcesTheNether() {
        return new String[]{"\uA0074Base Metals", "\uA0074Crystalline Solids", "\uA0074Ionic Solutions", "\uA0074Heavy Metals", "\uA0074Liquid Hot Magma", "\uA0074Rare Metals"};
    }
    public static String[] resourcesTheEnd() {
        return new String[]{"\uA0073Atmospheric Gas", "\uA0073Ionized Gas", "\uA0073Suspended Plasma", "\uA0073Unstable Gas"};
    }

    public static String[] getDimResources(PlayerEntity player) {
        String[] resources;
        String worldName = player.world.getDimensionKey().getLocation().getPath();
        switch(worldName) {
            case "the_end":resources = resourcesTheEnd();break;
            case "the_nether":resources = resourcesTheNether();break;
            default :resources = resourcesOverworld();break; //"overworld"
        }
        return resources;
    }

    public static double randomGenerator(int resourceModifier, double chunkX, double chunkZ, double min, double max) {
        int finalX = floor(chunkX / 16);
        int finalZ = floor(chunkZ / 16);
        String bitShift = "";

        if(finalX < 0 && finalZ < 0)
        {
            bitShift = "-";
        }
        else if(finalX < 0 && finalZ >= 0)
        {
            bitShift = "0";
        }
        else if(finalX >= 0 && finalZ < 0)
        {
            bitShift = "1";
        }
        String finalSeed = bitShift + "" + abs(finalX) + "" + abs(finalZ) + "" + LocalDate.now().getYear() + ""
                + LocalDate.now().getMonthValue();
        Random generator = new Random((resourceModifier + 1) * Integer.parseInt(finalSeed));
        return min + (max - min) * generator.nextDouble();
    }

    public static double roundPlaces(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
        //I know this isn't perfect but for my purposes it works just fine for now.
        //System.out.println(roundPlaces(260.775d, 2));
        // OUTPUTS: 260.77 instead of expected 260.78
    }

    public static void densityScanBegin(PlayerEntity player) {
        player.sendMessage(new StringTextComponent(
      "\u00a77Scanning chunk [" + player.chunkCoordX +","+ player.chunkCoordZ + "]\u00a77 in "
              + player.world.getDimensionKey().getLocation().toString()),player.getUniqueID());
    }

    public static void densityScanComplete(PlayerEntity player, int x, int z) {
        String[] resources = getDimResources(player);
        double density;
        for(int i = 0; i < resources.length; i++) {
            density = randomGenerator(i, x, z, Config.MIN_RESOURCE_DENSITY.get(), Config.MAX_RESOURCE_DENSITY.get());
            String densityPct = String.format("%,.0f", density * 100);
            String densityUnitsPerHour = String.format("%,.0f", density * Config.BASE_RESOURCE_YIELD.get());
            player.sendMessage(new StringTextComponent(resources[i] +"\u00a77: "+ densityPct + "% \u00a77yields "
                    + densityUnitsPerHour +"\u00a77 units per hour" ) ,player.getUniqueID());
        }
        player.sendMessage(new StringTextComponent("--------------------------------------"),player.getUniqueID());
    }

    /* TODO: It might make sense to get these methods inside two separate classes. One that Outputs
        everything and one that actually returns the values.
        That way you can call the getting of the values inside the OmniTool RightClick Method and save it to the
        "Resource Scan Report"
    */
    public static String[] getResourceDensityPctString(PlayerEntity player, int x, int z) {
        String[] resources = getDimResources(player);
        double density;
        String[] densityPctStr = new String[resources.length];
        for(int i = 0; i < resources.length; i++) {
            density = randomGenerator(i, x, z, Config.MIN_RESOURCE_DENSITY.get(), Config.MAX_RESOURCE_DENSITY.get());
            densityPctStr[i] = String.format("%,.0f", density * 100)+"%";
        }
        return densityPctStr;
    }
    // Function to concat one array onto the end of another
    public static String[] concatArray(String[] first, String[] second)
    {
        return ArrayUtils.addAll(first, second);
    }
    // Function to combine each index of two arrays into one new index of a new array
    // For example, [Base Metals, Hard Water] + [23%,178%] = [Base Metals: 23% , Hard Water: 178%]
    public static String[] concatArrayIndexes(String[] first, String[] second) {
        String[] third = new String[first.length];
        //int index = first.length;
        for (int i = 0; i < first.length; i++) {
            third[i] = first[i]+": "+second[i];
        }
        return third;
    }
}