package de.plugandmod.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin starts");
        PluginManager  pm  = Bukkit.getPluginManager();
        pm.registerEvents(new Joinlistener(), this);
        System.out.println("Plugin started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin shutdown");
    }
    public void loadEvent(){
        System.out.println("loaded");




    }
}


