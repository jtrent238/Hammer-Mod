package com.jtrent238.hammermod.util;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;

import com.jtrent238.hammermod.Config;
import com.jtrent238.hammermod.Main;
import com.jtrent238.hammermod.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootHandler {

	LootHandler(){
		addToChests(null);
	}

	public static void registerLoot() {
		addToChests(null);
	}
	
	@SubscribeEvent
	public static void addToChests(final LootTableLoadEvent event) {

//		int numHammers = Main.numHammers;
//		for (int i = 0; i < numHammers ; i++) {
//			
//				if(Config.DEBUG_MODE == true) {
//					Main.logger.log(Level.INFO,"DEBUG: Injected Hammer with ID " + i + " into the Minecraft LootChests.");
//				}
//				
//	            if(event.getName().equals(LootTableList.CHESTS_ABANDONED_MINESHAFT)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_DESERT_PYRAMID)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_END_CITY_TREASURE)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_IGLOO_CHEST)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_JUNGLE_TEMPLE)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_NETHER_BRIDGE)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_SPAWN_BONUS_CHEST)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_STRONGHOLD_CORRIDOR)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_STRONGHOLD_CROSSING)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_STRONGHOLD_LIBRARY)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_VILLAGE_BLACKSMITH)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.CHESTS_WOODLAND_MANSION)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.GAMEPLAY_FISHING_TREASURE)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//	            if(event.getName().equals(LootTableList.GAMEPLAY_FISHING_JUNK)) {
//	            	
//	                event.getTable().getPool("main").addEntry(new LootEntryItem(ModItems.hammers.get(i).getItem(), 100, 50, new LootFunction[0], new LootCondition[0], Main.MODID + ":loot_" + ModItems.hammers.get(i)));
//	            }
//	            
//		}
		
	}
	
}
