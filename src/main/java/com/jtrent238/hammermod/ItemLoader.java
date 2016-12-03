package com.jtrent238.hammermod;

import com.jtrent238.hammermod.items.hammers.ItemAmethystHammer;
import com.jtrent238.hammermod.items.hammers.ItemBoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemBronzeHammer;
import com.jtrent238.hammermod.items.hammers.ItemCactusHammer;
import com.jtrent238.hammermod.items.hammers.ItemCharcoalHammer;
import com.jtrent238.hammermod.items.hammers.ItemCitrineHammer;
import com.jtrent238.hammermod.items.hammers.ItemCoalHammer;
import com.jtrent238.hammermod.items.hammers.ItemCopperHammer;
import com.jtrent238.hammermod.items.hammers.ItemCreeperHammer;
import com.jtrent238.hammermod.items.hammers.ItemDiamondHammer;
import com.jtrent238.hammermod.items.hammers.ItemDirtHammer;
import com.jtrent238.hammermod.items.hammers.ItemGlassHammer;
import com.jtrent238.hammermod.items.hammers.ItemGlowstoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemGoldHammer;
import com.jtrent238.hammermod.items.hammers.ItemGraphiteHammer;
import com.jtrent238.hammermod.items.hammers.ItemGrassHammer;
import com.jtrent238.hammermod.items.hammers.ItemGravelHammer;
import com.jtrent238.hammermod.items.hammers.ItemIronHammer;
import com.jtrent238.hammermod.items.hammers.ItemJadeHammer;
import com.jtrent238.hammermod.items.hammers.ItemLapizHammer;
import com.jtrent238.hammermod.items.hammers.ItemNetherackHammer;
import com.jtrent238.hammermod.items.hammers.ItemNikoliteHammer;
import com.jtrent238.hammermod.items.hammers.ItemObsidianHammer;
import com.jtrent238.hammermod.items.hammers.ItemOnyxHammer;
import com.jtrent238.hammermod.items.hammers.ItemPierreHammer;
import com.jtrent238.hammermod.items.hammers.ItemEmeraldHammer;
import com.jtrent238.hammermod.items.hammers.ItemEndstoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemPigHammer;
import com.jtrent238.hammermod.items.hammers.ItemRedstoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemRubyHammer;
import com.jtrent238.hammermod.items.hammers.ItemSandHammer;
import com.jtrent238.hammermod.items.hammers.ItemSapphireHammer;
import com.jtrent238.hammermod.items.hammers.ItemSilicaHammer;
import com.jtrent238.hammermod.items.hammers.ItemSilverHammer;
import com.jtrent238.hammermod.items.hammers.ItemSoulSandHammer;
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
	public static Item ItemGrassHammer;
	public static Item ItemObsidianHammer;
	public static Item ItemGlowstoneHammer;
	public static Item ItemRedstoneHammer;
	public static Item ItemLapizHammer;
	public static Item ItemNetherackHammer;
	public static Item ItemSoulSandHammer;
	public static Item ItemCoalHammer;
	public static Item ItemCharcoalHammer;
	public static Item ItemEndstoneHammer;
	public static Item ItemBoneHammer;
	
	
	
	
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
	public static Item ItemJadeHammer;
	public static Item ItemAmethystHammer;
	public static Item ItemGraphiteHammer;
	public static Item ItemCitrineHammer;
	public static Item ItemPierreHammer;
	public static Item ItemSapphireHammer;
	public static Item ItemOnyxHammer;
	public static Item ItemNikoliteHammer;
	public static Item ItemSilicaHammer;
	
	
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
		ItemEmeraldHammer = new ItemEmeraldHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemEmeraldHammer").setTextureName("hammermod:ItemEmeraldHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGrassHammer = new ItemGrassHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemGrassHammer").setTextureName("hammermod:ItemGrassHammer").setCreativeTab(HammerMod.HammerMod);
		ItemObsidianHammer = new ItemObsidianHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemObsidianHammer").setTextureName("hammermod:ItemObsidianHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGlowstoneHammer = new ItemGlowstoneHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemGlowstoneHammer").setTextureName("hammermod:ItemGlowstoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemRedstoneHammer = new ItemRedstoneHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemRedstoneHammer").setTextureName("hammermod:ItemRedstoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemLapizHammer = new ItemLapizHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemLapizHammer").setTextureName("hammermod:ItemLapisHammer").setCreativeTab(HammerMod.HammerMod);
		ItemNetherackHammer = new ItemNetherackHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemNetherackHammer").setTextureName("hammermod:ItemNetherackHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSoulSandHammer = new ItemSoulSandHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemSoulSandHammer").setTextureName("hammermod:ItemSoulSandHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCoalHammer = new ItemCoalHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCoalHammer").setTextureName("hammermod:ItemCoalHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCharcoalHammer = new ItemCharcoalHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCharcoalHammer").setTextureName("hammermod:ItemCharcoalHammer").setCreativeTab(HammerMod.HammerMod);
		ItemEndstoneHammer = new ItemEndstoneHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemEndstoneHammer").setTextureName("hammermod:ItemEndstoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemBoneHammer = new ItemBoneHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemBoneHammer").setTextureName("hammermod:ItemBoneHammer").setCreativeTab(HammerMod.HammerMod);
		
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
		ItemJadeHammer = new ItemJadeHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemJadeHammer").setTextureName("hammermod:ItemJadeHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAmethystHammer = new ItemAmethystHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAmethystHammer").setTextureName("hammermod:ItemAmethystHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGraphiteHammer = new ItemGraphiteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemGraphiteHammer").setTextureName("hammermod:ItemGraphiteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCitrineHammer = new ItemCitrineHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCitrineHammer").setTextureName("hammermod:ItemCitrineHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPierreHammer = new ItemPierreHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemPierreHammer").setTextureName("hammermod:ItemPierreHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSapphireHammer = new ItemSapphireHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemSapphireHammer").setTextureName("hammermod:ItemSapphireHammer").setCreativeTab(HammerMod.HammerMod);
		ItemOnyxHammer = new ItemOnyxHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemOnyxHammer").setTextureName("hammermod:ItemOnyxHammer").setCreativeTab(HammerMod.HammerMod);
		ItemNikoliteHammer = new ItemNikoliteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemNikoliteHammer").setTextureName("hammermod:ItemNikoliteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSilicaHammer = new ItemSilicaHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemSilicaHammer").setTextureName("hammermod:ItemSilicaHammer").setCreativeTab(HammerMod.HammerMod);
		
		
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
		GameRegistry.registerItem(ItemGrassHammer, ItemGrassHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemObsidianHammer, ItemObsidianHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGlowstoneHammer, ItemGlowstoneHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemRedstoneHammer, ItemRedstoneHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemLapizHammer, ItemLapizHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemNetherackHammer, ItemNetherackHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSoulSandHammer, ItemSoulSandHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCoalHammer, ItemCoalHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCharcoalHammer, ItemCharcoalHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemEndstoneHammer, ItemEndstoneHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBoneHammer, ItemBoneHammer.getUnlocalizedName().substring(5));
		
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
		GameRegistry.registerItem(ItemJadeHammer, ItemJadeHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemAmethystHammer, ItemAmethystHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemGraphiteHammer, ItemGraphiteHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCitrineHammer, ItemCitrineHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPierreHammer, ItemPierreHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSapphireHammer, ItemSapphireHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemOnyxHammer, ItemOnyxHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemNikoliteHammer, ItemNikoliteHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSilicaHammer, ItemSilicaHammer.getUnlocalizedName().substring(5));
		
	}
}
