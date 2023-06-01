package net.Chili3001.darksouls.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SoulWellBlockEntity extends BlockEntity {


    public SoulWellBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState) {
        super(pType, pPos, pBlockState);
    }
    


    public void tick(){
        var pig = new Pig(EntityType.PIG, this.level);
        pig.setPos(this.worldPosition.getX(),this.worldPosition.getY(), this.worldPosition.getZ());
        this.level.addFreshEntity(pig);
    }
}
