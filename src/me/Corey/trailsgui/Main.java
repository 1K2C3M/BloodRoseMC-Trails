package me.Corey.trailsgui;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.Corey.trailsgui.commands.Trail;
import me.Corey.trailsgui.events.ClickEvent;
import me.Corey.trailsgui.events.Movement;
import me.Corey.trailsgui.events.Quit;
import me.Corey.trailsgui.models.GUI;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		GUI menu = new GUI();
		menu.register();;
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new ClickEvent(), this);
		pm.registerEvents(new Quit(), this);
		pm.registerEvents(new Movement(), this);
		
		this.getCommand("trails").setExecutor(new Trail());
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
}
