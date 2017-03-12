package com.jawsawn.arche;

import com.jawsawn.arche.proxy.CommonProxy;
import com.jawsawn.arche.tab.CreativeTabArche;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Arche.MODID, version = Arche.VERSION, name = Arche.NAME)
public class Arche
{
    public static final String MODID = "arche";
    public static final String VERSION = "1.0";
    public static final String NAME = "Arche";

    @SidedProxy(clientSide = "com.jawsawn.arche.proxy.ClientProxy", serverSide = "com.jawsawn.arche.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Arche instance;

    public static CreativeTabArche tabArche;





    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        tabArche = new CreativeTabArche(CreativeTabs.getNextID(),"tab_arche");
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }

}
