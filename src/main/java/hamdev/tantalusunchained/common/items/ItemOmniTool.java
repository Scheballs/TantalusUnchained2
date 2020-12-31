
package hamdev.tantalusunchained.common.items;

import hamdev.tantalusunchained.common.TantalusUnchained;
import hamdev.tantalusunchained.common.util.helpers;
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
import java.util.List;

import static hamdev.tantalusunchained.common.util.helpers.*;

public class ItemOmniTool extends Item {
    public ItemOmniTool() {
        super(new Item.Properties().group(TantalusUnchained.CREATIVE_TAB));
    }

    @Override
    public void addInformation(ItemStack stack, World player, List<ITextComponent> list, ITooltipFlag flag) {
        super.addInformation(stack, player, list, flag);
        list.add(new StringTextComponent("\u00a72" + "Right Click to scan for resources"));
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
                //TODO: Create a 1 to 3 second delay between chat messages somehow
                helpers.densityScanComplete(playerIn,x,z);

                ItemStack reportItemStackHas = new ItemStack(TUChainItems.ITEM_RESOURCE_SCAN_REPORT_BLANK.get());
                ItemStack reportItemStackNew = new ItemStack(TUChainItems.ITEM_RESOURCE_SCAN_REPORT.get());
                // Checks for the Item Resource Scan Report
                if(playerIn.inventory.hasItemStack(reportItemStackHas) && !reportItemStackHas.hasTag()
                        && playerIn.inventory.getFirstEmptyStack() > 0)
                {
                    int slotId1 = playerIn.inventory.getSlotFor(reportItemStackHas);
                    int slotId2 = playerIn.inventory.getFirstEmptyStack();
                    String[] resources = getDimResources(playerIn);
                    String[] densityPctStr = helpers.getResourceDensityPctString(playerIn, x, z);
                    String[] resourceDensityArray = concatArrayIndexes(resources, densityPctStr);
                    String worldName = getDimName(playerIn); // ex. The Nether
                    String chunkCords = "[" + playerIn.chunkCoordX +"x,"+ playerIn.chunkCoordZ + "z]"; // [10x,4z]

                    playerIn.inventory.add(slotId2, reportItemStackNew);
                    CompoundNBT nbt = new CompoundNBT();
                    for (int i=0; i<resourceDensityArray.length ; i++) {
                        nbt.putString("Density"+i, resourceDensityArray[i]);
                    }
                    playerIn.inventory.getStackInSlot(slotId2).setTag(nbt);
                    String disName = worldName +" Chunk [" + playerIn.chunkCoordX + "x," + playerIn.chunkCoordZ +"z] scan";
                    playerIn.inventory.getStackInSlot(slotId2).setDisplayName(new StringTextComponent(disName));
                    playerIn.inventory.getStackInSlot(slotId1).shrink(1);
                }
                return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}