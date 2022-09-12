/*
 * File: VitalSeen.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalseen;

import dev.meinel.leo.vitalseen.commands.VitalSeenCmd;
import dev.meinel.leo.vitalseen.files.Messages;
import java.util.Objects;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class VitalSeen extends JavaPlugin {

    private Messages messages;

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("seen")).setExecutor(new VitalSeenCmd());
        messages = new Messages();
        Bukkit
                .getLogger()
                .info("VitalSeen v" + this.getDescription().getVersion() + " enabled");
        Bukkit.getLogger().info("Copyright (C) 2022 Leopold Meinel");
        Bukkit.getLogger().info("This program comes with ABSOLUTELY NO WARRANTY!");
        Bukkit
                .getLogger()
                .info(
                        "This is free software, and you are welcome to redistribute it under certain conditions.");
        Bukkit
                .getLogger()
                .info(
                        "See https://github.com/LeoMeinel/VitalSeen/blob/main/LICENSE for more details.");
    }

    @Override
    public void onDisable() {
        Bukkit
                .getLogger()
                .info("VitalSeen v" + this.getDescription().getVersion() + " disabled");
    }

    public Messages getMessages() {
        return messages;
    }
}
