package com.elad1010.nature_treasures.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GraniumBlock extends Block {
    public GraniumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(50.0f, 1200.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}
