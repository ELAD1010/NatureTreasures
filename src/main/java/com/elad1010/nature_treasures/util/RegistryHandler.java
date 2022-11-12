package com.elad1010.nature_treasures.util;

import com.elad1010.nature_treasures.NatureTreasures;
import com.elad1010.nature_treasures.blocks.BlockItemBase;
import com.elad1010.nature_treasures.blocks.GraniumBlock;
import com.elad1010.nature_treasures.items.ItemBase;
import com.elad1010.nature_treasures.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NatureTreasures.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NatureTreasures.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // Items
    public static final RegistryObject<Item> REINFORCED_BLAZE_ROD = ITEMS.register("reinforced_blaze_rod", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> BEDRONIC_SWORD = ITEMS.register("bedronic_sword", () ->
            new SwordItem(ModItemTier.BEDROCK, 7, -2.4f, new Item.Properties().group(NatureTreasures.TAB)));

    public static final  RegistryObject<PickaxeItem> BEDRONIC_PICKAXE = ITEMS.register("bedronic_pickaxe", () ->
            new PickaxeItem(ModItemTier.BEDROCK, 0, -2.8f, new Item.Properties().group(NatureTreasures.TAB)));

    // Blocks
    public static final RegistryObject<Block> GRANIUM_BLOCK = BLOCKS.register("granium_block", GraniumBlock::new);

    // Block Items
    public static final RegistryObject<Item> GRANIUM_BLOCK_ITEM = ITEMS.register("granium_block", () -> new BlockItemBase(GRANIUM_BLOCK.get()));
}
