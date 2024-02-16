package com.tutorialmod.Neutral_Hunter.init;

import java.util.ArrayList;
import java.util.List;

import com.tutorialmod.Neutral_Hunter.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON);
}
