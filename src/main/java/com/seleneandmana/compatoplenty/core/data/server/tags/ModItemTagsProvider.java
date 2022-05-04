package com.seleneandmana.compatoplenty.core.data.server.tags;

import com.mojang.datafixers.util.Pair;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;

import com.seleneandmana.compatoplenty.core.other.CompatTags;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagsProvider, CompatOPlenty.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
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

        tag(ItemTags.PLANKS).add(
                asItem(CompatBlocks.VERTICAL_CHERRY_PLANKS),
                asItem(CompatBlocks.VERTICAL_JACARANDA_PLANKS),
                asItem(CompatBlocks.VERTICAL_FIR_PLANKS),
                asItem(CompatBlocks.VERTICAL_REDWOOD_PLANKS),
                asItem(CompatBlocks.VERTICAL_MAHOGANY_PLANKS),
                asItem(CompatBlocks.VERTICAL_WILLOW_PLANKS),
                asItem(CompatBlocks.VERTICAL_MAGIC_PLANKS),
                asItem(CompatBlocks.VERTICAL_DEAD_PLANKS),
                asItem(CompatBlocks.VERTICAL_UMBRAN_PLANKS),
                asItem(CompatBlocks.VERTICAL_PALM_PLANKS),
                asItem(CompatBlocks.VERTICAL_HELLBARK_PLANKS)
        );

        //Forge Tags
        tag(CompatTags.ItemTags.CHESTS_WOODEN).add(
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

        tag(CompatTags.ItemTags.CHESTS_TRAPPED).add(
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

        tag(CompatTags.ItemTags.BOOKSHELVES).add(
                asItem(CompatBlocks.CHERRY_BOOKSHELF),
                asItem(CompatBlocks.JACARANDA_BOOKSHELF),
                asItem(CompatBlocks.FIR_BOOKSHELF),
                asItem(CompatBlocks.REDWOOD_BOOKSHELF),
                asItem(CompatBlocks.MAHOGANY_BOOKSHELF),
                asItem(CompatBlocks.WILLOW_BOOKSHELF),
                asItem(CompatBlocks.MAGIC_BOOKSHELF),
                asItem(CompatBlocks.DEAD_BOOKSHELF),
                asItem(CompatBlocks.UMBRAN_BOOKSHELF),
                asItem(CompatBlocks.PALM_BOOKSHELF),
                asItem(CompatBlocks.HELLBARK_BOOKSHELF)
        );

        tag(CompatTags.ItemTags.BOATABLE_CHESTS).add(
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

        tag(CompatTags.ItemTags.LADDERS).add(
                asItem(CompatBlocks.CHERRY_LADDER),
                asItem(CompatBlocks.JACARANDA_LADDER),
                asItem(CompatBlocks.FIR_LADDER),
                asItem(CompatBlocks.REDWOOD_LADDER),
                asItem(CompatBlocks.MAHOGANY_LADDER),
                asItem(CompatBlocks.WILLOW_LADDER),
                asItem(CompatBlocks.MAGIC_LADDER),
                asItem(CompatBlocks.DEAD_LADDER),
                asItem(CompatBlocks.UMBRAN_LADDER),
                asItem(CompatBlocks.PALM_LADDER),
                asItem(CompatBlocks.HELLBARK_LADDER)
        );

        tag(CompatTags.ItemTags.REVERTABLE_CHESTS).add(
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

        tag(CompatTags.ItemTags.VERTICAL_SLABS).add(
                asItem(CompatBlocks.CHERRY_VERTICAL_SLAB),
                asItem(CompatBlocks.JACARANDA_VERTICAL_SLAB),
                asItem(CompatBlocks.FIR_VERTICAL_SLAB),
                asItem(CompatBlocks.REDWOOD_VERTICAL_SLAB),
                asItem(CompatBlocks.MAHOGANY_VERTICAL_SLAB),
                asItem(CompatBlocks.WILLOW_VERTICAL_SLAB),
                asItem(CompatBlocks.MAGIC_VERTICAL_SLAB),
                asItem(CompatBlocks.DEAD_VERTICAL_SLAB),
                asItem(CompatBlocks.UMBRAN_VERTICAL_SLAB),
                asItem(CompatBlocks.PALM_VERTICAL_SLAB),
                asItem(CompatBlocks.HELLBARK_VERTICAL_SLAB),

                asItem(CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB),

                asItem(CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB),

                asItem(CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB),
                asItem(CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB),

                asItem(CompatBlocks.GALANOS_VERTICAL_SLAB),

                asItem(CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB),
                asItem(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB),

                asItem(CompatBlocks.MUD_BRICK_VERTICAL_SLAB)
        );
    }

    public static Item asItem(RegistryObject<Block> block) {
        return block.get().asItem();
    }

    public static Item getNormalChest(Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> chestPair) {
        return chestPair.getFirst().get().asItem();
    }

    public static Item getTrappedChest(Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> chestPair) {
        return chestPair.getSecond().get().asItem();
    }
}
