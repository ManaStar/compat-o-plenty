package seleneandmana.compatoplenty.integrations.farmersdelight;

import com.teamabnormals.blueprint.core.util.item.filling.TargetedItemCategoryFiller;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.registry.ModItems;

public class CompatCabinetBlock extends CabinetBlock {
    private static final TargetedItemCategoryFiller FILLER = new TargetedItemCategoryFiller(ModItems.WARPED_CABINET);

    public CompatCabinetBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> item) {
        FILLER.fillItem(this.asItem(), tab, item);
    }

}
