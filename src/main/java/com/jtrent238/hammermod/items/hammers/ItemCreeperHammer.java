package com.jtrent238.hammermod.items.hammers;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import com.jtrent238.hammermod.Stats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class ItemCreeperHammer extends ItemBaseHammer
{
    public ItemCreeperHammer(final Item.ToolMaterial a1, final String a2, final String a3) {
        super(a1, a2, a3);
        this.func_77655_b(a2);
        this.setRegistryName(a3);
    }
    
    public ItemStack onItemRightClick(final ItemStack a3, final World v1, final EntityPlayer v2) {
        /*SL:25*/if (v2.field_71071_by.func_70431_c(new ItemStack(Items.field_151016_H))) {
            /*SL:27*/if (!v1.field_72995_K) {
                /*SL:30*/v2.field_71071_by.func_70431_c(new ItemStack(Items.field_151016_H));
                final EntityTNTPrimed a4 = /*EL:32*/new EntityTNTPrimed(v1);
                /*SL:33*/a4.func_70107_b(v2.field_70165_t, v2.field_70163_u, v2.field_70161_v);
                /*SL:34*/v1.func_72838_d((Entity)a4);
            }
            /*SL:39*/a3.func_77972_a(1, (EntityLivingBase)v2);
            /*SL:40*/v2.func_71064_a(Stats.chexplosions, 1);
        }
        else {
            /*SL:47*/v2.func_145747_a((ITextComponent)new TextComponentString(TextFormatting.RED + "NO GUNPOWDER!!!"));
        }
        /*SL:49*/return a3;
    }
}
