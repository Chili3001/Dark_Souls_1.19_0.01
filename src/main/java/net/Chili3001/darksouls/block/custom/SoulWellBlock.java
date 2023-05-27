package net.Chili3001.darksouls.block.custom;


import net.Chili3001.darksouls.block.ModBlocks;
import net.Chili3001.darksouls.block.entity.ModBlockEntities;
import net.Chili3001.darksouls.block.entity.custom.SoulWellBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class SoulWellBlock extends Block implements EntityBlock {


    public SoulWellBlock(Properties properties){super(properties);}

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return ModBlockEntities.SOUL_WELL_BLOCK_ENTITY.get().create(pPos, pState);
    }

    @Nullable
    @Override
    public  <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return pLevel.isClientSide() ? null : ($0, pos, $1, blockEntity)->{
            if(blockEntity instanceof SoulWellBlockEntity soulWell){
                soulWell.tick();
            }
        };
    }
}
