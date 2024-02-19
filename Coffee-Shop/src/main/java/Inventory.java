import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    // PURPOSE: Reads file and creates inventory array from that file
    // Then creates MenuItem object instances for each element in the inventory array
    // WHAT THIS CLASS IS DOING: Inventory management
    private List<MenuItem> inventoryItems = new ArrayList<>();

    public List<MenuItem> getInventoryItems() {
        createInventoryItemList();
        return inventoryItems;
    }

    public void createInventoryItemList() {
        File menuFile = new File("C:\\Users\\Student\\workspace\\Coffee-Shop\\Coffee-Shop\\CoffeeShopMenu.txt");
        try (Scanner fileReader = new Scanner(menuFile)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] itemInfo = line.split(",");
                MenuItem item = createItem(itemInfo);
                inventoryItems.add(item);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Menu file not found!");
        }
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
