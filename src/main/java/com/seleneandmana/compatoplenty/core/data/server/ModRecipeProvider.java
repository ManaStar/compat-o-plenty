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
import net.minecraftforge.registries.ForgeRegistries;
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
        verticalSlabRecipe(BOPBlocks.CHERRY_SLAB.get(), CompatBlocks.CHERRY_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.JACARANDA_SLAB.get(), CompatBlocks.JACARANDA_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.FIR_SLAB.get(), CompatBlocks.FIR_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.REDWOOD_SLAB.get(), CompatBlocks.REDWOOD_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.MAHOGANY_SLAB.get(), CompatBlocks.MAHOGANY_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.WILLOW_SLAB.get(), CompatBlocks.WILLOW_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.MAGIC_SLAB.get(), CompatBlocks.MAGIC_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.DEAD_SLAB.get(), CompatBlocks.DEAD_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.UMBRAN_SLAB.get(), CompatBlocks.UMBRAN_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.PALM_SLAB.get(), CompatBlocks.PALM_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.HELLBARK_SLAB.get(), CompatBlocks.HELLBARK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(BOPBlocks.BLACK_SANDSTONE_SLAB.get(), CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.CUT_BLACK_SANDSTONE_SLAB.get(), CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.SMOOTH_BLACK_SANDSTONE_SLAB.get(), CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(BOPBlocks.ORANGE_SANDSTONE_SLAB.get(), CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB.get(), CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get(), CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(BOPBlocks.WHITE_SANDSTONE_SLAB.get(), CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.CUT_WHITE_SANDSTONE_SLAB.get(), CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(BOPBlocks.SMOOTH_WHITE_SANDSTONE_SLAB.get(), CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(CompatBlocks.WHITE_SANDSTONE_BRICK_SLAB.get(), CompatBlocks.WHITE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), consumer);
        verticalSlabRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), consumer);

        verticalSlabRecipe(CompatBlocks.GALANOS_SLAB.get(), CompatBlocks.GALANOS_VERTICAL_SLAB.get(), consumer);

        //Bookshelves
        bookshelfRecipe(BOPBlocks.CHERRY_PLANKS.get(), CompatBlocks.CHERRY_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.JACARANDA_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.FIR_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.REDWOOD_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.MAHOGANY_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.WILLOW_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.MAGIC_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.DEAD_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.UMBRAN_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.PALM_BOOKSHELF.get(), consumer);
        bookshelfRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.HELLBARK_BOOKSHELF.get(), consumer);

        //Ladder
        ladderRecipe(BOPBlocks.CHERRY_PLANKS.get(), CompatBlocks.CHERRY_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.JACARANDA_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.FIR_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.REDWOOD_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.MAHOGANY_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.WILLOW_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.MAGIC_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.DEAD_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.UMBRAN_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.PALM_LADDER.get(), consumer);
        ladderRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.HELLBARK_LADDER.get(), consumer);

        //Wooden Posts
        postRecipe(BOPBlocks.CHERRY_WOOD.get(), CompatBlocks.CHERRY_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_CHERRY_WOOD.get(), CompatBlocks.STRIPPED_CHERRY_POST.get(), consumer);
        postRecipe(BOPBlocks.JACARANDA_WOOD.get(), CompatBlocks.JACARANDA_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_JACARANDA_WOOD.get(), CompatBlocks.STRIPPED_JACARANDA_POST.get(), consumer);
        postRecipe(BOPBlocks.FIR_WOOD.get(), CompatBlocks.FIR_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_FIR_WOOD.get(), CompatBlocks.STRIPPED_FIR_POST.get(), consumer);
        postRecipe(BOPBlocks.REDWOOD_WOOD.get(), CompatBlocks.REDWOOD_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_REDWOOD_WOOD.get(), CompatBlocks.STRIPPED_REDWOOD_POST.get(), consumer);
        postRecipe(BOPBlocks.MAHOGANY_WOOD.get(), CompatBlocks.MAHOGANY_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_MAHOGANY_WOOD.get(), CompatBlocks.STRIPPED_MAHOGANY_POST.get(), consumer);
        postRecipe(BOPBlocks.WILLOW_WOOD.get(), CompatBlocks.WILLOW_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_WILLOW_WOOD.get(), CompatBlocks.STRIPPED_WILLOW_POST.get(), consumer);
        postRecipe(BOPBlocks.MAGIC_WOOD.get(), CompatBlocks.MAGIC_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_MAGIC_WOOD.get(), CompatBlocks.STRIPPED_MAGIC_POST.get(), consumer);
        postRecipe(BOPBlocks.DEAD_WOOD.get(), CompatBlocks.DEAD_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_DEAD_WOOD.get(), CompatBlocks.STRIPPED_DEAD_POST.get(), consumer);
        postRecipe(BOPBlocks.UMBRAN_WOOD.get(), CompatBlocks.UMBRAN_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_UMBRAN_WOOD.get(), CompatBlocks.STRIPPED_UMBRAN_POST.get(), consumer);
        postRecipe(BOPBlocks.PALM_WOOD.get(), CompatBlocks.PALM_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_PALM_WOOD.get(), CompatBlocks.STRIPPED_PALM_POST.get(), consumer);
        postRecipe(BOPBlocks.HELLBARK_WOOD.get(), CompatBlocks.HELLBARK_POST.get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_HELLBARK_WOOD.get(), CompatBlocks.STRIPPED_HELLBARK_POST.get(), consumer);

        //Hedges
        hedgeRecipe(logTag("cherry"), BOPBlocks.WHITE_CHERRY_LEAVES.get(), CompatBlocks.WHITE_CHERRY_HEDGE.get(), consumer);
        hedgeRecipe(logTag("cherry"), BOPBlocks.PINK_CHERRY_LEAVES.get(), CompatBlocks.PINK_CHERRY_HEDGE.get(), consumer);
        hedgeRecipe(logTag("jacaranda"), BOPBlocks.JACARANDA_LEAVES.get(), CompatBlocks.JACARANDA_HEDGE.get(), consumer);
        hedgeRecipe(logTag("fir"), BOPBlocks.FIR_LEAVES.get(), CompatBlocks.FIR_HEDGE.get(), consumer);
        hedgeRecipe(logTag("redwood"), BOPBlocks.REDWOOD_LEAVES.get(), CompatBlocks.REDWOOD_HEDGE.get(), consumer);
        hedgeRecipe(logTag("mahogany"), BOPBlocks.MAHOGANY_LEAVES.get(), CompatBlocks.MAHOGANY_HEDGE.get(), consumer);
        hedgeRecipe(logTag("willow"), BOPBlocks.WILLOW_LEAVES.get(), CompatBlocks.WILLOW_HEDGE.get(), consumer);
        hedgeRecipe(logTag("magic"), BOPBlocks.MAGIC_LEAVES.get(), CompatBlocks.MAGIC_HEDGE.get(), consumer);
        hedgeRecipe(logTag("dead"), BOPBlocks.DEAD_LEAVES.get(), CompatBlocks.DEAD_HEDGE.get(), consumer);
        hedgeRecipe(logTag("umbran"), BOPBlocks.UMBRAN_LEAVES.get(), CompatBlocks.UMBRAN_HEDGE.get(), consumer);
        hedgeRecipe(logTag("palm"), BOPBlocks.PALM_LEAVES.get(), CompatBlocks.PALM_HEDGE.get(), consumer);
        hedgeRecipe(logTag("hellbark"), BOPBlocks.HELLBARK_LEAVES.get(), CompatBlocks.HELLBARK_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.FLOWERING_OAK_LEAVES.get(), CompatBlocks.FLOWERING_OAK_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.BIRCH_LOGS, BOPBlocks.RAINBOW_BIRCH_LEAVES.get(), CompatBlocks.RAINBOW_BIRCH_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.ORIGIN_LEAVES.get(), CompatBlocks.ORIGIN_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.MAPLE_LEAVES.get(), CompatBlocks.MAPLE_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.DARK_OAK_LOGS, BOPBlocks.ORANGE_AUTUMN_LEAVES.get(), CompatBlocks.ORANGE_AUTUMN_HEDGE.get(), consumer);
        hedgeRecipe(ItemTags.BIRCH_LOGS, BOPBlocks.YELLOW_AUTUMN_LEAVES.get(), CompatBlocks.YELLOW_AUTUMN_HEDGE.get(), consumer);

        //Leaf Carpets
        leafCarpetRecipe(BOPBlocks.WHITE_CHERRY_LEAVES.get(), CompatBlocks.WHITE_CHERRY_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.PINK_CHERRY_LEAVES.get(), CompatBlocks.PINK_CHERRY_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.JACARANDA_LEAVES.get(), CompatBlocks.JACARANDA_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.FIR_LEAVES.get(), CompatBlocks.FIR_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.REDWOOD_LEAVES.get(), CompatBlocks.REDWOOD_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAHOGANY_LEAVES.get(), CompatBlocks.MAHOGANY_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.WILLOW_LEAVES.get(), CompatBlocks.WILLOW_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAGIC_LEAVES.get(), CompatBlocks.MAGIC_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.DEAD_LEAVES.get(), CompatBlocks.DEAD_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.UMBRAN_LEAVES.get(), CompatBlocks.UMBRAN_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.PALM_LEAVES.get(), CompatBlocks.PALM_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.HELLBARK_LEAVES.get(), CompatBlocks.HELLBARK_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.FLOWERING_OAK_LEAVES.get(), CompatBlocks.FLOWERING_OAK_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.RAINBOW_BIRCH_LEAVES.get(), CompatBlocks.RAINBOW_BIRCH_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.ORIGIN_LEAVES.get(), CompatBlocks.ORIGIN_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAPLE_LEAVES.get(), CompatBlocks.MAPLE_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.ORANGE_AUTUMN_LEAVES.get(), CompatBlocks.ORANGE_AUTUMN_LEAF_CARPET.get(), consumer);
        leafCarpetRecipe(BOPBlocks.YELLOW_AUTUMN_LEAVES.get(), CompatBlocks.YELLOW_AUTUMN_LEAF_CARPET.get(), consumer);

        //Leaf Piles
        leafPileRecipe(BOPBlocks.WHITE_CHERRY_LEAVES.get(), CompatBlocks.WHITE_CHERRY_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.PINK_CHERRY_LEAVES.get(), CompatBlocks.PINK_CHERRY_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.JACARANDA_LEAVES.get(), CompatBlocks.JACARANDA_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.FIR_LEAVES.get(), CompatBlocks.FIR_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.REDWOOD_LEAVES.get(), CompatBlocks.REDWOOD_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.MAHOGANY_LEAVES.get(), CompatBlocks.MAHOGANY_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.WILLOW_LEAVES.get(), CompatBlocks.WILLOW_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.MAGIC_LEAVES.get(), CompatBlocks.MAGIC_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.DEAD_LEAVES.get(), CompatBlocks.DEAD_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.UMBRAN_LEAVES.get(), CompatBlocks.UMBRAN_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.PALM_LEAVES.get(), CompatBlocks.PALM_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.HELLBARK_LEAVES.get(), CompatBlocks.HELLBARK_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.FLOWERING_OAK_LEAVES.get(), CompatBlocks.FLOWERING_OAK_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.RAINBOW_BIRCH_LEAVES.get(), CompatBlocks.RAINBOW_BIRCH_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.ORIGIN_LEAVES.get(), CompatBlocks.ORIGIN_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.MAPLE_LEAVES.get(), CompatBlocks.MAPLE_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.ORANGE_AUTUMN_LEAVES.get(), CompatBlocks.ORANGE_AUTUMN_LEAF_PILE.get(), consumer);
        leafPileRecipe(BOPBlocks.YELLOW_AUTUMN_LEAVES.get(), CompatBlocks.YELLOW_AUTUMN_LEAF_PILE.get(), consumer);

        //Chest
        chestRecipes(BOPBlocks.CHERRY_PLANKS.get(), logTag("cherry"), CompatBlocks.CHERRY_CHESTS, consumer);
        chestRecipes(BOPBlocks.JACARANDA_PLANKS.get(), logTag("jacaranda"), CompatBlocks.JACARANDA_CHESTS, consumer);
        chestRecipes(BOPBlocks.FIR_PLANKS.get(), logTag("fir"), CompatBlocks.FIR_CHESTS, consumer);
        chestRecipes(BOPBlocks.REDWOOD_PLANKS.get(), logTag("redwood"), CompatBlocks.REDWOOD_CHESTS, consumer);
        chestRecipes(BOPBlocks.MAHOGANY_PLANKS.get(), logTag("mahogany"), CompatBlocks.MAHOGANY_CHESTS, consumer);
        chestRecipes(BOPBlocks.WILLOW_PLANKS.get(), logTag("willow"), CompatBlocks.WILLOW_CHESTS, consumer);
        chestRecipes(BOPBlocks.MAGIC_PLANKS.get(), logTag("magic"), CompatBlocks.MAGIC_CHESTS, consumer);
        chestRecipes(BOPBlocks.DEAD_PLANKS.get(), logTag("dead"), CompatBlocks.DEAD_CHESTS, consumer);
        chestRecipes(BOPBlocks.UMBRAN_PLANKS.get(), logTag("umbran"), CompatBlocks.UMBRAN_CHESTS, consumer);
        chestRecipes(BOPBlocks.PALM_PLANKS.get(), logTag("palm"), CompatBlocks.PALM_CHESTS, consumer);
        chestRecipes(BOPBlocks.HELLBARK_PLANKS.get(), logTag("hellbark"), CompatBlocks.HELLBARK_CHESTS, consumer);

        //Beehives
        beehiveRecipe(BOPBlocks.CHERRY_PLANKS.get(), CompatBlocks.CHERRY_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.JACARANDA_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.FIR_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.REDWOOD_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.MAHOGANY_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.WILLOW_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.MAGIC_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.DEAD_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.UMBRAN_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.PALM_BEEHIVE.get(), consumer);
        beehiveRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.HELLBARK_BEEHIVE.get(), consumer);

        //Vertical Planks
        verticalPlankRecipe(BOPBlocks.CHERRY_PLANKS.get(), CompatBlocks.VERTICAL_CHERRY_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.VERTICAL_JACARANDA_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.VERTICAL_FIR_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.VERTICAL_REDWOOD_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.VERTICAL_MAHOGANY_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.VERTICAL_WILLOW_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.VERTICAL_MAGIC_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.VERTICAL_DEAD_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.VERTICAL_UMBRAN_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.VERTICAL_PALM_PLANKS.get(), consumer);
        verticalPlankRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.VERTICAL_HELLBARK_PLANKS.get(), consumer);

        //Cabinet
        cabinetRecipe(BOPBlocks.CHERRY_SLAB.get(), BOPBlocks.CHERRY_TRAPDOOR.get(), CompatBlocks.CHERRY_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.JACARANDA_SLAB.get(), BOPBlocks.JACARANDA_TRAPDOOR.get(), CompatBlocks.JACARANDA_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.FIR_SLAB.get(), BOPBlocks.FIR_TRAPDOOR.get(), CompatBlocks.FIR_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.REDWOOD_SLAB.get(), BOPBlocks.REDWOOD_TRAPDOOR.get(), CompatBlocks.REDWOOD_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.MAHOGANY_SLAB.get(), BOPBlocks.MAHOGANY_TRAPDOOR.get(), CompatBlocks.MAHOGANY_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.WILLOW_SLAB.get(), BOPBlocks.WILLOW_TRAPDOOR.get(), CompatBlocks.WILLOW_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.MAGIC_SLAB.get(), BOPBlocks.MAGIC_TRAPDOOR.get(), CompatBlocks.MAGIC_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.DEAD_SLAB.get(), BOPBlocks.DEAD_TRAPDOOR.get(), CompatBlocks.DEAD_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.UMBRAN_SLAB.get(), BOPBlocks.UMBRAN_TRAPDOOR.get(), CompatBlocks.UMBRAN_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.PALM_SLAB.get(), BOPBlocks.PALM_TRAPDOOR.get(), CompatBlocks.PALM_CABINET.get(), consumer);
        cabinetRecipe(BOPBlocks.HELLBARK_SLAB.get(), BOPBlocks.HELLBARK_TRAPDOOR.get(), CompatBlocks.HELLBARK_CABINET.get(), consumer);

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

        tableRecipe(BOPBlocks.CHERRY_SLAB.get(), BOPBlocks.CHERRY_FENCE.get(), CompatBlocks.CHERRY_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.JACARANDA_SLAB.get(), BOPBlocks.JACARANDA_FENCE.get(), CompatBlocks.JACARANDA_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.FIR_SLAB.get(), BOPBlocks.FIR_FENCE.get(), CompatBlocks.FIR_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.REDWOOD_SLAB.get(), BOPBlocks.REDWOOD_FENCE.get(), CompatBlocks.REDWOOD_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.MAHOGANY_SLAB.get(), BOPBlocks.MAHOGANY_FENCE.get(), CompatBlocks.MAHOGANY_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.WILLOW_SLAB.get(), BOPBlocks.WILLOW_FENCE.get(), CompatBlocks.WILLOW_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.MAGIC_SLAB.get(), BOPBlocks.MAGIC_FENCE.get(), CompatBlocks.MAGIC_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.DEAD_SLAB.get(), BOPBlocks.DEAD_FENCE.get(), CompatBlocks.DEAD_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.UMBRAN_SLAB.get(), BOPBlocks.UMBRAN_FENCE.get(), CompatBlocks.UMBRAN_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.PALM_SLAB.get(), BOPBlocks.PALM_FENCE.get(), CompatBlocks.PALM_TABLE.get(), consumer);
        tableRecipe(BOPBlocks.HELLBARK_SLAB.get(), BOPBlocks.HELLBARK_FENCE.get(), CompatBlocks.HELLBARK_TABLE.get(), consumer);

        //Boards
        boardsRecipe(BOPBlocks.CHERRY_PLANKS.get(), CompatBlocks.CHERRY_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.JACARANDA_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.FIR_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.REDWOOD_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.MAHOGANY_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.WILLOW_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.MAGIC_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.DEAD_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.UMBRAN_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.PALM_BOARDS.get(), consumer);
        boardsRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.HELLBARK_BOARDS.get(), consumer);

        //Furnace Boats
        furnaceBoatRecipe(BOPItems.CHERRY_BOAT.get(), CompatItems.CHERRY_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.JACARANDA_BOAT.get(), CompatItems.JACARANDA_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.FIR_BOAT.get(), CompatItems.FIR_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.REDWOOD_BOAT.get(), CompatItems.REDWOOD_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.MAHOGANY_BOAT.get(), CompatItems.MAHOGANY_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.WILLOW_BOAT.get(), CompatItems.WILLOW_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.MAGIC_BOAT.get(), CompatItems.MAGIC_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.DEAD_BOAT.get(), CompatItems.DEAD_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.UMBRAN_BOAT.get(), CompatItems.UMBRAN_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.PALM_BOAT.get(), CompatItems.PALM_FURNACE_BOAT.get(), consumer);
        furnaceBoatRecipe(BOPItems.HELLBARK_BOAT.get(), CompatItems.HELLBARK_FURNACE_BOAT.get(), consumer);

        //Large Boats
        largeBoatRecipe(BOPItems.CHERRY_BOAT.get(), BOPBlocks.CHERRY_PLANKS.get(), CompatItems.LARGE_CHERRY_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.JACARANDA_BOAT.get(), BOPBlocks.JACARANDA_PLANKS.get(), CompatItems.LARGE_JACARANDA_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.FIR_BOAT.get(), BOPBlocks.FIR_PLANKS.get(), CompatItems.LARGE_FIR_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.REDWOOD_BOAT.get(), BOPBlocks.REDWOOD_PLANKS.get(), CompatItems.LARGE_REDWOOD_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.MAHOGANY_BOAT.get(), BOPBlocks.MAHOGANY_PLANKS.get(), CompatItems.LARGE_MAHOGANY_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.WILLOW_BOAT.get(), BOPBlocks.WILLOW_PLANKS.get(), CompatItems.LARGE_WILLOW_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.MAGIC_BOAT.get(), BOPBlocks.MAGIC_PLANKS.get(), CompatItems.LARGE_MAGIC_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.DEAD_BOAT.get(), BOPBlocks.DEAD_PLANKS.get(), CompatItems.LARGE_DEAD_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.UMBRAN_BOAT.get(), BOPBlocks.UMBRAN_PLANKS.get(), CompatItems.LARGE_UMBRAN_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.PALM_BOAT.get(), BOPBlocks.PALM_PLANKS.get(), CompatItems.LARGE_PALM_BOAT.get(), consumer);
        largeBoatRecipe(BOPItems.HELLBARK_BOAT.get(), BOPBlocks.HELLBARK_PLANKS.get(), CompatItems.LARGE_HELLBARK_BOAT.get(), consumer);

        /*
        Stonecutting
        */

        //Sandstone
        quarkFlagStoneCutterRecipe(BOPBlocks.BLACK_SANDSTONE.get(), CompatBlocks.BLACK_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.SMOOTH_BLACK_SANDSTONE.get(), CompatBlocks.SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_BLACK_SANDSTONE.get(), CompatBlocks.CUT_BLACK_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.BLACK_SANDSTONE.get(), CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_BLACK_SANDSTONE.get(), CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_STAIRS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_VERTICAL_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.BLACK_SANDSTONE_BRICKS.get(), CompatBlocks.BLACK_SANDSTONE_BRICK_WALL.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.ORANGE_SANDSTONE.get(), CompatBlocks.ORANGE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.SMOOTH_ORANGE_SANDSTONE.get(), CompatBlocks.SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_ORANGE_SANDSTONE.get(), CompatBlocks.CUT_ORANGE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.ORANGE_SANDSTONE.get(), CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_ORANGE_SANDSTONE.get(), CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_STAIRS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB.get(), 2, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(CompatBlocks.ORANGE_SANDSTONE_BRICKS.get(), CompatBlocks.ORANGE_SANDSTONE_BRICK_WALL.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.WHITE_SANDSTONE.get(), CompatBlocks.WHITE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.SMOOTH_WHITE_SANDSTONE.get(), CompatBlocks.SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_WHITE_SANDSTONE.get(), CompatBlocks.CUT_WHITE_SANDSTONE_VERTICAL_SLAB.get(), 2, "vertical_slabs", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.WHITE_SANDSTONE.get(), CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
        quarkFlagStoneCutterRecipe(BOPBlocks.CUT_WHITE_SANDSTONE.get(), CompatBlocks.WHITE_SANDSTONE_BRICKS.get(), 1, "sandstone_bricks", consumer);
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
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.POLISHED_ROSE_QUARTZ.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_STAIRS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.CHISELED_POLISHED_ROSE_QUARTZ.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, consumer);
        modLoadedStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_WALL.get(), 1, CompatOPlenty.TWIGS_ID, consumer);
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
        multiModStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);
        multiModStoneCutterRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);
        multiModStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);
        multiModStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);
        multiModStoneCutterRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB.get(), 2, CompatOPlenty.TWIGS_ID, "vertical_slabs", consumer);

        /*
        Smelting
        */

        flaggedFurnaceRecipe(BOPBlocks.GLOWING_MOSS_BLOCK.get(), CompatItems.GLOWING_MOSS_PASTE.get(), 1.0f, "midori", consumer);
        modLoadedFurnaceRecipe(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get(), CompatBlocks.CRACKED_POLISHED_ROSE_QUARTZ_BRICKS.get(), 0.1f, CompatOPlenty.TWIGS_ID, consumer);

        /*
        Cutting Board
        */

        //Stripped Logs
        stripLogCuttingRecipe(BOPBlocks.CHERRY_LOG.get(), BOPBlocks.STRIPPED_CHERRY_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.JACARANDA_LOG.get(), BOPBlocks.STRIPPED_JACARANDA_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.FIR_LOG.get(), BOPBlocks.STRIPPED_FIR_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.REDWOOD_LOG.get(), BOPBlocks.STRIPPED_REDWOOD_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.MAHOGANY_LOG.get(), BOPBlocks.STRIPPED_MAHOGANY_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.WILLOW_LOG.get(), BOPBlocks.STRIPPED_WILLOW_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.MAGIC_LOG.get(), BOPBlocks.STRIPPED_MAGIC_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.DEAD_LOG.get(), BOPBlocks.STRIPPED_DEAD_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.UMBRAN_LOG.get(), BOPBlocks.STRIPPED_UMBRAN_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.PALM_LOG.get(), BOPBlocks.STRIPPED_PALM_LOG.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.HELLBARK_LOG.get(), BOPBlocks.STRIPPED_HELLBARK_LOG.get(), consumer);

        //Stripped Wood
        stripLogCuttingRecipe(BOPBlocks.CHERRY_WOOD.get(), BOPBlocks.STRIPPED_CHERRY_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.JACARANDA_WOOD.get(), BOPBlocks.STRIPPED_JACARANDA_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.FIR_WOOD.get(), BOPBlocks.STRIPPED_FIR_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.REDWOOD_WOOD.get(), BOPBlocks.STRIPPED_REDWOOD_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.MAHOGANY_WOOD.get(), BOPBlocks.STRIPPED_MAHOGANY_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.WILLOW_WOOD.get(), BOPBlocks.STRIPPED_WILLOW_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.MAGIC_WOOD.get(), BOPBlocks.STRIPPED_MAGIC_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.DEAD_WOOD.get(), BOPBlocks.STRIPPED_DEAD_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.UMBRAN_WOOD.get(), BOPBlocks.STRIPPED_UMBRAN_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.PALM_WOOD.get(), BOPBlocks.STRIPPED_PALM_WOOD.get(), consumer);
        stripLogCuttingRecipe(BOPBlocks.HELLBARK_WOOD.get(), BOPBlocks.STRIPPED_HELLBARK_WOOD.get(), consumer);

        //Flowers
        dyeCuttingRecipe(BOPBlocks.BLUE_HYDRANGEA.get(), Items.LIGHT_BLUE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.BURNING_BLOSSOM.get(), Items.ORANGE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.GLOWFLOWER.get(), Items.CYAN_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.GOLDENROD.get(), Items.YELLOW_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.LAVENDER.get(), Items.PURPLE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.ORANGE_COSMOS.get(), Items.ORANGE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.PINK_DAFFODIL.get(), Items.PINK_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.PINK_HIBISCUS.get(), Items.PINK_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.ROSE.get(), Items.RED_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.VIOLET.get(), Items.PURPLE_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.WILDFLOWER.get(), Items.MAGENTA_DYE, consumer);
        dyeCuttingRecipe(BOPBlocks.WILTED_LILY.get(), Items.GRAY_DYE, consumer);

        //Furniture Salvage
        furnitureSalvageCuttingRecipes(BOPBlocks.CHERRY_PLANKS.get(), BOPBlocks.CHERRY_DOOR.get(), BOPBlocks.CHERRY_TRAPDOOR.get(), BOPBlocks.CHERRY_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.JACARANDA_PLANKS.get(), BOPBlocks.JACARANDA_DOOR.get(), BOPBlocks.JACARANDA_TRAPDOOR.get(), BOPBlocks.JACARANDA_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.FIR_PLANKS.get(), BOPBlocks.FIR_DOOR.get(), BOPBlocks.FIR_TRAPDOOR.get(), BOPBlocks.FIR_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.REDWOOD_PLANKS.get(), BOPBlocks.REDWOOD_DOOR.get(), BOPBlocks.REDWOOD_TRAPDOOR.get(), BOPBlocks.REDWOOD_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.MAHOGANY_PLANKS.get(), BOPBlocks.MAHOGANY_DOOR.get(), BOPBlocks.MAHOGANY_TRAPDOOR.get(), BOPBlocks.MAHOGANY_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.WILLOW_PLANKS.get(), BOPBlocks.WILLOW_DOOR.get(), BOPBlocks.WILLOW_TRAPDOOR.get(), BOPBlocks.WILLOW_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.MAGIC_PLANKS.get(), BOPBlocks.MAGIC_DOOR.get(), BOPBlocks.MAGIC_TRAPDOOR.get(), BOPBlocks.MAGIC_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.DEAD_PLANKS.get(), BOPBlocks.DEAD_DOOR.get(), BOPBlocks.DEAD_TRAPDOOR.get(), BOPBlocks.DEAD_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.UMBRAN_PLANKS.get(), BOPBlocks.UMBRAN_DOOR.get(), BOPBlocks.UMBRAN_TRAPDOOR.get(), BOPBlocks.UMBRAN_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.PALM_PLANKS.get(), BOPBlocks.PALM_DOOR.get(), BOPBlocks.PALM_TRAPDOOR.get(), BOPBlocks.PALM_SIGN.get(), consumer);
        furnitureSalvageCuttingRecipes(BOPBlocks.HELLBARK_PLANKS.get(), BOPBlocks.HELLBARK_DOOR.get(), BOPBlocks.HELLBARK_TRAPDOOR.get(), BOPBlocks.HELLBARK_SIGN.get(), consumer);

        //Misc
        genericCuttingRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), new ToolActionIngredient(ToolActions.PICKAXE_DIG), BOPItems.ROSE_QUARTZ_SHARD.get(), 4, ForgeRegistries.SOUND_EVENTS.getKey(SoundEvents.AMETHYST_BLOCK_BREAK).toString(), consumer);
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

    public static void furnaceBoatRecipe(ItemLike boat, ItemLike furnaceBoat, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.BOATLOAD_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(furnaceBoat, 1).group("furnace_boat").define('F', Items.FURNACE).define('B', boat).pattern("F").pattern("B").unlockedBy(getHasName(boat), has(boat)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(furnaceBoat)));
    }

    public static void largeBoatRecipe(ItemLike boat, ItemLike planks, ItemLike largeBoat, Consumer<FinishedRecipe> consumer) {
        ConditionalRecipe.builder()
                .addCondition(new ModLoadedCondition(CompatOPlenty.BOATLOAD_ID))
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(largeBoat, 1).group("large_boat").define('B', boat).define('P', planks).pattern("PBP").pattern("PPP").unlockedBy(getHasName(boat), has(boat)).save(consumer1))
                .build(consumer, new ResourceLocation(CompatOPlenty.MOD_ID, "crafting/" + getItemName(largeBoat)));
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
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(CompatBlocks.POLISHED_ROSE_QUARTZ.get()).define('#', BOPBlocks.ROSE_QUARTZ_BLOCK.get()).pattern("##").pattern("##").unlockedBy(getHasName(BOPBlocks.ROSE_QUARTZ_BLOCK.get()), has(BOPBlocks.ROSE_QUARTZ_BLOCK.get())).save(consumer1))
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
