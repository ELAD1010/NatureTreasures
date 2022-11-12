package com.elad1010.nature_treasures.items;

import com.elad1010.nature_treasures.NatureTreasures;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(NatureTreasures.TAB));
    }
}
