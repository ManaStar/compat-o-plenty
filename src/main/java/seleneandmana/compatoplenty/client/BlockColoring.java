package seleneandmana.compatoplenty.client;

import biomesoplenty.core.ClientProxy;
import seleneandmana.compatoplenty.core.CompatOPlenty;
import seleneandmana.compatoplenty.core.registry.CompatBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BlockColoring {

    @SubscribeEvent
    public static void onBiomeColoring(ColorHandlerEvent.Block event) {
        final BlockColors blockColors = event.getBlockColors();
        //Normal
        blockColors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColors.getDefaultColor(), CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), CompatBlocks.FLOWERING_OAK_HEDGE.get());
        //Rainbow
        blockColors.register((state, world, pos, tint) -> world != null && pos != null ? ClientProxy.getRainbowBirchColor(world, pos) : FoliageColors.getDefaultColor(), CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(), CompatBlocks.RAINBOW_BIRCH_HEDGE.get());
    }

    @SubscribeEvent
    public static void onItemColoring(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
        final ItemColors itemColors = event.getItemColors();

        itemColors.register((stack, tint) -> {
            BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
            return blockColors.getColor(state, (IBlockDisplayReader) null, (BlockPos) null, tint);
        }, CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), CompatBlocks.FLOWERING_OAK_HEDGE.get());
    }
}
