package seleneandmana.compatoplenty.core.registry.util;

import com.minecraftabnormals.abnormals_core.client.ChestManager;
import com.minecraftabnormals.abnormals_core.client.renderer.ChestItemRenderer;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsTrappedChestBlock;
import com.minecraftabnormals.abnormals_core.common.tileentity.AbnormalsChestTileEntity;
import com.minecraftabnormals.abnormals_core.common.tileentity.AbnormalsTrappedChestTileEntity;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;

import java.util.concurrent.Callable;

public class CompatBlockSubRegistryHelper extends BlockSubRegistryHelper {
    public CompatBlockSubRegistryHelper(RegistryHelper parent) {
        super(parent);
    }

    public Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> createUnburnableCompatChestBlocks(String compatModId, String name, MaterialColor color) {
        boolean isModLoaded = ModList.get().isLoaded(compatModId) || compatModId == "indev";
        ItemGroup chestGroup = isModLoaded ? ItemGroup.TAB_DECORATIONS : null;
        ItemGroup trappedChestGroup = isModLoaded ? ItemGroup.TAB_REDSTONE : null;
        String modId = this.parent.getModId();
        String chestName = name + "_chest";
        String trappedChestName = name + "_trapped_chest";
        RegistryObject<AbnormalsChestBlock> chest = this.deferredRegister.register(chestName, () -> new AbnormalsChestBlock(modId + ":" + name, Block.Properties.of(Material.WOOD, color).strength(2.5F).sound(SoundType.WOOD)));
        RegistryObject<AbnormalsTrappedChestBlock> trappedChest = this.deferredRegister.register(trappedChestName, () -> new AbnormalsTrappedChestBlock(modId + ":" + name + "_trapped", Block.Properties.of(Material.WOOD, color).strength(2.5F).sound(SoundType.WOOD)));
        this.itemRegister.register(chestName, () -> new BlockItem(chest.get(), new Item.Properties().tab(chestGroup).setISTER(() -> chestISTER(false))));
        this.itemRegister.register(trappedChestName, () -> new BlockItem(trappedChest.get(), new Item.Properties().tab(trappedChestGroup).setISTER(() -> chestISTER(true))));
        ChestManager.putChestInfo(modId, name, false);
        ChestManager.putChestInfo(modId, name, true);
        return Pair.of(chest, trappedChest);
    }

    @OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> chestISTER(boolean trapped) {
        return () -> new ChestItemRenderer<TileEntity>(trapped ? AbnormalsTrappedChestTileEntity::new : AbnormalsChestTileEntity::new);
    }
}
