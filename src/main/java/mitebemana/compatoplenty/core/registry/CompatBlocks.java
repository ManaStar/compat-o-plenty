package mitebemana.compatoplenty.core.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.minecraftabnormals.abnormals_core.common.blocks.*;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsTrappedChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsStandingSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsWallSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.WoodPostBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.mojang.datafixers.util.Pair;
import mitebemana.compatoplenty.common.blocks.CompatPantryBlock;
import mitebemana.compatoplenty.core.CompatOPlenty;
import mitebemana.compatoplenty.core.other.CompatProperties;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
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
}
