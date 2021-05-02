package me.ryanmoodgaming.staffchat.main.staffchatrecoded.events.chat;

import me.ryanmoodgaming.staffchat.main.staffchatrecoded.other.Config;
import me.ryanmoodgaming.staffchat.main.staffchatrecoded.other.Untils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

    @EventHandler
    public void onStaffChat(AsyncPlayerChatEvent e) {
        Player player = (Player) e.getPlayer();
        if (player.hasPermission(Config.SendPermission)) {
            if (e.getMessage().startsWith(Config.ChatSymbol)) {
                e.setCancelled(true);
                e.setMessage(e.getMessage().replace(Config.ChatSymbol, ""));
                Bukkit.broadcast(Untils.chat(Config.StaffChatMSG.replace("%name%", player.getName()).replace("%message%", e.getMessage())), Config.SeePermission);

            }
        }
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        if (Untils.enabledChat.contains(player)) {
            e.setCancelled(true);
            Bukkit.broadcast(Untils.chat(Config.StaffChatMSG.replace("%name%", player.getName()).replace("%message%", e.getMessage())), Config.SeePermission);
        }
    }

}
