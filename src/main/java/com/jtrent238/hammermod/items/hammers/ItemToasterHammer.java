package com.jtrent238.hammermod.items.hammers;

import net.minecraft.client.util.ITooltipFlag;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import com.jtrent238.hammermod.Stats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import java.util.Random;
import com.jtrent238.hammermod.Config;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemToasterHammer extends ItemBaseHammer
{
    private Item itemtogive;
    
    public ItemToasterHammer(final Item.ToolMaterial a1, final String a2, final String a3) {
        super(a1, a2, a3);
        this.itemtogive = Items.field_151025_P;
        this.func_77655_b(a2);
        this.setRegistryName(a3);
    }
    
    public void onUpdate(final ItemStack a1, final World a2, final Entity a3, final int a4, final boolean a5, final EntityPlayer a6) {
        final ItemStack v1 = /*EL:44*/new ItemStack(this.itemtogive, 1);
        /*SL:45*/v1.func_151001_c("Toast");
        /*SL:46*/a6.field_71071_by.func_70441_a(v1);
    }
    
    public ItemStack onItemRightClick(final ItemStack v-4, final World v-3, final EntityPlayer v-2) {
        /*SL:55*/if (Config.RANDOM_TOAST) {
            Random a2 = /*EL:57*/new Random();
            /*SL:58*/a2 = 21;
            final int v1 = /*EL:59*/1;
            final int v2 = /*EL:60*/a2.nextInt(a2 - v1 + 1) + v1;
            System.out.println(/*EL:61*/v2);
            final ItemStack v3 = /*EL:63*/new ItemStack(this.itemtogive, v2);
            /*SL:64*/v3.func_151001_c("Toast");
            /*SL:65*/if (Config.SHARP_TOAST) {
                final Enchantment a3 = /*EL:66*/null;
                /*SL:67*/v3.func_77966_a(a3, 25);
            }
            /*SL:70*/v-2.field_71071_by.func_70441_a(v3);
            /*SL:72*/v-2.func_184185_a(new SoundEvent(new ResourceLocation("hammermod:toasterbake")), 5.0f, 5.0f);
            /*SL:73*/v-2.func_71064_a(Stats.thbaked, v2);
            /*SL:75*/v-4.func_77972_a(100 * v2, (EntityLivingBase)v-2);
        }
        final ItemStack itemStack = /*EL:78*/new ItemStack(this.itemtogive, 1);
        /*SL:79*/itemStack.func_151001_c("Toast");
        /*SL:80*/if (Config.SHARP_TOAST) {
            final Enchantment v4 = /*EL:81*/null;
            /*SL:82*/itemStack.func_77966_a(v4, 25);
        }
        /*SL:85*/v-2.field_71071_by.func_70441_a(itemStack);
        /*SL:86*/v-2.func_184185_a(new SoundEvent(new ResourceLocation("hammermod:toasterbake")), 5.0f, 5.0f);
        /*SL:87*/v-2.func_71064_a(Stats.thbaked, 1);
        /*SL:89*/v-4.func_77972_a(100, (EntityLivingBase)v-2);
        /*SL:90*/return v-4;
    }
    
    public boolean onBlockDestroyed(final ItemStack a1, final World a2, final Block a3, final int a4, final int a5, final int a6, final EntityLivingBase a7) {
        /*SL:96*/if (Config.TOASTER_BREAK_SOUND) {
            /*SL:97*/a7.func_184185_a(new SoundEvent(new ResourceLocation("hammermod:toasterbake")), 5.0f, 5.0f);
        }
        /*SL:101*/return true;
    }
    
    public void func_77624_a(final ItemStack a1, final World a2, final List<String> a3, final ITooltipFlag a4) {
        /*SL:106*/a3.add(ItemBaseHammer.ToolTipColor_COMMUNITY_NAME + "tooltip." + "hammermod" + ".ToasterHammer.createdby");
        /*SL:107*/a3.add(ItemBaseHammer.ToolTipColor_COMMUNITY + "tooltip." + "hammermod" + ".communityhammer");
    }
}
