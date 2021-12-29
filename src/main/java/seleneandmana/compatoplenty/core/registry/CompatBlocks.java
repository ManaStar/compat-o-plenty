package seleneandmana.compatoplenty.core.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.mojang.datafixers.util.Pair;
import com.teamabnormals.blueprint.common.block.*;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.common.block.sign.BlueprintStandingSignBlock;
import com.teamabnormals.blueprint.common.block.sign.BlueprintWallSignBlock;
import com.teamabnormals.blueprint.common.block.wood.WoodPostBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import seleneandmana.compatoplenty.common.blocks.CompatCabinetBlock;
import seleneandmana.compatoplenty.core.CompatOPlenty;
import seleneandmana.compatoplenty.core.other.CompatProperties;
import seleneandmana.compatoplenty.core.registry.util.CompatBlockSubRegistryHelper;

@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatBlocks {
    public static final CompatBlockSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getBlockSubHelper();

    //Cherry
    public static final RegistryObject<Block> CHERRY_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_vertical_slab",() -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.CHERRY_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_bookshelf", () -> new BookshelfBlock(CompatProperties.CHERRY_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_ladder", () -> new BlueprintLadderBlock(CompatProperties.CHERRY_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_CHERRY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_cherry_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.CHERRY_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHERRY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "cherry_post", () -> new WoodPostBlock(STRIPPED_CHERRY_POST,  BlockBehaviour.Properties.copy(BOPBlocks.CHERRY_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_CHERRY_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "white_cherry_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.CHERRY_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PINK_CHERRY_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "pink_cherry_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.CHERRY_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> WHITE_CHERRY_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_cherry_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PINK_CHERRY_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "pink_cherry_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> CHERRY_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "cherry", MaterialColor.COLOR_RED);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> CHERRY_SIGNS = HELPER.createSignBlock("cherry", MaterialColor.COLOR_RED);
    public static final RegistryObject<Block> CHERRY_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "cherry_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> CHERRY_CABINET = HELPER.createFuelBlock("cherry_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Jacaranda
    public static final RegistryObject<Block> JACARANDA_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_vertical_slab",() -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_bookshelf", () -> new BookshelfBlock(CompatProperties.JACARANDA_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_ladder", () -> new BlueprintLadderBlock(CompatProperties.JACARANDA_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_JACARANDA_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_jacaranda_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_post", () -> new WoodPostBlock(STRIPPED_JACARANDA_POST,  BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JACARANDA_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "jacaranda_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.JACARANDA_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> JACARANDA_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "jacaranda_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> JACARANDA_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "jacaranda", MaterialColor.TERRACOTTA_PINK);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> JACARANDA_SIGNS = HELPER.createSignBlock("jacaranda", MaterialColor.TERRACOTTA_PINK);
    public static final RegistryObject<Block> JACARANDA_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "jacaranda_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> JACARANDA_CABINET = HELPER.createFuelBlock("jacaranda_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Fir
    public static final RegistryObject<Block> FIR_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_vertical_slab",() -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_bookshelf", () -> new BookshelfBlock(CompatProperties.FIR_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_ladder", () -> new BlueprintLadderBlock(CompatProperties.FIR_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_FIR_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_fir_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_post", () -> new WoodPostBlock(STRIPPED_FIR_POST,  BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FIR_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "fir_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.FIR_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FIR_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "fir_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> FIR_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "fir", MaterialColor.TERRACOTTA_WHITE);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> FIR_SIGNS = HELPER.createSignBlock("fir", MaterialColor.TERRACOTTA_WHITE);
    public static final RegistryObject<Block> FIR_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "fir_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FIR_CABINET = HELPER.createFuelBlock("fir_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Redwood
    public static final RegistryObject<Block> REDWOOD_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_bookshelf", () -> new BookshelfBlock(CompatProperties.REDWOOD_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_ladder", () -> new BlueprintLadderBlock(CompatProperties.REDWOOD_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_REDWOOD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_redwood_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_post", () -> new WoodPostBlock(STRIPPED_REDWOOD_POST,  BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> REDWOOD_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "redwood_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.REDWOOD_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> REDWOOD_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "redwood_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> REDWOOD_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "redwood", MaterialColor.TERRACOTTA_ORANGE);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> REDWOOD_SIGNS = HELPER.createSignBlock("redwood", MaterialColor.TERRACOTTA_ORANGE);
    public static final RegistryObject<Block> REDWOOD_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "redwood_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> REDWOOD_CABINET = HELPER.createFuelBlock("redwood_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Mahogany
    public static final RegistryObject<Block> MAHOGANY_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAHOGANY_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_bookshelf", () -> new BookshelfBlock(CompatProperties.MAHOGANY_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAHOGANY_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_ladder", () -> new BlueprintLadderBlock(CompatProperties.MAHOGANY_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_MAHOGANY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_mahogany_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAHOGANY_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_post", () -> new WoodPostBlock(STRIPPED_MAHOGANY_POST,  BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAHOGANY_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "mahogany_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAHOGANY_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAHOGANY_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "mahogany_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> MAHOGANY_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "mahogany", MaterialColor.TERRACOTTA_PINK);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> MAHOGANY_SIGNS = HELPER.createSignBlock("mahogany", MaterialColor.TERRACOTTA_PINK);
    public static final RegistryObject<Block> MAHOGANY_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "mahogany_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAHOGANY_CABINET = HELPER.createFuelBlock("mahogany_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Willow
    public static final RegistryObject<Block> WILLOW_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WILLOW_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_bookshelf", () -> new BookshelfBlock(CompatProperties.WILLOW_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WILLOW_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_ladder", () -> new BlueprintLadderBlock(CompatProperties.WILLOW_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_WILLOW_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_willow_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WILLOW_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_post", () -> new WoodPostBlock(STRIPPED_WILLOW_POST,  BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WILLOW_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "willow_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.WILLOW_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> WILLOW_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "willow_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> WILLOW_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "willow", MaterialColor.TERRACOTTA_LIGHT_GREEN);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> WILLOW_SIGNS = HELPER.createSignBlock("willow", MaterialColor.TERRACOTTA_LIGHT_GREEN);
    public static final RegistryObject<Block> WILLOW_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "willow_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> WILLOW_CABINET = HELPER.createFuelBlock("willow_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Magic
    public static final RegistryObject<Block> MAGIC_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGIC_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_bookshelf", () -> new BookshelfBlock(CompatProperties.MAGIC_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGIC_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_ladder", () -> new BlueprintLadderBlock(CompatProperties.MAGIC_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_MAGIC_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_magic_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGIC_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_post", () -> new WoodPostBlock(STRIPPED_MAGIC_POST,  BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGIC_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "magic_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.MAGIC_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAGIC_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "magic_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> MAGIC_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "magic", MaterialColor.COLOR_BLUE);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> MAGIC_SIGNS = HELPER.createSignBlock("magic", MaterialColor.COLOR_BLUE);
    public static final RegistryObject<Block> MAGIC_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "magic_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAGIC_CABINET = HELPER.createFuelBlock("magic_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Dead
    public static final RegistryObject<Block> DEAD_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_bookshelf", () -> new BookshelfBlock(CompatProperties.DEAD_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_ladder", () -> new BlueprintLadderBlock(CompatProperties.DEAD_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_DEAD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_dead_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_post", () -> new WoodPostBlock(STRIPPED_DEAD_POST,  BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "dead_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.DEAD_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> DEAD_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "dead_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> DEAD_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "dead", MaterialColor.STONE);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> DEAD_SIGNS = HELPER.createSignBlock("dead", MaterialColor.STONE);
    public static final RegistryObject<Block> DEAD_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "dead_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> DEAD_CABINET = HELPER.createFuelBlock("dead_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Umbran
    public static final RegistryObject<Block> UMBRAN_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> UMBRAN_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_bookshelf", () -> new BookshelfBlock(CompatProperties.UMBRAN_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> UMBRAN_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_ladder", () -> new BlueprintLadderBlock(CompatProperties.UMBRAN_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_UMBRAN_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_umbran_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> UMBRAN_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_post", () -> new WoodPostBlock(STRIPPED_UMBRAN_POST,  BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> UMBRAN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "umbran_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.UMBRAN_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> UMBRAN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "umbran_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> UMBRAN_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "umbran", MaterialColor.TERRACOTTA_BLUE);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> UMBRAN_SIGNS = HELPER.createSignBlock("umbran", MaterialColor.TERRACOTTA_BLUE);
    public static final RegistryObject<Block> UMBRAN_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "umbran_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> UMBRAN_CABINET = HELPER.createFuelBlock("umbran_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);

    //Palm
    public static final RegistryObject<Block> PALM_VERTICAL_SLAB = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS)), 150, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PALM_BOOKSHELF = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_bookshelf", () -> new BookshelfBlock(CompatProperties.PALM_BOOKSHELF), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PALM_LADDER = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_ladder", () -> new BlueprintLadderBlock(CompatProperties.PALM_LADDER), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_PALM_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "stripped_palm_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PALM_POST = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_post", () -> new WoodPostBlock(STRIPPED_PALM_POST,  BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS)), 300, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PALM_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "palm_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.PALM_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PALM_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "palm_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> PALM_CHESTS = HELPER.createCompatChestBlocks(CompatOPlenty.QUARK_ID, "palm", MaterialColor.TERRACOTTA_YELLOW);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> PALM_SIGNS = HELPER.createSignBlock("palm", MaterialColor.TERRACOTTA_YELLOW);
    public static final RegistryObject<Block> PALM_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "palm_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PALM_CABINET = HELPER.createFuelBlock("palm_palm", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)),300, CreativeModeTab.TAB_DECORATIONS);
    //Hellbark
    public static final RegistryObject<Block> HELLBARK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "hellbark_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELLBARK_BOOKSHELF = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "hellbark_bookshelf", () -> new BookshelfBlock(CompatProperties.HELLBARK_BOOKSHELF), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELLBARK_LADDER = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "hellbark_ladder", () -> new BlueprintLadderBlock(CompatProperties.HELLBARK_LADDER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STRIPPED_HELLBARK_POST = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "stripped_hellbark_post", () -> new WoodPostBlock(BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELLBARK_POST = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "hellbark_post", () -> new WoodPostBlock(STRIPPED_HELLBARK_POST,  BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HELLBARK_HEDGE = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "hellbark_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(BOPBlocks.HELLBARK_PLANKS)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> HELLBARK_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "hellbark_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> HELLBARK_CHEST = HELPER.createUnburnableCompatChestBlocks(CompatOPlenty.QUARK_ID,"hellbark", MaterialColor.TERRACOTTA_GRAY);
    public static final Pair<RegistryObject<BlueprintStandingSignBlock>,RegistryObject <BlueprintWallSignBlock>> HELLBARK_SIGNS = HELPER.createSignBlock("hellbark", MaterialColor.TERRACOTTA_GRAY);
    public static final RegistryObject<Block> HELLBARK_BEEHIVE = HELPER.createCompatBlock(CompatOPlenty.BUZZIER_ID, "hellbark_beehive", () -> new BlueprintBeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BEEHIVE)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> HELLBARK_CABINET = HELPER.createBlock("hellbark_cabinet", () -> new CompatCabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)), CreativeModeTab.TAB_DECORATIONS);
    
    //Sandstone Blocks
    public static final RegistryObject<Block> WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_white_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_WHITE_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.WHITE_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_stairs", () -> new StairBlock(WHITE_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "white_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(WHITE_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_orange_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_ORANGE_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.ORANGE_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_stairs", () -> new StairBlock(ORANGE_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(ORANGE_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "smooth_black_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.SMOOTH_BLACK_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICKS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(BOPBlocks.BLACK_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_STAIRS = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_stairs", () -> new StairBlock(BLACK_SANDSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_WALL = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "black_sandstone_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BLACK_SANDSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);


    //Misc
    public static final RegistryObject<Block> FLOWERING_OAK_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "flowering_oak_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FLOWERING_OAK_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "flowering_oak_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> RAINBOW_BIRCH_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "rainbow_birch_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> RAINBOW_BIRCH_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "rainbow_birch_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORIGIN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "origin_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORIGIN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "origin_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAPLE_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "maple_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MAPLE_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "maple_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORANGE_AUTUMN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "orange_autumn_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORANGE_AUTUMN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "orange_autumn_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> YELLOW_AUTUMN_LEAF_CARPET = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "yellow_autumn_leaf_carpet", () -> new LeafCarpetBlock(CompatProperties.LEAF_CARPET), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> YELLOW_AUTUMN_HEDGE = HELPER.createCompatFuelBlock(CompatOPlenty.QUARK_ID, "yellow_autumn_hedge", () -> new HedgeBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), 300, CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MUD_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock(CompatOPlenty.QUARK_ID, "mud_brick_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(BOPBlocks.MUD_BRICKS)), CreativeModeTab.TAB_BUILDING_BLOCKS);
}
