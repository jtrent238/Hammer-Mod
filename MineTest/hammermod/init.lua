-- hammermod (Hammer Mod 1.0.0.0)
-- Hammer mod made by jtrent238

-- Definitions made by this mod that other mods can use too
hammermod = {}

hammermod.modname = minetest.get_current_modname()

-- Load other files
--dofile(minetest.get_modpath("hammermod").."/functions.lua")
--dofile(minetest.get_modpath("hammermod").."/playerchecker.lua")
dofile(minetest.get_modpath("hammermod").."/coreinjection.lua")
dofile(minetest.get_modpath("hammermod").."/hammerdefinition.lua")
dofile(minetest.get_modpath("hammermod").."/hammercrafting.lua")

-- Set a noticeable inventory formspec for players
minetest.register_on_joinplayer(function(player)
	local cb = function(player)
		minetest.chat_send_player(player:get_player_name(), "Hammermod made by: jtrent238")
	end
	minetest.after(2.0, cb, player)
end)

local function tab_category(tab_id)
	local id_category = {
		nil, -- Reserved for crafting tab.
		--minetest.registered_items, --Default Catagory
		--minetest.registered_nodes, --Default Catagory
		--minetest.registered_tools, --Default Catagory
		minetest.registered_crafthammers
	}
end

sfinv.pages["creative:hammers"] = hammers
creative.register_tab("hammertab", "jtrent238's Hammer Mod", minetest.registered_hammers)

-- ITEMS
--minetest.register_craftitem('hammermod:ItemToast', {
--    description = 'Toast',
--    inventory_image = 'ItemToast.png',
--    stack_max = 64,
--})
