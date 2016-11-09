package com.jtrent238.hammermod.items.hammers;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.ForgeHooks;

public class ItemBaseHammer extends Item{

	private static Object ToolMaterial;
	protected float efficiencyOnProperMaterial;
	private Object toolMaterial;
	
	protected ItemBaseHammer(){
		super();
		this.setFull3D();
		this.maxStackSize = 1;
	}

}
