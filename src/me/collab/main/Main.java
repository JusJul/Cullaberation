package me.collab.main;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	//je bent een dikke noob
	
	public void onEnable() {
		Bukkit.getLogger().info("HAHA");
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
}
