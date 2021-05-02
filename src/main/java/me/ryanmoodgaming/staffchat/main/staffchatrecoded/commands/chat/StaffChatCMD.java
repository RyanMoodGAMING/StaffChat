package me.ryanmoodgaming.staffchat.main.staffchatrecoded.commands.chat;

import com.google.common.base.Joiner;
import me.ryanmoodgaming.staffchat.main.staffchatrecoded.other.Untils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.ryanmoodgaming.staffchat.main.staffchatrecoded.other.Config;

public class StaffChatCMD implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Untils.chat("&cOnly players can use this command."));
            return true;
        }
        Player player = (Player) sender;

        if (player.hasPermission(Config.SendPermission)) {
            if (args.length == 0) {
                player.sendMessage(Untils.chat(Config.UsageMSG));
                return true;
            } else if (args.length >= 1) {
                String message = Joiner.on(" ").join(args);
                player.sendMessage(Untils.chat(Config.MessageSent));
                Bukkit.broadcast(Untils.chat(Config.StaffChatMSG.replace("%name%", player.getName()).replace("%message%", message)), Config.SeePermission);
            }

        } else {
            player.sendMessage(Untils.chat(Config.No_Permission));
            return true;
        }

        return true;
    }
}
