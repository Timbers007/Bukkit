package org.bottle.connect;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class ConnectionHandler implements Listener {

	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent e) {
		Player player_joining = e.getPlayer();
		if (player_joining.isBanned() == true) {
			player_joining.kickPlayer(ChatColor.DARK_RED + "Disconnected: "
					+ ChatColor.RESET + e.getKickMessage());
			System.err.println( "[BOTTLE-API SERVER] Stopped Player from joinging(" + player_joining.getName()
					+ ", for reason: " + e.getKickMessage() );
		}
	}
}
