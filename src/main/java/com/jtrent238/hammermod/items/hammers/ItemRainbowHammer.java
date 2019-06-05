package com.jtrent238.hammermod.items.hammers;

import com.jtrent238.hammermod.Main;
import net.minecraft.client.util.ITooltipFlag;
import java.util.List;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class ItemRainbowHammer extends ItemBaseHammer
{
    public ItemRainbowHammer(final Item.ToolMaterial a1, final String a2, final String a3) {
        super(a1, a2, a3);
        this.func_77655_b(a2);
        this.setRegistryName(a3);
    }
    
    public void func_77624_a(final ItemStack a1, final World a2, final List<String> a3, final ITooltipFlag a4) {
        /*SL:21*/a3.add(ItemBaseHammer.ToolTipColor_MULTIPLIER + "tooltip." + "hammermod" + ".multiplier." + Main.numHammers);
        /*SL:22*/a3.add(ItemBaseHammer.ToolTipColor_INFO + "tooltip." + "hammermod" + ".rainbowhammer.multiplierinfo");
        /*SL:23*/a3.add(ItemBaseHammer.ToolTipColor_SPECIAL + "tooltip." + "hammermod" + ".special");
    }
}
