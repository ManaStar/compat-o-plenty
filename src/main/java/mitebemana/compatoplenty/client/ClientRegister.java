package mitebemana.compatoplenty.client;

import mitebemana.compatoplenty.core.CompatOPlenty;
import mitebemana.compatoplenty.core.registry.CompatBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {

    @SubscribeEvent
    public static void registerClient(FMLClientSetupEvent event) {
        event.enqueueWork(ClientRegister::setupRenderLayer);
    }

    public static void setupRenderLayer() {
        RenderTypeLookup.setRenderLayer(CompatBlocks.CHERRY_LADDER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.CHERRY_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.STRIPPED_CHERRY_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.WHITE_CHERRY_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.PINK_CHERRY_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.WHITE_CHERRY_LEAF_CARPET.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.PINK_CHERRY_LEAF_CARPET.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(CompatBlocks.JACARANDA_LADDER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.JACARANDA_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.STRIPPED_JACARANDA_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.JACARANDA_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.JACARANDA_LEAF_CARPET.get(), RenderType.cutout());
    }
}
