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

public class Cmds implements CommandExecutor{
	
  public Map<String, BukkitTask> tp = new HashMap<String, BukkitTask>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args) {
	}
}
