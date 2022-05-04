package com.seleneandmana.compatoplenty.core.other;

import com.teamabnormals.blueprint.core.util.TagUtil;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CompatTags {
    public static class BlockTags {
        //Forge
        public static final TagKey<Block> CHESTS_TRAPPED = TagUtil.blockTag("forge", "chests/trapped");
        public static final TagKey<Block> CHESTS_WOODEN = TagUtil.blockTag("forge", "chests/wooden");

        //Quark
        public static final TagKey<Block> HEDGES = TagUtil.blockTag("quark", "hedges");
        public static final TagKey<Block> LADDERS = TagUtil.blockTag("quark", "ladders");
        public static final TagKey<Block> VERTICAL_SLABS = TagUtil.blockTag("quark", "vertical_slabs");
    }

    public static class ItemTags {
        //Forge
        public static final TagKey<Item> CHESTS_TRAPPED = TagUtil.itemTag("forge", "chests/trapped");
        public static final TagKey<Item> CHESTS_WOODEN = TagUtil.itemTag("forge", "chests/wooden");
        public static final TagKey<Item> BOOKSHELVES = TagUtil.itemTag("forge", "bookshelves");

        //Quark
        public static final TagKey<Item> BOATABLE_CHESTS = TagUtil.itemTag("quark", "boatable_chests");
        public static final TagKey<Item> LADDERS = TagUtil.itemTag("quark", "ladders");
        public static final TagKey<Item> REVERTABLE_CHESTS = TagUtil.itemTag("quark", "revertable_chests");
        public static final TagKey<Item> VERTICAL_SLABS = TagUtil.itemTag("quark", "vertical_slabs");
    }
}
