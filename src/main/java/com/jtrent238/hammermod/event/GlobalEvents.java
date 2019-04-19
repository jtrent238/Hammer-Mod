package com.jtrent238.hammermod.event;

import java.io.IOException;
import java.util.UUID;

import com.jtrent238.hammermod.Main;
import com.jtrent238.hammermod.util.UpdateChecker;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class GlobalEvents {


	@SubscribeEvent
	  public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent e)
	  {
		try {
			if (UpdateChecker.isUpdateAvailable() == true) {
				FMLCommonHandler.instance().getMinecraftServerInstance().getCommandSenderEntity().sendMessage(new TextComponentString("An update is available for " + Main.MODNAME + "."));
				FMLCommonHandler.instance().getMinecraftServerInstance().getCommandSenderEntity().sendMessage(new TextComponentString("Your Version: " + Main.MODVERSION + "Latest version: " + UpdateChecker.webVer.toString()));
			} else if (UpdateChecker.isUpdateAvailable() == false) {
				FMLCommonHandler.instance().getMinecraftServerInstance().getCommandSenderEntity().sendMessage(new TextComponentString("You are using the latest version of " + Main.MODNAME + "."));
			}
		} catch (IOException e1) {
			FMLCommonHandler.instance().getMinecraftServerInstance().getCommandSenderEntity().sendMessage(new TextComponentString("Something happened when checking for updates!"));
			e1.printStackTrace();
		}
	  }
}
