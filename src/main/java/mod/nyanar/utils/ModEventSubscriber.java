package mod.nyanar.utils;

import mod.nyanar.utils.init.ModBlocks;
import mod.nyanar.utils.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;


@Mod.EventBusSubscriber(modid = Utils.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {


    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(ModItems.LYNITE_DUST, "lynite_dust"),
                setup(ModItems.LYNITE_ORE, "lynite_ore")
        );
    }


    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                setup(ModBlocks.LYNITE_ORE, "lynite_ore")
        );
    }

    @SubscribeEvent
    public static void FMLLoadCompleteEvent(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            WorldFeatures.addOre(biome, ModBlocks.LYNITE_ORE, 6, 1, 20);
        }
    }



    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(Utils.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}
