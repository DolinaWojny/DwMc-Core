package me.saboorek.neptunecore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

public class AdmCmds implements CommandExecutor{
	
  public Map<String, BukkitTask> tp = new HashMap<String, BukkitTask>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args) {
		if(cmd.getName().equalsIgonreCase("mspawn")){
			if(sender.hasPermission("dwmc.admin.mspawn")){
				if(args.Lenght !=1) {
					retrun false;
				}
					List<String> str = new ArrayList<String>();
					for(EntityType en : EntityType.values()){
						str.add(en.name());
					}
				if(str.contains(args[0].toUpperCase())) {
				if(sender instanceof Player) {
					((Player)sender).getLocation().getWorld().spawnEntity(((Player)sender).getLocation(), EntityType.valueOf(args[0].toUpperCase()));
					}
				}
			}
		}
		
	}
}
