package com.jtrent238.hammermod.items.hammers;

import net.minecraft.client.util.ITooltipFlag;
import java.util.List;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class ItemThackAttack_MCHammer extends ItemBaseHammer
{
    public ItemThackAttack_MCHammer(final Item.ToolMaterial a1, final String a2, final String a3) {
        super(a1, a2, a3);
        this.func_77655_b(a2);
        this.setRegistryName(a3);
    }
    
    public void func_77624_a(final ItemStack a1, final World a2, final List<String> a3, final ITooltipFlag a4) {
        /*SL:21*/a3.add(ItemBaseHammer.ToolTipColor_YOUTUBE + "tooltip." + "hammermod" + ".ythammer");
    }
}
