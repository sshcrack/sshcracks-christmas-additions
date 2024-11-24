package me.sshcrack.sshcracks_christmas.block;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class FloeBlock extends Block {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

    public FloeBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlaceAt(BlockState floeState, WorldView world, BlockPos currPos) {
        BlockPos downPos = currPos.down();
        BlockState floor = world.getBlockState(downPos);

        FluidState downFluid = world.getFluidState(downPos);
        FluidState currFluid = world.getFluidState(currPos);
        return (downFluid.getFluid() == Fluids.WATER || floor.getBlock() instanceof IceBlock) && currFluid.getFluid() == Fluids.EMPTY;
    }
}
