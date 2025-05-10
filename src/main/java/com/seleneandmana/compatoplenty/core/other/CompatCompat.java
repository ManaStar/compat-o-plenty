package com.seleneandmana.compatoplenty.core.other;

import com.seleneandmana.compatoplenty.core.registry.CompatBlocks;
import com.teamabnormals.blueprint.core.util.DataUtil;

public class CompatCompat {
    public static void compatList() {
        flammability();
        compostablility();
    }

    private static void registerCompostables(CompatBlocks.LeafSet set) {
        DataUtil.registerCompostable(set.leafCarpet().get(), 0.3f);
        DataUtil.registerCompostable(set.leafPile().get(), 0.3f);
    }

    private static void registerFlammables(CompatBlocks.LeafSet set) {
        DataUtil.registerFlammable(set.leafCarpet().get(), 30, 60);
        DataUtil.registerFlammable(set.leafPile().get(), 30, 60);
        DataUtil.registerFlammable(set.hedge().get(), 5, 20);
    }

    private static void registerFlammables(CompatBlocks.WoodSet set) {
        DataUtil.registerFlammable(set.post().get(), 5, 20);
        DataUtil.registerFlammable(set.strippedPost().get(), 5, 20);
        DataUtil.registerFlammable(set.verticalSlab().get(), 5, 20);
        DataUtil.registerFlammable(set.verticalPlanks().get(), 5, 20);
        DataUtil.registerFlammable(set.beehive().get(), 5, 20);
        DataUtil.registerFlammable(set.bookshelf().get(), 5, 20);
        DataUtil.registerFlammable(set.table().get(), 5, 20);
        DataUtil.registerFlammable(set.boards().get(), 5, 20);
    }

    public static void flammability() {
        CompatBlocks.woodSets().forEach(CompatCompat::registerFlammables);
        CompatBlocks.leaveSets().forEach(CompatCompat::registerFlammables);
    }

    public static void compostablility() {
        CompatBlocks.leaveSets().forEach(CompatCompat::registerCompostables);
    }
}
