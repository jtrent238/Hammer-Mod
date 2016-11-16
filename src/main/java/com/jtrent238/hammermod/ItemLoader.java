package com.jtrent238.hammermod;

import com.jtrent238.hammermod.items.hammers.ItemBronzeHammer;
import com.jtrent238.hammermod.items.hammers.ItemCopperHammer;
import com.jtrent238.hammermod.items.hammers.ItemCreeperHammer;
import com.jtrent238.hammermod.items.hammers.ItemDiamondHammer;
import com.jtrent238.hammermod.items.hammers.ItemDirtHammer;
import com.jtrent238.hammermod.items.hammers.ItemGlassHammer;
import com.jtrent238.hammermod.items.hammers.ItemGoldHammer;
import com.jtrent238.hammermod.items.hammers.ItemIronHammer;
import com.jtrent238.hammermod.items.hammers.ItemPigHammer;
import com.jtrent238.hammermod.items.hammers.ItemSandHammer;
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
	public static Item ItemDirtHammer;
	public static Item ItemGlassHammer;
	public static Item ItemSandHammer;
	
	
	/*
	 * Mob Hammers
	 */
	public static Item ItemCreeperHammer;
	public static Item ItemPigHammer;
	
	
	/*
	 * Hammers Using Ores from other mods
	 */
	public static Item ItemCopperHammer;
	public static Item ItemBronzeHammer;
	
	/**
	 * Load Items.
	 */
	public static void LoadItems() {
		
		/*
		 * Basic Minecraft Hammers (Ex. Vannila Ores)
		 */
	
		ItemWoodHammer = new ItemWoodHammer(ToolMaterial.WOOD).setUnlocalizedName("ItemWoodHammer").setTextureName("hammermod:ItemWoodHammer").setCreativeTab(HammerMod.HammerMod);
		ItemStoneHammer = new ItemStoneHammer(ToolMaterial.STONE).setUnlocalizedName("ItemStoneHammer").setTextureName("hammermod:ItemStoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemIronHammer = new ItemIronHammer(ToolMaterial.IRON).setUnlocalizedName("ItemIronHammer").setTextureName("hammermod:ItemIronHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGoldHammer = new ItemGoldHammer(ToolMaterial.GOLD).setUnlocalizedName("ItemGoldHammer").setTextureName("hammermod:ItemGoldHammer").setCreativeTab(HammerMod.HammerMod);
		ItemDiamondHammer = new ItemDiamondHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemDiamondHammer").setTextureName("hammermod:ItemDiamondHammer").setCreativeTab(HammerMod.HammerMod);
		ItemDirtHammer = new ItemDirtHammer(ToolMaterial.WOOD).setUnlocalizedName("ItemDirtHammer").setTextureName("hammermod:ItemDirtHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGlassHammer = new ItemGlassHammer(ToolMaterial.WOOD).setUnlocalizedName("ItemGlassHammer").setTextureName("hammermod:ItemGlassHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSandHammer = new ItemSandHammer(ToolMaterial.WOOD).setUnlocalizedName("ItemSandHammer").setTextureName("hammermod:ItemSandHammer").setCreativeTab(HammerMod.HammerMod);
		
		/*
		 * Mob Hammers
		 */
		ItemCreeperHammer = new ItemCreeperHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCreeperHammer").setTextureName("hammermod:ItemCreeperHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPigHammer = new ItemPigHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemPigHammer").setTextureName("hammermod:ItemPigHammer").setCreativeTab(HammerMod.HammerMod);
		
		/*
		 * Hammers Using Ores from other mods
		 */
		ItemCopperHammer = new ItemCopperHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCopperHammer").setTextureName("hammermod:ItemCopperHammer").setCreativeTab(HammerMod.HammerMod);
		ItemBronzeHammer = new ItemBronzeHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemBronzeHammer").setTextureName("hammermod:ItemBronzeHammer").setCreativeTab(HammerMod.HammerMod);
		
		
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
		GameRegistry.registerItem(ItemDirtHammer, ItemDirtHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGlassHammer, ItemGlassHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSandHammer, ItemSandHammer.getUnlocalizedName().substring(5));
		
		/*
		 * Mob Hammers
		 */
		GameRegistry.registerItem(ItemCreeperHammer, ItemCreeperHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPigHammer, ItemPigHammer.getUnlocalizedName().substring(5));
		
		/*
		 * Hammers Using Ores from other mods
		 */
		GameRegistry.registerItem(ItemCopperHammer, ItemCopperHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBronzeHammer, ItemBronzeHammer.getUnlocalizedName().substring(5));
		
	}
}
