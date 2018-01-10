package com.jtrent238.hammermod.items.hammers;

import net.minecraft.item.Item.ToolMaterial;

public class ItemTntHammer  extends ItemBaseHammer{

	public ItemTntHammer(ToolMaterial material) {
		super(material);
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer entityplayer)
    {
			
		if(!world.isRemote)
			
			{
			
    		EntityTNTPrimed par1 = new EntityTNTPrimed(world);
    		par1.setPosition(entityplayer.posX, entityplayer.posY,entityplayer.posZ); 
    		world.spawnEntityInWorld(par1);
			
			}
		
			itemstack.damageItem(1, entityplayer);
		
		}
}
