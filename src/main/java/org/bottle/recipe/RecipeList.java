package org.bottle.recipe;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Recipe;

public class RecipeList {

	public static int[] recipes = new int[555];
	private static int amountRegister = 0;
	
	/**
	 * Registers a recipe to the Bottle Server Recipe List. 
	 * @param r - Recipe
	 */
	
	public static void addServerRecipe(Recipe r) {
		if (amountRegister == 0) {
			recipes[0] = r.hashCode();
			Bukkit.getServer().addRecipe(r);
		}
		if (amountRegister > 0) {
			Bukkit.getServer().addRecipe(r);
		}
	}
	
	/**
	 * Returns the hash code for the specified Recipe. The recipe must be registered first, 
	 * otherwise it won't be found, and return as -1. If it returns as -1, there was a problem,
	 * such as it wasn't registered. 
	 * 
	 * @param r
	 * @return
	 */
	
	public static int getHashCode(Recipe r) {
		int hash = r.hashCode();
		for (int i = 0; i < recipes.length + 1;) {
			if (recipes[i] == hash) {
				int rVar = recipes[i];
				return rVar;
			}
			if (recipes[i] != hash) {
				i++;
			}
		}
		return -1;
	}
	
	/**
	 * Returns the amount of recipes registered.
	 * @return
	 */
	
	public static int getRecipeCount() {
		return recipes.length;
	}
}
