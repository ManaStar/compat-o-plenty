package seleneandmana.compatoplenty.common.integration.farmersdelight;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.function.Supplier;

public class CompatPantrySuppliers {
    public static final Supplier<Block> PANTRY = () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL));
}
