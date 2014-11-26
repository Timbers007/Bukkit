package org.bottle.permission;

import org.bukkit.permissions.Permission;

public class BPermission extends Permission {

	private String permission;
	
	/**
	 * Creates a new permission node.
	 * @param name
	 */
	
	public BPermission(String name) {
		super(name);
		permission = name;
	}
}
