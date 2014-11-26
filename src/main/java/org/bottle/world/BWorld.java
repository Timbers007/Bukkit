package org.bottle.world;

import org.bottle.Getter;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public abstract class BWorld implements World {

	/**
	 * Teleports the given entity to the given location. 
	 * @param e - Entity
	 * @param loc - Location (* Remember * Includes World and can be created via new Location())
	 */
	
	public static void teleport(Entity e, Location loc) {
		e.teleport(loc);
		Getter.getLogger().info("[BOTTLE SERVER] Teleported Entity [" + e.getType() + ", ID: " + e.getEntityId() + "] to: Word [" +
		loc.getWorld() + "], X[" + loc.getX() + "], Y[" + loc.getY() + "], Z[" + loc.getZ() + ".");
	}
}
