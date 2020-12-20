
package hamdev.tantalusunchained.items;

import hamdev.tantalusunchained.TantalusUnchained;
import hamdev.tantalusunchained.util.helpers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemStackHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class ItemOmniTool extends Item {
    public ItemOmniTool() {
        super(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB));
    }

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void addInformation(ItemStack stack, World player, List<ITextComponent> list, ITooltipFlag flag) {
        super.addInformation(stack, player, list, flag);
        list.add(new StringTextComponent("\u00a72Right Click to scan for resources"));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.isSneaking()) {
            return new ActionResult<ItemStack>(ActionResultType.FAIL, playerIn.getHeldItem(handIn));
        }
        else {
            if(worldIn.isRemote()) {
                int x = playerIn.getPosition().getX();
                int z = playerIn.getPosition().getZ();
                helpers.densityScanBegin(playerIn);
                //Create a 0 to 3 second delay between chat messages somehow
                helpers.densityScanComplete(playerIn,x,z);

                ItemStack omni_stack = new ItemStack(ModItems.OMNI_DATA_PAD.get());

                // Checks for the Omni Data Pad
                if(playerIn.inventory.hasItemStack(omni_stack))
                {
                    int slotId = playerIn.inventory .getSlotFor(omni_stack);
                    LogManager.getLogger().debug("slot {}",slotId);

                    double hardWaterDensity = helpers.getHardWaterDensity(x, z);

                    CompoundNBT nbt = new CompoundNBT(); // Creates a new NBT Data Object
                    // This simply saves a double variable inside of it!
                    // It is good convention to start the key of the NBT Data
                    // with your modid
                    nbt.putDouble(TantalusUnchained.MOD_ID + "hard_water_density", hardWaterDensity);

                    // Important to note, NBTData is saved on ItemStacks not on Items!
                    // Because Items are singletons.
                    playerIn.inventory.getStackInSlot(slotId).setTag(nbt);
                }

                return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}