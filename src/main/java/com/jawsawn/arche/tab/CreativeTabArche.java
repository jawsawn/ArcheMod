package com.jawsawn.arche.tab;

import com.jawsawn.arche.Arche;
import com.jawsawn.arche.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Utku on 12.3.2017.
 */
public class CreativeTabArche extends CreativeTabs {

    public CreativeTabArche(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.phis;
    }
}
