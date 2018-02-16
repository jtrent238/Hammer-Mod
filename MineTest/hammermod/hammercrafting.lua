


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
