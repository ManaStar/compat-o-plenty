package com.seleneandmana.compatoplenty.core;

import com.seleneandmana.compatoplenty.core.data.server.ModLootTableProvider;
import com.seleneandmana.compatoplenty.core.data.server.ModRecipeProvider;
import com.seleneandmana.compatoplenty.core.data.server.tags.ModBlockTagsProvider;
import com.seleneandmana.compatoplenty.core.data.server.tags.ModItemTagsProvider;
import com.seleneandmana.compatoplenty.core.other.CompatCompat;
import com.seleneandmana.compatoplenty.core.registry.util.CompatBlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("compatoplenty")
@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompatOPlenty
{
    public static final String MOD_ID = "compatoplenty";
    public static final String QUARK_ID = "quark";
    public static final String WOODWORKS_ID = "woodworks";
    public static final String TWIGS_ID = "twigs";
    public static final String FARMERS_ID = "farmersdelight";


    public static final Logger LOGGER = LogManager.getLogger();
    public static final RegistryHelper REGISTRY_HELPER = RegistryHelper.create(MOD_ID, helper -> {
        helper.putSubHelper(ForgeRegistries.BLOCKS, new CompatBlockSubRegistryHelper(helper));
    });

    public CompatOPlenty() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRY_HELPER.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::compatSetup);
        bus.addListener(this::gatherData);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            ModBlockTagsProvider modBlockTagsProvider = new ModBlockTagsProvider(generator, fileHelper);
            generator.addProvider(modBlockTagsProvider);
            generator.addProvider(new ModItemTagsProvider(generator, modBlockTagsProvider, fileHelper));
            generator.addProvider(new ModLootTableProvider(generator));
            generator.addProvider(new ModRecipeProvider(generator));
        }
    }

    private void compatSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(CompatCompat::compatList);
    }
}
