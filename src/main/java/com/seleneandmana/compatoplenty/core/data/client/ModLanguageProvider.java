package com.seleneandmana.compatoplenty.core.data.client;

import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, CompatOPlenty.MOD_ID, "en_us");
    }

    private void addTranslations(CompatBlocks.LeafSet set, String name) {
        add(set.hedge().get(), name + " Leaf Hedge");
        add(set.leafCarpet().get(), name + " Leaf Carpet");
        add(set.leafPile().get(), "Pile of " + name + " Leaves");
    }

    private void addTranslations(CompatBlocks.WoodSet set, String name) {
        add(set.verticalSlab().get(), name + " Vertical Slab");
        add(set.bookshelf().get(), name + " Bookshelf");
        add(set.ladder().get(), name + " Ladder");
        add(set.post().get(), name + " Post");
        add(set.table().get(), name + " Table");
        add(set.beehive().get(), name + " Beehive");
        add(set.cabinet().get(), name + " Cabinet");
        add(set.boards().get(), name + " Boards");
        add(set.chest().get(), name + " Chest");
        add(set.trappedChest().get(), name + " Trapped Chest");
        add(set.strippedPost().get(), "Stripped " + name + " Post");
        add(set.verticalPlanks().get(), "Vertical " + name + " Planks");

        addTranslations(set.leaveSet(), name);
    }

    @Override
    protected void addTranslations() {
        //Vertical Slabs
        addTranslations(CompatBlocks.JACARANDA, "Jacaranda");
        addTranslations(CompatBlocks.FIR, "Fir");
        addTranslations(CompatBlocks.REDWOOD, "Redwood");
        addTranslations(CompatBlocks.MAHOGANY, "Mahogany");
        addTranslations(CompatBlocks.WILLOW, "Willow");
        addTranslations(CompatBlocks.MAGIC, "Magic");
        addTranslations(CompatBlocks.DEAD, "Dead");
        addTranslations(CompatBlocks.UMBRAN, "Umbran");
        addTranslations(CompatBlocks.PALM, "Palm");
        addTranslations(CompatBlocks.HELLBARK, "Hellbark");

        addTranslations(CompatBlocks.FLOWERING_OAK, "Flowering Oak");
        addTranslations(CompatBlocks.RAINBOW_BIRCH, "Rainbow Birch");
        addTranslations(CompatBlocks.ORIGIN, "Origin");
        addTranslations(CompatBlocks.MAPLE, "Maple");
        addTranslations(CompatBlocks.ORANGE_AUTUMN, "Orange Autumn");
        addTranslations(CompatBlocks.YELLOW_AUTUMN, "Yellow Autumn");
        addTranslations(CompatBlocks.SNOW_BLOSSOM, "Snowblossom");

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

        //Furnace Boats
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
