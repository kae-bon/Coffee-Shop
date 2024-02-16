import java.awt.*;
import java.math.BigDecimal;

public class CoffeeDrink extends MenuItem implements HaveVariousSizes {

    private String itemSize;

    public CoffeeDrink(String itemName, String itemPrice, String itemSize) {
        super(itemName, itemPrice);
        this.itemSize = itemSize;
    }

    public String getSize() {
        return this.itemSize;
    }

    public String getItemType() {
        return "Coffee";
    }

    @Override
    public BigDecimal getPrice() {
        return this.getItemPrice();
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %.2f", this.getItemName(), this.getSize(), this.getPrice());
    }

}
