package net.nocheatplus.fakesketchjoin;
 
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
 
public final class FakeSketchJoin extends JavaPlugin implements Listener {

	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("FakeSketchJoin enabled!");
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent evt) { 
	//	getServer().broadcastMessage(ChatColor.YELLOW + "Sketch joined the game");
		evt.setJoinMessage(ChatColor.YELLOW + "Sketch joined the game");
	}
 
	@Override
	public void onDisable() {
		getLogger().info("FakeSketchJoin disabled!");
	}
}
