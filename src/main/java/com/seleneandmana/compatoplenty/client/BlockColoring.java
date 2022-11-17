package com.seleneandmana.compatoplenty.client;

import biomesoplenty.client.handler.ColorHandler;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BlockColoring {

    @SubscribeEvent
    public static void onBiomeColoring(RegisterColorHandlersEvent.Block event) {
        final BlockColors blockColors = event.getBlockColors();
        //Normal
        blockColors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(), CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), CompatBlocks.FLOWERING_OAK_LEAF_PILE.get(), CompatBlocks.FLOWERING_OAK_HEDGE.get(), CompatBlocks.MAHOGANY_LEAF_CARPET.get(), CompatBlocks.MAHOGANY_LEAF_PILE.get(), CompatBlocks.MAHOGANY_HEDGE.get(), CompatBlocks.WILLOW_LEAF_CARPET.get(), CompatBlocks.WILLOW_LEAF_PILE.get(), CompatBlocks.WILLOW_HEDGE.get(), CompatBlocks.PALM_LEAF_CARPET.get(), CompatBlocks.PALM_LEAF_PILE.get(), CompatBlocks.PALM_HEDGE.get());
        //Rainbow
        blockColors.register((state, world, pos, tint) -> world != null && pos != null ? ColorHandler.getRainbowBirchColor(world, pos) : FoliageColor.getDefaultColor(), CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(), CompatBlocks.RAINBOW_BIRCH_LEAF_PILE.get(), CompatBlocks.RAINBOW_BIRCH_HEDGE.get());
    }

    @SubscribeEvent
    public static void onItemColoring(RegisterColorHandlersEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
        final ItemColors itemColors = event.getItemColors();

        itemColors.register((stack, tint) -> {
            BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();

            return tint == 0 ? blockColors.getColor(state, (Level) null, (BlockPos) null, tint) : 0xFFFFFFFF;
        }, CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), CompatBlocks.FLOWERING_OAK_LEAF_PILE.get(), CompatBlocks.FLOWERING_OAK_HEDGE.get(), CompatBlocks.MAHOGANY_HEDGE.get(), CompatBlocks.MAHOGANY_LEAF_CARPET.get(), CompatBlocks.MAHOGANY_LEAF_PILE.get(), CompatBlocks.WILLOW_LEAF_CARPET.get(), CompatBlocks.WILLOW_LEAF_PILE.get(), CompatBlocks.WILLOW_HEDGE.get(), CompatBlocks.PALM_LEAF_CARPET.get(), CompatBlocks.PALM_LEAF_PILE.get(), CompatBlocks.PALM_HEDGE.get());
    }
}
