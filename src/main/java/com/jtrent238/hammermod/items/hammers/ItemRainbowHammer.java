package com.jtrent238.hammermod.items.hammers;

import java.util.List;

import com.jtrent238.hammermod.Achievements;
import com.jtrent238.hammermod.HammerMod;
import com.jtrent238.hammermod.ItemLoader;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

public class ItemRainbowHammer extends ItemBaseHammer{

	private int delayBeforeCanPickup;

	public ItemRainbowHammer(ToolMaterial material) {
		super(material);
	}

	@Override
	 @SideOnly(Side.CLIENT)
	 public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean isHeld) {
	 
		list.add(ItemBaseHammer.ToolTipColor_MULTIPLIER + StatCollector.translateToLocal("tooltip." + HammerMod.MODID + "." + "multiplier") + HammerMod.numHammers);
		list.add(ItemBaseHammer.ToolTipColor_INFO + StatCollector.translateToLocal("tooltip." + HammerMod.MODID + "." + "rainbowhammer" + "." + "multiplierinfo"));
		list.add(ItemBaseHammer.ToolTipColor_SPECIAL + StatCollector.translateToLocal("tooltip." + HammerMod.MODID + "." + "special"));
		 
	}
	
	public void onUsingTick(ItemStack stack, EntityPlayer player, int count)
	  {
	      if (this != ItemLoader.ItemRainbowHammer)
	      {
	    	  stack.addEnchantment(Enchantment.looting, HammerMod.numHammers);
	    	  stack.addEnchantment(Enchantment.fortune, HammerMod.numHammers);
	    	  stack.addEnchantment(Enchantment.unbreaking, HammerMod.numHammers);
      		player.triggerAchievement(Achievements.achievementrainbow);
	        
	      }
	  }
	
	/**
     * Called by a player entity when they collide with an entity
	 * @param par1ItemStack 
	 * @param par3EntityPlayer 
     */
    public void onCollideWithPlayer(EntityPlayer p_70100_1_,  World world, ItemStack par1ItemStack, EntityPlayer par3EntityPlayer)
    {
    	if (!world.isRemote)
        {
            if (this.delayBeforeCanPickup > 0)
            {
                return;
            }

            EntityItem entityitem = null;
			EntityItemPickupEvent event = new EntityItemPickupEvent(p_70100_1_, entityitem);

            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return;
            }

            ItemStack itemstack = new ItemStack(ItemLoader.ItemRainbowHammer);
            int i = itemstack.stackSize;

                if (itemstack.getItem() == this)
                {
            		par1ItemStack.addEnchantment(Enchantment.looting, HammerMod.numHammers);
            		par1ItemStack.addEnchantment(Enchantment.fortune, HammerMod.numHammers);
            		par1ItemStack.addEnchantment(Enchantment.unbreaking, HammerMod.numHammers);
            		par3EntityPlayer.triggerAchievement(Achievements.achievementrainbow);
                }

                }

                EntityItem entityitem = null;
				FMLCommonHandler.instance().firePlayerItemPickupEvent(p_70100_1_, entityitem);

                p_70100_1_.onItemPickup(entityitem, delayBeforeCanPickup);

                
            }
	
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par1ItemStack.addEnchantment(Enchantment.looting, HammerMod.numHammers);
		par1ItemStack.addEnchantment(Enchantment.fortune, HammerMod.numHammers);
		par1ItemStack.addEnchantment(Enchantment.unbreaking, HammerMod.numHammers);
		par3EntityPlayer.triggerAchievement(Achievements.achievementrainbow);
}
}
