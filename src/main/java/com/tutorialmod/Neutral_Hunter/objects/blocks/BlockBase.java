package com.tutorialmod.Neutral_Hunter.objects.blocks;

import com.tutorialmod.Neutral_Hunter.TutorialMod;
import com.tutorialmod.Neutral_Hunter.init.BlockInit;
import com.tutorialmod.Neutral_Hunter.init.ItemInit;
import com.tutorialmod.Neutral_Hunter.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material)
    {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(TutorialMod.TUTORIALMODTAB);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        TutorialMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
