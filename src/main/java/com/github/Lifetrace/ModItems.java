package com.github.Lifetrace;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    // общий реестр предметов
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    // 2) предмет-блок, чтобы блок можно было взять в инвентарь
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ITEMS.register(
            "amethyst_block", // ИМЯ ДОЛЖНО СОВПАДАТЬ с именем блока
            () -> new BlockItem(ModBlocks.AMETHYST_BLOCK.get(),
                    new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS))
    );
}
