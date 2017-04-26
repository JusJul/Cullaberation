package me.collab.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	//je bent een dikke noob
	
	public void onEnable() {
		Bukkit.getLogger().info("HAHA");
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onEntityExplode(EntityExplodeEvent e) {
		for (Block b : e.blockList()) {
			final BlockState state = b.getState();
			
			b.setType(Material.AIR);
			
			int delay = 20;
			
			if((b.getType() == Material.SAND || (b.getType() == Material.GRAVEL))) {
				delay += 1;
			}
			
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable(){
				public void run() {
					state.update(true, false);
				}
			}, delay);
			
		}
	}
}
