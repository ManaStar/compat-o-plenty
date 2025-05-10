package com.seleneandmana.compatoplenty.core.data.server;

import com.google.common.collect.ImmutableList;
import com.seleneandmana.compatoplenty.client.ClientRegister;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput output) {
        super(output, BuiltInLootTables.all(), ImmutableList.of(new LootTableProvider.SubProviderEntry(CompatBlockLoot::new, LootContextParamSets.BLOCK)));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationcontext) {
    }

    public static class CompatBlockLoot extends BlockLootSubProvider {

        protected CompatBlockLoot() {
            super(Stream.of(Blocks.AIR).map(ItemLike::asItem).collect(Collectors.toSet()), FeatureFlags.REGISTRY.allFlags());
        }

        private void add(CompatBlocks.LeafSet set) {
            this.dropSelf(set.hedge().get());
            this.dropSelf(set.leafCarpet().get());
            this.add(set.leafPile().get(), this::createLeafPileDrops);
        }

        private void add(CompatBlocks.WoodSet set) {
            this.add(set.verticalSlab().get(), this::createSlabItemTable);
            this.createBookshelfTable(set.bookshelf().get());
            this.dropSelf(set.ladder().get());
            this.dropSelf(set.strippedPost().get());
            this.dropSelf(set.post().get());
            this.dropSelf(set.chest().get());
            this.dropSelf(set.trappedChest().get());
            this.createBeehiveTable(set.beehive().get());
            this.dropSelf(set.cabinet().get());
            this.dropSelf(set.table().get());
            this.dropSelf(set.table().get());
            this.dropSelf(set.boards().get());
            this.dropSelf(set.verticalPlanks().get());
        }

        @Override
        protected void generate() {
            //Vertical Slabs
            this.add(CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.GALANOS_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), this::createSlabItemTable);

            //Block Sets
            CompatBlocks.leaveSets().forEach(this::add);
            CompatBlocks.woodSets().forEach(this::add);

            //Sandstone Bricks
            this.dropSelf(CompatBlocks.WHITE_SANDSTONE_BRICKS.get());
            this.dropSelf(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get());
            this.dropSelf(CompatBlocks.BLACK_SANDSTONE_BRICKS.get());
            this.dropSelf(CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS.get());
            this.dropSelf(CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get());
            this.dropSelf(CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get());
            this.dropSelf(CompatBlocks.WHITE_SANDSTONE_BRICK_WALL.get());
            this.dropSelf(CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get());
            this.dropSelf(CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get());
            this.add(CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), this::createSlabItemTable);

            //Galanos Blocks
            this.dropSelf(CompatBlocks.GALANOS_BLOCK.get());
            this.dropSelf(CompatBlocks.GALANOS_STAIRS.get());
            this.dropSelf(CompatBlocks.GALANOS_PILLAR.get());
            this.add(CompatBlocks.GALANOS_SLAB.get(), this::createSlabItemTable);

            //Polished Rose Quartz Blocks
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ.get());
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get());
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get());
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get());
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get());
            this.dropSelf(CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get());
            this.dropSelf(CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get());
            this.add(CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), this::createSlabItemTable);
            this.add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), this::createSlabItemTable);
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            return CompatBlocks.HELPER.getDeferredRegister().getEntries().stream().map(RegistryObject::get)::iterator;
        }

        private void createBookshelfTable(Block bookshelf) {
            this.add(bookshelf, createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3.0F)));
        }

        private void createBeehiveTable(Block beehive) {
            this.add(beehive, createBeeHiveDrop(beehive));
        }

        private LootTable.Builder createLeafPileDrops(Block block) {
            return createMultifaceBlockDrops(block, MatchTool.toolMatches(ItemPredicate.Builder.item().of(Tags.Items.SHEARS)));
        }
    }
}
