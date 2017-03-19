package com.jtrent238.hammermod;

import com.jtrent238.hammermod.items.hammers.ItemAdaminiteHammer;
import com.jtrent238.hammermod.items.hammers.ItemAmberBearingStoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemAmethystHammer;
import com.jtrent238.hammermod.items.hammers.ItemAppleHammer;
import com.jtrent238.hammermod.items.hammers.ItemBoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemBrickHammer;
import com.jtrent238.hammermod.items.hammers.ItemBronzeHammer;
import com.jtrent238.hammermod.items.hammers.ItemCactusHammer;
import com.jtrent238.hammermod.items.hammers.ItemCakeHammer;
import com.jtrent238.hammermod.items.hammers.ItemCarrotHammer;
import com.jtrent238.hammermod.items.hammers.ItemCharcoalHammer;
import com.jtrent238.hammermod.items.hammers.ItemCinnabarHammer;
import com.jtrent238.hammermod.items.hammers.ItemCitrineHammer;
import com.jtrent238.hammermod.items.hammers.ItemCoalHammer;
import com.jtrent238.hammermod.items.hammers.ItemCopperHammer;
import com.jtrent238.hammermod.items.hammers.ItemCreeperHammer;
import com.jtrent238.hammermod.items.hammers.ItemDanTDMHammer;
import com.jtrent238.hammermod.items.hammers.ItemDiamondHammer;
import com.jtrent238.hammermod.items.hammers.ItemDirtHammer;
import com.jtrent238.hammermod.items.hammers.ItemGlassHammer;
import com.jtrent238.hammermod.items.hammers.ItemGlowstoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemGoldHammer;
import com.jtrent238.hammermod.items.hammers.ItemGraphiteHammer;
import com.jtrent238.hammermod.items.hammers.ItemGrassHammer;
import com.jtrent238.hammermod.items.hammers.ItemGravelHammer;
import com.jtrent238.hammermod.items.hammers.ItemIceHammer;
import com.jtrent238.hammermod.items.hammers.ItemIronHammer;
import com.jtrent238.hammermod.items.hammers.ItemJadeHammer;
import com.jtrent238.hammermod.items.hammers.ItemJenHammer;
import com.jtrent238.hammermod.items.hammers.ItemLapizHammer;
import com.jtrent238.hammermod.items.hammers.ItemMelonHammer;
import com.jtrent238.hammermod.items.hammers.ItemNetherackHammer;
import com.jtrent238.hammermod.items.hammers.ItemNikoliteHammer;
import com.jtrent238.hammermod.items.hammers.ItemObsidianHammer;
import com.jtrent238.hammermod.items.hammers.ItemOnyxHammer;
import com.jtrent238.hammermod.items.hammers.ItemPackedIceHammer;
import com.jtrent238.hammermod.items.hammers.ItemPatHammer;
import com.jtrent238.hammermod.items.hammers.ItemPierreHammer;
import com.jtrent238.hammermod.items.hammers.ItemEmeraldHammer;
import com.jtrent238.hammermod.items.hammers.ItemEndstoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemFerrousHammer;
import com.jtrent238.hammermod.items.hammers.ItemPigHammer;
import com.jtrent238.hammermod.items.hammers.ItemPotatoHammer;
import com.jtrent238.hammermod.items.hammers.ItemPumpkinHammer;
import com.jtrent238.hammermod.items.hammers.ItemRedstoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemRubyHammer;
import com.jtrent238.hammermod.items.hammers.ItemSandHammer;
import com.jtrent238.hammermod.items.hammers.ItemSapphireHammer;
import com.jtrent238.hammermod.items.hammers.ItemShinyHammer;
import com.jtrent238.hammermod.items.hammers.ItemSilicaHammer;
import com.jtrent238.hammermod.items.hammers.ItemSilverHammer;
import com.jtrent238.hammermod.items.hammers.ItemSkyTheKidRSHammer;
import com.jtrent238.hammermod.items.hammers.ItemSlimeHammer;
import com.jtrent238.hammermod.items.hammers.ItemSnowHammer;
import com.jtrent238.hammermod.items.hammers.ItemSoulSandHammer;
import com.jtrent238.hammermod.items.hammers.ItemSpongeHammer;
import com.jtrent238.hammermod.items.hammers.ItemStoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemSugarHammer;
import com.jtrent238.hammermod.items.hammers.ItemThackAttack_MCHammer;
import com.jtrent238.hammermod.items.hammers.ItemTinHammer;
import com.jtrent238.hammermod.items.hammers.ItemTungstenHammer;
import com.jtrent238.hammermod.items.hammers.ItemWoodHammer;
import com.jtrent238.hammermod.items.hammers.ItemWoolHammer;
import com.jtrent238.hammermod.items.hammers.ItemXychoriumHammer;
import com.jtrent238.hammermod.items.hammers.ItemxJSQHammer;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

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
	public static Item ItemSpongeHammer;
	public static Item ItemBrickHammer;
	public static Item ItemSugarHammer;
	public static Item ItemSlimeHammer;
	public static Item ItemMelonHammer;
	public static Item ItemPumpkinHammer;
	public static Item ItemPotatoHammer;
	public static Item ItemCarrotHammer;
	public static Item ItemAppleHammer;
	public static Item ItemIceHammer;
	public static Item ItemPackedIceHammer;
	public static Item ItemSnowHammer;
	public static Item ItemCakeHammer;
	
	
	
	
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
	public static Item ItemCinnabarHammer;
	public static Item ItemAmberBearingStoneHammer;
	public static Item ItemFerrousHammer;
	public static Item ItemAdaminiteHammer;
	public static Item ItemShinyHammer;
	public static Item ItemXychoriumHammer;
	
	/*
	 * Hammers For YouTubers
	 */
	public static Item ItemPatHammer;
	public static Item ItemJenHammer;
	public static Item ItemDanTDMHammer;
	public static Item ItemxJSQHammer;
	public static Item ItemSkyTheKidRSHammer;
	public static Item ItemThackAttack_MCHammer;
	

	private static int emeraldMultiplier = 2;			//Emerald Multiplier (Diamond * Multiplier)
	private static int obsidianMultiplier = (int) 2.5;	//Obsidian Multiplier (Diamond * Multiplier)
	private static int eM = emeraldMultiplier;			//Emerald Multiplier (Diamond * Multiplier)
	private static int oM = obsidianMultiplier;			//Obsidian Multiplier (Diamond * Multiplier)
	private static int nsM = eM + oM * 2;				//Nether Star Multiplier (Diamond * Multiplier)
	private static int deM = nsM + eM + oM * 4;			//Dragon Egg Multiplier (Diamond * Multiplier)
	private static int YT = 10;							//YouTuber Multiplier
	
	
	//public static ToolMaterial MATERIAL_NAME = EnumHelper.addToolMaterial("MATERIAL_NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	public static ToolMaterial DIRT = EnumHelper.addToolMaterial("DIRT", 0, 10, 2, 0, 4);
	public static ToolMaterial GLASS = EnumHelper.addToolMaterial("GLASS", 0, 6, 50, 0, 1);
	public static ToolMaterial SAND = EnumHelper.addToolMaterial("SAND", 0, 6, 50, 0, 1);
	public static ToolMaterial CACTUS = EnumHelper.addToolMaterial("CACTUS", 1, 32, 50, 1, 2);
	public static ToolMaterial GRAVEL = EnumHelper.addToolMaterial("GRAVEL", 0, 6, 50, 0, 1);
	public static ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3 * eM, 1561 * eM, 8.0F * eM, 3.0F * eM, 10 * eM);
	public static ToolMaterial GRASS = EnumHelper.addToolMaterial("GRASS", 0, 100, 60, 0, 2);
	public static ToolMaterial WOOL = EnumHelper.addToolMaterial("WOOL", 0, 8, 50, 0, 1);
	public static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3 * oM , 1561 * oM, 8.0F * oM, 3.0F * oM, 10 * oM);
	public static ToolMaterial GLOWSTONE = EnumHelper.addToolMaterial("GLOWSTONE", 2, 84, 4.0F, 1.5F, 5);
	public static ToolMaterial REDSTONE = EnumHelper.addToolMaterial("REDSTONE", 1, 150, 3.0F, 4.0F, 16);
	public static ToolMaterial LAPIZ = EnumHelper.addToolMaterial("LAPIZ", 1, 125, 2.5F, 2.0F, 8);
	public static ToolMaterial NETHERACK = EnumHelper.addToolMaterial("NETHERACK", 1, 400, 5.0F, 2.0F, 8);
	public static ToolMaterial SOULSAND = EnumHelper.addToolMaterial("SOULSAND", 1, 60, 2.0F, 1.0F, 5);
	public static ToolMaterial COAL = EnumHelper.addToolMaterial("COAL", 1, 450, 2.0F, 1.0F, 4);
	
	// TO BE FILLED IN LATER
	public static ToolMaterial CHARCOAL = EnumHelper.addToolMaterial("CHARCOAL", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial ENDSTONE = EnumHelper.addToolMaterial("ENDSTONE", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial BONE = EnumHelper.addToolMaterial("BONE", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial SPONGE = EnumHelper.addToolMaterial("SPONGE", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial BRICK = EnumHelper.addToolMaterial("BRICK", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial SUGAR = EnumHelper.addToolMaterial("SUGAR", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial SLIME = EnumHelper.addToolMaterial("SLIME", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial MELON = EnumHelper.addToolMaterial("MELON", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial PUMPKIN = EnumHelper.addToolMaterial("PUMPKIN", 3, 1561, 8.0F, 3.0F, 10);
	
	
	public static ToolMaterial PAT = EnumHelper.addToolMaterial("PAT", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial JEN = EnumHelper.addToolMaterial("JEN", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial TDM = EnumHelper.addToolMaterial("TDM", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial JSQ = EnumHelper.addToolMaterial("JSQ", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial SKY = EnumHelper.addToolMaterial("SKY", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial TATTCKMC = EnumHelper.addToolMaterial("TATTCKMC", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	
	
	
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
		ItemDirtHammer = new ItemDirtHammer(DIRT).setUnlocalizedName("ItemDirtHammer").setTextureName("hammermod:ItemDirtHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGlassHammer = new ItemGlassHammer(GLASS).setUnlocalizedName("ItemGlassHammer").setTextureName("hammermod:ItemGlassHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSandHammer = new ItemSandHammer(SAND).setUnlocalizedName("ItemSandHammer").setTextureName("hammermod:ItemSandHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCactusHammer = new ItemCactusHammer(CACTUS).setUnlocalizedName("ItemCactusHammer").setTextureName("hammermod:ItemCactusHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGravelHammer = new ItemGravelHammer(GRAVEL).setUnlocalizedName("ItemGravelHammer").setTextureName("hammermod:ItemGravelHammer").setCreativeTab(HammerMod.HammerMod);
		ItemWoolHammer_white = new ItemWoolHammer(WOOL).setUnlocalizedName("ItemWoolHammer_white").setTextureName("hammermod:ItemWoolHammer_white").setCreativeTab(HammerMod.HammerMod);
		ItemEmeraldHammer = new ItemEmeraldHammer(EMERALD).setUnlocalizedName("ItemEmeraldHammer").setTextureName("hammermod:ItemEmeraldHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGrassHammer = new ItemGrassHammer(GRASS).setUnlocalizedName("ItemGrassHammer").setTextureName("hammermod:ItemGrassHammer").setCreativeTab(HammerMod.HammerMod);
		ItemObsidianHammer = new ItemObsidianHammer(OBSIDIAN).setUnlocalizedName("ItemObsidianHammer").setTextureName("hammermod:ItemObsidianHammer").setCreativeTab(HammerMod.HammerMod);
		ItemGlowstoneHammer = new ItemGlowstoneHammer(GLOWSTONE).setUnlocalizedName("ItemGlowstoneHammer").setTextureName("hammermod:ItemGlowstoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemRedstoneHammer = new ItemRedstoneHammer(REDSTONE).setUnlocalizedName("ItemRedstoneHammer").setTextureName("hammermod:ItemRedstoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemLapizHammer = new ItemLapizHammer(LAPIZ).setUnlocalizedName("ItemLapizHammer").setTextureName("hammermod:ItemLapisHammer").setCreativeTab(HammerMod.HammerMod);
		ItemNetherackHammer = new ItemNetherackHammer(NETHERACK).setUnlocalizedName("ItemNetherackHammer").setTextureName("hammermod:ItemNetherackHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSoulSandHammer = new ItemSoulSandHammer(SOULSAND).setUnlocalizedName("ItemSoulSandHammer").setTextureName("hammermod:ItemSoulSandHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCoalHammer = new ItemCoalHammer(COAL).setUnlocalizedName("ItemCoalHammer").setTextureName("hammermod:ItemCoalHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCharcoalHammer = new ItemCharcoalHammer(CHARCOAL).setUnlocalizedName("ItemCharcoalHammer").setTextureName("hammermod:ItemCharcoalHammer").setCreativeTab(HammerMod.HammerMod);
		ItemEndstoneHammer = new ItemEndstoneHammer(ENDSTONE).setUnlocalizedName("ItemEndstoneHammer").setTextureName("hammermod:ItemEndstoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemBoneHammer = new ItemBoneHammer(BONE).setUnlocalizedName("ItemBoneHammer").setTextureName("hammermod:ItemBoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSpongeHammer = new ItemSpongeHammer(SPONGE).setUnlocalizedName("ItemSpongeHammer").setTextureName("hammermod:ItemSpongeHammer").setCreativeTab(HammerMod.HammerMod);
		ItemBrickHammer = new ItemBrickHammer(BRICK).setUnlocalizedName("ItemBrickHammer").setTextureName("hammermod:ItemBrickHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSugarHammer = new ItemSugarHammer(SUGAR).setUnlocalizedName("ItemSugarHammer").setTextureName("hammermod:ItemSugarHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSlimeHammer = new ItemSlimeHammer(SLIME).setUnlocalizedName("ItemSlimeHammer").setTextureName("hammermod:ItemSlimeHammer").setCreativeTab(HammerMod.HammerMod);
		ItemMelonHammer = new ItemMelonHammer(MELON).setUnlocalizedName("ItemMelonHammer").setTextureName("hammermod:ItemMelonHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPumpkinHammer = new ItemPumpkinHammer(PUMPKIN).setUnlocalizedName("ItemPumpkinHammer").setTextureName("hammermod:ItemPumpkinHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPotatoHammer = new ItemPotatoHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemPotatoHammer").setTextureName("hammermod:ItemPotatoHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCarrotHammer = new ItemCarrotHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCarrotHammer").setTextureName("hammermod:ItemCarrotHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAppleHammer = new ItemAppleHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAppleHammer").setTextureName("hammermod:ItemAppleHammer").setCreativeTab(HammerMod.HammerMod);
		ItemIceHammer = new ItemIceHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemIceHammer").setTextureName("hammermod:ItemIceHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPackedIceHammer = new ItemPackedIceHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemPackedIceHammer").setTextureName("hammermod:ItemPackedIceHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSnowHammer = new ItemSnowHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemSnowHammer").setTextureName("hammermod:ItemSnowHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCakeHammer = new ItemCakeHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCakeHammer").setTextureName("hammermod:ItemCakeHammer").setCreativeTab(HammerMod.HammerMod);

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
		ItemCinnabarHammer = new ItemCinnabarHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCinnabarHammer").setTextureName("hammermod:ItemCinnabarHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAmberBearingStoneHammer = new ItemAmberBearingStoneHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAmberBearingStoneHammer").setTextureName("hammermod:ItemAmberBearingStoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemFerrousHammer = new ItemFerrousHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemFerrousHammer").setTextureName("hammermod:ItemFerrousHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAdaminiteHammer = new ItemAdaminiteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAdaminiteHammer").setTextureName("hammermod:ItemAdaminiteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemShinyHammer = new ItemShinyHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemShinyHammer").setTextureName("hammermod:ItemShinyHammer").setCreativeTab(HammerMod.HammerMod);
		ItemXychoriumHammer = new ItemXychoriumHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemXychoriumHammer").setTextureName("hammermod:ItemXychoriumHammer").setCreativeTab(HammerMod.HammerMod);

		/*
		 * Hammers For YouTubers
		 */
		ItemPatHammer = new ItemPatHammer(PAT).setUnlocalizedName("ItemPatHammer").setTextureName("hammermod:ItemPatHammer").setCreativeTab(HammerMod.HammerMod);
		ItemJenHammer = new ItemJenHammer(JEN).setUnlocalizedName("ItemJenHammer").setTextureName("hammermod:ItemJenHammer").setCreativeTab(HammerMod.HammerMod);
		ItemDanTDMHammer = new ItemDanTDMHammer(TDM).setUnlocalizedName("ItemDanTDMHammer").setTextureName("hammermod:ItemDanTDMHammer").setCreativeTab(HammerMod.HammerMod);
		ItemxJSQHammer = new ItemxJSQHammer(JSQ).setUnlocalizedName("ItemxJSQHammer").setTextureName("hammermod:ItemxJSQHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSkyTheKidRSHammer = new ItemSkyTheKidRSHammer(SKY).setUnlocalizedName("ItemSkyTheKidRSHammer").setTextureName("hammermod:ItemSkyTheKidRSHammer").setCreativeTab(HammerMod.HammerMod);
		ItemThackAttack_MCHammer = new ItemThackAttack_MCHammer(TATTCKMC).setUnlocalizedName("ItemThackAttack_MCHammer").setTextureName("hammermod:ItemThackAttack_MCHammer").setCreativeTab(HammerMod.HammerMod);
		
		
		
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
		GameRegistry.registerItem(ItemSpongeHammer, ItemSpongeHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemBrickHammer, ItemBrickHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSugarHammer, ItemSugarHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSlimeHammer, ItemSlimeHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemMelonHammer, ItemMelonHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPumpkinHammer, ItemPumpkinHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPotatoHammer, ItemPotatoHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCarrotHammer, ItemCarrotHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemAppleHammer, ItemAppleHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemIceHammer, ItemIceHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemPackedIceHammer, ItemPackedIceHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSnowHammer, ItemSnowHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemCakeHammer, ItemCakeHammer.getUnlocalizedName().substring(5));

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
		GameRegistry.registerItem(ItemCinnabarHammer, ItemCinnabarHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemAmberBearingStoneHammer, ItemAmberBearingStoneHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFerrousHammer, ItemFerrousHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemAdaminiteHammer, ItemAdaminiteHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemShinyHammer, ItemShinyHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemXychoriumHammer, ItemXychoriumHammer.getUnlocalizedName().substring(5));
		
		/*
		 * Hammers For YouTubers
		 */
		GameRegistry.registerItem(ItemPatHammer, ItemPatHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemJenHammer, ItemJenHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemDanTDMHammer, ItemDanTDMHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemxJSQHammer, ItemxJSQHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemSkyTheKidRSHammer, ItemSkyTheKidRSHammer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemThackAttack_MCHammer, ItemThackAttack_MCHammer.getUnlocalizedName().substring(5));
		
		
	}
}
