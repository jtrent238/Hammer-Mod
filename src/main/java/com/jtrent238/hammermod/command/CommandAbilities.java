package com.jtrent238.hammermod.command;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import com.jtrent238.hammermod.Abilities;
import com.jtrent238.hammermod.lib.Browser;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class CommandAbilities extends CommandBase
{
    private static final String __OBFID = "CL_00000570";

    public String getCommandName()
    {
        return "HAMMERAbilities";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 0;
    }

    public String getCommandUsage(ICommandSender p_71518_1_)
    {
        return "commands.HAMMERAbilities.usage";
    }

    public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_)
    {

        p_71515_1_.addChatMessage(new ChatComponentTranslation("Hulk Smash!!!", new Object[0]));
        
        
        Abilities.hulkSmash = true;
        
    }
}