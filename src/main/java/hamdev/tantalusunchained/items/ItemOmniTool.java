
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

import static hamdev.tantalusunchained.util.helpers.*;

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
                //TODO: Create a 1 to 3 second delay between chat messages somehow
                helpers.densityScanComplete(playerIn,x,z);

                ItemStack reportItemStackHas = new ItemStack(ModItems.ITEM_RESOURCE_SCAN_REPORT.get());
                ItemStack reportItemStackNew = new ItemStack(ModItems.ITEM_RESOURCE_SCAN_REPORT.get());
                // Checks for the Item Resource Scan Report
                if(playerIn.inventory.hasItemStack(reportItemStackHas) && !reportItemStackHas.hasTag()
                        && playerIn.inventory.getFirstEmptyStack() > 0)
                {
                    int slotId1 = playerIn.inventory.getSlotFor(reportItemStackHas);
                    int slotId2 = playerIn.inventory.getFirstEmptyStack();
                    String[] resources = getDimResources(playerIn);
                    String[] densityPctStr = helpers.getResourceDensityPctString(playerIn, playerIn.chunkCoordX, playerIn.chunkCoordZ);
                    String[] resourceDensityArray = concatArrayIndexes(resources, densityPctStr);
                    String worldName = playerIn.world.getDimensionKey().getLocation().toString(); // minecraft:overworld
                    String chunkCords = "[" + playerIn.chunkCoordX+"x,"+playerIn.chunkCoordZ + "z]"; // [10x,4z]

                    playerIn.inventory.add(slotId2, reportItemStackNew);
                    CompoundNBT nbt = new CompoundNBT();
                    nbt.putString(TantalusUnchained.MOD_SHORT_NAME + ":world" , worldName);
                    nbt.putString(TantalusUnchained.MOD_SHORT_NAME + ":chunk" , chunkCords);
                    for (int i=0; i<resourceDensityArray.length ; i++) {
                        nbt.putString(TantalusUnchained.MOD_SHORT_NAME + ":resource_density"+i, resourceDensityArray[i]);
                    }
                    playerIn.inventory.getStackInSlot(slotId2).setTag(nbt);
                    String disName = worldName +" Chunk [" + playerIn.chunkCoordX + "x," + playerIn.chunkCoordZ +"z] scan";
                    playerIn.inventory.getStackInSlot(slotId2).setDisplayName(new StringTextComponent(disName));
                    playerIn.inventory.getStackInSlot(slotId1).shrink(1);
                    LOGGER.debug("resources array...");
                    LOGGER.debug(Arrays.toString(resources));
                    LOGGER.debug("densityPctStr array...");
                    LOGGER.debug(Arrays.toString(densityPctStr));
                    LOGGER.debug("resourceDensityArray array...");
                    LOGGER.debug(Arrays.toString(resourceDensityArray));
                }
                return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
            }
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}