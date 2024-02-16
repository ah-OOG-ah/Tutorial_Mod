package com.tutorialmod.Neutral_Hunter.objects.items;

import com.tutorialmod.Neutral_Hunter.TutorialMod;
import com.tutorialmod.Neutral_Hunter.init.ItemInit;
import com.tutorialmod.Neutral_Hunter.util.interfaces.IHasModel;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TutorialMod.TUTORIALMODTAB);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels()
    {
        TutorialMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
