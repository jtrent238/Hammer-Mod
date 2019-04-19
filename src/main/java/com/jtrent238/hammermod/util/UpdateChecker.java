package com.jtrent238.hammermod.util;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.logging.log4j.Level;

import com.jtrent238.hammermod.Config;
import com.jtrent238.hammermod.Main;

public class UpdateChecker {

	private static boolean needUpdate;
	public static String webVer;

	
public static boolean isUpdateAvailable() throws IOException {
	  
	  URL oracle = new URL("https://raw.githubusercontent.com/jtrent238/Hammer-Mod/1.12.2/version_file.txt");
      
	  BufferedReader in = new BufferedReader(
      new InputStreamReader(oracle.openStream()));

      String readIn;
      readIn = in.readLine();
          webVer = readIn;
          if (Config.DISABLE_UPDATES == false) {
        	  if (webVer == "" || webVer == null) {
        			Main.logger.log(Level.WARN, "Something happened while checking for updates for " + Main.MODNAME + ".");
        			needUpdate = false;
        		} else {
        			if (Main.MODVERSION == readIn) {
        				  Main.logger.log(Level.INFO, "You are using the latest version of " + Main.MODNAME + ".");
        				  needUpdate = false;
        			} else {
        				if (Main.MODVERSION != readIn){
      				  	  Main.logger.log(Level.INFO, "An update is available for " + Main.MODNAME + ".");
      				  	  Main.logger.log(Level.INFO, "Your Version: " + Main.MODVERSION + " Latest version: " + readIn);
      				  	  needUpdate = true;
        				}
        			}
        			
        			
        		} 
          } else {
        	  Main.logger.log(Level.INFO, "Updates are disabled in the config. Will not check for updates.");
        	  needUpdate = false;
          }
	
      in.close();
      
      return needUpdate;
	  }

	public static void displayUpdateMsgBox() {
		if (needUpdate == true) {
			if (Config.DISABLE_UPDATE_MSG_BOX == false) {
				Main.logger.log(Level.INFO, "To continue you must Click \"OK\" in the update box.");
				JOptionPane.showMessageDialog(null, "There is an update for " + Main.MODNAME + "\n" + "Your Version: "+ Main.MODVERSION + " " + "New Version: " + webVer + "\n" + "By not updating you WILL NOT receive proper support!" + "\n" + "You can disable this message in the config.", "Update available!", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
