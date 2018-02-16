


-- CRAFTS

minetest.register_craft({
    output = 'hammermod:ItemCopperHammer',
    recipe = {
      {'default:copper_ingot','default:copper_ingot','default:copper_ingot'},
      {'default:copper_ingot', 'group:stick', 'default:copper_ingot'},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'hammermod:ItemIronHammer',
    recipe = {
      {'default:iron_lump','default:iron_lump','default:iron_lump'},
      {'default:iron_lump', 'group:stick', 'default:iron_lump'},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'hammermod:ItemSteelHammer',
    recipe = {
      {'default:steel_ingot','default:steel_ingot','default:steel_ingot'},
      {'default:steel_ingot', 'group:stick', 'default:steel_ingot'},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'hammermod:ItemBronzeHammer',
    recipe = {
      {'default:bronze_ingot','default:bronze_ingot','default:bronze_ingot'},
      {'default:bronze_ingot', 'group:stick', 'default:bronze_ingot'},
      {'', 'group:stick', ''},
    }
})

if mobs and ( mobs.redo or mobs.mod == 'redo') then
	minetest.register_craft({
		output = "hammermod:ItemLeatherHammer",
		recipe = {
			{"mobs:leather", "mobs:leather", "mobs:leather"},
			{"mobs:leather", "group:stick", "mobs:leather"},
			{"", "group:stick", ""},
		}
	})
end

minetest.register_craft({
    output = 'hammermod:ItemMeseHammer',
    recipe = {
      {'default:mese_crystal','default:mese_crystal','default:mese_crystal'},
      {'default:mese_crystal', 'group:stick', 'default:mese_crystal'},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'hammermod:ItemWoodHammer',
    recipe = {
      {'default:acacia_wood','default:acacia_wood','default:acacia_wood'},
      {'default:acacia_wood', 'group:stick', 'default:acacia_wood'},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'hammermod:ItemWoodHammer',
    recipe = {
      {'default:aspen_wood','default:aspen_wood','default:aspen_wood'},
      {'default:aspen_wood', 'group:stick', 'default:aspen_wood'},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'hammermod:ItemWoodHammer',
    recipe = {
      {'default:pine_wood','default:pine_wood','default:pine_wood'},
      {'default:pine_wood', 'group:stick', 'default:pine_wood'},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'hammermod:ItemWoodHammer',
    recipe = {
      {'default:wood','default:wood','default:wood'},
      {'default:wood', 'group:stick', 'default:wood'},
      {'', 'group:stick', ''},
    }
})

minetest.register_craft({
    output = 'hammermod:ItemMeseHammer',
    recipe = {
      {'default:mese_crystal','default:mese_crystal','default:mese_crystal'},
      {'default:mese_crystal', 'group:stick', 'default:mese_crystal'},
      {'', 'group:stick', ''},
    }
})
