package de.plugandmod.main;

import org.bukkit.Effect;
import org.bukkit.Server;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.event.entity.EntityDamageEvent.DamageCause.ENTITY_ATTACK;

public class SwordListener implements Listener {
    @EventHandler
    public void  onResistence(EntityDamageByEntityEvent event) {
        try {
            if (event.getDamager() instanceof Player){
                Player player = (Player) event.getDamager();
                Entity entity = event.getEntity();

                if (player.getItemInHand().getItemMeta().getDisplayName().equals("§4Schwert")) {

                    player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,25,2,true));
                    event.setDamage(15);
                    int food = player.getFoodLevel();
                    int new_food = food -1;
                    player.setFoodLevel(new_food);



                }
            }

        } catch (Exception e) {


        }

    }



}
