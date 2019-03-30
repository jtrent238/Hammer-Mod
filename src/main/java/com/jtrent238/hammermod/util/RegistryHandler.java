package com.jtrent238.hammermod.util;

import com.jtrent238.hammermod.Main;
import com.jtrent238.hammermod.ModItems;
import com.jtrent238.hammermod.items.hammers.ItemBaseHammer;
import com.jtrent238.hammermod.items.hammers.ItemStoneHammer;
import com.jtrent238.hammermod.items.hammers.ItemWoodHammer;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

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
	//private static int  C1 = Main.CUSTOM_HAMMER_1_MATERIALMODIFIER.getInt();
	
//	 @SubscribeEvent
//	    public static void registerItems(Register<Item> event) {
//	    	
//	    	final Item[] items = {
//	    			new ItemWoodHammer(null),
//	    			new ItemStoneHammer(null)
//	    	};
//	    	 
//	        event.getRegistry().registerAll(items);
//	    }
	 
}
