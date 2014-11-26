package org.bottle.player;

import org.bottle.permission.BPermission;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.permissions.Permissible;

/*
 * A work inprogress class for a new CommandSender API function.
 */

@Deprecated
public abstract class BottleCommandSender implements CommandSender, HumanEntity, Permissible {
	
	/**
	 * Returns true if the player does not have the permission, false if they do.
	 * @param player
	 * @param permission
	 * @return
	 */
	
	public static boolean hasNotPermission(BottlePlayer player, BPermission permission) {
		if (player.hasPermission(permission)) {
			return false;
		}
		if (!(player.hasPermission(permission))) {
			return true;
		}
		return false;
	}
	
	/**
	 * Will not work.
	 * @see hasNotPermission(BottlePlayer, BPermission)
	 * @param player
	 * @param permission
	 * @return
	 */
	
	@Deprecated
	public static void hasNotPermission(BottlePlayer player, String permission) {}
}
