package de.plugandmod.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin implements Listener {
    String debugg = ChatColor.DARK_PURPLE + "Debugg";
    private static Plugin instance;

     public static Plugin getInstance() {
         return instance;
     }

    @Override
    public void onEnable() {
         instance = this;
        // Plugin startup logic

        System.out.println(debugg + ChatColor.WHITE +"Hallo Welt");
        PluginManager pm  = Bukkit.getPluginManager();
        pm.registerEvents(new Joinlistener(), this);
        pm.registerEvents(new DropListener(),this);
        //pm.registerEvents(this,this);


        ShapedRecipe gem = new ShapedRecipe(Newitem.protected_gem());
        gem.shape("GEO","EDE","REL");
        gem.setIngredient('E', Material.EMERALD);
        gem.setIngredient('G', Material.GOLD_BLOCK);
        gem.setIngredient('O', Material.OBSIDIAN);
        gem.setIngredient('D', Material.DIAMOND);
        gem.setIngredient('L', Material.LAPIS_BLOCK);
        gem.setIngredient('R', Material.REDSTONE_BLOCK);
        Bukkit.addRecipe(gem);

        ShapedRecipe sword = new ShapedRecipe(Newitem.sword());
        sword.shape("AUA","AUA","ABA");
        sword.setIngredient('A', Material.AIR);
        sword.setIngredient('U',Newitem.gem());
        sword.setIngredient('B', Material.BLAZE_ROD);
        Bukkit.addRecipe(sword);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public void loadEvent(){
        System.out.println("loaded");




    }

}


