package com.seleneandmana.compatoplenty.core.data.server;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.core.api.conditions.ConfigValueCondition;
import com.teamabnormals.blueprint.core.api.conditions.QuarkFlagRecipeCondition;
import com.teamabnormals.blueprint.core.util.TagUtil;
import com.teamabnormals.woodworks.core.WoodworksConfig;
import net.minecraft.data.DataGenerator;
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
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.crafting.ingredient.ToolActionIngredient;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.registry.ModSounds;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.HashMap;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        //Vertical Slabs
        verticalSlabRecipe(BOPBlocks.CHERRY_SLAB, CompatBlocks.CHERRY_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.JACARANDA_SLAB, CompatBlocks.JACARANDA_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.FIR_SLAB, CompatBlocks.FIR_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.REDWOOD_SLAB, CompatBlocks.REDWOOD_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.MAHOGANY_SLAB, CompatBlocks.MAHOGANY_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.WILLOW_SLAB, CompatBlocks.WILLOW_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.MAGIC_SLAB, CompatBlocks.MAGIC_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.DEAD_SLAB, CompatBlocks.DEAD_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.UMBRAN_SLAB, CompatBlocks.UMBRAN_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.PALM_SLAB, CompatBlocks.PALM_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.HELLBARK_SLAB, CompatBlocks.HELLBARK_VERTICAL_SLAB.get(), consumer);

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

        verticalSlabRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(CompatBlocks.GALANOS_SLAB.get(), CompatBlocks.GALANOS_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.MUD_BRICK_SLAB, CompatBlocks.MUD_BRICK_VERTICAL_SLAB.get(), consumer);

        //Bookshelves
        bookshelfRecipe(BOPBlocks.CHERRY_PLANKS, CompatBlocks.CHERRY_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.JACARANDA_PLANKS, CompatBlocks.JACARANDA_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.FIR_PLANKS, CompatBlocks.FIR_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.REDWOOD_PLANKS, CompatBlocks.REDWOOD_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.MAHOGANY_PLANKS, CompatBlocks.MAHOGANY_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.WILLOW_PLANKS, CompatBlocks.WILLOW_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.MAGIC_PLANKS, CompatBlocks.MAGIC_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.DEAD_PLANKS, CompatBlocks.DEAD_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.UMBRAN_PLANKS, CompatBlocks.UMBRAN_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.PALM_PLANKS, CompatBlocks.PALM_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.HELLBARK_PLANKS, CompatBlocks.HELLBARK_BOOKSHELF.get(), consumer);

        //Ladder
        ladderRecipe(BOPBlocks.CHERRY_PLANKS, CompatBlocks.CHERRY_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.JACARANDA_PLANKS, CompatBlocks.JACARANDA_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.FIR_PLANKS, CompatBlocks.FIR_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.REDWOOD_PLANKS, CompatBlocks.REDWOOD_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.MAHOGANY_PLANKS, CompatBlocks.MAHOGANY_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.WILLOW_PLANKS, CompatBlocks.WILLOW_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.MAGIC_PLANKS, CompatBlocks.MAGIC_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.DEAD_PLANKS, CompatBlocks.DEAD_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.UMBRAN_PLANKS, CompatBlocks.UMBRAN_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.PALM_PLANKS, CompatBlocks.PALM_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.HELLBARK_PLANKS, CompatBlocks.HELLBARK_LADDER.get(), consumer);

        //Wooden Posts
        postRecipe(BOPBlocks.CHERRY_WOOD, CompatBlocks.CHERRY_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_CHERRY_WOOD, CompatBlocks.STRIPPED_CHERRY_POST.get(), consumer);
        postRecipe(BOPBlocks.JACARANDA_WOOD, CompatBlocks.JACARANDA_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_JACARANDA_WOOD, CompatBlocks.STRIPPED_JACARANDA_POST.get(), consumer);
        postRecipe(BOPBlocks.FIR_WOOD, CompatBlocks.FIR_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_FIR_WOOD, CompatBlocks.STRIPPED_FIR_POST.get(), consumer);
        postRecipe(BOPBlocks.REDWOOD_WOOD, CompatBlocks.REDWOOD_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_REDWOOD_WOOD, CompatBlocks.STRIPPED_REDWOOD_POST.get(), consumer);
        postRecipe(BOPBlocks.MAHOGANY_WOOD, CompatBlocks.MAHOGANY_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_MAHOGANY_WOOD, CompatBlocks.STRIPPED_MAHOGANY_POST.get(), consumer);
        postRecipe(BOPBlocks.WILLOW_WOOD, CompatBlocks.WILLOW_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_WILLOW_WOOD, CompatBlocks.STRIPPED_WILLOW_POST.get(), consumer);
        postRecipe(BOPBlocks.MAGIC_WOOD, CompatBlocks.MAGIC_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_MAGIC_WOOD, CompatBlocks.STRIPPED_MAGIC_POST.get(), consumer);
        postRecipe(BOPBlocks.DEAD_WOOD, CompatBlocks.DEAD_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_DEAD_WOOD, CompatBlocks.STRIPPED_DEAD_POST.get(), consumer);
        postRecipe(BOPBlocks.UMBRAN_WOOD, CompatBlocks.UMBRAN_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_UMBRAN_WOOD, CompatBlocks.STRIPPED_UMBRAN_POST.get(), consumer);
        postRecipe(BOPBlocks.PALM_WOOD, CompatBlocks.PALM_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_PALM_WOOD, CompatBlocks.STRIPPED_PALM_POST.get(), consumer);
        postRecipe(BOPBlocks.HELLBARK_WOOD, CompatBlocks.HELLBARK_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_HELLBARK_WOOD, CompatBlocks.STRIPPED_HELLBARK_POST.get(), consumer);

        //Hedges
        hedgeRecipe(logTag("cherry"), BOPBlocks.WHITE_CHERRY_LEAVES, CompatBlocks.WHITE_CHERRY_HEDGE.get(), consumer);
        hedgeRecipe(logTag("cherry"), BOPBlocks.PINK_CHERRY_LEAVES, CompatBlocks.PINK_CHERRY_HEDGE.get(), consumer);
        hedgeRecipe(logTag("jacaranda"), BOPBlocks.JACARANDA_LEAVES, CompatBlocks.JACARANDA_HEDGE.get(), consumer);
        hedgeRecipe(logTag("fir"), BOPBlocks.FIR_LEAVES, CompatBlocks.FIR_HEDGE.get(), consumer);
        hedgeRecipe(logTag("redwood"), BOPBlocks.REDWOOD_LEAVES, CompatBlocks.REDWOOD_HEDGE.get(), consumer);
        hedgeRecipe(logTag("mahogany"), BOPBlocks.MAHOGANY_LEAVES, CompatBlocks.MAHOGANY_HEDGE.get(), consumer);
        hedgeRecipe(logTag("willow"), BOPBlocks.WILLOW_LEAVES, CompatBlocks.WILLOW_HEDGE.get(), consumer);
        hedgeRecipe(logTag("magic"), BOPBlocks.MAGIC_LEAVES, CompatBlocks.MAGIC_HEDGE.get(), consumer);
        hedgeRecipe(logTag("dead"), BOPBlocks.DEAD_LEAVES, CompatBlocks.DEAD_HEDGE.get(), consumer);
        hedgeRecipe(logTag("umbran"), BOPBlocks.UMBRAN_LEAVES, CompatBlocks.UMBRAN_HEDGE.get(), consumer);
        hedgeRecipe(logTag("palm"), BOPBlocks.PALM_LEAVES, CompatBlocks.PALM_HEDGE.get(), consumer);
        hedgeRecipe(logTag("hellbark"), BOPBlocks.HELLBARK_LEAVES, CompatBlocks.HELLBARK_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.FLOWERING_OAK_LEAVES, CompatBlocks.FLOWERING_OAK_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.BIRCH_LOGS, BOPBlocks.RAINBOW_BIRCH_LEAVES, CompatBlocks.RAINBOW_BIRCH_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.ORIGIN_LEAVES, CompatBlocks.ORIGIN_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.MAPLE_LEAVES, CompatBlocks.MAPLE_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.DARK_OAK_LOGS, BOPBlocks.ORANGE_AUTUMN_LEAVES, CompatBlocks.ORANGE_AUTUMN_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.BIRCH_LOGS, BOPBlocks.YELLOW_AUTUMN_LEAVES, CompatBlocks.YELLOW_AUTUMN_HEDGE.get(), consumer);

        //Leaf Carpets
        leafCarpetRecipe(BOPBlocks.WHITE_CHERRY_LEAVES, CompatBlocks.WHITE_CHERRY_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.PINK_CHERRY_LEAVES, CompatBlocks.PINK_CHERRY_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.JACARANDA_LEAVES, CompatBlocks.JACARANDA_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.FIR_LEAVES, CompatBlocks.FIR_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.REDWOOD_LEAVES, CompatBlocks.REDWOOD_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAHOGANY_LEAVES, CompatBlocks.MAHOGANY_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.WILLOW_LEAVES, CompatBlocks.WILLOW_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAGIC_LEAVES, CompatBlocks.MAGIC_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.DEAD_LEAVES, CompatBlocks.DEAD_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.UMBRAN_LEAVES, CompatBlocks.UMBRAN_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.PALM_LEAVES, CompatBlocks.PALM_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.HELLBARK_LEAVES, CompatBlocks.HELLBARK_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.FLOWERING_OAK_LEAVES, CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.RAINBOW_BIRCH_LEAVES, CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.ORIGIN_LEAVES, CompatBlocks.ORIGIN_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAPLE_LEAVES, CompatBlocks.MAPLE_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.ORANGE_AUTUMN_LEAVES, CompatBlocks.ORANGE_AUTUMN_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.YELLOW_AUTUMN_LEAVES, CompatBlocks.YELLOW_AUTUMN_LEAF_CARPET.get(), consumer);

        //Leaf Piles
        leafPileRecipe(BOPBlocks.WHITE_CHERRY_LEAVES, CompatBlocks.WHITE_CHERRY_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.PINK_CHERRY_LEAVES, CompatBlocks.PINK_CHERRY_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.JACARANDA_LEAVES, CompatBlocks.JACARANDA_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.FIR_LEAVES, CompatBlocks.FIR_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.REDWOOD_LEAVES, CompatBlocks.REDWOOD_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.MAHOGANY_LEAVES, CompatBlocks.MAHOGANY_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.WILLOW_LEAVES, CompatBlocks.WILLOW_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.MAGIC_LEAVES, CompatBlocks.MAGIC_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.DEAD_LEAVES, CompatBlocks.DEAD_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.UMBRAN_LEAVES, CompatBlocks.UMBRAN_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.PALM_LEAVES, CompatBlocks.PALM_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.HELLBARK_LEAVES, CompatBlocks.HELLBARK_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.FLOWERING_OAK_LEAVES, CompatBlocks.FLOWERING_OAK_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.RAINBOW_BIRCH_LEAVES, CompatBlocks.RAINBOW_BIRCH_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.ORIGIN_LEAVES, CompatBlocks.ORIGIN_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.MAPLE_LEAVES, CompatBlocks.MAPLE_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.ORANGE_AUTUMN_LEAVES, CompatBlocks.ORANGE_AUTUMN_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.YELLOW_AUTUMN_LEAVES, CompatBlocks.YELLOW_AUTUMN_LEAF_PILE.get(), consumer);

        //Chest
        chestRecipes(BOPBlocks.CHERRY_PLANKS, logTag("cherry"), CompatBlocks.CHERRY_CHESTS, consumer);
        chestRecipes(BOPBlocks.JACARANDA_PLANKS, logTag("jacaranda"), CompatBlocks.JACARANDA_CHESTS, consumer);
        chestRecipes(BOPBlocks.FIR_PLANKS, logTag("fir"), CompatBlocks.FIR_CHESTS, consumer);
        chestRecipes(BOPBlocks.REDWOOD_PLANKS, logTag("redwood"), CompatBlocks.REDWOOD_CHESTS, consumer);
        chestRecipes(BOPBlocks.MAHOGANY_PLANKS, logTag("mahogany"), CompatBlocks.MAHOGANY_CHESTS, consumer);
        chestRecipes(BOPBlocks.WILLOW_PLANKS, logTag("willow"), CompatBlocks.WILLOW_CHESTS, consumer);
        chestRecipes(BOPBlocks.MAGIC_PLANKS, logTag("magic"), CompatBlocks.MAGIC_CHESTS, consumer);
        chestRecipes(BOPBlocks.DEAD_PLANKS, logTag("dead"), CompatBlocks.DEAD_CHESTS, consumer);
        chestRecipes(BOPBlocks.UMBRAN_PLANKS, logTag("umbran"), CompatBlocks.UMBRAN_CHESTS, consumer);
        chestRecipes(BOPBlocks.PALM_PLANKS, logTag("palm"), CompatBlocks.PALM_CHESTS, consumer);
        chestRecipes(BOPBlocks.HELLBARK_PLANKS, logTag("hellbark"), CompatBlocks.HELLBARK_CHESTS, consumer);

        //Beehives
        beehiveRecipe(BOPBlocks.CHERRY_PLANKS, CompatBlocks.CHERRY_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.JACARANDA_PLANKS, CompatBlocks.JACARANDA_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.FIR_PLANKS, CompatBlocks.FIR_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.REDWOOD_PLANKS, CompatBlocks.REDWOOD_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.MAHOGANY_PLANKS, CompatBlocks.MAHOGANY_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.WILLOW_PLANKS, CompatBlocks.WILLOW_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.MAGIC_PLANKS, CompatBlocks.MAGIC_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.DEAD_PLANKS, CompatBlocks.DEAD_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.UMBRAN_PLANKS, CompatBlocks.UMBRAN_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.PALM_PLANKS, CompatBlocks.PALM_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.HELLBARK_PLANKS, CompatBlocks.HELLBARK_BEEHIVE.get(), consumer);

        //Vertical Planks
        verticalPlankRecipe(BOPBlocks.CHERRY_PLANKS, CompatBlocks.VERTICAL_CHERRY_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.JACARANDA_PLANKS, CompatBlocks.VERTICAL_JACARANDA_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.FIR_PLANKS, CompatBlocks.VERTICAL_FIR_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.REDWOOD_PLANKS, CompatBlocks.VERTICAL_REDWOOD_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.MAHOGANY_PLANKS, CompatBlocks.VERTICAL_MAHOGANY_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.WILLOW_PLANKS, CompatBlocks.VERTICAL_WILLOW_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.MAGIC_PLANKS, CompatBlocks.VERTICAL_MAGIC_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.DEAD_PLANKS, CompatBlocks.VERTICAL_DEAD_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.UMBRAN_PLANKS, CompatBlocks.VERTICAL_UMBRAN_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.PALM_PLANKS, CompatBlocks.VERTICAL_PALM_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.HELLBARK_PLANKS, CompatBlocks.VERTICAL_HELLBARK_PLANKS.get(), consumer);

        //Cabinet
        cabinetRecipe(BOPBlocks.CHERRY_SLAB, BOPBlocks.CHERRY_TRAPDOOR, CompatBlocks.CHERRY_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.JACARANDA_SLAB, BOPBlocks.JACARANDA_TRAPDOOR, CompatBlocks.JACARANDA_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.FIR_SLAB, BOPBlocks.FIR_TRAPDOOR, CompatBlocks.FIR_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.REDWOOD_SLAB, BOPBlocks.REDWOOD_TRAPDOOR, CompatBlocks.REDWOOD_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.MAHOGANY_SLAB, BOPBlocks.MAHOGANY_TRAPDOOR, CompatBlocks.MAHOGANY_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.WILLOW_SLAB, BOPBlocks.WILLOW_TRAPDOOR, CompatBlocks.WILLOW_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.MAGIC_SLAB, BOPBlocks.MAGIC_TRAPDOOR, CompatBlocks.MAGIC_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.DEAD_SLAB, BOPBlocks.DEAD_TRAPDOOR, CompatBlocks.DEAD_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.UMBRAN_SLAB, BOPBlocks.UMBRAN_TRAPDOOR, CompatBlocks.UMBRAN_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.PALM_SLAB, BOPBlocks.PALM_TRAPDOOR, CompatBlocks.PALM_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.HELLBARK_SLAB, BOPBlocks.HELLBARK_TRAPDOOR, CompatBlocks.HELLBARK_CABINET.get(), consumer);

        //Stairs
        sandstoneStairsRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get(), consumer);
        sandstoneStairsRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get(), consumer);
        sandstoneStairsRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_STAIRS.get(), consumer);
        galanosStairsRecipe(CompatBlocks.GALANOS_BLOCK.get(), CompatBlocks.GALANOS_STAIRS.get(), consumer);
        polishedRoseStairsRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(), consumer);
        polishedRoseStairsRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get(), consumer);

        //Slab
        sandstoneSlabRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), consumer);
        sandstoneSlabRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), consumer);
        sandstoneSlabRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), consumer);
        galanosSlabRecipe(CompatBlocks.GALANOS_BLOCK.get(), CompatBlocks.GALANOS_SLAB.get(), consumer);
        polishedRoseSlabRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), consumer);
        polishedRoseSlabRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), consumer);

        //Walls
        sandstoneWallRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get(), consumer);
        sandstoneWallRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get(), consumer);
        sandstoneWallRecipe(CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_WALL.get(), consumer);
        polishedRoseWallRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(), consumer);

        //2x2
        polishedRoseRecipe(consumer);
        galanosRecipe(consumer);

        //Chiseled
        chiseledBlockRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get(), CompatOPlenty.TWIGS_ID, consumer);

        //Tables
        tableRecipe(BOPBlocks.CHERRY_SLAB, BOPBlocks.CHERRY_FENCE, CompatBlocks.CHERRY_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.JACARANDA_SLAB, BOPBlocks.JACARANDA_FENCE, CompatBlocks.JACARANDA_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.FIR_SLAB, BOPBlocks.FIR_FENCE, CompatBlocks.FIR_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.REDWOOD_SLAB, BOPBlocks.REDWOOD_FENCE, CompatBlocks.REDWOOD_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.MAHOGANY_SLAB, BOPBlocks.MAHOGANY_FENCE, CompatBlocks.MAHOGANY_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.WILLOW_SLAB, BOPBlocks.WILLOW_FENCE, CompatBlocks.WILLOW_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.MAGIC_SLAB, BOPBlocks.MAGIC_FENCE, CompatBlocks.MAGIC_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.DEAD_SLAB, BOPBlocks.DEAD_FENCE, CompatBlocks.DEAD_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.UMBRAN_SLAB, BOPBlocks.UMBRAN_FENCE, CompatBlocks.UMBRAN_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.PALM_SLAB, BOPBlocks.PALM_FENCE, CompatBlocks.PALM_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.HELLBARK_SLAB, BOPBlocks.HELLBARK_FENCE, CompatBlocks.HELLBARK_TABLE.get(), consumer);

        //Boards
        boardsRecipe(BOPBlocks.CHERRY_PLANKS, CompatBlocks.CHERRY_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.JACARANDA_PLANKS, CompatBlocks.JACARANDA_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.FIR_PLANKS, CompatBlocks.FIR_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.REDWOOD_PLANKS, CompatBlocks.REDWOOD_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.MAHOGANY_PLANKS, CompatBlocks.MAHOGANY_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.WILLOW_PLANKS, CompatBlocks.WILLOW_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.MAGIC_PLANKS, CompatBlocks.MAGIC_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.DEAD_PLANKS, CompatBlocks.DEAD_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.UMBRAN_PLANKS, CompatBlocks.UMBRAN_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.PALM_PLANKS, CompatBlocks.PALM_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.HELLBARK_PLANKS, CompatBlocks.HELLBARK_BOARDS.get(), consumer);


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

        //Mud Bricks
        quarkFlagStoneCutterRecipe(BOPBlocks.MUD_BRICKS, CompatBlocks.MUD_BRICK_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);

        //Polished Rose Quartz
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_STAIRS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        multiModStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);
        multiModStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);
        multiModStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);
        multiModStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);
        multiModStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);

        /*
        Smelting
        */

        flaggedFurnaceRecipe(BOPBlocks.GLOWING_MOSS_BLOCK, CompatItems.GLOWING_MOSS_PASTE.get(), 1.0f, "midori", consumer);
        modLoadedFurnaceRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get(), 0.1f, CompatOPlenty.TWIGS_ID, consumer);

        /*
        Cutting Board
        */

        //Stripped Logs
        stripLogCuttingRecipe(BOPBlocks.CHERRY_LOG, BOPBlocks.STRIPPED_CHERRY_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.JACARANDA_LOG, BOPBlocks.STRIPPED_JACARANDA_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.FIR_LOG, BOPBlocks.STRIPPED_FIR_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.REDWOOD_LOG, BOPBlocks.STRIPPED_REDWOOD_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.MAHOGANY_LOG, BOPBlocks.STRIPPED_MAHOGANY_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.WILLOW_LOG, BOPBlocks.STRIPPED_WILLOW_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.MAGIC_LOG, BOPBlocks.STRIPPED_MAGIC_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.DEAD_LOG, BOPBlocks.STRIPPED_DEAD_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.UMBRAN_LOG, BOPBlocks.STRIPPED_UMBRAN_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.PALM_LOG, BOPBlocks.STRIPPED_PALM_LOG, consumer);
        stripLogCuttingRecipe(BOPBlocks.HELLBARK_LOG, BOPBlocks.STRIPPED_HELLBARK_LOG, consumer);

        //Stripped Wood
        stripLogCuttingRecipe(BOPBlocks.CHERRY_WOOD, BOPBlocks.STRIPPED_CHERRY_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.JACARANDA_WOOD, BOPBlocks.STRIPPED_JACARANDA_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.FIR_WOOD, BOPBlocks.STRIPPED_FIR_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.REDWOOD_WOOD, BOPBlocks.STRIPPED_REDWOOD_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.MAHOGANY_WOOD, BOPBlocks.STRIPPED_MAHOGANY_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.WILLOW_WOOD, BOPBlocks.STRIPPED_WILLOW_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.MAGIC_WOOD, BOPBlocks.STRIPPED_MAGIC_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.DEAD_WOOD, BOPBlocks.STRIPPED_DEAD_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.UMBRAN_WOOD, BOPBlocks.STRIPPED_UMBRAN_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.PALM_WOOD, BOPBlocks.STRIPPED_PALM_WOOD, consumer);
        stripLogCuttingRecipe(BOPBlocks.HELLBARK_WOOD, BOPBlocks.STRIPPED_HELLBARK_WOOD, consumer);

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

        //Furniture Salvage
        furnitureSalvageCuttingRecipes(BOPBlocks.CHERRY_PLANKS, BOPBlocks.CHERRY_DOOR, BOPBlocks.CHERRY_TRAPDOOR, BOPBlocks.CHERRY_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.JACARANDA_PLANKS, BOPBlocks.JACARANDA_DOOR, BOPBlocks.JACARANDA_TRAPDOOR, BOPBlocks.JACARANDA_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.FIR_PLANKS, BOPBlocks.FIR_DOOR, BOPBlocks.FIR_TRAPDOOR, BOPBlocks.FIR_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.REDWOOD_PLANKS, BOPBlocks.REDWOOD_DOOR, BOPBlocks.REDWOOD_TRAPDOOR, BOPBlocks.REDWOOD_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.MAHOGANY_PLANKS, BOPBlocks.MAHOGANY_DOOR, BOPBlocks.MAHOGANY_TRAPDOOR, BOPBlocks.MAHOGANY_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.WILLOW_PLANKS, BOPBlocks.WILLOW_DOOR, BOPBlocks.WILLOW_TRAPDOOR, BOPBlocks.WILLOW_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.MAGIC_PLANKS, BOPBlocks.MAGIC_DOOR, BOPBlocks.MAGIC_TRAPDOOR, BOPBlocks.MAGIC_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.DEAD_PLANKS, BOPBlocks.DEAD_DOOR, BOPBlocks.DEAD_TRAPDOOR, BOPBlocks.DEAD_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.UMBRAN_PLANKS, BOPBlocks.UMBRAN_DOOR, BOPBlocks.UMBRAN_TRAPDOOR, BOPBlocks.UMBRAN_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.PALM_PLANKS, BOPBlocks.PALM_DOOR, BOPBlocks.PALM_TRAPDOOR, BOPBlocks.PALM_SIGN, consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.HELLBARK_PLANKS, BOPBlocks.HELLBARK_DOOR, BOPBlocks.HELLBARK_TRAPDOOR, BOPBlocks.HELLBARK_SIGN, consumer);

        //Misc
        genericCuttingRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK, new ToolActionIngredient(ToolActions.PICKAXE_DIG), BOPItems.ROSE_QUARTZ_SHARD, 4, SoundEvents.AMETHYST_BLOCK_BREAK.getRegistryName().toString(), consumer);
        genericCuttingRecipe(BOPBlocks.MUD, new ToolActionIngredient(ToolActions.SHOVEL_DIG), BOPItems.MUD_BALL, 4, SoundEvents.SLIME_BLOCK_BREAK.getRegistryName().toString(), consumer);
        genericCuttingRecipe(BOPBlocks.MUD_BRICKS, new ToolActionIngredient(ToolActions.PICKAXE_DIG), BOPItems.MUD_BRICK, 4, SoundEvents.STONE_BREAK.getRegistryName().toString(), consumer);

    }
    public static Ingredient ingredientOf(ItemLike itemLike) {
        return Ingredient.of(itemLike);
    }
    public static TagKey<Item> logTag(String woodType) {
        return TagUtil.itemTag("biomesoplenty", woodType + "_logs");
    }

    public static final ResourceLocation quarkFlag = new ResourceLocation("blueprint", "quark_flag");

    public static void verticalSlabRecipe(ItemLike slab, ItemLike verticalSlab, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "vertical_slabs"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(verticalSlab, 3).define('S', slab).pattern("S").pattern("S").pattern("S").unlockedBy(getHasName(slab), has(slab)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(verticalSlab))))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(verticalSlab)));

        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "vertical_slabs"))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(slab).requires(verticalSlab).unlockedBy(getHasName(verticalSlab), has(verticalSlab)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(verticalSlab) + "_revert")))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(verticalSlab) + "_revert"));
    }

    public static void verticalPlankRecipe(ItemLike plank, ItemLike verticalPlank, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "vertical_planks"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(verticalPlank, 3).define('S', plank).pattern("S").pattern("S").pattern("S").unlockedBy(getHasName(plank), has(plank)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(verticalPlank))))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(verticalPlank)));

        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "vertical_planks"))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(plank).requires(verticalPlank).unlockedBy(getHasName(verticalPlank), has(verticalPlank)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(verticalPlank) + "_revert")))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(verticalPlank) + "_revert"));
    }

    public static void boardsRecipe(ItemLike plank, ItemLike board, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenBoards, "wooden_boards", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(board, 3).define('S', plank).pattern("S").pattern("S").pattern("S").unlockedBy(getHasName(plank), has(plank)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, getItemName(board))))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(board)));
    }

    public static void bookshelfRecipe(ItemLike plank, ItemLike bookshelf, Consumer<FinishedRecipe> consumer) {
        //Woodworks
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenBookshelves, "wooden_bookshelves", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(bookshelf).define('#', plank).define('B', Items.BOOK).pattern("###").pattern("BBB").pattern("###").unlockedBy(getHasName(plank), has(plank)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(bookshelf) + "_woodworks"));

        //Quark
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "variant_bookshelves"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(bookshelf).define('#', plank).define('B', Items.BOOK).pattern("###").pattern("BBB").pattern("###").unlockedBy(getHasName(plank), has(plank)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(bookshelf) + "_quark"));
    }

    public static void ladderRecipe(ItemLike plank, ItemLike ladder, Consumer<FinishedRecipe> consumer) {
        //Woodworks
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenLadders, "wooden_ladders", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(ladder, 4).define('#', Items.STICK).define('P', plank).pattern("# #").pattern("#P#").pattern("# #").unlockedBy(getHasName(plank), has(plank)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(ladder) + "_woodworks"));

        //Quark
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "variant_ladders"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(ladder, 4).define('#', Items.STICK).define('P', plank).pattern("# #").pattern("#P#").pattern("# #").unlockedBy(getHasName(plank), has(plank)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(ladder) + "_quark"));
    }

    public static void postRecipe(ItemLike wood, ItemLike post, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "wooden_posts"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(post, 8).define('#', wood).pattern("#").pattern("#").pattern("#").unlockedBy(getHasName(wood), has(wood)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(post)));
    }

    public static void hedgeRecipe(TagKey<Item> log, ItemLike leaves, ItemLike hedge, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "hedges"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(hedge, 2).define('#', log).define('L', leaves).pattern("L").pattern("#").unlockedBy(getHasName(leaves), has(leaves)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(hedge)));
    }

    public static void leafCarpetRecipe(ItemLike leaves, ItemLike carpet, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "leaf_carpet"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(carpet, 3).define('#', leaves).pattern("##").unlockedBy(getHasName(leaves), has(leaves)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(carpet)));
    }

    public static void leafPileRecipe(ItemLike leaves, ItemLike pile, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.leafPiles, "leaf_piles", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(pile, 4).requires(leaves).group("leaf_pile").unlockedBy(getHasName(leaves), has(leaves)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(pile)));

        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.leafPiles, "leaf_piles", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(leaves, 1).define('#', pile).pattern("##").pattern("##").group("leaves").unlockedBy(getHasName(pile), has(pile)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(leaves) + "_from_leaf_piles"));
    }

    public static void chestRecipes(ItemLike planks, TagKey<Item> log, Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> chestPair, Consumer<FinishedRecipe> consumer) {
        Block normal = chestPair.getFirst().get();
        Block trapped = chestPair.getSecond().get();

        //Woodworks
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenChests, "wooden_chests", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(normal).define('#', planks).pattern("###").pattern("# #").pattern("###").unlockedBy(getHasName(planks), has(planks)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(normal) + "_woodworks"));

        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenChests, "wooden_chests", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(trapped).requires(normal).requires(Items.TRIPWIRE_HOOK).unlockedBy(getHasName(normal), has(normal)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(trapped) + "_woodworks"));

        //Quark
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "variant_chests"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(normal).define('#', planks).pattern("###").pattern("# #").pattern("###").unlockedBy(getHasName(planks), has(planks)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(normal) + "_quark"));

        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new QuarkFlagRecipeCondition(quarkFlag, "wood_to_chest_recipes"), new QuarkFlagRecipeCondition(quarkFlag, "variant_chests")))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(normal, 4).define('#', log).pattern("###").pattern("# #").pattern("###").unlockedBy(getHasName(normal), has(normal)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(normal) + "_bulk")))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(normal) + "_quark_bulk"));

        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "variant_chests"))
                .addRecipe(consumer1 -> ShapelessRecipeBuilder.shapeless(trapped).requires(normal).requires(Items.TRIPWIRE_HOOK).unlockedBy(getHasName(normal), has(normal)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(trapped) + "_quark"));
    }

    public static void beehiveRecipe(ItemLike planks, ItemLike beehive, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new AndCondition(new ModLoadedCondition(CompatOPlenty.WOODWORKS_ID), new ConfigValueCondition(new ResourceLocation(CompatOPlenty.WOODWORKS_ID, "config"), WoodworksConfig.COMMON.woodenBeehives, "wooden_beehives", Maps.newHashMap(), false)))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(beehive).define('#', planks).define('H', Items.HONEYCOMB).pattern("###").pattern("HHH").pattern("###").unlockedBy(getHasName(planks), has(planks)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID)))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(beehive)));
    }

    public static void cabinetRecipe(ItemLike slab, ItemLike trapdoor, ItemLike cabinet, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.FARMERS_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(cabinet).define('#', slab).define('T', trapdoor).pattern("###").pattern("T T").pattern("###").unlockedBy(getHasName(slab), has(slab)).save(consumer1, new ResourceLocation(CompatOPlenty.MOD_ID)))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(cabinet)));
    }

    public static void sandstoneStairsRecipe(ItemLike material, ItemLike stairs, Consumer<FinishedRecipe> consumer) {
                ConditionalRecipe.builder()
                        .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "sandstone_bricks"))
                        .addRecipe(consumer1 -> stairBuilder(stairs, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                        .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(stairs)));
    }
    
    public static void galanosStairsRecipe(ItemLike material, ItemLike stairs, Consumer<FinishedRecipe> consumer) {
            ConditionalRecipe.builder()
                    .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "midori"))
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
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "sandstone_bricks"))
                .addRecipe(consumer1 -> slabBuilder(slab, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(slab)));
    }

    public static void galanosSlabRecipe(ItemLike material, ItemLike slab, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "midori"))
                .addRecipe(consumer1 -> slabBuilder(slab, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(slab)));

    }

    public static void polishedRoseSlabRecipe(ItemLike material, ItemLike slab, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> slabBuilder(slab, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(slab)));
    }

    public static void sandstoneWallRecipe(ItemLike material, ItemLike wall, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "sandstone_bricks"))
                .addRecipe(consumer1 -> wallBuilder(wall, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(wall)));

    }

    public static void polishedRoseWallRecipe(ItemLike material, ItemLike wall, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> wallBuilder(wall, ingredientOf(material)).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(wall)));
    }

    public static void polishedRoseRecipe(Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(CompatBlocks.POLISHED_ROSE_QUARTZ.get()).define('#', BOPBlocks.ROSE_QUARTZ_BLOCK).pattern("##").pattern("##").unlockedBy(getHasName(BOPBlocks.ROSE_QUARTZ_BLOCK), has(BOPBlocks.ROSE_QUARTZ_BLOCK)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));
    }
    public static void galanosRecipe(Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, "midori"))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(CompatBlocks.GALANOS_BLOCK.get()).define('#', CompatItems.GLOWING_MOSS_PASTE.get()).pattern("##").pattern("##").unlockedBy(getHasName(CompatItems.GLOWING_MOSS_PASTE.get()), has(CompatItems.GLOWING_MOSS_PASTE.get())).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(CompatBlocks.GALANOS_BLOCK.get())));
    }

    public static void tableRecipe(ItemLike slab, ItemLike fence, ItemLike table, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.TWIGS_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(table).define('#', slab).define('I', fence).pattern("###").pattern("I I").pattern("I I").unlockedBy(getHasName(slab), has(slab)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(table)));
    }

    public static void chiseledBlockRecipe(ItemLike slab, ItemLike result, String modId, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(modId))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(result).define('#', slab).pattern("#").pattern("#").unlockedBy(getHasName(slab), has(slab)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(result)));
    }

    public static void quarkFlagStoneCutterRecipe(ItemLike material, ItemLike result, int amount, String flag, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, flag))
                .addRecipe(consumer1 -> SingleItemRecipeBuilder.stonecutting(ingredientOf(material), result, amount).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "stonecutting/" + getConversionRecipeName(result, material)));
    }

    public static void modLoadedStoneCutterRecipe(ItemLike material, ItemLike result, int amount, String modId, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(modId))
                .addRecipe(consumer1 -> SingleItemRecipeBuilder.stonecutting(ingredientOf(material), result, amount).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "stonecutting/" + getConversionRecipeName(result, material)));
    }

    public static void multiModStoneCutterRecipe(ItemLike material, ItemLike result, int amount, String modId, String flag, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(modId))
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, flag))
                .addRecipe(consumer1 -> SingleItemRecipeBuilder.stonecutting(ingredientOf(material), result, amount).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "stonecutting/" + getConversionRecipeName(result, material)));
    }

    public static void flaggedFurnaceRecipe(ItemLike material, ItemLike result, float exp, String flag, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new QuarkFlagRecipeCondition(quarkFlag, flag))
                .addRecipe(consumer1 -> SimpleCookingRecipeBuilder.smelting(ingredientOf(material), result, exp, 200).unlockedBy(getHasName(material), has(material)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "smelting/" + getItemName(result)));
    }

    public static void modLoadedFurnaceRecipe(ItemLike material, ItemLike result, float exp, String modId, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(modId))
                .addRecipe(consumer1 -> SimpleCookingRecipeBuilder.smelting(ingredientOf(material), result, exp, 200).unlockedBy(getHasName(material), has(material)).save(consumer1))
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
                .addRecipe(consumer1 -> CuttingBoardRecipeBuilder.cuttingRecipe(ingredientOf(log), new ToolActionIngredient(ToolActions.AXE_STRIP), strippedLog).addResult(ModItems.TREE_BARK.get()).addSound(SoundEvents.AXE_STRIP.getRegistryName().toString()).build(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "cutting/" + getItemName(log)));
    }

    public static void dyeCuttingRecipe(ItemLike flower, ItemLike dye, Consumer<FinishedRecipe> consumer) {
        genericCuttingRecipe(flower, Ingredient.of(ForgeTags.TOOLS_KNIVES), dye, 2, ModSounds.BLOCK_CUTTING_BOARD_KNIFE.get().getRegistryName().toString(), consumer);
    }

    public static void furnitureSalvageCuttingRecipes(ItemLike plank, ItemLike door, ItemLike trapdoor, ItemLike sign, Consumer<FinishedRecipe> consumer) {
        genericCuttingRecipe(door, new ToolActionIngredient(ToolActions.AXE_DIG), plank, 1, SoundEvents.WOOD_BREAK.getRegistryName().toString(), consumer);
        genericCuttingRecipe(sign, new ToolActionIngredient(ToolActions.AXE_DIG), plank, 1, SoundEvents.WOOD_BREAK.getRegistryName().toString(), consumer);
        genericCuttingRecipe(trapdoor, new ToolActionIngredient(ToolActions.AXE_DIG), plank, 1, SoundEvents.WOOD_BREAK.getRegistryName().toString(), consumer);
    }
}
