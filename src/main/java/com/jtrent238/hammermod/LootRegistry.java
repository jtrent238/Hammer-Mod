package com.jtrent238.hammermod;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootRegistry {

	public ArrayList<ItemStack> hammers = new ArrayList<ItemStack>();

	LootRegistry(){
		addHammersasLoot();

	}

	private void addHammersasLoot() {
		
		hammers.add(new ItemStack(ItemLoader.ItemWoodHammer));				//0
		hammers.add(new ItemStack(ItemLoader.ItemStoneHammer));				//1
		hammers.add(new ItemStack(ItemLoader.ItemIronHammer));				//2
		hammers.add(new ItemStack(ItemLoader.ItemGoldHammer));				//3
		hammers.add(new ItemStack(ItemLoader.ItemDiamondHammer));			//4
		hammers.add(new ItemStack(ItemLoader.ItemDirtHammer));				//5
		hammers.add(new ItemStack(ItemLoader.ItemGlassHammer));				//6
		hammers.add(new ItemStack(ItemLoader.ItemSandHammer));				//7
		hammers.add(new ItemStack(ItemLoader.ItemCactusHammer));			//8
		hammers.add(new ItemStack(ItemLoader.ItemGravelHammer));			//9
		hammers.add(new ItemStack(ItemLoader.ItemWoolHammer_white));			//10
		hammers.add(new ItemStack(ItemLoader.ItemEmeraldHammer));			//11
		hammers.add(new ItemStack(ItemLoader.ItemGrassHammer));				//12
		hammers.add(new ItemStack(ItemLoader.ItemObsidianHammer));			//13
		hammers.add(new ItemStack(ItemLoader.ItemGlowstoneHammer));			//14
		hammers.add(new ItemStack(ItemLoader.ItemRedstoneHammer));			//15
		hammers.add(new ItemStack(ItemLoader.ItemLapizHammer));				//16
		hammers.add(new ItemStack(ItemLoader.ItemNetherackHammer));			//17
		hammers.add(new ItemStack(ItemLoader.ItemSoulSandHammer));			//18
		hammers.add(new ItemStack(ItemLoader.ItemCoalHammer));				//19
		hammers.add(new ItemStack(ItemLoader.ItemCharcoalHammer));			//20
		hammers.add(new ItemStack(ItemLoader.ItemEndstoneHammer));			//21
		hammers.add(new ItemStack(ItemLoader.ItemBoneHammer));				//22
		hammers.add(new ItemStack(ItemLoader.ItemSpongeHammer));			//23
		hammers.add(new ItemStack(ItemLoader.ItemBrickHammer));				//24
		hammers.add(new ItemStack(ItemLoader.ItemSugarHammer));				//25
		hammers.add(new ItemStack(ItemLoader.ItemSlimeHammer));				//26
		hammers.add(new ItemStack(ItemLoader.ItemMelonHammer));				//27
		hammers.add(new ItemStack(ItemLoader.ItemPumpkinHammer));			//28
		hammers.add(new ItemStack(ItemLoader.ItemPotatoHammer));			//29
		hammers.add(new ItemStack(ItemLoader.ItemCarrotHammer));			//30
		hammers.add(new ItemStack(ItemLoader.ItemAppleHammer));				//31
		hammers.add(new ItemStack(ItemLoader.ItemIceHammer));				//32
		hammers.add(new ItemStack(ItemLoader.ItemPackedIceHammer));			//33
		hammers.add(new ItemStack(ItemLoader.ItemSnowHammer));				//34
		hammers.add(new ItemStack(ItemLoader.ItemCakeHammer));				//35
		hammers.add(new ItemStack(ItemLoader.ItemDragonEggHammer));			//46
		hammers.add(new ItemStack(ItemLoader.ItemTntHammer));				//37
		hammers.add(new ItemStack(ItemLoader.ItemBedrockHammer));			//38


		hammers.add(new ItemStack(ItemLoader.ItemCreeperHammer));			//40
		hammers.add(new ItemStack(ItemLoader.ItemPigHammer));				//41
		hammers.add(new ItemStack(ItemLoader.ItemCowHammer));				//42


		hammers.add(new ItemStack(ItemLoader.ItemCopperHammer));			//43
		hammers.add(new ItemStack(ItemLoader.ItemBronzeHammer));			//44
		hammers.add(new ItemStack(ItemLoader.ItemTungstenHammer));			//45
		hammers.add(new ItemStack(ItemLoader.ItemRubyHammer));				//46
		hammers.add(new ItemStack(ItemLoader.ItemTinHammer));				//47
		hammers.add(new ItemStack(ItemLoader.ItemSilverHammer));			//48
		hammers.add(new ItemStack(ItemLoader.ItemJadeHammer));				//49
		hammers.add(new ItemStack(ItemLoader.ItemAmethystHammer));			//50
		hammers.add(new ItemStack(ItemLoader.ItemGraphiteHammer));			//51
		hammers.add(new ItemStack(ItemLoader.ItemCitrineHammer));			//52
		hammers.add(new ItemStack(ItemLoader.ItemPierreHammer));			//53
		hammers.add(new ItemStack(ItemLoader.ItemSapphireHammer));			//54
		hammers.add(new ItemStack(ItemLoader.ItemOnyxHammer));				//55
		hammers.add(new ItemStack(ItemLoader.ItemNikoliteHammer));			//56
		hammers.add(new ItemStack(ItemLoader.ItemSilicaHammer));			//57
		hammers.add(new ItemStack(ItemLoader.ItemCinnabarHammer));			//58
		hammers.add(new ItemStack(ItemLoader.ItemAmberBearingStoneHammer));		//59
		hammers.add(new ItemStack(ItemLoader.ItemFerrousHammer));			//60
		hammers.add(new ItemStack(ItemLoader.ItemAdaminiteHammer));			//61
		hammers.add(new ItemStack(ItemLoader.ItemShinyHammer));				//62
		hammers.add(new ItemStack(ItemLoader.ItemXychoriumHammer));			//63
		hammers.add(new ItemStack(ItemLoader.ItemUraniumHammer));			//64
		hammers.add(new ItemStack(ItemLoader.ItemTitaniumHammer));			//65
		hammers.add(new ItemStack(ItemLoader.ItemAdamantiteHammer));			//66


		hammers.add(new ItemStack(ItemLoader.ItemPatHammer));				//67
		hammers.add(new ItemStack(ItemLoader.ItemJenHammer));				//68
		hammers.add(new ItemStack(ItemLoader.ItemDanTDMHammer));			//69
		hammers.add(new ItemStack(ItemLoader.ItemxJSQHammer));				//70
		hammers.add(new ItemStack(ItemLoader.ItemSkyTheKidRSHammer));			//71
		hammers.add(new ItemStack(ItemLoader.ItemThackAttack_MCHammer));		//72
		hammers.add(new ItemStack(ItemLoader.Item_MrGregor_Hammer));			//73


		hammers.add(new ItemStack(ItemLoader.ItemCryingObsidainHammer));		//74
		hammers.add(new ItemStack(ItemLoader.ItemMythicalHammer));			//75
		hammers.add(new ItemStack(ItemLoader.ItemToasterHammer));			//76
		
	}

	private void addToChests() {
		//for (int i = 0; i < 20; i++) {
			//=========VILLAGE_BLACKSMITH Start========================================
			ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(hammers.get(0), 0, 1, 1));
			
		 //}
		
	}
	
}
