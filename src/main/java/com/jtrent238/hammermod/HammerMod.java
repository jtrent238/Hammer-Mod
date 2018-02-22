package com.jtrent238.hammermod;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.jtrent238.hammermod.command.CommandAbilities;
import com.jtrent238.hammermod.command.CommandChangelog;
import com.jtrent238.hammermod.common.CommonProxy;
import com.jtrent238.hammermod.items.hammers.ItemBaseHammer;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid=HammerMod.MODID, name=HammerMod.MODNAME, version=(HammerMod.MODVERSION))
public class HammerMod
{

	
	@SidedProxy(clientSide="com.jtrent238.hammermod.client.ClientProxy", serverSide="com.jtrent238.hammermod.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "hammermod";

	@Instance(MODID)
    public static HammerMod instance;
	public static final String MODVERSION = "1.1.3.9";
	public static final String MODNAME = "jtrent238's Hammer Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";

	public static final int numHammers = 119;
	
	private PlayerLoggedInEvent username;


	public static boolean CUSTOM_HAMMER_1_ENCHANT_GLINT;
	public static boolean CUSTOM_HAMMER_1;
	public static Property CUSTOM_HAMMER_1_NAME;
	public static Object CUSTOM_HAMMER_1_TOOLMATERIAL;
	public static Property CUSTOM_HAMMER_1_TEXTURE;
	public static Property CUSTOM_HAMMER_DESC_1;
	public static Property CUSTOM_HAMMER_1_LANG_NAME;
	public static Property CUSTOM_HAMMER_1_MATERIALMODIFIER;
	public static Property CUSTOM_HAMMER_1_CRAFT;
	
	public static boolean SMASH_BREAK_SOUND;
	public static boolean TOASTER_BREAK_SOUND;
	public static boolean RANDOM_TOAST;
	public static boolean SHARP_TOAST;
	public static boolean DEBUG_MODE;
	public static boolean RAINBOWCRAFT;
	
	public static final String CATEGORY_CUSTOM_HAMMERS = "Custom Hammers";
	public static final String CATEGORY_SETTINGS = "Settings";
	public static final String CATEGORY_SETTINGS = "Hammers";

	//public static ToolMaterial MATERIAL_NAME = EnumHelper.addToolMaterial("MATERIAL_NAME", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	//public static ToolMaterial DIRT = EnumHelper.addToolMaterial("DIRT", 0, 10, 2, 1, 4);
	//public static ToolMaterial GLASS = EnumHelper.addToolMaterial("GLASS", 0, 6, 50, 1, 1);
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	event.getModConfigurationDirectory();
	event.getModConfigurationDirectory();
	event.getModLog();
	event.getModMetadata();
	event.getModState();
	event.getSide();
	event.getVersionProperties();
	
	
	config.load();
	config.getLoadedConfigVersion();
	
	//========================================CUSTOM HAMMERS=============================================
	CUSTOM_HAMMER_1 = config.get(CATEGORY_CUSTOM_HAMMERS, "Enable Custom Hammer 1", false).getBoolean(false);
	CUSTOM_HAMMER_1_NAME = config.get(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer 1 Internal Name", "CustomHammer1");
	CUSTOM_HAMMER_1_LANG_NAME = config.get(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer 1 Name", "Custom Hammer 1");
	CUSTOM_HAMMER_1_TOOLMATERIAL = config.get(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer 1 Tool Material", "IRON");
	CUSTOM_HAMMER_1_MATERIALMODIFIER = config.get(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer 1 Material Modifier", 16);
	CUSTOM_HAMMER_1_TEXTURE = config.get(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer 1 Texture", "hammermod:\\custom\\custom_1");
	CUSTOM_HAMMER_DESC_1 = config.get(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer 1 Description", "I'm A Custom Hammer");
	CUSTOM_HAMMER_1_CRAFT = config.get(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer 1 Crafting Recipe", "XXX, NSN, NSN, 'X', Items.ingotIron, 'S', Items.stick");
	CUSTOM_HAMMER_1_ENCHANT_GLINT = config.get(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer 1 Enchantment Effect", false).getBoolean(false);
	//===================================================================================================
	
	//=======================================SETTINGS====================================================
	SMASH_BREAK_SOUND = config.get(CATEGORY_SETTINGS, "HammerCustomBreakSound", false).getBoolean(false);
	TOASTER_BREAK_SOUND = config.get(CATEGORY_SETTINGS, "ToasterCustomBreakSound", true).getBoolean(true);
	RANDOM_TOAST = config.get(CATEGORY_SETTINGS, "RandomToast", false).getBoolean(false);
	SHARP_TOAST = config.get(CATEGORY_SETTINGS, "SharpToast", false).getBoolean(false);
	DEBUG_MODE  = config.get(CATEGORY_SETTINGS, "DebugMode", false).getBoolean(false);
	RAINBOWCRAFT  = config.get(CATEGORY_SETTINGS, "RainbowHammerRecipe", false).getBoolean(false);
	//====================================================================================================
	
	//==========================VANNILA HAMMERS===========================================================
	WOOD_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	STONE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	IRON_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	GOLD_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	DIAMOND_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	DIRT_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	GLASS_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	SAND_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	CACTUS_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	GRAVEL_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	WOOL_WHITE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	EMERALD_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	GRASS_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	OBISIDIAN_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	GLOWSTONE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	REDSTONE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	LAPIZ_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	NETHERRACK_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	SOULSAND_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	COAL_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	CHARCOAL_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	ENDSTONE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	BONE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	SPONGE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	BRICK_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	SUGAR_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	PUMPKIN_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	POTATO_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	CARROT_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	APPLE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	ICE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	PACKEDICE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	CAKE_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	DRAGONEGG_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	TNT_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	BEDROCK_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	//=======================================================================================================
	
	//========================================MOB HAMMERS====================================================
	PIG_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	COW_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	CREEPER_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	//=======================================================================================================
	
	//======================================MODDED HAMMERS===================================================
	_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	//=======================================================================================================
	
	//=====================================COMMUNITY HAMMERS=================================================
	TOASTER_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	CRYOBBY_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	//=======================================================================================================
	
	//======================================YOUTUBE HAMMERS==================================================
	TDM_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	PAT_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	JEN_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	JSQ_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	MRGREGOR_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	THACKATTACK_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	//========================================================================================================
	
	//===================================TWITCH HAMMERS=======================================================
	DEEJAYAXEL_HAMMER_ENABLE = config.get(CATEGORY_hammers, "Hammer", true).getBoolean(true);
	//========================================================================================================
	
	//config.addCustomCategoryComment(CATEGORY_INFO, "This Configfile is still [WIP] and may not work properly. ***Some things won't work!");
	config.addCustomCategoryComment(CATEGORY_CUSTOM_HAMMERS, "Custom Hammer Settings");
	config.addCustomCategoryComment(CATEGORY_SETTINGS, "Settings");
	config.addCustomCategoryComment(CATEGORY_HAMMERS, "Hammers");
	
	//config.getCategoryNames();
		
	config.save();
	
	event.getModLog();
	event.getModState();
	//Configuration configFile = new Configuration(event.getSuggestedConfigurationFile());
	
	//loadConfiguration(configFile);
	
	System.out.println(MODID + " >>> Configuration File Loaded");
	
	
	ModRegistry.registerMods();
	PlayerChecker.checkPlayer(username);
}



@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	
	
	ItemLoader.LoadItems();
	//BlockLoader.loadBlocks();
	Recipes.registerRecpies();
	//EntityLoader.LoadEntitys();
	//OreDict.addores();
	Achievements.loadAchievements();
	Stats.RegisterStats();

	PlayerChecker.checkPlayer(username);
	LootRegistry.registerLoot();
	
}


public static CreativeTabs HammerMod = new CreativeTabs("HammerMod")

{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.ItemDiamondHammer).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	/*
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "EpicProportionsMod_Halloween.png";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	*/
	};
/**
public static CreativeTabs CommunityHammers = new CreativeTabs("CommunityHammers")

{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.ItemCryingObsidainHammer).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
	/*
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "EpicProportionsMod_Halloween.png";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	
	}*/
	
;









@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		
	    Recipes.registerRecpies();

	    
	}
	
	
}


@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
     MinecraftServer server = MinecraftServer.getServer();
     // Get's the current server instance
     
     ICommandManager command = server.getCommandManager();
     ServerCommandManager manager = (ServerCommandManager) command;
     
     //manager.registerCommand(new CommandModInfo());
     manager.registerCommand(new CommandChangelog());
     manager.registerCommand(new CommandAbilities());
}

					
}
