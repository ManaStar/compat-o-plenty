package com.seleneandmana.compatoplenty.integrations.boatload;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;
import com.teamabnormals.boatload.common.item.ChestBoatItem;
import com.teamabnormals.boatload.common.item.FurnaceBoatItem;
import com.teamabnormals.boatload.common.item.LargeBoatItem;
import com.teamabnormals.boatload.core.api.BoatloadBoatType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CompatBoatTypes {
    public static final BoatloadBoatType CHERRY = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "cherry"), () -> BOPBlocks.CHERRY_PLANKS.asItem(), () -> BOPItems.CHERRY_BOAT, () -> CompatItems.CHERRY_CHEST_BOAT.get(), () -> CompatItems.CHERRY_FURNACE_BOAT.get(), () -> CompatItems.LARGE_CHERRY_BOAT.get()));
    public static final BoatloadBoatType JACARANDA = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "jacaranda"), () -> BOPBlocks.JACARANDA_PLANKS.asItem(), () -> BOPItems.JACARANDA_BOAT, () -> CompatItems.JACARANDA_CHEST_BOAT.get(), () -> CompatItems.JACARANDA_FURNACE_BOAT.get(), () -> CompatItems.LARGE_JACARANDA_BOAT.get()));
    public static final BoatloadBoatType FIR = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "fir"), () -> BOPBlocks.FIR_PLANKS.asItem(), () -> BOPItems.FIR_BOAT, () -> CompatItems.FIR_CHEST_BOAT.get(), () -> CompatItems.FIR_FURNACE_BOAT.get(), () -> CompatItems.LARGE_FIR_BOAT.get()));
    public static final BoatloadBoatType REDWOOD = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "redwood"), () -> BOPBlocks.REDWOOD_PLANKS.asItem(), () -> BOPItems.REDWOOD_BOAT, () -> CompatItems.REDWOOD_CHEST_BOAT.get(), () -> CompatItems.REDWOOD_FURNACE_BOAT.get(), () -> CompatItems.LARGE_REDWOOD_BOAT.get()));
    public static final BoatloadBoatType MAHOGANY = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "mahogany"), () -> BOPBlocks.MAHOGANY_PLANKS.asItem(), () -> BOPItems.MAHOGANY_BOAT, () -> CompatItems.MAHOGANY_CHEST_BOAT.get(), () -> CompatItems.MAHOGANY_FURNACE_BOAT.get(), () -> CompatItems.LARGE_MAHOGANY_BOAT.get()));
    public static final BoatloadBoatType WILLOW = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "willow"), () -> BOPBlocks.WILLOW_PLANKS.asItem(), () -> BOPItems.WILLOW_BOAT, () -> CompatItems.WILLOW_CHEST_BOAT.get(), () -> CompatItems.WILLOW_FURNACE_BOAT.get(), () -> CompatItems.LARGE_WILLOW_BOAT.get()));
    public static final BoatloadBoatType MAGIC = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "magic"), () -> BOPBlocks.MAGIC_PLANKS.asItem(), () -> BOPItems.MAGIC_BOAT, () -> CompatItems.MAGIC_CHEST_BOAT.get(), () -> CompatItems.MAGIC_FURNACE_BOAT.get(), () -> CompatItems.LARGE_MAGIC_BOAT.get()));
    public static final BoatloadBoatType DEAD = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "dead"), () -> BOPBlocks.DEAD_PLANKS.asItem(), () -> BOPItems.DEAD_BOAT, () -> CompatItems.DEAD_CHEST_BOAT.get(), () -> CompatItems.DEAD_FURNACE_BOAT.get(), () -> CompatItems.LARGE_DEAD_BOAT.get()));
    public static final BoatloadBoatType UMBRAN = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "umbran"), () -> BOPBlocks.UMBRAN_PLANKS.asItem(), () -> BOPItems.UMBRAN_BOAT, () -> CompatItems.UMBRAN_CHEST_BOAT.get(), () -> CompatItems.UMBRAN_FURNACE_BOAT.get(), () -> CompatItems.LARGE_UMBRAN_BOAT.get()));
    public static final BoatloadBoatType PALM = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "palm"), () -> BOPBlocks.PALM_PLANKS.asItem(), () -> BOPItems.PALM_BOAT, () -> CompatItems.PALM_CHEST_BOAT.get(), () -> CompatItems.PALM_FURNACE_BOAT.get(), () -> CompatItems.LARGE_PALM_BOAT.get()));
    public static final BoatloadBoatType HELLBARK = BoatloadBoatType.register(BoatloadBoatType.create(new ResourceLocation("biomesoplenty", "hellbark"), () -> BOPBlocks.HELLBARK_PLANKS.asItem(), () -> BOPItems.HELLBARK_BOAT, () -> CompatItems.HELLBARK_CHEST_BOAT.get(), () -> CompatItems.HELLBARK_FURNACE_BOAT.get(), () -> CompatItems.LARGE_HELLBARK_BOAT.get()));

    //Chest Boats
    public static final Supplier<Item> CHERRY_CHEST_BOAT = () -> new ChestBoatItem(CHERRY);
    public static final Supplier<Item> JACARANDA_CHEST_BOAT = () -> new ChestBoatItem(JACARANDA);
    public static final Supplier<Item> FIR_CHEST_BOAT = () -> new ChestBoatItem(FIR);
    public static final Supplier<Item> REDWOOD_CHEST_BOAT = () -> new ChestBoatItem(REDWOOD);
    public static final Supplier<Item> MAHOGANY_CHEST_BOAT = () -> new ChestBoatItem(MAHOGANY);
    public static final Supplier<Item> WILLOW_CHEST_BOAT = () -> new ChestBoatItem(WILLOW);
    public static final Supplier<Item> MAGIC_CHEST_BOAT = () -> new ChestBoatItem(MAGIC);
    public static final Supplier<Item> DEAD_CHEST_BOAT = () -> new ChestBoatItem(DEAD);
    public static final Supplier<Item> UMBRAN_CHEST_BOAT = () -> new ChestBoatItem(UMBRAN);
    public static final Supplier<Item> PALM_CHEST_BOAT = () -> new ChestBoatItem(PALM);
    public static final Supplier<Item> HELLBARK_CHEST_BOAT = () -> new ChestBoatItem(HELLBARK);

    //Furnace Boats
    public static final Supplier<Item> CHERRY_FURNACE_BOAT = () -> new FurnaceBoatItem(CHERRY);
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

    //Large Boats
    public static final Supplier<Item> LARGE_CHERRY_BOAT = () -> new LargeBoatItem(CHERRY);
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
}
