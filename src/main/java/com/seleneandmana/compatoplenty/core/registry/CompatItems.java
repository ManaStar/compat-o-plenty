package com.seleneandmana.compatoplenty.core.registry;

import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatItems {
    public static final ItemSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> GLOWING_MOSS_PASTE = HELPER.createCompatItem("glowing_moss_paste", new Item.Properties(), CreativeModeTab.TAB_MATERIALS, CompatOPlenty.QUARK_ID);
}
