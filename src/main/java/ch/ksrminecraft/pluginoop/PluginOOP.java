package ch.ksrminecraft.pluginoop;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginOOP extends JavaPlugin {

    private static PluginOOP plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getServer().getPluginManager().registerEvents(new DeathListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static PluginOOP getPlugin() {
        return plugin;
    }
}
