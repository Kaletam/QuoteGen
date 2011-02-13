package org.bukkit.awesomepants.quotegen;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * QuoteGen block listener
 * @author Kaletam
 *
 * For now, don't do anything at all.
 * In fact, we may not do *anything* with this at all.
 * 
 */
public class QuoteGenBlockListener extends BlockListener
{
    private final QuoteGen plugin;

    public QuoteGenBlockListener(final QuoteGen plugin)
    {
	this.plugin = plugin;
    }
}
