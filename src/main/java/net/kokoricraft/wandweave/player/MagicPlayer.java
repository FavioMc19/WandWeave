package net.kokoricraft.wandweave.player;

import net.kokoricraft.wandweave.WandWeave;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class MagicPlayer {

    private final WandWeave plugin;

    private final UUID uuid;
    private boolean drawing = false;

    public MagicPlayer(WandWeave plugin, UUID uuid){
        this.plugin = plugin;
        this.uuid = uuid;
    }

    public boolean isOnline(){
        return getPlayer() != null;
    }

    public void setDrawing(boolean drawing){
        this.drawing = drawing;

        if(drawing){
            plugin.getDrawManager().addDrawingPlayer(uuid);
            return;
        }

        plugin.getDrawManager().removeDrawingPlayer(uuid);
    }

    public boolean isDrawing(){
        return drawing;
    }

    public Player getPlayer(){
        return Bukkit.getPlayer(uuid);
    }

    public void tick(){

    }
}
