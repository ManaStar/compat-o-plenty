package seleneandmana.compatoplenty.client;

import seleneandmana.compatoplenty.core.CompatOPlenty;
import seleneandmana.compatoplenty.core.registry.CompatBlocks;
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

        RenderTypeLookup.setRenderLayer(CompatBlocks.FIR_LADDER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.FIR_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.STRIPPED_FIR_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.FIR_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.FIR_LEAF_CARPET.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(CompatBlocks.REDWOOD_LADDER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.REDWOOD_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.STRIPPED_REDWOOD_POST.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.REDWOOD_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.REDWOOD_LEAF_CARPET.get(), RenderType.cutout());

        RenderTypeLookup.setRenderLayer(CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.FLOWERING_OAK_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.RAINBOW_BIRCH_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.ORIGIN_LEAF_CARPET.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.ORIGIN_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.MAPLE_LEAF_CARPET.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.MAPLE_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.ORANGE_AUTUMN_LEAF_CARPET.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.ORANGE_AUTUMN_HEDGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.YELLOW_AUTUMN_LEAF_CARPET.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(CompatBlocks.YELLOW_AUTUMN_HEDGE.get(), RenderType.cutout());
    }
}
