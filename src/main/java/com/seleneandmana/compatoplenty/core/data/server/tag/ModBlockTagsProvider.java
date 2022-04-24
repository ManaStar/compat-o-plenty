package com.seleneandmana.compatoplenty.core.data.server.tag;

import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator p_126511_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_126511_, CompatOPlenty.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags() {
        tag(BlockTags.MINEABLE_WITH_AXE).add(
        );
    }
}
