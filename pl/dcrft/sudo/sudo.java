package pl.dcrft.sudo;

import org.bukkit.command.CommandSender;

public class sudo extends org.bukkit.plugin.java.JavaPlugin
{
  public sudo() {}
  
  public void onEnable()
  {
    System.out.println("Włączono plugin.");
  }
  
  public void onDisable() { System.out.println("Wyłączono plugin."); }
  

  public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args)
  {
    if (command.getName().equalsIgnoreCase("chatsudo")) {
      if (!sender.hasPermission("cs.adm")) {
        sender.sendMessage("§7[§3§lDCSudo§7] Nie masz do tego dostępu.");
        return false;
      }
      
      if ((sender.hasPermission("cs.adm"))) {
        if((sender instanceof org.bukkit.entity.Player)) {
        if (args.length == 0)
          sender.sendMessage("§7[§3§lDCSudo§7] Podaj gracza.");
        if ((sender instanceof org.bukkit.entity.Player)) {
          if (args.length == 1)
            sender.sendMessage("§7[§3§lDCSudo§7] Podaj wiadomość.");
          if (((sender instanceof org.bukkit.entity.Player)) && 
            (args.length >= 2)) {
            if (!(getServer().getPlayer(args[0]) instanceof org.bukkit.entity.Player)) {
              sender.sendMessage("§7[§3§lDCSudo§7] Nie ma takiego gracza.");
            }
            if ((getServer().getPlayer(args[0]) instanceof org.bukkit.entity.Player)) {
              StringBuilder sb = new StringBuilder();
              for (int i = 1; i < args.length; i++) {
                sb.append(args[i]).append(" ");
                

                String allArgs = sb.toString().trim();
                
                org.bukkit.entity.Player p = getServer().getPlayer(args[0]);
                p.chat(allArgs);
                sender.sendMessage("§7[§3§lDCSudo§7] Wysłano wiadomość za gracza.");
              }
            }
          }
        }
      }
    }
    














    
  }
	return false;
}
}
