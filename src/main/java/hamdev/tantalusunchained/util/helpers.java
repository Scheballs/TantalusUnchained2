package hamdev.tantalusunchained.util;

import com.ibm.icu.number.Precision;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import java.time.LocalDate;
import java.util.Random;

import static net.minecraft.util.math.MathHelper.abs;
import static net.minecraft.util.math.MathHelper.floor;

public class helpers {

    public static String[] resourcesOverworld() {
        return new String[]{"\u00a72Hard Water", "\u00a72Organic Compounds", "\u00a72Autotrophs", "\u00a72Microbes", "\u00a72Phytoplankton", "\u00a72Complex Lifeforms"};
    }
    public static String[] resourcesTheNether() {
        return new String[]{"\u00a7cBase Metals", "\u00a7cHeavy Metals", "\u00a7cCrystalline Solids", "\u00a7cLiquid Hot Magma", "\u00a7cRare Metals"};
    }
    public static String[] resourcesTheEnd() {
        return new String[]{"\u00a7bAtmospheric Gas", "\u00a7bIonized Gas", "\u00a7bSuspended Plasma", "\u00a7bUnstable Gas"};
    }

    public static String[] getDimResources(PlayerEntity player) {
        String[] resources;
        String worldName = player.world.getDimensionKey().getLocation().toString();
        switch(worldName) {
            case "minecraft:the_end":resources = resourcesTheEnd();break;
            case "minecraft:the_nether":resources = resourcesTheNether();break;
            default:resources = resourcesOverworld();break; //"minecraft:overworld"
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
    public static double[] getResourceDensityPct(PlayerEntity player, int x, int z) {
        String[] resources = getDimResources(player);
        double density;
        double[] densityPct = new double[resources.length];
        for(int i = 0; i < resources.length; i++) {
            density = randomGenerator(i, x, z, 0.01, 2.0);
            //String densityPct = String.format("%,.0f", density * 100);
            //String densityYield = String.format("%,.0f", density * 300);
            densityPct[i] = roundPlaces(density, 4) * 100;
            }
        return densityPct;
        }

    public static double[] getResourceDensityYield(PlayerEntity player, int x, int z) {
        String[] resources = getDimResources(player);
        double density;
        double[] densityYield = new double[resources.length];
        for(int i = 0; i < resources.length; i++) {
            density = randomGenerator(i, x, z, 0.01, 2.0);
            //String densityPct = String.format("%,.0f", density * 100);
            //String densityYield = String.format("%,.0f", density * 300);
            densityYield[i] = roundPlaces(density, 4) * 300;
        }
        return densityYield;
    }
}