package hamdev.tantalusunchained.common.items;

import hamdev.tantalusunchained.common.TantalusUnchained;
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
import java.util.List;

import static hamdev.tantalusunchained.common.util.helpers.isHoldingShift;

public class ItemResourceScanReport extends Item
{
    public ItemResourceScanReport()
    {
        super(new Item.Properties().maxStackSize(1).group(TantalusUnchained.CREATIVE_TAB));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(new StringTextComponent("<Hold SHIFT>" ));
        //TODO: Need to make the hold SHIFT tooltip go away while holding shift.
        if(isHoldingShift())
        {
            if (stack.hasTag() )
            {
                for(String nbtKey : stack.getTag().keySet())
                {
                String nbtValueS = stack.getTag().getString(nbtKey);
                tooltip.add(new StringTextComponent(nbtValueS));
                }
            }
            tooltip.add(new StringTextComponent("Place me in your inventory so the Omni Tool can write a scan report on me"));
        }
    }
}