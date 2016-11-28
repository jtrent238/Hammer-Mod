package com.jtrent238.hammermod.items.hammers;

import com.jtrent238.hammermod.Achievements;
import com.jtrent238.hammermod.Stats;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCreeperHammer extends ItemBaseHammer{


	public ItemCreeperHammer(ToolMaterial material) {
		super(material);
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer entityplayer)
    {
		
	if (entityplayer.inventory.hasItem(Items.gunpowder) == true){
			
		if(!world.isRemote)
			{
				
			entityplayer.inventory.consumeInventoryItem(Items.gunpowder);
			
    		EntityTNTPrimed par1 = new EntityTNTPrimed(world);
    		par1.setPosition(entityplayer.posX, entityplayer.posY,entityplayer.posZ); 
    		world.spawnEntityInWorld(par1);
				 
			//world.createExplosion(entityplayer, x, y, z, 2F, true);
			}
		
			itemstack.damageItem(1, entityplayer); 
			entityplayer.addStat(Stats.chexplosions, 1);
			entityplayer.triggerAchievement(Achievements.achievementboom);
			
			
		}
	
			return itemstack;
    }
    


	
}
