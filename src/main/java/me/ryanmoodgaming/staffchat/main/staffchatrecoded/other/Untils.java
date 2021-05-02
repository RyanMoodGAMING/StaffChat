package me.ryanmoodgaming.staffchat.main.staffchatrecoded.other;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Untils {

    public static String chat(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static ArrayList<Player> enabledChat;

    static {
        Untils.enabledChat = new ArrayList<>();
    }
}
