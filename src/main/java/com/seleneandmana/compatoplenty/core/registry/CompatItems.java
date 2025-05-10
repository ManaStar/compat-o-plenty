package com.seleneandmana.compatoplenty.core.registry;

import com.seleneandmana.compatoplenty.integrations.CompatBoatTypes;
import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static com.seleneandmana.compatoplenty.core.CompatOPlenty.BOATLOAD_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.QUARK_ID;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatItems {
    public static final ItemSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> GLOWING_MOSS_PASTE = HELPER.createItem("glowing_moss_paste", () -> new Item(new Item.Properties()));

    //Furnace Boats
    public static final RegistryObject<Item> JACARANDA_FURNACE_BOAT = HELPER.createItem("jacaranda_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.JACARANDA_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIR_FURNACE_BOAT = HELPER.createItem("fir_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.FIR_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_FURNACE_BOAT = HELPER.createItem("redwood_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.REDWOOD_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_FURNACE_BOAT = HELPER.createItem("mahogany_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.MAHOGANY_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_FURNACE_BOAT = HELPER.createItem("willow_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.WILLOW_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_FURNACE_BOAT = HELPER.createItem("magic_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.MAGIC_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEAD_FURNACE_BOAT = HELPER.createItem("dead_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.DEAD_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_FURNACE_BOAT = HELPER.createItem("umbran_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.UMBRAN_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALM_FURNACE_BOAT = HELPER.createItem("palm_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.PALM_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_FURNACE_BOAT = HELPER.createItem("hellbark_furnace_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.HELLBARK_FURNACE_BOAT : () -> new Item(new Item.Properties()));

    //Large Boats
    public static final RegistryObject<Item> LARGE_JACARANDA_BOAT = HELPER.createItem("large_jacaranda_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_JACARANDA_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_FIR_BOAT = HELPER.createItem("large_fir_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_FIR_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_REDWOOD_BOAT = HELPER.createItem("large_redwood_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_REDWOOD_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_MAHOGANY_BOAT = HELPER.createItem("large_mahogany_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_MAHOGANY_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_WILLOW_BOAT = HELPER.createItem("large_willow_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_WILLOW_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_MAGIC_BOAT = HELPER.createItem("large_magic_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_MAGIC_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_DEAD_BOAT = HELPER.createItem("large_dead_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_DEAD_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_UMBRAN_BOAT = HELPER.createItem("large_umbran_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_UMBRAN_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_PALM_BOAT = HELPER.createItem("large_palm_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_PALM_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_HELLBARK_BOAT = HELPER.createItem("large_hellbark_boat", ItemSubRegistryHelper.areModsLoaded(BOATLOAD_ID) ? CompatBoatTypes.LARGE_HELLBARK_BOAT : () -> new Item(new Item.Properties()));

    public static Predicate<ItemStack> of(Supplier<? extends ItemLike> item) {
        return it -> it.is(item.get().asItem());
    }

    public static Predicate<ItemStack> of(ItemLike item) {
        return it -> it.is(item.asItem());
    }

    public static Predicate<ItemStack> anyModLoaded(String... modIds) {
        return $ -> Arrays.stream(modIds).anyMatch(BlockSubRegistryHelper::areModsLoaded);
    }

    static final CreativeModeTabContentsPopulator.Entry TAB_POPULATOR = CreativeModeTabContentsPopulator
            .mod(CompatOPlenty.MOD_ID)
            .predicate($ -> true);

    static {
        TAB_POPULATOR
                .addItemsAfter(of(Items.CHERRY_BOAT).and(anyModLoaded(BOATLOAD_ID)),
                        JACARANDA_FURNACE_BOAT,
                        LARGE_JACARANDA_BOAT,
                        FIR_FURNACE_BOAT,
                        LARGE_FIR_BOAT,
                        REDWOOD_FURNACE_BOAT,
                        LARGE_REDWOOD_BOAT,
                        MAHOGANY_FURNACE_BOAT,
                        LARGE_MAHOGANY_BOAT,
                        WILLOW_FURNACE_BOAT,
                        LARGE_WILLOW_BOAT,
                        MAGIC_FURNACE_BOAT,
                        LARGE_MAGIC_BOAT,
                        DEAD_FURNACE_BOAT,
                        LARGE_DEAD_BOAT,
                        UMBRAN_FURNACE_BOAT,
                        LARGE_UMBRAN_BOAT,
                        PALM_FURNACE_BOAT,
                        LARGE_PALM_BOAT,
                        HELLBARK_FURNACE_BOAT,
                        LARGE_HELLBARK_BOAT
                )
                .addItemsAfter(of(Items.CLAY_BALL).and(anyModLoaded(QUARK_ID)), GLOWING_MOSS_PASTE);
    }

}
