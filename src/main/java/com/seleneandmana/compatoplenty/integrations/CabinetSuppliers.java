package com.seleneandmana.compatoplenty.integrations;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import vectorwing.farmersdelight.common.block.CabinetBlock;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.function.Predicate;
import java.util.function.Supplier;

import static com.seleneandmana.compatoplenty.core.registry.CompatItems.of;

public class CabinetSuppliers {
    public static final Supplier<Block> CABINET = () -> new CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL));

    public static final Predicate<ItemStack> CABINET_PREDICATE = of(ModItems.WARPED_CABINET::get);
}