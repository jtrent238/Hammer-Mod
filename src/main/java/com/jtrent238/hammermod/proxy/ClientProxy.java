package com.jtrent238.hammermod.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber({ Side.CLIENT })
public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(final FMLPreInitializationEvent a1) {
        /*SL:13*/super.preInit(a1);
    }
}
