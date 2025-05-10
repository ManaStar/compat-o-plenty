package com.seleneandmana.compatoplenty.client;

import biomesoplenty.client.handler.ColorHandler;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.stream.Stream;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BlockColoring {

    private static Stream<Block> leafItems(CompatBlocks.LeafSet set) {
        return Stream.of(
                set.leafCarpet(),
                set.hedge(),
                set.leafPile()
        ).map(RegistryObject::get);
    }

    @SubscribeEvent
    public static void onBiomeColoring(RegisterColorHandlersEvent.Block event) {
        final BlockColors blockColors = event.getBlockColors();
        //Normal
        blockColors.register((state, world, pos, tint) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                Stream.of(
                        leafItems(CompatBlocks.FLOWERING_OAK),
                        leafItems(CompatBlocks.MAHOGANY.leaveSet()),
                        leafItems(CompatBlocks.WILLOW.leaveSet()),
                        leafItems(CompatBlocks.PALM.leaveSet())
                ).flatMap(Function.identity()).toArray(Block[]::new)
        );
        //Rainbow
        blockColors.register((state, world, pos, tint) -> world != null && pos != null ? ColorHandler.getRainbowBirchColor(world, pos) : -1, leafItems(CompatBlocks.RAINBOW_BIRCH).toArray(Block[]::new));
    }

    @SubscribeEvent
    public static void onItemColoring(RegisterColorHandlersEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
        final ItemColors itemColors = event.getItemColors();

        var leafBlocks = CompatBlocks.leaveSets()
                .flatMap(BlockColoring::leafItems)
                .toArray(ItemLike[]::new);

        itemColors.register((stack, tint) -> {
            BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();

            return tint == 0 ? blockColors.getColor(state, null, null, tint) : 0xFFFFFFFF;
        }, leafBlocks);
    }
}
