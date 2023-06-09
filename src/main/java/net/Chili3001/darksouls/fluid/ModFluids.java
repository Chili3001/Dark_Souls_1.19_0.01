package net.Chili3001.darksouls.fluid;

import net.Chili3001.darksouls.DarkSouls;
import net.Chili3001.darksouls.block.ModBlocks;
import net.Chili3001.darksouls.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, DarkSouls.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_HOLY_WATER = FLUIDS.register("soap_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.HOLY_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HOLY_WATER = FLUIDS.register("flowing_soap_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HOLY_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties HOLY_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.HOLY_WATER_FLUID_TYPE, SOURCE_HOLY_WATER, FLOWING_HOLY_WATER).slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.HOLY_WATER_BLOCK);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
