package mod.nyanar.utils.init;

import mod.nyanar.utils.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Utils.MODID)
public class ModItems {
    public static final Item LYNITE_DUST = new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final BlockItem LYNITE_ORE = new BlockItem(ModBlocks.LYNITE_ORE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
}