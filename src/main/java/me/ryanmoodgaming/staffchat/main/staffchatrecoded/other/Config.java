package me.ryanmoodgaming.staffchat.main.staffchatrecoded.other;

import me.ryanmoodgaming.staffchat.main.staffchatrecoded.StaffChatRecoded;

public class Config {

    public static String No_Permission;
    public static String StaffChatMSG;
    public static String UsageMSG;
    public static String MessageSent;
    public static String ChatSymbol;
    public static String SeePermission;
    public static String SendPermission;
    public static String TogglePermission;
    public static String ToggleEnableMSG;
    public static String ToggleDisabledMSG;

    public static void loadConfig() {

        No_Permission = StaffChatRecoded.getInstance().getConfig().getString("noperm_msg");
        StaffChatMSG = StaffChatRecoded.getInstance().getConfig().getString("staffchat_msg");
        UsageMSG = StaffChatRecoded.getInstance().getConfig().getString("usage_msg");
        MessageSent = StaffChatRecoded.getInstance().getConfig().getString("messagesent_msg");
        ChatSymbol = StaffChatRecoded.getInstance().getConfig().getString("chatsymbol");
        SeePermission = StaffChatRecoded.getInstance().getConfig().getString("see_perm");
        SendPermission = StaffChatRecoded.getInstance().getConfig().getString("send_perm");
        TogglePermission = StaffChatRecoded.getInstance().getConfig().getString("toggle_perm");
        ToggleEnableMSG = StaffChatRecoded.getInstance().getConfig().getString("toggled_msg.enabled");
        ToggleDisabledMSG = StaffChatRecoded.getInstance().getConfig().getString("toggled_msg.disabled");
    }

}
