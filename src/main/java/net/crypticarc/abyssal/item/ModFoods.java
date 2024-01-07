package net.crypticarc.abyssal.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

    public static final FoodProperties ABYSSAL_STEW = new FoodProperties.Builder().nutrition(8)
            .saturationMod(12.8f).effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 3600), 1f).build();
    public static final FoodProperties DEEP_SEA_DELICACIES = new FoodProperties.Builder().nutrition(6)
            .saturationMod(7.2f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 2400), 1f).build();

    public static final FoodProperties GOLDEN_APPLE_PIE = new FoodProperties.Builder().nutrition(8)
            .saturationMod(14.4f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 2400), 1f).build();

    public static final FoodProperties MYSTIC_MARINER_PLATTER = new FoodProperties.Builder().nutrition(10)
            .saturationMod(14.4f).effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400), 1f).build();

}
