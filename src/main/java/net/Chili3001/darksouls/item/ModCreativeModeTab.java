package net.Chili3001.darksouls.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DARK_SOULS_TAB = new CreativeModeTab("dark_souls") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SOUL.get());
        }
    };
}
