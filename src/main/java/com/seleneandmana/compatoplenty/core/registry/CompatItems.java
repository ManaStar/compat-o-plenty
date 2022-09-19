package com.seleneandmana.compatoplenty.core.registry;

import com.seleneandmana.compatoplenty.integrations.boatload.CompatBoatTypes;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatItems {
    public static final ItemSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> GLOWING_MOSS_PASTE = HELPER.createCompatItem("glowing_moss_paste", new Item.Properties(), CreativeModeTab.TAB_MATERIALS, CompatOPlenty.QUARK_ID);

    //Chest Boats
    public static final RegistryObject<Item> CHERRY_CHEST_BOAT = HELPER.createItem("cherry_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.CHERRY_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_CHEST_BOAT = HELPER.createItem("jacaranda_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.JACARANDA_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIR_CHEST_BOAT = HELPER.createItem("fir_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.FIR_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_CHEST_BOAT = HELPER.createItem("redwood_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.REDWOOD_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_CHEST_BOAT = HELPER.createItem("mahogany_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.MAHOGANY_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CHEST_BOAT = HELPER.createItem("willow_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.WILLOW_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_CHEST_BOAT = HELPER.createItem("magic_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.MAGIC_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEAD_CHEST_BOAT = HELPER.createItem("dead_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.DEAD_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_CHEST_BOAT = HELPER.createItem("umbran_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.UMBRAN_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALM_CHEST_BOAT = HELPER.createItem("palm_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.PALM_CHEST_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_CHEST_BOAT = HELPER.createItem("hellbark_chest_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.HELLBARK_CHEST_BOAT : () -> new Item(new Item.Properties()));

    //Furnace Boats
    public static final RegistryObject<Item> CHERRY_FURNACE_BOAT = HELPER.createItem("cherry_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.CHERRY_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_FURNACE_BOAT = HELPER.createItem("jacaranda_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.JACARANDA_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIR_FURNACE_BOAT = HELPER.createItem("fir_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.FIR_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_FURNACE_BOAT = HELPER.createItem("redwood_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.REDWOOD_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_FURNACE_BOAT = HELPER.createItem("mahogany_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.MAHOGANY_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_FURNACE_BOAT = HELPER.createItem("willow_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.WILLOW_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_FURNACE_BOAT = HELPER.createItem("magic_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.MAGIC_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEAD_FURNACE_BOAT = HELPER.createItem("dead_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.DEAD_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_FURNACE_BOAT = HELPER.createItem("umbran_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.UMBRAN_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALM_FURNACE_BOAT = HELPER.createItem("palm_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.PALM_FURNACE_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_FURNACE_BOAT = HELPER.createItem("hellbark_furnace_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.HELLBARK_FURNACE_BOAT : () -> new Item(new Item.Properties()));

    //Large Boats
    public static final RegistryObject<Item> LARGE_CHERRY_BOAT = HELPER.createItem("large_cherry_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_CHERRY_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_JACARANDA_BOAT = HELPER.createItem("large_jacaranda_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_JACARANDA_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_FIR_BOAT = HELPER.createItem("large_fir_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_FIR_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_REDWOOD_BOAT = HELPER.createItem("large_redwood_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_REDWOOD_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_MAHOGANY_BOAT = HELPER.createItem("large_mahogany_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_MAHOGANY_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_WILLOW_BOAT = HELPER.createItem("large_willow_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_WILLOW_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_MAGIC_BOAT = HELPER.createItem("large_magic_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_MAGIC_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_DEAD_BOAT = HELPER.createItem("large_dead_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_DEAD_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_UMBRAN_BOAT = HELPER.createItem("large_umbran_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_UMBRAN_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_PALM_BOAT = HELPER.createItem("large_palm_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_PALM_BOAT : () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARGE_HELLBARK_BOAT = HELPER.createItem("large_hellbark_boat", ItemSubRegistryHelper.areModsLoaded(CompatOPlenty.BOATLOAD_ID) ? CompatBoatTypes.LARGE_HELLBARK_BOAT : () -> new Item(new Item.Properties()));
}
