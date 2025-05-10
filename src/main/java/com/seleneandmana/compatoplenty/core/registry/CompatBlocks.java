package com.seleneandmana.compatoplenty.core.registry;

import biomesoplenty.api.block.BOPBlocks;
import com.ninni.twigs.registry.TwigsItems;
import com.seleneandmana.compatoplenty.common.blocks.RoseQuartzSlabBlock;
import com.seleneandmana.compatoplenty.common.blocks.RoseQuartzStairBlock;
import com.seleneandmana.compatoplenty.common.blocks.RoseQuartzWallBlock;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.other.CompatProperties;
import com.seleneandmana.compatoplenty.core.registry.util.CompatBlockSubRegistryHelper;
import com.seleneandmana.compatoplenty.integrations.CabinetSuppliers;
import com.seleneandmana.compatoplenty.integrations.QuarkSuppliers;
import com.seleneandmana.compatoplenty.integrations.CompatTableBlock;
import com.seleneandmana.compatoplenty.integrations.TwigsSuppliers;
import com.seleneandmana.compatoplenty.integrations.VSlabCompatSuppliers;
import com.teamabnormals.blueprint.common.block.*;
import com.teamabnormals.blueprint.core.util.PropertyUtil;
import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.seleneandmana.compatoplenty.core.CompatOPlenty.BLUEPRINT_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.FARMERS_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.QUARK_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.TWIGS_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.VSLAB_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.WOODWORKS_ID;
import static com.seleneandmana.compatoplenty.core.registry.CompatItems.TAB_POPULATOR;
import static com.seleneandmana.compatoplenty.core.registry.CompatItems.anyModLoaded;
import static com.seleneandmana.compatoplenty.core.registry.CompatItems.of;

@SuppressWarnings("Convert2MethodRef")
@Mod.EventBusSubscriber(modid = CompatOPlenty.MOD_ID)
public class CompatBlocks {
    public static final CompatBlockSubRegistryHelper HELPER = CompatOPlenty.REGISTRY_HELPER.getBlockSubHelper();

    public static Predicate<ItemStack> V_SLAB_PREDICATE = anyModLoaded(VSLAB_ID, QUARK_ID);

    public record LeafSet(
            RegistryObject<? extends Block> hedge,
            RegistryObject<? extends Block> leafCarpet,
            RegistryObject<? extends Block> leafPile,
            Supplier<? extends Block> fence
    ) {
    }

    public record WoodSet(
            RegistryObject<? extends Block> verticalSlab,
            RegistryObject<? extends Block> bookshelf,
            RegistryObject<? extends Block> ladder,
            RegistryObject<? extends Block> strippedPost,
            RegistryObject<? extends Block> post,
            LeafSet leaveSet,
            RegistryObject<? extends Block> chest,
            RegistryObject<? extends Block> trappedChest,
            RegistryObject<? extends Block> beehive,
            RegistryObject<? extends Block> cabinet,
            RegistryObject<? extends Block> table,
            RegistryObject<? extends Block> verticalPlanks,
            RegistryObject<? extends RotatedPillarBlock> boards
    ) {
    }

    public static final WoodSet JACARANDA = createCompatWoodSet("jacaranda", CompatProperties.JACARANDA, () -> BOPBlocks.JACARANDA_PLANKS.get(), () -> BOPBlocks.JACARANDA_LOG.get(), () -> BOPBlocks.STRIPPED_JACARANDA_LOG.get(), () -> BOPBlocks.JACARANDA_LEAVES.get(), () -> BOPBlocks.JACARANDA_FENCE.get(), () -> BOPBlocks.JACARANDA_SLAB.get());
    public static final WoodSet FIR = createCompatWoodSet("fir", CompatProperties.FIR, () -> BOPBlocks.FIR_PLANKS.get(), () -> BOPBlocks.FIR_LOG.get(), () -> BOPBlocks.STRIPPED_FIR_LOG.get(), () -> BOPBlocks.FIR_LEAVES.get(), () -> BOPBlocks.FIR_FENCE.get(), () -> BOPBlocks.FIR_SLAB.get());
    public static final WoodSet REDWOOD = createCompatWoodSet("redwood", CompatProperties.REDWOOD, () -> BOPBlocks.REDWOOD_PLANKS.get(), () -> BOPBlocks.REDWOOD_LOG.get(), () -> BOPBlocks.STRIPPED_REDWOOD_LOG.get(), () -> BOPBlocks.REDWOOD_LEAVES.get(), () -> BOPBlocks.REDWOOD_FENCE.get(), () -> BOPBlocks.REDWOOD_SLAB.get());
    public static final WoodSet MAHOGANY = createCompatWoodSet("mahogany", CompatProperties.MAHOGANY, () -> BOPBlocks.MAHOGANY_PLANKS.get(), () -> BOPBlocks.MAHOGANY_LOG.get(), () -> BOPBlocks.STRIPPED_MAHOGANY_LOG.get(), () -> BOPBlocks.MAHOGANY_LEAVES.get(), () -> BOPBlocks.MAHOGANY_FENCE.get(), () -> BOPBlocks.MAHOGANY_SLAB.get());
    public static final WoodSet WILLOW = createCompatWoodSet("willow", CompatProperties.WILLOW, () -> BOPBlocks.WILLOW_PLANKS.get(), () -> BOPBlocks.WILLOW_LOG.get(), () -> BOPBlocks.STRIPPED_WILLOW_LOG.get(), () -> BOPBlocks.WILLOW_LEAVES.get(), () -> BOPBlocks.WILLOW_FENCE.get(), () -> BOPBlocks.WILLOW_SLAB.get());
    public static final WoodSet MAGIC = createCompatWoodSet("magic", CompatProperties.MAGIC, () -> BOPBlocks.MAGIC_PLANKS.get(), () -> BOPBlocks.MAGIC_LOG.get(), () -> BOPBlocks.STRIPPED_MAGIC_LOG.get(), () -> BOPBlocks.MAGIC_LEAVES.get(), () -> BOPBlocks.MAGIC_FENCE.get(), () -> BOPBlocks.MAGIC_SLAB.get());
    public static final WoodSet DEAD = createCompatWoodSet("dead", CompatProperties.DEAD, () -> BOPBlocks.DEAD_PLANKS.get(), () -> BOPBlocks.DEAD_LOG.get(), () -> BOPBlocks.STRIPPED_DEAD_LOG.get(), () -> BOPBlocks.DEAD_LEAVES.get(), () -> BOPBlocks.DEAD_FENCE.get(), () -> BOPBlocks.DEAD_SLAB.get());
    public static final WoodSet UMBRAN = createCompatWoodSet("umbran", CompatProperties.UMBRAN, () -> BOPBlocks.UMBRAN_PLANKS.get(), () -> BOPBlocks.UMBRAN_LOG.get(), () -> BOPBlocks.STRIPPED_UMBRAN_LOG.get(), () -> BOPBlocks.UMBRAN_LEAVES.get(), () -> BOPBlocks.UMBRAN_FENCE.get(), () -> BOPBlocks.UMBRAN_SLAB.get());
    public static final WoodSet PALM = createCompatWoodSet("palm", CompatProperties.PALM, () -> BOPBlocks.PALM_PLANKS.get(), () -> BOPBlocks.PALM_LOG.get(), () -> BOPBlocks.STRIPPED_PALM_LOG.get(), () -> BOPBlocks.PALM_LEAVES.get(), () -> BOPBlocks.PALM_FENCE.get(), () -> BOPBlocks.PALM_SLAB.get());
    public static final WoodSet HELLBARK = createCompatUnburnableWoodSet("hellbark", CompatProperties.HELLBARK, () -> BOPBlocks.HELLBARK_PLANKS.get(), () -> BOPBlocks.HELLBARK_LOG.get(), () -> BOPBlocks.STRIPPED_HELLBARK_LOG.get(), () -> BOPBlocks.HELLBARK_LEAVES.get(), () -> BOPBlocks.HELLBARK_FENCE.get(), () -> BOPBlocks.HELLBARK_SLAB.get());

    //Sandstone Blocks
    public static final RegistryObject<Block> WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("white_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.WHITE_SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_white_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.CUT_WHITE_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_white_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.SMOOTH_WHITE_SANDSTONE.get()));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICKS = HELPER.createBlock("white_sandstone_bricks", () -> new Block(Properties.copy(BOPBlocks.WHITE_SANDSTONE.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_STAIRS = HELPER.createBlock("white_sandstone_brick_stairs", () -> new StairBlock(() -> WHITE_SANDSTONE_BRICKS.get().defaultBlockState(), Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_SLAB = HELPER.createBlock("white_sandstone_brick_slab", () -> new SlabBlock(Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_WALL = HELPER.createBlock("white_sandstone_brick_wall", () -> new WallBlock(Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createBlock("white_sandstone_brick_vertical_slab", () -> createVerticalSlab(WHITE_SANDSTONE_BRICKS.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("orange_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.ORANGE_SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_orange_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.CUT_ORANGE_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_orange_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.SMOOTH_ORANGE_SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICKS = HELPER.createBlock("orange_sandstone_bricks", () -> new Block(Properties.copy(BOPBlocks.ORANGE_SANDSTONE.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_STAIRS = HELPER.createBlock("orange_sandstone_brick_stairs", () -> new StairBlock(() -> ORANGE_SANDSTONE_BRICKS.get().defaultBlockState(), Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_SLAB = HELPER.createBlock("orange_sandstone_brick_slab", () -> new SlabBlock(Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_WALL = HELPER.createBlock("orange_sandstone_brick_wall", () -> new WallBlock(Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createBlock("orange_sandstone_brick_vertical_slab", () -> createVerticalSlab(ORANGE_SANDSTONE_BRICKS.get()));
    public static final RegistryObject<Block> CUT_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_black_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.CUT_WHITE_SANDSTONE.get()));
    public static final RegistryObject<Block> BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("black_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.BLACK_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_black_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.SMOOTH_BLACK_SANDSTONE.get()));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICKS = HELPER.createBlock("black_sandstone_bricks", () -> new Block(Properties.copy(BOPBlocks.BLACK_SANDSTONE.get())));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_STAIRS = HELPER.createBlock("black_sandstone_brick_stairs", () -> new StairBlock(() -> BLACK_SANDSTONE_BRICKS.get().defaultBlockState(), Properties.copy(BLACK_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_SLAB = HELPER.createBlock("black_sandstone_brick_slab", () -> new SlabBlock(Properties.copy(BLACK_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_WALL = HELPER.createBlock("black_sandstone_brick_wall", () -> new WallBlock(Properties.copy(BLACK_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createBlock("black_sandstone_brick_vertical_slab", () -> createVerticalSlab(BLACK_SANDSTONE_BRICKS.get()));

    //Galanos Blocks
    public static final RegistryObject<Block> GALANOS_BLOCK = HELPER.createBlock("galanos_block", () -> new Block(Properties.of().mapColor(MapColor.DIAMOND).requiresCorrectToolForDrops().strength(1.5f, 6f).lightLevel(state -> 6).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GALANOS_PILLAR = HELPER.createBlock("galanos_pillar", () -> new RotatedPillarBlock(Properties.copy(GALANOS_BLOCK.get())));
    public static final RegistryObject<Block> GALANOS_STAIRS = HELPER.createBlock("galanos_stairs", () -> new StairBlock(() -> GALANOS_BLOCK.get().defaultBlockState(), Properties.copy(CompatBlocks.GALANOS_BLOCK.get())));
    public static final RegistryObject<Block> GALANOS_SLAB = HELPER.createBlock("galanos_slab", () -> new SlabBlock(Properties.copy(GALANOS_BLOCK.get())));
    public static final RegistryObject<Block> GALANOS_VERTICAL_SLAB = HELPER.createBlock("galanos_vertical_slab", () -> createVerticalSlab(GALANOS_BLOCK.get()));

    //Polished Rose Quartz Blocks
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ = HELPER.createBlock("polished_rose_quartz", () -> new AmethystBlock(Properties.copy(BOPBlocks.ROSE_QUARTZ_BLOCK.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_SLAB = HELPER.createBlock("polished_rose_quartz_slab", () -> new RoseQuartzSlabBlock(Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_STAIRS = HELPER.createBlock("polished_rose_quartz_stairs", () -> new RoseQuartzStairBlock(POLISHED_ROSE_QUARTZ.get().defaultBlockState(), Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_VERTICAL_SLAB = HELPER.createBlock("polished_rose_quartz_vertical_slab", () -> createVerticalSlab(CompatBlocks.POLISHED_ROSE_QUARTZ.get()));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICKS = HELPER.createBlock("polished_rose_quartz_bricks", () -> new AmethystBlock(Properties.copy(BOPBlocks.ROSE_QUARTZ_BLOCK.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICK_SLAB = HELPER.createBlock("polished_rose_quartz_brick_slab", () -> new RoseQuartzSlabBlock(Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICK_STAIRS = HELPER.createBlock("polished_rose_quartz_brick_stairs", () -> new RoseQuartzStairBlock(POLISHED_ROSE_QUARTZ_BRICKS.get().defaultBlockState(), Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get())));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB = HELPER.createBlock("polished_rose_quartz_brick_vertical_slab", () -> createVerticalSlab(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get()));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ_BRICK_WALL = HELPER.createBlock("polished_rose_quartz_brick_wall", () -> new RoseQuartzWallBlock(Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));
    public static final RegistryObject<Block> CRACKED_POLISHED_ROSE_QUARTZ_BRICKS = HELPER.createBlock("cracked_polished_rose_quartz_bricks", () -> new AmethystBlock(Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ_BRICKS.get())));
    public static final RegistryObject<Block> CHISELED_POLISHED_ROSE_QUARTZ = HELPER.createBlock("chiseled_polished_rose_quartz", () -> new AmethystBlock(Properties.copy(CompatBlocks.POLISHED_ROSE_QUARTZ.get())));

    public static LeafSet FLOWERING_OAK = createCompatLeafSet("flowering_oak", CompatProperties.WILLOW, () -> BOPBlocks.FLOWERING_OAK_LEAVES.get(), () -> Blocks.OAK_FENCE);
    public static LeafSet RAINBOW_BIRCH = createCompatLeafSet("rainbow_birch", CompatProperties.WILLOW, () -> BOPBlocks.RAINBOW_BIRCH_LEAVES.get(), () -> Blocks.BIRCH_FENCE);
    public static LeafSet ORIGIN = createCompatLeafSet("origin", CompatProperties.WILLOW, () -> BOPBlocks.ORIGIN_LEAVES.get(), () -> Blocks.OAK_FENCE);
    public static LeafSet MAPLE = createCompatLeafSet("maple", CompatProperties.WILLOW, () -> BOPBlocks.MAPLE_LEAVES.get(), () -> Blocks.OAK_FENCE);
    public static LeafSet ORANGE_AUTUMN = createCompatLeafSet("orange_autumn", CompatProperties.WILLOW, () -> BOPBlocks.ORANGE_AUTUMN_LEAVES.get(), () -> Blocks.DARK_OAK_FENCE);
    public static LeafSet YELLOW_AUTUMN = createCompatLeafSet("yellow_autumn", CompatProperties.WILLOW, () -> BOPBlocks.YELLOW_AUTUMN_LEAVES.get(), () -> Blocks.BIRCH_FENCE);
    public static LeafSet SNOW_BLOSSOM = createCompatLeafSet("snowblossom", CompatProperties.SNOW_BLOSSOM, () -> BOPBlocks.SNOWBLOSSOM_LEAVES.get(), () -> Blocks.CHERRY_FENCE);

    public static Stream<WoodSet> woodSets() {
        return Stream.of(JACARANDA, FIR, REDWOOD, MAHOGANY, WILLOW, MAGIC, DEAD, UMBRAN, PALM, HELLBARK);
    }

    public static Stream<LeafSet> leaveSets() {
        return Stream.concat(Stream.of(FLOWERING_OAK, RAINBOW_BIRCH, ORIGIN, MAPLE, ORANGE_AUTUMN, YELLOW_AUTUMN, SNOW_BLOSSOM), woodSets().map(WoodSet::leaveSet));
    }

    public static LeafSet createCompatLeafSet(String name, PropertyUtil.WoodSetProperties properties, Supplier<? extends Block> leaves, Supplier<? extends Block> fence) {
        var set = new LeafSet(
                HELPER.createFuelBlock(name + "_hedge", optional(QUARK_ID, $ -> QuarkSuppliers.HEDGE.apply(fence.get(), leaves.get()), () -> Properties.copy(fence.get())), 300),
                HELPER.createBlock(name + "_leaf_carpet", optional(QUARK_ID, $ -> QuarkSuppliers.LEAF_CARPET.apply(leaves.get()), () -> Properties.copy(leaves.get()))),
                HELPER.createBlock(name + "_leaf_pile", optional(BLUEPRINT_ID, it -> new LeafPileBlock(it), properties::leafPile)),
                fence
        );

        populateCreativeTabs(set, leaves);

        return set;
    }

    private static Block createVerticalSlab(Block slab) {
        var properties = Properties.copy(slab);
        if (ModList.get().isLoaded(QUARK_ID)) {
            return QuarkSuppliers.V_SLAB.apply(properties, slab);
        }

        if (ModList.get().isLoaded(VSLAB_ID)) {
            return VSlabCompatSuppliers.V_SLAB.apply(properties, slab);
        }

        return new Block(properties);
    }

    private static Supplier<? extends Block> optional(String modid, Function<Properties, Block> ifPresent, Supplier<Properties> properties) {
        return optional(modid, ifPresent, Block::new, properties);
    }

    private static <B extends Block> Supplier<? extends B> optional(String modid, Function<Properties, ? extends B> ifPresent, Function<Properties, ? extends B> notPresent, Supplier<Properties> properties) {
        if (ModList.get().isLoaded(modid)) {
            return () -> ifPresent.apply(properties.get());
        } else {
            return () -> notPresent.apply(properties.get());
        }
    }

    public static WoodSet createCompatWoodSet(String name, PropertyUtil.WoodSetProperties properties, Supplier<? extends Block> planks, Supplier<? extends Block> log, Supplier<? extends Block> strippedLog, Supplier<? extends Block> leaves, Supplier<? extends Block> fence, Supplier<? extends Block> slab) {
        var chests = HELPER.createChestBlocks(name, properties.woodColor());

        var set = new WoodSet(
                HELPER.createFuelBlock(name + "_vertical_slab", () -> createVerticalSlab(planks.get()), 150),
                HELPER.createFuelBlock(name + "_bookshelf", () -> new Block(properties.bookshelf()), 300),
                HELPER.createFuelBlock(name + "_ladder", () -> new LadderBlock(properties.ladder()), 300),
                HELPER.createFuelBlock("stripped_" + name + "_post", optional(QUARK_ID, $ -> QuarkSuppliers.POST.apply(strippedLog.get()), () -> Properties.copy(log.get()).mapColor(properties.woodColor())), 300),
                HELPER.createFuelBlock(name + "_post", optional(QUARK_ID, $ -> QuarkSuppliers.POST.apply(log.get()), () -> Properties.copy(log.get()).mapColor(properties.woodColor())), 300),
                createCompatLeafSet(name, properties, leaves, fence),
                chests.getFirst(),
                chests.getSecond(),
                HELPER.createBlock(name + "_beehive", optional(BLUEPRINT_ID, it -> new BlueprintBeehiveBlock(it), () -> Properties.copy(Blocks.BEEHIVE).mapColor(properties.woodColor()))),
                HELPER.createFuelBlock(name + "_cabinet", optional(CompatOPlenty.FARMERS_ID, $ -> CabinetSuppliers.CABINET.get(), () -> Properties.copy(Blocks.BARREL).mapColor(properties.woodColor())), 300),
                HELPER.createBlock(name + "_table", () -> new CompatTableBlock(Properties.copy(planks.get()).instabreak())),
                HELPER.createBlock("vertical_" + name + "_planks", () -> new Block(Properties.copy(planks.get()))),
                HELPER.createFuelBlock(name + "_boards", () -> new RotatedPillarBlock(Properties.copy(planks.get())), 300)
        );

        populateCreativeTabs(set, planks, slab);

        return set;
    }

    public static WoodSet createCompatUnburnableWoodSet(String name, PropertyUtil.WoodSetProperties properties, Supplier<? extends Block> planks, Supplier<? extends Block> log, Supplier<? extends Block> strippedLog, Supplier<? extends Block> leaves, Supplier<? extends Block> fence, Supplier<? extends Block> slab) {
        var chests = HELPER.createUnburnableChestBlocks(name, properties.woodColor());

        var set = new WoodSet(
                HELPER.createBlock(name + "_vertical_slab", () -> createVerticalSlab(planks.get())),
                HELPER.createBlock(name + "_bookshelf", () -> new Block(properties.bookshelf())),
                HELPER.createBlock(name + "_ladder", () -> new LadderBlock(properties.ladder())),
                HELPER.createBlock("stripped_" + name + "_post", optional(QUARK_ID, $ -> QuarkSuppliers.POST.apply(strippedLog.get()), () -> Properties.copy(log.get()).mapColor(properties.woodColor()))),
                HELPER.createBlock(name + "_post", optional(QUARK_ID, $ -> QuarkSuppliers.POST.apply(log.get()), () -> Properties.copy(log.get()).mapColor(properties.woodColor()))),
                createCompatLeafSet(name, properties, leaves, fence),
                chests.getFirst(),
                chests.getSecond(),
                HELPER.createBlock(name + "_beehive", optional(BLUEPRINT_ID, it -> new BlueprintBeehiveBlock(it), () -> Properties.copy(Blocks.BEEHIVE).mapColor(properties.woodColor()))),
                HELPER.createBlock(name + "_cabinet", optional(CompatOPlenty.FARMERS_ID, $ -> CabinetSuppliers.CABINET.get(), () -> Properties.copy(Blocks.BARREL).mapColor(properties.woodColor()))),
                HELPER.createBlock(name + "_table", () -> new CompatTableBlock(Properties.copy(planks.get()).instabreak())),
                HELPER.createBlock("vertical_" + name + "_planks", () -> new Block(Properties.copy(planks.get()))),
                HELPER.createBlock(name + "_boards", () -> new RotatedPillarBlock(Properties.copy(planks.get())))
        );

        populateCreativeTabs(set, planks, slab);

        return set;
    }

    public static void populateCreativeTabs(WoodSet set, Supplier<? extends ItemLike> planks, Supplier<? extends ItemLike> slab) {
        TAB_POPULATOR
                .addItemsAfter(of(slab).and(V_SLAB_PREDICATE), set.verticalSlab())
                .addItemsAfter(of(Items.BOOKSHELF).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), set.bookshelf())
                .addItemsAfter(of(Items.LADDER).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), set.ladder())
                .addItemsAfter(of(set.verticalSlab()).and(anyModLoaded(QUARK_ID)), set.post())
                .addItemsAfter(of(set.post()).and(anyModLoaded(QUARK_ID)), set.strippedPost())
                .addItemsAfter(of(Blocks.CHEST).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), set.chest())
                .addItemsAfter(of(Blocks.TRAPPED_CHEST).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), set.trappedChest())
                .addItemsAfter(of(Blocks.BEEHIVE).and(anyModLoaded(WOODWORKS_ID, QUARK_ID)), set.beehive())
                .addItemsAfter(of(planks).and(anyModLoaded(QUARK_ID)), set.verticalPlanks())
                .addItemsAfter(of(planks).and(anyModLoaded(TWIGS_ID)), set.boards());

        if (ModList.get().isLoaded(FARMERS_ID)) {
            TAB_POPULATOR.addItemsAfter(CabinetSuppliers.CABINET_PREDICATE, set.cabinet());
        }

        if (ModList.get().isLoaded(TWIGS_ID)) {
            TAB_POPULATOR.addItemsAfter(TwigsSuppliers.TABLE_PREDICATE, set.table());
        }
    }

    public static void populateCreativeTabs(LeafSet set, Supplier<? extends ItemLike> leaves) {
        TAB_POPULATOR
                .addItemsAfter(of(leaves).and(anyModLoaded(QUARK_ID)), set.hedge())
                .addItemsAfter(of(leaves).and(anyModLoaded(QUARK_ID)), set.leafCarpet())
                .addItemsAfter(of(leaves).and(anyModLoaded(WOODWORKS_ID)), set.leafPile());
    }

    static {
        CreativeModeTabContentsPopulator.mod(CompatOPlenty.MOD_ID)
                .addItemsAfter(of(() -> BOPBlocks.WHITE_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), WHITE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.SMOOTH_WHITE_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_WHITE_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), CUT_WHITE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_WHITE_SANDSTONE_SLAB.get()).and(anyModLoaded(QUARK_ID)),
                        WHITE_SANDSTONE_BRICKS,
                        WHITE_SANDSTONE_BRICK_STAIRS,
                        WHITE_SANDSTONE_BRICK_SLAB,
                        WHITE_SANDSTONE_BRICK_VERTICAL_SLAB,
                        WHITE_SANDSTONE_BRICK_WALL)
                .addItemsAfter(of(() -> BOPBlocks.BLACK_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), BLACK_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.SMOOTH_BLACK_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_BLACK_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), CUT_BLACK_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_BLACK_SANDSTONE_SLAB.get()).and(anyModLoaded(QUARK_ID)),
                        BLACK_SANDSTONE_BRICKS,
                        BLACK_SANDSTONE_BRICK_STAIRS,
                        BLACK_SANDSTONE_BRICK_SLAB,
                        BLACK_SANDSTONE_BRICK_VERTICAL_SLAB,
                        BLACK_SANDSTONE_BRICK_WALL)
                .addItemsAfter(of(() -> BOPBlocks.ORANGE_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), ORANGE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB.get()).and(V_SLAB_PREDICATE), CUT_ORANGE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB.get()).and(anyModLoaded(QUARK_ID)),
                        ORANGE_SANDSTONE_BRICKS,
                        ORANGE_SANDSTONE_BRICK_STAIRS,
                        ORANGE_SANDSTONE_BRICK_SLAB,
                        ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB,
                        ORANGE_SANDSTONE_BRICK_WALL)
                .addItemsAfter(of(Blocks.PURPUR_SLAB).and(anyModLoaded(QUARK_ID)),
                        GALANOS_BLOCK,
                        GALANOS_PILLAR,
                        GALANOS_SLAB,
                        GALANOS_VERTICAL_SLAB,
                        GALANOS_STAIRS
                )
                .addItemsAfter(of(() -> BOPBlocks.ROSE_QUARTZ_BLOCK.get()).and(anyModLoaded(TWIGS_ID)),
                        POLISHED_ROSE_QUARTZ,
                        POLISHED_ROSE_QUARTZ_SLAB,
                        POLISHED_ROSE_QUARTZ_VERTICAL_SLAB,
                        POLISHED_ROSE_QUARTZ_STAIRS,
                        POLISHED_ROSE_QUARTZ_BRICKS,
                        POLISHED_ROSE_QUARTZ_BRICK_SLAB,
                        POLISHED_ROSE_QUARTZ_BRICK_VERTICAL_SLAB,
                        POLISHED_ROSE_QUARTZ_BRICK_STAIRS,
                        CRACKED_POLISHED_ROSE_QUARTZ_BRICKS,
                        CHISELED_POLISHED_ROSE_QUARTZ
                )
        ;
    }

}
