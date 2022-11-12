package com.elad1010.nature_treasures.blocks;

import com.elad1010.nature_treasures.NatureTreasures;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(NatureTreasures.TAB));
    }
}
