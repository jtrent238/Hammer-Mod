package com.jtrent238.hammermod.items.hammers;

import net.minecraft.client.util.ITooltipFlag;
import java.util.List;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class ItemLightningHammer extends ItemBaseHammer
{
    public ItemLightningHammer(final Item.ToolMaterial a1, final String a2, final String a3) {
        super(a1, a2, a3);
        this.func_77655_b(a2);
        this.setRegistryName(a3);
    }
    
    public boolean func_77644_a(final ItemStack a1, final EntityLivingBase a2, final EntityLivingBase a3) {
        final EntityPlayer v1 = /*EL:28*/(EntityPlayer)a3;
        final World v2 = /*EL:29*/a3.func_130014_f_();
        final int v3 = /*EL:31*/a2.func_180425_c().func_177958_n();
        final int v4 = /*EL:32*/a2.func_180425_c().func_177956_o();
        final int v5 = /*EL:33*/a2.func_180425_c().func_177952_p();
        /*SL:35*/v2.func_72942_c((Entity)new EntityLightningBolt(v2, (double)v3, (double)v4, (double)v5, true));
        /*SL:37*/return super.func_77644_a(a1, a2, a3);
    }
    
    public void func_77624_a(final ItemStack a1, final World a2, final List<String> a3, final ITooltipFlag a4) {
        /*SL:43*/a3.add(ItemBaseHammer.ToolTipColor_COMMUNITY_NAME + "tooltip." + "hammermod" + ".LightningHammer.createdby");
        /*SL:44*/a3.add(ItemBaseHammer.ToolTipColor_COMMUNITY + "tooltip." + "hammermod" + ".communityhammer");
    }
}
