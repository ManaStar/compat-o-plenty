package com.seleneandmana.compatoplenty.integrations;

import net.mehvahdjukaar.vsc.CutBlockType;
import net.mehvahdjukaar.vsc.temp.TempVerticalSlabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.BiFunction;

public class VSlabCompatSuppliers {

    public static final BiFunction<BlockBehaviour.Properties, Block, Block> V_SLAB = (props, slab) -> new TempVerticalSlabBlock(props, new CutBlockType(null, null, slab));

}
