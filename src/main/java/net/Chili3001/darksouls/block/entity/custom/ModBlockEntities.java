package net.Chili3001.darksouls.block.entity.custom;

import net.Chili3001.darksouls.DarkSouls;
import net.Chili3001.darksouls.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.Chili3001.darksouls.DarkSouls;
import net.Chili3001.darksouls.block.ModBlocks;
import net.Chili3001.darksouls.block.entity.custom.SoulWellBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

    public class ModBlockEntities {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
                DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DarkSouls.MOD_ID);

        public static final RegistryObject<SoulWellBlockEntity> SOUL_WELL_BLOCK_ENTITY =
                BLOCK_ENTITIES.register("soul_well", () ->
                        BlockEntityType.Builder.of(SoulWellBlockEntity::new,
                                ModBlocks.SOUL_WELL.get()).build(null));

        public static void register(IEventBus eventBus) {
            BLOCK_ENTITIES.register(eventBus);
        }
    }

