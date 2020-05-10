package de.plugandmod.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Joinlistener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event)
    {
        System.out.println("joined");
        Player player = event.getPlayer();
        event.setJoinMessage("Herzlich Willkommen auf diesem Server " + player.getName() + "!");
        }}