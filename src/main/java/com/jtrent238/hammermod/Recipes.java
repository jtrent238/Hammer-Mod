package com.jtrent238.hammermod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

	
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
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemWoodHammer), "XXX", "XSX", "BSB", 'X',Blocks.planks, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemStoneHammer), "XXX", "XSX", "BSB", 'X', Blocks.cobblestone, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemIronHammer), "XXX", "XSX", "BSB", 'X', Items.iron_ingot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGoldHammer), "XXX", "XSX", "BSB", 'X', Items.gold_ingot, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDiamondHammer), "XXX", "XSX", "BSB", 'X', Items.diamond, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemDirtHammer), "XXX", "XSX", "BSB", 'X', Blocks.dirt, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGlassHammer), "XXX", "XSX", "BSB", 'X', Blocks.glass, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSandHammer), "XXX", "XSX", "BSB", 'X', Blocks.sand, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCactusHammer), "XXX", "XSX", "BSB", 'X', Blocks.cactus, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGravelHammer), "XXX", "XSX", "BSB", 'X', Blocks.gravel, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemWoolHammer_white), "XXX", "XSX", "BSB", 'X', Blocks.wool, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemEmeraldHammer), "XXX", "XSX", "BSB", 'X', Items.emerald, 'S' , Items.stick);
		
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
		GameRegistry.addSmelting(ItemLoader.ItemSandHammer, new ItemStack (ItemLoader.ItemGlassHammer, 1), 2F );
			   }
	
	public static void addOreRecipes()
    {
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemCopperHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotCopper"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemBronzeHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotBronze"}, 'S', Items.stick));
	    GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemSilverHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotSilver"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemTungstenHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotTungsten"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemRubyHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotRuby"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemRubyHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "gemRuby"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemTinHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotTin"}, 'S', Items.stick));
    }
	
	
	}

	
	
	
