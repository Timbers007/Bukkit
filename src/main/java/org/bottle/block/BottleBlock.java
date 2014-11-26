package org.bottle.block;

import org.bukkit.Material;
import org.bukkit.block.Block;

public abstract class BottleBlock implements Block {
	
	public static Material getBlockType(BottleBlock b) {
		return b.getType();
	}
	
	public static boolean isFrozenBlock(BottleBlock b) {
		if (b.getType().equals(Material.ICE) || b.getType().equals(Material.PACKED_ICE)
				|| b.getType().equals(Material.SNOW_BLOCK)) {
			return true;
		}
		return false;
	}
}
