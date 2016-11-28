package com.jtrent238.hammermod;

import com.jtrent238.hammermod.items.hammers.ItemBronzeHammer;
import com.jtrent238.hammermod.items.hammers.ItemCactusHammer;
import com.jtrent238.hammermod.items.hammers.ItemCopperHammer;
import com.jtrent238.hammermod.items.hammers.ItemCreeperHammer;
import com.jtrent238.hammermod.items.hammers.ItemDiamondHammer;
import com.jtrent238.hammermod.items.hammers.ItemDirtHammer;
import com.jtrent238.hammermod.items.hammers.ItemGlassHammer;
import com.jtrent238.hammermod.items.hammers.ItemGoldHammer;
import com.jtrent238.hammermod.items.hammers.ItemGravelHammer;
import com.jtrent238.hammermod.items.hammers.ItemIronHammer;
import com.jtrent238.hammermod.items.hammers.ItemItemEmeraldHammer;
import com.jtrent238.hammermod.items.hammers.ItemPigHammer;
import com.jtrent238.hammermod.items.hammers.ItemRubyHammer;
import com.jtrent238.hammermod.items.hammers.ItemSandHammer;
import com.jtrent238.hammermod.items.hammers.ItemSilverHammer;
import com.jtrent238.hammermod.items.hammers.ItemStoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemTinHammer;
import com.jtrent238.hammermod.items.hammers.ItemTungstenHammer;
import com.jtrent238.hammermod.items.hammers.ItemWoodHammer;
import com.jtrent238.hammermod.items.hammers.ItemWoolHammer;
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
	public static Item ItemCactusHammer;
	public static Item ItemGravelHammer;
	public static Item ItemWoolHammer_white;
	public static Item ItemEmeraldHammer;
	
	
	/*
	 * Mob Hammers
	 */
	public static Item ItemCreeperHammer;
	public static Item ItemPigHammer;
	
	
	/*
	 * Hammers Using Ores from other mods
	 * **NOTE: REQUIRES Other mods to craft these hammers**
	 */
	public static Item ItemCopperHammer;
	public static Item ItemBronzeHammer;
	public static Item ItemTungstenHammer;
	public static Item ItemRubyHammer;
	public static Item ItemTinHammer;
	public static Item ItemSilverHammer;
	
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
		ItemCactusHammer = new ItemCactusHammer(ToolMaterial.WOOD).setUnlocalizedName("ItemCactusHammer").setTextureName("hammermod:ItemCactusHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGravelHammer = new ItemGravelHammer(ToolMaterial.WOOD).setUnlocalizedName("ItemGravelHammer").setTextureName("hammermod:ItemGravelHammer").setCreativeTab(HammerMod.HammerMod);
		ItemWoolHammer_white = new ItemWoolHammer(ToolMaterial.WOOD).setUnlocalizedName("ItemWoolHammer_white").setTextureName("hammermod:ItemWoolHammer_white").setCreativeTab(HammerMod.HammerMod);
		ItemEmeraldHammer = new ItemItemEmeraldHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemItemEmeraldHammer").setTextureName("hammermod:ItemEmeraldHammer").setCreativeTab(HammerMod.HammerMod);
		
		/*
		 * Mob Hammers
		 */
		ItemCreeperHammer = new ItemCreeperHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCreeperHammer").setTextureName("hammermod:ItemCreeperHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPigHammer = new ItemPigHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemPigHammer").setTextureName("hammermod:ItemPigHammer").setCreativeTab(HammerMod.HammerMod);
		
		/*
		 * Hammers Using Ores from other mods
		 * **NOTE: REQUIRES Other mods to craft these hammers**
		 */
		ItemCopperHammer = new ItemCopperHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCopperHammer").setTextureName("hammermod:ItemCopperHammer").setCreativeTab(HammerMod.HammerMod);
		ItemBronzeHammer = new ItemBronzeHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemBronzeHammer").setTextureName("hammermod:ItemBronzeHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSilverHammer = new ItemSilverHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemSilverHammer").setTextureName("hammermod:ItemSilverHammer").setCreativeTab(HammerMod.HammerMod);
		ItemTungstenHammer = new ItemTungstenHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemTungstenHammer").setTextureName("hammermod:ItemTungstenHammer").setCreativeTab(HammerMod.HammerMod);
		ItemRubyHammer = new ItemRubyHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemRubyHammer").setTextureName("hammermod:ItemRubyHammer").setCreativeTab(HammerMod.HammerMod);
		ItemTinHammer = new ItemTinHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemTinHammer").setTextureName("hammermod:ItemTinHammer").setCreativeTab(HammerMod.HammerMod);
		
		
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
		GameRegistry.registerItem(ItemCactusHammer, ItemCactusHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGravelHammer, ItemGravelHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemWoolHammer_white, ItemWoolHammer_white.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemEmeraldHammer, ItemEmeraldHammer.getUnlocalizedName().substring(5));
		
		/*
		 * Mob Hammers
		 */
		GameRegistry.registerItem(ItemCreeperHammer, ItemCreeperHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPigHammer, ItemPigHammer.getUnlocalizedName().substring(5));
		
		/*
		 * Hammers Using Ores from other mods
		 * **NOTE: REQUIRES Other mods to craft these hammers**
		 */
		GameRegistry.registerItem(ItemCopperHammer, ItemCopperHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBronzeHammer, ItemBronzeHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSilverHammer, ItemSilverHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemTungstenHammer, ItemTungstenHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRubyHammer, ItemRubyHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemTinHammer, ItemTinHammer.getUnlocalizedName().substring(5));
		
	}
}
