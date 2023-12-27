package net.kokoricraft.wandweave.listeners;

import net.kokoricraft.wandweave.WandWeave;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class DrawListener implements Listener {

    private final WandWeave plugin;

    public DrawListener(WandWeave plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){

    }

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event){

    }
}
