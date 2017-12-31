package com.jtrent238.hammermod.items.hammers;

import java.util.List;

import com.jtrent238.hammermod.HammerMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class Item_MrGregor_Hammer extends ItemBaseHammer{

	public Item_MrGregor_Hammer(ToolMaterial material) {
		super(material);
	}

	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 
		list.add(EnumChatFormatting.RED + StatCollector.translateToLocal("tooltip." + HammerMod.MODID + "." + "ythammer"));
		
	  }
}
