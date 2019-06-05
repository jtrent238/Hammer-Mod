package com.jtrent238.hammermod;

import net.minecraft.item.Item;
import java.io.IOException;
import net.minecraft.item.ItemStack;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.FileWriter;
import com.jtrent238.hammermod.util.HammerHandler;
import org.apache.logging.log4j.Level;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import com.jtrent238.hammermod.util.LootHandler;
import com.jtrent238.hammermod.util.ModelRegistryHandler;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.SidedProxy;
import com.jtrent238.hammermod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = "hammermod", name = "jtrent238's Hammer Mod", version = "2.1.3.10", dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true, acceptedMinecraftVersions = "[1.12.2]")
public class Main
{
    public static final String MODID = "hammermod";
    public static final String MODNAME = "jtrent238's Hammer Mod";
    public static final String MODAUTHOR = "jtrent238";
    public static final String MODVERSION = "2.1.3.10";
    public static final String MC = "1.12.2";
    @SidedProxy(clientSide = "com.jtrent238.hammermod.proxy.ClientProxy", serverSide = "com.jtrent238.hammermod.proxy.ServerProxy")
    public static CommonProxy proxy;
    public static int numHammers;
    @Mod.Instance
    public static Main instance;
    public static Logger logger;
    public static CreativeTabs tab_HammerMod;
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent a1) {
        Main.logger = /*EL:47*/a1.getModLog();
        Main.proxy.preInit(/*EL:48*/a1);
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent a1, final ModelRegistryEvent a2) {
        Main.proxy.init(/*EL:53*/a1);
        /*SL:54*/ModelRegistryHandler.registerModels(a2);
        /*SL:55*/ModRecipes.registerRecpies();
        /*SL:56*/LootHandler.registerLoot();
    }
    
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent v-2) throws IOException {
        Main.proxy.postInit(/*EL:61*/v-2);
        Main.logger.log(Level.INFO, /*EL:63*/"There are currently " + Main.numHammers + " hammers in the mod.");
        /*SL:65*/for (int i = 0; i > Main.numHammers; ++i) {
            Main.logger.log(Level.INFO, /*EL:66*/"Registered Hammer: " + HammerHandler.hammers.get(i));
            Main.logger.log(Level.INFO, /*EL:67*/"TEST" + i);
            final FileWriter a1 = /*EL:68*/new FileWriter("hammers.txt");
            final PrintWriter v1 = /*EL:69*/new PrintWriter(a1);
            /*SL:70*/v1.printf("%s", HammerHandler.hammers.get(i).toString());
            /*SL:71*/v1.close();
        }
    }
    
    static {
        Main.numHammers = 144;
        Main.tab_HammerMod = new CreativeTabs("tab_HammerMod") {
            public ItemStack func_78016_d() {
                /*SL:85*/return new ItemStack((Item)ModItems.hammerDiamond);
            }
            
            public boolean hasSearchBar() {
                /*SL:88*/return false;
            }
        };
    }
}
