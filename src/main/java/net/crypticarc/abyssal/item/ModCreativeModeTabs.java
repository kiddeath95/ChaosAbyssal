package net.crypticarc.abyssal.item;

import net.crypticarc.abyssal.ChaosAbyssal;
import net.crypticarc.abyssal.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChaosAbyssal.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CHAOS_INGREDIENTS = CREATIVE_MODE_TABS.register("chaos_ingredients",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.chaos_ingredients"))
                    .displayItems((pParameters, pOutput) -> {
                         pOutput.accept(ModItems.SAPPHIRE.get());
                         pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                         pOutput.accept(ModItems.METAL_DETECTOR.get());

                         pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                         pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                         pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                         pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                         pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                         pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                         pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
