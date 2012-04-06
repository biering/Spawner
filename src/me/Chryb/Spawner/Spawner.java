package me.Chryb.Spawner;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Spawner extends JavaPlugin{
	public final SignListener signListener = new SignListener(this);
	public final ButcherListener butcherListener = new ButcherListener(this);
	
	@Override
	public void onDisable() {
		System.out.println("[Spawner] Plugin disabled.");
	}

	@Override
	public void onEnable() {
		registerEvents();
		PluginDescriptionFile descFile = this.getDescription();
		System.out.println("[Spawner] Plugin initialized.");
		System.out.println("[Spawner] Plugin version: " + descFile.getVersion());
		System.out.println("[Spawner] Plugin by " + descFile.getAuthors());
		System.out.println("[Spawner] see for Informations: @ " + descFile.getWebsite());
	}
	
	public void registerEvents() {
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(signListener, this);
		pm.registerEvents(butcherListener, this);
}

}
