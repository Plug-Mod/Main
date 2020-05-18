package de.plugandmod.main;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Newitem {

    public static ItemStack protected_gem(){
        ItemStack item = new ItemStack(Material.DIAMOND);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§8protected_gem");
        itemMeta.setCustomModelData(1);
        item.setItemMeta(itemMeta);

        return item;

    }
    public static ItemStack gem(){
        ItemStack item = new ItemStack(Material.DIAMOND);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§6Gem");
        itemMeta.setCustomModelData(2);
        item.setItemMeta(itemMeta);
        return item;

    }
    public static ItemStack sword(){
        ItemStack item= new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("§4Schwert");
        itemMeta.setCustomModelData(1);
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED,new AttributeModifier("attakspeed",0.4, AttributeModifier.Operation.ADD_SCALAR));
        item.setItemMeta(itemMeta);

        return item;

    }

}
