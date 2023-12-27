package net.kokoricraft.wandweave.managers;

import net.kokoricraft.wandweave.WandWeave;
import net.kokoricraft.wandweave.player.MagicPlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerManager {

    private final WandWeave plugin;

    private Map<UUID, MagicPlayer> players = new HashMap<>();

    public PlayerManager(WandWeave plugin){
        this.plugin = plugin;
    }

    public MagicPlayer getPlayer(UUID uuid){
        return players.computeIfAbsent(uuid, target -> new MagicPlayer(plugin, uuid));
    }

    public MagicPlayer getPlayer(Player player){
        return getPlayer(player.getUniqueId());
    }

    public void disconnect(UUID uuid){
        players.remove(uuid);
    }

    public Map<UUID, MagicPlayer> getPlayers(){
        return players;
    }
}
