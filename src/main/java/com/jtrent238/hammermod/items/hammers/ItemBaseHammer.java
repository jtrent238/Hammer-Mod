package com.jtrent238.hammermod.items.hammers;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.jtrent238.hammermod.Abilities;
import com.jtrent238.hammermod.HammerMod;
import com.jtrent238.hammermod.ItemLoader;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class ItemBaseHammer extends ItemPickaxe {


	public static final EnumChatFormatting ToolTipColor_TWITCH = EnumChatFormatting.DARK_PURPLE;
	public static final EnumChatFormatting ToolTipColor_YOUTUBE = EnumChatFormatting.RED;
	public static final EnumChatFormatting ToolTipColor_PATREON = EnumChatFormatting.GOLD;
	public static final EnumChatFormatting ToolTipColor_COMMUNITY = EnumChatFormatting.YELLOW;
	public static final EnumChatFormatting ToolTipColor_COMMUNITY_NAME = EnumChatFormatting.GREEN;
	public static final EnumChatFormatting ToolTipColor_DEVELOPER = EnumChatFormatting.DARK_GREEN;
	public static final EnumChatFormatting ToolTipColor_SPECIAL = EnumChatFormatting.GOLD;
	public static final EnumChatFormatting ToolTipColor_RAINBOW = EnumChatFormatting.DARK_GREEN;
	public static final EnumChatFormatting ToolTipColor_BASIC = EnumChatFormatting.DARK_AQUA;
	public static final EnumChatFormatting ToolTipColor_MULTIPLIER = EnumChatFormatting.AQUA;
	public static final EnumChatFormatting ToolTipColor_INFO = EnumChatFormatting.DARK_GRAY;
	
	private Object toolMaterial;
	private Block blockMined;
	private World world;
	private int x;
	private int y;
	private int z;
	private int metadata;
	private int fortune;
	private int damageVsEntity;
	private int hammerMaterial;
	private float field_150934_a;
	private ItemStack stack;
    private Set field_150914_c;
    protected float efficiencyOnProperMaterial = 4.0F * hammerMaterial;

	
	public/*protected*/ ItemBaseHammer(ToolMaterial material) {
        super(material);
        this.maxStackSize = 1;
		this.damageVsEntity = hammerMaterial * 2;
		this.getAttributeModifiers(stack);
		this.getToolClasses(stack);
		this.field_150934_a = 4.0F + material.getDamageVsEntity() * hammerMaterial;
			toolClass = "hammer";
		this.canRepair = true;
		this.getMetadata(getMaxDamage());
		this.setFull3D();
		this.canRepairItems();
        }
	

	private void canRepairItems() {
		
	}

	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "sword");
	}
	
	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.stone});
	public static Object color;

	{
		
	if(blockMined == Blocks.stone){
		(Blocks.stone).getDrops(world, x, y, z, metadata, fortune);
	}
}
	public Item.ToolMaterial func_150913_i()
    {
        return (ToolMaterial) this.toolMaterial;
    }
	

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return ((ToolMaterial) this.toolMaterial).getEnchantability();
    }

    /**
     * Return the name for this tool's material.
     */
    /*public String getToolMaterialName()
    {
        return this.toolMaterial.toString();
    }*/

    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_)
    {
        ItemStack mat = ((ToolMaterial) this.toolMaterial).getRepairItemStack();
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, p_82789_2_, false)) return true;
        return super.getIsRepairable(p_82789_1_, p_82789_2_);
    }

    
	/**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.field_150934_a, 0));
        return multimap;
    }
    
    public float func_150931_i()
    {
        return ((ToolMaterial) this.toolMaterial).getDamageVsEntity();
    }
    
    private String toolClass;
    @Override
    public int getHarvestLevel(ItemStack stack, String toolClass)
    {
        int level = super.getHarvestLevel(stack, toolClass);
        if (level == -1 && toolClass != null && toolClass.equals(this.toolClass))
        {
            return ((ToolMaterial) this.toolMaterial).getHarvestLevel();
        }
        else
        {
            return level;
        }
    }
    
/*
    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
    {
        return this.field_150914_c.contains(p_150893_2_) ? this.efficiencyOnProperMaterial : 1.0F;
    }
*/
    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_)
    {
        p_77644_1_.damageItem(2, p_77644_3_);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack p_150894_1_, World p_150894_2_, Block p_150894_3_, int p_150894_4_, int p_150894_5_, int p_150894_6_, EntityLivingBase p_150894_7_)
    {
        if ((double)p_150894_3_.getBlockHardness(p_150894_2_, p_150894_4_, p_150894_5_, p_150894_6_) != 0.0D)
        {
            p_150894_1_.damageItem(1, p_150894_7_);
        }
        	
        	/*
        if (Abilities.hulkSmash == true) {
        	Minecraft.getMinecraft().thePlayer.canHarvestBlock(Blocks.bedrock);
        	p_150894_7_.playSound("hammermod:hulksmash", 5F, 5F);
        	Minecraft.getMinecraft().thePlayer.getBreakSpeed(p_150894_3_, true, 0, p_150894_4_, p_150894_5_, p_150894_6_);
        	p_150894_1_.damageItem(100, p_150894_7_);
        	//Abilities.hulkSmash = false;
        }
        	*/
        
        if(HammerMod.SMASH_BREAK_SOUND == true) {
        	p_150894_7_.playSound("hammermod:smash", 5F, 5F);
        }
        
        
        return true;
    }

    public void onBlockBreak(BreakEvent event) {
    	EntityPlayer player = event.getPlayer();

    	if(event.world != null && player != null) {
    		if(player.inventory.getCurrentItem().getItem() != null) {
    			if(player.inventory.getCurrentItem().getItem().equals(this)) {
    				int direction = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

    				ItemStack hammer = player.inventory.getCurrentItem();

    				System.out.println("ITEM IN HAND IS HAMMER");

    				Block block = event.block;

    				World world = event.world;

    				int x = event.x;
    				int y = event.y;
    				int z = event.z;

    				NBTTagCompound cmp = hammer.stackTagCompound;

    				if(cmp != null) {
    					System.out.println("CMP IS NOT NULL");

    					if(cmp.getString("MiningSize") != null) {
    						System.out.println("MININGSIZE IS NOT NULL");

    						if(cmp.getString("MiningSize").equals("1x1")) {
    							System.out.println("1x1");
    							return;
    						}else if(cmp.getString("MiningSize").equals("3x3")) {
    							//System.out.println("3x3");
    							this.breakThreeByThree(world, x, y, z, direction);
    						}else if(cmp.getString("MiningSize").equals("5x5")) {

    						}else if(cmp.getString("MiningSize").equals("7x7")) {

    						}
    					}
    				}
    			}
    		}
    	}
    }

    
    public void breakThreeByThree(World world, int x, int y, int z, int playerFacing) {
    	if(playerFacing == 0 || playerFacing == 2) { //SOUTH
    		world.func_147480_a(x, y + 1, z, true);
    		world.func_147480_a(x - 1, y + 1, z, true);
    		world.func_147480_a(x + 1, y + 1, z, true);
    		world.func_147480_a(x, y - 1, z, true);
    		world.func_147480_a(x - 1, y - 1, z, true);
    		world.func_147480_a(x + 1, y - 1, z, true);
    		world.func_147480_a(x - 1, y, z, true);
    		world.func_147480_a(x + 1, y, z, true);
    	}else {
    		world.func_147480_a(x, y + 1, z, true);
    		world.func_147480_a(x, y + 1, z - 1, true);
    		world.func_147480_a(x, y + 1, z + 1, true);
    		world.func_147480_a(x, y - 1, z, true);
    		world.func_147480_a(x, y - 1, z - 1, true);
    		world.func_147480_a(x, y - 1, z + 1, true);
    		world.func_147480_a(x, y, z - 1, true);
    		world.func_147480_a(x, y, z + 1, true);
    	}
    }
    
    /**
     * Metadata-sensitive version of getStrVsBlock
     * @param itemstack The Item Stack
     * @param block The block the item is trying to break
     * @param metadata The items current metadata
     * @return The damage strength
     */
    /*public float getDigSpeed(ItemStack itemstack, Block block, int metadata)
    {
        return func_150893_a(itemstack, block) * 4;
    }
    */

    /**
     * Damage versus entities.
     */
    public float getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    
}
