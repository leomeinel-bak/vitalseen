/*
 * VitalSeen is a Spigot Plugin that gives players the ability to see when other players were last seen.
 * Copyright © 2022 Leopold Meinel & contributors
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
 * along with this program. If not, see https://github.com/LeoMeinel/VitalSeen/blob/main/LICENSE
 */

package com.tamrielnetwork.vitalseen.commands;

import com.tamrielnetwork.vitalseen.utils.Chat;
import com.tamrielnetwork.vitalseen.utils.commands.Cmd;
import com.tamrielnetwork.vitalseen.utils.commands.CmdSpec;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class VitalSeenCmd
		implements CommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
	                         @NotNull String[] args) {
		if (Cmd.isArgsLengthNotEqualTo(sender, args, 1)) {
			return false;
		}
		doSeen(sender, args);
		return true;
	}

	private void doSeen(@NotNull CommandSender sender, @NotNull String[] args) {
		@Deprecated OfflinePlayer player = Bukkit.getOfflinePlayer(args[0]);
		if (CmdSpec.isInvalidCmd(sender, player, "vitalseen.seen")) {
			return;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy HH:mm");
		String lastSeen = simpleDateFormat.format(new Date(player.getLastSeen()));
		Chat.sendMessage(sender, Map.of("%player%", Objects.requireNonNull(player.getName()), "%last-seen%", lastSeen),
		                 "last-seen");
	}
}