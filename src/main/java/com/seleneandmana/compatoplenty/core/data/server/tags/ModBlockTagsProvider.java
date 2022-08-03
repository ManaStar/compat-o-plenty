package com.seleneandmana.compatoplenty.core.data.server.tags;

import biomesoplenty.api.block.BOPBlocks;
import com.mojang.datafixers.util.Pair;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.other.CompatTags;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator p_126511_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126511_, CompatOPlenty.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags() {
        //Minecraft tags
        tag(BlockTags.MINEABLE_WITH_AXE).add(
                CompatBlocks.CHERRY_VERTICAL_SLAB.get(),
                CompatBlocks.CHERRY_BOOKSHELF.get(),
                CompatBlocks.CHERRY_LADDER.get(),
                CompatBlocks.STRIPPED_CHERRY_POST.get(),
                CompatBlocks.CHERRY_POST.get(),
                CompatBlocks.WHITE_CHERRY_HEDGE.get(),
                CompatBlocks.PINK_CHERRY_HEDGE.get(),
                CompatBlocks.CHERRY_BEEHIVE.get(),
                CompatBlocks.CHERRY_CABINET.get(),
                CompatBlocks.CHERRY_TABLE.get(),
                CompatBlocks.VERTICAL_CHERRY_PLANKS.get(),
                getNormalChest(CompatBlocks.CHERRY_CHESTS),
                getTrappedChest(CompatBlocks.CHERRY_CHESTS),

                CompatBlocks.JACARANDA_VERTICAL_SLAB.get(),
                CompatBlocks.JACARANDA_BOOKSHELF.get(),
                CompatBlocks.JACARANDA_LADDER.get(),
                CompatBlocks.STRIPPED_JACARANDA_POST.get(),
                CompatBlocks.JACARANDA_POST.get(),
                CompatBlocks.JACARANDA_HEDGE.get(),
                CompatBlocks.JACARANDA_BEEHIVE.get(),
                CompatBlocks.JACARANDA_CABINET.get(),
                CompatBlocks.JACARANDA_TABLE.get(),
                CompatBlocks.VERTICAL_JACARANDA_PLANKS.get(),
                getNormalChest(CompatBlocks.JACARANDA_CHESTS),
                getTrappedChest(CompatBlocks.JACARANDA_CHESTS),

                CompatBlocks.FIR_VERTICAL_SLAB.get(),
                CompatBlocks.FIR_BOOKSHELF.get(),
                CompatBlocks.FIR_LADDER.get(),
                CompatBlocks.STRIPPED_FIR_POST.get(),
                CompatBlocks.FIR_POST.get(),
                CompatBlocks.FIR_HEDGE.get(),
                CompatBlocks.FIR_BEEHIVE.get(),
                CompatBlocks.FIR_CABINET.get(),
                CompatBlocks.FIR_TABLE.get(),
                CompatBlocks.VERTICAL_FIR_PLANKS.get(),
                getNormalChest(CompatBlocks.FIR_CHESTS),
                getTrappedChest(CompatBlocks.FIR_CHESTS),


                CompatBlocks.REDWOOD_VERTICAL_SLAB.get(),
                CompatBlocks.REDWOOD_BOOKSHELF.get(),
                CompatBlocks.REDWOOD_LADDER.get(),
                CompatBlocks.STRIPPED_REDWOOD_POST.get(),
                CompatBlocks.REDWOOD_POST.get(),
                CompatBlocks.REDWOOD_HEDGE.get(),
                CompatBlocks.REDWOOD_BEEHIVE.get(),
                CompatBlocks.REDWOOD_CABINET.get(),
                CompatBlocks.REDWOOD_TABLE.get(),
                CompatBlocks.VERTICAL_REDWOOD_PLANKS.get(),
                getNormalChest(CompatBlocks.REDWOOD_CHESTS),
                getTrappedChest(CompatBlocks.REDWOOD_CHESTS),

                CompatBlocks.MAHOGANY_VERTICAL_SLAB.get(),
                CompatBlocks.MAHOGANY_BOOKSHELF.get(),
                CompatBlocks.MAHOGANY_LADDER.get(),
                CompatBlocks.STRIPPED_MAHOGANY_POST.get(),
                CompatBlocks.MAHOGANY_POST.get(),
                CompatBlocks.MAHOGANY_HEDGE.get(),
                CompatBlocks.MAHOGANY_BEEHIVE.get(),
                CompatBlocks.MAHOGANY_CABINET.get(),
                CompatBlocks.MAHOGANY_TABLE.get(),
                CompatBlocks.VERTICAL_MAHOGANY_PLANKS.get(),
                getNormalChest(CompatBlocks.MAHOGANY_CHESTS),
                getTrappedChest(CompatBlocks.MAHOGANY_CHESTS),

                CompatBlocks.WILLOW_VERTICAL_SLAB.get(),
                CompatBlocks.WILLOW_BOOKSHELF.get(),
                CompatBlocks.WILLOW_LADDER.get(),
                CompatBlocks.STRIPPED_WILLOW_POST.get(),
                CompatBlocks.WILLOW_POST.get(),
                CompatBlocks.WILLOW_HEDGE.get(),
                CompatBlocks.WILLOW_BEEHIVE.get(),
                CompatBlocks.WILLOW_CABINET.get(),
                CompatBlocks.WILLOW_TABLE.get(),
                CompatBlocks.VERTICAL_WILLOW_PLANKS.get(),
                getNormalChest(CompatBlocks.WILLOW_CHESTS),
                getTrappedChest(CompatBlocks.WILLOW_CHESTS),

                CompatBlocks.MAGIC_VERTICAL_SLAB.get(),
                CompatBlocks.MAGIC_BOOKSHELF.get(),
                CompatBlocks.MAGIC_LADDER.get(),
                CompatBlocks.STRIPPED_MAGIC_POST.get(),
                CompatBlocks.MAGIC_POST.get(),
                CompatBlocks.MAGIC_HEDGE.get(),
                CompatBlocks.MAGIC_BEEHIVE.get(),
                CompatBlocks.MAGIC_CABINET.get(),
                CompatBlocks.MAGIC_TABLE.get(),
                CompatBlocks.VERTICAL_MAGIC_PLANKS.get(),
                getNormalChest(CompatBlocks.MAGIC_CHESTS),
                getTrappedChest(CompatBlocks.MAGIC_CHESTS),

                CompatBlocks.DEAD_VERTICAL_SLAB.get(),
                CompatBlocks.DEAD_BOOKSHELF.get(),
                CompatBlocks.DEAD_LADDER.get(),
                CompatBlocks.STRIPPED_DEAD_POST.get(),
                CompatBlocks.DEAD_POST.get(),
                CompatBlocks.DEAD_HEDGE.get(),
                CompatBlocks.DEAD_BEEHIVE.get(),
                CompatBlocks.DEAD_CABINET.get(),
                CompatBlocks.DEAD_TABLE.get(),
                CompatBlocks.VERTICAL_DEAD_PLANKS.get(),
                getNormalChest(CompatBlocks.DEAD_CHESTS),
                getTrappedChest(CompatBlocks.DEAD_CHESTS),

                CompatBlocks.UMBRAN_VERTICAL_SLAB.get(),
                CompatBlocks.UMBRAN_BOOKSHELF.get(),
                CompatBlocks.UMBRAN_LADDER.get(),
                CompatBlocks.STRIPPED_UMBRAN_POST.get(),
                CompatBlocks.UMBRAN_POST.get(),
                CompatBlocks.UMBRAN_HEDGE.get(),
                CompatBlocks.UMBRAN_BEEHIVE.get(),
                CompatBlocks.UMBRAN_CABINET.get(),
                CompatBlocks.UMBRAN_TABLE.get(),
                CompatBlocks.VERTICAL_UMBRAN_PLANKS.get(),
                getNormalChest(CompatBlocks.UMBRAN_CHESTS),
                getTrappedChest(CompatBlocks.UMBRAN_CHESTS),

                CompatBlocks.PALM_VERTICAL_SLAB.get(),
                CompatBlocks.PALM_BOOKSHELF.get(),
                CompatBlocks.PALM_LADDER.get(),
                CompatBlocks.STRIPPED_PALM_POST.get(),
                CompatBlocks.PALM_POST.get(),
                CompatBlocks.PALM_HEDGE.get(),
                CompatBlocks.PALM_BEEHIVE.get(),
                CompatBlocks.PALM_CABINET.get(),
                CompatBlocks.PALM_TABLE.get(),
                CompatBlocks.VERTICAL_PALM_PLANKS.get(),
                getNormalChest(CompatBlocks.PALM_CHESTS),
                getTrappedChest(CompatBlocks.PALM_CHESTS),

                CompatBlocks.HELLBARK_VERTICAL_SLAB.get(),
                CompatBlocks.HELLBARK_BOOKSHELF.get(),
                CompatBlocks.HELLBARK_LADDER.get(),
                CompatBlocks.STRIPPED_HELLBARK_POST.get(),
                CompatBlocks.HELLBARK_POST.get(),
                CompatBlocks.HELLBARK_HEDGE.get(),
                CompatBlocks.HELLBARK_BEEHIVE.get(),
                CompatBlocks.HELLBARK_CABINET.get(),
                CompatBlocks.HELLBARK_TABLE.get(),
                CompatBlocks.VERTICAL_HELLBARK_PLANKS.get(),
                getNormalChest(CompatBlocks.HELLBARK_CHESTS),
                getTrappedChest(CompatBlocks.HELLBARK_CHESTS),

                CompatBlocks.FLOWERING_OAK_HEDGE.get(),
                CompatBlocks.RAINBOW_BIRCH_HEDGE.get(),
                CompatBlocks.ORIGIN_HEDGE.get(),
                CompatBlocks.MAPLE_HEDGE.get(),
                CompatBlocks.ORANGE_AUTUMN_HEDGE.get(),
                CompatBlocks.YELLOW_AUTUMN_HEDGE.get()
        );

        tag(BlockTags.MINEABLE_WITH_HOE).add(
                CompatBlocks.PINK_CHERRY_LEAF_CARPET.get(),
                CompatBlocks.WHITE_CHERRY_LEAF_CARPET.get(),
                CompatBlocks.JACARANDA_LEAF_CARPET.get(),
                CompatBlocks.FIR_LEAF_CARPET.get(),
                CompatBlocks.REDWOOD_LEAF_CARPET.get(),
                CompatBlocks.MAHOGANY_LEAF_CARPET.get(),
                CompatBlocks.WILLOW_LEAF_CARPET.get(),
                CompatBlocks.MAGIC_LEAF_CARPET.get(),
                CompatBlocks.DEAD_LEAF_CARPET.get(),
                CompatBlocks.UMBRAN_LEAF_CARPET.get(),
                CompatBlocks.PALM_LEAF_CARPET.get(),
                CompatBlocks.HELLBARK_LEAF_CARPET.get(),
                CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(),
                CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(),
                CompatBlocks.ORIGIN_LEAF_CARPET.get(),
                CompatBlocks.MAPLE_LEAF_CARPET.get(),
                CompatBlocks.ORANGE_AUTUMN_LEAF_CARPET.get(),
                CompatBlocks.YELLOW_AUTUMN_LEAF_CARPET.get()
        );

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
                CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get(),

                CompatBlocks.MUD_BRICK_VERTICAL_SLAB.get()
        );

        tag(BlockTags.BEEHIVES).add(
                CompatBlocks.CHERRY_BEEHIVE.get(),
                CompatBlocks.JACARANDA_BEEHIVE.get(),
                CompatBlocks.FIR_BEEHIVE.get(),
                CompatBlocks.REDWOOD_BEEHIVE.get(),
                CompatBlocks.MAHOGANY_BEEHIVE.get(),
                CompatBlocks.WILLOW_BEEHIVE.get(),
                CompatBlocks.MAGIC_BEEHIVE.get(),
                CompatBlocks.DEAD_BEEHIVE.get(),
                CompatBlocks.UMBRAN_BEEHIVE.get(),
                CompatBlocks.PALM_BEEHIVE.get(),
                CompatBlocks.HELLBARK_BEEHIVE.get()
        );

        tag(BlockTags.CLIMBABLE).add(
                CompatBlocks.CHERRY_LADDER.get(),
                CompatBlocks.JACARANDA_LADDER.get(),
                CompatBlocks.FIR_LADDER.get(),
                CompatBlocks.REDWOOD_LADDER.get(),
                CompatBlocks.MAHOGANY_LADDER.get(),
                CompatBlocks.WILLOW_LADDER.get(),
                CompatBlocks.MAGIC_LADDER.get(),
                CompatBlocks.DEAD_LADDER.get(),
                CompatBlocks.UMBRAN_LADDER.get(),
                CompatBlocks.PALM_LADDER.get(),
                CompatBlocks.HELLBARK_LADDER.get()
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

        tag(BlockTags.PLANKS).add(
                CompatBlocks.VERTICAL_CHERRY_PLANKS.get(),
                CompatBlocks.VERTICAL_JACARANDA_PLANKS.get(),
                CompatBlocks.VERTICAL_FIR_PLANKS.get(),
                CompatBlocks.VERTICAL_REDWOOD_PLANKS.get(),
                CompatBlocks.VERTICAL_MAHOGANY_PLANKS.get(),
                CompatBlocks.VERTICAL_WILLOW_PLANKS.get(),
                CompatBlocks.VERTICAL_MAGIC_PLANKS.get(),
                CompatBlocks.VERTICAL_DEAD_PLANKS.get(),
                CompatBlocks.VERTICAL_UMBRAN_PLANKS.get(),
                CompatBlocks.VERTICAL_PALM_PLANKS.get(),
                CompatBlocks.VERTICAL_HELLBARK_PLANKS.get()
        );

        //Farmer's Delight Tags
        tag(ModTags.COMPOST_ACTIVATORS).add(
                BOPBlocks.TOADSTOOL,
                BOPBlocks.GLOWSHROOM
        );

        //Forge Tags
        tag(CompatTags.BlockTags.CHESTS_WOODEN).add(
                getNormalChest(CompatBlocks.CHERRY_CHESTS),
                getNormalChest(CompatBlocks.JACARANDA_CHESTS),
                getNormalChest(CompatBlocks.FIR_CHESTS),
                getNormalChest(CompatBlocks.REDWOOD_CHESTS),
                getNormalChest(CompatBlocks.MAHOGANY_CHESTS),
                getNormalChest(CompatBlocks.WILLOW_CHESTS),
                getNormalChest(CompatBlocks.MAGIC_CHESTS),
                getNormalChest(CompatBlocks.DEAD_CHESTS),
                getNormalChest(CompatBlocks.UMBRAN_CHESTS),
                getNormalChest(CompatBlocks.PALM_CHESTS),
                getNormalChest(CompatBlocks.HELLBARK_CHESTS)
        );

        tag(CompatTags.BlockTags.CHESTS_TRAPPED).add(
                getTrappedChest(CompatBlocks.CHERRY_CHESTS),
                getTrappedChest(CompatBlocks.JACARANDA_CHESTS),
                getTrappedChest(CompatBlocks.FIR_CHESTS),
                getTrappedChest(CompatBlocks.REDWOOD_CHESTS),
                getTrappedChest(CompatBlocks.MAHOGANY_CHESTS),
                getTrappedChest(CompatBlocks.WILLOW_CHESTS),
                getTrappedChest(CompatBlocks.MAGIC_CHESTS),
                getTrappedChest(CompatBlocks.DEAD_CHESTS),
                getTrappedChest(CompatBlocks.UMBRAN_CHESTS),
                getTrappedChest(CompatBlocks.PALM_CHESTS),
                getTrappedChest(CompatBlocks.HELLBARK_CHESTS)
        );

        //Quark
        tag(CompatTags.BlockTags.HEDGES).add(
                CompatBlocks.WHITE_CHERRY_HEDGE.get(),
                CompatBlocks.PINK_CHERRY_HEDGE.get(),
                CompatBlocks.JACARANDA_HEDGE.get(),
                CompatBlocks.FIR_HEDGE.get(),
                CompatBlocks.REDWOOD_HEDGE.get(),
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

        tag(CompatTags.BlockTags.LADDERS).add(
                CompatBlocks.CHERRY_LADDER.get(),
                CompatBlocks.JACARANDA_LADDER.get(),
                CompatBlocks.FIR_LADDER.get(),
                CompatBlocks.REDWOOD_LADDER.get(),
                CompatBlocks.MAHOGANY_LADDER.get(),
                CompatBlocks.WILLOW_LADDER.get(),
                CompatBlocks.MAGIC_LADDER.get(),
                CompatBlocks.DEAD_LADDER.get(),
                CompatBlocks.UMBRAN_LADDER.get(),
                CompatBlocks.PALM_LADDER.get(),
                CompatBlocks.HELLBARK_LADDER.get()
        );

        tag(CompatTags.BlockTags.VERTICAL_SLABS).add(
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
                CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(),

                CompatBlocks.MUD_BRICK_VERTICAL_SLAB.get()
        );
    }

    public static Block getNormalChest(Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> chestPair) {
        return chestPair.getFirst().get();
    }

    public static Block getTrappedChest(Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> chestPair) {
        return chestPair.getSecond().get();
    }
}
