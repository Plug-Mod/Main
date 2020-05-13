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
import org.bukkit.scheduler.BukkitRunnable;

public class DropListener implements Listener{
    int velocity;
    @EventHandler
    public void onDrop(PlayerDropItemEvent event){
        Player player = event.getPlayer();
        Item gem = event.getItemDrop();
        Location loc = gem.getLocation();
        Block block = loc.getBlock();
        player.sendMessage("Hallo");
        gem.setPickupDelay(100);
        if (gem.getItemStack().getItemMeta().getDisplayName().equals("§8protected_gem")){
            player.sendMessage(ChatColor.GOLD  +  "es ist protected_gem ");

            new BukkitRunnable(){
                @Override
                public void run(){
                    player.sendMessage(ChatColor.DARK_RED + Integer.toString(gem.getLocation().getBlockX()));
                    player.sendMessage(ChatColor.DARK_GREEN + Integer.toString(gem.getLocation().getBlockY()));
                    player.sendMessage(ChatColor.DARK_BLUE + Integer.toString(gem.getLocation().getBlockZ()));
                    player.sendMessage(ChatColor.GOLD +"Block:" + ChatColor.WHITE  + gem.getLocation().getBlock().getType() );
                    //Prüfen, ob sich das Item entlang der y-Axe nicht mehr bewegt


                    ///Prüfen, worauf das item liegt
                    if (gem.getLocation().getBlock().getType().equals(Material.WATER)){

                        // Entfernen des Items
                        gem.remove();
                        // spawn Gem
                        Item super_gem = (Item) gem.getWorld().spawnEntity(gem.getLocation(), EntityType.DROPPED_ITEM);
                        super_gem.setItemStack(Newitem.gem());
                        velocity = 0;
                        // Beenden der Funktion
                        cancel();

                    }
                    if (gem.getVelocity().getBlockY()== 0){
                        velocity++;
                         if (velocity >= 3) {
                            velocity = 0;
                            cancel();
                         }
                    }


                }
            }.runTaskTimer(Main.getInstance(),0L,10L);

        }

    }


}
