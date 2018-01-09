package com.jtrent238.hammermod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemToast extends ItemFood{

	public ItemToast(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setPotionEffect(Potion.digSpeed.id, 5, 5, 0.5F); //potion effect, duration, effect level, probability of effect (1.0F = always, 0.0F = never)
		
	}

}
