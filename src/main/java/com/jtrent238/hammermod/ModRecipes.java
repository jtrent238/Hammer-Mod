package com.jtrent238.hammermod;

import com.jtrent238.hammermod.util.RecipeHandler;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRecipes
{
    public static void registerRecpies() {
        addShaplessRecpies();
        addShapedRecpies();
        addsmeltigrecipies();
        addOreRecipes();
    }
    
    private static void addShapedRecpies() {
    }
    
    private static void addShaplessRecpies() {
    }
    
    private static void addsmeltigrecipies() {
        /*SL:43*/GameRegistry.addSmelting((Item)ModItems.hammerSand, new ItemStack((Item)ModItems.hammerGlass, 1), 2.0f);
    }
    
    public static void addOreRecipes() {
        /*SL:48*/RecipeHandler.addShapedOreRecipe(new ItemStack((Item)ModItems.hammerCopper), "XXX", "XSX", "BSB", 'X', OreDictionary.getOres("ingotCopper"), 'S', Items.field_151055_y);
    }
}
