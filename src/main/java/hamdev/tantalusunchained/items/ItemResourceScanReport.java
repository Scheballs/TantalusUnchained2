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
import java.util.List;

public class ItemResourceScanReport extends Item
{
    public ItemResourceScanReport() {super(new Item.Properties().maxStackSize(64).group(TantalusUnchained.CREATIVE_TAB));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("Hold"+"\u00A7e" + " SHIFT " + "\u00A77" + "for more info" ));

        if(isHoldingShift()) {
            if (stack.hasTag() && stack.getTag().contains(TantalusUnchained.MOD_ID + ":resource_")) {
                    tooltip.add(new StringTextComponent("World: "   + stack.getTag().getString(TantalusUnchained.MOD_ID +":resource_world"  )));
                    tooltip.add(new StringTextComponent("Chunk: "   + stack.getTag().getString(TantalusUnchained.MOD_ID +":resource_chunk"  )));
                    tooltip.add(new StringTextComponent("Resource: "+ stack.getTag().getString(TantalusUnchained.MOD_ID +":resource_name"   )));
                    tooltip.add(new StringTextComponent("Density: " + stack.getTag().getString(TantalusUnchained.MOD_ID +":resource_density")));
            }
            tooltip.add(new StringTextComponent("Place me in your inventory so the Omni Tool can write a scan report on me"));
        }
    }
    //NOTE: just a helper method I have pulled out of the Keyboard helper
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingShift() {
        return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(),
                GLFW.GLFW_KEY_LEFT_SHIFT);
    }
}