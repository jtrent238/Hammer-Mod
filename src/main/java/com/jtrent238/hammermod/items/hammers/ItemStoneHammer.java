package com.jtrent238.hammermod.items.hammers;

import net.minecraft.item.Item;

public class ItemStoneHammer extends ItemBaseHammer
{
    public ItemStoneHammer(final Item.ToolMaterial a1, final String a2, final String a3) {
        super(a1, a3, a2);
        this.func_77655_b(a2);
        this.setRegistryName(a3);
    }
}
