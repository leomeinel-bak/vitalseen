/*
 * File: CmdSpec.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2023 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalseen.utils.commands;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CmdSpec {

    private CmdSpec() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isInvalidCmd(@NotNull CommandSender sender, OfflinePlayer player,
            @NotNull String perm) {
        return (Cmd.isNotPermitted(sender, perm) || Cmd.isInvalidPlayer(sender, player));
    }
}
