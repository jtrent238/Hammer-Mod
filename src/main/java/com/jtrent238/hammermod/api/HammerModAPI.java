package com.jtrent238.hammermod.api;

import com.jtrent238.hammermod.Main;
import com.jtrent238.hammermod.ModItems;
import com.jtrent238.hammermod.items.materials.HammerMaterial;

import net.minecraft.item.Item;

public class HammerModAPI {

	/**
	 * Add a new Hammer Material
	 * @param material
	 * @param harvestLevel
	 * @param durability
	 * @param miningSpeed
	 * @param damageVsEntities
	 * @param enchantability
	 */
	public static void addHammerMaterial(String material, int harvestLevel,  int durability,  int miningSpeed,  int damageVsEntities,  int enchantability) {
		HammerMaterial.addHammerMaterial(material, harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	}
	
	/**
	 * Register Hammer
	 */
	public static void registerHammer(HammerMaterial hammerMaterial, String unlocalizedName, String registryName) {
			
	}
	
	/**
	 * Register Hammer Render
	 * @param hammer
	 */
	public static void registerHammerRender(Item hammer) {
		ModItems.registerRender(hammer);
	}
	
}
