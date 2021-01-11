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

public class ItemResourceScanReportBlank extends Item
{
    public ItemResourceScanReportBlank()
    {
        super(new Item.Properties().maxStackSize(64).group(TantalusUnchained.CREATIVE_TAB));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(new StringTextComponent("<Hold SHIFT>" ));
        //TODO: Need to make the hold SHIFT tooltip go away while holding shift.
        if(isHoldingShift())
        {
            tooltip.remove(1);
            tooltip.add(new StringTextComponent("Place me in your inventory so the Omni Tool can write a scan report on me"));
        }
    }
}