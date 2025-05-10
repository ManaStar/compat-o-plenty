package com.seleneandmana.compatoplenty.core.data.client;

import biomesoplenty.api.block.BOPBlocks;
import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import net.mehvahdjukaar.vsc.temp.TempVerticalSlabBlock;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.violetmoon.quark.content.building.block.HedgeBlock;
import org.violetmoon.quark.content.building.block.VerticalSlabBlock;
import org.violetmoon.quark.content.building.block.WoodPostBlock;
import vectorwing.farmersdelight.common.block.CabinetBlock;

import java.util.List;
import java.util.Objects;

import static com.seleneandmana.compatoplenty.core.CompatOPlenty.BLUEPRINT_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.BOP_ID;
import static com.seleneandmana.compatoplenty.core.CompatOPlenty.QUARK_ID;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.AXIS;

public class ModBlockModelsProvider extends BlockStateProvider {

    public ModBlockModelsProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, CompatOPlenty.MOD_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        CompatBlocks.woodSets().forEach(this::registerStatesAndModels);
        CompatBlocks.leaveSets().forEach(set -> {
            if (set != CompatBlocks.RAINBOW_BIRCH) registerStatesAndModels(set);
        });

        hedge(CompatBlocks.RAINBOW_BIRCH.hedge().get(), blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LEAVES));
        leafCarpet(CompatBlocks.RAINBOW_BIRCH.leafCarpet().get(), blockTexture(Blocks.BIRCH_LEAVES));
        leafPile(CompatBlocks.RAINBOW_BIRCH.leafPile().get(), blockTexture(Blocks.BIRCH_LEAVES));

        hedgePostModel(itemModels(), name(CompatBlocks.RAINBOW_BIRCH.hedge().get()), blockTexture(Blocks.BIRCH_LOG), blockTexture(BOPBlocks.RAINBOW_BIRCH_LEAVES.get()));
        leafCarpetModel(itemModels(), name(CompatBlocks.RAINBOW_BIRCH.leafCarpet().get()), blockTexture(BOPBlocks.RAINBOW_BIRCH_LEAVES.get()));
        leafPileModel(itemModels(), name(CompatBlocks.RAINBOW_BIRCH.leafPile().get()), blockTexture(BOPBlocks.RAINBOW_BIRCH_LEAVES.get()));
    }

    private void registerStatesAndModels(CompatBlocks.LeafSet set) {
        var base = key(set.hedge().get()).withPath(it -> it.substring(0, it.length() - "_hedge".length()));
        var texture = new ResourceLocation(BOP_ID, "block/" + base.getPath());

        var leaves = texture.withSuffix("_leaves");
        var log = key(set.fence().get()).withPath(it -> "block/" + it.substring(0, it.length() - "_fence".length()) + "_log");

        leafCarpet(set.leafCarpet().get(), leaves);
        leafPile(set.leafPile().get(), leaves);
        hedge(set.hedge().get(), log, leaves);
    }

    private void registerStatesAndModels(CompatBlocks.WoodSet set) {
        var base = key(set.post().get()).withPath(it -> it.substring(0, it.length() - "_post".length()));
        var texture = new ResourceLocation(BOP_ID, "block/" + base.getPath());

        var planks = texture.withSuffix("_planks");
        var log = texture.withSuffix("_log");
        var strippedLog = texture.withPath("block/stripped_" + base.getPath() + "_log");

        post(set.post().get(), log);
        post(set.strippedPost().get(), strippedLog);
        verticalSlab(set.verticalSlab().get(), planks);
        verticalPlanks(set.verticalPlanks().get(), planks);
        boards(set.boards().get());
        cabinet(set.cabinet().get());
        bookshelf(set.bookshelf().get(), planks);
        table(set.table().get());
        chest(set.chest().get(), planks);
        chest(set.trappedChest().get(), planks);
        ladder(set.ladder().get());
        beehive(set.beehive().get());
    }

    private int rotationY(Direction direction) {
        return switch (direction) {
            case EAST -> 90;
            case SOUTH -> 180;
            case WEST -> 270;
            default -> 0;
        };
    }

    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ItemModelBuilder itemModel(Block block) {
        return itemModels().withExistingParent(name(block), blockTexture(block));
    }

    private void bookshelf(Block block, ResourceLocation top) {
        simpleBlock(block, models().cubeColumn(name(block), blockTexture(block), top));
        itemModel(block);
    }

    private void cabinet(Block block) {
        var name = name(block);

        var texture = blockTexture(block);
        var model = models().orientable(name, texture.withSuffix("_side"), texture.withSuffix("_front"), texture.withSuffix("_top"));
        var modelOpen = models().orientable(name + "_open", texture.withSuffix("_side"), texture.withSuffix("_front_open"), texture.withSuffix("_top"));

        getVariantBuilder(block).forAllStatesExcept(state -> {
            var open = state.getValue(CabinetBlock.OPEN);
            var facing = state.getValue(CabinetBlock.FACING);

            return ConfiguredModel.builder()
                    .modelFile(open ? modelOpen : model)
                    .rotationY(rotationY(facing))
                    .build();
        });

        itemModel(block);
    }

    private <M extends ModelBuilder<M>> M leafPileModel(ModelProvider<M> provider, String name, ResourceLocation texture) {
        return provider.singleTexture(name, new ResourceLocation(BLUEPRINT_ID, "block/tinted_leaf_pile"), "all", texture);
    }

    private void leafPile(Block block, ResourceLocation texture) {
        var name = name(block);

        var model = leafPileModel(models(), name, texture);

        var builder = getMultipartBuilder(block);

        PipeBlock.PROPERTY_BY_DIRECTION.forEach((direction, property) -> {
            var rotationX = switch (direction) {
                case DOWN -> 90;
                case UP -> 270;
                default -> 0;
            };

            var rotationY = switch (direction) {
                case WEST -> 270;
                case SOUTH -> 180;
                case EAST -> 90;
                default -> 0;
            };

            builder.part()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .rotationX(rotationX)
                    .uvLock(true)
                    .addModel()
                    .condition(property, true);

            var around = builder.part()
                    .modelFile(model)
                    .rotationY(rotationY)
                    .rotationX(rotationX)
                    .uvLock(true)
                    .addModel();

            PipeBlock.PROPERTY_BY_DIRECTION.values().forEach(it -> around.condition(it, false));
        });

        itemModels().singleTexture(name, new ResourceLocation("item/generated"), "layer0", texture);
    }

    private <M extends ModelBuilder<M>> M leafCarpetModel(ModelProvider<M> provider, String name, ResourceLocation texture) {
        return provider.singleTexture(name, new ResourceLocation(QUARK_ID, "block/leaf_carpet"), "all", texture);
    }

    private void leafCarpet(Block block, ResourceLocation texture) {
        simpleBlock(block, leafCarpetModel(models(), name(block), texture));
        itemModel(block);
    }

    private void verticalPlanks(Block block, ResourceLocation texture) {
        var name = name(block);
        simpleBlock(block, models().singleTexture(name, new ResourceLocation(QUARK_ID, "block/vertical_planks"), "all", texture));
        itemModel(block);
    }

    private void boards(RotatedPillarBlock block) {
        var name = name(block);
        var texture = blockTexture(block);
        var model = models().singleTexture(name, new ResourceLocation(BLUEPRINT_ID, "block/template_boards"), "all", texture);
        var modelHorizontal = models().singleTexture(name + "_horizontal", new ResourceLocation(BLUEPRINT_ID, "block/template_boards_horizontal"), "all", texture);
        axisBlock(block, model, modelHorizontal);
        itemModel(block);
    }

    private void verticalSlab(Block block, ResourceLocation texture) {
        var name = name(block);
        var model = models().withExistingParent(name, new ResourceLocation(QUARK_ID, "block/vertical_slab"))
                .texture("side", texture)
                .texture("top", texture)
                .texture("bottom", texture);

        var planks = models().getExistingFile(texture);

        getVariantBuilder(block).forAllStatesExcept(state -> {
            var type = state.getValue(VerticalSlabBlock.TYPE);

            if (type == VerticalSlabBlock.VerticalSlabType.DOUBLE) {
                return ConfiguredModel.builder()
                        .modelFile(planks)
                        .build();
            }

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY(rotationY(type.direction))
                    .uvLock(true)
                    .build();
        });

        itemModel(block);
    }

    private void post(Block block, ResourceLocation texture) {
        var name = name(block);

        var base = models().singleTexture(name, new ResourceLocation(QUARK_ID, "block/post"), texture);
        var connect = models().singleTexture(name + "_connect", new ResourceLocation(QUARK_ID, "block/post_connect"), texture);
        var connectTop = models().singleTexture(name + "_connect_top", new ResourceLocation(QUARK_ID, "block/post_connect_top"), texture);

        var builder = getMultipartBuilder(block);

        var chainSmall = models().getExistingFile(new ResourceLocation(QUARK_ID, "chain_small"));
        var chainSmallTop = models().getExistingFile(new ResourceLocation(QUARK_ID, "chain_small_top"));

        builder.part()
                .modelFile(base)
                .addModel()
                .condition(AXIS, Direction.Axis.Y);

        builder.part()
                .modelFile(base)
                .rotationX(90)
                .rotationY(90)
                .addModel()
                .condition(AXIS, Direction.Axis.X);

        builder.part()
                .modelFile(base)
                .rotationX(90)
                .addModel()
                .condition(AXIS, Direction.Axis.Z);

        for (var side : WoodPostBlock.SIDES) {
            var direction = Objects.requireNonNull(Direction.byName(side.getName().substring(8)));

            var topModel = List.of(Direction.UP, Direction.NORTH, Direction.EAST).contains(direction);

            var rotationX = direction.getAxis() == Direction.Axis.Y ? 0 : 90;
            var rotationY = direction.getAxis() == Direction.Axis.X ? 90 : 0;

            builder.part()
                    .modelFile(topModel ? chainSmallTop : chainSmall)
                    .rotationX(rotationX)
                    .rotationY(rotationY)
                    .addModel()
                    .condition(side, WoodPostBlock.PostSideType.CHAIN);

            builder.part()
                    .modelFile(topModel ? connectTop : connect)
                    .rotationX(rotationX)
                    .rotationY(rotationY)
                    .addModel()
                    .condition(side, WoodPostBlock.PostSideType.OTHER_POST);
        }

        itemModel(block);
    }

    private void table(Block block) {
        var name = name(block);
        var texture = blockTexture(block);

        var model = models().withExistingParent(name, new ResourceLocation(CompatOPlenty.MOD_ID, "block/table_template"))
                .texture("side", texture)
                .texture("top", texture.withSuffix("_top"))
                .texture("bottom", texture.withSuffix("_bottom"));

        horizontalBlock(block, model);
        itemModel(block);
    }

    private void chest(Block block, ResourceLocation particle) {
        simpleBlock(block, models().getBuilder(name(block)).texture("particle", particle));
        itemModels().withExistingParent(name(block), new ResourceLocation(BLUEPRINT_ID, "item/template_chest"));
    }

    private void ladder(Block block) {
        var name = name(block);
        var texture = blockTexture(block);

        var model = models().withExistingParent(name, new ResourceLocation("block/ladder"))
                .texture("texture", texture)
                .texture("particle", texture);

        horizontalBlock(block, model);
        itemModels().singleTexture(name, new ResourceLocation("item/generated"), "layer0", blockTexture(block));
    }

    private void beehive(Block block) {
        var name = name(block);
        var texture = blockTexture(block);

        var end = texture.withSuffix("_end");
        var side = texture.withSuffix("_side");
        var front = texture.withSuffix("_front");
        var model = models().orientableWithBottom(name, side, front, end, end);
        var modelHoney = models().orientableWithBottom(name + "_honey", side, front.withSuffix("_honey"), end, end);

        getVariantBuilder(block).forAllStatesExcept(state -> {
            var facing = state.getValue(BeehiveBlock.FACING);
            var honey = state.getValue(BeehiveBlock.HONEY_LEVEL);

            return ConfiguredModel.builder()
                    .modelFile(honey == 5 ? modelHoney : model)
                    .rotationY(rotationY(facing))
                    .build();
        });

        itemModel(block);
    }

    private <M extends ModelBuilder<M>> M hedgePostModel(ModelProvider<M> provider, String name, ResourceLocation log, ResourceLocation leaves) {
        return provider.withExistingParent(name, new ResourceLocation(QUARK_ID, "block/hedge_post"))
                .texture("log", log)
                .texture("leaf", leaves);
    }

    private void hedge(Block block, ResourceLocation log, ResourceLocation leaves) {
        var name = name(block);

        var builder = getMultipartBuilder(block);

        var extend = models().singleTexture(name + "_extend", new ResourceLocation(QUARK_ID, "block/hedge_extend"), "leaf", leaves);
        var side = models().singleTexture(name + "_side", new ResourceLocation(QUARK_ID, "block/hedge_side"), "leaf", leaves);

        var post = hedgePostModel(models(), name + "_post", log, leaves);

        builder.part()
                .modelFile(post)
                .addModel()
                .condition(HedgeBlock.EXTEND, false);

        builder.part()
                .modelFile(extend)
                .addModel()
                .condition(HedgeBlock.EXTEND, true);

        PipeBlock.PROPERTY_BY_DIRECTION.forEach((direction, property) -> {
            if (direction.getAxis() == Direction.Axis.Y) return;

            builder.part()
                    .modelFile(side)
                    .uvLock(true)
                    .rotationY(rotationY(direction))
                    .addModel()
                    .condition(property, true);
        });

        itemModels().withExistingParent(name, new ResourceLocation(CompatOPlenty.MOD_ID, "block/" + name + "_post"));
    }

}
