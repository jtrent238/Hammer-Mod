package com.jtrent238.hammermod;

import java.awt.Event;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

public class Abilities {

	
	public static Boolean hulkSmash;
	public static Object set;
	
	
	public static void RegisterAbilities() {
		
	}


	public void hulkSmash(boolean b) {
		
		if(hulkSmash == true){
			Minecraft.getMinecraft().thePlayer.canHarvestBlock(Blocks.bedrock);
		}
	}

	
}
