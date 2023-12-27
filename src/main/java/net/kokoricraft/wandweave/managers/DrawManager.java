package net.kokoricraft.wandweave.managers;

import net.kokoricraft.wandweave.WandWeave;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DrawManager {

    private final WandWeave plugin;

    private List<UUID> drawing_players = new ArrayList<>();

    public DrawManager(WandWeave plugin){
        this.plugin = plugin;
    }

    public void addDrawingPlayer(UUID uuid){
        drawing_players.add(uuid);
    }

    public void removeDrawingPlayer(UUID uuid){
        drawing_players.remove(uuid);
    }
}



