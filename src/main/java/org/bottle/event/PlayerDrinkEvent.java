package org.bottle.event;

import org.bottle.util.UnTested;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

/**
 * Event called when something that is drinkable, is right-clicked.
 * <br>
 * <br>
 * <b><center>- Unfinished
 */

@UnTested
public class PlayerDrinkEvent extends PlayerEvent {

	public Player player;
	public ItemStack item;
	public Action action;
	public Result result;
	
	@UnTested
	public PlayerDrinkEvent(Player who, Action act) {
		super(who);
		this.player = who;
		this.item = who.getItemInHand();
		this.action = act;
		this.getCanFireMethod();
	}

	@UnTested
	public Result getCanFireMethod() {
		if (item.getType().equals(Material.MILK_BUCKET) || item.getType().equals(Material.POTION)) {
			if (getActionPerformed().equals(Action.RIGHT_CLICK_AIR) || getActionPerformed().equals(Action.RIGHT_CLICK_BLOCK)) {
				return Result.ALLOW;
			}
		}
		return Result.DEFAULT;
	}
	
	/**
	 * Currently the only certified method in the class, use this class at your own risk,
	 * except this method.
	 */
	
	public static boolean getAttemptingDrinking(Player player, Plugin plugin, long check_after) {
		if (player.getItemInHand().getType() == Material.POTION) {
			return true;
		}
		if (player.getItemInHand().getType() == Material.MILK_BUCKET) {
			return true;
		}
		return false;
	}
	
	@UnTested
	public Player getPlayerInvolved() {
		return this.player;
	}
	
	@UnTested
	public Action getActionPerformed() {
		return this.action;
	}
	
	@UnTested
	@Override
	public HandlerList getHandlers() {
		return null;
	}
}
