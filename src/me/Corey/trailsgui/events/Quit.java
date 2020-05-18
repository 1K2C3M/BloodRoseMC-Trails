package me.Corey.trailsgui.events;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.Corey.trailsgui.models.ParticleData;

public class Quit implements Listener {
	
	public void onQuit(PlayerQuitEvent event) {
		ParticleData p = new ParticleData(event.getPlayer().getUniqueId());
		if(p.hasID())
			p.endTask();
	}

}
