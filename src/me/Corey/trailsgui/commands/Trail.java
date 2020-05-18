package me.Corey.trailsgui.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Corey.trailsgui.models.GUI;

public class Trail implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("trails")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Uhh yeah you can totaly have trails active in the console...");
				return true;
			}
			Player player = (Player) sender;
			GUI gui = new GUI();
			gui.openInventory(player);
			return true;
		}
		return false;
	}
	
}