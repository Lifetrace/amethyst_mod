package com.github.Lifetrace;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod( Main.MODID )
public class Main {
    public static final String MODID = "amethyst";

    public Main() {
        // подписываем наш регистр на шину мод-ивентов
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

