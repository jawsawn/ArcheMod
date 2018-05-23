package com.jawsawn.arche.tab;

import com.jawsawn.arche.ModItems;
import com.jawsawn.arche.item.PhiStone;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

/**
 * Created by Jason on 1/24/2018.
 */
public class CreativeTabArche extends CreativeTabs{
    public CreativeTabArche(int index, String label) {
        super(index, label);
    }


    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.phiStone);
    }
}
