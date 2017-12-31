package com.jtrent238.hammermod;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootRegistry {

	public ArrayList<ItemStack> hammers = new ArrayList<ItemStack>();

	LootRegistry(){
		addHammersasLoot();

	}

	private void addHammersasLoot() {
		hammers.add(new ItemStack(ItemLoader.Item_MrGregor_Hammer));
	}

	private void addToChests() {
		for (int i = 0; i < 20; i++) {
			//=========VILLAGE_BLACKSMITH Start========================================
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(hammers.get(0), 0, 1, 1));
			
		 }
		
	}
	
}
