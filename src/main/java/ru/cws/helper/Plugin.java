package ru.cws.helper;

import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.bootstrap.PluginProviderContext;
import org.bukkit.plugin.java.JavaPlugin;
import ru.cws.Main;

public class Plugin extends JavaPlugin implements PluginBootstrap {
  @Override
  public void onEnable() {
    Main.onEnable(this);
  }

  @Override
  public void bootstrap(BootstrapContext context) {
    Main.bootstrap(this, this, context);
  }

  @Override
  public JavaPlugin createPlugin(PluginProviderContext context) {
    return this;
  }
}
