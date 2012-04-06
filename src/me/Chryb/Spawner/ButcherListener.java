package me.Chryb.Spawner;

import me.Chryb.Spawner.Utilities.Butcher;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;

public class ButcherListener implements Listener{
	
	public static Spawner plugin;
	public static  Butcher butcher;
	public ButcherListener(Spawner plugin) {
		ButcherListener.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onButcherSign(BlockRedstoneEvent event){
		 Block block = event.getBlock();
			 if ((block.getTypeId() == 63) || (block.getTypeId() == 68)) { 
				 Sign sign = (Sign) event.getBlock().getState();
	              if ((sign.getLine(0).contentEquals("but"))) {
	               if (sign.getBlock().isBlockPowered()){
	            	
	            	   Butcher.butcher(sign.getLocation());
	            	   
	            	}
		          }
	 }

}
}
