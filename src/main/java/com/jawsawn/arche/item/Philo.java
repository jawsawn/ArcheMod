package com.jawsawn.arche.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Jason on 1/24/2018.
 */
public class Philo extends Item {

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack result = itemStack.copy();
        result.attemptDamageItem(1, itemRand, null);
        return result;
    }


}
