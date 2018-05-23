package com.jawsawn.arche;

import com.jawsawn.arche.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Jason on 1/24/2018.
 */
public class ModItems {

    @GameRegistry.ObjectHolder("arche:phistone")
    public static PhiStone phiStone;
    @GameRegistry.ObjectHolder("arche:miniumstone")
    public static MStone mStone;
    @GameRegistry.ObjectHolder("arche:lminiumstone")
    public static LMStone lmStone;
    @GameRegistry.ObjectHolder("arche:inertstone")
    public static InertStone inertStone;
    @GameRegistry.ObjectHolder("arche:clayphistone")
    public static ClayPhiStone clayPhiStone;


    @SideOnly(Side.CLIENT)
    public static void initModels() {
        phiStone.initModel();
        mStone.initModel();
        lmStone.initModel();
        inertStone.initModel();
        clayPhiStone.initModel();
    }
}
