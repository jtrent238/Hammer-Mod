package com.jtrent238.hammermod.items.materials;

import com.jtrent238.hammermod.Main;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class HammerMaterial {

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
	private static int RAINBOW_MULTIPLIER = Main.numHammers;	//Rainbow Multiplier
	//private static int  C1 = HammerMod.CUSTOM_HAMMER_1_MATERIALMODIFIER.getInt();
	
	//public static ToolMaterial MATERIAL_NAME = EnumHelper.addToolMaterial("MATERIAL_NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	
	public static ToolMaterial DEFAULT = EnumHelper.addToolMaterial("DEFAULT", 3, 1561, 8.0F, 3.0F, 10); // Default material Based on Diamond Level
	
	public static ToolMaterial WOOD = ToolMaterial.WOOD;
	public static ToolMaterial STONE = ToolMaterial.STONE;
	public static ToolMaterial IRON = ToolMaterial.IRON;
	public static ToolMaterial DIAMOND = ToolMaterial.DIAMOND;
	public static ToolMaterial GOLD = ToolMaterial.GOLD;
	
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
	public static ToolMaterial LAPIS = EnumHelper.addToolMaterial("LAPIS", 1, 125, 2.5F, 2.0F, 8);
	public static ToolMaterial NETHERACK = EnumHelper.addToolMaterial("NETHERACK", 1, 400, 5.0F, 2.0F, 8);
	public static ToolMaterial SOULSAND = EnumHelper.addToolMaterial("SOULSAND", 1, 60, 2.0F, 1.0F, 5);
	public static ToolMaterial COAL = EnumHelper.addToolMaterial("COAL", 1, 450, 2.0F, 1.0F, 4);
	public static ToolMaterial DRAGEGG = EnumHelper.addToolMaterial("DRAGEGG", 3 * deM, 1561 * deM, 8.0F * deM, 3.0F * deM, 10 * deM);
	public static ToolMaterial TNT = EnumHelper.addToolMaterial("TNT", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial BEDROCK = EnumHelper.addToolMaterial("BEDROCK", 3 * brM, 1561 * brM, 8.0F * brM, 3.0F * brM, 10 * brM);
	public static ToolMaterial CHARCOAL = EnumHelper.addToolMaterial("CHARCOAL", 1, 450, 2.0F, 1.0F, 4);
	public static ToolMaterial ENDSTONE = ToolMaterial.STONE;
	public static ToolMaterial GRANITE = ToolMaterial.STONE;
	public static ToolMaterial ANDESITE = ToolMaterial.STONE;
	
	// TO BE FILLED IN LATER
	
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
	public static ToolMaterial PURPUR = EnumHelper.addToolMaterial("PURPUR", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial ENDBRICKS = EnumHelper.addToolMaterial("ENDBRICKS", 3, 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial CHORUS = EnumHelper.addToolMaterial("CHORUS", 3, 1561, 8.0F, 3.0F, 10);

	
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
	public static ToolMaterial MINEWORM = EnumHelper.addToolMaterial("MINEWORM", 3 * YT, 1561 * YT, 8.0F * YT, 3.0F * YT, 10 * YT);
	
	public static ToolMaterial DAXEJ = EnumHelper.addToolMaterial("DAXEJ", 3 * TWITCH, 1561 * TWITCH, 8.0F * TWITCH, 3.0F * TWITCH, 10 * TWITCH);
	public static ToolMaterial INCAPGAMER = EnumHelper.addToolMaterial("INCAPGAMER", 3 * TWITCH, 1561 * TWITCH, 8.0F * TWITCH, 3.0F * TWITCH, 10 * TWITCH);
	
	public static ToolMaterial CRYOBBY = EnumHelper.addToolMaterial("CRYOBBY", 3, 8000, 6, 6, 10);
	public static ToolMaterial MYTHICAL = EnumHelper.addToolMaterial("MYTHICAL", 3, 500, 10, 15, 5);
	public static ToolMaterial TOASTER = EnumHelper.addToolMaterial("TOASTER", 1, 30000, 1000, (float) 0.5, 10);
	public static ToolMaterial PUREDEVIL = EnumHelper.addToolMaterial("PUREDEVIL", 3, 5000, 12, 15, 20);
	public static ToolMaterial LIGHTNING = EnumHelper.addToolMaterial("LIGHTNING", 3, 2048, 6, 5, 10);
	
	public static ToolMaterial RAINBOW = EnumHelper.addToolMaterial("RAINBOW", 3 * RAINBOW_MULTIPLIER, 1561 * RAINBOW_MULTIPLIER, 8.0F * RAINBOW_MULTIPLIER, 3.0F * RAINBOW_MULTIPLIER, 10 * RAINBOW_MULTIPLIER);
	public static ToolMaterial MISSINGTEX = EnumHelper.addToolMaterial("MISSINGTEX", 3 * RAINBOW_MULTIPLIER / 2, 1561 * RAINBOW_MULTIPLIER / 2, 8.0F * RAINBOW_MULTIPLIER / 2, 3.0F * RAINBOW_MULTIPLIER / 2, 10 * RAINBOW_MULTIPLIER / 2);
	
	//public static ToolMaterial CUSTOM_1 = EnumHelper.addToolMaterial("CUSTOM_1", 3 * C1, 1561 * C1, 8.0F * C1, 3.0F * C1, 10 * C1);
	
}
