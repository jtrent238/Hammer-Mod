package com.jtrent238.hammermod;

import java.util.logging.Level;

import com.jtrent238.hammermod.lib.LogHelper;

import cpw.mods.fml.common.Loader;

public class ModRegistry {

	private static boolean isepicproportionsmodLoaded;
	private static boolean isTConstructLoaded;
	private static boolean isThermalFoundationLoaded;
	private static boolean isThaumcraftLoaded;
	private static boolean isProjectXYLoaded;

	public ModRegistry(){
		
		
	
	registerMods();
	
}

	static void registerMods() {
		
		
		isepicproportionsmodLoaded = Loader.isModLoaded("epicproportionsmod");
		
		if (isepicproportionsmodLoaded) {
			
			System.out.println("EpicProportions Mod Loaded");
			try {
	            LogHelper.log(Level.INFO, "Loaded EpicProportions Mod");
	        }
	        catch (Exception e) {
	            LogHelper.log(Level.SEVERE, "Could not load EpicProportions Mod");
	            e.printStackTrace(System.err);
	        }
	    
			
			}
		
		isTConstructLoaded = Loader.isModLoaded("TConstruct");

		if (isTConstructLoaded) {
			
			System.out.println("Tinkers Construct Mod Loaded");
			try {
	            LogHelper.log(Level.INFO, "Loaded Tinkers Construct Mod");
	        }
	        catch (Exception e) {
	            LogHelper.log(Level.SEVERE, "Could not load Tinkers Construct Mod");
	            e.printStackTrace(System.err);
	        }
	    
			
			}
		
		isThermalFoundationLoaded = Loader.isModLoaded("ThermalFoundation");

		if (isThermalFoundationLoaded) {
			
			System.out.println("Thermal Foundation Mod Loaded");
			try {
	            LogHelper.log(Level.INFO, "Loaded Thermal Foundation Mod");
	        }
	        catch (Exception e) {
	            LogHelper.log(Level.SEVERE, "Could not load Thermal Foundation Mod");
	            e.printStackTrace(System.err);
	        }
	    
			
			}
		
		isThaumcraftLoaded = Loader.isModLoaded("Thaumcraft");

		if (isThaumcraftLoaded) {
			
			System.out.println("Thaumcraft Mod Loaded");
			try {
	            LogHelper.log(Level.INFO, "Loaded Thaumcraft Mod");
	        }
	        catch (Exception e) {
	            LogHelper.log(Level.SEVERE, "Could not load Thaumcraft Mod");
	            e.printStackTrace(System.err);
	        }
	    
			
			}
		
		isProjectXYLoaded = Loader.isModLoaded("ProjectXY");

		if (isProjectXYLoaded) {
			
			System.out.println("ProjectXY Mod Loaded");
			try {
	            LogHelper.log(Level.INFO, "Loaded ProjectXY Mod");
	        }
	        catch (Exception e) {
	            LogHelper.log(Level.SEVERE, "Could not load ProjectXY Mod");
	            e.printStackTrace(System.err);
	        }
	    
			
			}
	}
}
