package com.jawsawn.arche.handlers;

import com.jawsawn.arche.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Utku on 20.4.2017.
 */


public class OreDictionaryHandler {



    public static void registerOreDictionary() {

        OreDictionary.registerOre("stonePhis", new ItemStack(ModItems.phis, 1 , OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("stonePhis", new ItemStack(ModItems.minium, 1 , OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("stonePhis", new ItemStack(ModItems.lminium, 1 , OreDictionary.WILDCARD_VALUE));
    }
}
