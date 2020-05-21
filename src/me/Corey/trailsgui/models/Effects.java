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
		
		public void startCloud() {
			taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			
				double var = 0;
				Location loc, first, second, third, forth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, XIII, XIV, XV, XVI, XVII, XVIII, XIX, XX, XXI, XXII, XXIII, XXIV, XXV, XXVI, XXVII, XXVIII, XXIX, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, ab, cd, ef, gh, ij, kl, mn, op, qr, st, uv, wx, yz, abc;
				ParticleData particle = new ParticleData(player.getUniqueId());
				
				@Override
				public void run() {
					if (!particle.hasID()) {
						particle.setID(taskID);
					}
					
					var += Math.PI;
					
					loc = player.getLocation();
					first = loc.clone().add(Math.cos(1.55), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					second = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					third = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					forth = loc.clone().add(Math.cos(1.61), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					fifth = loc.clone().add(Math.cos(1.49), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					sixth = loc.clone().add(Math.cos(1.64), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					seventh = loc.clone().add(Math.cos(1.46), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					eighth = loc.clone().add(Math.cos(1.67), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					ninth = loc.clone().add(Math.cos(1.43), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					tenth = loc.clone().add(Math.cos(1.70), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					eleventh = loc.clone().add(Math.cos(1.40), Math.sin(var) + 2.5, Math.sin(var + Math.PI));
					I = loc.clone().add(Math.cos(1.55), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					II = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					III = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					IV = loc.clone().add(Math.cos(1.61), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					V = loc.clone().add(Math.cos(1.49), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					VI = loc.clone().add(Math.cos(1.64), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					VII = loc.clone().add(Math.cos(1.46), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					VIII = loc.clone().add(Math.cos(1.67), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					IX = loc.clone().add(Math.cos(1.43), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					X = loc.clone().add(Math.cos(1.70), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					XI = loc.clone().add(Math.cos(1.40), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.1);
					XII = loc.clone().add(Math.cos(1.55), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XIII = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XIV = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XV = loc.clone().add(Math.cos(1.61), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XVI = loc.clone().add(Math.cos(1.49), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XVII = loc.clone().add(Math.cos(1.64), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XVIII = loc.clone().add(Math.cos(1.46), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XIX = loc.clone().add(Math.cos(1.67), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XX = loc.clone().add(Math.cos(1.43), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XXI = loc.clone().add(Math.cos(1.70), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XXII = loc.clone().add(Math.cos(1.40), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.1);
					XXIII = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.2);
					XXIV = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.5, Math.sin(var + Math.PI) - 0.2);
					XXV = loc.clone().add(Math.cos(1.55), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.2);
					XXVI = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.2);
					XXVII = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.2);
					XXVIII = loc.clone().add(Math.cos(1.61), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.2);
					XXIX = loc.clone().add(Math.cos(1.49), Math.sin(var) + 2.5, Math.sin(var + Math.PI) + 0.2);
					a = loc.clone().add(Math.cos(1.55), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					b = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					c = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					d = loc.clone().add(Math.cos(1.61), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					e = loc.clone().add(Math.cos(1.49), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					f = loc.clone().add(Math.cos(1.64), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					g = loc.clone().add(Math.cos(1.46), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					h = loc.clone().add(Math.cos(1.67), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					i = loc.clone().add(Math.cos(1.43), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					j = loc.clone().add(Math.cos(1.70), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					k = loc.clone().add(Math.cos(1.40), Math.sin(var) + 2.7, Math.sin(var + Math.PI));
					l = loc.clone().add(Math.cos(1.55), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					m = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					n = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					o = loc.clone().add(Math.cos(1.61), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					p = loc.clone().add(Math.cos(1.49), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					q = loc.clone().add(Math.cos(1.64), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					r = loc.clone().add(Math.cos(1.46), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					s = loc.clone().add(Math.cos(1.67), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					t = loc.clone().add(Math.cos(1.43), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					u = loc.clone().add(Math.cos(1.70), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					v = loc.clone().add(Math.cos(1.40), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.1);
					w = loc.clone().add(Math.cos(1.55), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					x = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					y = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					z = loc.clone().add(Math.cos(1.61), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					ab = loc.clone().add(Math.cos(1.49), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					cd = loc.clone().add(Math.cos(1.64), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					ef = loc.clone().add(Math.cos(1.46), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					gh = loc.clone().add(Math.cos(1.67), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					ij = loc.clone().add(Math.cos(1.43), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					kl = loc.clone().add(Math.cos(1.70), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					mn = loc.clone().add(Math.cos(1.40), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.1);
					op = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.2);
					qr = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.7, Math.sin(var + Math.PI) - 0.2);
					st = loc.clone().add(Math.cos(1.55), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.2);
					uv = loc.clone().add(Math.cos(1.58), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.2);
					wx = loc.clone().add(Math.cos(1.52), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.2);
					yz = loc.clone().add(Math.cos(1.61), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.2);
					abc = loc.clone().add(Math.cos(1.49), Math.sin(var) + 2.7, Math.sin(var + Math.PI) + 0.2);
					
					player.getWorld().spawnParticle(Particle.DRIP_WATER, first, 0);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, second, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, third, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, forth, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, fifth, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, sixth, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, seventh, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, eighth, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, ninth, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, tenth, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, eleventh, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, I, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, II, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, III, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, IV, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, V, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, VI, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, VII, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, VIII, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, IX, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, X, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XI, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XII, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XIII, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XIV, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XV, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XVI, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XVII, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XVIII, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XIX, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XX, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXI, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXII, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXIII, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXIV, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXV, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXVI, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXVII, 2);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXVIII, 1);
					player.getWorld().spawnParticle(Particle.DRIP_WATER, XXIX, 2);
					player.getWorld().spawnParticle(Particle.CLOUD, a, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, b, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, c, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, d, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, e, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, f, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, g, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, h, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, i, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, j, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, k, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, l, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, m, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, n, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, o, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, p, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, q, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, r, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, s, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, t, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, u, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, v, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, w, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, x, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, y, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, z, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, ab, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, cd, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, ef, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, gh, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, ij, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, kl, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, mn, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, op, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, qr, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, st, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, uv, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, wx, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, yz, 0);
					player.getWorld().spawnParticle(Particle.CLOUD, abc,0);

				}
				
			}, 0, 1);
	}
}
