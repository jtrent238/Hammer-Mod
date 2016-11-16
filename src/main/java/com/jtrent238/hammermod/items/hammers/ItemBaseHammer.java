package com.jtrent238.hammermod.items.hammers;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class ItemBaseHammer extends ItemPickaxe {

	protected float efficiencyOnProperMaterial;
	private Object toolMaterial;
	private Block blockMined;
	private World world;
	private int x;
	private int y;
	private int z;
	private int metadata;
	private int fortune;
	private int damageVsEntity;
	private int hammerMaterial;

	
	protected ItemBaseHammer(ToolMaterial material) {
        super(material);
        this.maxStackSize = 1;
		this.damageVsEntity = hammerMaterial * 2;
        }
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "sword");
	}
	
	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.stone});
	{
		
	if(blockMined == Blocks.stone){
		(Blocks.stone).getDrops(world, x, y, z, metadata, fortune);
	}
}
	
}
