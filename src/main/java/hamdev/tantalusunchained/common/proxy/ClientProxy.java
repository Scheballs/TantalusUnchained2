package hamdev.tantalusunchained.common.proxy;

import hamdev.tantalusunchained.common.TantalusUnchained;
import hamdev.tantalusunchained.common.block.TUChainBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TantalusUnchained.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientProxy implements IProxy {
    @Override
    public void setup(IEventBus mod, IEventBus forge){
        RenderTypeLookup.setRenderLayer(TUChainBlocks.TANTALIZING_SAPLING.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(TUChainBlocks.TANTALUM_TANK.get(), RenderType.getCutout());
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
