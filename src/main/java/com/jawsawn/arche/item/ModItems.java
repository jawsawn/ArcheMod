package com.jawsawn.arche.item;


import com.jawsawn.arche.Arche;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
/**
 * Created by Utku on 12.3.2017.
 */
public class ModItems {

    public static Item phis;
    public static Item minium;
    public static Item lminium;
    public static Item inert;


    public static void preInit() {



        phis = new ItemPhisItem().setUnlocalizedName("phistone").setMaxDamage(1280).setCreativeTab(Arche.tabArche).setMaxStackSize(1).setNoRepair();
        minium = new ItemPhisItem().setUnlocalizedName("miniumstone").setMaxDamage(256).setCreativeTab(Arche.tabArche).setMaxStackSize(1).setNoRepair();
        lminium = new ItemPhisItem().setUnlocalizedName("lminiumstone").setMaxDamage(64).setCreativeTab(Arche.tabArche).setMaxStackSize(1).setNoRepair();
        inert = new Item().setUnlocalizedName("inertstone").setCreativeTab(Arche.tabArche).setMaxStackSize(16);


        registerItems();
    }


    public static void registerItems() {
        GameRegistry.register(phis, new ResourceLocation(Arche.MODID, "phistone"));
        GameRegistry.register(minium, new ResourceLocation(Arche.MODID, "miniumstone"));
        GameRegistry.register(lminium, new ResourceLocation(Arche.MODID, "lminiumstone"));
        GameRegistry.register(inert, new ResourceLocation(Arche.MODID, "inertstone"));


    }



    public static void registerRenders() {
        registerRender(phis);
        registerRender(minium);
        registerRender(lminium);
        registerRender(inert);


    }


    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Arche.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
