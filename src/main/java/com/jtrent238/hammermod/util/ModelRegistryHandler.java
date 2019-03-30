package com.jtrent238.hammermod.util;

import com.jtrent238.hammermod.Config;
import com.jtrent238.hammermod.Main;
import com.jtrent238.hammermod.ModItems;
import com.jtrent238.hammermod.items.hammers.ItemWoodHammer;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModelRegistryHandler {

	@SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    	
    	// ** ITEMS **
		registerModel(ModItems.hammerWood);
		registerModel(ModItems.hammerStone);
		
		// ** BLOCKS **
        	// I have no blocks in this mod
	}
	
	
	public static void registerModel(Item item) {
        //ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		//ModelLoader.setCustomModelResourceLocation(ModItems.hammerWood, 0, new ModelResourceLocation(ItemWoodHammer.registryName, "inventory"));
        
        if(Config.debugMode == true) {
        	//System.out.println("Registered Model for: " + item.getUnlocalizedName());
        	//System.out.println("Registered Model for: " + ItemWoodHammer.registryName);
    	}
    }
 
}
