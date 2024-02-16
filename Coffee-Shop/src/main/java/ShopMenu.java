import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ShopMenu {

    List<MenuItem> menuItems = new ArrayList<>();

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Map<MenuItem, String> itemsByType = new HashMap<>();

    public String welcomeToTheShop() {
        return "##### WELCOME #####\n##### TO KAE'S COFFEESHOP! #####\n";
    }

    public void createMenuList() {
        File menuFile = new File("C:\\Users\\Student\\workspace\\Coffee-Shop\\Coffee-Shop\\CoffeeShopMenu.txt");
        try (Scanner fileReader = new Scanner(menuFile)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] itemInfo = line.split(",");
                MenuItem item = createItem(itemInfo);
                menuItems.add(item);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Menu file not found!");
        }
    }
    
//    public String createDrinkMenu(List<MenuItem> menuItems) {
//        String CoffeeMenu = "##### COFFEE #####";
//        String espressoMenu = "##### ESPRESSO #####";
//        for (int i = 0; i < menuItems.size(); i++) {
//            String itemName;
//            String itemSize;
//            String itemCost;
//        }
//        return espressoMenu;
//    }


    public String formatMenu(String name, String size, String price) {
        return String.format("\n %10s | %10s | %4d", name, size, price);
    }

    public MenuItem createItem(String[] itemInfo) {
        if (itemInfo[0].equals("coffee") || itemInfo[0].equals("espressoDrink")) {
            String itemName = itemInfo[1];
            String itemSize = itemInfo[2];
            String itemCost = itemInfo[3];

            if (itemInfo[0].equals("coffee")) {
                return new CoffeeDrink(itemName, itemCost, itemSize);
            } else {
                return new EspressoDrink(itemName, itemCost, itemSize);
            }
        } else {
            String itemName = itemInfo[1];
            String itemCost = itemInfo[2];
            return new Pastry(itemName, itemCost);
        }
    }

}
