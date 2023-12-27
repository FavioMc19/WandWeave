package net.kokoricraft.wandweave.managers;

import net.kokoricraft.wandweave.WandWeave;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class Manager {

    private final WandWeave plugin;

    public Manager(WandWeave plugin){
        this.plugin = plugin;
    }

    public boolean isWand(ItemStack itemStack){
        if(!itemStack.getType().equals(Material.STICK))
            return false;

        NamespacedKey key = new NamespacedKey(plugin, "wand");

        ItemMeta meta = itemStack.getItemMeta();
        assert meta != null;
        return meta.getPersistentDataContainer().has(key);
    }

    public ItemStack getWand(){
        ItemStack itemStack = new ItemStack(Material.STICK);

        NamespacedKey key = new NamespacedKey(plugin, "wand");

        ItemMeta meta = itemStack.getItemMeta();
        assert meta != null;
        meta.getPersistentDataContainer().set(key, PersistentDataType.BOOLEAN, true);
        itemStack.setItemMeta(meta);

        return itemStack;
    }
}
