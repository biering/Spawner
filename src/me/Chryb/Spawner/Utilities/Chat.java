package me.Chryb.Spawner.Utilities;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Chat {

	public static void systemMessage(Player p, String message) {
		p.sendMessage(ChatColor.DARK_AQUA + message);
	}

	public static void broadcastMessage(String message) {
		Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + message);
	}

	public static void noPermissionMessage(Player p) {
		p.sendMessage(ChatColor.RED + "You don't have the permission to use this command.");
	}

}