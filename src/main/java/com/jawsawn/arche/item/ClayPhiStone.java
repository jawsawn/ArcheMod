package com.jawsawn.arche.item;

import com.jawsawn.arche.Arche;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Jason on 05/22/18.
 */
public class ClayPhiStone extends Item {


    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack result = itemStack.copy();
        return result;
    }



    public ClayPhiStone() {
        setRegistryName("clayphistone");
        setUnlocalizedName(Arche.MODID + ".clayphistone");
        this.setCreativeTab(Arche.tabArche).setMaxStackSize(1).setNoRepair();

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
