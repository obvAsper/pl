package dev.arthur.spigot.blankplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class blankPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello, Arthur's in SpigotMC !");
    }

    @Override
    public void onDisable() {
        getLogger().info("See you again, Arhtur's from SpigotMC!");
    }

    @Override
    public boolean onCommand(CommandSender sender,
                             Command command,
                             String label,
                             String[] args) {
        if (command.getName().equalsIgnoreCase("creeperstart")) {
            sender.sendMessage("You ran /creeperstart!");
            return true;
        }
        if (command.getName().equalsIgnoreCase("creeperstop")) {
            sender.sendMessage("you stopped creeper spawn from running ");
            return true;
        }
        if (command.getName().equalsIgnoreCase("meme")) {
            sender.sendMessage("Testing a meme...");
        }
        return false;
    }
}
