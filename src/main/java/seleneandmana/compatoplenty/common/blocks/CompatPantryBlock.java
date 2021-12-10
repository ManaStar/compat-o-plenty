package seleneandmana.compatoplenty.common.blocks;

import com.minecraftabnormals.abnormals_core.core.util.item.filling.TargetedItemGroupFiller;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import vectorwing.farmersdelight.blocks.PantryBlock;
import vectorwing.farmersdelight.registry.ModItems;

public class CompatPantryBlock extends PantryBlock {
    private static final TargetedItemGroupFiller FILLER = new TargetedItemGroupFiller(ModItems.WARPED_PANTRY);

    public CompatPantryBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void fillItemCategory(ItemGroup group, NonNullList<ItemStack> item) {
        FILLER.fillItem(this.asItem(), group, item);
    }

}
