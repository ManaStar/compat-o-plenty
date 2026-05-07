package com.seleneandmana.compatoplenty.core.data.server;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.google.common.collect.Maps;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;
import com.teamabnormals.blueprint.core.api.conditions.ConfigValueCondition;
import com.teamabnormals.blueprint.core.util.TagUtil;
import com.teamabnormals.woodworks.core.WoodworksConfig;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.AndCondition;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.common.crafting.conditions.OrCondition;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.crafting.ingredient.ToolActionIngredient;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.registry.ModSounds;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.function.Consumer;

import static com.seleneandmana.compatoplenty.core.CompatOPlenty.QUARK_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.VSLAB_ID;
import static net.minecraft.data.recipes.RecipeCategory.BUILDING_BLOCKS;
import static net.minecraft.data.recipes.RecipeCategory.DECORATIONS;
import static net.minecraft.data.recipes.RecipeCategory.REDSTONE;
import static net.minecraft.data.recipes.RecipeCategory.TRANSPORTATION;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        for (CompatBlocks.WoodSet set : CompatBlocks.woodSets().toList()) {
            woodsetRecipes(set, consumer);
        }

        verticalSlabRecipe(BOPBlocks.BLACK_SANDSTONE_SLAB, CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.CUT_BLACK_SANDSTONE_SLAB, CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(BOPBlocks.ORANGE_SANDSTONE_SLAB, CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB, CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB, CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(BOPBlocks.WHITE_SANDSTONE_SLAB, CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.CUT_WHITE_SANDSTONE_SLAB, CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(CompatBlocks.GALANOS_SLAB.get(), CompatBlocks.GALANOS_VERTICAL_SLAB.get(), consumer);

        //Hedges
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.FLOWERING_OAK_LEAVES, CompatBlocks.FLOWERING_OAK.hedge().get(), consumer);
        hedgeRecipe(ItemTags.BIRCH_LOGS, BOPBlocks.RAINBOW_BIRCH_LEAVES, CompatBlocks.RAINBOW_BIRCH.hedge().get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.ORIGIN_LEAVES, CompatBlocks.ORIGIN.hedge().get(), consumer);
        hedgeRecipe(logTag("maple"), BOPBlocks.ORANGE_MAPLE_LEAVES, CompatBlocks.ORANGE_MAPLE.hedge().get(), consumer);
        hedgeRecipe(logTag("maple"), BOPBlocks.YELLOW_MAPLE_LEAVES, CompatBlocks.YELLOW_MAPLE.hedge().get(), consumer);

        //Leaf Carpets
        leafCarpetRecipe(BOPBlocks.FLOWERING_OAK_LEAVES, CompatBlocks.FLOWERING_OAK.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.RAINBOW_BIRCH_LEAVES, CompatBlocks.RAINBOW_BIRCH.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.ORIGIN_LEAVES, CompatBlocks.ORIGIN.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.ORANGE_MAPLE_LEAVES, CompatBlocks.ORANGE_MAPLE.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.YELLOW_MAPLE_LEAVES, CompatBlocks.YELLOW_MAPLE.leafCarpet().get(), consumer);

        //Leaf Piles
        leafPileRecipe(BOPBlocks.FLOWERING_OAK_LEAVES, CompatBlocks.FLOWERING_OAK.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.RAINBOW_BIRCH_LEAVES, CompatBlocks.RAINBOW_BIRCH.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.ORIGIN_LEAVES, CompatBlocks.ORIGIN.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.ORANGE_MAPLE_LEAVES, CompatBlocks.ORANGE_MAPLE.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.YELLOW_MAPLE_LEAVES, CompatBlocks.YELLOW_MAPLE.leafPile().get(), consumer);

        //Stairs
        sandstoneStairsRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get(), consumer);
        sandstoneStairsRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get(), consumer);
        sandstoneStairsRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS.get(), consumer);
        galanosStairsRecipe(CompatBlocks.GALANOS_BLOCK.get(), CompatBlocks.GALANOS_STAIRS.get(), consumer);

        //Slab
        sandstoneSlabRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), consumer);
        sandstoneSlabRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), consumer);
        sandstoneSlabRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), consumer);
        galanosSlabRecipe(CompatBlocks.GALANOS_BLOCK.get(), CompatBlocks.GALANOS_SLAB.get(), consumer);

        //Walls
        sandstoneWallRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get(), consumer);
        sandstoneWallRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get(), consumer);
        sandstoneWallRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_WALL.get(), consumer);

        //2x2
        polishedRoseRecipe(consumer);
        galanosRecipe(consumer);

        //Furnace Boats
        furnaceBoatRecipe(BOPItems.JACARANDA_BOAT, CompatItems.JACARANDA_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.FIR_BOAT, CompatItems.FIR_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.REDWOOD_BOAT, CompatItems.REDWOOD_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.MAHOGANY_BOAT, CompatItems.MAHOGANY_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.WILLOW_BOAT, CompatItems.WILLOW_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.MAGIC_BOAT, CompatItems.MAGIC_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.DEAD_BOAT, CompatItems.DEAD_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.UMBRAN_BOAT, CompatItems.UMBRAN_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.PALM_BOAT, CompatItems.PALM_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.HELLBARK_BOAT, CompatItems.HELLBARK_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.EMPYREAL_BOAT, CompatItems.EMPYREAL_FURNACE_BOAT.get(), consumer);

        //Large Boats
        largeBoatRecipe(BOPItems.JACARANDA_BOAT, BOPBlocks.JACARANDA_PLANKS, CompatItems.LARGE_JACARANDA_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.FIR_BOAT, BOPBlocks.FIR_PLANKS, CompatItems.LARGE_FIR_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.REDWOOD_BOAT, BOPBlocks.REDWOOD_PLANKS, CompatItems.LARGE_REDWOOD_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.MAHOGANY_BOAT, BOPBlocks.MAHOGANY_PLANKS, CompatItems.LARGE_MAHOGANY_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.WILLOW_BOAT, BOPBlocks.WILLOW_PLANKS, CompatItems.LARGE_WILLOW_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.MAGIC_BOAT, BOPBlocks.MAGIC_PLANKS, CompatItems.LARGE_MAGIC_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.DEAD_BOAT, BOPBlocks.DEAD_PLANKS, CompatItems.LARGE_DEAD_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.UMBRAN_BOAT, BOPBlocks.UMBRAN_PLANKS, CompatItems.LARGE_UMBRAN_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.PALM_BOAT, BOPBlocks.PALM_PLANKS, CompatItems.LARGE_PALM_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.HELLBARK_BOAT, BOPBlocks.HELLBARK_PLANKS, CompatItems.LARGE_HELLBARK_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.EMPYREAL_BOAT, BOPBlocks.EMPYREAL_PLANKS, CompatItems.LARGE_EMPYREAL_BOAT.get(), consumer);

        /*
        Stonecutting
        */

        //Sandstone
        quarkFlagStoneCutterRecipe(BOPBlocks.BLACK_SANDSTONE, CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.SMOOTH_BLACK_SANDSTONE, CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_BLACK_SANDSTONE, CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.BLACK_SANDSTONE, CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_BLACK_SANDSTONE, CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.ORANGE_SANDSTONE, CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.SMOOTH_ORANGE_SANDSTONE, CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_ORANGE_SANDSTONE, CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.ORANGE_SANDSTONE, CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_ORANGE_SANDSTONE, CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.WHITE_SANDSTONE, CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.SMOOTH_WHITE_SANDSTONE, CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_WHITE_SANDSTONE, CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.WHITE_SANDSTONE, CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_WHITE_SANDSTONE, CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_WALL.get(), 1, "sandstone_bricks", consumer);

        //Galanos
        quarkFlagStoneCutterRecipe(CompatBlocks.GALANOS_BLOCK.get(), CompatBlocks.GALANOS_STAIRS.get(), 1, "midori", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.GALANOS_BLOCK.get(), CompatBlocks.GALANOS_SLAB.get(), 2, "midori", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.GALANOS_BLOCK.get(), CompatBlocks.GALANOS_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.GALANOS_BLOCK.get(), CompatBlocks.GALANOS_PILLAR.get(), 1, "midori", consumer);

        //Polished Rose Quartz
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ.get(), 1, CompatOPlenty.TWIGS_ID, consumer);

        /*
        Smelting
        */

        flaggedFurnaceRecipe(BOPBlocks.GLOWING_MOSS_BLOCK, CompatItems.GLOWING_MOSS_PASTE.get(), 1.0f, "midori", consumer);

        /*
        Cutting Board
        */

        //Flowers
        dyeCuttingRecipe(BOPBlocks.BLUE_HYDRANGEA, Items.LIGHT_BLUE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.BURNING_BLOSSOM, Items.ORANGE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.GLOWFLOWER, Items.CYAN_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.GOLDENROD, Items.YELLOW_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.LAVENDER, Items.PURPLE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.ORANGE_COSMOS, Items.ORANGE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.PINK_DAFFODIL, Items.PINK_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.PINK_HIBISCUS, Items.PINK_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.ROSE, Items.RED_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.VIOLET, Items.PURPLE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.WILDFLOWER, Items.MAGENTA_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.WILTED_LILY, Items.GRAY_DYE, consumer);

        //Misc
        genericCuttingRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, new ToolActionIngredient(ToolActions.PICKAXE_DIG), BOPItems.ROSE_QUARTZ_CHUNK, 4, ForgeRegistries.SOUND_EVENTS.getKey(SoundEvents.AMETHYST_BLOCK_BREAK).toString(), consumer);
    }
    public static Ingredient ingredientOf(ItemLike itemLike) {
        return Ingredient.of(itemLike);
    }
    public static TagKey<Item> logTag(String woodType) {
        return TagUtil.itemTag("biomesoplenty", woodType + "_logs");
    }

    private static ICondition vslabCondition() {
        return new OrCondition(new ModLoadedCondition(VSLAB_ID), quarkFlagCondition("vertical_slabs"));
    }

    private static ICondition quarkFlagCondition(String flag) {
        // TODO emit actual flag condition
        return new ModLoadedCondition(QUARK_ID);
    }

    private void woodsetRecipes(CompatBlocks.WoodSet set, Consumer<FinishedRecipe> consumer) {
        verticalSlabRecipe(set.slab().get(), set.verticalSlab().get(), consumer);
        bookshelfRecipe(set.planks().get(), set.bookshelf().get(), consumer);
        ladderRecipe(set.planks().get(), set.ladder().get(), consumer);
        postRecipe(set.wood().get(), set.post().get(), consumer);
        postRecipe(set.strippedWood().get(), set.strippedPost().get(), consumer);
        chestRecipes(set.planks().get(), logTag(set.name()), set, consumer);
        beehiveRecipe(set.planks().get(), set.beehive().get(), consumer);
        verticalPlankRecipe(set.planks().get(), set.verticalPlanks().get(), consumer);
        cabinetRecipe(set.slab().get(), set.trapdoor().get(), set.cabinet().get(), consumer);
        boardsRecipe(set.slab().get(), set.boards().get(), consumer);
        stripLogCuttingRecipe(set.log().get(), set.strippedLog().get(), consumer);
        stripLogCuttingRecipe(set.wood().get(), set.strippedWood().get(), consumer);
        furnitureSalvageCuttingRecipes(set.planks().get(), set.door().get(), set.trapdoor().get(), set.sign().get(), consumer);

        if (!set.name().equals("maple")) {
            hedgeRecipe(logTag(set.name()), set.leaveSet().leaves().get(), set.leaveSet().hedge().get(), consumer);
            leafCarpetRecipe(set.leaveSet().leaves().get(), set.leaveSet().leafCarpet().get(), consumer);
            leafPileRecipe(set.leaveSet().leaves().get(), set.leaveSet().leafPile().get(), consumer);
            tableRecipe(set.slab().get(), set.leaveSet().fence().get(), set.table().get(), consumer);
        } else {
            tableRecipe(set.slab().get(), CompatBlocks.RED_MAPLE.fence().get(), set.table().get(), consumer);
        }
    }

    public static void verticalSlabRecipe(ItemLike slab, ItemLike verticalSlab, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(vslabCondition())
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, verticalSlab, 3).define('S', slab).pattern("S").pattern("S").pattern("S").unlockedBy(getHasName(slab), has(slab)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(verticalSlab))))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(verticalSlab)));

        ConditionalRecipe.builder()
                .addCondition(vslabCondition())
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(BUILDING_BLOCKS, slab).requires(verticalSlab).unlockedBy(getHasName(verticalSlab), has(verticalSlab)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(verticalSlab) + "_revert")))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(verticalSlab) + "_revert"));
    }

    public static void verticalPlankRecipe(ItemLike plank, ItemLike verticalPlank, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition("vertical_planks"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, verticalPlank, 3).define('S', plank).pattern("S").pattern("S").pattern("S").unlockedBy(getHasName(plank), has(plank)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(verticalPlank))))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(verticalPlank)));

        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition("vertical_planks"))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(BUILDING_BLOCKS, plank).requires(verticalPlank).unlockedBy(getHasName(verticalPlank), has(verticalPlank)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(verticalPlank) + "_revert")))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(verticalPlank) + "_revert"));
    }

    public static void boardsRecipe(ItemLike slab, ItemLike board, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenBoards, "wooden_boards", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, board).define('S', slab).pattern("S").pattern("S").unlockedBy(getHasName(slab), has(slab)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(board))))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(board)));
    }

    public static void bookshelfRecipe(ItemLike plank, ItemLike bookshelf, Consumer<FinishedRecipe> consumer) {
        //Woodworks
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenBookshelves, "wooden_bookshelves", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, bookshelf).define('#', plank).define('B', Items.BOOK).pattern("###").pattern("BBB").pattern("###").unlockedBy(getHasName(plank), has(plank)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(bookshelf) + "_woodworks"));

        //Quark
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(QUARK_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, bookshelf).define('#', plank).define('B', Items.BOOK).pattern("###").pattern("BBB").pattern("###").unlockedBy(getHasName(plank), has(plank)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(bookshelf) + "_quark"));
    }

    public static void ladderRecipe(ItemLike plank, ItemLike ladder, Consumer<FinishedRecipe> consumer) {
        //Woodworks
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition("woodworks"), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenLadders, "wooden_ladders", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, ladder, 4).define('#', Items.STICK).define('P', plank).pattern("# #").pattern("#P#").pattern("# #").unlockedBy(getHasName(plank), has(plank)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(ladder) + "_woodworks"));

        //Quark
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(QUARK_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, ladder, 4).define('#', Items.STICK).define('P', plank).pattern("# #").pattern("#P#").pattern("# #").unlockedBy(getHasName(plank), has(plank)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(ladder) + "_quark"));
    }

    public static void postRecipe(ItemLike wood, ItemLike post, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(QUARK_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, post, 8).define('#', wood).pattern("#").pattern("#").pattern("#").unlockedBy(getHasName(wood), has(wood)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(post)));
    }

    public static void hedgeRecipe(TagKey<Item> log, ItemLike leaves, ItemLike hedge, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(QUARK_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, hedge, 2).define('#', log).define('L', leaves).pattern("L").pattern("#").unlockedBy(getHasName(leaves), has(leaves)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(hedge)));
    }

    public static void leafCarpetRecipe(ItemLike leaves, ItemLike carpet, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(QUARK_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, carpet, 3).define('#', leaves).pattern("##").unlockedBy(getHasName(leaves), has(leaves)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(carpet)));
    }

    public static void leafPileRecipe(ItemLike leaves, ItemLike pile, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.leafPiles, "leaf_piles", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(DECORATIONS, pile, 4).requires(leaves).group("leaf_pile").unlockedBy(getHasName(leaves), has(leaves)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(pile)));

        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.leafPiles, "leaf_piles", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, leaves, 1).define('#', pile).pattern("##").pattern("##").group("leaves").unlockedBy(getHasName(pile), has(pile)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(leaves) + "_from_leaf_piles"));
    }

    public static void chestRecipes(ItemLike planks, TagKey<Item> log, CompatBlocks.WoodSet set, Consumer<FinishedRecipe> consumer) {
        Block normal = set.chest().get();
        Block trapped = set.trappedChest().get();

        //Woodworks
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenChests, "wooden_chests", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, normal).define('#', planks).pattern("###").pattern("# #").pattern("###").unlockedBy(getHasName(planks), has(planks)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(normal) + "_woodworks"));

        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenChests, "wooden_chests", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(REDSTONE, trapped).requires(normal).requires(Items.TRIPWIRE_HOOK).unlockedBy(getHasName(normal), has(normal)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(trapped) + "_woodworks"));

        //Quark
        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition("variant_chests"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, normal).define('#', planks).pattern("###").pattern("# #").pattern("###").unlockedBy(getHasName(planks), has(planks)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(normal) + "_quark"));

        ConditionalRecipe.builder()
                .addCondition(new AndCondition(quarkFlagCondition("wood_to_chest_recipes"), quarkFlagCondition("variant_chests")))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, normal, 4).define('#', log).pattern("###").pattern("# #").pattern("###").unlockedBy(getHasName(normal), has(normal)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(normal) + "_bulk")))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(normal) + "_quark_bulk"));

        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition("variant_chests"))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(REDSTONE, trapped).requires(normal).requires(Items.TRIPWIRE_HOOK).unlockedBy(getHasName(normal), has(normal)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(trapped) + "_quark"));
    }

    public static void beehiveRecipe(ItemLike planks, ItemLike beehive, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenBeehives, "wooden_beehives", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, beehive).define('#', planks).define('H', Items.HONEYCOMB).pattern("###").pattern("HHH").pattern("###").unlockedBy(getHasName(planks), has(planks)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID)))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(beehive)));
    }

    public static void cabinetRecipe(ItemLike slab, ItemLike trapdoor, ItemLike cabinet, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.FARMERS_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, cabinet).define('#', slab).define('T', trapdoor).pattern("###").pattern("T T").pattern("###").unlockedBy(getHasName(slab), has(slab)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID)))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(cabinet)));
    }

    public static void furnaceBoatRecipe(ItemLike boat, ItemLike furnaceBoat, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.BOATLOAD_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(TRANSPORTATION, furnaceBoat, 1).group("furnace_boat").define('F', Items.FURNACE).define('B', boat).pattern("F").pattern("B").unlockedBy(getHasName(boat), has(boat)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(furnaceBoat)));
    }

    public static void largeBoatRecipe(ItemLike boat, ItemLike planks, ItemLike largeBoat, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.BOATLOAD_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(TRANSPORTATION, largeBoat, 1).group("large_boat").define('B', boat).define('P', planks).pattern("PBP").pattern("PPP").unlockedBy(getHasName(boat), has(boat)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(largeBoat)));
    }

    public static void sandstoneStairsRecipe(ItemLike material, ItemLike stairs, Consumer<FinishedRecipe> consumer) {
                ConditionalRecipe.builder()
                        .addCondition(quarkFlagCondition("sandstone_bricks"))
                        .addRecipe(consumer1 -> stairBuilder(stairs, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                        .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(stairs)));
    }

    public static void galanosStairsRecipe(ItemLike material, ItemLike stairs, Consumer<FinishedRecipe> consumer) {
            ConditionalRecipe.builder()
                    .addCondition(quarkFlagCondition("midori"))
                    .addRecipe(consumer1 -> stairBuilder(stairs, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                    .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(stairs)));

    }

    public static void polishedRoseStairsRecipe(ItemLike material, ItemLike stairs, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> stairBuilder(stairs, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(stairs)));
    }

    public static void sandstoneSlabRecipe(ItemLike material, ItemLike slab, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition("sandstone_bricks"))
                .addRecipe(consumer1 -> slabBuilder(BUILDING_BLOCKS, slab, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(slab)));
    }

    public static void galanosSlabRecipe(ItemLike material, ItemLike slab, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition("midori"))
                .addRecipe(consumer1 -> slabBuilder(BUILDING_BLOCKS, slab, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(slab)));

    }

    public static void polishedRoseSlabRecipe(ItemLike material, ItemLike slab, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> slabBuilder(BUILDING_BLOCKS, slab, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(slab)));
    }

    public static void sandstoneWallRecipe(ItemLike material, ItemLike wall, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition("sandstone_bricks"))
                .addRecipe(consumer1 -> wallBuilder(BUILDING_BLOCKS, wall, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(wall)));

    }

    public static void polishedRoseWallRecipe(ItemLike material, ItemLike wall, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> wallBuilder(BUILDING_BLOCKS, wall, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(wall)));
    }

    public static void polishedRoseRecipe(Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CompatBlocks.POLISHED_ROSE_QUARTZ.get()).define('#', BOPBlocks.ROSE_QUARTZ_BLOCK).pattern("##").pattern("##").unlockedBy(getHasName(BOPBlocks.ROSE_QUARTZ_BLOCK), has(BOPBlocks.ROSE_QUARTZ_BLOCK)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));
    }
    public static void galanosRecipe(Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition("midori"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CompatBlocks.GALANOS_BLOCK.get()).define('#', CompatItems.GLOWING_MOSS_PASTE.get()).pattern("##").pattern("##").unlockedBy(getHasName(CompatItems.GLOWING_MOSS_PASTE.get()), has(CompatItems.GLOWING_MOSS_PASTE.get())).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(CompatBlocks.GALANOS_BLOCK.get())));
    }

    public static void tableRecipe(ItemLike slab, ItemLike fence, ItemLike table, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(DECORATIONS, table).define('#', slab).define('I', fence).pattern("###").pattern("I I").pattern("I I").unlockedBy(getHasName(slab), has(slab)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(table)));
    }

    public static void chiseledBlockRecipe(ItemLike slab, ItemLike result, String modId, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(modId))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, result).define('#', slab).pattern("#").pattern("#").unlockedBy(getHasName(slab), has(slab)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(result)));
    }

    public static void quarkFlagStoneCutterRecipe(ItemLike material, ItemLike result, int amount, String flag, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition(flag))
                .addRecipe(consumer1 -> SingleItemRecipeBuilder.stonecutting(ingredientOf(material), BUILDING_BLOCKS, result, amount).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "stonecutting/" + getConversionRecipeName(result, material)));
    }

    public static void modLoadedStoneCutterRecipe(ItemLike material, ItemLike result, int amount, String modId, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(modId))
                .addRecipe(consumer1 -> SingleItemRecipeBuilder.stonecutting(ingredientOf(material), BUILDING_BLOCKS, result, amount).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "stonecutting/" + getConversionRecipeName(result, material)));
    }

    public static void multiModStoneCutterRecipe(ItemLike material, ItemLike result, int amount, String modId, String flag, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(modId))
                .addCondition(quarkFlagCondition(flag))
                .addRecipe(consumer1 -> SingleItemRecipeBuilder.stonecutting(ingredientOf(material), BUILDING_BLOCKS, result, amount).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "stonecutting/" + getConversionRecipeName(result, material)));
    }

    public static void flaggedFurnaceRecipe(ItemLike material, ItemLike result, float exp, String flag, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(quarkFlagCondition(flag))
                .addRecipe(consumer1 -> SimpleCookingRecipeBuilder.smelting(ingredientOf(material), BUILDING_BLOCKS, result, exp, 200).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "smelting/" + getItemName(result)));
    }

    public static void modLoadedFurnaceRecipe(ItemLike material, ItemLike result, float exp, String modId, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(modId))
                .addRecipe(consumer1 -> SimpleCookingRecipeBuilder.smelting(ingredientOf(material), BUILDING_BLOCKS, result, exp, 200).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "smelting/" + getItemName(result)));
    }

    public static void genericCuttingRecipe(ItemLike material, Ingredient tool, ItemLike result, int count, String soundId, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.FARMERS_ID))
                .addRecipe(consumer1 -> CuttingBoardRecipeBuilder.cuttingRecipe(ingredientOf(material), tool, result, count).addSound(soundId).build(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "cutting/" + getItemName(material)));
    }

    public static void stripLogCuttingRecipe(ItemLike log, ItemLike strippedLog, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.FARMERS_ID))
                .addRecipe(consumer1 -> CuttingBoardRecipeBuilder.cuttingRecipe(ingredientOf(log), new ToolActionIngredient(ToolActions.AXE_STRIP), strippedLog).addResult(ModItems.TREE_BARK.get()).addSound(ForgeRegistries.SOUND_EVENTS.getKey(SoundEvents.AXE_STRIP).toString()).build(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "cutting/" + getItemName(log)));
    }

    public static void dyeCuttingRecipe(ItemLike flower, ItemLike dye, Consumer<FinishedRecipe> consumer) {
        genericCuttingRecipe(flower, Ingredient.of(ForgeTags.TOOLS_KNIVES), dye, 2, ForgeRegistries.SOUND_EVENTS.getKey(ModSounds.BLOCK_CUTTING_BOARD_KNIFE.get()).toString(), consumer);
    }

    public static void furnitureSalvageCuttingRecipes(ItemLike plank, ItemLike door, ItemLike trapdoor, ItemLike sign, Consumer<FinishedRecipe> consumer) {
        genericCuttingRecipe(door, new ToolActionIngredient(ToolActions.AXE_DIG), plank, 1, ForgeRegistries.SOUND_EVENTS.getKey(SoundEvents.WOOD_BREAK).toString(), consumer);
        genericCuttingRecipe(sign, new ToolActionIngredient(ToolActions.AXE_DIG), plank, 1, ForgeRegistries.SOUND_EVENTS.getKey(SoundEvents.WOOD_BREAK).toString(), consumer);
        genericCuttingRecipe(trapdoor, new ToolActionIngredient(ToolActions.AXE_DIG), plank, 1, ForgeRegistries.SOUND_EVENTS.getKey(SoundEvents.WOOD_BREAK).toString(), consumer);
    }
}
