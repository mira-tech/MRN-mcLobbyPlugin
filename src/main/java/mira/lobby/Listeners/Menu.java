package mira.lobby.Listeners;import org.bukkit.Bukkit;import org.bukkit.ChatColor;import org.bukkit.Material;import org.bukkit.entity.Player;import org.bukkit.event.EventHandler;import org.bukkit.event.Listener;import org.bukkit.event.block.Action;import org.bukkit.event.player.PlayerInteractEvent;import org.bukkit.inventory.ItemStack;import org.bukkit.plugin.Plugin;public class Menu implements Listener {    //この下がコンストラクタ    Plugin plugin;    public Menu(Plugin me) {        this.plugin = me;        Bukkit.getPluginManager().registerEvents(this, plugin);    }    @EventHandler    public void onInteract(PlayerInteractEvent e) {        Action action = e.getAction();        Player p = e.getPlayer();        ItemStack item = e.getItem();        if (action.equals(Action.RIGHT_CLICK_BLOCK)) {            if (item.getType().equals(Material.PAPER)) {                p.sendMessage(ChatColor.DARK_PURPLE + "§lComing Soon");            } else if (action.equals(Action.RIGHT_CLICK_AIR)) {                if (item.getType().equals(Material.PAPER)) {                    p.sendMessage(ChatColor.DARK_PURPLE + "§lComing Soon");                }            }        }    }}