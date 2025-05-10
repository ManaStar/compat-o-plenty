package com.seleneandmana.compatoplenty.integrations;

import com.ninni.twigs.registry.TwigsItems;
import net.minecraft.world.item.ItemStack;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.function.Predicate;

import static com.seleneandmana.compatoplenty.core.registry.CompatItems.of;

public class TwigsSuppliers {
    public static final Predicate<ItemStack> TABLE_PREDICATE = of(TwigsItems.WARPED_TABLE::get);
}