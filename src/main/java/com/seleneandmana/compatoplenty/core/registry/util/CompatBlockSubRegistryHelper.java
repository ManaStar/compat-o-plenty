package com.seleneandmana.compatoplenty.core.registry.util;

import com.mojang.datafixers.util.Pair;
import com.teamabnormals.blueprint.client.ChestManager;
import com.teamabnormals.blueprint.client.renderer.block.ChestBlockEntityWithoutLevelRenderer;
import com.teamabnormals.blueprint.common.block.chest.BlueprintChestBlock;
import com.teamabnormals.blueprint.common.block.chest.BlueprintTrappedChestBlock;
import com.teamabnormals.blueprint.common.block.entity.BlueprintChestBlockEntity;
import com.teamabnormals.blueprint.common.block.entity.BlueprintTrappedChestBlockEntity;
import com.teamabnormals.blueprint.common.item.BEWLRBlockItem;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.RegistryObject;

public class CompatBlockSubRegistryHelper extends BlockSubRegistryHelper {
    public CompatBlockSubRegistryHelper(RegistryHelper parent) {
        super(parent);
    }

    public Pair<RegistryObject<BlueprintChestBlock>, RegistryObject<BlueprintTrappedChestBlock>> createUnburnableCompatChestBlocks(String compatModId, String name, MaterialColor color) {
        boolean isModLoaded = ModList.get().isLoaded(compatModId) || compatModId == "indev";
        CreativeModeTab chestGroup = isModLoaded ? CreativeModeTab.TAB_DECORATIONS : null;
        CreativeModeTab trappedChestGroup = isModLoaded ? CreativeModeTab.TAB_REDSTONE : null;
        String modId = this.parent.getModId();
        String chestName = name + "_chest";
        String trappedChestName = name + "_trapped_chest";
        RegistryObject<BlueprintChestBlock> chest = this.deferredRegister.register(chestName, () -> new BlueprintChestBlock(modId + ":" + name, Block.Properties.of(Material.WOOD, color).strength(2.5F).sound(SoundType.WOOD)));
        RegistryObject<BlueprintTrappedChestBlock> trappedChest = this.deferredRegister.register(trappedChestName, () -> new BlueprintTrappedChestBlock(modId + ":" + name + "_trapped", Block.Properties.of(Material.WOOD, color).strength(2.5F).sound(SoundType.WOOD)));
        this.itemRegister.register(chestName, () -> new BEWLRBlockItem(chest.get(), new Item.Properties().tab(chestGroup), () -> () -> chestBEWLR(false)));
        this.itemRegister.register(trappedChestName, () -> new BEWLRBlockItem(trappedChest.get(), new Item.Properties().tab(trappedChestGroup), () -> () -> chestBEWLR(true)));
        ChestManager.putChestInfo(modId, name, false);
        ChestManager.putChestInfo(modId, name, true);
        return Pair.of(chest, trappedChest);
    }

    @OnlyIn(Dist.CLIENT)
    private static BEWLRBlockItem.LazyBEWLR chestBEWLR(boolean trapped) {
        return trapped ? new BEWLRBlockItem.LazyBEWLR((dispatcher, entityModelSet) -> {
            return new ChestBlockEntityWithoutLevelRenderer<>(dispatcher, entityModelSet, new BlueprintTrappedChestBlockEntity(BlockPos.ZERO, Blocks.TRAPPED_CHEST.defaultBlockState()));
        }) : new BEWLRBlockItem.LazyBEWLR((dispatcher, entityModelSet) -> {
            return new ChestBlockEntityWithoutLevelRenderer<>(dispatcher, entityModelSet, new BlueprintChestBlockEntity(BlockPos.ZERO, Blocks.CHEST.defaultBlockState()));
        });
    }
}
