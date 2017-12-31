
package com.jtrent238.hammermod;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


	public class Achievements {
    
	public static Achievement achievementboom;
	public static Achievement achievementtoast;
    

    
  
    
   
    
    public static void loadAchievements()
    {
    	achievementboom = new Achievement("achievement." + HammerMod.MODID + ".boom", "boom", 0, 0, new ItemStack(ItemLoader.ItemCreeperHammer, 1), (Achievement)achievementboom).initIndependentStat().registerStat();
    	achievementtoast = new Achievement("achievement." + HammerMod.MODID + ".toast", "toast", 0, 1, new ItemStack(ItemLoader.ItemToasterHammer, 1), (Achievement)achievementtoast).initIndependentStat().registerStat();
    	
    	
    	AchievementPage.registerAchievementPage(new AchievementPage(HammerMod.MODID + HammerMod.MODVERSION + "Achievements", new Achievement[]{
    			achievementboom,
    			achievementtoast
    			}));

    }
    
    
}
