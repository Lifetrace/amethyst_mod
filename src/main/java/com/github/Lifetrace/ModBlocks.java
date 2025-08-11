package com.github.Lifetrace;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
    // общий реестр блоков для нашего модa
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    // 1) объявляем блок с modid "amethyst_block"
    //    свойства: каменный материал, твёрдость/взрывоустойчивость, звук камня, инструмент — кирка
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register(
            "amethyst_block",
            () -> new Block(AbstractBlock.Properties
                    .of(Material.STONE)
                    .strength(1.5F, 6.0F)       // hardness, resistance
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops() // требует кирку по уровню прочности
            )
    );
}
