import java.util.List;

public class CoffeeShop {
    public static void main(String[] args) {

        ShopMenu ourMenu = new ShopMenu();
        ourMenu.createMenuList();
        List<MenuItem> menuList = ourMenu.getMenuItems();
        for (MenuItem item : menuList) {
            System.out.println(item.toString());
        }


    }
}
