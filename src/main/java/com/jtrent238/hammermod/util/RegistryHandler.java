package com.jtrent238.hammermod.util;

import com.jtrent238.hammermod.Main;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    private static int emeraldMultiplier;
    private static int obsidianMultiplier;
    private static int eM;
    private static int oM;
    private static int nsM;
    private static int deM;
    private static int brM;
    private static int YT;
    private static int TWITCH;
    private static int PATREON;
    private static int mobM;
    private static int JSQ_Multiplier;
    private static int RAINBOW_MULTIPLIER;
    
    static {
        RegistryHandler.emeraldMultiplier = 2;
        RegistryHandler.obsidianMultiplier = 2;
        RegistryHandler.eM = RegistryHandler.emeraldMultiplier;
        RegistryHandler.oM = RegistryHandler.obsidianMultiplier;
        RegistryHandler.nsM = RegistryHandler.eM + RegistryHandler.oM * 2;
        RegistryHandler.deM = RegistryHandler.nsM + RegistryHandler.eM + RegistryHandler.oM * 4;
        RegistryHandler.brM = RegistryHandler.nsM + RegistryHandler.eM + RegistryHandler.oM * RegistryHandler.deM;
        RegistryHandler.YT = 10;
        RegistryHandler.TWITCH = 10;
        RegistryHandler.PATREON = RegistryHandler.YT * RegistryHandler.TWITCH;
        RegistryHandler.mobM = 4;
        RegistryHandler.JSQ_Multiplier = 10;
        RegistryHandler.RAINBOW_MULTIPLIER = Main.numHammers;
    }
}
