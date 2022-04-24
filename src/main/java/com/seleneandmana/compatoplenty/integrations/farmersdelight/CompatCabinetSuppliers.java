package com.seleneandmana.compatoplenty.integrations.farmersdelight;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class CompatCabinetSuppliers {
    public static final Supplier<Block> CABINET = () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL));
}
