package com.jtrent238.hammermod;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatBasic;
import net.minecraft.util.text.TextComponentString;

public class Stats {

	public static StatBase chexplosions;
	public static StatBase thbaked;
	

	public static void RegisterStats() {
		
		chexplosions = new StatBasic("stat.chexplosions", new TextComponentString("stat.chexplosions")).initIndependentStat().registerStat();
		thbaked = new StatBasic("stat.thbaked", new TextComponentString("stat.thbaked")).initIndependentStat().registerStat();
		
	}
	
}
