package net.kokoricraft.wandweave.commands;

import net.kokoricraft.wandweave.WandWeave;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commands implements CommandExecutor {

    private final WandWeave plugin;

    public Commands(WandWeave plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 0){
            sender.sendMessage("v:");
            return true;
        }

        switch(args[0].toLowerCase()){
            case "test" -> {
                return testCommand(sender,label , args);
            }
        }

        return true;
    }

    private boolean testCommand(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        ItemStack item = plugin.getManager().getWand();
        player.getInventory().addItem(item);
        sender.sendMessage("Obtuviste el item v:");
        return true;
    }
}
