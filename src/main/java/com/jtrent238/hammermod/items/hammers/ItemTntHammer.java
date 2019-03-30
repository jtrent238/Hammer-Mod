package com.jtrent238.hammermod.items.hammers;

import com.jtrent238.hammermod.Config;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTntHammer extends ItemBaseHammer {

	public ItemTntHammer(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
	}

		@Override
		public boolean hitEntity(ItemStack stack, net.minecraft.entity.EntityLivingBase target,
				net.minecraft.entity.EntityLivingBase attacker) {
			if (Config.TNT_HIT = true) {
				EntityPlayer entityplayer = (EntityPlayer) attacker;
				World world = attacker.getEntityWorld();
	
				int x = target.getPosition().getX();
				int y = target.getPosition().getY();
				int z = target.getPosition().getZ();
	
				world.spawnEntity(new EntityTNTPrimed(world));
			}
			return super.hitEntity(stack, target, attacker);
	}


}
