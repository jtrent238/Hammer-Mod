package com.jtrent238.hammermod;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.stats.StatBasic;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.stats.StatBase;

public class Stats
{
    public static StatBase chexplosions;
    public static StatBase thbaked;
    
    public static void RegisterStats() {
        Stats.chexplosions = /*EL:15*/new StatBasic("stat.chexplosions", (ITextComponent)new TextComponentString("stat.chexplosions")).func_75966_h().func_75971_g();
        Stats.thbaked = /*EL:16*/new StatBasic("stat.thbaked", (ITextComponent)new TextComponentString("stat.thbaked")).func_75966_h().func_75971_g();
    }
}
