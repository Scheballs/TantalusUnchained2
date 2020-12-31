package hamdev.tantalusunchained.data;

import hamdev.tantalusunchained.common.TantalusUnchained;
import hamdev.tantalusunchained.common.items.TUChainItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import java.util.function.Supplier;


public class TUChainItemModelProvider extends ItemModelProvider {

    public TUChainItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TantalusUnchained.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(TUChainItems.ITEM_RESOURCE_SCAN_REPORT_BLANK);
        simpleItem(TUChainItems.ITEM_RESOURCE_SCAN_REPORT);
        simpleItem(TUChainItems.INGOT_TANTALUM);
        simpleItem(TUChainItems.DUST_TANTALUM);
        simpleItem(TUChainItems.NUGGET_TANTALUM);
    }

    public void simpleItem(Supplier<? extends Item> itemSupplier) {
        ResourceLocation location = itemSupplier.get().getRegistryName();
        this.getBuilder(location.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(location.getNamespace(), ITEM_FOLDER + "/" + location.getPath()));
    }
}
