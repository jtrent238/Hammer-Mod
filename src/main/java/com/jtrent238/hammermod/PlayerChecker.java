package com.jtrent238.hammermod;

import com.mojang.authlib.GameProfile;

import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.ForgeEventFactory;

public class PlayerChecker {

	//private static Object username;
	private static EntityPlayer player;
	private static String username;
	

	public static void checkPlayer(PlayerEvent.PlayerLoggedInEvent event) {
		
		ForgeEventFactory.getPlayerDisplayName(player, (String) username);
		
		
		if(username == "jtrent238"){
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Hello" + event.player.getDisplayName() + "!"));
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Thanks for playing my mod. Lets give you your Hammer! :D"));
			
			event.player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.ItemDiamondHammer));

		}
		
		if(username == "FuriousDestroyer"){
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Hello" + event.player.getDisplayName() + "!"));
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Thanks for playing my mod. Lets give you your Hammer! :D"));
			
			event.player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.ItemPatHammer));

		}
		
		if(username == "SuperGirlyGamer"){
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Hello" + event.player.getDisplayName() + "!"));
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Thanks for playing my mod. Lets give you your Hammer! :D"));
			
			event.player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.ItemJenHammer));

		}
		
		if(username == "DanTDM"){
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Hello" + event.player.getDisplayName() + "!"));
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Thanks for playing my mod. Lets give you your Hammer! :D"));
			
			event.player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.ItemDanTDMHammer));

		}

		if(username == "xJSQ"){
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Hello" + event.player.getDisplayName() + "!"));
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Thanks for playing my mod. Lets give you your Hammer! :D"));
			
			event.player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.ItemxJSQHammer));

		}
		
		if(username == "SkyTheKidRS"){
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Hello" + event.player.getDisplayName() + "!"));
			event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Thanks for playing my mod. Lets give you your Hammer! :D"));
			
			event.player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.ItemSkyTheKidRSHammer));

		}
		
			else{
				System.out.println("Sorry you do not have a custom hammer in the mod!");
			}
	}

}
