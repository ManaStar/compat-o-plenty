package seleneandmana.compatoplenty.common.integration.farmersdelight;


import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;

public class ReplacementPantryBlock  extends Block {

    private static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST);
    private static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    public ReplacementPantryBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)));
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING, OPEN);
    }
}
