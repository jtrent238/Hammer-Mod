package com.jtrent238.hammermod.items.hammers;

import java.util.List;

import com.jtrent238.hammermod.Main;

import net.minecraft.client.resources.LanguageManager;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

public class ItemLightningHammer extends ItemBaseHammer {

	public ItemLightningHammer(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
	}

	@Override
	public boolean hitEntity(ItemStack stack, net.minecraft.entity.EntityLivingBase target,
			net.minecraft.entity.EntityLivingBase attacker) {

		EntityPlayer entityplayer = (EntityPlayer) attacker;
		World world = attacker.getEntityWorld();

		int x = target.getPosition().getX();
		int y = target.getPosition().getY();
		int z = target.getPosition().getZ();

		world.addWeatherEffect(new EntityLightningBolt(world, x, y, z, true));
		
		return super.hitEntity(stack, target, attacker);
	}

	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(ItemBaseHammer.ToolTipColor_COMMUNITY_NAME + "tooltip." + Main.MODID + "." + "LightningHammer" + "." + "createdby");
		tooltip.add(ItemBaseHammer.ToolTipColor_COMMUNITY + "tooltip." + Main.MODID + "." + "communityhammer");
	}
	
}
