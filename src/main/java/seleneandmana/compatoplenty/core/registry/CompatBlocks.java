package seleneandmana.compatoplenty.core.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.minecraftabnormals.abnormals_core.common.blocks.*;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsTrappedChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsStandingSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsWallSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.WoodPostBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.mojang.datafixers.util.Pair;
import seleneandmana.compatoplenty.common.blocks.CompatPantryBlock;
import seleneandmana.compatoplenty.core.CompatOPlenty;
import seleneandmana.compatoplenty.core.other.CompatProperties;
import net.minecraft.block.*;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatBlocks {
    public static final BlockSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getBlockSubHelper();

    //Cherry
    public static final RegistryObject<Block> CHERRY_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_vertical_slab",() -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_CHERRY_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_cherry_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_bookshelf", () -> new BookshelfBlock(CompatProperties.CHERRY_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_ladder", () -> new AbnormalsLadderBlock(CompatProperties.CHERRY_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_CHERRY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_cherry_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_post", () -> new WoodPostBlock(STRIPPED_CHERRY_POST,  AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_CHERRY_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "white_cherry_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> PINK_CHERRY_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "pink_cherry_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.cherry_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> WHITE_CHERRY_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_cherry_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> PINK_CHERRY_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "pink_cherry_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> CHERRY_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "cherry", MaterialColor.COLOR_RED);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> CHERRY_SIGNS = HELPER.createSignBlock("cherry", MaterialColor.COLOR_RED);
    public static final RegistryObject<Block> CHERRY_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "cherry_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> CHERRY_PANTRY = HELPER.createBlock("cherry_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Jacaranda
    public static final RegistryObject<Block> JACARANDA_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_vertical_slab",() -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_JACARANDA_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_jacaranda_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_bookshelf", () -> new BookshelfBlock(CompatProperties.JACARANDA_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_ladder", () -> new AbnormalsLadderBlock(CompatProperties.JACARANDA_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_JACARANDA_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_jacaranda_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_post", () -> new WoodPostBlock(STRIPPED_JACARANDA_POST,  AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.jacaranda_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> JACARANDA_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "jacaranda_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> JACARANDA_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "jacaranda", MaterialColor.TERRACOTTA_PINK);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> JACARANDA_SIGNS = HELPER.createSignBlock("jacaranda", MaterialColor.TERRACOTTA_PINK);
    public static final RegistryObject<Block> JACARANDA_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "jacaranda_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> JACARANDA_PANTRY = HELPER.createBlock("jacaranda_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Fir
    public static final RegistryObject<Block> FIR_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_vertical_slab",() -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_FIR_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_fir_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_bookshelf", () -> new BookshelfBlock(CompatProperties.FIR_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_ladder", () -> new AbnormalsLadderBlock(CompatProperties.FIR_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_FIR_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_fir_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_post", () -> new WoodPostBlock(STRIPPED_FIR_POST,  AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.fir_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> FIR_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "fir_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> FIR_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "fir", MaterialColor.TERRACOTTA_WHITE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> FIR_SIGNS = HELPER.createSignBlock("fir", MaterialColor.TERRACOTTA_WHITE);
    public static final RegistryObject<Block> FIR_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "fir_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> FIR_PANTRY = HELPER.createBlock("fir_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);

    //Redwood
    public static final RegistryObject<Block> REDWOOD_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), 150, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VERTICAL_REDWOOD_PLANKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "vertical_redwood_planks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_bookshelf", () -> new BookshelfBlock(CompatProperties.REDWOOD_BOOKSHELF), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_ladder", () -> new AbnormalsLadderBlock(CompatProperties.REDWOOD_LADDER), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_REDWOOD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_redwood_post", () -> new WoodPostBlock(AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_post", () -> new WoodPostBlock(STRIPPED_REDWOOD_POST,  AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), 300, ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(BOPBlocks.redwood_planks)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> REDWOOD_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "redwood_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> REDWOOD_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "redwood", MaterialColor.TERRACOTTA_ORANGE);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>,RegistryObject <AbnormalsWallSignBlock>> REDWOOD_SIGNS = HELPER.createSignBlock("redwood", MaterialColor.TERRACOTTA_ORANGE);
    public static final RegistryObject<Block> REDWOOD_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "redwood_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.copy(Blocks.BEEHIVE)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> REDWOOD_PANTRY = HELPER.createBlock("redwood_pantry", () -> new CompatPantryBlock(AbstractBlock.Properties.copy(Blocks.BARREL)), ItemGroup.TAB_DECORATIONS);
    
    //Sandstone Blocks
    public static final RegistryObject<Block> WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.white_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_white_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.smooth_white_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_bricks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.white_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_stairs", () -> new AbnormalsStairsBlock(WHITE_SANDSTONE_BRICKS.get().defaultBlockState(), AbstractBlock.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.orange_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.smooth_orange_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_bricks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.orange_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_stairs", () -> new AbnormalsStairsBlock(ORANGE_SANDSTONE_BRICKS.get().defaultBlockState(), AbstractBlock.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.black_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_black_sandstone_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.smooth_black_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_bricks", () -> new Block(AbstractBlock.Properties.copy(BOPBlocks.black_sandstone)), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_stairs", () -> new AbnormalsStairsBlock(BLACK_SANDSTONE_BRICKS.get().defaultBlockState(), AbstractBlock.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_slab", () -> new SlabBlock(AbstractBlock.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_wall", () -> new WallBlock(AbstractBlock.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), ItemGroup.TAB_BUILDING_BLOCKS);


    //Misc
    public static final RegistryObject<Block> FLOWERING_OAK_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "flowering_oak_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> FLOWERING_OAK_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "flowering_oak_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> RAINBOW_BIRCH_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "rainbow_birch_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> RAINBOW_BIRCH_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "rainbow_birch_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.BIRCH_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORIGIN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "origin_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORIGIN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "origin_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAPLE_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "maple_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAPLE_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "maple_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORANGE_AUTUMN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_autumn_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORANGE_AUTUMN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "orange_autumn_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.DARK_OAK_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> YELLOW_AUTUMN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "yellow_autumn_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> YELLOW_AUTUMN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "yellow_autumn_hedge", () -> new HedgeBlock(AbstractBlock.Properties.copy(Blocks.BIRCH_PLANKS)), 300, ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> MUD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "mud_brick_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.copy(BOPBlocks.mud_bricks)), ItemGroup.TAB_BUILDING_BLOCKS);
}
