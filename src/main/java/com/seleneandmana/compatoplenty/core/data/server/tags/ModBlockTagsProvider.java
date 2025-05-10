package com.seleneandmana.compatoplenty.core.data.server.tags;

import biomesoplenty.api.block.BOPBlocks;
import com.mojang.datafixers.util.Pair;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, ExistingFileHelper fileHelper) {
        super(output, lookup, CompatOPlenty.MOD_ID, fileHelper);
    }

    private void add(CompatBlocks.LeafSet set) {
        var hedgeTag = BlockTags.create(new ResourceLocation(CompatOPlenty.QUARK_ID, "hedges"));

        tag(BlockTags.MINEABLE_WITH_AXE).add(set.hedge().get());
        tag(BlockTags.MINEABLE_WITH_HOE).add(set.leafPile().get(), set.leafCarpet().get());
        tag(BlueprintBlockTags.LEAF_PILES).add(set.leafPile().get());
        tag(hedgeTag).add(set.hedge().get());
    }

    private void add(CompatBlocks.WoodSet set) {
        tag(BlockTags.MINEABLE_WITH_AXE).add(
                set.verticalSlab().get(),
                set.bookshelf().get(),
                set.ladder().get(),
                set.strippedPost().get(),
                set.post().get(),
                set.beehive().get(),
                set.cabinet().get(),
                set.table().get(),
                set.verticalPlanks().get(),
                set.boards().get(),
                set.chest().get(),
                set.trappedChest().get()
        );
        tag(BlockTags.BEEHIVES).add(set.beehive().get());
        tag(BlockTags.CLIMBABLE).add(set.ladder().get());
        tag(BlueprintBlockTags.LADDERS).add(set.ladder().get());
        tag(BlockTags.PLANKS).add(set.verticalPlanks().get());
        tag(Tags.Blocks.CHESTS_WOODEN).add(set.chest().get(), set.trappedChest().get());
        tag(Tags.Blocks.CHESTS_TRAPPED).add(set.trappedChest().get());
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        CompatBlocks.woodSets().forEach(this::add);
        CompatBlocks.leaveSets().forEach(this::add);

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.BLACK_SANDSTONE_BRICKS.get(),
                CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get(),
                CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(),
                CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get(),
                CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(),

                CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(),

                CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICKS.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICK_WALL.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(),

                CompatBlocks.GALANOS_BLOCK.get(),
                CompatBlocks.GALANOS_PILLAR.get(),
                CompatBlocks.GALANOS_STAIRS.get(),
                CompatBlocks.GALANOS_SLAB.get(),
                CompatBlocks.GALANOS_VERTICAL_SLAB.get(),

                CompatBlocks.POLISHED_ROSE_QUARTZ.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(),
                CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(),
                CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get()
        );

        tag(BlockTags.CRYSTAL_SOUND_BLOCKS).add(
                CompatBlocks.POLISHED_ROSE_QUARTZ.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(),
                CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(),
                CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get()
        );

        tag(BlockTags.SLABS).add(
                CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(),
                CompatBlocks.GALANOS_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get()
        );

        tag(BlockTags.STAIRS).add(
                CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS.get(),
                CompatBlocks.GALANOS_STAIRS.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get()
        );

        tag(BlockTags.WALLS).add(
                CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICK_WALL.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get()
        );

        //Farmer's Delight Tags
        tag(ModTags.COMPOST_ACTIVATORS).add(
                BOPBlocks.TOADSTOOL.get(),
                BOPBlocks.GLOWSHROOM.get()
        );

        //Other Tags
        /* TODO remove
        tag(BlueprintBlockTags.HEDGES).add(
                CompatBlocks.WHITE_CHERRY_HEDGE.get(),
                CompatBlocks.PINK_CHERRY_HEDGE.get(),
                CompatBlocks.JACARANDA_HEDGE.get(),
                CompatBlocks.FIR_HEDGE.get(),
                CompatBlocks.REDWOOD_HEDGE.get(),
                CompatBlocks.MAHOGANY_HEDGE.get(),
                CompatBlocks.WILLOW_HEDGE.get(),
                CompatBlocks.MAGIC_HEDGE.get(),
                CompatBlocks.DEAD_HEDGE.get(),
                CompatBlocks.UMBRAN_HEDGE.get(),
                CompatBlocks.PALM_HEDGE.get(),
                CompatBlocks.HELLBARK_HEDGE.get(),
                CompatBlocks.FLOWERING_OAK_HEDGE.get(),
                CompatBlocks.RAINBOW_BIRCH_HEDGE.get(),
                CompatBlocks.ORIGIN_HEDGE.get(),
                CompatBlocks.MAPLE_HEDGE.get(),
                CompatBlocks.ORANGE_AUTUMN_HEDGE.get(),
                CompatBlocks.YELLOW_AUTUMN_HEDGE.get()
        );
         */

        /* TODO remove
        tag(BlueprintBlockTags.VERTICAL_SLABS).add(
                CompatBlocks.CHERRY_VERTICAL_SLAB.get(),
                CompatBlocks.JACARANDA_VERTICAL_SLAB.get(),
                CompatBlocks.FIR_VERTICAL_SLAB.get(),
                CompatBlocks.REDWOOD_VERTICAL_SLAB.get(),
                CompatBlocks.MAHOGANY_VERTICAL_SLAB.get(),
                CompatBlocks.WILLOW_VERTICAL_SLAB.get(),
                CompatBlocks.MAGIC_VERTICAL_SLAB.get(),
                CompatBlocks.DEAD_VERTICAL_SLAB.get(),
                CompatBlocks.UMBRAN_VERTICAL_SLAB.get(),
                CompatBlocks.PALM_VERTICAL_SLAB.get(),
                CompatBlocks.HELLBARK_VERTICAL_SLAB.get(),

                CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(),

                CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(),

                CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(),
                CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(),

                CompatBlocks.GALANOS_VERTICAL_SLAB.get(),

                CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(),
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get()
        );
         */
    }

    public static Block getNormalChest(Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> chestPair) {
        return chestPair.getFirst().get();
    }

    public static Block getTrappedChest(Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> chestPair) {
        return chestPair.getSecond().get();
    }
}
