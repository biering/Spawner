package me.Chryb.Spawner.Utilities;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Monster;

public class Butcher {
	
	public static void butcher(Location l){
		List<Entity> e = l.getWorld().getEntities();
		int counter = 0;
		int size = e.size();
		while (counter < size){
			Entity en = e.get(counter);
			if (en instanceof Monster){
				Monster m = (Monster)en;
				m.setHealth(0);
			}
			counter++;
		}
	}

}
