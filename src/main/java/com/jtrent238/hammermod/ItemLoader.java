package com.jtrent238.hammermod;

import com.jtrent238.hammermod.items.hammers.*;
import com.jtrent238.hammermod.items.hammers.custom.ItemCustomHammer_1;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.config.Property;
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
	public static Item ItemDragonEggHammer;
	public static Item ItemTntHammer;
	public static Item ItemBedrockHammer;
	
	/*
	 * Mob Hammers
	 */
	public static Item ItemCreeperHammer;
	public static Item ItemPigHammer;
	public static Item ItemCowHammer;
	
	
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
	public static Item ItemUraniumHammer;
	public static Item ItemTitaniumHammer;
	public static Item ItemBloodStoneHammer;
	public static Item ItemRustedHammer;
	public static Item ItemRositeHammer;
	public static Item ItemLimoniteHammer;
	public static Item ItemMithrilHammer;
	public static Item ItemPrometheumHammer;
	public static Item ItemHepatizonHammer;
	public static Item ItemPoopHammer;
	public static Item ItemAngmallenHammer;
	public static Item ItemManganeseHammer;
	public static Item ItemSearedBrickHammer;
	public static Item ItemElectrumHammer;
	public static Item ItemPigIronHammer;
	public static Item ItemArditeHammer;
	public static Item ItemAlumiteHammer;
	public static Item ItemCobaltHammer;
	public static Item ItemManyullynHammer;
	public static Item ItemOureclaseHammer;
	public static Item ItemHaderothHammer;
	public static Item ItemInfuscoliumHammer;
	public static Item ItemRubberHammer;
	public static Item ItemDesichalkosHammer;
	public static Item ItemMeutoiteHammer;
	public static Item ItemEximiteHammer;
	public static Item ItemMidasiumHammer;
	public static Item ItemSanguiniteHammer;
	public static Item ItemInolashiteHammer;
	public static Item ItemVulcaniteHammer;
	public static Item ItemLemuriteHammer;
	public static Item ItemAmordrineHammer;
	public static Item ItemCeruclaseHammer;
	public static Item ItemKalendriteHammer;
	public static Item ItemVyroxeresHammer;
	public static Item ItemCarmotHammer;
	public static Item ItemTartariteHammer;
	public static Item ItemAtlarusHammer;
	public static Item ItemAstralHammer;
	public static Item ItemCelenegilHammer;
	public static Item ItemAredriteHammer;
	public static Item ItemOrichalcumHammer;
	
	/*
	 * Hammers For YouTubers
	 */
	public static Item ItemPatHammer;
	public static Item ItemJenHammer;
	public static Item ItemDanTDMHammer;
	public static Item ItemxJSQHammer;
	public static Item ItemSkyTheKidRSHammer;
	public static Item ItemThackAttack_MCHammer;
	public static Item Item_MrGregor_Hammer;
	
	/*
	 * Hammers For Twitch Streamers
	 */
	public static Item ItemDeeAxelJayHammer;
	
	/*
	 * Community Hammers
	 */
	public static Item ItemCryingObsidainHammer;
	public static Item ItemMythicalHammer;
	public static Item ItemToasterHammer;
	
	/*
	 * Special Hammers
	 */
	public static Item ItemRainbowHammer;
	public static Item ItemMissingTextureHammer;
	
	/*
	 * Custom Hammers
	 */
	public static Item ItemCustomHammer_1;

	private static int emeraldMultiplier = 2;			//Emerald Multiplier (Diamond * Multiplier)
	private static int obsidianMultiplier = (int) 2.5;	//Obsidian Multiplier (Diamond * Multiplier)
	private static int eM = emeraldMultiplier;			//Emerald Multiplier (Diamond * Multiplier)
	private static int oM = obsidianMultiplier;			//Obsidian Multiplier (Diamond * Multiplier)
	private static int nsM = eM + oM * 2;				//Nether Star Multiplier (Diamond * Multiplier)
	private static int deM = nsM + eM + oM * 4;			//Dragon Egg Multiplier (Diamond * Multiplier)
	private static int brM = nsM + eM + oM * deM;		//Bedrock Multiplier (Diamond * Multiplier)
	private static int YT = 10;							//YouTuber Multiplier
	private static int TWITCH = 10;						//Twitch Multiplier
	private static int PATREON = YT * TWITCH;			//Patreon Multiplier
	private static int mobM = 4;						//Mob Mulitiplier
	private static int JSQ_Multiplier = 10;				//xJSQ Multiplier
	private static int RAINBOW_MULTIPLIER = HammerMod.numHammers;	//Rainbow Multiplier
	private static int  C1 = HammerMod.CUSTOM_HAMMER_1_MATERIALMODIFIER.getInt();
	
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
	public static ToolMaterial DRAGEGG = EnumHelper.addToolMaterial("DRAGEGG", 3 * deM, 1561 * deM, 8.0F * deM, 3.0F * deM, 10 * deM);
	public static ToolMaterial TNT = EnumHelper.addToolMaterial("TNT", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial BEDROCK = EnumHelper.addToolMaterial("BEDROCK", 3 * brM, 1561 * brM, 8.0F * brM, 3.0F * brM, 10 * brM);
	
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
	public static ToolMaterial POTATO = EnumHelper.addToolMaterial("POTATO", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial CARROT = EnumHelper.addToolMaterial("CARROT", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial APPLE = EnumHelper.addToolMaterial("APPLE", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial ICE = EnumHelper.addToolMaterial("ICE", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial PACKED_ICE = EnumHelper.addToolMaterial("PACKED_ICE", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial SNOW = EnumHelper.addToolMaterial("SNOW", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial CAKE = EnumHelper.addToolMaterial("CAKE", 3, 1561, 8.0F, 3.0F, 10);
		
	//Ores from other mods
	public static ToolMaterial URANIUM = EnumHelper.addToolMaterial("URANIUM", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial ADAM = EnumHelper.addToolMaterial("ADAM", 3, 1561, 8.0F, 3.0F, 10);
	
	public static ToolMaterial CREEPER = EnumHelper.addToolMaterial("CREEPER", 3 * mobM, 1561 * mobM, 8.0F * mobM, 3.0F * mobM, 10 * mobM);
	public static ToolMaterial PIG = EnumHelper.addToolMaterial("PIG", 3 * mobM, 1561 * mobM, 8.0F * mobM, 3.0F * mobM, 10 * mobM);
	public static ToolMaterial COW = EnumHelper.addToolMaterial("COW", 3 * mobM, 1561 * mobM, 8.0F * mobM, 3.0F * mobM, 10 * mobM);
	
	
	public static ToolMaterial PAT = EnumHelper.addToolMaterial("PAT", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial JEN = EnumHelper.addToolMaterial("JEN", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial TDM = EnumHelper.addToolMaterial("TDM", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial JSQ = EnumHelper.addToolMaterial("JSQ", 3 * YT + JSQ_Multiplier, 1561 * YT + JSQ_Multiplier, 8.0F * YT + JSQ_Multiplier, 3.0F * YT + JSQ_Multiplier, 10 * YT + JSQ_Multiplier);
	public static ToolMaterial SKY = EnumHelper.addToolMaterial("SKY", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial TATTCKMC = EnumHelper.addToolMaterial("TATTCKMC", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	public static ToolMaterial MRGREG = EnumHelper.addToolMaterial("MRGREG", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	
	public static ToolMaterial DAXEJ = EnumHelper.addToolMaterial("DAXEJ", 3 * TWITCH, 1561 * TWITCH, 8.0F * TWITCH, 3.0F * TWITCH, 10 * TWITCH);
	
	
	public static ToolMaterial CRYOBBY = EnumHelper.addToolMaterial("CRYOBBY", 3, 8000, 6, 6, 10);
	public static ToolMaterial MYTHICAL = EnumHelper.addToolMaterial("MYTHICAL", 3, 500, 10, 15, 5);
	public static ToolMaterial TOASTER = EnumHelper.addToolMaterial("TOASTER", 1, 30000, 1000, (float) 0.5, 10);
	
	public static ToolMaterial RAINBOW = EnumHelper.addToolMaterial("RAINBOW", 3 * RAINBOW_MULTIPLIER, 1561 * RAINBOW_MULTIPLIER, 8.0F * RAINBOW_MULTIPLIER, 3.0F * RAINBOW_MULTIPLIER, 10 * RAINBOW_MULTIPLIER);
	
	public static ToolMaterial CUSTOM_1 = EnumHelper.addToolMaterial("CUSTOM_1", 3 * C1, 1561 * C1, 8.0F * C1, 3.0F * C1, 10 * C1);
	
	
	
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
		ItemPotatoHammer = new ItemPotatoHammer(POTATO).setUnlocalizedName("ItemPotatoHammer").setTextureName("hammermod:ItemPotatoHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCarrotHammer = new ItemCarrotHammer(CARROT).setUnlocalizedName("ItemCarrotHammer").setTextureName("hammermod:ItemCarrotHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAppleHammer = new ItemAppleHammer(APPLE).setUnlocalizedName("ItemAppleHammer").setTextureName("hammermod:ItemAppleHammer").setCreativeTab(HammerMod.HammerMod);
		ItemIceHammer = new ItemIceHammer(ICE).setUnlocalizedName("ItemIceHammer").setTextureName("hammermod:ItemIceHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPackedIceHammer = new ItemPackedIceHammer(PACKED_ICE).setUnlocalizedName("ItemPackedIceHammer").setTextureName("hammermod:ItemPackedIceHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSnowHammer = new ItemSnowHammer(SNOW).setUnlocalizedName("ItemSnowHammer").setTextureName("hammermod:ItemSnowHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCakeHammer = new ItemCakeHammer(CAKE).setUnlocalizedName("ItemCakeHammer").setTextureName("hammermod:ItemCakeHammer").setCreativeTab(HammerMod.HammerMod);
		ItemDragonEggHammer = new ItemDragonEggHammer(DRAGEGG).setUnlocalizedName("ItemDragonEggHammer").setTextureName("hammermod:ItemDragonEggHammer").setCreativeTab(HammerMod.HammerMod);
		ItemTntHammer = new ItemTntHammer(TNT).setUnlocalizedName("ItemTntHammer").setTextureName("hammermod:ItemTntHammer").setCreativeTab(HammerMod.HammerMod);
		ItemBedrockHammer = new ItemBedrockHammer(BEDROCK).setUnlocalizedName("ItemBedrockHammer").setTextureName("hammermod:ItemBedrockHammer").setCreativeTab(HammerMod.HammerMod);

		/*
		 * Mob Hammers
		 */
		ItemCreeperHammer = new ItemCreeperHammer(CREEPER).setUnlocalizedName("ItemCreeperHammer").setTextureName("hammermod:ItemCreeperHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPigHammer = new ItemPigHammer(PIG).setUnlocalizedName("ItemPigHammer").setTextureName("hammermod:ItemPigHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCowHammer = new ItemCowHammer(COW).setUnlocalizedName("ItemCowHammer").setTextureName("hammermod:ItemCowHammer").setCreativeTab(HammerMod.HammerMod);
		
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
		ItemAdaminiteHammer = new ItemAdaminiteHammer(ADAM).setUnlocalizedName("ItemAdaminiteHammer").setTextureName("hammermod:ItemAdaminiteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemShinyHammer = new ItemShinyHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemShinyHammer").setTextureName("hammermod:ItemShinyHammer").setCreativeTab(HammerMod.HammerMod);
		ItemXychoriumHammer = new ItemXychoriumHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemXychoriumHammer").setTextureName("hammermod:ItemXychoriumHammer").setCreativeTab(HammerMod.HammerMod);
		ItemUraniumHammer = new ItemUraniumHammer(URANIUM).setUnlocalizedName("ItemUraniumHammer").setTextureName("hammermod:ItemUraniumHammer").setCreativeTab(HammerMod.HammerMod);
		ItemTitaniumHammer = new ItemTitaniumHammer(TITANIUM).setUnlocalizedName("ItemTitaniumHammer").setTextureName("hammermod:ItemTitaniumHammer").setCreativeTab(HammerMod.HammerMod);
		ItemBloodStoneHammer = new ItemBloodStoneHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemBloodStoneHammer").setTextureName("hammermod:ItemBloodStoneHammer").setCreativeTab(HammerMod.HammerMod);
		ItemRustedHammer = new ItemRustedHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemRustedHammer").setTextureName("hammermod:ItemRustedHammer").setCreativeTab(HammerMod.HammerMod);
		ItemRositeHammer = new ItemRositeHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemRositeHammer").setTextureName("hammermod:ItemRositeHammer").setCreativeTab(HammerMod.HammerMod);
		ItemLimoniteHammer = new ItemLimoniteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemLimoniteHammer").setTextureName("hammermod:ItemLimoniteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemMithrilHammer = new ItemMithrilHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemMithrilHammer").setTextureName("hammermod:ItemMithrilHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPrometheumHammer = new ItemPrometheumHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemPrometheumHammer").setTextureName("hammermod:ItemPrometheumHammer").setCreativeTab(HammerMod.HammerMod);
		ItemHepatizonHammer = new ItemHepatizonHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemHepatizonHammer").setTextureName("hammermod:ItemHepatizonHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPoopHammer = new ItemPoopHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemPoopHammer").setTextureName("hammermod:ItemPoopHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAngmallenHammer = new ItemAngmallenHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAngmallenHammer").setTextureName("hammermod:ItemAngmallenHammer").setCreativeTab(HammerMod.HammerMod);
		ItemManganeseHammer = new ItemManganeseHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemManganeseHammer").setTextureName("hammermod:ItemManganeseHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSearedBrickHammer = new ItemSearedBrickHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemSearedBrickHammer").setTextureName("hammermod:ItemSearedBrickHammer").setCreativeTab(HammerMod.HammerMod);
		ItemElectrumHammer = new ItemElectrumHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemElectrumHammer").setTextureName("hammermod:ItemElectrumHammer").setCreativeTab(HammerMod.HammerMod);
		ItemPigIronHammer = new ItemPigIronHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemPigIronHammer").setTextureName("hammermod:ItemPigIronHammer").setCreativeTab(HammerMod.HammerMod);
		ItemArditeHammer = new ItemArditeHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemArditeHammer").setTextureName("hammermod:ItemArditeHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAlumiteHammer = new ItemAlumiteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAlumiteHammer").setTextureName("hammermod:ItemAlumiteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCobaltHammer = new ItemCobaltHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCobaltHammer").setTextureName("hammermod:ItemCobaltHammer").setCreativeTab(HammerMod.HammerMod);
		ItemManyullynHammer = new ItemManyullynHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemManyullynHammer").setTextureName("hammermod:ItemManyullynHammer").setCreativeTab(HammerMod.HammerMod);
		ItemOureclaseHammer = new ItemOureclaseHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemOureclaseHammer").setTextureName("hammermod:ItemOureclaseHammer").setCreativeTab(HammerMod.HammerMod);
		ItemHaderothHammer = new ItemHaderothHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemHaderothHammer").setTextureName("hammermod:ItemHaderothHammer").setCreativeTab(HammerMod.HammerMod);
		ItemInfuscoliumHammer = new ItemInfuscoliumHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemInfuscoliumHammer").setTextureName("hammermod:ItemManyullynHammer").setCreativeTab(HammerMod.HammerMod);
		ItemRubberHammer = new ItemRubberHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemRubberHammer").setTextureName("hammermod:ItemRubberHammer").setCreativeTab(HammerMod.HammerMod);
		ItemDesichalkosHammer = new ItemDesichalkosHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemDesichalkosHammer").setTextureName("hammermod:ItemDesichalkosHammer").setCreativeTab(HammerMod.HammerMod);
		ItemMeutoiteHammer = new ItemMeutoiteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemMeutoiteHammer").setTextureName("hammermod:ItemMeutoiteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemEximiteHammer = new ItemEximiteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemEximiteHammer").setTextureName("hammermod:ItemEximiteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemMidasiumHammer = new ItemMidasiumHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemMidasiumHammer").setTextureName("hammermod:ItemMidasiumHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSanguiniteHammer = new ItemSanguiniteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemSanguiniteHammer").setTextureName("hammermod:ItemSanguiniteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemInolashiteHammer = new ItemInolashiteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemInolashiteHammer").setTextureName("hammermod:ItemInolashiteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemVulcaniteHammer = new ItemVulcaniteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemVulcaniteHammer").setTextureName("hammermod:ItemVulcaniteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemLemuriteHammer = new ItemLemuriteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemLemuriteHammer").setTextureName("hammermod:ItemLemuriteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAmordrineHammer = new ItemAmordrineHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAmordrineHammer").setTextureName("hammermod:ItemAmordrineHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCeruclaseHammer = new ItemCeruclaseHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCeruclaseHammer").setTextureName("hammermod:ItemCeruclaseHammer").setCreativeTab(HammerMod.HammerMod);
		ItemKalendriteHammer = new ItemKalendriteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemKalendriteHammer").setTextureName("hammermod:ItemKalendriteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemVyroxeresHammer = new ItemVyroxeresHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemVyroxeresHammer").setTextureName("hammermod:ItemVyroxeresHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCarmotHammer = new ItemCarmotHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCarmotHammer").setTextureName("hammermod:ItemCarmotHammer").setCreativeTab(HammerMod.HammerMod);
		ItemTartariteHammer = new ItemTartariteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemTartariteHammer").setTextureName("hammermod:ItemTartariteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAtlarusHammer = new ItemAtlarusHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAtlarusHammer").setTextureName("hammermod:ItemAtlarusHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAstralHammer = new ItemAstralHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAstralHammer").setTextureName("hammermod:ItemAstralHammer").setCreativeTab(HammerMod.HammerMod);
		ItemCelenegilHammer = new ItemCelenegilHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemCelenegilHammer").setTextureName("hammermod:ItemCelenegilHammer").setCreativeTab(HammerMod.HammerMod);
		ItemAredriteHammer = new ItemAredriteHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemAredriteHammer").setTextureName("hammermod:ItemAredriteHammer").setCreativeTab(HammerMod.HammerMod);
		ItemOrichalcumHammer = new ItemOrichalcumHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemOrichalcumHammer").setTextureName("hammermod:ItemOrichalcumHammer").setCreativeTab(HammerMod.HammerMod);
		
		
		/*
		 * Hammers For YouTubers
		 */
		ItemPatHammer = new ItemPatHammer(PAT).setUnlocalizedName("ItemPatHammer").setTextureName("hammermod:ItemPatHammer").setCreativeTab(HammerMod.HammerMod);
		ItemJenHammer = new ItemJenHammer(JEN).setUnlocalizedName("ItemJenHammer").setTextureName("hammermod:ItemJenHammer").setCreativeTab(HammerMod.HammerMod);
		ItemDanTDMHammer = new ItemDanTDMHammer(TDM).setUnlocalizedName("ItemDanTDMHammer").setTextureName("hammermod:ItemDanTDMHammer").setCreativeTab(HammerMod.HammerMod);
		ItemxJSQHammer = new ItemxJSQHammer(JSQ).setUnlocalizedName("ItemxJSQHammer").setTextureName("hammermod:ItemxJSQHammer").setCreativeTab(HammerMod.HammerMod);
		ItemSkyTheKidRSHammer = new ItemSkyTheKidRSHammer(SKY).setUnlocalizedName("ItemSkyTheKidRSHammer").setTextureName("hammermod:ItemSkyTheKidRSHammer").setCreativeTab(HammerMod.HammerMod);
		ItemThackAttack_MCHammer = new ItemThackAttack_MCHammer(TATTCKMC).setUnlocalizedName("ItemThackAttack_MCHammer").setTextureName("hammermod:ItemThackAttack_MCHammer").setCreativeTab(HammerMod.HammerMod);
		Item_MrGregor_Hammer = new Item_MrGregor_Hammer(MRGREG).setUnlocalizedName("Item_MrGregor_Hammer").setTextureName("hammermod:Item_MrGregor_Hammer").setCreativeTab(HammerMod.HammerMod);
		
		/*
		 * Hammers For Twitch Streamers
		 */
		ItemDeeAxelJayHammer = new ItemDeeAxelJayHammer(DAXEJ).setUnlocalizedName("ItemDeeAxelJayHammer").setTextureName("hammermod:ItemDeeAxelJayHammer").setCreativeTab(HammerMod.HammerMod);
		
		
		/*
		 * Community Hammers
		 */
		ItemCryingObsidainHammer  = new ItemCryingObsidainHammer(CRYOBBY).setUnlocalizedName("ItemCryingObsidainHammer").setTextureName("hammermod:ItemCryingObsidainHammer").setCreativeTab(HammerMod.HammerMod);
		ItemMythicalHammer  = new ItemMythicalHammer(MYTHICAL).setUnlocalizedName("ItemMythicalHammer").setTextureName("hammermod:ItemMythicalHammer").setCreativeTab(HammerMod.HammerMod);
		ItemToasterHammer = new ItemToasterHammer(TOASTER).setUnlocalizedName("ItemToasterHammer").setTextureName("hammermod:ItemToasterHammer").setCreativeTab(HammerMod.HammerMod);
		
		/*
		 * Special Hammers
		 */
		ItemRainbowHammer = new ItemRainbowHammer(RAINBOW).setUnlocalizedName("ItemRainbowHammer").setTextureName("hammermod:ItemRainbowHammer").setCreativeTab(HammerMod.HammerMod);
		ItemMissingTextureHammer = new ItemMissingTextureHammer(ToolMaterial.EMERALD).setUnlocalizedName("ItemMissingTextureHammer").setTextureName("hammermod:ItemMissingTextureHammer").setCreativeTab(HammerMod.HammerMod);

		/*
		 * Custom Hammers
		 */
		ItemCustomHammer_1 = new ItemCustomHammer_1(CUSTOM_1).setUnlocalizedName(HammerMod.CUSTOM_HAMMER_1_NAME.toString()).setTextureName(HammerMod.CUSTOM_HAMMER_1_TEXTURE.toString()).setCreativeTab(HammerMod.HammerMod);
		
		
		
		registerItems();
	}

	/**
	 * Register Items.
	 */
	private static void registerItems(){
		
		if(HammerMod.DISABLE_ALL_HAMMER == false){
		/*
		 * Basic Minecraft Hammers (Ex. Vannila Ores)
		 */
		if(HammerMod.WOOD_HAMMER_ENABLE{
			GameRegistry.registerItem(ItemWoodHammer, ItemWoodHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.STONE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemStoneHammer, ItemStoneHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.IRON_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemIronHammer, ItemIronHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.GOLD_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemGoldHammer, ItemGoldHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.DIAMOND_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemDiamondHammer, ItemDiamondHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.DIRT_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemDirtHammer, ItemDirtHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.GLASS_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemGlassHammer, ItemGlassHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.SAND_HAMMER_ENABLE == true){	
				GameRegistry.registerItem(ItemSandHammer, ItemSandHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.CACTUS_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemCactusHammer, ItemCactusHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.GRAVEL_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemGravelHammer, ItemGravelHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.WOOL_WHITE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemWoolHammer_white, ItemWoolHammer_white.getUnlocalizedName().substring(5));
		}
		if(HammerMod.EMERALD_HAMMER_ENABLE == true){
		G	ameRegistry.registerItem(ItemEmeraldHammer, ItemEmeraldHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.GRASS_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemGrassHammer, ItemGrassHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.OBSIDIAN_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemObsidianHammer, ItemObsidianHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.GLOWSTONE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemGlowstoneHammer, ItemGlowstoneHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.REDSTONE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemRedstoneHammer, ItemRedstoneHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.LAPIZ_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemLapizHammer, ItemLapizHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.NETHERACK_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemNetherackHammer, ItemNetherackHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.SOULSAND_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSoulSandHammer, ItemSoulSandHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COAL_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCoalHammer, ItemCoalHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.CHARCOAL_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCharcoalHammer, ItemCharcoalHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.ENDSTONE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemEndstoneHammer, ItemEndstoneHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.BONE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemBoneHammer, ItemBoneHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.SPONGE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSpongeHammer, ItemSpongeHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.BRICK_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemBrickHammer, ItemBrickHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.SUGAR_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSugarHammer, ItemSugarHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.SLIME_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSlimeHammer, ItemSlimeHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.MELON_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemMelonHammer, ItemMelonHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.PUMPKIN_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemPumpkinHammer, ItemPumpkinHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.POTATO_HAMMER_ENABLE == true){1
			GameRegistry.registerItem(ItemPotatoHammer, ItemPotatoHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.CARROT_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCarrotHammer, ItemCarrotHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.APPLE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAppleHammer, ItemAppleHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.ICE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemIceHammer, ItemIceHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.PACKEDICE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemPackedIceHammer, ItemPackedIceHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.DISABLE_ALL_HAMMER == true){
			GameRegistry.registerItem(ItemSnowHammer, ItemSnowHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.CAKE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCakeHammer, ItemCakeHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.DRAGONEGG_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemDragonEggHammer, ItemDragonEggHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.TNT_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemTntHammer, ItemTntHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.BEDROCK_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemBedrockHammer, ItemBedrockHammer.getUnlocalizedName().substring(5));
		}

		/*
		 * Mob Hammers
		 */
		if(HammerMod.CREEPER_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCreeperHammer, ItemCreeperHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.PIG_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemPigHammer, ItemPigHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCowHammer, ItemCowHammer.getUnlocalizedName().substring(5));
		}
		
		/*
		 * Hammers Using Ores from other mods
		 * **NOTE: REQUIRES Other mods to craft these hammers**
		 */
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCopperHammer, ItemCopperHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemBronzeHammer, ItemBronzeHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSilverHammer, ItemSilverHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemTungstenHammer, ItemTungstenHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemRubyHammer, ItemRubyHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemTinHammer, ItemTinHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemJadeHammer, ItemJadeHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAmethystHammer, ItemAmethystHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemGraphiteHammer, ItemGraphiteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCitrineHammer, ItemCitrineHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemPierreHammer, ItemPierreHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSapphireHammer, ItemSapphireHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemOnyxHammer, ItemOnyxHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemNikoliteHammer, ItemNikoliteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSilicaHammer, ItemSilicaHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCinnabarHammer, ItemCinnabarHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAmberBearingStoneHammer, ItemAmberBearingStoneHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemFerrousHammer, ItemFerrousHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAdaminiteHammer, ItemAdaminiteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemShinyHammer, ItemShinyHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemXychoriumHammer, ItemXychoriumHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemUraniumHammer, ItemUraniumHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemTitaniumHammer, ItemTitaniumHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemBloodStoneHammer, ItemBloodStoneHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemRustedHammer, ItemRustedHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemRositeHammer, ItemRositeHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemLimoniteHammer, ItemLimoniteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemMithrilHammer, ItemMithrilHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemPrometheumHammer, ItemPrometheumHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemHepatizonHammer, ItemHepatizonHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemPoopHammer, ItemPoopHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAngmallenHammer, ItemAngmallenHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemManganeseHammer, ItemManganeseHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSearedBrickHammer, ItemSearedBrickHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemElectrumHammer, ItemElectrumHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemPigIronHammer, ItemPigIronHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemArditeHammer, ItemArditeHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAlumiteHammer, ItemAlumiteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCobaltHammer, ItemCobaltHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemManyullynHammer, ItemManyullynHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemOureclaseHammer, ItemOureclaseHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemHaderothHammer, ItemHaderothHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemInfuscoliumHammer, ItemInfuscoliumHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemRubberHammer, ItemRubberHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemDesichalkosHammer, ItemDesichalkosHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemMeutoiteHammer, ItemMeutoiteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemEximiteHammer, ItemEximiteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemMidasiumHammer, ItemMidasiumHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemSanguiniteHammer, ItemSanguiniteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemInolashiteHammer, ItemInolashiteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemVulcaniteHammer, ItemVulcaniteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemLemuriteHammer, ItemLemuriteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAmordrineHammer, ItemAmordrineHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCeruclaseHammer, ItemCeruclaseHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemKalendriteHammer, ItemKalendriteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemVyroxeresHammer, ItemVyroxeresHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCarmotHammer, ItemCarmotHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemTartariteHammer, ItemTartariteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAtlarusHammer, ItemAtlarusHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAstralHammer, ItemAstralHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemCelenegilHammer, ItemCelenegilHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemAredriteHammer, ItemAredriteHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.COW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemOrichalcumHammer, ItemOrichalcumHammer.getUnlocalizedName().substring(5));
		}
		   
		/*
		 * Hammers For YouTubers
		 */
		if(HammerMod.PAT_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemPatHammer, ItemPatHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.JEN_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemJenHammer, ItemJenHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.DANTDM_HAMMER_ENABLE == true){
				GameRegistry.registerItem(ItemDanTDMHammer, ItemDanTDMHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.JSQ_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemxJSQHammer, ItemxJSQHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.SKYRS_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemSkyTheKidRSHammer, ItemSkyTheKidRSHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.THACKATTACK_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemThackAttack_MCHammer, ItemThackAttack_MCHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.MRGREGOR_HAMMER_ENABLE == true){
		GameRegistry.registerItem(Item_MrGregor_Hammer, Item_MrGregor_Hammer.getUnlocalizedName().substring(5));
		}
		
		/*
		 * Hammers For Twitch Streamers
		 */
		if(HammerMod.DEEJAYAXEL_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemDeeAxelJayHammer, ItemDeeAxelJayHammer.getUnlocalizedName().substring(5));
		}
		/*
		 * Community Hammers
		 */
		if(HammerMod.CRYOBBY_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemCryingObsidainHammer, ItemCryingObsidainHammer.getUnlocalizedName().substring(5));
		}
		//GameRegistry.registerItem(ItemMythicalHammer, ItemMythicalHammer.getUnlocalizedName().substring(5));
		if(HammerMod.TOASTER_HAMMER_ENABLE == true){
		GameRegistry.registerItem(ItemToasterHammer, ItemToasterHammer.getUnlocalizedName().substring(5));
		}

		/*
		 * Special Hammers
		 */
		if(HammerMod.RAINBOW_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemRainbowHammer, ItemRainbowHammer.getUnlocalizedName().substring(5));
		}
		if(HammerMod.MISSING_TEXTURE_HAMMER_ENABLE == true){
			GameRegistry.registerItem(ItemMissingTextureHammer, ItemMissingTextureHammer.getUnlocalizedName().substring(5));
		}
		/*
		 * Custom Hammers
		 */
		
		if(HammerMod.CUSTOM_HAMMER_1 == true){
			GameRegistry.registerItem(ItemCustomHammer_1, ItemCustomHammer_1.getUnlocalizedName().substring(5));
		}
		}	
	}
}
