package com.jtrent238.hammermod.util;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.Loader;
import net.minecraft.util.NonNullList;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraft.item.ItemStack;

public class RecipeHandler
{
    public static void addShapedOreRecipe(final ItemStack a1, final Object... a2) {
        final ResourceLocation v1 = getNameForRecipe(/*EL:34*/a1);
        final ShapedOreRecipe v2 = /*EL:35*/new ShapedOreRecipe(v1, a1, a2);
        /*SL:36*/v2.setRegistryName(v1);
        /*SL:37*/GameData.register_impl((IForgeRegistryEntry)v2);
    }
    
    public static void addShapedRecipe(final ItemStack a1, final Object... a2) {
        final ResourceLocation v1 = getNameForRecipe(/*EL:47*/a1);
        final CraftingHelper.ShapedPrimer v2 = /*EL:48*/CraftingHelper.parseShaped(a2);
        final ShapedRecipes v3 = /*EL:49*/new ShapedRecipes(a1.func_77973_b().getRegistryName().toString(), v2.width, v2.height, v2.input, a1);
        /*SL:50*/v3.setRegistryName(v1);
        /*SL:51*/GameData.register_impl((IForgeRegistryEntry)v3);
    }
    
    public static void addShapelessOreRecipe(final ItemStack a1, final Object... a2) {
        final ResourceLocation v1 = getNameForRecipe(/*EL:61*/a1);
        final ShapelessOreRecipe v2 = /*EL:62*/new ShapelessOreRecipe(v1, a1, a2);
        /*SL:63*/v2.setRegistryName(v1);
        /*SL:64*/GameData.register_impl((IForgeRegistryEntry)v2);
    }
    
    public static void addShapelessRecipe(final ItemStack a1, final Object... a2) {
        final ResourceLocation v1 = getNameForRecipe(/*EL:74*/a1);
        final ShapelessRecipes v2 = /*EL:75*/new ShapelessRecipes(v1.func_110624_b(), a1, (NonNullList)buildInput(a2));
        /*SL:76*/v2.setRegistryName(v1);
        /*SL:77*/GameData.register_impl((IForgeRegistryEntry)v2);
    }
    
    public static ResourceLocation getNameForRecipe(final ItemStack a1) {
        final ModContainer v1 = /*EL:87*/Loader.instance().activeModContainer();
        ResourceLocation v3;
        final ResourceLocation v2 = /*EL:89*/v3 = new ResourceLocation(v1.getModId(), a1.func_77973_b().getRegistryName().func_110623_a());
        /*SL:91*/for (int v4 = 0; CraftingManager.field_193380_a.func_148741_d((Object)v3); /*SL:93*/v3 = new ResourceLocation(v1.getModId(), v2.func_110623_a() + "_" + v4)) {
            ++v4;
        }
        /*SL:95*/return v3;
    }
    
    private static NonNullList<Ingredient> buildInput(final Object[] v-4) {
        final NonNullList<Ingredient> func_191196_a = /*EL:102*/(NonNullList<Ingredient>)NonNullList.func_191196_a();
        /*SL:103*/for (final Object v1 : v-4) {
            /*SL:104*/if (v1 instanceof Ingredient) {
                /*SL:105*/func_191196_a.add((Object)v1);
            }
            else {
                Ingredient a1 = /*EL:107*/CraftingHelper.getIngredient(v1);
                /*SL:108*/if (a1 == null) {
                    /*SL:109*/a1 = Ingredient.field_193370_a;
                }
                /*SL:111*/func_191196_a.add((Object)a1);
            }
        }
        /*SL:114*/return func_191196_a;
    }
    
    public static void addSmelting(final Block a1, final ItemStack a2, final float a3) {
        /*SL:118*/GameRegistry.addSmelting(a1, a2, a3);
    }
    
    public static void addSmelting(final Item a1, final ItemStack a2, final float a3) {
        /*SL:122*/GameRegistry.addSmelting(a1, a2, a3);
    }
    
    public static void addSmelting(final ItemStack a1, final ItemStack a2, final float a3) {
        /*SL:126*/GameRegistry.addSmelting(a1, a2, a3);
    }
    
    public static void addSmelting(final ItemStack a1, final ItemStack a2) {
        addSmelting(/*EL:130*/a1, a2, 1.0f);
    }
    
    public static void addSmelting(final Item a1, final ItemStack a2) {
        addSmelting(/*EL:134*/a1, a2, 1.0f);
    }
    
    public static void addSmelting(final Block a1, final ItemStack a2) {
        addSmelting(/*EL:138*/a1, a2, 1.0f);
    }
}
