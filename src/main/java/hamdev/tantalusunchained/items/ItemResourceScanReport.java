package hamdev.tantalusunchained.items;

import hamdev.tantalusunchained.TantalusUnchained;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;

public class ItemResourceScanReport extends Item
{
    public ItemResourceScanReport() {super(new Item.Properties().maxStackSize(64).group(TantalusUnchained.CREATIVE_TAB));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(new StringTextComponent("Hold"+"\u00A7e" + " SHIFT " + "\u00A77" + "for more info" ));
        //tooltip.add(new StringTextComponent("Place me in your inventory so the Omni Tool can write a scan report on me"));
        if(isHoldingShift())
        {
            if (stack.hasTag() )
            {
                for(String nbtKey : stack.getTag().keySet())
                {
                    // Do things with stack.getTag().get(nbtKey) for example :)
                    if (stack.getTag().getString(nbtKey).equals(""))
                    {
                        double nbtValueD = stack.getTag().getDouble(nbtKey);
                        String nbtValue = String.format("%,.0f", nbtValueD * 100);
                        tooltip.add(new StringTextComponent(nbtKey + " " + nbtValue));
                    }
                    String nbtValueS = stack.getTag().getString(nbtKey);
                    tooltip.add(new StringTextComponent(nbtKey + " " + nbtValueS));
                }
            }
        }
    }
    //NOTE: just a helper method I have pulled out of the Keyboard helper
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingShift() {
        return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(),
                GLFW.GLFW_KEY_LEFT_SHIFT);
    }
}