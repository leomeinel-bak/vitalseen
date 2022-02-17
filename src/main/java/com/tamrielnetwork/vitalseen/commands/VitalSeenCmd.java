/*
 * VitalSeen is a Spigot Plugin that gives players the ability to see when other players were last seen.
 * Copyright © 2022 Leopold Meinel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://github.com/TamrielNetwork/VitalSeen/blob/main/LICENSE
 */

package com.tamrielnetwork.vitalseen.commands;

import com.google.common.collect.ImmutableMap;
import com.tamrielnetwork.vitalseen.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VitalSeenCmd implements CommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
		// Check args length
		if (args.length == 0) {
			Utils.sendMessage(sender, "no-args");
			return true;
		}
		if (args.length == 1) {
			doSeen(sender, args);
			return true;
		}
		return true;
	}
	private void doSeen(@NotNull CommandSender sender, @NotNull String[] args) {
		if (args.length > 1) {
			Utils.sendMessage(sender, "invalid-option");
			return;
		}
		// Check perms
		if (!sender.hasPermission("vitalseen.seen")) {
			Utils.sendMessage(sender, "no-perms");
			return;
		}
		if (isInValidPlayer(sender, args)) {
			return;
		}
		Player player = Bukkit.getPlayer(args[0]);
		assert player != null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy HH:mm");
		Date lastSeenDate = new Date(player.getLastSeen());
		String lastSeen = simpleDateFormat.format(lastSeenDate);
		Utils.sendMessage(sender, ImmutableMap.of(
				"%player%", player.getName(),
				"%last-seen%", lastSeen),
				"last-seen");

	}

	private boolean isInValidPlayer(@NotNull CommandSender sender, @NotNull String[] args) {
		Player player = Bukkit.getPlayer(args[0]);
		if (player == sender) {
			Utils.sendMessage(sender, "invalid-player");
			return true;
		}
		if (!player.hasPlayedBefore()) {
			Utils.sendMessage(sender, "invalid-player");
			return true;
		}
		return false;
	}
}