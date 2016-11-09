package com.jtrent238.hammermod.items.hammers;

import java.util.Set;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ItemWoodHammer extends ItemBaseHammer{

	private static ToolMaterial toolMaterial;
	private float damageVsEntity;

	public ItemWoodHammer(float p_i45333_1_, Item.ToolMaterial p_i45333_2_, int i){
		this.toolMaterial = ToolMaterial.WOOD;
		this.setMaxDamage(p_i45333_2_.getMaxUses());
		this.efficiencyOnProperMaterial = p_i45333_2_.getEfficiencyOnProperMaterial();
        this.damageVsEntity = p_i45333_1_ + p_i45333_2_.getDamageVsEntity();
	}

	
}
