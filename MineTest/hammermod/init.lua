-- default (Minetest 0.4 mod)
-- Most default stuff

-- The API documentation in here was moved into doc/lua_api.txt

WATER_ALPHA = 160
WATER_VISC = 1
LAVA_VISC = 7
LIGHT_MAX = 14

-- Definitions made by this mod that other mods can use too
default = {}

-- Load other files
dofile(minetest.get_modpath("hammermod").."/functions.lua")

-- Set a noticeable inventory formspec for players
minetest.register_on_joinplayer(function(player)
	local cb = function(player)
		minetest.chat_send_player(player:get_player_name(), "This is the [minimal] \"Minimal Development Test\" game. Use [minetest_game] for the real thing.")
	end
	minetest.after(2.0, cb, player)
end)

--
-- Hammer definition
--


minetest.register_tool("hammermod:ItemWoodHammer", {
	description = "Wood Hammer",
	inventory_image = "ItemWoodHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemStoneHammer", {
	description = "Stone Hammer",
	inventory_image = "ItemStoneHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemIronHammer", {
	description = "Iron Hammer",
	inventory_image = "ItemIronHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemGoldHammer", {
	description = "Gold Hammer",
	inventory_image = "ItemGoldHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemDiamondHammer", {
	description = "Diamond Hammer",
	inventory_image = "ItemDiamondHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemEmeraldHammer", {
	description = "Emerald Hammer",
	inventory_image = "ItemEmeraldHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemClayHammer", {
	description = "Clay Hammer",
	inventory_image = "ItemClayHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemSpongeHammer", {
	description = "Sponge Hammer",
	inventory_image = "ItemSpongeHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemCreeperHammer", {
	description = "Creeper Hammer",
	inventory_image = "ItemCreeperHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemCowHammer", {
	description = "Cow Hammer",
	inventory_image = "ItemCowHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemPigHammer", {
	description = "Pig Hammer",
	inventory_image = "ItemPigHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemTntHammer", {
	description = "TNT Hammer",
	inventory_image = "ItemTntHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemRainbowHammer", {
	description = "Rainbow Hammer",
	inventory_image = "ItemRainbowHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemToasterHammer", {
	description = "Toaster Hammer",
	inventory_image = "ItemToasterHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

local toasterbreak = {
		dug = { name = "toasterbreak", gain = 0.8 },
		dig = { name = "toasterbreak", gain = 0.4 },
   }
   
--sounds.register("toasterbreak", toasterbreak)
minetest.register_tool("hammermod:ItemGrassHammer", {
	description = "Grass Hammer",
	inventory_image = "ItemGrassHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
	minetest.sound_play("toasterbreak", {pos = pos}),
	sounds = {
			dug = { name = "toasterbreak", gain = 0.8 },
			dig = { name = "toasterbreak", gain = 0.4 },
			breaks = "toasterbreak", -- tools only
            --place = --[[<SimpleSoundSpec>]],
		},
})

minetest.register_tool("hammermod:ItemDirtHammer", {
	description = "Dirt Hammer",
	inventory_image = "ItemDirtHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemGlassHammer", {
	description = "Glass Hammer",
	inventory_image = "ItemGlassHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemPatHammer", {
	description = "FuriousDestroyer Hammer",
	inventory_image = "ItemPatHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemJenHammer", {
	description = "SuperGirlyGamer Hammer",
	inventory_image = "ItemJenHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

minetest.register_tool("hammermod:ItemMelonHammer", {
	description = "Melon Hammer",
	inventory_image = "ItemMelonHammer.png",
	tool_capabilities = {
		max_drop_level=0,
		groupcaps={
			cracky={times={[2]=2.00, [3]=1.20}, uses=10, maxlevel=1}
		}
	},
})

-- ITEMS
--minetest.register_craftitem('epicproportions:ingot_jen', {
--    description = 'SuperGirlyGamer Ingot',
--    inventory_image = 'itemJenIngot.png',
--    stack_max = 64,
--})



-- CRAFTS

--minetest.register_craft({
--    output = 'epicproportions:pick_pat',
--    recipe = {
--      {'epicproportions:ingot_pat','epicproportions:ingot_pat','epicproportions:ingot_pat'},
--      {'', 'group:stick', ''},
--      {'', 'group:stick', ''},
--    }
--})
