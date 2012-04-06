package me.Chryb.Spawner.Utilities;

import me.Chryb.Spawner.Spawner;

import org.bukkit.Location;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.util.Vector;

@SuppressWarnings("deprecation")
public class Spawn {
	public Spawner plugin;
	
	public static void spawnMonster(Location l, String monster, int amount, int height){
		double x = l.getX();
		x = MathUtil.customRound(x);
		double y = l.getY();
		y = MathUtil.customRound(y) + height;
		double z = l.getZ();
		z = MathUtil.customRound(z);
		Location final_location = new Vector().setX(x).setY(y).setZ(z).toLocation(l.getWorld());
		
		if ((monster.equalsIgnoreCase("experience")) || (monster.equalsIgnoreCase("exp"))){
			for (int i=0; i < amount; i++){
			l.getWorld().spawn(final_location, ExperienceOrb.class).setExperience(5);
			}
		}
		
		if (monster.equalsIgnoreCase("zombie")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.ZOMBIE);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("creeper")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.CREEPER);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("skeleton")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.SKELETON);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("enderman")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.ENDERMAN);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("spider")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.SPIDER);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("ghast")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.GHAST);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("giant")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.GIANT);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("magmacube")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.MAGMA_CUBE);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("blaze")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.BLAZE);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("cavespider")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.CAVE_SPIDER);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("pigzombie")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.PIG_ZOMBIE);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("silverfish")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.SILVERFISH);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("enderdragon")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.ENDER_DRAGON);
			counter++;
			}
			counter = 0;
		}
		
		if (monster.equalsIgnoreCase("slime")){
			int counter = 0;
			while (counter < amount){
			l.getWorld().spawnCreature(final_location, CreatureType.SLIME);
			counter++;
			}
			counter = 0;
		}
		
		
		
	}

}
