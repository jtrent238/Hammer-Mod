--Add Hammers to the core of Minetest
core.registered_hammers = {}
setmetatable(core.registered_hammers, alias_metatable)
hammerdef = {}

--if itemdef.type == "hammer" then
--		setmetatable(hammerdef, {__index = core.hammerdef_default})
--		core.registered_hammers[hammerdef.name] = hammerdef
--end

function core.register_hammer(name, hammerdef)
	hammerdef.type = "hammer"
	hammerdef.stack_max = 1

	-- BEGIN Legacy stuff
	if hammerdef.inventory_image == nil and hammerdef.image ~= nil then
		hammerdef.inventory_image = hammerdef.image
	end
	if hammerdef.hammer_capabilities == nil and
	   (hammerdef.full_punch_interval ~= nil or
	    hammerdef.basetime ~= nil or
	    hammerdef.dt_weight ~= nil or
	    hammerdef.dt_crackiness ~= nil or
	    hammerdef.dt_crumbliness ~= nil or
	    hammerdef.dt_cuttability ~= nil or
	    hammerdef.basedurability ~= nil or
	    hammerdef.dd_weight ~= nil or
	    hammerdef.dd_crackiness ~= nil or
	    hammerdef.dd_crumbliness ~= nil or
	    hammerdef.dd_cuttability ~= nil) then
		hammerdef.hammer_capabilities = {
			full_punch_interval = hammerdef.full_punch_interval,
			basetime = hammerdef.basetime,
			dt_weight = hammerdef.dt_weight,
			dt_crackiness = hammerdef.dt_crackiness,
			dt_crumbliness = hammerdef.dt_crumbliness,
			dt_cuttability = hammerdef.dt_cuttability,
			basedurability = hammerdef.basedurability,
			dd_weight = hammerdef.dd_weight,
			dd_crackiness = hammerdef.dd_crackiness,
			dd_crumbliness = hammerdef.dd_crumbliness,
			dd_cuttability = hammerdef.dd_cuttability,
		}
	end
	-- END Legacy stuff

	core.register_item(name, hammerdef)
end
