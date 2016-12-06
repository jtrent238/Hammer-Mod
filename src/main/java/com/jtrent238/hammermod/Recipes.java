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
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGrassHammer), "XXX", "XSX", "BSB", 'X', Blocks.grass, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemObsidianHammer), "XXX", "XSX", "BSB", 'X', Blocks.obsidian, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemGlowstoneHammer), "XXX", "XSX", "BSB", 'X', Blocks.glowstone, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemRedstoneHammer), "XXX", "XSX", "BSB", 'X', Items.redstone, 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemLapizHammer), "XXX", "XSX", "BSB", 'X', Items.dye , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemNetherackHammer), "XXX", "XSX", "BSB", 'X', Blocks.netherrack , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSoulSandHammer), "XXX", "XSX", "BSB", 'X', Blocks.soul_sand , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCoalHammer), "XXX", "XSX", "BSB", 'X', Items.coal , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCharcoalHammer), "XXX", "XSX", "BSB", 'X', Items.coal , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemEndstoneHammer), "XXX", "XSX", "BSB", 'X', Blocks.end_stone , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBoneHammer), "XXX", "XSX", "BSB", 'X', Items.bone , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSpongeHammer), "XXX", "XSX", "BSB", 'X', Blocks.sponge , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBrickHammer), "XXX", "XSX", "BSB", 'X', Blocks.brick , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSugarHammer), "XXX", "XSX", "BSB", 'X', Items.sugar , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemSlimeHammer), "XXX", "XSX", "BSB", 'X', Items.slime_ball , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemMelonHammer), "XXX", "XSX", "BSB", 'X', Items.melon , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemPumpkinHammer), "XXX", "XSX", "BSB", 'X', Blocks.Pumpkin , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemPotatoHammer), "XXX", "XSX", "BSB", 'X', Items.potato , 'S' , Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemCarrotHammer), "XXX", "XSX", "BSB", 'X', Items.carrot , 'S' , Items.stick);
		
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
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemJadeHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotJade"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemJadeHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "gemJade"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemAmethystHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotAmethest"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemAmethystHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "gemAmethest"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemGraphiteHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotGraphite"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemCitrineHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotCitrine"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemPierreHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotPierre"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemSapphireHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotSapphire"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemSapphireHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "gemSapphire"}, 'S', Items.stick));
    	GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemOnyxHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotOnyx"}, 'S', Items.stick));
    	GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemNikoliteHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotNikolite"}, 'S', Items.stick));
    	GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemSilicaHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotSilica"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemPatHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotPat"}, 'S', Items.stick));
		GameRegistry.addRecipe((IRecipe) new ShapedOreRecipe(ItemLoader.ItemJenHammer, true, new Object[]{"FFF", "FSF", "BSB", Character.valueOf('F'), "ingotJen"}, 'S', Items.stick));
    }
	
	
	}

	
	
	
