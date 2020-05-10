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
        gem.setIngredient('E',Material.EMERALD);
        gem.setIngredient('G',Material.GOLD_BLOCK);
        gem.setIngredient('O',Material.OBSIDIAN);
        gem.setIngredient('D',Material.DIAMOND);
        gem.setIngredient('L',Material.LAPIS_BLOCK);
        gem.setIngredient('R',Material.REDSTONE_BLOCK);
        Bukkit.addRecipe(gem);



        ShapedRecipe sword = new ShapedRecipe(Newitem.sword());
        gem.shape("AUA","AUA","ABA");
        gem.setIngredient('A',Material.AIR);
        gem.setIngredient('U',Newitem.gem());
        gem.setIngredient('B',Material.BLAZE_ROD);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public void loadEvent(){
        System.out.println("loaded");




    }
}


