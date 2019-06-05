package com.jtrent238.hammermod.items.hammers;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import com.jtrent238.hammermod.Main;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemBaseHammer extends ItemPickaxe
{
    private Item.ToolMaterial material;
    public static final TextFormatting ToolTipColor_TWITCH;
    public static final TextFormatting ToolTipColor_YOUTUBE;
    public static final TextFormatting ToolTipColor_PATREON;
    public static final TextFormatting ToolTipColor_COMMUNITY;
    public static final TextFormatting ToolTipColor_COMMUNITY_NAME;
    public static final TextFormatting ToolTipColor_DEVELOPER;
    public static final TextFormatting ToolTipColor_SPECIAL;
    public static final TextFormatting ToolTipColor_RAINBOW;
    public static final TextFormatting ToolTipColor_BASIC;
    public static final TextFormatting ToolTipColor_MULTIPLIER;
    public static final TextFormatting ToolTipColor_INFO;
    
    public ItemBaseHammer(final Item.ToolMaterial a1, final String a2, final String a3) {
        super(a1);
        this.material = a1;
        this.func_77637_a(Main.tab_HammerMod);
    }
    
    public float getAttackDamage() {
        /*SL:71*/return this.material.func_78000_c();
    }
    
    @SideOnly(Side.CLIENT)
    public boolean func_77662_d() {
        /*SL:80*/return true;
    }
    
    public String func_77861_e() {
        /*SL:89*/return this.material.toString();
    }
    
    static {
        ToolTipColor_TWITCH = TextFormatting.DARK_PURPLE;
        ToolTipColor_YOUTUBE = TextFormatting.RED;
        ToolTipColor_PATREON = TextFormatting.GOLD;
        ToolTipColor_COMMUNITY = TextFormatting.YELLOW;
        ToolTipColor_COMMUNITY_NAME = TextFormatting.GREEN;
        ToolTipColor_DEVELOPER = TextFormatting.DARK_GREEN;
        ToolTipColor_SPECIAL = TextFormatting.GOLD;
        ToolTipColor_RAINBOW = TextFormatting.DARK_GREEN;
        ToolTipColor_BASIC = TextFormatting.DARK_AQUA;
        ToolTipColor_MULTIPLIER = TextFormatting.AQUA;
        ToolTipColor_INFO = TextFormatting.DARK_GRAY;
    }
}
