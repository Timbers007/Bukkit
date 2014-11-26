package org.bottle.patch;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * A class to attempt a fix of the door-click bug.
 * Register event via registerEvents();
 */

public class PatchDoorGlitch implements Listener {

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Block clicked_block = e.getClickedBlock();
		if (clicked_block.getType().equals(Material.WOOD_DOOR)) {
			BlockState state = clicked_block.getState();
			e.setCancelled(false);
		}
	}
}
