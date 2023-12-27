package net.kokoricraft.wandweave;

import net.kokoricraft.wandweave.commands.Commands;
import net.kokoricraft.wandweave.managers.DrawManager;
import net.kokoricraft.wandweave.managers.Manager;
import net.kokoricraft.wandweave.managers.PlayerManager;
import net.kokoricraft.wandweave.managers.TaskManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class WandWeave extends JavaPlugin {

    private PlayerManager playerManager;
    private DrawManager drawManager;
    private TaskManager taskManager;
    private Manager manager;

    @Override
    public void onEnable() {

        // Instantiate managers.
        playerManager = new PlayerManager(this);
        drawManager = new DrawManager(this);
        taskManager = new TaskManager(this);
        manager = new Manager(this);

        // Register commands.
        getCommand("wandwave").setExecutor(new Commands(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    // Managers Getters
    public PlayerManager getPlayerManager(){
        return playerManager;
    }

    public DrawManager getDrawManager(){
        return drawManager;
    }

    public TaskManager getTaskManager(){
        return taskManager;
    }

    public Manager getManager(){
        return manager;
    }
}
