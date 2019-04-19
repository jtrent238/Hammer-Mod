package com.jtrent238.hammermod;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;

import com.jtrent238.hammermod.api.HammerModAPI;
import com.jtrent238.hammermod.items.hammers.*;
import com.jtrent238.hammermod.items.materials.HammerMaterial;
import com.jtrent238.hammermod.util.CustomHammerRegistry;
import com.jtrent238.hammermod.util.HammerHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Main.MODID)@EventBusSubscriber
public class ModItems {
	
	
	/*
	 * Basic Minecraft Hammers (Ex. Vannila Ores)
	 */
	public static final ItemBaseHammer hammerWood = new ItemWoodHammer(HammerMaterial.WOOD, "WoodHammer", "wood_hammer");
	public static final ItemBaseHammer hammerStone = new ItemStoneHammer(HammerMaterial.STONE, "StoneHammer", "stone_hammer");
	public static final ItemBaseHammer hammerIron = new ItemIronHammer(HammerMaterial.IRON, "IronHammer", "iron_hammer");
	public static final ItemBaseHammer hammerGold = new ItemGoldHammer(HammerMaterial.GOLD, "GoldHammer", "gold_hammer");
	public static final ItemBaseHammer hammerDiamond = new ItemDiamondHammer(HammerMaterial.DIAMOND, "DiamondHammer", "diamond_hammer");
	public static final ItemBaseHammer hammerDirt = new ItemDirtHammer(HammerMaterial.DIRT, "DirtHammer", "dirt_hammer");
	public static final ItemBaseHammer hammerGlass = new ItemGlassHammer(HammerMaterial.GLASS, "GlassHammer", "glass_hammer");
	public static final ItemBaseHammer hammerSand = new ItemSandHammer(HammerMaterial.SAND, "SandHammer", "sand_hammer");
	public static final ItemBaseHammer hammerCactus = new ItemCactusHammer(HammerMaterial.CACTUS, "CactusHammer", "cactus_hammer");
	public static final ItemBaseHammer hammerGravel = new ItemGravelHammer(HammerMaterial.GRAVEL, "GravelHammer", "gravel_hammer");
	public static final ItemBaseHammer hammerWoolBlack = new ItemWoolHammerBlack(HammerMaterial.WOOL, "WoolHammerBlack", "wool_hammer_black");
	public static final ItemBaseHammer hammerWoolRed = new ItemWoolHammerRed(HammerMaterial.WOOL, "WoolHammerRed", "wool_hammer_red");
	public static final ItemBaseHammer hammerWoolGreen = new ItemWoolHammerGreen(HammerMaterial.WOOL, "WoolHammerGreen", "wool_hammer_green");
	public static final ItemBaseHammer hammerWoolBrown = new ItemWoolHammerBrown(HammerMaterial.WOOL, "WoolHammerBrown", "wool_hammer_brown");
	public static final ItemBaseHammer hammerWoolBlue = new ItemWoolHammerBlue(HammerMaterial.WOOL, "WoolHammerBlue", "wool_hammer_blue");
	public static final ItemBaseHammer hammerWoolPurple = new ItemWoolHammerPurple(HammerMaterial.WOOL, "WoolHammerPurple", "wool_hammer_purple");
	public static final ItemBaseHammer hammerWoolCyan = new ItemWoolHammerCyan(HammerMaterial.WOOL, "WoolHammerCyan", "wool_hammer_cyan");
	public static final ItemBaseHammer hammerWoolSilver = new ItemWoolHammerSilver(HammerMaterial.WOOL, "WoolHammerSilver", "wool_hammer_silver");
	public static final ItemBaseHammer hammerWoolGrey = new ItemWoolHammerGrey(HammerMaterial.WOOL, "WoolHammerGrey", "wool_hammer_grey");
	public static final ItemBaseHammer hammerWoolPink = new ItemWoolHammerPink(HammerMaterial.WOOL, "WoolHammerPink", "wool_hammer_pink");
	public static final ItemBaseHammer hammerWoolLime = new ItemWoolHammerLime(HammerMaterial.WOOL, "WoolHammerLime", "wool_hammer_lime");
	public static final ItemBaseHammer hammerWoolYellow = new ItemWoolHammerYellow(HammerMaterial.WOOL, "WoolHammerYellow", "wool_hammer_yellow");
	public static final ItemBaseHammer hammerWoolLightBlue = new ItemWoolHammerLightBlue(HammerMaterial.WOOL, "WoolHammerLightBlue", "wool_hammer_lightblue");
	public static final ItemBaseHammer hammerWoolMagenta = new ItemWoolHammerMagenta(HammerMaterial.WOOL, "WoolHammerMagenta", "wool_hammer_magenta");
	public static final ItemBaseHammer hammerWoolOrange = new ItemWoolHammerOrange(HammerMaterial.WOOL, "WoolHammerOrange", "wool_hammer_orange");
	public static final ItemBaseHammer hammerWoolWhite = new ItemWoolHammerWhite(HammerMaterial.WOOL, "WoolHammerWhite", "wool_hammer_white");
	public static final ItemBaseHammer hammerEmerald = new ItemEmeraldHammer(HammerMaterial.EMERALD, "EmeraldHammer", "emerald_hammer");
	public static final ItemBaseHammer hammerGrass = new ItemGrassHammer(HammerMaterial.GRASS, "GrassHammer", "grass_hammer");
	public static final ItemBaseHammer hammerObsidian = new ItemObsidianHammer(HammerMaterial.OBSIDIAN, "ObsidianHammer", "obsidian_hammer");
	public static final ItemBaseHammer hammerGlowstone = new ItemGlowstoneHammer(HammerMaterial.GLOWSTONE, "GlowstoneHammer", "glowstone_hammer");
	public static final ItemBaseHammer hammerRedstone = new ItemRedstoneHammer(HammerMaterial.REDSTONE, "RedstoneHammer", "redstone_hammer");
	public static final ItemBaseHammer hammerLapis = new ItemLapisHammer(HammerMaterial.LAPIS, "LapisHammer", "lapis_hammer");
	public static final ItemBaseHammer hammerNetherack = new ItemNetherackHammer(HammerMaterial.NETHERACK, "NetherackHammer", "netherack_hammer");
	public static final ItemBaseHammer hammerSoulsand = new ItemSoulSandHammer(HammerMaterial.SOULSAND, "SoulSandHammer", "soulsand_hammer"); 
	public static final ItemBaseHammer hammerCoal = new ItemCoalHammer(HammerMaterial.COAL, "CoalHammer", "coal_hammer");
	public static final ItemBaseHammer hammerCharcoal = new ItemCharcoalHammer(HammerMaterial.CHARCOAL, "CharcoalHammer", "charcoal_hammer");
	public static final ItemBaseHammer hammerEndstone = new ItemEndstoneHammer(HammerMaterial.ENDSTONE, "EndstoneHammer", "endstone_hammer");
	public static final ItemBaseHammer hammerBone = new ItemBoneHammer(HammerMaterial.BONE, "BoneHammer", "bone_hammer");
	public static final ItemBaseHammer hammerSponge = new ItemSpongeHammer(HammerMaterial.SPONGE, "SpongeHammer", "sponge_hammer");
	public static final ItemBaseHammer hammerBrick = new ItemBrickHammer(HammerMaterial.BRICK, "BrickHammer", "brick_hammer");
	public static final ItemBaseHammer hammerSugar = new ItemSugarHammer(HammerMaterial.SUGAR, "SugarHammer", "sugar_hammer");
	public static final ItemBaseHammer hammerSlime = new ItemSlimeHammer(HammerMaterial.SLIME, "SlimeHammer", "slime_hammer");
	public static final ItemBaseHammer hammerMelon = new ItemMelonHammer(HammerMaterial.MELON, "MelonHammer", "melon_hammer");
	public static final ItemBaseHammer hammerPumpkin = new ItemPumpkinHammer(HammerMaterial.PUMPKIN, "PumpkinHammer", "pumpkin_hammer");
	public static final ItemBaseHammer hammerPotato = new ItemPotatoHammer(HammerMaterial.POTATO, "PotatoHammer", "potato_hammer");
	public static final ItemBaseHammer hammerCarrot = new ItemCarrotHammer(HammerMaterial.CARROT, "CarrotHammer", "carrot_hammer");
	public static final ItemBaseHammer hammerApple = new ItemAppleHammer(HammerMaterial.APPLE, "AppleHammer", "apple_hammer");
	public static final ItemBaseHammer hammerIce = new ItemIceHammer(HammerMaterial.ICE, "IceHammer", "ice_hammer");
	public static final ItemBaseHammer hammerPackedIce = new ItemPackedIceHammer(HammerMaterial.PACKED_ICE, "PackedIceHammer", "packed_ice_hammer");
	public static final ItemBaseHammer hammerSnow = new ItemSnowHammer(HammerMaterial.SNOW, "SnowHammer", "snow_hammer");
	public static final ItemBaseHammer hammerCake = new ItemCakeHammer(HammerMaterial.CAKE, "CakeHammer", "cake_hammer");
	public static final ItemBaseHammer hammerDragonEgg = new ItemDragonEggHammer(HammerMaterial.DRAGEGG, "DragonEggHammer", "dragon_egg_hammer");
	public static final ItemBaseHammer hammerTnt = new ItemTntHammer(HammerMaterial.TNT, "TntHammer", "tnt_hammer");
	public static final ItemBaseHammer hammerBedrock = new ItemBedrockHammer(HammerMaterial.BEDROCK, "BedrockHammer", "bedrock_hammer");
	public static final ItemBaseHammer hammerPurpur = new ItemPurpurHammer(HammerMaterial.PURPUR, "PurpurHammer", "purpur_hammer");
	public static final ItemBaseHammer hammerEndBricks = new ItemEndBricksHammer(HammerMaterial.ENDBRICKS, "EndBricksHammer", "end_bricks_hammer");
	public static final ItemBaseHammer hammerChorus = new ItemChorusHammer(HammerMaterial.CHORUS, "ChorusHammer", "chorus_hammer");
	public static final ItemBaseHammer hammerGranite = new ItemGraniteHammer(HammerMaterial.GRANITE, "GraniteHammer", "granite_hammer");
	public static final ItemBaseHammer hammerAndesite = new ItemAndesiteHammer(HammerMaterial.ANDESITE, "AndesiteHammer", "andesite_hammer");
	public static final ItemBaseHammer hammerClayBlack = new ItemClayHammerBlack(HammerMaterial.HARDCLAY, "ClayHammerBlack", "hammer_hardened_clay_stained_black");
	public static final ItemBaseHammer hammerClayBlue = new ItemClayHammerBlue(HammerMaterial.HARDCLAY, "ClayHammerBlue", "hammer_hardened_clay_stained_blue");
	public static final ItemBaseHammer hammerClayBrown = new ItemClayHammerBrown(HammerMaterial.HARDCLAY, "ClayHammerBrown", "hammer_hardened_clay_stained_brown");
	public static final ItemBaseHammer hammerClayCyan = new ItemClayHammerCyan(HammerMaterial.HARDCLAY, "ClayHammerCyan", "hammer_hardened_clay_stained_cyan");
	public static final ItemBaseHammer hammerClayGreen = new ItemClayHammerGreen(HammerMaterial.HARDCLAY, "ClayHammerGreen", "hammer_hardened_clay_stained_green");
	public static final ItemBaseHammer hammerClayGrey = new ItemClayHammerGrey(HammerMaterial.HARDCLAY, "ClayHammerGrey", "hammer_hardened_clay_stained_grey");
	public static final ItemBaseHammer hammerClayLightBlue = new ItemClayHammerLightBlue(HammerMaterial.HARDCLAY, "ClayHammerLightBlue", "hammer_hardened_clay_stained_light_blue");
	public static final ItemBaseHammer hammerClayLime = new ItemClayHammerLime(HammerMaterial.HARDCLAY, "ClayHammerLime", "hammer_hardened_clay_stained_lime");
	public static final ItemBaseHammer hammerClayMagenta = new ItemClayHammerMagenta(HammerMaterial.HARDCLAY, "ClayHammerMagenta", "hammer_hardened_clay_stained_magenta");
	public static final ItemBaseHammer hammerClayOrange = new ItemClayHammerOrange(HammerMaterial.HARDCLAY, "ClayHammerOrange", "hammer_hardened_clay_stained_orange");
	public static final ItemBaseHammer hammerClayPink = new ItemClayHammerPink(HammerMaterial.HARDCLAY, "ClayHammerPink", "hammer_hardened_clay_stained_pink");
	public static final ItemBaseHammer hammerClayPurple = new ItemClayHammerPurple(HammerMaterial.HARDCLAY, "ClayHammerPurple", "hammer_hardened_clay_stained_purple");
	public static final ItemBaseHammer hammerClayRed = new ItemClayHammerRed(HammerMaterial.HARDCLAY, "ClayHammerRed", "hammer_hardened_clay_stained_red");
	public static final ItemBaseHammer hammerClaySilver = new ItemClayHammerSilver(HammerMaterial.HARDCLAY, "ClayHammerSilver", "hammer_hardened_clay_stained_silver");
	public static final ItemBaseHammer hammerClayWhite = new ItemClayHammerWhite(HammerMaterial.HARDCLAY, "ClayHammerWhite", "hammer_hardened_clay_stained_white");
	public static final ItemBaseHammer hammerHay = new ItemHayHammer(HammerMaterial.HAY, "HayHammer", "hammer_hay");
	
	public static final ItemBaseHammer hammerShulkerBlack = new ItemShulkerHammerBlack(HammerMaterial.SHULKER, "ShulkerHammerBlack", "hammer_shulker_black");
	public static final ItemBaseHammer hammerShulkerBlue = new ItemShulkerHammerBlue(HammerMaterial.SHULKER, "ShulkerHammerBlue", "hammer_shulker_blue");
	public static final ItemBaseHammer hammerShulkerBrown = new ItemShulkerHammerBrown(HammerMaterial.SHULKER, "ShulkerHammerBrown", "hammer_shulker_brown");
	public static final ItemBaseHammer hammerShulkerCyan = new ItemShulkerHammerCyan(HammerMaterial.SHULKER, "ShulkerHammerCyan", "hammer_shulker_cyan");
	public static final ItemBaseHammer hammerShulkerGreen = new ItemShulkerHammerGreen(HammerMaterial.SHULKER, "ShulkerHammerGreen", "hammer_shulker_green");
	public static final ItemBaseHammer hammerShulkerGrey = new ItemShulkerHammerGrey(HammerMaterial.SHULKER, "ShulkerHammerGrey", "hammer_shulker_grey");
	public static final ItemBaseHammer hammerShulkerLightBlue = new ItemShulkerHammerLightBlue(HammerMaterial.SHULKER, "ShulkerHammerLightBlue", "hammer_shulker_light_blue");
	public static final ItemBaseHammer hammerShulkerLime = new ItemShulkerHammerLime(HammerMaterial.SHULKER, "ShulkerHammerLime", "hammer_shulker_lime");
	public static final ItemBaseHammer hammerShulkerMagenta = new ItemShulkerHammerMagenta(HammerMaterial.SHULKER, "ShulkerHammerMagenta", "hammer_shulker_magenta");
	public static final ItemBaseHammer hammerShulkerOrange = new ItemShulkerHammerOrange(HammerMaterial.SHULKER, "ShulkerHammerOrange", "hammer_shulker_orange");
	public static final ItemBaseHammer hammerShulkerPink = new ItemShulkerHammerPink(HammerMaterial.SHULKER, "ShulkerHammerPink", "hammer_shulker_pink");
	public static final ItemBaseHammer hammerShulkerPurple = new ItemShulkerHammerPurple(HammerMaterial.SHULKER, "ShulkerHammerPurple", "hammer_shulker_purple");
	public static final ItemBaseHammer hammerShulkerRed = new ItemShulkerHammerRed(HammerMaterial.SHULKER, "ShulkerHammerRed", "hammer_shulker_red");
	public static final ItemBaseHammer hammerShulkerSilver = new ItemShulkerHammerSilver(HammerMaterial.SHULKER, "ShulkerHammerSilver", "hammer_shulker_silver");
	public static final ItemBaseHammer hammerShulkerWhite = new ItemShulkerHammerWhite(HammerMaterial.SHULKER, "ShulkerHammerWhite", "hammer_shulker_white");
	
	
	/*
	 * Hammers Using Ores from other mods
	 * **NOTE: REQUIRES Other mods to craft these hammers**
	 */
	public static final ItemBaseHammer hammerCopper = new ItemCopperHammer(HammerMaterial.DEFAULT, "CopperHammer", "copper_hammer");
	public static final ItemBaseHammer hammerBronze = new ItemBronzeHammer(HammerMaterial.DEFAULT, "BronzeHammer", "bronze_hammer");
	public static final ItemBaseHammer hammerTungsten = new ItemTungstenHammer(HammerMaterial.DEFAULT, "TungstenHammer", "tungsten_hammer");
	public static final ItemBaseHammer hammerRuby = new ItemRubyHammer(HammerMaterial.DEFAULT, "RubyHammer", "ruby_hammer");
	public static final ItemBaseHammer hammerTin = new ItemTinHammer(HammerMaterial.DEFAULT, "TinHammer", "tin_hammer");
	public static final ItemBaseHammer hammerSilver = new ItemSilverHammer(HammerMaterial.DEFAULT, "SilverHammer", "silver_hammer");
	public static final ItemBaseHammer hammerJade = new ItemJadeHammer(HammerMaterial.DEFAULT, "JadeHammer", "jade_hammer");
	public static final ItemBaseHammer hammerAmethyst = new ItemAmethystHammer(HammerMaterial.DEFAULT, "AmethystHammer", "amethyst_hammer");
	public static final ItemBaseHammer hammerGraphite = new ItemGraphiteHammer(HammerMaterial.DEFAULT, "GraphiteHammer", "graphite_hammer");
	public static final ItemBaseHammer hammerCitrine = new ItemCitrineHammer(HammerMaterial.DEFAULT, "CitrineHammer", "citrine_hammer");
	public static final ItemBaseHammer hammerPierre = new ItemPierreHammer(HammerMaterial.DEFAULT, "PierreHammer", "pierre_hammer");
	public static final ItemBaseHammer hammerSapphire = new ItemSapphireHammer(HammerMaterial.DEFAULT, "SapphireHammer", "sapphire_hammer");
	public static final ItemBaseHammer hammerOnyx = new ItemOnyxHammer(HammerMaterial.DEFAULT, "OnyxHammer", "onyx_hammer");
	public static final ItemBaseHammer hammerNikolite = new ItemNikoliteHammer(HammerMaterial.DEFAULT, "NikoliteHammer", "nikolite_hammer");
	public static final ItemBaseHammer hammerSilica = new ItemSilicaHammer(HammerMaterial.DEFAULT, "SilicaHammer", "silica_hammer");
	public static final ItemBaseHammer hammerCinnabar = new ItemCinnabarHammer(HammerMaterial.DEFAULT, "CinnabarHammer", "cinnabar_hammer");
	public static final ItemBaseHammer hammerAmber = new ItemAmberBearingStoneHammer(HammerMaterial.DEFAULT, "AmberHammer", "amber_hammer");
	public static final ItemBaseHammer hammerFerrous = new ItemFerrousHammer(HammerMaterial.DEFAULT, "FerrousHammer", "ferrous_hammer");
	public static final ItemBaseHammer hammerAdaminite = new ItemAdaminiteHammer(HammerMaterial.DEFAULT, "AdaminiteHammer", "adaminite_hammer");
	public static final ItemBaseHammer hammerShiny = new ItemShinyHammer(HammerMaterial.DEFAULT, "ShinyHammer", "shiny_hammer");
	public static final ItemBaseHammer hammerXychorium = new ItemXychoriumHammer(HammerMaterial.DEFAULT, "XychoriumHammer", "xychorium_hammer");
	public static final ItemBaseHammer hammerUranium = new ItemUraniumHammer(HammerMaterial.DEFAULT, "UraniumHammer", "uranium_hammer");
	public static final ItemBaseHammer hammerTitanium = new ItemTitaniumHammer(HammerMaterial.DEFAULT, "TitaniumHammer", "titanium_hammer");
	public static final ItemBaseHammer hammerBloodStone = new ItemBloodStoneHammer(HammerMaterial.DEFAULT, "BloodStoneHammer", "bloodstone_hammer");
	public static final ItemBaseHammer hammerRusted = new ItemRustedHammer(HammerMaterial.DEFAULT, "RustedHammer", "rusted_hammer");
	public static final ItemBaseHammer hammerRosite = new ItemRositeHammer(HammerMaterial.DEFAULT, "RositeHammer", "rosite_hammer");
	public static final ItemBaseHammer hammerLimonite = new ItemLimoniteHammer(HammerMaterial.DEFAULT, "LimoniteHammer", "limonite_hammer");
	public static final ItemBaseHammer hammerMithril = new ItemMithrilHammer(HammerMaterial.DEFAULT, "MithrilHammer", "mithril_hammer");
	public static final ItemBaseHammer hammerPrometheum = new ItemPrometheumHammer(HammerMaterial.DEFAULT, "PrometheumHammer", "prometheum_hammer");
	public static final ItemBaseHammer hammerHepatizon = new ItemHepatizonHammer(HammerMaterial.DEFAULT, "HepatizonHammer", "hepatizon_hammer");
	public static final ItemBaseHammer hammerPoop = new ItemPoopHammer(HammerMaterial.DEFAULT, "PoopHammer", "poop_hammer");
	public static final ItemBaseHammer hammerAngmallen = new ItemAngmallenHammer(HammerMaterial.DEFAULT, "AngmallenHammer", "angmallen_hammer");
	public static final ItemBaseHammer hammerManganese = new ItemManganeseHammer(HammerMaterial.DEFAULT, "ManganeseHammer", "manganese_hammer");
	public static final ItemBaseHammer hammerSearedBrick = new ItemSearedBrickHammer(HammerMaterial.DEFAULT, "SearedBrickHammer", "seared_brick_hammer");
	public static final ItemBaseHammer hammerElectrum = new ItemElectrumHammer(HammerMaterial.DEFAULT, "ElectrumHammer", "electrum_hammer");
	public static final ItemBaseHammer hammerPigIron = new ItemPigIronHammer(HammerMaterial.DEFAULT, "PigIronHammer", "pig_iron_hammer");
	public static final ItemBaseHammer hammerArdite = new ItemArditeHammer(HammerMaterial.DEFAULT, "ArditeHammer", "ardite_hammer");
	public static final ItemBaseHammer hammerAlumite = new ItemAlumiteHammer(HammerMaterial.DEFAULT, "AlumiteHammer", "alumite_hammer");
	public static final ItemBaseHammer hammerCobalt = new ItemCobaltHammer(HammerMaterial.DEFAULT, "CobaltHammer", "cobalt_hammer");
	public static final ItemBaseHammer hammerManyullyn = new ItemManyullynHammer(HammerMaterial.DEFAULT, "ManyullynHammer", "manyullyn_hammer");
	public static final ItemBaseHammer hammerOureclase = new ItemOureclaseHammer(HammerMaterial.DEFAULT, "OureclaseHammer", "oureclase_hammer");
	public static final ItemBaseHammer hammerHaderoth = new ItemHaderothHammer(HammerMaterial.DEFAULT, "HaderothHammer", "haderoth_hammer");
	public static final ItemBaseHammer hammerInfuscolium = new ItemInfuscoliumHammer(HammerMaterial.DEFAULT, "InfuscoliumHammer", "infuscolium_hammer");
	public static final ItemBaseHammer hammerRubber = new ItemRubberHammer(HammerMaterial.DEFAULT, "RubberHammer", "rubber_hammer");
	public static final ItemBaseHammer hammerDesichalkos = new ItemDesichalkosHammer(HammerMaterial.DEFAULT, "DesichalkosHammer", "desichalkos_hammer");
	public static final ItemBaseHammer hammerMeutoite = new ItemMeutoiteHammer(HammerMaterial.DEFAULT, "MeutoiteHammer", "meutoite_hammer");
	public static final ItemBaseHammer hammerEximite = new ItemEximiteHammer(HammerMaterial.DEFAULT, "EximiteHammer", "eximite_hammer");
	public static final ItemBaseHammer hammerMidasium = new ItemMidasiumHammer(HammerMaterial.DEFAULT, "MidasiumHammer", "midasium_hammer");
	public static final ItemBaseHammer hammerSanguinite = new ItemSanguiniteHammer(HammerMaterial.DEFAULT, "SanguiniteHammer", "sanguinite_hammer");
	public static final ItemBaseHammer hammerInolashite = new ItemInolashiteHammer(HammerMaterial.DEFAULT, "InolashiteHammer", "inolashite_hammer");
	public static final ItemBaseHammer hammerVulcanite = new ItemVulcaniteHammer(HammerMaterial.DEFAULT, "VulcaniteHammer", "vulcanite_hammer");
	public static final ItemBaseHammer hammerLemurite = new ItemLemuriteHammer(HammerMaterial.DEFAULT, "LemuriteHammer", "lemurite_hammer");
	public static final ItemBaseHammer hammerAmordrine = new ItemAmordrineHammer(HammerMaterial.DEFAULT, "AmordrineHammer", "amordrine_hammer");
	public static final ItemBaseHammer hammerCeruclase = new ItemCeruclaseHammer(HammerMaterial.DEFAULT, "CeruclaseHammer", "ceruclase_hammer");
	public static final ItemBaseHammer hammerKalendrite = new ItemKalendriteHammer(HammerMaterial.DEFAULT, "KalendriteHammer", "kalendrite_hammer");
	public static final ItemBaseHammer hammerVyroxeres = new ItemVyroxeresHammer(HammerMaterial.DEFAULT, "VyroxeresHammer", "vyroxeres_hammer");
	public static final ItemBaseHammer hammerCarmot = new ItemCarmotHammer(HammerMaterial.DEFAULT, "CarmotHammer", "carmot_hammer");
	public static final ItemBaseHammer hammerTartarite = new ItemTartariteHammer(HammerMaterial.DEFAULT, "TartariteHammer", "tartarite_hammer");
	public static final ItemBaseHammer hammerAtlarus = new ItemAtlarusHammer(HammerMaterial.DEFAULT, "AtlarusHammer", "atlarus_hammer");
	public static final ItemBaseHammer hammerAstral = new ItemAstralHammer(HammerMaterial.DEFAULT, "AstralHammer", "astral_hammer");
	public static final ItemBaseHammer hammerCelengil = new ItemCelenegilHammer(HammerMaterial.DEFAULT, "CelenegilHammer", "cenenegil_hammer");
	public static final ItemBaseHammer hammerAredrite = new ItemAredriteHammer(HammerMaterial.DEFAULT, "AredriteHammer", "aredrite_hammer");
	public static final ItemBaseHammer hammerOrichalcum = new ItemOrichalcumHammer(HammerMaterial.DEFAULT, "OrichalcumHammer", "orichalcum_hammer");
	
	/*
	 * Hammers For YouTubers
	 */
	public static final ItemBaseHammer hammerPat = new ItemPatHammer(HammerMaterial.PAT, "PatHammer", "pat_hammer");
	public static final ItemBaseHammer hammerJen = new ItemJenHammer(HammerMaterial.JEN, "JenHammer", "jen_hammer");
	public static final ItemBaseHammer hammerDanTDM = new ItemDanTDMHammer(HammerMaterial.TDM, "TDMHammer", "tdm_hammer");
	public static final ItemBaseHammer hammerJSQ = new ItemxJSQHammer(HammerMaterial.JSQ, "JSQHammer", "jsq_hammer");
	public static final ItemBaseHammer hammerSkyTheKid = new ItemSkyTheKidRSHammer(HammerMaterial.SKY, "SkyTheKidHammer", "sky_the_kid_hammer");
	public static final ItemBaseHammer hammerThack = new ItemThackAttack_MCHammer(HammerMaterial.TATTCKMC, "ThackHammer", "thack_attack_hammer");
	public static final ItemBaseHammer hammerMrGregor = new Item_MrGregor_Hammer(HammerMaterial.MRGREG, "MrGregorHammer", "mr_gregor_hammer");
	public static final ItemBaseHammer hammerMiningWorm = new ItemMiningWormHammer(HammerMaterial.MINEWORM, "MiningWormHammer", "mining_worm_hammer");
	/*
	 * Hammers For Twitch Streamers
	 */
	public static final ItemBaseHammer hammerDeeAxel = new ItemDeeAxelJayHammer(HammerMaterial.DAXEJ, "DeeAxelJayHammer", "deeaxeljay_hammer");
	
	/*
	 * Community Hammers
	 */
	public static final ItemBaseHammer hammerCryingObi = new ItemCryingObsidainHammer(HammerMaterial.CRYOBBY, "CryingObsidainHammer", "crying_obsidain_hammer");
	public static final ItemBaseHammer hammerToaster = new ItemToasterHammer(HammerMaterial.TOASTER, "ToasterHammer", "toaster_hammer");
	public static final ItemBaseHammer hammerPureDevil = new ItemPureDevilHammer(HammerMaterial.PUREDEVIL, "PureDevilHammer", "pure_devil_hammer");
	public static final ItemBaseHammer hammerLightning = new ItemLightningHammer(HammerMaterial.LIGHTNING, "LightningHammer", "lightning_hammer");
	/*
	 * Special Hammers
	 */
	public static final ItemBaseHammer hammerRainbow = new ItemRainbowHammer(HammerMaterial.RAINBOW, "RainbowHammer", "rainbow_hammer");
	public static final ItemBaseHammer hammerMissingTexture = new ItemMissingTextureHammer(HammerMaterial.MISSINGTEX, "MissingTextureHammer", "missing_texture_hammer");
	
	/*
	 * Mob Hammers
	 */
	public static final ItemBaseHammer hammerCreeper = new ItemCreeperHammer(HammerMaterial.CREEPER, "CreeperHammer", "creeper_hammer");
	public static final ItemBaseHammer hammerPig = new ItemPigHammer(HammerMaterial.PIG, "PigHammer", "pig_hammer");
	public static final ItemBaseHammer hammerCow = new ItemCowHammer(HammerMaterial.COW, "CowHammer", "cow_hammer");
	
	@SubscribeEvent
	  public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new Item [] {
			/*
		    * Basic Minecraft Hammers (Ex. Vannila Ores)
		    */
	    		hammerWood, hammerStone, hammerIron, hammerGold, hammerDiamond, hammerDirt, hammerGlass, hammerSand,
	    		hammerCactus, hammerGravel, hammerWoolBlack, hammerWoolRed, hammerWoolGreen, hammerWoolBrown, 
	    		hammerWoolBlue, hammerWoolPurple, hammerWoolCyan, hammerWoolSilver, hammerWoolGrey, hammerWoolPink, hammerWoolLime, 
	    		hammerWoolYellow, hammerWoolLightBlue, hammerWoolMagenta, hammerWoolOrange, hammerWoolWhite, hammerEmerald, 
	    		hammerGrass, hammerObsidian, hammerGlowstone, hammerRedstone, hammerLapis, hammerNetherack, hammerSoulsand, 
	    		hammerCoal, hammerCharcoal, hammerEndstone, hammerBone, hammerSponge, hammerBrick, hammerSugar, hammerSlime, 
	    		hammerMelon, hammerPumpkin, hammerPotato, hammerCarrot, hammerApple, hammerIce, hammerPackedIce, hammerSnow, 
	    		hammerCake, hammerDragonEgg, hammerTnt, hammerBedrock, hammerPurpur, hammerEndBricks, hammerChorus,
	    		hammerGranite, hammerAndesite, hammerClayBlack, hammerClayBlue, hammerClayBrown, hammerClayCyan, hammerClayGreen,
	    		hammerClayGrey, hammerClayLightBlue, hammerClayLime, hammerClayMagenta, hammerClayOrange, hammerClayPink,
	    		hammerClayPurple, hammerClayRed, hammerClaySilver, hammerClayWhite, hammerHay, hammerShulkerBlack, hammerShulkerBlue,
	    		hammerShulkerBrown, hammerShulkerCyan, hammerShulkerGreen, hammerShulkerGrey, hammerShulkerLightBlue, hammerShulkerLime,
	    		hammerShulkerMagenta, hammerShulkerOrange, hammerShulkerPink, hammerShulkerPurple, hammerShulkerRed, hammerShulkerSilver,
	    		hammerShulkerWhite,
	    			
	    		
			/*
			 * Hammers Using Ores from other mods
			 * **NOTE: REQUIRES Other mods to craft these hammers**
			 */
	    		hammerCopper, hammerBronze, hammerTungsten, hammerRuby, hammerTin, hammerSilver, hammerJade, hammerAmethyst, 
	    		hammerGraphite, hammerCitrine, hammerPierre, hammerSapphire, hammerOnyx, hammerNikolite, hammerSilica, 
	    		hammerCinnabar, hammerAmber, hammerFerrous, hammerAdaminite, hammerShiny, hammerXychorium, hammerUranium, 
	    		hammerTitanium, hammerBloodStone, hammerRusted, hammerRosite, hammerLimonite, hammerMithril, hammerPrometheum, 
	    		hammerHepatizon, hammerPoop, hammerAngmallen, hammerManganese, hammerSearedBrick, hammerElectrum, hammerPigIron, 
	    		hammerArdite, hammerAlumite, hammerCobalt, hammerManyullyn, hammerOureclase, hammerHaderoth, hammerInfuscolium, 
	    		hammerRubber, hammerDesichalkos, hammerMeutoite, hammerEximite, hammerMidasium, hammerSanguinite, hammerInolashite, 
	    		hammerVulcanite, hammerLemurite, hammerAmordrine, hammerCeruclase, hammerKalendrite, hammerVyroxeres, hammerCarmot, 
	    		hammerTartarite, hammerAtlarus, hammerAstral, hammerCelengil, hammerAredrite, hammerOrichalcum,
	    		
			/*
			 * Hammers For YouTubers
			 */
	    		hammerPat, hammerJen, hammerDanTDM, hammerJSQ, hammerSkyTheKid, hammerThack, hammerMrGregor, hammerMiningWorm,

			/*
			 * Hammers For Twitch Streamers
			 */
	    		hammerDeeAxel,
	    		
			/*
			 * Community Hammers
			 */
	    		hammerCryingObi, hammerToaster, hammerPureDevil, hammerLightning,
	    		
			/*
			 * Special Hammers
			 */
	    		hammerRainbow, hammerMissingTexture,
	    		
	    	/*
	    	 * Mob Hammers
	    	 */
	    		hammerCreeper, hammerPig, hammerCow
		});
		//event.getRegistry().registerAll(CustomHammerRegistry.registerHammers());
	  }
	
	@SubscribeEvent
	  public static void registerItemRenders(ModelRegistryEvent event)
	  {
		/*
		 * Basic Minecraft Hammers (Ex. Vannila Ores)
		 */
	    registerRender(hammerWood);
	    registerRender(hammerStone);
	    registerRender(hammerIron);
	    registerRender(hammerGold);
	    registerRender(hammerDiamond);
	    registerRender(hammerDirt);
	    registerRender(hammerGlass);
	    registerRender(hammerSand);
	    registerRender(hammerCactus);
	    registerRender(hammerGravel);
	    registerRender(hammerWoolWhite);
		registerRender(hammerWoolBlack);
		registerRender(hammerWoolRed);
		registerRender(hammerWoolGreen);
		registerRender(hammerWoolBrown);
		registerRender(hammerWoolBlue);
		registerRender(hammerWoolPurple);
		registerRender(hammerWoolCyan);
		registerRender(hammerWoolSilver);
		registerRender(hammerWoolGrey);
		registerRender(hammerWoolPink);
		registerRender(hammerWoolLime);
		registerRender(hammerWoolYellow);
		registerRender(hammerWoolLightBlue);
		registerRender(hammerWoolMagenta);
		registerRender(hammerWoolOrange);
	    registerRender(hammerEmerald);
	    registerRender(hammerGrass);
	    registerRender(hammerObsidian);
	    registerRender(hammerGlowstone);
	    registerRender(hammerRedstone);
	    registerRender(hammerLapis);
	    registerRender(hammerNetherack);
	    registerRender(hammerSoulsand);
	    registerRender(hammerCoal);
	    registerRender(hammerCharcoal);
	    registerRender(hammerEndstone);
	    registerRender(hammerBone);
	    registerRender(hammerSponge);
	    registerRender(hammerBrick);
	    registerRender(hammerSugar);
	    registerRender(hammerSlime);
	    registerRender(hammerMelon);
	    registerRender(hammerPumpkin);
	    registerRender(hammerPotato);
	    registerRender(hammerCarrot);
	    registerRender(hammerApple);
	    registerRender(hammerIce);
	    registerRender(hammerPackedIce);
	    registerRender(hammerSnow);
	    registerRender(hammerCake);
	    registerRender(hammerDragonEgg);
	    registerRender(hammerTnt);
	    registerRender(hammerBedrock);
	    registerRender(hammerPurpur);
	    registerRender(hammerEndBricks);
	    registerRender(hammerChorus);
	    registerRender(hammerGranite);
	    registerRender(hammerAndesite);
	    registerRender(hammerClayBlack);
	    registerRender(hammerClayBlue);
	    registerRender(hammerClayBrown);
	    registerRender(hammerClayCyan);
	    registerRender(hammerClayGreen);
	    registerRender(hammerClayGrey);
	    registerRender(hammerClayLightBlue);
	    registerRender(hammerClayLime);
	    registerRender(hammerClayMagenta);
	    registerRender(hammerClayOrange);
	    registerRender(hammerClayPink);
	    registerRender(hammerClayPurple);
	    registerRender(hammerClayRed);
	    registerRender(hammerClaySilver);
	    registerRender(hammerClayWhite);
	    registerRender(hammerHay);
	    registerRender(hammerShulkerBlack);
	    registerRender(hammerShulkerBlue);
	    registerRender(hammerShulkerBrown);
	    registerRender(hammerShulkerCyan);
	    registerRender(hammerShulkerGreen);
	    registerRender(hammerShulkerGrey);
	    registerRender(hammerShulkerLightBlue);
	    registerRender(hammerShulkerLime);
	    registerRender(hammerShulkerMagenta);
	    registerRender(hammerShulkerOrange);
	    registerRender(hammerShulkerPink);
	    registerRender(hammerShulkerPurple);
	    registerRender(hammerShulkerRed);
	    registerRender(hammerShulkerSilver);
	    registerRender(hammerShulkerWhite);
	    	
	    /*
		 * Hammers Using Ores from other mods
		 * **NOTE: REQUIRES Other mods to craft these hammers**
		 */
	    registerRender(hammerCopper);
	    registerRender(hammerBronze);
	    registerRender(hammerTungsten);
	    registerRender(hammerRuby);
	    registerRender(hammerTin);
	    registerRender(hammerSilver);
	    registerRender(hammerJade);
	    registerRender(hammerAmethyst);
	    registerRender(hammerGraphite);
	    registerRender(hammerCitrine);
	    registerRender(hammerPierre);
	    registerRender(hammerSapphire);
	    registerRender(hammerOnyx);
	    registerRender(hammerNikolite);
	    registerRender(hammerSilica);
	    registerRender(hammerCinnabar);
	    registerRender(hammerAmber);
	    registerRender(hammerFerrous);
	    registerRender(hammerAdaminite);
	    registerRender(hammerShiny);
	    registerRender(hammerXychorium);
	    registerRender(hammerUranium);
	    registerRender(hammerTitanium);
	    registerRender(hammerBloodStone);
	    registerRender(hammerRusted);
	    registerRender(hammerRosite);
	    registerRender(hammerLimonite);
	    registerRender(hammerMithril);
	    registerRender(hammerPrometheum);
	    registerRender(hammerHepatizon);
	    registerRender(hammerPoop);
	    registerRender(hammerAngmallen);
	    registerRender(hammerManganese);
	    registerRender(hammerSearedBrick);
	    registerRender(hammerElectrum);
	    registerRender(hammerPigIron);
	    registerRender(hammerArdite);
	    registerRender(hammerAlumite);
	    registerRender(hammerCobalt);
	    registerRender(hammerManyullyn);
	    registerRender(hammerOureclase);
	    registerRender(hammerHaderoth);
	    registerRender(hammerInfuscolium);
	    registerRender(hammerRubber);
	    registerRender(hammerDesichalkos);
	    registerRender(hammerMeutoite);
	    registerRender(hammerEximite);
	    registerRender(hammerMidasium);
	    registerRender(hammerSanguinite);
	    registerRender(hammerInolashite);
	    registerRender(hammerVulcanite);
	    registerRender(hammerLemurite);
	    registerRender(hammerAmordrine);
	    registerRender(hammerCeruclase);
	    registerRender(hammerKalendrite);
	    registerRender(hammerVyroxeres);
	    registerRender(hammerCarmot);
	    registerRender(hammerTartarite);
	    registerRender(hammerAtlarus);
	    registerRender(hammerAstral);
	    registerRender(hammerCelengil);
	    registerRender(hammerAredrite);
	    registerRender(hammerOrichalcum);
	    
		/*
		 * Hammers For YouTubers
		 */
		registerRender(hammerPat);
		registerRender(hammerJen);
		registerRender(hammerDanTDM);
		registerRender(hammerJSQ);
		registerRender(hammerSkyTheKid);
		registerRender(hammerThack);
		registerRender(hammerMrGregor);
		registerRender(hammerMiningWorm);
		
		/*
		 * Hammers For Twitch Streamers
		 */
		registerRender(hammerDeeAxel);
		
		/*
		 * Community Hammers
		 */
		registerRender(hammerCryingObi);
		registerRender(hammerToaster);
		registerRender(hammerPureDevil);
		registerRender(hammerLightning);
		
		/*
		 * Special Hammers
		 */
		registerRender(hammerRainbow);
		registerRender(hammerMissingTexture);
    		
    	/*
    	 * Mob Hammers
    	 */
		registerRender(hammerCreeper);
		registerRender(hammerPig);
		registerRender(hammerCow);
		
	  }
	
	public static void registerRender(Item item) {
	   ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(item.getRegistryName().toString()), "inventory"));
	   
		   if(Config.debugMode == true) {
	       	System.out.println("Registered Model for: " + item.getRegistryName());
	       	//System.out.println("Registered Model for: " + ItemWoodHammer.registryName);
   		}
	}
	
}