package com.jtrent238.hammermod.util;

import java.util.ArrayList;

import com.jtrent238.hammermod.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HammerHandler {

	public static ArrayList<ItemStack> hammers = new ArrayList<ItemStack>();
	

	public static void addHammersToArray(Item[] items) {
		
		/*
		 * Basic Minecraft Hammers (Ex. Vannila Ores)
		 */
	    hammers.add(new ItemStack(ModItems.hammerWood));
	    hammers.add(new ItemStack(ModItems.hammerStone));
	    hammers.add(new ItemStack(ModItems.hammerIron));
	    hammers.add(new ItemStack(ModItems.hammerGold));
	    hammers.add(new ItemStack(ModItems.hammerDiamond));
	    hammers.add(new ItemStack(ModItems.hammerDirt));
	    hammers.add(new ItemStack(ModItems.hammerGlass));
	    hammers.add(new ItemStack(ModItems.hammerSand));
	    hammers.add(new ItemStack(ModItems.hammerCactus));
	    hammers.add(new ItemStack(ModItems.hammerGravel));
	    hammers.add(new ItemStack(ModItems.hammerWoolWhite));
		hammers.add(new ItemStack(ModItems.hammerWoolBlack));
		hammers.add(new ItemStack(ModItems.hammerWoolRed));
		hammers.add(new ItemStack(ModItems.hammerWoolGreen));
		hammers.add(new ItemStack(ModItems.hammerWoolBrown));
		hammers.add(new ItemStack(ModItems.hammerWoolBlue));
		hammers.add(new ItemStack(ModItems.hammerWoolPurple));
		hammers.add(new ItemStack(ModItems.hammerWoolCyan));
		hammers.add(new ItemStack(ModItems.hammerWoolSilver));
		hammers.add(new ItemStack(ModItems.hammerWoolGrey));
		hammers.add(new ItemStack(ModItems.hammerWoolPink));
		hammers.add(new ItemStack(ModItems.hammerWoolLime));
		hammers.add(new ItemStack(ModItems.hammerWoolYellow));
		hammers.add(new ItemStack(ModItems.hammerWoolLightBlue));
		hammers.add(new ItemStack(ModItems.hammerWoolMagenta));
		hammers.add(new ItemStack(ModItems.hammerWoolOrange));
	    hammers.add(new ItemStack(ModItems.hammerEmerald));
	    hammers.add(new ItemStack(ModItems.hammerGrass));
	    hammers.add(new ItemStack(ModItems.hammerObsidian));
	    hammers.add(new ItemStack(ModItems.hammerGlowstone));
	    hammers.add(new ItemStack(ModItems.hammerRedstone));
	    hammers.add(new ItemStack(ModItems.hammerLapis));
	    hammers.add(new ItemStack(ModItems.hammerNetherack));
	    hammers.add(new ItemStack(ModItems.hammerSoulsand));
	    hammers.add(new ItemStack(ModItems.hammerCoal));
	    hammers.add(new ItemStack(ModItems.hammerCharcoal));
	    hammers.add(new ItemStack(ModItems.hammerEndstone));
	    hammers.add(new ItemStack(ModItems.hammerBone));
	    hammers.add(new ItemStack(ModItems.hammerSponge));
	    hammers.add(new ItemStack(ModItems.hammerBrick));
	    hammers.add(new ItemStack(ModItems.hammerSugar));
	    hammers.add(new ItemStack(ModItems.hammerSlime));
	    hammers.add(new ItemStack(ModItems.hammerMelon));
	    hammers.add(new ItemStack(ModItems.hammerPumpkin));
	    hammers.add(new ItemStack(ModItems.hammerPotato));
	    hammers.add(new ItemStack(ModItems.hammerCarrot));
	    hammers.add(new ItemStack(ModItems.hammerApple));
	    hammers.add(new ItemStack(ModItems.hammerIce));
	    hammers.add(new ItemStack(ModItems.hammerPackedIce));
	    hammers.add(new ItemStack(ModItems.hammerSnow));
	    hammers.add(new ItemStack(ModItems.hammerCake));
	    hammers.add(new ItemStack(ModItems.hammerDragonEgg));
	    hammers.add(new ItemStack(ModItems.hammerTnt));
	    hammers.add(new ItemStack(ModItems.hammerBedrock));
	    hammers.add(new ItemStack(ModItems.hammerPurpur));
	    hammers.add(new ItemStack(ModItems.hammerEndBricks));
	    hammers.add(new ItemStack(ModItems.hammerChorus));
	    hammers.add(new ItemStack(ModItems.hammerGranite));
	    hammers.add(new ItemStack(ModItems.hammerAndesite));
	    hammers.add(new ItemStack(ModItems.hammerClayBlack));
	    hammers.add(new ItemStack(ModItems.hammerClayBlue));
	    hammers.add(new ItemStack(ModItems.hammerClayBrown));
	    hammers.add(new ItemStack(ModItems.hammerClayCyan));
	    hammers.add(new ItemStack(ModItems.hammerClayGreen));
	    hammers.add(new ItemStack(ModItems.hammerClayGrey));
	    hammers.add(new ItemStack(ModItems.hammerClayLightBlue));
	    hammers.add(new ItemStack(ModItems.hammerClayLime));
	    hammers.add(new ItemStack(ModItems.hammerClayMagenta));
	    hammers.add(new ItemStack(ModItems.hammerClayOrange));
	    hammers.add(new ItemStack(ModItems.hammerClayPink));
	    hammers.add(new ItemStack(ModItems.hammerClayPurple));
	    hammers.add(new ItemStack(ModItems.hammerClayRed));
	    hammers.add(new ItemStack(ModItems.hammerClaySilver));
	    hammers.add(new ItemStack(ModItems.hammerClayWhite));
	    hammers.add(new ItemStack(ModItems.hammerHay));
	    hammers.add(new ItemStack(ModItems.hammerShulkerBlack));
	    hammers.add(new ItemStack(ModItems.hammerShulkerBlue));
	    hammers.add(new ItemStack(ModItems.hammerShulkerBrown));
	    hammers.add(new ItemStack(ModItems.hammerShulkerCyan));
	    hammers.add(new ItemStack(ModItems.hammerShulkerGreen));
	    hammers.add(new ItemStack(ModItems.hammerShulkerGrey));
	    hammers.add(new ItemStack(ModItems.hammerShulkerLightBlue));
	    hammers.add(new ItemStack(ModItems.hammerShulkerLime));
	    hammers.add(new ItemStack(ModItems.hammerShulkerMagenta));
	    hammers.add(new ItemStack(ModItems.hammerShulkerOrange));
	    hammers.add(new ItemStack(ModItems.hammerShulkerPink));
	    hammers.add(new ItemStack(ModItems.hammerShulkerPurple));
	    hammers.add(new ItemStack(ModItems.hammerShulkerRed));
	    hammers.add(new ItemStack(ModItems.hammerShulkerSilver));
	    hammers.add(new ItemStack(ModItems.hammerShulkerWhite));
	    	
	    
	    /*
		 * Hammers Using Ores from other mods
		 * **NOTE: REQUIRES Other mods to craft these hammers**
		 */
	    hammers.add(new ItemStack(ModItems.hammerCopper));
	    hammers.add(new ItemStack(ModItems.hammerBronze));
	    hammers.add(new ItemStack(ModItems.hammerTungsten));
	    hammers.add(new ItemStack(ModItems.hammerRuby));
	    hammers.add(new ItemStack(ModItems.hammerTin));
	    hammers.add(new ItemStack(ModItems.hammerSilver));
	    hammers.add(new ItemStack(ModItems.hammerJade));
	    hammers.add(new ItemStack(ModItems.hammerAmethyst));
	    hammers.add(new ItemStack(ModItems.hammerGraphite));
	    hammers.add(new ItemStack(ModItems.hammerCitrine));
	    hammers.add(new ItemStack(ModItems.hammerPierre));
	    hammers.add(new ItemStack(ModItems.hammerSapphire));
	    hammers.add(new ItemStack(ModItems.hammerOnyx));
	    hammers.add(new ItemStack(ModItems.hammerNikolite));
	    hammers.add(new ItemStack(ModItems.hammerSilica));
	    hammers.add(new ItemStack(ModItems.hammerCinnabar));
	    hammers.add(new ItemStack(ModItems.hammerAmber));
	    hammers.add(new ItemStack(ModItems.hammerFerrous));
	    hammers.add(new ItemStack(ModItems.hammerAdaminite));
	    hammers.add(new ItemStack(ModItems.hammerShiny));
	    hammers.add(new ItemStack(ModItems.hammerXychorium));
	    hammers.add(new ItemStack(ModItems.hammerUranium));
	    hammers.add(new ItemStack(ModItems.hammerTitanium));
	    hammers.add(new ItemStack(ModItems.hammerBloodStone));
	    hammers.add(new ItemStack(ModItems.hammerRusted));
	    hammers.add(new ItemStack(ModItems.hammerRosite));
	    hammers.add(new ItemStack(ModItems.hammerLimonite));
	    hammers.add(new ItemStack(ModItems.hammerMithril));
	    hammers.add(new ItemStack(ModItems.hammerPrometheum));
	    hammers.add(new ItemStack(ModItems.hammerHepatizon));
	    hammers.add(new ItemStack(ModItems.hammerPoop));
	    hammers.add(new ItemStack(ModItems.hammerAngmallen));
	    hammers.add(new ItemStack(ModItems.hammerManganese));
	    hammers.add(new ItemStack(ModItems.hammerSearedBrick));
	    hammers.add(new ItemStack(ModItems.hammerElectrum));
	    hammers.add(new ItemStack(ModItems.hammerPigIron));
	    hammers.add(new ItemStack(ModItems.hammerArdite));
	    hammers.add(new ItemStack(ModItems.hammerAlumite));
	    hammers.add(new ItemStack(ModItems.hammerCobalt));
	    hammers.add(new ItemStack(ModItems.hammerManyullyn));
	    hammers.add(new ItemStack(ModItems.hammerOureclase));
	    hammers.add(new ItemStack(ModItems.hammerHaderoth));
	    hammers.add(new ItemStack(ModItems.hammerInfuscolium));
	    hammers.add(new ItemStack(ModItems.hammerRubber));
	    hammers.add(new ItemStack(ModItems.hammerDesichalkos));
	    hammers.add(new ItemStack(ModItems.hammerMeutoite));
	    hammers.add(new ItemStack(ModItems.hammerEximite));
	    hammers.add(new ItemStack(ModItems.hammerMidasium));
	    hammers.add(new ItemStack(ModItems.hammerSanguinite));
	    hammers.add(new ItemStack(ModItems.hammerInolashite));
	    hammers.add(new ItemStack(ModItems.hammerVulcanite));
	    hammers.add(new ItemStack(ModItems.hammerLemurite));
	    hammers.add(new ItemStack(ModItems.hammerAmordrine));
	    hammers.add(new ItemStack(ModItems.hammerCeruclase));
	    hammers.add(new ItemStack(ModItems.hammerKalendrite));
	    hammers.add(new ItemStack(ModItems.hammerVyroxeres));
	    hammers.add(new ItemStack(ModItems.hammerCarmot));
	    hammers.add(new ItemStack(ModItems.hammerTartarite));
	    hammers.add(new ItemStack(ModItems.hammerAtlarus));
	    hammers.add(new ItemStack(ModItems.hammerAstral));
	    hammers.add(new ItemStack(ModItems.hammerCelengil));
	    hammers.add(new ItemStack(ModItems.hammerAredrite));
	    hammers.add(new ItemStack(ModItems.hammerOrichalcum));
	    
		/*
		 * Hammers For YouTubers
		 */
		hammers.add(new ItemStack(ModItems.hammerPat));
		hammers.add(new ItemStack(ModItems.hammerJen));
		hammers.add(new ItemStack(ModItems.hammerDanTDM));
		hammers.add(new ItemStack(ModItems.hammerJSQ));
		hammers.add(new ItemStack(ModItems.hammerSkyTheKid));
		hammers.add(new ItemStack(ModItems.hammerThack));
		hammers.add(new ItemStack(ModItems.hammerMrGregor));
		hammers.add(new ItemStack(ModItems.hammerMiningWorm));
		
		/*
		 * Hammers For Twitch Streamers
		 */
		hammers.add(new ItemStack(ModItems.hammerDeeAxel));
		/*
		 * Community Hammers
		 */
		hammers.add(new ItemStack(ModItems.hammerCryingObi));
		hammers.add(new ItemStack(ModItems.hammerToaster));
		hammers.add(new ItemStack(ModItems.hammerPureDevil));
		hammers.add(new ItemStack(ModItems.hammerLightning));
		
		/*
		 * Special Hammers
		 */
		hammers.add(new ItemStack(ModItems.hammerRainbow));
		hammers.add(new ItemStack(ModItems.hammerMissingTexture));
    		
    	/*
    	 * Mob Hammers
    	 */
		hammers.add(new ItemStack(ModItems.hammerCreeper));
		hammers.add(new ItemStack(ModItems.hammerPig));
		hammers.add(new ItemStack(ModItems.hammerCow));
	}
}
