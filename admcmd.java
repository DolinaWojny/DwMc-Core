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
		
		if(cmd.getName().equalsignoreCase("heal")) {
			if(sender.hasPermission("dwmc.heal") {
				if(!(sender instanceof Player){
					sender.sendMessage("§6[INFO]§c Tylko gracz może użyć tej komendy!");
				}
					if(args.lenght == 0){
						Player p = (Player) sender;
						p.setHealth(20);
						p.sendMessage("Uleczyłeś się!");
					}
				   	if(args.lenght >= 1) {
						string pName = args[0];
						if(bukkit.getPlayer(pName) !=null){
							Player p = bukkit.getPlayer(pName);
							p.setHealth(20);
							p.sendMessage("Zostałeś uleczony");
						} else {
							sender.sendMessage("Nie znaleziono gracza o takim nicku");
						}
					}
			} else {
				sender.sendMessage("§6[INFO]§c Nie posiadasz uprawnień do wykonania tej komendy!");
			}
		}//cmd.getName().equalsIgnoreCase("heal")
		if(cmd.getName().equalsIgnoreCase("gm")) {
			if(sender.hasPermission("dwmc.gamemode") {
				if(sender instanceof Player) {
					sender.sendMessage("§6[INFO]§c Tylko gracz może użyć tej komendy!");
					return false;
				}
					if(args.lenght == 1) {
						Player p = (Player) sender;
						if(args[0].equals("a") {
							p.setGameMode(GameMode.ADVENTURE);
							sender.sendMessage("§6[INFO]§d Ustawiono twoj gamemode na §3ADVENTURE");
						}
						if(args[0].equals("s") {
							p.setGameMode(GameMode.SURVIVAL);
							sender.sendMessage("§6[INFO]§d Ustawiono twoj gamemode na §3SURVIVAL");
						}
						if(args[0].equals("c") {
							p.setGameMode(GameMode.CREATIVE);
							sender.sendMessage("§6[INFO]§d Ustawiono twoj gamemode na §3CREATIVE");
						}
						if(args[0].equals("spec") {
							p.setGameMode(GameMode.SPECTATOR);
							sender.sendMessage("§6[INFO]§d Ustawiono twoj gamemode na §3SPECTATOR");
						}
					} else {
						sender.sendMessage("§dDostepne opcje:");
						sender.sendMessage("§ca - ADVENTURE");
						sender.sendMessage("§3s - SURVIVAL");
						sender.sendMessage("§4c - CREATIVE");
						sender.sendMessage("§8spec - SPECTATOR");
					}
			} else {
				sender.sendMessage("§6[INFO]§c Nie posiadasz uprawnień do wykonania tej komendy!");
			}
		} //cmd.getName().equalsIgnoreCase("gm")
		if(cmd.getName().equalsIgnoreCase("czas")) {
			if(sender.hasPermission("dwmc.time") {
				if(sender instanceof Player) {
					sender.sendMessage("§6[INFO]§c Tylko gracz może użyć tej komendy");
					return false;
				}
				if(args.lenght == 1) {
					Player p = (Player) sender;
					if(args[0].equals("dzien") {
						p.getLocation().getWorld().setTime(3000);
						sender.sendMessage("Czas został zmieniony na §cDZIEŃ");
					}
					if(args[0].equals("noc") {
						p.getLocation().getWorld().setTime(12000);
						sender.sendMessage("Czas został zmieniony na §cNOC")
					}
				}
			} else {
				sender.sendessage("§6[INFO]§c Nie posiadasz uprawnień do wykonania tej komendy!");
			}
		}//cmd.getName().equalsIgnoreCase("czas")
		if(cmd.getName().equalsIgnoreCase("pogoda")) {
			if(sender.hasPermission("dwmc.weather") {
				if(args.lenght == 1) {
					World w = ((Player)sender).getWorld();
					if(args[0].equals("slonce") {
						w.setStorm(false);
						w.setThunder(false);
						sender.sendMessage("§6[WEATHER INFO]§f Zmieniono pogodę na §6SŁONECZNĄ");
					}
					if(args[0].equals("deszcz") {
						w.setStorm(true);
						w.setThunder(false);
						sedner.sendMessage("§6[WAETHER INFO]§f Zmieniono pogodę na §6DESZCZOWĄ");
					}
					if(args[0].equals("burza") {
						w.setStorm(true);
						w.setThunder(true);
						sender.sendMessage("§6[WEATHER INFO]§f Zmieniono pogodę na §6BURZĘ");
					}
				}
			} else {
				sender.sendMessage("§6[INFO]§c Nie posiadasz uprawnień do wykonania tej komendy!");
			}
		}//cmd.getName().equalsIgnoreCase("pogoda")
		if(cmd.getName().equalsIgnoreCase("")) {
		
		}//cmd.getName()equalsIgnoreCase("")
}//Public boolean
