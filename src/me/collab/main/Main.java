package me.collab.main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	/*
	 * 
	 * 
	 * 
	 * HIER KAN JE UITLEG GOOIEN OVEWWR DINGEN
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("thomas")) {
			if (sender.hasPermission("thomas.maak.usage"));			;

		return true;

	}
		return true;
}
}