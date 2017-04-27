package com.jawsawn.arche.proxy;

import com.jawsawn.arche.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Utku on 12.3.2017.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {

        ModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
