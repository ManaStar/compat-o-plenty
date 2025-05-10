package com.seleneandmana.compatoplenty.integrations;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.violetmoon.quark.content.building.block.HedgeBlock;
import org.violetmoon.quark.content.building.block.LeafCarpetBlock;
import org.violetmoon.quark.content.building.block.VerticalSlabBlock;
import org.violetmoon.quark.content.building.block.WoodPostBlock;

import java.util.function.BiFunction;
import java.util.function.Function;

public class QuarkSuppliers {

    public static final BiFunction<BlockBehaviour.Properties, Block, Block> V_SLAB = (props, slab) -> new VerticalSlabBlock(() -> slab, props);

    public static final Function<Block, Block> POST = (log) -> new WoodPostBlock(null, log, null, SoundType.WOOD);

    public static final BiFunction<Block, Block, Block> HEDGE = (fence, leaves) -> new HedgeBlock(null, null, fence, leaves);

    public static final Function<Block, Block> LEAF_CARPET = (leaves) -> new LeafCarpetBlock("", leaves, null);

}
