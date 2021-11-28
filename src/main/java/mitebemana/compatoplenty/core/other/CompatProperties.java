package mitebemana.compatoplenty.core.other;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class CompatProperties {
    //Cherry
    public static final AbstractBlock.Properties CHERRY_BOOKSHELF = AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(1.5f).harvestTool(ToolType.AXE).sound(SoundType.WOOD);
    public static final AbstractBlock.Properties CHERRY_LADDER = AbstractBlock.Properties.of(Material.DECORATION).strength(0.4f).noOcclusion().harvestTool(ToolType.AXE).sound(SoundType.LADDER);
    public static final AbstractBlock.Properties LEAF_CARPET = AbstractBlock.Properties.of(Material.CLOTH_DECORATION).strength(0.0f).sound(SoundType.GRASS).noOcclusion();
}
