package com.jtrent238.hammermod.items.hammers;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.jtrent238.hammermod.Config;
import com.jtrent238.hammermod.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBaseHammer extends ItemPickaxe {


	private ToolMaterial material;

	public static final TextFormatting ToolTipColor_TWITCH = TextFormatting.DARK_PURPLE;
	public static final TextFormatting ToolTipColor_YOUTUBE = TextFormatting.RED;
	public static final TextFormatting ToolTipColor_PATREON = TextFormatting.GOLD;
	public static final TextFormatting ToolTipColor_COMMUNITY = TextFormatting.YELLOW;
	public static final TextFormatting ToolTipColor_COMMUNITY_NAME = TextFormatting.GREEN;
	public static final TextFormatting ToolTipColor_DEVELOPER = TextFormatting.DARK_GREEN;
	public static final TextFormatting ToolTipColor_SPECIAL = TextFormatting.GOLD;
	public static final TextFormatting ToolTipColor_RAINBOW = TextFormatting.DARK_GREEN;
	public static final TextFormatting ToolTipColor_BASIC = TextFormatting.DARK_AQUA;
	public static final TextFormatting ToolTipColor_MULTIPLIER = TextFormatting.AQUA;
	public static final TextFormatting ToolTipColor_INFO = TextFormatting.DARK_GRAY;
	
	public ItemBaseHammer(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		this.material = material;
		this.setCreativeTab(Main.tab_HammerMod);
	}

	
    /**
     * Returns the amount of damage this item will deal. One heart of damage is equal to 2 damage points.
     */
    public float getAttackDamage()
    {
        return this.material.getAttackDamage();
    }
    
    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    
    /**
     * Return the name for this tool's material.
     */
    public String getToolMaterialName()
    {
        return this.material.toString();
    }


    
}