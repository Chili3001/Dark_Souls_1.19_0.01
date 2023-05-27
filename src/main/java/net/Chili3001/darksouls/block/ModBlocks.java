package net.Chili3001.darksouls.block;

import net.Chili3001.darksouls.DarkSouls;

import net.Chili3001.darksouls.block.custom.SoulWellBlock;
import net.Chili3001.darksouls.fluid.ModFluids;
import net.Chili3001.darksouls.item.ModCreativeModeTab;
import net.Chili3001.darksouls.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DarkSouls.MOD_ID);



    public static final RegistryObject<Block> SOUL_STONE = registerBlock("soulstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F,6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.DARK_SOULS_TAB);

    public static final RegistryObject<Block> SOUL_STONE_BRICKS = registerBlock("soulstone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.DARK_SOULS_TAB);

    public static final RegistryObject<Block> CHISELED_SOULSTONE = registerBlock("chiseled_soulstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.DARK_SOULS_TAB);

    public static final RegistryObject<Block> SOUL_STONE_BRICK_STAIRS = registerBlock("soulstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.DARK_SOULS_TAB);

    public static final RegistryObject<Block> SOUL_STONE_BRICK_SLAB = registerBlock("soulstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.DARK_SOULS_TAB);

    public static final RegistryObject<Block> SOUL_STONE_BRICK_WALL = registerBlock("soulstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.DARK_SOULS_TAB);

    public static final RegistryObject<Block> SOUL_STONE_SLAB = registerBlock("soulstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.DARK_SOULS_TAB);

    public static final RegistryObject<Block> SOUL_STONE_STAIRS = registerBlock("soulstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SOUL_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5F, 6.0F).requiresCorrectToolForDrops()), ModCreativeModeTab.DARK_SOULS_TAB);

    public static final RegistryObject<Block> SOUL_WELL= registerBlock("soul_well",
            () -> new SoulWellBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops().noOcclusion()),
            ModCreativeModeTab.DARK_SOULS_TAB);



    public static final RegistryObject<LiquidBlock> HOLY_WATER_BLOCK = BLOCKS.register("holy_water_block",
            ()-> new LiquidBlock(ModFluids.SOURCE_HOLY_WATER, BlockBehaviour.Properties.copy(Blocks.WATER)));







    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
