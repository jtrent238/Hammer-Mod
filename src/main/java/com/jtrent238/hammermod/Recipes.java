package com.jtrent238.hammermod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes {

	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemWoodHammer), "XXX", "XSX", "BSB", 'X',Blocks.planks, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemStoneHammer), "XXX", "XSX", "BSB", 'X', Blocks.cobblestone, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemIronHammer), "XXX", "XSX", "BSB", 'X', Items.iron_ingot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGoldHammer), "XXX", "XSX", "BSB", 'X', Items.gold_ingot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDiamondHammer), "XXX", "XSX", "BSB", 'X', Items.diamond, 'S' , Items.stick);

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
		//GameRegistry.addSmelting(BlockLoader.blockPatOre, new ItemStack (ItemLoader.itemPatIngot, 1), 2F );
			   }
	
	
	}

	
	
	
