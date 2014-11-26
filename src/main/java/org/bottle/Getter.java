package org.bottle;

import java.util.logging.Logger;

public class Getter {

	private static BottleServer bserver;
	private static BPluginManager bpm;
	
	/**
	 * Gets the instance of the class <code>BottleServer</code>.
	 * @return
	 */
	
	public static BottleServer getServer() {
		return bserver;
	}
	
	/**
	 * Gets the instance of the BPluginManager class.
	 * @return
	 */
	
	public static BPluginManager getPluginHander() {
		return bpm;
	}
	
	/**
	 * Grabs an instance of the Logger Class (Java File)
	 * @return
	 */
	
	public static Logger getLogger() {
		return Logger.getGlobal();
	}
	
}
