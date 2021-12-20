package seleneandmana.compatoplenty.core;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import seleneandmana.compatoplenty.core.other.CompatCompat;
import seleneandmana.compatoplenty.core.registry.util.CompatBlockSubRegistryHelper;

@Mod("compatoplenty")
@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatOPlenty
{
    public static final String MOD_ID = "compatoplenty";
    public static final String QUARK_ID = "quark";
    public static final String BUZZIER_ID = "buzzier_bees";

    private static final Logger LOGGER = LogManager.getLogger();
    public static final RegistryHelper REGISTRY_HELPER = RegistryHelper.create(MOD_ID, helper -> {
        helper.putSubHelper(ForgeRegistries.BLOCKS, new CompatBlockSubRegistryHelper(helper));
    });

    public CompatOPlenty() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRY_HELPER.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::compatSetup);
    }

    private void compatSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(CompatCompat::compatList);
    }
}
