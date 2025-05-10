package com.seleneandmana.compatoplenty.core.data.server.tags;

import com.mojang.datafixers.util.Pair;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;

import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.core.other.tags.BlueprintBlockTags;
import com.teamabnormals.blueprint.core.other.tags.BlueprintItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, CompletableFuture<TagsProvider.TagLookup<Block>> tagLookup, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookup, tagLookup, CompatOPlenty.MOD_ID, existingFileHelper);
    }

    private void add(CompatBlocks.LeafSet set) {
        tag(BlueprintItemTags.LEAF_PILES).add(asItem(set.leafPile()));
    }

    private void add(CompatBlocks.WoodSet set) {
        tag(BlueprintItemTags.LADDERS).add(asItem(set.ladder()));
        tag(ItemTags.PLANKS).add(asItem(set.verticalPlanks()));
        tag(Tags.Items.CHESTS_WOODEN).add(asItem(set.chest()), asItem(set.trappedChest()));
        tag(Tags.Items.CHESTS_TRAPPED).add(asItem(set.trappedChest()));
        tag(Tags.Items.BOOKSHELVES).add(asItem(set.bookshelf()));
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        CompatBlocks.woodSets().forEach(this::add);
        CompatBlocks.leaveSets().forEach(this::add);

        //Minecraft
        tag(ItemTags.SLABS).add(
                asItem(CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB),
                asItem(CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB),
                asItem(CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB),
                asItem(CompatBlocks.GALANOS_SLAB),
                asItem(CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB),
                asItem(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB)
        );

        tag(ItemTags.STAIRS).add(
                asItem(CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS),
                asItem(CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS),
                asItem(CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS),
                asItem(CompatBlocks.GALANOS_STAIRS),
                asItem(CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS),
                asItem(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS)
        );

        tag(ItemTags.WALLS).add(
                asItem(CompatBlocks.BLACK_SANDSTONE_BRICK_WALL),
                asItem(CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL),
                asItem(CompatBlocks.WHITE_SANDSTONE_BRICK_WALL),
                asItem(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL)
        );

        tag(ItemTags.NON_FLAMMABLE_WOOD).add(
                asItem(CompatBlocks.HELLBARK.verticalSlab()),
                asItem(CompatBlocks.HELLBARK.verticalPlanks()),
                asItem(CompatBlocks.HELLBARK.boards()),
                asItem(CompatBlocks.HELLBARK.bookshelf()),
                asItem(CompatBlocks.HELLBARK.ladder()),
                asItem(CompatBlocks.HELLBARK.beehive()),
                asItem(CompatBlocks.HELLBARK.chest()),
                asItem(CompatBlocks.HELLBARK.trappedChest()),
                CompatItems.HELLBARK_FURNACE_BOAT.get(),
                CompatItems.LARGE_HELLBARK_BOAT.get()
        );
    }

    public static Item asItem(RegistryObject<? extends Block> block) {
        return block.get().asItem();
    }
}
