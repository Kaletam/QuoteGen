package org.bukkit.awesomepants.quotegen;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Handle events for all Player related events
 * @author Kaletam
 */
public class QuoteGenPlayerListener extends PlayerListener {
    private final QuoteGen plugin;

    public QuoteGenPlayerListener(QuoteGen instance) {
        plugin = instance;
    }

    //Insert Player related code here
}

