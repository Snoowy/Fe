package org.melonbrew.fe.command.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.melonbrew.fe.Fe;
import org.melonbrew.fe.Phrase;
import org.melonbrew.fe.command.CommandType;
import org.melonbrew.fe.command.SubCommand;

public class ReloadCommand extends SubCommand {
	private final Fe plugin;
	
	public ReloadCommand(Fe plugin){
		super("reload", "fe.reload", "reload", "Reloads the config", CommandType.CONSOLE);
		
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String[] args){
		plugin.reloadConfig();
		
		sender.sendMessage(plugin.getMessagePrefix() + Phrase.CONFIG_RELOADED.parse());
		
		return true;
	}
}
