package hamdev.tantalusunchained.common.proxy;

import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;

public interface IProxy {

        void setup(IEventBus mod, IEventBus forge);
        World getClientWorld();
}
