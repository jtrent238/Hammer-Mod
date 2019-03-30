package com.jtrent238.hammermod.items.hammers;

import java.util.List;
import java.util.Random;

import com.jtrent238.hammermod.Config;
import com.jtrent238.hammermod.Main;
import com.jtrent238.hammermod.Stats;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDamage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemToasterHammer extends ItemBaseHammer {

	private Item itemtogive = Items.BREAD;
	
	public ItemToasterHammer(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material, unlocalizedName, registryName);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
	}

	/**
     * Called each tick as long the item is on a player inventory. Uses by maps to check if is on a player hand and
     * update it's contents.
     */
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5, EntityPlayer player) {
    	
    	ItemStack stack = new ItemStack(itemtogive ,1);
		stack.setStackDisplayName("Toast");
    	player.inventory.addItemStackToInventory(stack);
    }
    
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
    	
    	if(Config.RANDOM_TOAST == true) {
    		
    		Random rn = new Random();
    		int max = 21;
    		int min = 1;
    		int rnd = rn.nextInt(max - min + 1) + min;
    		System.out.println(rnd);
    		
			ItemStack stack = new ItemStack(itemtogive, rnd);
        	stack.setStackDisplayName("Toast");
        	if(Config.SHARP_TOAST == true) {
        		Enchantment EnchantmentDamage = null;
				stack.addEnchantment(EnchantmentDamage, 25);
        	}
        	//stack.onFoodEaten(p_77659_2_, p_77659_3_);
        	p_77659_3_.inventory.addItemStackToInventory(stack);
        	SoundEvent toasterSound;
			p_77659_3_.playSound(new SoundEvent(new ResourceLocation("hammermod:toasterbake")), 5F, 5F);
        	p_77659_3_.addStat(Stats.thbaked, rnd);
        	//p_77659_3_.triggerAchievement(Achievements.achievementtoast);
        	p_77659_1_.damageItem(100 * rnd, p_77659_3_);
    	}
    	
    	ItemStack stack = new ItemStack(itemtogive, 1);
    	stack.setStackDisplayName("Toast");
    	if(Config.SHARP_TOAST == true) {
    		Enchantment EnchantmentDamage = null;
			stack.addEnchantment(EnchantmentDamage, 25);
    	}
    	//stack.onFoodEaten(p_77659_2_, p_77659_3_);
    	p_77659_3_.inventory.addItemStackToInventory(stack);
    	p_77659_3_.playSound(new SoundEvent(new ResourceLocation("hammermod:toasterbake")), 5F, 5F);
    	p_77659_3_.addStat(Stats.thbaked, 1);
    	//p_77659_3_.triggerAchievement(Achievements.achievementtoast);
    	p_77659_1_.damageItem(100, p_77659_3_);
    	return p_77659_1_;
    }
    
    public boolean onBlockDestroyed(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_)
    {

        if(Config.TOASTER_BREAK_SOUND == true) {
        	p_150894_7_.playSound(new SoundEvent(new ResourceLocation("hammermod:toasterbake")), 5F, 5F);
        }
        
        
        return true;
    }
    
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(ItemBaseHammer.ToolTipColor_COMMUNITY_NAME + "tooltip." + Main.MODID + "." + "ToasterHammer" + "." + "createdby");
		tooltip.add(ItemBaseHammer.ToolTipColor_COMMUNITY + "tooltip." + Main.MODID + "." + "communityhammer");
	}
}
