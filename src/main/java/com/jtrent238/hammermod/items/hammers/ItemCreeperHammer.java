package com.jtrent238.hammermod.items.hammers;

import com.jtrent238.hammermod.Stats;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;


public class ItemCreeperHammer extends ItemBaseHammer {

	public ItemCreeperHammer(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer entityplayer)
    {
		
	if (entityplayer.inventory.hasItemStack(new ItemStack(Items.GUNPOWDER)) == true){
			
		if(!world.isRemote)
			{
				
			entityplayer.inventory.hasItemStack(new ItemStack(Items.GUNPOWDER));
			
    		EntityTNTPrimed par1 = new EntityTNTPrimed(world);
    		par1.setPosition(entityplayer.posX, entityplayer.posY,entityplayer.posZ); 
    		world.spawnEntity(par1);
				 
			//world.createExplosion(entityplayer, x, y, z, 2F, true);
			}
		
			itemstack.damageItem(1, entityplayer); 
			entityplayer.addStat(Stats.chexplosions, 1);
			//entityplayer.triggerAchievement(Achievements.achievementboom);
			
			
		}
	
	else
		entityplayer.sendMessage(new TextComponentString(TextFormatting.RED + "NO GUNPOWDER!!!"));
	
			return itemstack;
    }
    


	
}
