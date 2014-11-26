package org.bottle.player;

import java.util.UUID;

import org.bottle.Getter;
import org.bottle.permission.BPermission;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.conversations.Conversable;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageRecipient;

public abstract class BottlePlayer implements Player, HumanEntity, Conversable, CommandSender, OfflinePlayer, PluginMessageRecipient {
	
	/**
	 * Grabs a player specified with the string.
	 * @param s - Player Name
	 * @return
	 */
	
	@SuppressWarnings("deprecation")
	public static Player getPlayer(String s) {
		return Getter.getServer().getPlayer(s);
	}
	
	/**
	 * Grabs a player with the specified UUID.
	 * @param uuid - UUID Specified
	 * @return
	 */
	
	public static Player getPlayerFromUUID(UUID uuid) {
		return Getter.getServer().getPlayer(uuid);
	}
	
	/**
	 * Turns the specified CommandSender to a player.
	 * @param sender - CommandSender
	 * @return
	 */
	
	public static Player getCommandSenderPlayer(CommandSender sender) {
		BottlePlayer player_sender = (BottlePlayer) sender;
		return player_sender;
	}
	
	public static CommandSender getCommandSenderFromPlayer(BottlePlayer player_sender) {
		CommandSender sender_player = (CommandSender) player_sender;
		return sender_player;
	}
	
	public static boolean hasPermission(BottlePlayer player, BPermission permission) {
		if (player.hasPermission(permission)) {
			return true;
		}
		if (!(player.hasPermission(permission))) {
			return false;
		}
		try { System.err.println(ChatColor.DARK_RED + "[ERR] [BOTTLE SERVER] Permissions> There was an error performing the hasPermission Method."); }catch(Exception e) {e.printStackTrace();}
		return false;
	}
	
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
	
}
