


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
			{"moretrees:apple_tree", "moretrees:apple_tree", "moretrees:apple_tree"},
			{"moretrees:apple_tree", "group:stick", "moretrees:apple_tree"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:oak", "moretrees:oak", "moretrees:oak"},
			{"moretrees:oak", "group:stick", "moretrees:oak"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:acorn", "moretrees:acorn", "moretrees:acorn"},
			{"moretrees:acorn", "group:stick", "moretrees:acorn"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:sequoia", "moretrees:sequoia", "moretrees:sequoia"},
			{"moretrees:sequoia", "group:stick", "moretrees:sequoia"},
			{"", "group:stick", ""},
		}
	})
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
			{"moretrees:birch", "moretrees:birch", "moretrees:birch"},
			{"moretrees:birch", "group:stick", "moretrees:birch"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:palm", "moretrees:palm", "moretrees:palm"},
			{"moretrees:palm", "group:stick", "moretrees:palm"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:palm_fruit_trunk_gen", "moretrees:palm_fruit_trunk_gen", "moretrees:palm_fruit_trunk_gen"},
			{"moretrees:palm_fruit_trunk_gen", "group:stick", "moretrees:palm_fruit_trunk_gen"},
			{"", "group:stick", ""},
		}
	})
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
			{"moretrees:date_palm", "moretrees:date_palm", "moretrees:date_palm"},
			{"moretrees:date_palm", "group:stick", "moretrees:date_palm"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:date_palm_fruit_trunk", "moretrees:date_palm_fruit_trunk", "moretrees:date_palm_fruit_trunk"},
			{"moretrees:date_palm_fruit_trunk", "group:stick", "moretrees:date_palm_fruit_trunk"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:spruce", "moretrees:spruce", "moretrees:spruce"},
			{"moretrees:spruce", "group:stick", "moretrees:spruce"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:spruce_cone", "moretrees:spruce_cone", "moretrees:spruce_cone"},
			{"moretrees:spruce_cone", "group:stick", "moretrees:spruce_cone"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:cedar", "moretrees:cedar", "moretrees:cedar"},
			{"moretrees:cedar", "group:stick", "moretrees:cedar"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:cedar_cone", "moretrees:cedar_cone", "moretrees:cedar_cone"},
			{"moretrees:cedar_cone", "group:stick", "moretrees:cedar_cone"},
			{"", "group:stick", ""},
		}
	})
	minetest.register_craft({
		output = "hammermod:ItemWoodHammer",
		recipe = {
			{"moretrees:poplar", "moretrees:poplar", "moretrees:poplar"},
			{"moretrees:poplar", "group:stick", "moretrees:poplar"},
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
