package net.crypticarc.abyssal.item;

import net.crypticarc.abyssal.ChaosAbyssal;
import net.crypticarc.abyssal.item.custom.FuelItem;
import net.crypticarc.abyssal.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChaosAbyssal.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> ABYSSAL_STEW = ITEMS.register("abyssal_stew",
            () -> new Item(new Item.Properties().food(ModFoods.ABYSSAL_STEW)));

    public static final RegistryObject<Item> DEEP_SEA_DELICACIES = ITEMS.register("deep_sea_delicacies",
            () -> new Item(new Item.Properties().food(ModFoods.DEEP_SEA_DELICACIES)));

    public static final RegistryObject<Item> MYSTIC_MARINER_PLATTER = ITEMS.register("mystic_mariner_platter",
            () -> new Item(new Item.Properties().food(ModFoods.MYSTIC_MARINER_PLATTER)));

    public static final RegistryObject<Item> GOLDEN_APPLE_PIE = ITEMS.register("golden_apple_pie",
            () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_APPLE_PIE)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 400));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
