package com.scarsz.discordsrv;

import com.scarsz.discordsrv.hooks.vanish.EssentialsHook;
import com.scarsz.discordsrv.hooks.vanish.PremiumVanishHook;
import org.bukkit.Bukkit;
import com.scarsz.discordsrv.hooks.vanish.SuperVanishHook;
import com.scarsz.discordsrv.hooks.vanish.VanishNoPacketHook;
import org.bukkit.entity.Player;

@SuppressWarnings({"ConstantConditions", "WeakerAccess"})
public class VanishedPlayerCheck {

    public static boolean checkPlayerIsVanished(Player player) {
        boolean isVanished = false;

        if (Bukkit.getPluginManager().isPluginEnabled("Essentials")) isVanished = EssentialsHook.isVanished(player) || isVanished;
        if (Bukkit.getPluginManager().isPluginEnabled("PremiumVanish")) isVanished = PremiumVanishHook.isVanished(player) || isVanished;
        if (Bukkit.getPluginManager().isPluginEnabled("SuperVanish")) isVanished = SuperVanishHook.isVanished(player) || isVanished;
        if (Bukkit.getPluginManager().isPluginEnabled("VanishNoPacket")) isVanished = VanishNoPacketHook.isVanished(player) || isVanished;

        if (DiscordSRV.plugin.getConfig().getBoolean("PlayerVanishLookupReporting")) DiscordSRV.plugin.getLogger().info("Looking up vanish status for " + player + ": " + isVanished);
        return isVanished;
    }

}