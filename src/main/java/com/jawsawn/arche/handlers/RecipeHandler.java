package com.jawsawn.arche.handlers;

import com.jawsawn.arche.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Utku on 20.4.2017.
 */
public class RecipeHandler {


    public static void register() {



        //stones
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.inert),"GSR","SIS","RSG",'I', Items.DIAMOND,'S',Blocks.STONE,'G',Items.GLOWSTONE_DUST,'R',Items.REDSTONE );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.lminium),"GGG","GDG","GGG",'G', Items.GOLD_INGOT,'D',ModItems.inert );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.minium),"DDD","DMD","DDD",'M', ModItems.inert,'D',Items.DIAMOND );
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.phis),"DDD","DMD","DDD",'M', ModItems.inert,'D', Blocks.DIAMOND_BLOCK);

        //basic
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.OBSIDIAN),"stonePhis","logWood","logWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.IRON_INGOT, 1),"stonePhis",Blocks.OBSIDIAN,Blocks.OBSIDIAN,Blocks.OBSIDIAN,Blocks.OBSIDIAN));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.IRON_INGOT, 1),"stonePhis",Blocks.CLAY,Blocks.CLAY,Blocks.CLAY,Blocks.CLAY));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.ENDER_PEARL, 1),"stonePhis",Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.SAND, 8),"stonePhis",Blocks.DIRT,Blocks.DIRT,Blocks.DIRT,Blocks.DIRT,Blocks.DIRT,Blocks.DIRT,Blocks.DIRT,Blocks.DIRT));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.DIRT, 8),"stonePhis",Blocks.COBBLESTONE,Blocks.COBBLESTONE,Blocks.COBBLESTONE,Blocks.COBBLESTONE,Blocks.COBBLESTONE,Blocks.COBBLESTONE,Blocks.COBBLESTONE,Blocks.COBBLESTONE));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.COBBLESTONE, 8),"stonePhis",Blocks.SAND,Blocks.SAND,Blocks.SAND,Blocks.SAND,Blocks.SAND,Blocks.SAND,Blocks.SAND,Blocks.SAND));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.GRAVEL, 1),"stonePhis",Blocks.DIRT,Blocks.DIRT,Blocks.DIRT,Blocks.DIRT));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.GRAVEL, 1),"stonePhis",Blocks.SAND,Blocks.SAND,Blocks.SAND,Blocks.SAND));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.GRAVEL, 1),"stonePhis",Blocks.COBBLESTONE,Blocks.COBBLESTONE,Blocks.COBBLESTONE,Blocks.COBBLESTONE));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.GRAVEL, 8),"stonePhis",Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.SANDSTONE, 8),"stonePhis",Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.SAND, 24),"stonePhis",Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE,Blocks.SANDSTONE));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.DIRT, 24),"stonePhis",Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL,Blocks.GRAVEL));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.REDSTONE, 8),"stonePhis",new ItemStack(Items.COAL,1,1),new ItemStack(Items.COAL,1,1),new ItemStack(Items.COAL,1,1),new ItemStack(Items.COAL,1,1),new ItemStack(Items.COAL,1,1),new ItemStack(Items.COAL,1,1),new ItemStack(Items.COAL,1,1),new ItemStack(Items.COAL,1,1)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.REDSTONE, 8),"stonePhis",Items.COAL,Items.COAL,Items.COAL,Items.COAL));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GLOWSTONE_DUST, 1),"stonePhis",Items.REDSTONE,Items.REDSTONE,Items.REDSTONE,Items.REDSTONE,Items.REDSTONE,Items.REDSTONE,Items.REDSTONE,Items.REDSTONE));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.REDSTONE, 8),"stonePhis",Items.GLOWSTONE_DUST));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GLOWSTONE_DUST, 1),"stonePhis",new ItemStack(Items.DYE, 1, 4),new ItemStack(Items.DYE, 1, 4),new ItemStack(Items.DYE, 1, 4),new ItemStack(Items.DYE, 1, 4)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.DYE, 8, 4),"stonePhis",Items.GLOWSTONE_DUST,Items.GLOWSTONE_DUST));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GUNPOWDER, 6),"stonePhis",Items.GLOWSTONE_DUST,Items.GLOWSTONE_DUST,Items.GLOWSTONE_DUST));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GLOWSTONE_DUST, 1),"stonePhis",Items.GUNPOWDER,Items.GUNPOWDER));


        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.DIAMOND, 1),"stonePhis","ingotGold","ingotGold","ingotGold","ingotGold"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GOLD_INGOT, 4),"stonePhis","gemDiamond"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.IRON_INGOT, 8), "stonePhis","ingotGold"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GOLD_INGOT, 1), "stonePhis","ingotIron","ingotIron","ingotIron","ingotIron","ingotIron","ingotIron","ingotIron","ingotIron"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.LEATHER, 1),"stonePhis",Items.ROTTEN_FLESH,Items.ROTTEN_FLESH,Items.ROTTEN_FLESH));



        //moddedexchange
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.IRON_INGOT, 2), "stonePhis","ingotCopper","ingotCopper","ingotCopper","ingotCopper"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.IRON_INGOT, 2), "stonePhis","ingotAluminum","ingotAluminum","ingotAluminum","ingotAluminum"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.IRON_INGOT, 4), "stonePhis","ingotTin","ingotTin","ingotTin","ingotTin"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GOLD_INGOT, 1), "stonePhis","ingotSilver","ingotSilver","ingotSilver","ingotSilver"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GOLD_INGOT, 1), "stonePhis","ingotLead","ingotLead","ingotLead","ingotLead"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.GOLD_INGOT, 2), "stonePhis","ingotNickel","ingotNickel","ingotNickel","ingotNickel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.DIAMOND, 1), "stonePhis","ingotPlatinum","ingotPlatinum"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.DIAMOND, 1), "stonePhis","ingotUranium","ingotUranium"));



        //tin-copper-
        if (Loader.isModLoaded("thermalfoundation"))
        {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("thermalfoundation:material"),2,132),"stonePhis","ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("thermalfoundation:material"),4,128),"stonePhis","ingotIron","ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("thermalfoundation:material"),3,129),"stonePhis","ingotIron","ingotIron","ingotIron"));

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("thermalfoundation:material"),8,131),"stonePhis","ingotGold","ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("thermalfoundation:material"),12,130),"stonePhis","ingotGold","ingotGold","ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("thermalfoundation:material"),10,133),"stonePhis","ingotGold","ingotGold","ingotGold","ingotGold","ingotGold"));

         } else

        if (Loader.isModLoaded("immersiveengineering"))
        {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("immersiveengineering:metal"),2,1),"stonePhis","ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("immersiveengineering:metal"),4,0),"stonePhis","ingotIron","ingotIron"));

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("immersiveengineering:metal"),8,2),"stonePhis","ingotGold","ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("immersiveengineering:metal"),12,3),"stonePhis","ingotGold","ingotGold","ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("immersiveengineering:metal"),10,4),"stonePhis","ingotGold","ingotGold","ingotGold","ingotGold","ingotGold"));
           //lackoftin
            if (Loader.isModLoaded("Mekanism")) {
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("mekanism:Ingot"),3,6),"stonePhis","ingotIron","ingotIron","ingotIron"));
            } else if (Loader.isModLoaded("ic2"))
            {             GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("ic2:ingot"),3,6),"stonePhis","ingotIron","ingotIron","ingotIron"));
            }

         } else

        if (Loader.isModLoaded("ic2"))
        {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("ic2:ingot"),4,2),"stonePhis","ingotIron","ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("ic2:ingot"),3,6),"stonePhis","ingotIron","ingotIron","ingotIron"));

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("ic2:ingot"),8,3),"stonePhis","ingotGold","ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("ic2:ingot"),12,4),"stonePhis","ingotGold","ingotGold","ingotGold"));

         } else

        if (Loader.isModLoaded("embers"))
        {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("embers:ingotCopper"),4),"stonePhis","ingotIron","ingotIron"));
            if (Loader.isModLoaded("Mekanism")) {
                GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("mekanism:Ingot"),3,6),"stonePhis","ingotIron","ingotIron","ingotIron"));

            }
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("embers:ingotLead"),8),"stonePhis","ingotGold","ingotGold"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("embers:ingotSilver"),12),"stonePhis","ingotGold","ingotGold","ingotGold"));

         } else
        if (Loader.isModLoaded("Mekanism")) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("mekanism:Ingot"),4,5),"stonePhis","ingotIron","ingotIron"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("mekanism:Ingot"),3,6),"stonePhis","ingotIron","ingotIron","ingotIron"));

        }







         //osmium
        if (Loader.isModLoaded("Mekanism")) {

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Item.getByNameOrId("mekanism:Ingot"),5,1),"stonePhis","ingotIron","ingotIron","ingotIron","ingotIron","ingotIron"));

        }











    }


}

