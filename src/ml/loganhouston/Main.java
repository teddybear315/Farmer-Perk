package ml.loganhouston;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    private String world = "Hello, world!";

    @Override
    public void onEnable() {
        System.out.println("Farmer Perk Enabled!");

    }

    @Override
    public void onDisable() {
        System.out.println("Farmer Perk Disabled!");
    }
}