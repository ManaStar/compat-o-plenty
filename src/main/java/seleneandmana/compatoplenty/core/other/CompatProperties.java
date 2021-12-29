package seleneandmana.compatoplenty.core.other;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class CompatProperties {
    //Cherry
    public static final BlockBehaviour.Properties CHERRY_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties CHERRY_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_RED).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Jacaranda
    public static final BlockBehaviour.Properties JACARANDA_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties JACARANDA_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_PINK).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Fir
    public static final BlockBehaviour.Properties FIR_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_WHITE).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties FIR_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_WHITE).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Redwood
    public static final BlockBehaviour.Properties REDWOOD_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_ORANGE).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties REDWOOD_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_ORANGE).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Mahogany
    public static final BlockBehaviour.Properties MAHOGANY_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_PINK).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties MAHOGANY_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_PINK).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Willow
    public static final BlockBehaviour.Properties WILLOW_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_LIGHT_GREEN).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties WILLOW_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_LIGHT_GREEN).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Magic
    public static final BlockBehaviour.Properties MAGIC_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties MAGIC_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BLUE).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Dead
    public static final BlockBehaviour.Properties DEAD_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.STONE).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties DEAD_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.STONE).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Umbran
    public static final BlockBehaviour.Properties UMBRAN_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLUE).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties UMBRAN_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_BLUE).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Palm
    public static final BlockBehaviour.Properties PALM_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_YELLOW).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties PALM_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_YELLOW).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Hellbark
    public static final BlockBehaviour.Properties HELLBARK_BOOKSHELF = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_GRAY).strength(1.5f).sound(SoundType.WOOD);
    public static final BlockBehaviour.Properties HELLBARK_LADDER = BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.TERRACOTTA_GRAY).strength(0.4f).noOcclusion().sound(SoundType.LADDER);

    //Leaf
    public static final BlockBehaviour.Properties LEAF_CARPET = BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.0f).sound(SoundType.GRASS).noOcclusion();
}
