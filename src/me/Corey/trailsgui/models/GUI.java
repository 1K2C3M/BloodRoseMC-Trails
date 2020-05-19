package me.Corey.trailsgui.models;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI {

	private static Inventory INV;
	
	public void register() {
		Inventory inv = Bukkit.createInventory(null, 9, ChatColor.DARK_RED + "" + ChatColor.BOLD + "TryphaPlex " + ChatColor.DARK_GRAY + "- " + ChatColor.WHITE + "Trails");
		
		ItemStack item = new ItemStack(Material.TOTEM_OF_UNDYING);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.YELLOW + "Totem Trail");
		item.setItemMeta(meta);
		inv.setItem(3, item);
		
		item = new ItemStack(Material.ENCHANTING_TABLE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_PURPLE + "Enchantment Trail");
		item.setItemMeta(meta);
		inv.setItem(0, item);
		
		item = new ItemStack(Material.LAVA_BUCKET);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Lava Trail");
		item.setItemMeta(meta);
		inv.setItem(1, item);
		
		item = new ItemStack(Material.ENDER_EYE);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_PURPLE + "Ender Eye Trail");
		item.setItemMeta(meta);
		inv.setItem(5, item);
		
		item = new ItemStack(Material.BARRIER);
		meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_RED + "Remove Trail");
		item.setItemMeta(meta);
		inv.setItem(8, item);
		
		setInventory(inv);
	}
	
	public Inventory getInventory() {
		return INV;
	}
	
	private void setInventory(Inventory inv) {
		INV = inv;
	}
	
	public void openInventory(Player player) {
		player.openInventory(INV);
	}
	
}
