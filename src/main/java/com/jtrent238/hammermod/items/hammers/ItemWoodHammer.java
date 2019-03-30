package com.jtrent238.hammermod.items.hammers;

import com.jtrent238.hammermod.Config;
import com.jtrent238.hammermod.Main;
import com.jtrent238.hammermod.util.ModelRegistryHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemWoodHammer extends ItemBaseHammer{
	
	public ItemWoodHammer(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material, registryName, unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
	}

	
}
