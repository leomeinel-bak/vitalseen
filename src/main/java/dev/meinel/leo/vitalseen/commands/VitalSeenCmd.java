/*
 * File: VitalSeenCmd.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalseen.commands;

import dev.meinel.leo.vitalseen.utils.Chat;
import dev.meinel.leo.vitalseen.utils.commands.Cmd;
import dev.meinel.leo.vitalseen.utils.commands.CmdSpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class VitalSeenCmd implements CommandExecutor {

  @Override
  public boolean onCommand(
      @NotNull CommandSender sender,
      @NotNull Command command,
      @NotNull String label,
      @NotNull String[] args) {
    if (Cmd.isArgsLengthNotEqualTo(sender, args, 1)) {
      return false;
    }
    doSeen(sender, args);
    return true;
  }

  private void doSeen(@NotNull CommandSender sender, @NotNull String[] args) {
    @Deprecated
    OfflinePlayer player = Bukkit.getOfflinePlayer(args[0]);
    if (CmdSpec.isInvalidCmd(sender, player, "vitalseen.seen")) {
      return;
    }
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
        "MMM dd, yyyy HH:mm");
    String lastSeen = simpleDateFormat.format(new Date(player.getLastSeen()));
    Chat.sendMessage(
        sender,
        Map.of(
            "%player%",
            Objects.requireNonNull(player.getName()),
            "%last-seen%",
            lastSeen),
        "last-seen");
  }
}
