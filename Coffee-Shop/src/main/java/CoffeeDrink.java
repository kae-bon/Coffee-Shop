import java.awt.*;
import java.math.BigDecimal;

public class CoffeeDrink extends MenuItem implements HaveVariousSizes {

    private String itemSize;

    public CoffeeDrink(String itemName, String itemPrice, String itemSize) {
        super(itemName, itemPrice, "Coffee");
        this.itemSize = itemSize;
    }

    public String getSize() {
        return this.itemSize;
    }

    public String getItemType() {
        return "Coffee";
    }

    @Override
    public String toString() {
        return String.format("%-13s | %-6s | %.2f", this.getItemName(), this.getSize(), this.getItemPrice());
    }

}
