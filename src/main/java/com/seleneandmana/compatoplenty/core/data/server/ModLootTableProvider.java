package com.seleneandmana.compatoplenty.core.data.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.teamabnormals.woodworks.core.data.server.WoodworksLootTableProvider;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> lootTables = ImmutableList.of(Pair.of(CompatBlockLoot::new, LootContextParamSets.BLOCK));

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return this.lootTables;
    }

    @Override
    protected void validate(@NotNull Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationtracker) {
    }

    public static class CompatBlockLoot extends BlockLoot {
        @Override
        protected void addTables() {
            //Vertical Slabs
            this.add(CompatBlocks.CHERRY_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.JACARANDA_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.FIR_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.REDWOOD_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.MAHOGANY_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.WILLOW_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.MAGIC_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.DEAD_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.UMBRAN_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.PALM_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.HELLBARK_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.GALANOS_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), BlockLoot::createSlabItemTable);

            //Bookshelves
            this.createBookshelfTable(CompatBlocks.CHERRY_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.JACARANDA_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.FIR_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.REDWOOD_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.MAHOGANY_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.WILLOW_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.MAGIC_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.DEAD_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.UMBRAN_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.PALM_BOOKSHELF.get());
            this.createBookshelfTable(CompatBlocks.HELLBARK_BOOKSHELF.get());

            //Ladders
            this.dropSelf(CompatBlocks.CHERRY_LADDER.get());
            this.dropSelf(CompatBlocks.JACARANDA_LADDER.get());
            this.dropSelf(CompatBlocks.FIR_LADDER.get());
            this.dropSelf(CompatBlocks.REDWOOD_LADDER.get());
            this.dropSelf(CompatBlocks.MAHOGANY_LADDER.get());
            this.dropSelf(CompatBlocks.WILLOW_LADDER.get());
            this.dropSelf(CompatBlocks.MAGIC_LADDER.get());
            this.dropSelf(CompatBlocks.DEAD_LADDER.get());
            this.dropSelf(CompatBlocks.UMBRAN_LADDER.get());
            this.dropSelf(CompatBlocks.PALM_LADDER.get());
            this.dropSelf(CompatBlocks.HELLBARK_LADDER.get());

            //Stripped Posts
            this.dropSelf(CompatBlocks.STRIPPED_CHERRY_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_JACARANDA_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_FIR_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_REDWOOD_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_MAHOGANY_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_WILLOW_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_MAGIC_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_DEAD_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_UMBRAN_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_PALM_POST.get());
            this.dropSelf(CompatBlocks.STRIPPED_HELLBARK_POST.get());

            //Posts
            this.dropSelf(CompatBlocks.CHERRY_POST.get());
            this.dropSelf(CompatBlocks.JACARANDA_POST.get());
            this.dropSelf(CompatBlocks.FIR_POST.get());
            this.dropSelf(CompatBlocks.REDWOOD_POST.get());
            this.dropSelf(CompatBlocks.MAHOGANY_POST.get());
            this.dropSelf(CompatBlocks.WILLOW_POST.get());
            this.dropSelf(CompatBlocks.MAGIC_POST.get());
            this.dropSelf(CompatBlocks.DEAD_POST.get());
            this.dropSelf(CompatBlocks.UMBRAN_POST.get());
            this.dropSelf(CompatBlocks.PALM_POST.get());
            this.dropSelf(CompatBlocks.HELLBARK_POST.get());

            //Hedges
            this.dropSelf(CompatBlocks.WHITE_CHERRY_HEDGE.get());
            this.dropSelf(CompatBlocks.PINK_CHERRY_HEDGE.get());
            this.dropSelf(CompatBlocks.JACARANDA_HEDGE.get());
            this.dropSelf(CompatBlocks.FIR_HEDGE.get());
            this.dropSelf(CompatBlocks.REDWOOD_HEDGE.get());
            this.dropSelf(CompatBlocks.MAHOGANY_HEDGE.get());
            this.dropSelf(CompatBlocks.WILLOW_HEDGE.get());
            this.dropSelf(CompatBlocks.MAGIC_HEDGE.get());
            this.dropSelf(CompatBlocks.DEAD_HEDGE.get());
            this.dropSelf(CompatBlocks.UMBRAN_HEDGE.get());
            this.dropSelf(CompatBlocks.PALM_HEDGE.get());
            this.dropSelf(CompatBlocks.HELLBARK_HEDGE.get());
            this.dropSelf(CompatBlocks.FLOWERING_OAK_HEDGE.get());
            this.dropSelf(CompatBlocks.RAINBOW_BIRCH_HEDGE.get());
            this.dropSelf(CompatBlocks.ORIGIN_HEDGE.get());
            this.dropSelf(CompatBlocks.MAPLE_HEDGE.get());
            this.dropSelf(CompatBlocks.YELLOW_AUTUMN_HEDGE.get());
            this.dropSelf(CompatBlocks.ORANGE_AUTUMN_HEDGE.get());

            //Leaf Carpets
            this.dropSelf(CompatBlocks.WHITE_CHERRY_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.PINK_CHERRY_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.JACARANDA_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.FIR_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.REDWOOD_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.MAHOGANY_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.WILLOW_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.MAGIC_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.DEAD_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.UMBRAN_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.PALM_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.HELLBARK_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.ORIGIN_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.MAPLE_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.YELLOW_AUTUMN_LEAF_CARPET.get());
            this.dropSelf(CompatBlocks.ORANGE_AUTUMN_LEAF_CARPET.get());

            //Chests
            this.dropSelf(CompatBlocks.CHERRY_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.JACARANDA_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.FIR_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.REDWOOD_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.MAHOGANY_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.WILLOW_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.MAGIC_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.DEAD_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.UMBRAN_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.PALM_CHESTS.getFirst().get());
            this.dropSelf(CompatBlocks.HELLBARK_CHESTS.getFirst().get());

            //Trapped Chests
            this.dropSelf(CompatBlocks.CHERRY_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.JACARANDA_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.FIR_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.REDWOOD_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.MAHOGANY_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.WILLOW_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.MAGIC_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.DEAD_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.UMBRAN_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.PALM_CHESTS.getSecond().get());
            this.dropSelf(CompatBlocks.HELLBARK_CHESTS.getSecond().get());

            //Beehives
            this.createBeehiveTable(CompatBlocks.CHERRY_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.JACARANDA_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.FIR_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.REDWOOD_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.MAHOGANY_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.WILLOW_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.MAGIC_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.DEAD_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.UMBRAN_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.PALM_BEEHIVE.get());
            this.createBeehiveTable(CompatBlocks.HELLBARK_BEEHIVE.get());

            //Cabinets
            this.dropSelf(CompatBlocks.CHERRY_CABINET.get());
            this.dropSelf(CompatBlocks.JACARANDA_CABINET.get());
            this.dropSelf(CompatBlocks.FIR_CABINET.get());
            this.dropSelf(CompatBlocks.REDWOOD_CABINET.get());
            this.dropSelf(CompatBlocks.MAHOGANY_CABINET.get());
            this.dropSelf(CompatBlocks.WILLOW_CABINET.get());
            this.dropSelf(CompatBlocks.MAGIC_CABINET.get());
            this.dropSelf(CompatBlocks.DEAD_CABINET.get());
            this.dropSelf(CompatBlocks.UMBRAN_CABINET.get());
            this.dropSelf(CompatBlocks.PALM_CABINET.get());
            this.dropSelf(CompatBlocks.HELLBARK_CABINET.get());

            //Tables
            this.dropSelf(CompatBlocks.CHERRY_TABLE.get());
            this.dropSelf(CompatBlocks.JACARANDA_TABLE.get());
            this.dropSelf(CompatBlocks.FIR_TABLE.get());
            this.dropSelf(CompatBlocks.REDWOOD_TABLE.get());
            this.dropSelf(CompatBlocks.MAHOGANY_TABLE.get());
            this.dropSelf(CompatBlocks.WILLOW_TABLE.get());
            this.dropSelf(CompatBlocks.MAGIC_TABLE.get());
            this.dropSelf(CompatBlocks.DEAD_TABLE.get());
            this.dropSelf(CompatBlocks.UMBRAN_TABLE.get());
            this.dropSelf(CompatBlocks.PALM_TABLE.get());
            this.dropSelf(CompatBlocks.HELLBARK_TABLE.get());

            //Vertical Planks
            this.dropSelf(CompatBlocks.VERTICAL_CHERRY_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_JACARANDA_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_FIR_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_REDWOOD_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_MAHOGANY_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_WILLOW_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_MAGIC_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_DEAD_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_UMBRAN_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_PALM_PLANKS.get());
            this.dropSelf(CompatBlocks.VERTICAL_HELLBARK_PLANKS.get());

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
            this.add(CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);

            //Galanos Blocks
            this.dropSelf(CompatBlocks.GALANOS_BLOCK.get());
            this.dropSelf(CompatBlocks.GALANOS_STAIRS.get());
            this.dropSelf(CompatBlocks.GALANOS_PILLAR.get());
            this.add(CompatBlocks.GALANOS_SLAB.get(), BlockLoot::createSlabItemTable);

            //Polished Rose Quartz Blocks
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ.get());
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get());
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get());
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get());
            this.dropSelf(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get());
            this.dropSelf(CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get());
            this.dropSelf(CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get());
            this.add(CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), BlockLoot::createSlabItemTable);
            this.add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), BlockLoot::createSlabItemTable);

            //Boards
            this.dropSelf(CompatBlocks.CHERRY_BOARDS.get());
            this.dropSelf(CompatBlocks.FIR_BOARDS.get());
            this.dropSelf(CompatBlocks.JACARANDA_BOARDS.get());
            this.dropSelf(CompatBlocks.REDWOOD_BOARDS.get());
            this.dropSelf(CompatBlocks.MAHOGANY_BOARDS.get());
            this.dropSelf(CompatBlocks.WILLOW_BOARDS.get());
            this.dropSelf(CompatBlocks.MAGIC_BOARDS.get());
            this.dropSelf(CompatBlocks.DEAD_BOARDS.get());
            this.dropSelf(CompatBlocks.UMBRAN_BOARDS.get());
            this.dropSelf(CompatBlocks.PALM_BOARDS.get());
            this.dropSelf(CompatBlocks.HELLBARK_BOARDS.get());

            //Leaf Piles
            this.add(CompatBlocks.WHITE_CHERRY_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.PINK_CHERRY_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.JACARANDA_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.FIR_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.REDWOOD_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.MAHOGANY_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.WILLOW_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.MAGIC_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.DEAD_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.UMBRAN_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.PALM_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.HELLBARK_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.FLOWERING_OAK_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.RAINBOW_BIRCH_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.ORIGIN_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.MAPLE_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.ORANGE_AUTUMN_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
            this.add(CompatBlocks.YELLOW_AUTUMN_LEAF_PILE.get(), CompatBlockLoot::createLeafPileDrops);
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

        private static LootTable.Builder createLeafPileDrops(Block block) {
            return createMultifaceBlockDrops(block, MatchTool.toolMatches(ItemPredicate.Builder.item().of(Tags.Items.SHEARS)));
        }
    }
}
