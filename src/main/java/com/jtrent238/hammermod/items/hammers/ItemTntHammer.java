package com.jtrent238.hammermod.items.hammers;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import com.jtrent238.hammermod.Config;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class ItemTntHammer extends ItemBaseHammer
{
    public ItemTntHammer(final Item.ToolMaterial a1, final String a2, final String a3) {
        super(a1, a2, a3);
        this.func_77655_b(a2);
        this.setRegistryName(a3);
    }
    
    public boolean func_77644_a(final ItemStack v-5, final EntityLivingBase v-4, final EntityLivingBase v-3) {
        /*SL:22*/if (Config.TNT_HIT = true) {
            final EntityPlayer a1 = /*EL:23*/(EntityPlayer)v-3;
            final World a2 = /*EL:24*/v-3.func_130014_f_();
            final int a3 = /*EL:26*/v-4.func_180425_c().func_177958_n();
            final int v1 = /*EL:27*/v-4.func_180425_c().func_177956_o();
            final int v2 = /*EL:28*/v-4.func_180425_c().func_177952_p();
            /*SL:30*/a2.func_72838_d((Entity)new EntityTNTPrimed(a2));
        }
        /*SL:32*/return super.func_77644_a(v-5, v-4, v-3);
    }
}
