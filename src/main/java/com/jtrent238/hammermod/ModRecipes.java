package com.jtrent238.hammermod;

import com.jtrent238.hammermod.util.RecipeHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {


	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
		addOreRecipes();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){

	}

	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
		GameRegistry.addSmelting(ModItems.hammerSand, new ItemStack (ModItems.hammerGlass, 1), 2F );
			   }
	
	public static void addOreRecipes()
    {
		RecipeHandler.addShapedOreRecipe(new ItemStack(ModItems.hammerCopper), "XXX", "XSX", "BSB", 'X', OreDictionary.getOres("ingotCopper") , 'S' , Items.STICK);
    }
	
}
