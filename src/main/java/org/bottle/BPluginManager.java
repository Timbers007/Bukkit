package org.bottle;

import org.bukkit.plugin.PluginManager;

public abstract class BPluginManager implements PluginManager {

	public static BottleServer getServer() {
		return Getter.getServer();
	}
}
