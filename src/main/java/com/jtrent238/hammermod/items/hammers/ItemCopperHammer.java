package com.jtrent238.hammermod.items.hammers;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemCopperHammer extends ItemBaseHammer{

	private float damageVsEntity;
	private Object toolMaterial;

	public ItemCopperHammer(float p_i45333_1_, Item.ToolMaterial p_i45333_2_, int i){
		this.toolMaterial = ToolMaterial.IRON;
		this.setMaxDamage(p_i45333_2_.getMaxUses());
		this.efficiencyOnProperMaterial = p_i45333_2_.getEfficiencyOnProperMaterial();
        this.damageVsEntity = p_i45333_1_ + p_i45333_2_.getDamageVsEntity();
	}
}
