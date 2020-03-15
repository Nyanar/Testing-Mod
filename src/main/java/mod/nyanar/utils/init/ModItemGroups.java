package mod.nyanar.utils.init;

import mod.nyanar.utils.Utils;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroups {
    public static class ModItemGroup extends ItemGroup {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon(){
            return iconSupplier.get();
        }
    }
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Utils.MODID, () -> new ItemStack(ModItems.LYNITE_DUST));
}
