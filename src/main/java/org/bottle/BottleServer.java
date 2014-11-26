package org.bottle;

import java.util.UUID;

import org.bottle.recipe.RecipeList;
import org.bottle.util.Implementation;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Recipe;

public abstract class BottleServer implements Server {
	
	/**
	 * Registers a recipe with The Bottle Server.
	 * @param r
	 */
	
	public static void registerRecipe(Recipe r) {
		RecipeList.addServerRecipe(r);
	}	
	
	public static boolean getOnline(Player p) {
		if (p.isOnline() == true) {
			return true;
		}
		if (p.isOnline() == false) {
			return false;
		}
		return false;
	}
	
	/**
	 * @see BottlePlayer.class
	 * @param p
	 */
	@Deprecated
	public static void getUUID(Player p) {
		p.getUniqueId();
	}
	
	/**
	 * @see BottlePlayer.class
	 * @param u
	 */
	@Deprecated
	public static Player getPlayerFromUUID(UUID u) {
		for (Player online : Bukkit.getServer().getOnlinePlayers()) {
			if (online.getUniqueId() == u) {
				return online;
			}
		}
		return Bukkit.getServer().getPlayer("error-1");
	}
	
	@Override
	public String getName() {
		return "BottleServer";
	}
	
	@Override
	public String getVersion() {
		return Implementation.VERSION;
	}
}
