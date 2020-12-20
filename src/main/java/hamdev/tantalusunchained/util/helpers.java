package hamdev.tantalusunchained.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import java.time.LocalDate;
import java.util.Random;

import static net.minecraft.util.math.MathHelper.abs;
import static net.minecraft.util.math.MathHelper.floor;

public class helpers {

    public static String[] getDimResources(PlayerEntity player) {
        String[] resources;
        if(player.world.getDimensionKey() == World.THE_END) {
            resources = new String[]{"\u00a7bInert Gas", "\u00a7bIonized Gas", "\u00a7bLiquid Hot Plasma", "\u00a7bUnstable Gas"};
        }
        else if(player.world.getDimensionKey() == World.THE_NETHER) {
            resources = new String[]{"\u00a7cBase Metals", "\u00a7cHeavy Metals", "\u00a7cCrystalline Solids", "\u00a7cLiquid Hot Magma", "\u00a7cRare Metals"};
        }
        else {
            resources = new String[]{"\u00a72Hard Water", "\u00a72Organic Compounds", "\u00a72Autotrophs", "\u00a72Microbes", "\u00a72Phytoplankton", "\u00a72Complex Organisms"};
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
        String finalSeed = bitShift + "" + abs(finalX) + "" + abs(finalZ) + "" + LocalDate.now().getYear() + "" + LocalDate.now().getMonthValue();
        Random generator = new Random((resourceModifier + 1) * Integer.parseInt(finalSeed));
        return min + (max - min) * generator.nextDouble();
    }

    public static void densityScanBegin(PlayerEntity player) {
        player.sendMessage(new StringTextComponent(
      "\u00a77Scanning chunk [" + player.chunkCoordX +","+ player.chunkCoordZ + "]\u00a77 in " + player.world.getDimensionKey().getLocation()),player.getUniqueID());
    }

    public static void densityScanComplete(PlayerEntity player, int x, int z) {
        String[] resources = getDimResources(player);
        double density;
        for(int i = 0; i < resources.length; i++) {
            density = randomGenerator(i, x, z, 0.01, 2.0);
            String densityPct = String.format("%,.0f", density * 100);
            String densityUnitsPerHour = String.format("%,.0f", density * 300);

            player.sendMessage(new StringTextComponent(resources[i] +"\u00a77: "+ densityPct + "% \u00a77yields "
                    + densityUnitsPerHour +"\u00a77 units per hour" ) ,player.getUniqueID());
        }
        player.sendMessage(new StringTextComponent("--------------------------------------"),player.getUniqueID());
    }
}