import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class ShopMenu {
    // WHAT THIS CLASS IS DOING: Creating a shop menu
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

    private int getLongestItemName(List<MenuItem> menuItems) {
        String itemName = menuItems.get(0).getItemName();
        int lengthLongestString = itemName.length();
        for (int i = 1; i < menuItems.size(); i++) {
            if (lengthLongestString < menuItems.get(i).getItemType().length()) {
                lengthLongestString = menuItems.get(i).getItemName().length();
            }
        }
        return lengthLongestString;
    }
}
