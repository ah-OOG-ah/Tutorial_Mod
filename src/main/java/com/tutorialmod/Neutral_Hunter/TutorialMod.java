package com.tutorialmod.Neutral_Hunter;

import com.tutorialmod.Neutral_Hunter.tabs.TutorialTab;
import com.tutorialmod.Neutral_Hunter.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import com.tutorialmod.Neutral_Hunter.proxy.CommonProxy;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import static com.tutorialmod.Neutral_Hunter.Tags.VERSION;

@Mod(modid = Reference.MOD_ID, version = VERSION, name = Reference.NAME)
public class TutorialMod
{
    @Instance
    public static TutorialMod Instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs TUTORIALMODTAB = new TutorialTab("tutorialtab");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

    @EventHandler
    public void ServerInit(FMLServerStartingEvent event)
    {

    }
}
