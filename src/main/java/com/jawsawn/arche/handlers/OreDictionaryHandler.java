package com.jawsawn.arche.handlers;

import com.jawsawn.arche.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Jason on 1/24/2018.
 */
public class OreDictionaryHandler {

    public static void registerOreDictionary() {

        OreDictionary.registerOre("stonePhis", new ItemStack(ModItems.phiStone, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("stonePhis", new ItemStack(ModItems.mStone, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("stonePhis", new ItemStack(ModItems.lmStone, 1, OreDictionary.WILDCARD_VALUE));
    }
}
