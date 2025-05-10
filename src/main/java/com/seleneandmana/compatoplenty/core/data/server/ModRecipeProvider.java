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
import net.minecraftforge.registries.RegistryObject;
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

        //Vertical Slabs
        verticalSlabRecipe(BOPBlocks.JACARANDA_SLAB.get(), CompatBlocks.JACARANDA.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.FIR_SLAB.get(), CompatBlocks.FIR.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.REDWOOD_SLAB.get(), CompatBlocks.REDWOOD.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.MAHOGANY_SLAB.get(), CompatBlocks.MAHOGANY.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.WILLOW_SLAB.get(), CompatBlocks.WILLOW.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.MAGIC_SLAB.get(), CompatBlocks.MAGIC.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.DEAD_SLAB.get(), CompatBlocks.DEAD.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.UMBRAN_SLAB.get(), CompatBlocks.UMBRAN.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.PALM_SLAB.get(), CompatBlocks.PALM.verticalSlab().get(), consumer);
        verticalSlabRecipe(BOPBlocks.HELLBARK_SLAB.get(), CompatBlocks.HELLBARK.verticalSlab().get(), consumer);

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
        bookshelfRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.JACARANDA.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.FIR.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.REDWOOD.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.MAHOGANY.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.WILLOW.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.MAGIC.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.DEAD.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.UMBRAN.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.PALM.bookshelf().get(), consumer);
        bookshelfRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.HELLBARK.bookshelf().get(), consumer);

        //Ladder
        ladderRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.JACARANDA.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.FIR.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.REDWOOD.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.MAHOGANY.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.WILLOW.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.MAGIC.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.DEAD.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.UMBRAN.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.PALM.ladder().get(), consumer);
        ladderRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.HELLBARK.ladder().get(), consumer);

        //Wooden Posts
        postRecipe(BOPBlocks.JACARANDA_WOOD.get(), CompatBlocks.JACARANDA.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_JACARANDA_WOOD.get(), CompatBlocks.JACARANDA.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.FIR_WOOD.get(), CompatBlocks.FIR.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_FIR_WOOD.get(), CompatBlocks.FIR.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.REDWOOD_WOOD.get(), CompatBlocks.REDWOOD.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_REDWOOD_WOOD.get(), CompatBlocks.REDWOOD.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.MAHOGANY_WOOD.get(), CompatBlocks.MAHOGANY.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_MAHOGANY_WOOD.get(), CompatBlocks.MAHOGANY.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.WILLOW_WOOD.get(), CompatBlocks.WILLOW.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_WILLOW_WOOD.get(), CompatBlocks.WILLOW.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.MAGIC_WOOD.get(), CompatBlocks.MAGIC.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_MAGIC_WOOD.get(), CompatBlocks.MAGIC.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.DEAD_WOOD.get(), CompatBlocks.DEAD.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_DEAD_WOOD.get(), CompatBlocks.DEAD.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.UMBRAN_WOOD.get(), CompatBlocks.UMBRAN.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_UMBRAN_WOOD.get(), CompatBlocks.UMBRAN.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.PALM_WOOD.get(), CompatBlocks.PALM.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_PALM_WOOD.get(), CompatBlocks.PALM.strippedPost().get(), consumer);
        postRecipe(BOPBlocks.HELLBARK_WOOD.get(), CompatBlocks.HELLBARK.post().get(), consumer);
        postRecipe(BOPBlocks.STRIPPED_HELLBARK_WOOD.get(), CompatBlocks.HELLBARK.strippedPost().get(), consumer);

        //Hedges
        hedgeRecipe(logTag("jacaranda"), BOPBlocks.JACARANDA_LEAVES.get(), CompatBlocks.JACARANDA.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("fir"), BOPBlocks.FIR_LEAVES.get(), CompatBlocks.FIR.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("redwood"), BOPBlocks.REDWOOD_LEAVES.get(), CompatBlocks.REDWOOD.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("mahogany"), BOPBlocks.MAHOGANY_LEAVES.get(), CompatBlocks.MAHOGANY.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("willow"), BOPBlocks.WILLOW_LEAVES.get(), CompatBlocks.WILLOW.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("magic"), BOPBlocks.MAGIC_LEAVES.get(), CompatBlocks.MAGIC.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("dead"), BOPBlocks.DEAD_LEAVES.get(), CompatBlocks.DEAD.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("umbran"), BOPBlocks.UMBRAN_LEAVES.get(), CompatBlocks.UMBRAN.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("palm"), BOPBlocks.PALM_LEAVES.get(), CompatBlocks.PALM.leaveSet().hedge().get(), consumer);
        hedgeRecipe(logTag("hellbark"), BOPBlocks.HELLBARK_LEAVES.get(), CompatBlocks.HELLBARK.leaveSet().hedge().get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.FLOWERING_OAK_LEAVES.get(), CompatBlocks.FLOWERING_OAK.hedge().get(), consumer);
        hedgeRecipe(ItemTags.BIRCH_LOGS, BOPBlocks.RAINBOW_BIRCH_LEAVES.get(), CompatBlocks.RAINBOW_BIRCH.hedge().get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.ORIGIN_LEAVES.get(), CompatBlocks.ORIGIN.hedge().get(), consumer);
        hedgeRecipe(ItemTags.OAK_LOGS, BOPBlocks.MAPLE_LEAVES.get(), CompatBlocks.MAPLE.hedge().get(), consumer);
        hedgeRecipe(ItemTags.DARK_OAK_LOGS, BOPBlocks.ORANGE_AUTUMN_LEAVES.get(), CompatBlocks.ORANGE_AUTUMN.hedge().get(), consumer);
        hedgeRecipe(ItemTags.BIRCH_LOGS, BOPBlocks.YELLOW_AUTUMN_LEAVES.get(), CompatBlocks.YELLOW_AUTUMN.hedge().get(), consumer);

        //Leaf Carpets
        leafCarpetRecipe(BOPBlocks.JACARANDA_LEAVES.get(), CompatBlocks.JACARANDA.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.FIR_LEAVES.get(), CompatBlocks.FIR.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.REDWOOD_LEAVES.get(), CompatBlocks.REDWOOD.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAHOGANY_LEAVES.get(), CompatBlocks.MAHOGANY.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.WILLOW_LEAVES.get(), CompatBlocks.WILLOW.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAGIC_LEAVES.get(), CompatBlocks.MAGIC.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.DEAD_LEAVES.get(), CompatBlocks.DEAD.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.UMBRAN_LEAVES.get(), CompatBlocks.UMBRAN.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.PALM_LEAVES.get(), CompatBlocks.PALM.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.HELLBARK_LEAVES.get(), CompatBlocks.HELLBARK.leaveSet().leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.FLOWERING_OAK_LEAVES.get(), CompatBlocks.FLOWERING_OAK.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.RAINBOW_BIRCH_LEAVES.get(), CompatBlocks.RAINBOW_BIRCH.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.ORIGIN_LEAVES.get(), CompatBlocks.ORIGIN.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.MAPLE_LEAVES.get(), CompatBlocks.MAPLE.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.ORANGE_AUTUMN_LEAVES.get(), CompatBlocks.ORANGE_AUTUMN.leafCarpet().get(), consumer);
        leafCarpetRecipe(BOPBlocks.YELLOW_AUTUMN_LEAVES.get(), CompatBlocks.YELLOW_AUTUMN.leafCarpet().get(), consumer);

        //Leaf Piles
        leafPileRecipe(BOPBlocks.JACARANDA_LEAVES.get(), CompatBlocks.JACARANDA.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.FIR_LEAVES.get(), CompatBlocks.FIR.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.REDWOOD_LEAVES.get(), CompatBlocks.REDWOOD.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.MAHOGANY_LEAVES.get(), CompatBlocks.MAHOGANY.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.WILLOW_LEAVES.get(), CompatBlocks.WILLOW.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.MAGIC_LEAVES.get(), CompatBlocks.MAGIC.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.DEAD_LEAVES.get(), CompatBlocks.DEAD.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.UMBRAN_LEAVES.get(), CompatBlocks.UMBRAN.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.PALM_LEAVES.get(), CompatBlocks.PALM.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.HELLBARK_LEAVES.get(), CompatBlocks.HELLBARK.leaveSet().leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.FLOWERING_OAK_LEAVES.get(), CompatBlocks.FLOWERING_OAK.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.RAINBOW_BIRCH_LEAVES.get(), CompatBlocks.RAINBOW_BIRCH.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.ORIGIN_LEAVES.get(), CompatBlocks.ORIGIN.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.MAPLE_LEAVES.get(), CompatBlocks.MAPLE.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.ORANGE_AUTUMN_LEAVES.get(), CompatBlocks.ORANGE_AUTUMN.leafPile().get(), consumer);
        leafPileRecipe(BOPBlocks.YELLOW_AUTUMN_LEAVES.get(), CompatBlocks.YELLOW_AUTUMN.leafPile().get(), consumer);

        //Chest
        chestRecipes(BOPBlocks.JACARANDA_PLANKS.get(), logTag("jacaranda"), CompatBlocks.JACARANDA, consumer);
        chestRecipes(BOPBlocks.FIR_PLANKS.get(), logTag("fir"), CompatBlocks.FIR, consumer);
        chestRecipes(BOPBlocks.REDWOOD_PLANKS.get(), logTag("redwood"), CompatBlocks.REDWOOD, consumer);
        chestRecipes(BOPBlocks.MAHOGANY_PLANKS.get(), logTag("mahogany"), CompatBlocks.MAHOGANY, consumer);
        chestRecipes(BOPBlocks.WILLOW_PLANKS.get(), logTag("willow"), CompatBlocks.WILLOW, consumer);
        chestRecipes(BOPBlocks.MAGIC_PLANKS.get(), logTag("magic"), CompatBlocks.MAGIC, consumer);
        chestRecipes(BOPBlocks.DEAD_PLANKS.get(), logTag("dead"), CompatBlocks.DEAD, consumer);
        chestRecipes(BOPBlocks.UMBRAN_PLANKS.get(), logTag("umbran"), CompatBlocks.UMBRAN, consumer);
        chestRecipes(BOPBlocks.PALM_PLANKS.get(), logTag("palm"), CompatBlocks.PALM, consumer);
        chestRecipes(BOPBlocks.HELLBARK_PLANKS.get(), logTag("hellbark"), CompatBlocks.HELLBARK, consumer);

        //Beehives
        beehiveRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.JACARANDA.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.FIR.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.REDWOOD.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.MAHOGANY.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.WILLOW.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.MAGIC.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.DEAD.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.UMBRAN.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.PALM.beehive().get(), consumer);
        beehiveRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.HELLBARK.beehive().get(), consumer);

        //Vertical Planks
        verticalPlankRecipe(BOPBlocks.JACARANDA_PLANKS.get(), CompatBlocks.JACARANDA.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.FIR_PLANKS.get(), CompatBlocks.FIR.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.REDWOOD_PLANKS.get(), CompatBlocks.REDWOOD.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.MAHOGANY_PLANKS.get(), CompatBlocks.MAHOGANY.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.WILLOW_PLANKS.get(), CompatBlocks.WILLOW.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.MAGIC_PLANKS.get(), CompatBlocks.MAGIC.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.DEAD_PLANKS.get(), CompatBlocks.DEAD.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.UMBRAN_PLANKS.get(), CompatBlocks.UMBRAN.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.PALM_PLANKS.get(), CompatBlocks.PALM.verticalPlanks().get(), consumer);
        verticalPlankRecipe(BOPBlocks.HELLBARK_PLANKS.get(), CompatBlocks.HELLBARK.verticalPlanks().get(), consumer);

        //Cabinet
        cabinetRecipe(BOPBlocks.JACARANDA_SLAB.get(), BOPBlocks.JACARANDA_TRAPDOOR.get(), CompatBlocks.JACARANDA.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.FIR_SLAB.get(), BOPBlocks.FIR_TRAPDOOR.get(), CompatBlocks.FIR.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.REDWOOD_SLAB.get(), BOPBlocks.REDWOOD_TRAPDOOR.get(), CompatBlocks.REDWOOD.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.MAHOGANY_SLAB.get(), BOPBlocks.MAHOGANY_TRAPDOOR.get(), CompatBlocks.MAHOGANY.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.WILLOW_SLAB.get(), BOPBlocks.WILLOW_TRAPDOOR.get(), CompatBlocks.WILLOW.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.MAGIC_SLAB.get(), BOPBlocks.MAGIC_TRAPDOOR.get(), CompatBlocks.MAGIC.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.DEAD_SLAB.get(), BOPBlocks.DEAD_TRAPDOOR.get(), CompatBlocks.DEAD.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.UMBRAN_SLAB.get(), BOPBlocks.UMBRAN_TRAPDOOR.get(), CompatBlocks.UMBRAN.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.PALM_SLAB.get(), BOPBlocks.PALM_TRAPDOOR.get(), CompatBlocks.PALM.cabinet().get(), consumer);
        cabinetRecipe(BOPBlocks.HELLBARK_SLAB.get(), BOPBlocks.HELLBARK_TRAPDOOR.get(), CompatBlocks.HELLBARK.cabinet().get(), consumer);

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

        tableRecipe(BOPBlocks.JACARANDA_SLAB.get(), BOPBlocks.JACARANDA_FENCE.get(), CompatBlocks.JACARANDA.table().get(), consumer);
        tableRecipe(BOPBlocks.FIR_SLAB.get(), BOPBlocks.FIR_FENCE.get(), CompatBlocks.FIR.table().get(), consumer);
        tableRecipe(BOPBlocks.REDWOOD_SLAB.get(), BOPBlocks.REDWOOD_FENCE.get(), CompatBlocks.REDWOOD.table().get(), consumer);
        tableRecipe(BOPBlocks.MAHOGANY_SLAB.get(), BOPBlocks.MAHOGANY_FENCE.get(), CompatBlocks.MAHOGANY.table().get(), consumer);
        tableRecipe(BOPBlocks.WILLOW_SLAB.get(), BOPBlocks.WILLOW_FENCE.get(), CompatBlocks.WILLOW.table().get(), consumer);
        tableRecipe(BOPBlocks.MAGIC_SLAB.get(), BOPBlocks.MAGIC_FENCE.get(), CompatBlocks.MAGIC.table().get(), consumer);
        tableRecipe(BOPBlocks.DEAD_SLAB.get(), BOPBlocks.DEAD_FENCE.get(), CompatBlocks.DEAD.table().get(), consumer);
        tableRecipe(BOPBlocks.UMBRAN_SLAB.get(), BOPBlocks.UMBRAN_FENCE.get(), CompatBlocks.UMBRAN.table().get(), consumer);
        tableRecipe(BOPBlocks.PALM_SLAB.get(), BOPBlocks.PALM_FENCE.get(), CompatBlocks.PALM.table().get(), consumer);
        tableRecipe(BOPBlocks.HELLBARK_SLAB.get(), BOPBlocks.HELLBARK_FENCE.get(), CompatBlocks.HELLBARK.table().get(), consumer);

        //Boards
        boardsRecipe(BOPBlocks.JACARANDA_SLAB.get(), CompatBlocks.JACARANDA.boards().get(), consumer);
        boardsRecipe(BOPBlocks.FIR_SLAB.get(), CompatBlocks.FIR.boards().get(), consumer);
        boardsRecipe(BOPBlocks.REDWOOD_SLAB.get(), CompatBlocks.REDWOOD.boards().get(), consumer);
        boardsRecipe(BOPBlocks.MAHOGANY_SLAB.get(), CompatBlocks.MAHOGANY.boards().get(), consumer);
        boardsRecipe(BOPBlocks.WILLOW_SLAB.get(), CompatBlocks.WILLOW.boards().get(), consumer);
        boardsRecipe(BOPBlocks.MAGIC_SLAB.get(), CompatBlocks.MAGIC.boards().get(), consumer);
        boardsRecipe(BOPBlocks.DEAD_SLAB.get(), CompatBlocks.DEAD.boards().get(), consumer);
        boardsRecipe(BOPBlocks.UMBRAN_SLAB.get(), CompatBlocks.UMBRAN.boards().get(), consumer);
        boardsRecipe(BOPBlocks.PALM_SLAB.get(), CompatBlocks.PALM.boards().get(), consumer);
        boardsRecipe(BOPBlocks.HELLBARK_SLAB.get(), CompatBlocks.HELLBARK.boards().get(), consumer);

        //Furnace Boats
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
        genericCuttingRecipe(BOPBlocks.ROSE_QUARTZ_BLOCK.get(), new ToolActionIngredient(ToolActions.PICKAXE_DIG), BOPItems.ROSE_QUARTZ_CHUNK.get(), 4, ForgeRegistries.SOUND_EVENTS.getKey(SoundEvents.AMETHYST_BLOCK_BREAK).toString(), consumer);
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
                .addRecipe(consumer1 -> ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CompatBlocks.POLISHED_ROSE_QUARTZ.get()).define('#', BOPBlocks.ROSE_QUARTZ_BLOCK.get()).pattern("##").pattern("##").unlockedBy(getHasName(BOPBlocks.ROSE_QUARTZ_BLOCK.get()), has(BOPBlocks.ROSE_QUARTZ_BLOCK.get())).save(consumer1))
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
