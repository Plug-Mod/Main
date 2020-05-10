package de.plugandmod.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hallo Welt");
        PluginManager  pm  = Bukkit.getPluginManager();
        pm.registerEvents(new Joinlistener(), this);

        ShapedRecipe gem = new ShapedRecipe(Newitem.gem());
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
        sword.setIngredient('U', Newitem.gem());
        sword.setIngredient('B', Material.BLAZE_ROD);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public void loadEvent(){
        System.out.println("loaded");




    }
}


