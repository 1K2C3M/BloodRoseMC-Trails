package me.Corey.trailsgui.models;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

import me.Corey.trailsgui.Main;

public class Effects {

	private int taskID;
	private final Player player;
	
	public Effects(Player player) {
		this.player = player;
	}
	
	public void startTotem() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
		
			double var = 0;
			Location loc, first, second;
			ParticleData particle = new ParticleData(player.getUniqueId());
			
			@Override
			public void run() {
				if (!particle.hasID()) {
					particle.setID(taskID);
				}
				
				var += Math.PI / 16;
				
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
				
				player.getWorld().spawnParticle(Particle.TOTEM, first, 0);
				player.getWorld().spawnParticle(Particle.TOTEM, second, 0);
			}
			
		}, 0, 1);
	}

		public void startLava() {
			taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			
				double var = 0;
				Location loc, first, second;
				ParticleData particle = new ParticleData(player.getUniqueId());
				
				@Override
				public void run() {
					if (!particle.hasID()) {
						particle.setID(taskID);
					}
					
					var += Math.PI / 16;
					
					loc = player.getLocation();
					first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
					second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
					
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 0);
					player.getWorld().spawnParticle(Particle.FLAME, second, 0);
				}
				
			}, 0, 1);
	}
		
		public void startEnchant() {
			taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			
				double var = 0;
				Location loc, first, second;
				ParticleData particle = new ParticleData(player.getUniqueId());
				
				@Override
				public void run() {
					if (!particle.hasID()) {
						particle.setID(taskID);
					}
					
					var += Math.PI;
					
					loc = player.getLocation();
					first = loc.clone().add(Math.cos(1.55), Math.sin(var) + 1, Math.sin(var));
					second = loc.clone().add(Math.cos(1.55), Math.sin(var) + 1, Math.sin(var + Math.PI));
					
					player.getWorld().spawnParticle(Particle.ENCHANTMENT_TABLE, first, 1);
					player.getWorld().spawnParticle(Particle.END_ROD, second, 0);
				}
				
			}, 0, 1);
	}
}
