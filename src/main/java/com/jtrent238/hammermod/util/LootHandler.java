package com.jtrent238.hammermod.util;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.LootTableLoadEvent;

public class LootHandler
{
    LootHandler() {
        addToChests(null);
    }
    
    public static void registerLoot() {
        addToChests(/*EL:27*/null);
    }
    
    @SubscribeEvent
    public static void addToChests(final LootTableLoadEvent a1) {
    }
}
