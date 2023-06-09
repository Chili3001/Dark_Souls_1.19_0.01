package net.Chili3001.darksouls.fluid;


import com.mojang.math.Vector3f;

import net.Chili3001.darksouls.DarkSouls;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation SOAP_OVERLAY_RL = new ResourceLocation(DarkSouls.MOD_ID, "misc/holy_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, DarkSouls.MOD_ID);

    public static final RegistryObject<FluidType> HOLY_WATER_FLUID_TYPE = register("holy_water_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, SOAP_OVERLAY_RL,
                0xA1EDEFF5, new Vector3f(224f / 255f, 56f / 255f, 208f / 255f), properties));
    }



    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}