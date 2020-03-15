package mod.nyanar.utils.init;

import mod.nyanar.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Utils.MODID)
public class ModBlocks {
    public static final Block LYNITE_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F));
}
