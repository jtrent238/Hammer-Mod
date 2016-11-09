package com.jtrent238.hammermod;

import com.jtrent238.hammermod.items.hammers.ItemCopperHammer;
import com.jtrent238.hammermod.items.hammers.ItemDiamondHammer;
import com.jtrent238.hammermod.items.hammers.ItemGoldHammer;
import com.jtrent238.hammermod.items.hammers.ItemIronHammer;
import com.jtrent238.hammermod.items.hammers.ItemStoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemWoodHammer;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemLoader {

	/*
	 * Basic Minecraft Hammers (Ex. Vannila Ores)
	 */
	public static Item ItemBaseHammer;
	public static Item ItemWoodHammer;
	public static Item ItemStoneHammer;
	public static Item ItemIronHammer;
	public static Item ItemGoldHammer;
	public static Item ItemDiamondHammer;
	
	/*
	 * Hammers Using Ores from other mods
	 */
	public static Item ItemCopperHammer;
	
	/**
	 * Load Items.
	 */
	public static void LoadItems() {
		
		/*
		 * Basic Minecraft Hammers (Ex. Vannila Ores)
		 */
	
		ItemWoodHammer = new ItemWoodHammer(1, ToolMaterial.WOOD, 1000).setUnlocalizedName("ItemWoodHammer").setTextureName("hammermod:ItemWoodHammer").setCreativeTab(HammerMod.HammerMod);
		ItemStoneHammer = new ItemStoneHammer(5, ToolMaterial.STONE, 1500).setUnlocalizedName("ItemStoneHammer").setTextureName("hammermod:ItemStoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemIronHammer = new ItemIronHammer(8, ToolMaterial.IRON, 1800).setUnlocalizedName("ItemIronHammer").setTextureName("hammermod:ItemIronHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGoldHammer = new ItemGoldHammer(20, ToolMaterial.GOLD, 100).setUnlocalizedName("ItemGoldHammer").setTextureName("hammermod:ItemGoldHammer").setCreativeTab(HammerMod.HammerMod);
		ItemDiamondHammer = new ItemDiamondHammer(13, ToolMaterial.EMERALD, 2000).setUnlocalizedName("ItemDiamondHammer").setTextureName("hammermod:ItemDiamondHammer").setCreativeTab(HammerMod.HammerMod);
		
		/*
		 * Hammers Using Ores from other mods
		 */
		ItemCopperHammer = new ItemCopperHammer(13, ToolMaterial.EMERALD, 2000).setUnlocalizedName("ItemCopperHammer").setTextureName("hammermod:ItemCopperHammer").setCreativeTab(HammerMod.HammerMod);
		
		registerItems();
	}

	/**
	 * Register Items.
	 */
	private static void registerItems(){
		
		/*
		 * Basic Minecraft Hammers (Ex. Vannila Ores)
		 */
		GameRegistry.registerItem(ItemWoodHammer, ItemWoodHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemStoneHammer, ItemStoneHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemIronHammer, ItemIronHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGoldHammer, ItemGoldHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemDiamondHammer, ItemDiamondHammer.getUnlocalizedName().substring(5));
		
		/*
		 * Hammers Using Ores from other mods
		 */
		GameRegistry.registerItem(ItemCopperHammer, ItemCopperHammer.getUnlocalizedName().substring(5));
		
	}
}
