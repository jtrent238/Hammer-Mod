package com.jtrent238.hammermod.util;

import com.jtrent238.hammermod.Config;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;
import com.jtrent238.hammermod.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;

public class ModelRegistryHandler
{
    @SubscribeEvent
    public static void registerModels(final ModelRegistryEvent a1) {
        registerModel((Item)ModItems.hammerWood);
        registerModel((Item)ModItems.hammerStone);
    }
    
    public static void registerModel(final Item a1) {
        /*SL:33*/if (Config.debugMode) {
            /*SL:37*/return;
        }
    }
}
