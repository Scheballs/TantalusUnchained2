package hamdev.tantalusunchained.common.proxy;

import hamdev.tantalusunchained.common.TantalusUnchained;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TantalusUnchained.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.DEDICATED_SERVER)
public class ServerProxy implements IProxy {
    @Override
    public void setup(IEventBus mod, IEventBus forge) {
    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("The getClientWorld Cannot be run on Server!");
    }
}
