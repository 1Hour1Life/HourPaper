package net.onehouronelife.hourpaper.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        registerCommand("testplugin", (source, _) -> {
            source.getSender().sendRichMessage("<gradient:red:gold>Everything worked wonderfully!");
        });
    }
}
