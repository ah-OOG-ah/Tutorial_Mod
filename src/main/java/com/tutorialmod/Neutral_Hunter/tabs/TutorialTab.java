package com.tutorialmod.Neutral_Hunter.tabs;

import com.tutorialmod.Neutral_Hunter.init.BlockInit;
import com.tutorialmod.Neutral_Hunter.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class TutorialTab extends CreativeTabs
{
    public TutorialTab(String label)
    {
        super("tutorialmodtab");
        this.setBackgroundImageName("tutorialmod.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.OBSIDIAN_INGOT);
    }
}
