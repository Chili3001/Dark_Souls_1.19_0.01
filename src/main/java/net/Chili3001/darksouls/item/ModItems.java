package net.Chili3001.darksouls.item;

import net.Chili3001.darksouls.DarkSouls;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static net.Chili3001.darksouls.item.ModCreativeModeTab.DARK_SOULS_TAB;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DarkSouls.MOD_ID);

            public static final RegistryObject<Item> SOUL = ITEMS.register("soul",
                    () -> new Item(new Item.Properties().fireResistant().tab(DARK_SOULS_TAB)));

    public static final RegistryObject<Item> SOULSWORD = ITEMS.register("soul_sword",
            ()-> new SoulSword(Tiers.IRON, 3, -2.4F, (new Item.Properties()).tab(DARK_SOULS_TAB).fireResistant().rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
