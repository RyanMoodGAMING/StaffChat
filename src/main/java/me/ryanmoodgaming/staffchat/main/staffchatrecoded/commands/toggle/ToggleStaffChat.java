package me.ryanmoodgaming.staffchat.main.staffchatrecoded.commands.toggle;

import me.ryanmoodgaming.staffchat.main.staffchatrecoded.other.Config;
import me.ryanmoodgaming.staffchat.main.staffchatrecoded.other.Untils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToggleStaffChat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Untils.chat("&cOnly players can use this command."));
            return true;
        }
        Player player = (Player) sender;
        if (player.hasPermission(Config.TogglePermission)) {
            if (!Untils.enabledChat.contains(player)) {
                player.sendMessage(Untils.chat(Config.ToggleEnableMSG));
                Untils.enabledChat.add(player);
            } else if (Untils.enabledChat.contains(player)) {
                player.sendMessage(Untils.chat(Config.ToggleDisabledMSG));
                Untils.enabledChat.remove(player);
            }
        } else {
            player.sendMessage(Untils.chat(Config.No_Permission));
        }
        return true;
    }

}
