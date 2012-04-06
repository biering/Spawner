package me.Chryb.Spawner;

import me.Chryb.Spawner.Utilities.Chat;
import me.Chryb.Spawner.Utilities.Spawn;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.block.SignChangeEvent;

public class SignListener implements Listener{
	public static Spawner plugin;
	public static Spawn spawn;
	public SignListener(Spawner plugin) {
		SignListener.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onSignChange(SignChangeEvent event) {
        Player p = event.getPlayer();
   
        if((event.getLine(0).contains("[SpawnSign]")) || (event.getLine(0).contentEquals("ss"))){
        	if(!(p.hasPermission("Spawner.spawnsign"))) {
				Chat.noPermissionMessage(p);
				event.setCancelled(true);
				return;
			}
        	 event.setLine(0, "[SpawnSign]");
             p.sendMessage(ChatColor.BLUE + "SpawnSign successfully created!");
        }
	}
        
        @EventHandler(priority = EventPriority.HIGH)
    	public void SignClickListener(BlockRedstoneEvent event){
    		 Block block = event.getBlock();
    			 if ((block.getTypeId() == 63) || (block.getTypeId() == 68)) { 
    				 Sign sign = (Sign) event.getBlock().getState();
    	              if ((sign.getLine(0).contentEquals("[SpawnSign]"))) {
    	               if (sign.getBlock().isBlockPowered()){
    	            	if (!(sign.getLine(1).isEmpty()) && !(sign.getLine(2).isEmpty())){
    	            		if (sign.getLine(3).isEmpty()){
    	            			String monster = sign.getLine(1);
        	            		String a = sign.getLine(2);
        	            		int amount = Integer.parseInt(a);
    	            			Spawn.spawnMonster(sign.getLocation(), monster, amount, 0);
    	            		}
    	            		String monster = sign.getLine(1);
    	            		String a = sign.getLine(2);
    	            		int amount = Integer.parseInt(a);
    	            		String b = sign.getLine(3);
    	            		int height = Integer.parseInt(b);
    	            		Spawn.spawnMonster(sign.getLocation(), monster, amount, height);
    	            	}
    		          }
    	 }
    }
  }
 }
