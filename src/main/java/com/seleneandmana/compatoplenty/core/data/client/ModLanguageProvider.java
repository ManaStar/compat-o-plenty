package com.seleneandmana.compatoplenty.core.data.client;

import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen) {
        super(gen, CompatOPlenty.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Vertical Slabs
        add(CompatBlocks.CHERRY_VERTICAL_SLAB.get(), "Cherry Vertical Slab");
        add(CompatBlocks.JACARANDA_VERTICAL_SLAB.get(), "Jacaranda Vertical Slab");
        add(CompatBlocks.FIR_VERTICAL_SLAB.get(), "Fir Vertical Slab");
        add(CompatBlocks.REDWOOD_VERTICAL_SLAB.get(), "Redwood Vertical Slab");
        add(CompatBlocks.MAHOGANY_VERTICAL_SLAB.get(), "Mahogany Vertical Slab");
        add(CompatBlocks.WILLOW_VERTICAL_SLAB.get(), "Willow Vertical Slab");
        add(CompatBlocks.MAGIC_VERTICAL_SLAB.get(), "Magic Vertical Slab");
        add(CompatBlocks.DEAD_VERTICAL_SLAB.get(), "Dead Vertical Slab");
        add(CompatBlocks.UMBRAN_VERTICAL_SLAB.get(), "Umbran Vertical Slab");
        add(CompatBlocks.PALM_VERTICAL_SLAB.get(), "Palm Vertical Slab");
        add(CompatBlocks.HELLBARK_VERTICAL_SLAB.get(), "Hellbark Vertical Slab");
        add(CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), "White Sandstone Vertical Slab");
        add(CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), "Cut White Sandstone Vertical Slab");
        add(CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), "Smooth White Sandstone Vertical Slab");
        add(CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), "White Sandstone Brick Vertical Slab");
        add(CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), "Orange Sandstone Vertical Slab");
        add(CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), "Cut Orange Sandstone Vertical Slab");
        add(CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), "Smooth Orange Sandstone Vertical Slab");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), "Orange Sandstone Brick Vertical Slab");
        add(CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), "Black Sandstone Vertical Slab");
        add(CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), "Cut Black Sandstone Vertical Slab");
        add(CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), "Smooth Black Sandstone Vertical Slab");
        add(CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(), "Black Sandstone Brick Vertical Slab");
        add(CompatBlocks.GALANOS_VERTICAL_SLAB.get(), "Galanos Vertical Slab");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), "Polished Rose Quartz Vertical Slab");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), "Polished Rose Quartz Brick Vertical Slab");
        add(CompatBlocks.MUD_BRICK_VERTICAL_SLAB.get(), "Mud Brick Vertical Slab");

        //Bookshelves
        add(CompatBlocks.CHERRY_BOOKSHELF.get(), "Cherry Bookshelf");
        add(CompatBlocks.JACARANDA_BOOKSHELF.get(), "Jacaranda Bookshelf");
        add(CompatBlocks.FIR_BOOKSHELF.get(), "Fir Bookshelf");
        add(CompatBlocks.REDWOOD_BOOKSHELF.get(), "Redwood Bookshelf");
        add(CompatBlocks.MAHOGANY_BOOKSHELF.get(), "Mahogany Bookshelf");
        add(CompatBlocks.WILLOW_BOOKSHELF.get(), "Willow Bookshelf");
        add(CompatBlocks.MAGIC_BOOKSHELF.get(), "Magic Bookshelf");
        add(CompatBlocks.DEAD_BOOKSHELF.get(), "Dead Bookshelf");
        add(CompatBlocks.UMBRAN_BOOKSHELF.get(), "Umbran Bookshelf");
        add(CompatBlocks.PALM_BOOKSHELF.get(), "Palm Bookshelf");
        add(CompatBlocks.HELLBARK_BOOKSHELF.get(), "Hellbark Bookshelf");

        //Ladders
        add(CompatBlocks.CHERRY_LADDER.get(), "Cherry Ladder");
        add(CompatBlocks.JACARANDA_LADDER.get(), "Jacaranda Ladder");
        add(CompatBlocks.FIR_LADDER.get(), "Fir Ladder");
        add(CompatBlocks.REDWOOD_LADDER.get(), "Redwood Ladder");
        add(CompatBlocks.MAHOGANY_LADDER.get(), "Mahogany Ladder");
        add(CompatBlocks.WILLOW_LADDER.get(), "Willow Ladder");
        add(CompatBlocks.MAGIC_LADDER.get(), "Magic Ladder");
        add(CompatBlocks.DEAD_LADDER.get(), "Dead Ladder");
        add(CompatBlocks.UMBRAN_LADDER.get(), "Umbran Ladder");
        add(CompatBlocks.PALM_LADDER.get(), "Palm Ladder");
        add(CompatBlocks.HELLBARK_LADDER.get(), "Hellbark Ladder");

        //Posts
        add(CompatBlocks.CHERRY_POST.get(), "Cherry Post");
        add(CompatBlocks.JACARANDA_POST.get(), "Jacaranda Post");
        add(CompatBlocks.FIR_POST.get(), "Fir Post");
        add(CompatBlocks.REDWOOD_POST.get(), "Redwood Post");
        add(CompatBlocks.MAHOGANY_POST.get(), "Mahogany Post");
        add(CompatBlocks.WILLOW_POST.get(), "Willow Post");
        add(CompatBlocks.MAGIC_POST.get(), "Magic Post");
        add(CompatBlocks.DEAD_POST.get(), "Dead Post");
        add(CompatBlocks.UMBRAN_POST.get(), "Umbran Post");
        add(CompatBlocks.PALM_POST.get(), "Palm Post");
        add(CompatBlocks.HELLBARK_POST.get(), "Hellbark Post");

        //Stripped Posts
        add(CompatBlocks.STRIPPED_CHERRY_POST.get(), "Stripped Cherry Post");
        add(CompatBlocks.STRIPPED_JACARANDA_POST.get(), "Stripped Jacaranda Post");
        add(CompatBlocks.STRIPPED_FIR_POST.get(), "Stripped Fir Post");
        add(CompatBlocks.STRIPPED_REDWOOD_POST.get(), "Stripped Redwood Post");
        add(CompatBlocks.STRIPPED_MAHOGANY_POST.get(), "Stripped Mahogany Post");
        add(CompatBlocks.STRIPPED_WILLOW_POST.get(), "Stripped Willow Post");
        add(CompatBlocks.STRIPPED_MAGIC_POST.get(), "Stripped Magic Post");
        add(CompatBlocks.STRIPPED_DEAD_POST.get(), "Stripped Dead Post");
        add(CompatBlocks.STRIPPED_UMBRAN_POST.get(), "Stripped Umbran Post");
        add(CompatBlocks.STRIPPED_PALM_POST.get(), "Stripped Palm Post");
        add(CompatBlocks.STRIPPED_HELLBARK_POST.get(), "Stripped Hellbark Post");

        //Leaf Hedges
        add(CompatBlocks.WHITE_CHERRY_HEDGE.get(), "White Cherry Leaf Hedge");
        add(CompatBlocks.PINK_CHERRY_HEDGE.get(), "Pink Cherry Leaf Hedge");
        add(CompatBlocks.JACARANDA_HEDGE.get(), "Jacaranda Leaf Hedge");
        add(CompatBlocks.FIR_HEDGE.get(), "Fir Leaf Hedge");
        add(CompatBlocks.REDWOOD_HEDGE.get(), "Redwood Leaf Hedge");
        add(CompatBlocks.MAHOGANY_HEDGE.get(), "Mahogany Leaf Hedge");
        add(CompatBlocks.WILLOW_HEDGE.get(), "Willow Leaf Hedge");
        add(CompatBlocks.MAGIC_HEDGE.get(), "Magic Leaf Hedge");
        add(CompatBlocks.DEAD_HEDGE.get(), "Dead Leaf Hedge");
        add(CompatBlocks.UMBRAN_HEDGE.get(), "Umbran Leaf Hedge");
        add(CompatBlocks.PALM_HEDGE.get(), "Palm Leaf Hedge");
        add(CompatBlocks.HELLBARK_HEDGE.get(), "Hellbark Leaf Hedge");
        add(CompatBlocks.FLOWERING_OAK_HEDGE.get(), "Flowering Oak Leaf Hedge");
        add(CompatBlocks.RAINBOW_BIRCH_HEDGE.get(), "Rainbow Birch Leaf Hedge");
        add(CompatBlocks.ORIGIN_HEDGE.get(), "Origin Leaf Hedge");
        add(CompatBlocks.MAPLE_HEDGE.get(), "Maple Leaf Hedge");
        add(CompatBlocks.ORANGE_AUTUMN_HEDGE.get(), "Orange Autumn Leaf Hedge");
        add(CompatBlocks.YELLOW_AUTUMN_HEDGE.get(), "Yellow Autumn Leaf Hedge");

        //Leaf Carpets
        add(CompatBlocks.WHITE_CHERRY_LEAF_CARPET.get(), "White Cherry Leaf Carpet");
        add(CompatBlocks.PINK_CHERRY_LEAF_CARPET.get(), "Pink Cherry Leaf Carpet");
        add(CompatBlocks.JACARANDA_LEAF_CARPET.get(), "Jacaranda Leaf Carpet");
        add(CompatBlocks.FIR_LEAF_CARPET.get(), "Fir Leaf Carpet");
        add(CompatBlocks.REDWOOD_LEAF_CARPET.get(), "Redwood Leaf Carpet");
        add(CompatBlocks.MAHOGANY_LEAF_CARPET.get(), "Mahogany Leaf Carpet");
        add(CompatBlocks.WILLOW_LEAF_CARPET.get(), "Willow Leaf Carpet");
        add(CompatBlocks.MAGIC_LEAF_CARPET.get(), "Magic Leaf Carpet");
        add(CompatBlocks.DEAD_LEAF_CARPET.get(), "Dead Leaf Carpet");
        add(CompatBlocks.UMBRAN_LEAF_CARPET.get(), "Umbran Leaf Carpet");
        add(CompatBlocks.PALM_LEAF_CARPET.get(), "Palm Leaf Carpet");
        add(CompatBlocks.HELLBARK_LEAF_CARPET.get(), "Hellbark Leaf Carpet");
        add(CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), "Flowering Oak Leaf Carpet");
        add(CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(), "Rainbow Birch Leaf Carpet");
        add(CompatBlocks.ORIGIN_LEAF_CARPET.get(), "Origin Leaf Carpet");
        add(CompatBlocks.MAPLE_LEAF_CARPET.get(), "Maple Leaf Carpet");
        add(CompatBlocks.ORANGE_AUTUMN_LEAF_CARPET.get(), "Orange Autumn Leaf Carpet");
        add(CompatBlocks.YELLOW_AUTUMN_LEAF_CARPET.get(), "Yellow Autumn Leaf Carpet");

        //Leaf Piles
        add(CompatBlocks.WHITE_CHERRY_LEAF_PILE.get(), "Pile of White Cherry Leaves]");
        add(CompatBlocks.PINK_CHERRY_LEAF_PILE.get(), "Pile of Pink Cherry Leaves");
        add(CompatBlocks.JACARANDA_LEAF_PILE.get(), "Pile of Jacaranda Leaves");
        add(CompatBlocks.FIR_LEAF_PILE.get(), "Pile of Fir Leaves");
        add(CompatBlocks.REDWOOD_LEAF_PILE.get(), "Pile of Redwood Leaves");
        add(CompatBlocks.MAHOGANY_LEAF_PILE.get(), "Pile of Mahogany Leaves");
        add(CompatBlocks.WILLOW_LEAF_PILE.get(), "Pile of Willow Leaves");
        add(CompatBlocks.MAGIC_LEAF_PILE.get(), "Pile of Magic Leaves");
        add(CompatBlocks.DEAD_LEAF_PILE.get(), "Pile of Dead Leaves");
        add(CompatBlocks.UMBRAN_LEAF_PILE.get(), "Pile of Umbran Leaves");
        add(CompatBlocks.PALM_LEAF_PILE.get(), "Pile of Palm Leaves");
        add(CompatBlocks.HELLBARK_LEAF_PILE.get(), "Pile of Hellbark Leaves");
        add(CompatBlocks.FLOWERING_OAK_LEAF_PILE.get(), "Pile of Flowering Oak Leaves");
        add(CompatBlocks.RAINBOW_BIRCH_LEAF_PILE.get(), "Pile of Rainbow Birch Leaves");
        add(CompatBlocks.ORIGIN_LEAF_PILE.get(), "Pile of Origin Leaves");
        add(CompatBlocks.MAPLE_LEAF_PILE.get(), "Pile of Maple Leaves");
        add(CompatBlocks.ORANGE_AUTUMN_LEAF_PILE.get(), "Pile of Orange Autumn Leaves");
        add(CompatBlocks.YELLOW_AUTUMN_LEAF_PILE.get(), "Pile of Yellow Autumn Leaves");

        //Chests
        add(CompatBlocks.CHERRY_CHESTS.getFirst().get(), "Cherry Chest");
        add(CompatBlocks.JACARANDA_CHESTS.getFirst().get(), "Jacaranda Chest");
        add(CompatBlocks.FIR_CHESTS.getFirst().get(), "Fir Chest");
        add(CompatBlocks.REDWOOD_CHESTS.getFirst().get(), "Redwood Chest");
        add(CompatBlocks.MAHOGANY_CHESTS.getFirst().get(), "Mahogany Chest");
        add(CompatBlocks.WILLOW_CHESTS.getFirst().get(), "Willow Chest");
        add(CompatBlocks.MAGIC_CHESTS.getFirst().get(), "Magic Chest");
        add(CompatBlocks.DEAD_CHESTS.getFirst().get(), "Dead Chest");
        add(CompatBlocks.UMBRAN_CHESTS.getFirst().get(), "Umbran Chest");
        add(CompatBlocks.PALM_CHESTS.getFirst().get(), "Palm Chest");
        add(CompatBlocks.HELLBARK_CHESTS.getFirst().get(), "Hellbark Chest");

        //Trapped Chests
        add(CompatBlocks.CHERRY_CHESTS.getSecond().get(), "Cherry Trapped Chest");
        add(CompatBlocks.JACARANDA_CHESTS.getSecond().get(), "Jacaranda Trapped Chest");
        add(CompatBlocks.FIR_CHESTS.getSecond().get(), "Fir Trapped Chest");
        add(CompatBlocks.REDWOOD_CHESTS.getSecond().get(), "Redwood Trapped Chest");
        add(CompatBlocks.MAHOGANY_CHESTS.getSecond().get(), "Mahogany Trapped Chest");
        add(CompatBlocks.WILLOW_CHESTS.getSecond().get(), "Willow Trapped Chest");
        add(CompatBlocks.MAGIC_CHESTS.getSecond().get(), "Magic Trapped Chest");
        add(CompatBlocks.DEAD_CHESTS.getSecond().get(), "Dead Trapped Chest");
        add(CompatBlocks.UMBRAN_CHESTS.getSecond().get(), "Umbran Trapped Chest");
        add(CompatBlocks.PALM_CHESTS.getSecond().get(), "Palm Trapped Chest");
        add(CompatBlocks.HELLBARK_CHESTS.getSecond().get(), "Hellbark Trapped Chest");

        //Beehives
        add(CompatBlocks.CHERRY_BEEHIVE.get(), "Cherry Beehive");
        add(CompatBlocks.JACARANDA_BEEHIVE.get(), "Jacaranda Beehive");
        add(CompatBlocks.FIR_BEEHIVE.get(), "Fir Beehive");
        add(CompatBlocks.REDWOOD_BEEHIVE.get(), "Redwood Beehive");
        add(CompatBlocks.MAHOGANY_BEEHIVE.get(), "Mahogany Beehive");
        add(CompatBlocks.WILLOW_BEEHIVE.get(), "Willow Beehive");
        add(CompatBlocks.MAGIC_BEEHIVE.get(), "Magic Beehive");
        add(CompatBlocks.DEAD_BEEHIVE.get(), "Dead Beehive");
        add(CompatBlocks.UMBRAN_BEEHIVE.get(), "Umbran Beehive");
        add(CompatBlocks.PALM_BEEHIVE.get(), "Palm Beehive");
        add(CompatBlocks.HELLBARK_BEEHIVE.get(), "Hellbark Beehive");

        //Cabinets
        add(CompatBlocks.CHERRY_CABINET.get(), "Cherry Cabinet");
        add(CompatBlocks.JACARANDA_CABINET.get(), "Jacaranda Cabinet");
        add(CompatBlocks.FIR_CABINET.get(), "Fir Cabinet");
        add(CompatBlocks.REDWOOD_CABINET.get(), "Redwood Cabinet");
        add(CompatBlocks.MAHOGANY_CABINET.get(), "Mahogany Cabinet");
        add(CompatBlocks.WILLOW_CABINET.get(), "Willow Cabinet");
        add(CompatBlocks.MAGIC_CABINET.get(), "Magic Cabinet");
        add(CompatBlocks.DEAD_CABINET.get(), "Dead Cabinet");
        add(CompatBlocks.UMBRAN_CABINET.get(), "Umbran Cabinet");
        add(CompatBlocks.PALM_CABINET.get(), "Palm Cabinet");
        add(CompatBlocks.HELLBARK_CABINET.get(), "Hellbark Cabinet");

        //Tables
        add(CompatBlocks.CHERRY_TABLE.get(), "Cherry Table");
        add(CompatBlocks.JACARANDA_TABLE.get(), "Jacaranda Table");
        add(CompatBlocks.FIR_TABLE.get(), "Fir Table");
        add(CompatBlocks.REDWOOD_TABLE.get(), "Redwood Table");
        add(CompatBlocks.MAHOGANY_TABLE.get(), "Mahogany Table");
        add(CompatBlocks.WILLOW_TABLE.get(), "Willow Table");
        add(CompatBlocks.MAGIC_TABLE.get(), "Magic Table");
        add(CompatBlocks.DEAD_TABLE.get(), "Dead Table");
        add(CompatBlocks.UMBRAN_TABLE.get(), "Umbran Table");
        add(CompatBlocks.PALM_TABLE.get(), "Palm Table");
        add(CompatBlocks.HELLBARK_TABLE.get(), "Hellbark Table");

        //Vertical Planks
        add(CompatBlocks.VERTICAL_CHERRY_PLANKS.get(), "Vertical Cherry Planks");
        add(CompatBlocks.VERTICAL_JACARANDA_PLANKS.get(), "Vertical Jacaranda Planks");
        add(CompatBlocks.VERTICAL_FIR_PLANKS.get(), "Vertical Fir Planks");
        add(CompatBlocks.VERTICAL_REDWOOD_PLANKS.get(), "Vertical Redwood Planks");
        add(CompatBlocks.VERTICAL_MAHOGANY_PLANKS.get(), "Vertical Mahogany Planks");
        add(CompatBlocks.VERTICAL_WILLOW_PLANKS.get(), "Vertical Willow Planks");
        add(CompatBlocks.VERTICAL_MAGIC_PLANKS.get(), "Vertical Magic Planks");
        add(CompatBlocks.VERTICAL_DEAD_PLANKS.get(), "Vertical Dead Planks");
        add(CompatBlocks.VERTICAL_UMBRAN_PLANKS.get(), "Vertical Umbran Planks");
        add(CompatBlocks.VERTICAL_PALM_PLANKS.get(), "Vertical Palm Planks");
        add(CompatBlocks.VERTICAL_HELLBARK_PLANKS.get(), "Vertical Hellbark Planks");

        //Boards
        //Tables
        add(CompatBlocks.CHERRY_BOARDS.get(), "Cherry Boards");
        add(CompatBlocks.JACARANDA_BOARDS.get(), "Jacaranda Boards");
        add(CompatBlocks.FIR_BOARDS.get(), "Fir Boards");
        add(CompatBlocks.REDWOOD_BOARDS.get(), "Redwood Boards");
        add(CompatBlocks.MAHOGANY_BOARDS.get(), "Mahogany Boards");
        add(CompatBlocks.WILLOW_BOARDS.get(), "Willow Boards");
        add(CompatBlocks.MAGIC_BOARDS.get(), "Magic Boards");
        add(CompatBlocks.DEAD_BOARDS.get(), "Dead Boards");
        add(CompatBlocks.UMBRAN_BOARDS.get(), "Umbran Boards");
        add(CompatBlocks.PALM_BOARDS.get(), "Palm Boards");
        add(CompatBlocks.HELLBARK_BOARDS.get(), "Hellbark Boards");

        //Sandstone Bricks
        add(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), "White Sandstone Bricks");
        add(CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), "White Sandstone Brick Slab");
        add(CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS.get(), "White Sandstone Brick Stairs");
        add(CompatBlocks.WHITE_SANDSTONE_BRICK_WALL.get(), "White Sandstone Brick Wall");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), "Orange Sandstone Bricks");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), "Orange Sandstone Brick Slab");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get(), "Orange Sandstone Brick Stairs");
        add(CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get(), "Orange Sandstone Brick Wall");
        add(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), "Black Sandstone Bricks");
        add(CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), "Black Sandstone Brick Slab");
        add(CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get(), "Black Sandstone Brick Stairs");
        add(CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get(), "Black Sandstone Brick Wall");

        //Galanos
        add(CompatBlocks.GALANOS_BLOCK.get(), "Galanos Block");
        add(CompatBlocks.GALANOS_SLAB.get(), "Galanos Slab");
        add(CompatBlocks.GALANOS_STAIRS.get(), "Galanos Stairs");
        add(CompatBlocks.GALANOS_PILLAR.get(), "Galanos Pillar");

        //Polished Rose Quartz
        add(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), "Polished Rose Quartz");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), "Polished Rose Quartz Slab");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(), "Polished Rose Quartz Stairs");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), "Polished Rose Quartz Bricks");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), "Polished Rose Quartz Brick Slab");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get(), "Polished Rose Quartz Brick Stairs");
        add(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(), "Polished Rose Quartz Brick Wall");
        add(CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get(), "Cracked Polished Rose Quartz Bricks");
        add(CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get(), "Chiseled Polished Rose Quartz");

        //Chest Boats
        add(CompatItems.CHERRY_CHEST_BOAT.get(), "Cherry Boat with Chest");
        add(CompatItems.JACARANDA_CHEST_BOAT.get(), "Jacaranda Boat with Chest");
        add(CompatItems.FIR_CHEST_BOAT.get(), "Fir Boat with Chest");
        add(CompatItems.REDWOOD_CHEST_BOAT.get(), "Redwood Boat with Chest");
        add(CompatItems.MAHOGANY_CHEST_BOAT.get(), "Mahogany Boat with Chest");
        add(CompatItems.WILLOW_CHEST_BOAT.get(), "Willow Boat with Chest");
        add(CompatItems.MAGIC_CHEST_BOAT.get(), "Magic Boat with Chest");
        add(CompatItems.DEAD_CHEST_BOAT.get(), "Dead Boat with Chest");
        add(CompatItems.UMBRAN_CHEST_BOAT.get(), "Umbran Boat with Chest");
        add(CompatItems.PALM_CHEST_BOAT.get(), "Palm Boat with Chest");
        add(CompatItems.HELLBARK_CHEST_BOAT.get(), "Hellbark Boat with Chest");

        //Furnace Boats
        add(CompatItems.CHERRY_FURNACE_BOAT.get(), "Cherry Boat with Furnace");
        add(CompatItems.JACARANDA_FURNACE_BOAT.get(), "Jacaranda Boat with Furnace");
        add(CompatItems.FIR_FURNACE_BOAT.get(), "Fir Boat with Furnace");
        add(CompatItems.REDWOOD_FURNACE_BOAT.get(), "Redwood Boat with Furnace");
        add(CompatItems.MAHOGANY_FURNACE_BOAT.get(), "Mahogany Boat with Furnace");
        add(CompatItems.WILLOW_FURNACE_BOAT.get(), "Willow Boat with Furnace");
        add(CompatItems.MAGIC_FURNACE_BOAT.get(), "Magic Boat with Furnace");
        add(CompatItems.DEAD_FURNACE_BOAT.get(), "Dead Boat with Furnace");
        add(CompatItems.UMBRAN_FURNACE_BOAT.get(), "Umbran Boat with Furnace");
        add(CompatItems.PALM_FURNACE_BOAT.get(), "Palm Boat with Furnace");
        add(CompatItems.HELLBARK_FURNACE_BOAT.get(), "Hellbark Boat with Furnace");

        //Large Boats
        add(CompatItems.LARGE_CHERRY_BOAT.get(), "Large Cherry Boat");
        add(CompatItems.LARGE_JACARANDA_BOAT.get(), "Large Jacaranda Boat");
        add(CompatItems.LARGE_FIR_BOAT.get(), "Large Fir Boat");
        add(CompatItems.LARGE_REDWOOD_BOAT.get(), "Large Redwood Boat");
        add(CompatItems.LARGE_MAHOGANY_BOAT.get(), "Large Mahogany Boat");
        add(CompatItems.LARGE_WILLOW_BOAT.get(), "Large Willow Boat");
        add(CompatItems.LARGE_MAGIC_BOAT.get(), "Large Magic Boat");
        add(CompatItems.LARGE_DEAD_BOAT.get(), "Large Dead Boat");
        add(CompatItems.LARGE_UMBRAN_BOAT.get(), "Large Umbran Boat");
        add(CompatItems.LARGE_PALM_BOAT.get(), "Large Palm Boat");
        add(CompatItems.LARGE_HELLBARK_BOAT.get(), "Large Hellbark Boat");

        //Misc
        add(CompatItems.GLOWING_MOSS_PASTE.get(), "Glowing Moss Paste");
    }
}
