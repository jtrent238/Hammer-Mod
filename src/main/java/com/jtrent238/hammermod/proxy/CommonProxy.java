package com.jtrent238.hammermod.proxy;

import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import com.jtrent238.hammermod.Config;
import java.io.File;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class CommonProxy
{
    public static Configuration config;
    
    public void preInit(final FMLPreInitializationEvent a1) {
        final File v1 = /*EL:28*/a1.getModConfigurationDirectory();
        CommonProxy.config = /*EL:29*/new Configuration(new File(v1.getPath(), "hammermod.cfg"));
        /*SL:30*/Config.readConfig();
    }
    
    public void init(final FMLInitializationEvent a1) {
    }
    
    public void postInit(final FMLPostInitializationEvent a1) {
        /*SL:41*/if (CommonProxy.config.hasChanged()) {
            CommonProxy.config.save();
        }
    }
}
