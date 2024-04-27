package ch.ksrminecraft.pluginoop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener{

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        System.out.println("Implementierung");
        // Zugriff auf Config-File
        PluginOOP.getPlugin().getConfig().get("jkhdsdjfks");
    }
}
