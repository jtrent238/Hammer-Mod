package com.jtrent238.hammermod.items.hammers.custom;

import java.util.List;

import com.jtrent238.hammermod.HammerMod;
import com.jtrent238.hammermod.items.hammers.ItemBaseHammer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class ItemCustomHammer_1 extends ItemBaseHammer{

	public ItemCustomHammer_1(ToolMaterial material) {
		super(material);
	}

	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 list.add(/*EnumChatFormatting.WHITE + StatCollector.translateToLocal*/("tooltip." + HammerMod.CUSTOM_HAMMER_DESC_1));
	  }
   

    private static final String __OBFID = "CL_00000065";

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_)
    {
       
    	return HammerMod.CUSTOM_HAMMER_1_ENCHANT_GLINT;
    }
    
}
