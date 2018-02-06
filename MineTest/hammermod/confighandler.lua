   -- configuration file for program `hammermod'
    if toastercustombreaksound("ToasterCustomBreakSound") == "false" then
      minetest.log([info,] "ToasterCustomBreakSound = false")
    else
      minetest.log([info,] "ToasterCustomBreakSound = true")

    if hammercustombreaksound("HammerCustomBreakSound") == "true" then
      minetest.log([info,] "HammerCustomBreakSound = true")
    else
      minetest.log([info,] "HammerCustomBreakSound = false")
      
    if randomtoast("RandomToast") == "true" then
      minetest.log([info,] "RandomToast = true")
    else
      minetest.log([info,] "RandomToast = false")
         
    if sharptoast("SharpToast") == "true" then
      minetest.log([info,] "SharpToast = true")
    else
      minetest.log([info,] "SharpToast = false")
            
    if debugmode("DebugMode") == "true" then
      minetest.log([info,] "DebugMode = true")
    else
      minetest.log([info,] "DebugMode = false")
               
    if rainbowhammerrecipe("RainbowHammerRecipe") == "true" then
      minetest.log([info,] "RainbowHammerRecipe = true")
    else
      minetest.log([info,] "RainbowHammerRecipe = false")
