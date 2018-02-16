


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

if moretrees then
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:beech", "moretrees:beech", "moretrees:beech"},
			{"moretrees:beech", "group:stick", "moretrees:beech"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:apple_tree_planks", "moretrees:apple_tree_planks", "moretrees:apple_tree_planks"},
			{"moretrees:apple_tree_planks", "group:stick", "moretrees:apple_tree_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:oak_planks", "moretrees:oak_planks", "moretrees:oak_planks"},
			{"moretrees:oak_planks", "group:stick", "moretrees:oak_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:acorn_planks", "moretrees:acorn_planks", "moretrees:acorn_planks"},
			{"moretrees:acorn_planks", "group:stick", "moretrees:acorn_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:sequoia_planks", "moretrees:sequoia_planks", "moretrees:sequoia_planks"},
			{"moretrees:sequoia_planks", "group:stick", "moretrees:sequoia_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:beech_planks", "moretrees:beech_planks", "moretrees:beech_planks"},
			{"moretrees:beech_planks", "group:stick", "moretrees:beech_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:birch_planks", "moretrees:birch_planks", "moretrees:birch_planks"},
			{"moretrees:birch_planks", "group:stick", "moretrees:birch_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:palm_planks", "moretrees:palm_planks", "moretrees:palm_planks"},
			{"moretrees:palm_planks", "group:stick", "moretrees:palm_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:beech_planks", "moretrees:beech_planks", "moretrees:beech_planks"},
			{"moretrees:beech_planks", "group:stick", "moretrees:beech_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:date_palm_planks", "moretrees:date_palm_planks", "moretrees:date_palm_planks"},
			{"moretrees:date_palm_planks", "group:stick", "moretrees:date_palm_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:spruce_planks", "moretrees:spruce_planks", "moretrees:spruce_planks"},
			{"moretrees:spruce_planks", "group:stick", "moretrees:spruce_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:cedar_planks", "moretrees:cedar_planks", "moretrees:cedar_planks"},
			{"moretrees:cedar_planks", "group:stick", "moretrees:cedar_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:poplar_planks", "moretrees:poplar_planks", "moretrees:poplar_planks"},
			{"moretrees:poplar_planks", "group:stick", "moretrees:poplar_planks"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:poplar_small", "moretrees:poplar_small", "moretrees:poplar_small"},
			{"moretrees:poplar_small", "group:stick", "moretrees:poplar_small"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:willow", "moretrees:willow", "moretrees:willow"},
			{"moretrees:willow", "group:stick", "moretrees:willow"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:rubber_tree", "moretrees:rubber_tree", "moretrees:rubber_tree"},
			{"moretrees:rubber_tree", "group:stick", "moretrees:rubber_tree"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:fir", "moretrees:fir", "moretrees:fir"},
			{"moretrees:fir", "group:stick", "moretrees:fir"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:jungletree", "moretrees:jungletree", "moretrees:jungletree"},
			{"moretrees:beejungletreech", "group:stick", "moretrees:jungletree"},
			{"", "group:stick", ""},
		}
	})
end

minetest.register_craft({
	output = "hammermod:ItemSandHammer",
	recipe = {
		{"default:sand", "default:sand", "default:sand"},
		{"default:sand", "group:stick", "default:sand"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemSandHammer",
	recipe = {
		{"default:desert_sand", "default:desert_sand", "default:desert_sand"},
		{"default:desert_sand", "group:stick", "default:desert_sand"},
		{"", "group:stick", ""},
	}
})
	
minetest.register_craft({
	output = "hammermod:ItemTntHammer",
	recipe = {
		{"tnt:tnt", "tnt:tnt", "tnt:tnt"},
		{"tnt:tnt", "group:stick", "tnt:tnt"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemStoneHammer",
	recipe = {
		{"default:cobble", "default:cobble", "default:cobble"},
		{"default:cobble", "group:stick", "default:cobble"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemBrickHammer",
	recipe = {
		{"default:brick", "default:brick", "default:brick"},
		{"default:brick", "group:stick", "default:brick"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemClayHammer",
	recipe = {
		{"default:clay_lump", "default:clay_lump", "default:clay_lump"},
		{"default:clay_lump", "group:stick", "default:clay_lump"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemIceHammer",
	recipe = {
		{"default:ice", "default:ice", "default:ice"},
		{"default:ice", "group:stick", "default:ice"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemGlassHammer",
	recipe = {
		{"default:glass", "default:glass", "default:glass"},
		{"default:glass", "group:stick", "default:glass"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemRoseHammer",
	recipe = {
		{"flowers:rose", "flowers:rose", "flowers:rose"},
		{"flowers:rose", "group:stick", "flowers:rose"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemCoalHammer",
	recipe = {
		{"default:coal_lump", "default:coal_lump", "default:coal_lump"},
		{"default:coal_lump", "group:stick", "default:coal_lump"},
		{"", "group:stick", ""},
	}
})

minetest.register_craft({
	output = "hammermod:ItemDirtHammer",
	recipe = {
		{"default:dirt", "default:dirt", "default:dirt"},
		{"default:dirt", "group:stick", "default:dirt"},
		{"", "group:stick", ""},
	}
})

if moretrees then
	minetest.register_craft({
		output = "hammermod:ItemCakeHammer",
		recipe = {
			{"moretrees:date_nut_cake", "moretrees:date_nut_cake", "moretrees:date_nut_cake"},
			{"moretrees:date_nut_cake", "group:stick", "moretrees:date_nut_cake"},
			{"", "group:stick", ""},
		}
	})
end

minetest.register_craft({
	output = "hammermod:ItemWheatHammer",
	recipe = {
		{"farming:wheat", "farming:wheat", "farming:wheat"},
		{"farming:wheat", "group:stick", "farming:wheat"},
		{"", "group:stick", ""},
	}
})
