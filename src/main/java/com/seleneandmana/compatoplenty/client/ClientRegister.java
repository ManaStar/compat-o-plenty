package com.seleneandmana.compatoplenty.client;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {

    @SubscribeEvent
    public static void registerClient(FMLClientSetupEvent event) {
        event.enqueueWork(ClientRegister::setupRenderLayer);
    }

    public static void setupRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.CHERRY_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.CHERRY_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_CHERRY_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WHITE_CHERRY_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.PINK_CHERRY_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WHITE_CHERRY_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.PINK_CHERRY_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.CHERRY_TABLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.JACARANDA_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.JACARANDA_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_JACARANDA_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.JACARANDA_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.JACARANDA_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.JACARANDA_TABLE.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.FIR_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.FIR_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_FIR_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.FIR_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.FIR_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.FIR_TABLE.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.REDWOOD_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.REDWOOD_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_REDWOOD_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.REDWOOD_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.REDWOOD_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.REDWOOD_TABLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAHOGANY_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAHOGANY_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_MAHOGANY_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAHOGANY_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAHOGANY_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAHOGANY_TABLE.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WILLOW_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WILLOW_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_WILLOW_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WILLOW_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WILLOW_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.WILLOW_TABLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAGIC_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAGIC_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_MAGIC_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAGIC_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAGIC_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAGIC_TABLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.DEAD_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.DEAD_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_DEAD_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.DEAD_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.DEAD_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.DEAD_TABLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.UMBRAN_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.UMBRAN_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_UMBRAN_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.UMBRAN_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.UMBRAN_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.UMBRAN_TABLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.PALM_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.PALM_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_PALM_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.PALM_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.PALM_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.PALM_TABLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.HELLBARK_LADDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.HELLBARK_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.STRIPPED_HELLBARK_POST.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.HELLBARK_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.HELLBARK_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.HELLBARK_TABLE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.FLOWERING_OAK_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.RAINBOW_BIRCH_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.ORIGIN_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.ORIGIN_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAPLE_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.MAPLE_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.ORANGE_AUTUMN_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.ORANGE_AUTUMN_HEDGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.YELLOW_AUTUMN_LEAF_CARPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CompatBlocks.YELLOW_AUTUMN_HEDGE.get(), RenderType.cutout());
    }
}
