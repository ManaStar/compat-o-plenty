package seleneandmana.compatoplenty.core;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("compatoplenty")
public class CompatOPlenty
{
    public static final String MOD_ID = "compatoplenty";
    public static final String QUARK_ID = "quark";
    public static final String BUZZIER_ID = "buzzier_bees";

    private static final Logger LOGGER = LogManager.getLogger();
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public CompatOPlenty() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRY_HELPER.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
