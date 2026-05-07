package com.seleneandmana.compatoplenty.core.registry;

import biomesoplenty.api.block.BOPBlocks;
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
            Supplier<? extends Block> fence,
            Supplier<? extends Block> leaves
    ) {
    }

    public record WoodSet(
            String name,
            Supplier<? extends Block> planks,
            Supplier<? extends Block> log,
            Supplier<? extends Block> strippedLog,
            Supplier<? extends Block> wood,
            Supplier<? extends Block> strippedWood,
            Supplier<? extends Block> slab,
            Supplier<? extends Block> trapdoor,
            Supplier<? extends Block> door,
            Supplier<? extends Block> sign,
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
            RegistryObject<? extends Block> boards
    ) {
    }

    public static final WoodSet JACARANDA = createCompatWoodSet("jacaranda", CompatProperties.JACARANDA, () -> BOPBlocks.JACARANDA_PLANKS, () -> BOPBlocks.JACARANDA_LOG, () -> BOPBlocks.STRIPPED_JACARANDA_LOG, () -> BOPBlocks.JACARANDA_WOOD, () -> BOPBlocks.STRIPPED_JACARANDA_WOOD, () -> BOPBlocks.JACARANDA_LEAVES, () -> BOPBlocks.JACARANDA_FENCE, () -> BOPBlocks.JACARANDA_SLAB, () -> BOPBlocks.JACARANDA_DOOR, () -> BOPBlocks.JACARANDA_TRAPDOOR, () -> BOPBlocks.JACARANDA_SIGN);
    public static final WoodSet FIR = createCompatWoodSet("fir", CompatProperties.FIR, () -> BOPBlocks.FIR_PLANKS, () -> BOPBlocks.FIR_LOG, () -> BOPBlocks.STRIPPED_FIR_LOG, () -> BOPBlocks.FIR_WOOD, () -> BOPBlocks.STRIPPED_FIR_WOOD, () -> BOPBlocks.FIR_LEAVES, () -> BOPBlocks.FIR_FENCE, () -> BOPBlocks.FIR_SLAB, () -> BOPBlocks.FIR_DOOR, () -> BOPBlocks.FIR_TRAPDOOR, () -> BOPBlocks.FIR_SIGN);
    public static final WoodSet REDWOOD = createCompatWoodSet("redwood", CompatProperties.REDWOOD, () -> BOPBlocks.REDWOOD_PLANKS, () -> BOPBlocks.REDWOOD_LOG, () -> BOPBlocks.STRIPPED_REDWOOD_LOG, () -> BOPBlocks.REDWOOD_WOOD, () -> BOPBlocks.STRIPPED_REDWOOD_WOOD, () -> BOPBlocks.REDWOOD_LEAVES, () -> BOPBlocks.REDWOOD_FENCE, () -> BOPBlocks.REDWOOD_SLAB, () -> BOPBlocks.REDWOOD_DOOR, () -> BOPBlocks.REDWOOD_TRAPDOOR, () -> BOPBlocks.REDWOOD_SIGN);
    public static final WoodSet MAHOGANY = createCompatWoodSet("mahogany", CompatProperties.MAHOGANY, () -> BOPBlocks.MAHOGANY_PLANKS, () -> BOPBlocks.MAHOGANY_LOG, () -> BOPBlocks.STRIPPED_MAHOGANY_LOG, () -> BOPBlocks.MAHOGANY_WOOD, () -> BOPBlocks.STRIPPED_MAHOGANY_WOOD, () -> BOPBlocks.MAHOGANY_LEAVES, () -> BOPBlocks.MAHOGANY_FENCE, () -> BOPBlocks.MAHOGANY_SLAB, () -> BOPBlocks.MAHOGANY_DOOR, () -> BOPBlocks.MAHOGANY_TRAPDOOR, () -> BOPBlocks.MAHOGANY_SIGN);
    public static final WoodSet WILLOW = createCompatWoodSet("willow", CompatProperties.WILLOW, () -> BOPBlocks.WILLOW_PLANKS, () -> BOPBlocks.WILLOW_LOG, () -> BOPBlocks.STRIPPED_WILLOW_LOG, () -> BOPBlocks.WILLOW_WOOD, () -> BOPBlocks.STRIPPED_WILLOW_WOOD, () -> BOPBlocks.WILLOW_LEAVES, () -> BOPBlocks.WILLOW_FENCE, () -> BOPBlocks.WILLOW_SLAB, () -> BOPBlocks.WILLOW_DOOR, () -> BOPBlocks.WILLOW_TRAPDOOR, () -> BOPBlocks.WILLOW_SIGN);
    public static final WoodSet MAGIC = createCompatWoodSet("magic", CompatProperties.MAGIC, () -> BOPBlocks.MAGIC_PLANKS, () -> BOPBlocks.MAGIC_LOG, () -> BOPBlocks.STRIPPED_MAGIC_LOG, () -> BOPBlocks.MAGIC_WOOD, () -> BOPBlocks.STRIPPED_MAGIC_WOOD, () -> BOPBlocks.MAGIC_LEAVES, () -> BOPBlocks.MAGIC_FENCE, () -> BOPBlocks.MAGIC_SLAB, () -> BOPBlocks.MAGIC_DOOR, () -> BOPBlocks.MAGIC_TRAPDOOR, () -> BOPBlocks.MAGIC_SIGN);
    public static final WoodSet DEAD = createCompatWoodSet("dead", CompatProperties.DEAD, () -> BOPBlocks.DEAD_PLANKS, () -> BOPBlocks.DEAD_LOG, () -> BOPBlocks.STRIPPED_DEAD_LOG, () -> BOPBlocks.DEAD_WOOD, () -> BOPBlocks.STRIPPED_DEAD_WOOD, () -> BOPBlocks.DEAD_LEAVES, () -> BOPBlocks.DEAD_FENCE, () -> BOPBlocks.DEAD_SLAB, () -> BOPBlocks.DEAD_DOOR, () -> BOPBlocks.DEAD_TRAPDOOR, () -> BOPBlocks.DEAD_SIGN);
    public static final WoodSet UMBRAN = createCompatWoodSet("umbran", CompatProperties.UMBRAN, () -> BOPBlocks.UMBRAN_PLANKS, () -> BOPBlocks.UMBRAN_LOG, () -> BOPBlocks.STRIPPED_UMBRAN_LOG, () -> BOPBlocks.UMBRAN_WOOD, () -> BOPBlocks.STRIPPED_UMBRAN_WOOD, () -> BOPBlocks.UMBRAN_LEAVES, () -> BOPBlocks.UMBRAN_FENCE, () -> BOPBlocks.UMBRAN_SLAB, () -> BOPBlocks.UMBRAN_DOOR, () -> BOPBlocks.UMBRAN_TRAPDOOR, () -> BOPBlocks.UMBRAN_SIGN);
    public static final WoodSet PALM = createCompatWoodSet("palm", CompatProperties.PALM, () -> BOPBlocks.PALM_PLANKS, () -> BOPBlocks.PALM_LOG, () -> BOPBlocks.STRIPPED_PALM_LOG, () -> BOPBlocks.PALM_WOOD, () -> BOPBlocks.STRIPPED_PALM_WOOD, () -> BOPBlocks.PALM_LEAVES, () -> BOPBlocks.PALM_FENCE, () -> BOPBlocks.PALM_SLAB, () -> BOPBlocks.PALM_DOOR, () -> BOPBlocks.PALM_TRAPDOOR, () -> BOPBlocks.PALM_SIGN);
    public static final WoodSet HELLBARK = createCompatUnburnableWoodSet("hellbark", CompatProperties.HELLBARK, () -> BOPBlocks.HELLBARK_PLANKS, () -> BOPBlocks.HELLBARK_LOG, () -> BOPBlocks.STRIPPED_HELLBARK_LOG, () -> BOPBlocks.HELLBARK_WOOD, () -> BOPBlocks.STRIPPED_HELLBARK_WOOD, () -> BOPBlocks.HELLBARK_LEAVES, () -> BOPBlocks.HELLBARK_FENCE, () -> BOPBlocks.HELLBARK_SLAB, () -> BOPBlocks.HELLBARK_DOOR, () -> BOPBlocks.HELLBARK_TRAPDOOR, () -> BOPBlocks.HELLBARK_SIGN);
    public static final WoodSet EMPYREAL = createCompatWoodSet("empyreal", CompatProperties.EMPYREAL, () -> BOPBlocks.EMPYREAL_PLANKS, () -> BOPBlocks.EMPYREAL_LOG, () -> BOPBlocks.STRIPPED_EMPYREAL_LOG, () -> BOPBlocks.EMPYREAL_WOOD, () -> BOPBlocks.STRIPPED_EMPYREAL_WOOD, () -> BOPBlocks.EMPYREAL_LEAVES, () -> BOPBlocks.EMPYREAL_FENCE, () -> BOPBlocks.EMPYREAL_SLAB, () -> BOPBlocks.EMPYREAL_DOOR, () -> BOPBlocks.EMPYREAL_TRAPDOOR, () -> BOPBlocks.EMPYREAL_SIGN);
    public static final WoodSet PINE = createCompatWoodSet("pine", CompatProperties.PINE, () -> BOPBlocks.PINE_PLANKS, () -> BOPBlocks.PINE_LOG, () -> BOPBlocks.STRIPPED_PINE_LOG, () -> BOPBlocks.PINE_WOOD, () -> BOPBlocks.STRIPPED_PINE_WOOD, () -> BOPBlocks.PINE_LEAVES, () -> BOPBlocks.PINE_FENCE, () -> BOPBlocks.PINE_SLAB, () -> BOPBlocks.PINE_DOOR, () -> BOPBlocks.PINE_TRAPDOOR, () -> BOPBlocks.PINE_SIGN);
    public static final WoodSet MAPLE = createCompatWoodSet("maple", CompatProperties.MAPLE, () -> BOPBlocks.MAPLE_PLANKS, () -> BOPBlocks.MAPLE_LOG, () -> BOPBlocks.STRIPPED_MAPLE_LOG, () -> BOPBlocks.MAPLE_WOOD, () -> BOPBlocks.STRIPPED_MAPLE_WOOD, CompatBlocks.RED_MAPLE, () -> BOPBlocks.MAPLE_FENCE, () -> BOPBlocks.MAPLE_SLAB, () -> BOPBlocks.MAPLE_DOOR, () -> BOPBlocks.MAPLE_TRAPDOOR, () -> BOPBlocks.MAPLE_SIGN);

    //Sandstone Blocks
    public static final RegistryObject<Block> WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("white_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.WHITE_SANDSTONE));
    public static final RegistryObject<Block> CUT_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_white_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.CUT_WHITE_SANDSTONE));
    public static final RegistryObject<Block> SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_white_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.SMOOTH_WHITE_SANDSTONE));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICKS = HELPER.createBlock("white_sandstone_bricks", () -> new Block(Properties.copy(BOPBlocks.WHITE_SANDSTONE)));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_STAIRS = HELPER.createBlock("white_sandstone_brick_stairs", () -> new StairBlock(() -> WHITE_SANDSTONE_BRICKS.get().defaultBlockState(), Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_SLAB = HELPER.createBlock("white_sandstone_brick_slab", () -> new SlabBlock(Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_WALL = HELPER.createBlock("white_sandstone_brick_wall", () -> new WallBlock(Properties.copy(WHITE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> WHITE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createBlock("white_sandstone_brick_vertical_slab", () -> createVerticalSlab(WHITE_SANDSTONE_BRICKS.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("orange_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.ORANGE_SANDSTONE));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_orange_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.CUT_ORANGE_SANDSTONE));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_orange_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.SMOOTH_ORANGE_SANDSTONE));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICKS = HELPER.createBlock("orange_sandstone_bricks", () -> new Block(Properties.copy(BOPBlocks.ORANGE_SANDSTONE)));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_STAIRS = HELPER.createBlock("orange_sandstone_brick_stairs", () -> new StairBlock(() -> ORANGE_SANDSTONE_BRICKS.get().defaultBlockState(), Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_SLAB = HELPER.createBlock("orange_sandstone_brick_slab", () -> new SlabBlock(Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_WALL = HELPER.createBlock("orange_sandstone_brick_wall", () -> new WallBlock(Properties.copy(ORANGE_SANDSTONE_BRICKS.get())));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BRICK_VERTICAL_SLAB = HELPER.createBlock("orange_sandstone_brick_vertical_slab", () -> createVerticalSlab(ORANGE_SANDSTONE_BRICKS.get()));
    public static final RegistryObject<Block> CUT_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("cut_black_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.CUT_WHITE_SANDSTONE));
    public static final RegistryObject<Block> BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("black_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.BLACK_SANDSTONE));
    public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB = HELPER.createBlock("smooth_black_sandstone_vertical_slab", () -> createVerticalSlab(BOPBlocks.SMOOTH_BLACK_SANDSTONE));
    public static final RegistryObject<Block> BLACK_SANDSTONE_BRICKS = HELPER.createBlock("black_sandstone_bricks", () -> new Block(Properties.copy(BOPBlocks.BLACK_SANDSTONE)));
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
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ = HELPER.createBlock("polished_rose_quartz", () -> new AmethystBlock(Properties.copy(BOPBlocks.ROSE_QUARTZ_BLOCK)));

    public static final LeafSet FLOWERING_OAK = createCompatLeafSet("flowering_oak", CompatProperties.WILLOW, () -> BOPBlocks.FLOWERING_OAK_LEAVES, () -> Blocks.OAK_FENCE);
    public static final LeafSet RAINBOW_BIRCH = createCompatLeafSet("rainbow_birch", CompatProperties.WILLOW, () -> BOPBlocks.RAINBOW_BIRCH_LEAVES, () -> Blocks.BIRCH_FENCE);
    public static final LeafSet ORIGIN = createCompatLeafSet("origin", CompatProperties.WILLOW, () -> BOPBlocks.ORIGIN_LEAVES, () -> Blocks.OAK_FENCE);
    public static final LeafSet RED_MAPLE = createCompatLeafSet("red_maple", CompatProperties.MAPLE, () -> BOPBlocks.RED_MAPLE_LEAVES, () -> BOPBlocks.MAPLE_FENCE);
    public static final LeafSet ORANGE_MAPLE = createCompatLeafSet("orange_maple", CompatProperties.MAPLE, () -> BOPBlocks.ORANGE_MAPLE_LEAVES, () -> BOPBlocks.MAPLE_FENCE);
    public static final LeafSet YELLOW_MAPLE = createCompatLeafSet("yellow_maple", CompatProperties.MAPLE, () -> BOPBlocks.YELLOW_MAPLE_LEAVES, () -> BOPBlocks.MAPLE_FENCE);
    public static final LeafSet SNOW_BLOSSOM = createCompatLeafSet("snowblossom", CompatProperties.SNOW_BLOSSOM, () -> BOPBlocks.SNOWBLOSSOM_LEAVES, () -> Blocks.CHERRY_FENCE);

    public static Stream<WoodSet> woodSets() {
        return Stream.of(JACARANDA, FIR, REDWOOD, MAHOGANY, WILLOW, MAGIC, DEAD, UMBRAN, PALM, HELLBARK, EMPYREAL, PINE, MAPLE);
    }

    public static Stream<LeafSet> leaveSets() {
        Stream<WoodSet> viableWoodSets = Stream.empty();
        for (WoodSet woodSet : woodSets().toList()) {
            if (!woodSet.name.equals("maple")) {
                viableWoodSets = Stream.concat(viableWoodSets, Stream.of(woodSet));
            }
        }
        return Stream.concat(Stream.of(FLOWERING_OAK, RAINBOW_BIRCH, ORIGIN, RED_MAPLE,  ORANGE_MAPLE, YELLOW_MAPLE, SNOW_BLOSSOM), viableWoodSets.map(WoodSet::leaveSet));
    }

    public static LeafSet createCompatLeafSet(String name, PropertyUtil.WoodSetProperties properties, Supplier<? extends Block> leaves, Supplier<? extends Block> fence) {
        var set = new LeafSet(
                HELPER.createFuelBlock(name + "_hedge", optional(QUARK_ID, $ -> QuarkSuppliers.HEDGE.apply(fence.get(), leaves.get()), () -> Properties.copy(fence.get())), 300),
                HELPER.createBlock(name + "_leaf_carpet", optional(QUARK_ID, $ -> QuarkSuppliers.LEAF_CARPET.apply(leaves.get()), () -> Properties.copy(leaves.get()))),
                HELPER.createBlock(name + "_leaf_pile", optional(BLUEPRINT_ID, it -> new LeafPileBlock(it), properties::leafPile)),
                fence,
                leaves
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

    public static WoodSet createCompatWoodSet(String name, PropertyUtil.WoodSetProperties properties, Supplier<? extends Block> planks, Supplier<? extends Block> log, Supplier<? extends Block> strippedLog, Supplier<? extends Block> wood, Supplier<? extends Block> strippedWood, LeafSet leafSet, Supplier<? extends Block> fence, Supplier<? extends Block> slab, Supplier<? extends Block> door, Supplier<? extends Block> trapdoor, Supplier<? extends Block> sign) {
        var chests = HELPER.createChestBlocks(name, properties.woodColor());

        var set = new WoodSet(
                name,
                planks,
                log,
                strippedLog,
                wood,
                strippedWood,
                slab,
                trapdoor,
                door,
                sign,
                HELPER.createFuelBlock(name + "_vertical_slab", () -> createVerticalSlab(planks.get()), 150),
                HELPER.createFuelBlock(name + "_bookshelf", () -> new Block(properties.bookshelf()), 300),
                HELPER.createFuelBlock(name + "_ladder", () -> new LadderBlock(properties.ladder()), 300),
                HELPER.createFuelBlock("stripped_" + name + "_post", optional(QUARK_ID, $ -> QuarkSuppliers.POST.apply(strippedLog.get()), () -> Properties.copy(log.get()).mapColor(properties.woodColor())), 300),
                HELPER.createFuelBlock(name + "_post", optional(QUARK_ID, $ -> QuarkSuppliers.POST.apply(log.get()), () -> Properties.copy(log.get()).mapColor(properties.woodColor())), 300),
                leafSet,
                chests.getFirst(),
                chests.getSecond(),
                HELPER.createBlock(name + "_beehive", optional(BLUEPRINT_ID, it -> new BlueprintBeehiveBlock(it), () -> Properties.copy(Blocks.BEEHIVE).mapColor(properties.woodColor()))),
                HELPER.createFuelBlock(name + "_cabinet", optional(FARMERS_ID, $ -> CabinetSuppliers.CABINET.get(), () -> Properties.copy(Blocks.BARREL).mapColor(properties.woodColor())), 300),
                HELPER.createBlock(name + "_table", () -> new CompatTableBlock(Properties.copy(planks.get()).instabreak())),
                HELPER.createBlock("vertical_" + name + "_planks", () -> new Block(Properties.copy(planks.get()))),
                HELPER.createFuelBlock(name + "_boards", () -> new RotatedPillarBlock(Properties.copy(planks.get())), 300)
        );

        populateCreativeTabs(set, planks, slab);

        return set;
    }

    public static WoodSet createCompatWoodSet(String name, PropertyUtil.WoodSetProperties properties, Supplier<? extends Block> planks, Supplier<? extends Block> log, Supplier<? extends Block> strippedLog, Supplier<? extends Block> wood, Supplier<? extends Block> strippedWood, Supplier<? extends Block> leaves, Supplier<? extends Block> fence, Supplier<? extends Block> slab, Supplier<? extends Block> door, Supplier<? extends Block> trapdoor, Supplier<? extends Block> sign) {
        return createCompatWoodSet(name, properties, planks, log, strippedLog, wood, strippedWood, createCompatLeafSet(name, properties, leaves, fence), fence, slab, door, trapdoor, sign);
    }

    public static WoodSet createCompatUnburnableWoodSet(String name, PropertyUtil.WoodSetProperties properties, Supplier<? extends Block> planks, Supplier<? extends Block> log, Supplier<? extends Block> strippedLog, Supplier<? extends Block> wood, Supplier<? extends Block> strippedWood, Supplier<? extends Block> leaves, Supplier<? extends Block> fence, Supplier<? extends Block> slab, Supplier<? extends Block> door, Supplier<? extends Block> trapdoor, Supplier<? extends Block> sign) {
        var chests = HELPER.createUnburnableChestBlocks(name, properties.woodColor());

        var set = new WoodSet(
                name,
                planks,
                log,
                strippedLog,
                wood,
                strippedWood,
                slab,
                trapdoor,
                door,
                sign,
                HELPER.createBlock(name + "_vertical_slab", () -> createVerticalSlab(planks.get())),
                HELPER.createBlock(name + "_bookshelf", () -> new Block(properties.bookshelf())),
                HELPER.createBlock(name + "_ladder", () -> new LadderBlock(properties.ladder())),
                HELPER.createBlock("stripped_" + name + "_post", optional(QUARK_ID, $ -> QuarkSuppliers.POST.apply(strippedLog.get()), () -> Properties.copy(log.get()).mapColor(properties.woodColor()))),
                HELPER.createBlock(name + "_post", optional(QUARK_ID, $ -> QuarkSuppliers.POST.apply(log.get()), () -> Properties.copy(log.get()).mapColor(properties.woodColor()))),
                createCompatLeafSet(name, properties, leaves, fence),
                chests.getFirst(),
                chests.getSecond(),
                HELPER.createBlock(name + "_beehive", optional(BLUEPRINT_ID, it -> new BlueprintBeehiveBlock(it), () -> Properties.copy(Blocks.BEEHIVE).mapColor(properties.woodColor()))),
                HELPER.createBlock(name + "_cabinet", optional(FARMERS_ID, $ -> CabinetSuppliers.CABINET.get(), () -> Properties.copy(Blocks.BARREL).mapColor(properties.woodColor()))),
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
                .addItemsAfter(of(() -> BOPBlocks.WHITE_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), WHITE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.SMOOTH_WHITE_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), SMOOTH_WHITE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_WHITE_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), CUT_WHITE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_WHITE_SANDSTONE_SLAB).and(anyModLoaded(QUARK_ID)),
                        WHITE_SANDSTONE_BRICKS,
                        WHITE_SANDSTONE_BRICK_STAIRS,
                        WHITE_SANDSTONE_BRICK_SLAB,
                        WHITE_SANDSTONE_BRICK_VERTICAL_SLAB,
                        WHITE_SANDSTONE_BRICK_WALL)
                .addItemsAfter(of(() -> BOPBlocks.BLACK_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), BLACK_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.SMOOTH_BLACK_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), SMOOTH_BLACK_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_BLACK_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), CUT_BLACK_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_BLACK_SANDSTONE_SLAB).and(anyModLoaded(QUARK_ID)),
                        BLACK_SANDSTONE_BRICKS,
                        BLACK_SANDSTONE_BRICK_STAIRS,
                        BLACK_SANDSTONE_BRICK_SLAB,
                        BLACK_SANDSTONE_BRICK_VERTICAL_SLAB,
                        BLACK_SANDSTONE_BRICK_WALL)
                .addItemsAfter(of(() -> BOPBlocks.ORANGE_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), ORANGE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.SMOOTH_ORANGE_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), SMOOTH_ORANGE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB).and(V_SLAB_PREDICATE), CUT_ORANGE_SANDSTONE_VERTICAL_SLAB)
                .addItemsAfter(of(() -> BOPBlocks.CUT_ORANGE_SANDSTONE_SLAB).and(anyModLoaded(QUARK_ID)),
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
                .addItemsAfter(of(() -> BOPBlocks.ROSE_QUARTZ_BLOCK).and(anyModLoaded(TWIGS_ID)),
                        POLISHED_ROSE_QUARTZ
                )
        ;
    }

}
