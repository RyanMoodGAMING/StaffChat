package me.ryanmoodgaming.staffchat.main.staffchatrecoded;

import me.ryanmoodgaming.staffchat.main.staffchatrecoded.commands.chat.StaffChatCMD;
import me.ryanmoodgaming.staffchat.main.staffchatrecoded.commands.toggle.ToggleStaffChat;
import me.ryanmoodgaming.staffchat.main.staffchatrecoded.events.chat.ChatEvent;
import me.ryanmoodgaming.staffchat.main.staffchatrecoded.other.Config;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class StaffChatRecoded extends JavaPlugin {

    @Override
    public void onEnable() {
        settings();
        saveDefaultConfig();
        loadCommands();
        loadEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadCommands() {
        getCommand("staffchat").setExecutor(new StaffChatCMD());
        getCommand("togglestaffchat").setExecutor(new ToggleStaffChat());
    }

    public void loadEvents() {
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
    }

    private void settings() {
        Bukkit.getConsoleSender().sendMessage("(StaffChat) Loading Config");
        Config.loadConfig();
        Bukkit.getConsoleSender().sendMessage("(StaffChat) Config loaded");
    }

    public static StaffChatRecoded getInstance() { return getPlugin(StaffChatRecoded.class); }

}
