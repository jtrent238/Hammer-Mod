package com.jtrent238.hammermod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import com.jtrent238.hammermod.event.GlobalEvents;
import com.jtrent238.hammermod.items.materials.HammerMaterial;
import com.jtrent238.hammermod.proxy.CommonProxy;
import com.jtrent238.hammermod.util.CustomHammerRegistry;
import com.jtrent238.hammermod.util.HammerHandler;
import com.jtrent238.hammermod.util.LootHandler;
import com.jtrent238.hammermod.util.ModelRegistryHandler;
import com.jtrent238.hammermod.util.UpdateChecker;
import com.jtrent238.jtcoremod.JTAPI;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION/*, dependencies = "required-after:jtcoremod@[2.0.0.3,)"*/, useMetadata = true)
public class Main {

    public static final String MODID = "hammermod";
	public static final String MODNAME = "jtrent238's Hammer Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MODVERSION = "2.1.3.10-indev";
	public static final String MC = "1.12.2";

    @SidedProxy(clientSide = "com.jtrent238.hammermod.proxy.ClientProxy", serverSide = "com.jtrent238.hammermod.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static int numHammers = 176;
    
    @Mod.Instance
    public static Main instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e, ModelRegistryEvent mre){
        proxy.init(e);
        CustomHammerRegistry.createBaseHammer(MODAUTHOR);
        ModelRegistryHandler.registerModels(mre);
        ModRecipes.registerRecpies();
        LootHandler.registerLoot();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) throws IOException {
        proxy.postInit(e);
        //JTAPI.addNewCreativeTab("tab_HammerMod", ModItems.hammerDiamond, false);
        //UpdateChecker.isUpdateAvailable();
        //UpdateChecker.displayUpdateMsgBox();
        
        
        this.logger.log(Level.INFO, "There are currently " + numHammers + " hammers in the mod.");
        
        for (int i = 0; i >= numHammers; i++) {
        	this.logger.log(Level.INFO, "Registered Hammer: " + HammerHandler.hammers.get(i));
        	this.logger.log(Level.INFO, "TEST" + i);
        	FileWriter fileWriter = new FileWriter("hammers.txt");
        	PrintWriter printWriter = new PrintWriter(fileWriter);
        	printWriter.printf("%s", HammerHandler.hammers.get(i).toString());
        	printWriter.close();
        }
        
//        if (WebUtil.isUpdateAvailable() == true) {
//        	this.logger.log(Level.INFO, "An update is available for " + Main.MODNAME + ".");
//        	this.logger.log(Level.INFO, "Your Version: " + Main.MODVERSION + " Latest version: " + WebUtil.webVer);
//		} else if (WebUtil.isUpdateAvailable() == false) {
//			this.logger.log(Level.INFO, "You are using the latest version of " + Main.MODNAME + ".");
//		}
        
//      FileWriter fileWriter = new FileWriter("hammermod_info.txt");
//    	PrintWriter printWriter = new PrintWriter(fileWriter);
//    	printWriter.println("Mod ID: " + MODID + " " + MODVERSION);
//    	printWriter.close();
        
        
    }
    
    public static CreativeTabs tab_HammerMod = new CreativeTabs("tab_HammerMod") {
    	
    	public ItemStack getTabIconItem() {
    		
    		return new ItemStack(ModItems.hammerDiamond);
    	}
    	
    	public boolean hasSearchBar(){
    		return false;
    	}
    	
    };
}