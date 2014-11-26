package org.bottle.plugin;

import org.bottle.Getter;
import org.bottle.connect.ConnectionHandler;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginBase extends JavaPlugin {

	/**
	 * Registers all events having to do with Bottle API 
	 * @param plugin
	 */
	
	public static void registerBottleEvents(Plugin plugin) {
		Getter.getServer().getPluginManager().registerEvents(new ConnectionHandler(), plugin);
	}
}
