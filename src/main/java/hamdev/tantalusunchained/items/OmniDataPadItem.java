package hamdev.tantalusunchained.items;

import hamdev.tantalusunchained.TantalusUnchained;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.command.arguments.NBTCompoundTagArgument;
import net.minecraft.command.arguments.NBTTagArgument;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

import javax.annotation.Nullable;
import java.util.List;

public class OmniDataPadItem extends Item
{
    public OmniDataPadItem()
    {
        super(new Item.Properties().maxStackSize(1).group(TantalusUnchained.CREATIVE_TAB));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(new StringTextComponent("Hold"+"\u00A7e" + " SHIFT " + "\u00A77" + "for more information!" ));

        if(isHoldingShift())
        {
            if (stack.hasTag() && stack.getTag().contains(TantalusUnchained.MOD_ID + "hard_water_density"))
            {
                // TODO: here you'd add probably another tag with the chunk coordinates
                tooltip.add(new StringTextComponent("Hard Water Density on Chunk (x, y): "
                        + stack.getTag().getDouble(TantalusUnchained.MOD_ID +"hard_water_density")));
            }
        }
    }

    //NOTE: just a helper method I have pulled out of the Keyboard helper
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingShift()
    {
        return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(),
                GLFW.GLFW_KEY_LEFT_SHIFT);
    }

}
