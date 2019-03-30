package com.jtrent238.hammermod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import com.jtrent238.hammermod.proxy.CommonProxy;
import com.jtrent238.hammermod.util.HammerHandler;
import com.jtrent238.hammermod.util.LootHandler;
import com.jtrent238.hammermod.util.ModelRegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class Main {

    public static final String MODID = "hammermod";
	public static final String MODNAME = "jtrent238's Hammer Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MODVERSION = "2.1.3.10";
	public static final String MC = "1.12.2";

    @SidedProxy(clientSide = "com.jtrent238.hammermod.proxy.ClientProxy", serverSide = "com.jtrent238.hammermod.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static int numHammers = 144;
    
    @Mod.Instance
    public static Main instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e, ModelRegistryEvent mre) {
        proxy.init(e);
        ModelRegistryHandler.registerModels(mre);
        ModRecipes.registerRecpies();
        LootHandler.registerLoot();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) throws IOException {
        proxy.postInit(e);
        
        this.logger.log(Level.INFO, "There are currently " + numHammers + " hammers in the mod.");
        
        for (int i = 0; i > numHammers; i++) {
        	this.logger.log(Level.INFO, "Registered Hammer: " + HammerHandler.hammers.get(i));
        	this.logger.log(Level.INFO, "TEST" + i);
        	FileWriter fileWriter = new FileWriter("hammers.txt");
        	PrintWriter printWriter = new PrintWriter(fileWriter);
        	printWriter.printf("%s", HammerHandler.hammers.get(i).toString());
        	printWriter.close();
        }
        
//      FileWriter fileWriter = new FileWriter("hammermod_info.txt");
//    	PrintWriter printWriter = new PrintWriter(fileWriter);
//    	printWriter.println("Mod ID: " + MODID + " " + MODVERSION);
//    	printWriter.close();
    }
    
    public static CreativeTabs tab_HammerMod = new CreativeTabs("tab_HammerMod")

    {
    	public ItemStack getTabIconItem() {

    		return new ItemStack(ModItems.hammerDiamond);
    	}
    	public boolean hasSearchBar(){
    		return false;
    	}};
	

    ;
}