package com.seleneandmana.compatoplenty.integrations;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;
import com.teamabnormals.boatload.common.item.FurnaceBoatItem;
import com.teamabnormals.boatload.common.item.LargeBoatItem;
import com.teamabnormals.boatload.core.api.BoatloadBoatType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CompatBoatTypes {
    public static final BoatloadBoatType JACARANDA = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "jacaranda"), () -> BOPBlocks.JACARANDA_PLANKS.asItem(), () -> BOPItems.JACARANDA_BOAT, () -> BOPItems.JACARANDA_CHEST_BOAT, () -> CompatItems.JACARANDA_FURNACE_BOAT.get(), () -> CompatItems.LARGE_JACARANDA_BOAT.get()));
    public static final BoatloadBoatType FIR = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "fir"), () -> BOPBlocks.FIR_PLANKS.asItem(), () -> BOPItems.FIR_BOAT, () -> BOPItems.FIR_CHEST_BOAT, () -> CompatItems.FIR_FURNACE_BOAT.get(), () -> CompatItems.LARGE_FIR_BOAT.get()));
    public static final BoatloadBoatType REDWOOD = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "redwood"), () -> BOPBlocks.REDWOOD_PLANKS.asItem(), () -> BOPItems.REDWOOD_BOAT, () -> BOPItems.REDWOOD_CHEST_BOAT, () -> CompatItems.REDWOOD_FURNACE_BOAT.get(), () -> CompatItems.LARGE_REDWOOD_BOAT.get()));
    public static final BoatloadBoatType MAHOGANY = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "mahogany"), () -> BOPBlocks.MAHOGANY_PLANKS.asItem(), () -> BOPItems.MAHOGANY_BOAT, () -> BOPItems.MAHOGANY_CHEST_BOAT, () -> CompatItems.MAHOGANY_FURNACE_BOAT.get(), () -> CompatItems.LARGE_MAHOGANY_BOAT.get()));
    public static final BoatloadBoatType WILLOW = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "willow"), () -> BOPBlocks.WILLOW_PLANKS.asItem(), () -> BOPItems.WILLOW_BOAT, () -> BOPItems.WILLOW_CHEST_BOAT, () -> CompatItems.WILLOW_FURNACE_BOAT.get(), () -> CompatItems.LARGE_WILLOW_BOAT.get()));
    public static final BoatloadBoatType MAGIC = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "magic"), () -> BOPBlocks.MAGIC_PLANKS.asItem(), () -> BOPItems.MAGIC_BOAT, () -> BOPItems.MAGIC_CHEST_BOAT, () -> CompatItems.MAGIC_FURNACE_BOAT.get(), () -> CompatItems.LARGE_MAGIC_BOAT.get()));
    public static final BoatloadBoatType DEAD = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "dead"), () -> BOPBlocks.DEAD_PLANKS.asItem(), () -> BOPItems.DEAD_BOAT, () -> BOPItems.DEAD_CHEST_BOAT, () -> CompatItems.DEAD_FURNACE_BOAT.get(), () -> CompatItems.LARGE_DEAD_BOAT.get()));
    public static final BoatloadBoatType UMBRAN = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "umbran"), () -> BOPBlocks.UMBRAN_PLANKS.asItem(), () -> BOPItems.UMBRAN_BOAT, () -> BOPItems.UMBRAN_CHEST_BOAT, () -> CompatItems.UMBRAN_FURNACE_BOAT.get(), () -> CompatItems.LARGE_UMBRAN_BOAT.get()));
    public static final BoatloadBoatType PALM = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "palm"), () -> BOPBlocks.PALM_PLANKS.asItem(), () -> BOPItems.PALM_BOAT, () -> BOPItems.PALM_CHEST_BOAT, () -> CompatItems.PALM_FURNACE_BOAT.get(), () -> CompatItems.LARGE_PALM_BOAT.get()));
    public static final BoatloadBoatType HELLBARK = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "hellbark"), () -> BOPBlocks.HELLBARK_PLANKS.asItem(), () -> BOPItems.HELLBARK_BOAT, () -> BOPItems.HELLBARK_CHEST_BOAT, () -> CompatItems.HELLBARK_FURNACE_BOAT.get(), () -> CompatItems.LARGE_HELLBARK_BOAT.get()));
    public static final BoatloadBoatType EMPYREAL = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation(CompatOPlenty.MOD_ID, "empyreal"), () -> BOPBlocks.EMPYREAL_PLANKS.asItem(), () -> BOPItems.EMPYREAL_BOAT, () -> BOPItems.EMPYREAL_CHEST_BOAT, () -> CompatItems.EMPYREAL_FURNACE_BOAT.get(), () -> CompatItems.LARGE_EMPYREAL_BOAT.get()));

    //Furnace Boats
    public static final Supplier<Item> JACARANDA_FURNACE_BOAT = () -> new FurnaceBoatItem(JACARANDA);
    public static final Supplier<Item> FIR_FURNACE_BOAT = () -> new FurnaceBoatItem(FIR);
    public static final Supplier<Item> REDWOOD_FURNACE_BOAT = () -> new FurnaceBoatItem(REDWOOD);
    public static final Supplier<Item> MAHOGANY_FURNACE_BOAT = () -> new FurnaceBoatItem(MAHOGANY);
    public static final Supplier<Item> WILLOW_FURNACE_BOAT = () -> new FurnaceBoatItem(WILLOW);
    public static final Supplier<Item> MAGIC_FURNACE_BOAT = () -> new FurnaceBoatItem(MAGIC);
    public static final Supplier<Item> DEAD_FURNACE_BOAT = () -> new FurnaceBoatItem(DEAD);
    public static final Supplier<Item> UMBRAN_FURNACE_BOAT = () -> new FurnaceBoatItem(UMBRAN);
    public static final Supplier<Item> PALM_FURNACE_BOAT = () -> new FurnaceBoatItem(PALM);
    public static final Supplier<Item> HELLBARK_FURNACE_BOAT = () -> new FurnaceBoatItem(HELLBARK);
    public static final Supplier<Item> EMPYREAL_FURNACE_BOAT = () -> new FurnaceBoatItem(EMPYREAL);

    //Large Boats
    public static final Supplier<Item> LARGE_JACARANDA_BOAT = () -> new LargeBoatItem(JACARANDA);
    public static final Supplier<Item> LARGE_FIR_BOAT = () -> new LargeBoatItem(FIR);
    public static final Supplier<Item> LARGE_REDWOOD_BOAT = () -> new LargeBoatItem(REDWOOD);
    public static final Supplier<Item> LARGE_MAHOGANY_BOAT = () -> new LargeBoatItem(MAHOGANY);
    public static final Supplier<Item> LARGE_WILLOW_BOAT = () -> new LargeBoatItem(WILLOW);
    public static final Supplier<Item> LARGE_MAGIC_BOAT = () -> new LargeBoatItem(MAGIC);
    public static final Supplier<Item> LARGE_DEAD_BOAT = () -> new LargeBoatItem(DEAD);
    public static final Supplier<Item> LARGE_UMBRAN_BOAT = () -> new LargeBoatItem(UMBRAN);
    public static final Supplier<Item> LARGE_PALM_BOAT = () -> new LargeBoatItem(PALM);
    public static final Supplier<Item> LARGE_HELLBARK_BOAT = () -> new LargeBoatItem(HELLBARK);
    public static final Supplier<Item> LARGE_EMPYREAL_BOAT = () -> new LargeBoatItem(EMPYREAL);
}
