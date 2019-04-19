package com.jtrent238.hammermod.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import net.minecraft.item.Item;

public class CustomHammerRegistry {

	private static String customHammerDir = "./config/hammermod/customhammers";
	static Item[] customHammers = new Item [] { };
	
	CustomHammerRegistry() {}
	
	public static JSONObject parseJSONFile(String filename) throws JSONException, IOException {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        return new JSONObject(content);
    }
	
	public static void createBaseHammer(String string) {
		File baseFile = new File(customHammerDir);
	    if (! baseFile.exists()){
	    	baseFile.mkdirs();
	    }

	    File file = new File(customHammerDir + "/" + string.toString() + ".json");
	    try{
	        FileWriter fw = new FileWriter(file.getAbsoluteFile());
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(string);
	        bw.close();
	    }
	    catch (IOException e){
	        e.printStackTrace();
	        System.exit(-1);
	    }
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static Item[] registerHammers() throws JSONException, IOException {
		
		//int numFiles = new File(customHammerDir ).list().toString().length();
		//Item[] customHammers = new Item [] {};;
		
		int numFiles = 1;
		for (int i = 0; i < numFiles ; i++) {
			String filename = new File(customHammerDir).list().toString().chars() + ".json";
	        JSONObject jsonObject = parseJSONFile(filename);
	        Item hammer = (Item) new File(customHammerDir).list().toString().chars();
			//Item[] customHammers = new Item [] { hammer };;
	        customHammers.equals(hammer);
	        //do anything you want with jsonObject
		}
		
		return customHammers;
	}
}
