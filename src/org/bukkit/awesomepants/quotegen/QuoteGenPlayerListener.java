package org.bukkit.awesomepants.quotegen;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Handle events for all Player related events
 * @author Kaletam
 *
 * For the moment, do nothing.
 * We may ditch this unless otherwise necessary.
 * 
 */
public class QuoteGenPlayerListener extends PlayerListener
{
    private final QuoteGen plugin;

    public QuoteGenPlayerListener(QuoteGen instance)
    {
	plugin = instance;
    }

    // Ok. So onPlayerCommand appears to run for commands *not* hooked by the plugin's onCommand (as per plugin.yml), whether undefined, or basic server (such as /list).
    // I'm not sure if there's any point to this, if onCommand covers things for us. There might be use for certain functions, but not for us.
//    @Override
//    public void onPlayerCommand(PlayerChatEvent event)
//    {
//	String[] command = event.getMessage().split(" ");
//
//	// Coded this before I saw the rationale for "Logger log" being declared static and final elsewhere.
//	Logger log = Logger.getLogger("Minecraft");
//	log.log(Level.INFO, "We're in onPlayerCommand.");
//
//	if ((command != null) && (command.length > 0) && ((command[0].compareToIgnoreCase("/quotegen") == 0) || (command[0].compareToIgnoreCase("/qg") == 0)))
//	{
//	    event.getPlayer().sendMessage("You just executed \"" + command.toString() + "\".");
//	}
//	else
//	{
//	    event.getPlayer().sendMessage("You just did something.");
//	}
//    }
}
