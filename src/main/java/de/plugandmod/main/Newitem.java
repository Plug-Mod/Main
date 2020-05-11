package de.plugandmod.main;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Newitem {

    public static ItemStack gem(){
        ItemStack item = new ItemStack(Material.DIAMOND);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Gem");
        itemMeta.setCustomModelData(1);
        item.setItemMeta(itemMeta);
        return item;

    }
    public static ItemStack sword(){
        ItemStack item= new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.RED + "Schwert");
        item.setItemMeta(itemMeta);
        return item;

    }

}
