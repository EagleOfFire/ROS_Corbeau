package eagleoffire;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Random;

public final class roscorbeau extends JavaPlugin {

  @Override
  public void onEnable() {
    // Plugin startup logic
    System.out.println("CROAAAAAAA!!!!!");
  }

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    Random rand = new Random();
    int n = rand.nextInt(100);
    n += 1;
    if(n > 5) {
      if (command.getName().equalsIgnoreCase("corbeau")) {
        if (sender instanceof Player) {
          Player emetteur = (Player) sender;
          if (emetteur.getInventory().getItemInMainHand().getType().equals(Material.BOOK_AND_QUILL) || emetteur.getInventory().getItemInMainHand().getType().equals(Material.WRITTEN_BOOK)) {
            switch (args[0]) {
              case "Konoha":
                Block KonohaChest = emetteur.getLocation().getWorld().getBlockAt(-1634, 76, -4344);
                BlockState KonohaChestState = KonohaChest.getState();
                if (KonohaChestState instanceof Chest) {
                  Chest pigeonniere = (Chest) KonohaChestState;
                  Inventory inv = pigeonniere.getBlockInventory();
                  inv.addItem(emetteur.getInventory().getItemInMainHand().clone());
                  emetteur.getInventory().remove(emetteur.getItemInHand());
                  emetteur.sendMessage("Le corbeau est arrivé a Konoha");
                } else {
                  emetteur.sendMessage("Le corbeau est revenue sans avoir trouvé le pigeonnier");
                }
                break;
              case "Suna":
                Block SunaChest = emetteur.getLocation().getWorld().getBlockAt(-8969, 90, -437);
                BlockState SunaChestState = SunaChest.getState();
                if (SunaChestState instanceof Chest) {
                  Chest pigeonniere = (Chest) SunaChestState;
                  Inventory inv = pigeonniere.getBlockInventory();
                  inv.addItem(emetteur.getInventory().getItemInMainHand().clone());
                  emetteur.getInventory().remove(emetteur.getItemInHand());
                  emetteur.sendMessage("Le corbeau est arrivé a Suna");
                } else {
                  emetteur.sendMessage("Le corbeau est revenue sans avoir trouvé le pigeonnier");
                }
                break;
              case "Iwa":
                Block IwaChest = emetteur.getLocation().getWorld().getBlockAt(-6309, 188, -8849);
                BlockState IwaChestState = IwaChest.getState();
                if (IwaChestState instanceof Chest) {
                  Chest pigeonniere = (Chest) IwaChestState;
                  Inventory inv = pigeonniere.getBlockInventory();
                  inv.addItem(emetteur.getInventory().getItemInMainHand().clone());
                  emetteur.getInventory().remove(emetteur.getItemInHand());
                  emetteur.sendMessage("Le corbeau est arrivé a Iwa");
                } else {
                  emetteur.sendMessage("Le corbeau est revenue sans avoir trouvé le pigeonnier");
                }
                break;
              case "Kiri":
                Block KiriChest = emetteur.getLocation().getWorld().getBlockAt(6572, 105, -2254);
                BlockState KiriChestState = KiriChest.getState();
                if (KiriChestState instanceof Chest) {
                  Chest pigeonniere = (Chest) KiriChestState;
                  Inventory inv = pigeonniere.getBlockInventory();
                  inv.addItem(emetteur.getInventory().getItemInMainHand().clone());
                  emetteur.getInventory().remove(emetteur.getItemInHand());
                  emetteur.sendMessage("Le corbeau est arrivé a Kiri");
                } else {
                  emetteur.sendMessage("Le corbeau est revenue sans avoir trouvé le pigeonnier");
                }
                break;
              case "Kumo":
                Block KumoChest = emetteur.getLocation().getWorld().getBlockAt(5781, 107, -8542);
                BlockState KumoChestState = KumoChest.getState();
                if (KumoChestState instanceof Chest) {
                  Chest pigeonniere = (Chest) KumoChestState;
                  Inventory inv = pigeonniere.getBlockInventory();
                  inv.addItem(emetteur.getInventory().getItemInMainHand().clone());
                  emetteur.getInventory().remove(emetteur.getItemInHand());
                  emetteur.sendMessage("Le corbeau est arrivé a Kumo");
                } else {
                  emetteur.sendMessage("Le corbeau est revenue sans avoir trouvé le pigeonnier");
                }
                break;
              default:
                if (Bukkit.getPlayer(args[0]) != null) {
                  Player destinataire = Bukkit.getPlayer(args[0]);
                  destinataire.getInventory().addItem(emetteur.getInventory().getItemInMainHand().clone());
                  emetteur.sendMessage("Le corbeau est arrivé sur " + destinataire.getName());
                  destinataire.sendMessage("Vous avez recu un message d'un corbeau");
                  emetteur.getInventory().remove(emetteur.getItemInHand());
                } else {
                  emetteur.sendMessage("Le destinataire n'est pas joignable");
                }
            }
          } else {
            emetteur.sendMessage("Vous avez besoin d'un livre");
          }
        }
      }
    }
    return true;
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
    System.out.println("Gun shot sound");
  }
}