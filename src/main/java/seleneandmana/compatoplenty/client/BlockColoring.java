package seleneandmana.compatoplenty.client;

import biomesoplenty.core.ClientProxy;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import seleneandmana.compatoplenty.core.CompatOPlenty;
import seleneandmana.compatoplenty.core.registry.CompatBlocks;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BlockColoring {

    @SubscribeEvent
    public static void onBiomeColoring(ColorHandlerEvent.Block event) {
        final BlockColors blockColors = event.getBlockColors();
        //Normal
        blockColors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(), CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), CompatBlocks.FLOWERING_OAK_HEDGE.get(), CompatBlocks.MAHOGANY_LEAF_CARPET.get(), CompatBlocks.MAHOGANY_HEDGE.get(), CompatBlocks.WILLOW_LEAF_CARPET.get(), CompatBlocks.WILLOW_HEDGE.get(), CompatBlocks.PALM_LEAF_CARPET.get(), CompatBlocks.PALM_HEDGE.get());
        //Rainbow
        blockColors.register((state, world, pos, tint) -> world != null && pos != null ? ClientProxy.getRainbowBirchColor(world, pos) : FoliageColor.getDefaultColor(), CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(), CompatBlocks.RAINBOW_BIRCH_HEDGE.get());
    }

    @SubscribeEvent
    public static void onItemColoring(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
        final ItemColors itemColors = event.getItemColors();

        itemColors.register((stack, tint) -> {
            BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
            return blockColors.getColor(state, (Level) null, (BlockPos) null, tint);
        }, CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), CompatBlocks.FLOWERING_OAK_HEDGE.get(), CompatBlocks.MAHOGANY_HEDGE.get(), CompatBlocks.MAHOGANY_LEAF_CARPET.get(), CompatBlocks.WILLOW_LEAF_CARPET.get(), CompatBlocks.WILLOW_HEDGE.get(), CompatBlocks.PALM_LEAF_CARPET.get(), CompatBlocks.PALM_HEDGE.get());
    }
}
