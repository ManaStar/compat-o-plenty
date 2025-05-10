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

    //TODO: Replace with full blockstate/model datagen!
    @SubscribeEvent
    public static void registerClient(FMLClientSetupEvent event) {
        event.enqueueWork(ClientRegister::setupRenderLayer);
    }

    private static void setupRenderLayers(CompatBlocks.LeafSet set) {
        ItemBlockRenderTypes.setRenderLayer(set.hedge().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.leafCarpet().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.leafPile().get(), RenderType.cutout());
    }

    private static void setupRenderLayers(CompatBlocks.WoodSet set) {
        ItemBlockRenderTypes.setRenderLayer(set.ladder().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.post().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.strippedPost().get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(set.table().get(), RenderType.cutout());
    }

    public static void setupRenderLayer() {
        CompatBlocks.leaveSets().forEach(ClientRegister::setupRenderLayers);
        CompatBlocks.woodSets().forEach(ClientRegister::setupRenderLayers);
    }
}
