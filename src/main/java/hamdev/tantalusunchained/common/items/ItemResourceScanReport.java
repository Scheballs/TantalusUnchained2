package hamdev.tantalusunchained.common.items;

import hamdev.tantalusunchained.common.TantalusUnchained;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import static hamdev.tantalusunchained.common.util.Helpers.isHoldingShift;

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
                tooltip.remove(1);
                for(String nbtKey : stack.getTag().keySet())
                {
                String nbtValues = stack.getTag().getString(nbtKey);
                tooltip.add(new StringTextComponent(nbtValues));
                }
            }
        }
    }
}