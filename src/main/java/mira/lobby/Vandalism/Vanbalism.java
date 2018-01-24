package mira.lobby.Vandalism;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.plugin.Plugin;


public class Vanbalism implements Listener{
    Plugin plugin;

    //この下がコンストラクタ
    public Vanbalism(Plugin me){
        this.plugin = me;
        Bukkit.getPluginManager().registerEvents(this,plugin);{

}
    }
	@EventHandler
    public void onGamemodeChange(PlayerGameModeChangeEvent e) {
        if (e.getNewGameMode() == GameMode.CREATIVE){
            Bukkit.getServer().broadcastMessage(ChatColor.RED + e.getPlayer().getName() + "がゲームモードをクリエイティブに変更しました");
        }else if(e.getNewGameMode() == GameMode.ADVENTURE){
            Bukkit.getServer().broadcastMessage(ChatColor.RED + e.getPlayer().getName() + "がゲームモードをアドベンチャーに変更しました");
        }else if(e.getNewGameMode() == GameMode.SURVIVAL){
            Bukkit.getServer().broadcastMessage(ChatColor.RED + e.getPlayer().getName() + "がゲームモードをサバイバルに変更しました");
        }else if(e.getNewGameMode() == GameMode.SPECTATOR){
            for (Player on : Bukkit.getOnlinePlayers()){
                if(on.isOp()){
                    on.sendMessage(ChatColor.RED + e.getPlayer().getName() + "がゲームモードをスペクテイターに変更しました");
                }
            }
        }
    }
}
