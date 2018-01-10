package com.jtrent238.hammermod;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootRegistry {

	public static ArrayList<ItemStack> hammers = new ArrayList<ItemStack>();

	LootRegistry(){
		addHammersasLoot();
		addToChests();
	}

	public static void registerLoot() {
		addHammersasLoot();
		addToChests();
	}
	public static void addHammersasLoot() {
		
		hammers.add(new ItemStack(ItemLoader.ItemWoodHammer));
		hammers.add(new ItemStack(ItemLoader.ItemStoneHammer));
		hammers.add(new ItemStack(ItemLoader.ItemIronHammer));
		hammers.add(new ItemStack(ItemLoader.ItemGoldHammer));
		hammers.add(new ItemStack(ItemLoader.ItemDiamondHammer));
		hammers.add(new ItemStack(ItemLoader.ItemDirtHammer));
		hammers.add(new ItemStack(ItemLoader.ItemGlassHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSandHammer));
		hammers.add(new ItemStack(ItemLoader.ItemCactusHammer));
		hammers.add(new ItemStack(ItemLoader.ItemGravelHammer));
		hammers.add(new ItemStack(ItemLoader.ItemWoolHammer_white));
		hammers.add(new ItemStack(ItemLoader.ItemEmeraldHammer));
		hammers.add(new ItemStack(ItemLoader.ItemGrassHammer));
		hammers.add(new ItemStack(ItemLoader.ItemObsidianHammer));
		hammers.add(new ItemStack(ItemLoader.ItemGlowstoneHammer));
		hammers.add(new ItemStack(ItemLoader.ItemRedstoneHammer));
		hammers.add(new ItemStack(ItemLoader.ItemLapizHammer));
		hammers.add(new ItemStack(ItemLoader.ItemNetherackHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSoulSandHammer));
		hammers.add(new ItemStack(ItemLoader.ItemCoalHammer));
		hammers.add(new ItemStack(ItemLoader.ItemCharcoalHammer));
		hammers.add(new ItemStack(ItemLoader.ItemEndstoneHammer));
		hammers.add(new ItemStack(ItemLoader.ItemBoneHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSpongeHammer));
		hammers.add(new ItemStack(ItemLoader.ItemBrickHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSugarHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSlimeHammer));
		hammers.add(new ItemStack(ItemLoader.ItemMelonHammer));
		hammers.add(new ItemStack(ItemLoader.ItemPumpkinHammer));
		hammers.add(new ItemStack(ItemLoader.ItemPotatoHammer));
		hammers.add(new ItemStack(ItemLoader.ItemCarrotHammer));
		hammers.add(new ItemStack(ItemLoader.ItemAppleHammer));
		hammers.add(new ItemStack(ItemLoader.ItemIceHammer));
		hammers.add(new ItemStack(ItemLoader.ItemPackedIceHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSnowHammer));
		hammers.add(new ItemStack(ItemLoader.ItemCakeHammer));
		hammers.add(new ItemStack(ItemLoader.ItemDragonEggHammer));
		hammers.add(new ItemStack(ItemLoader.ItemTntHammer));
		hammers.add(new ItemStack(ItemLoader.ItemBedrockHammer));

		hammers.add(new ItemStack(ItemLoader.ItemCreeperHammer));
		hammers.add(new ItemStack(ItemLoader.ItemPigHammer));
		hammers.add(new ItemStack(ItemLoader.ItemCowHammer));

		hammers.add(new ItemStack(ItemLoader.ItemCopperHammer));
		hammers.add(new ItemStack(ItemLoader.ItemBronzeHammer));
		hammers.add(new ItemStack(ItemLoader.ItemTungstenHammer));
		hammers.add(new ItemStack(ItemLoader.ItemRubyHammer));
		hammers.add(new ItemStack(ItemLoader.ItemTinHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSilverHammer));
		hammers.add(new ItemStack(ItemLoader.ItemJadeHammer));
		hammers.add(new ItemStack(ItemLoader.ItemAmethystHammer));
		hammers.add(new ItemStack(ItemLoader.ItemGraphiteHammer));
		hammers.add(new ItemStack(ItemLoader.ItemCitrineHammer));
		hammers.add(new ItemStack(ItemLoader.ItemPierreHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSapphireHammer));
		hammers.add(new ItemStack(ItemLoader.ItemOnyxHammer));
		hammers.add(new ItemStack(ItemLoader.ItemNikoliteHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSilicaHammer));
		hammers.add(new ItemStack(ItemLoader.ItemCinnabarHammer));
		hammers.add(new ItemStack(ItemLoader.ItemAmberBearingStoneHammer));
		hammers.add(new ItemStack(ItemLoader.ItemFerrousHammer));
		hammers.add(new ItemStack(ItemLoader.ItemAdaminiteHammer));
		hammers.add(new ItemStack(ItemLoader.ItemShinyHammer));
		hammers.add(new ItemStack(ItemLoader.ItemXychoriumHammer));
		hammers.add(new ItemStack(ItemLoader.ItemUraniumHammer));
		hammers.add(new ItemStack(ItemLoader.ItemTitaniumHammer));
		hammers.add(new ItemStack(ItemLoader.ItemBloodStoneHammer));
		hammers.add(new ItemStack(ItemLoader.ItemRustedHammer));
		hammers.add(new ItemStack(ItemLoader.ItemRositeHammer));
		hammers.add(new ItemStack(ItemLoader.ItemLimoniteHammer));




		hammers.add(new ItemStack(ItemLoader.ItemPatHammer));
		hammers.add(new ItemStack(ItemLoader.ItemJenHammer));
		hammers.add(new ItemStack(ItemLoader.ItemDanTDMHammer));
		hammers.add(new ItemStack(ItemLoader.ItemxJSQHammer));
		hammers.add(new ItemStack(ItemLoader.ItemSkyTheKidRSHammer));
		hammers.add(new ItemStack(ItemLoader.ItemThackAttack_MCHammer));
		hammers.add(new ItemStack(ItemLoader.Item_MrGregor_Hammer));

		hammers.add(new ItemStack(ItemLoader.ItemCryingObsidainHammer));
		hammers.add(new ItemStack(ItemLoader.ItemMythicalHammer));
		hammers.add(new ItemStack(ItemLoader.ItemToasterHammer));
		
	}

	public static void addToChests() {
		int numHammers = 79;
		for (int i = 0; i < numHammers ; i++) {
			
				if(HammerMod.DEBUG_MODE == true) {
					System.out.println("DEBUG: Injected Hammer with ID " + i + " into the Minecraft LootChests.");
				}
				
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
		 	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
			ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(hammers.get(i), 0, 1, 1));
		}
		
	}
	
}
