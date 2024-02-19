import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class ShopMenu {
    // WHAT THIS CLASS IS DOING: Creating a menu
    private Inventory shopInventory = new Inventory();

    public String getShopMenu() {
        return createShopMenu(shopInventory.getInventoryItems());
    }

    private String createShopMenu(List<MenuItem> menuItems) {
        String coffeeMenu = "\n##### COFFEE #####\n";
        String espressoMenu = "\n##### ESPRESSO #####\n";
        String pastryMenu = "\n##### PASTRIES #####\n";

        for (MenuItem item : menuItems) {
            if (item.getItemType().equals("Coffee")) {
                coffeeMenu = coffeeMenu + item + "\n";
            } else if (item.getItemType().equals("EspressoDrink")) {
                espressoMenu = espressoMenu + item + "\n";
            } else {
                pastryMenu = pastryMenu + item + "\n";
            }

        }
        return coffeeMenu + espressoMenu + pastryMenu;
    }
}
