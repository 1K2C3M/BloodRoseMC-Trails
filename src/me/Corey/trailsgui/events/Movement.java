package me.Corey.trailsgui.events;

import java.util.Random;

import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import me.Corey.trailsgui.models.ParticleData;

public class Movement implements Listener {


	@EventHandler
	public void onMove(PlayerMoveEvent event) {
		if (!ParticleData.hasFakeID(event.getPlayer().getUniqueId()))
			return;
		
		Random r = new Random();
		for (int i = 0; i < 5 ; i++)
			event.getPlayer().getWorld().spawnParticle(Particle.DRAGON_BREATH, event.getPlayer().getLocation().add(
					r.nextDouble() * 0.5, r.nextDouble() * 0.5, (r.nextDouble() * .5) *-1), 0);
		event.getPlayer().getWorld().spawnParticle(Particle.DRAGON_BREATH, event.getPlayer().getLocation().add(
				-1*r.nextDouble() * 0.5, r.nextDouble() * 0.5, (r.nextDouble() * .5) *-1), 0);
	}
}