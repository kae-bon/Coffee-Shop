import java.math.BigDecimal;

public class Pastry extends MenuItem {
    public Pastry(String itemName, String itemPrice) {
        super(itemName, itemPrice, "Pastry");
    }

    public String getItemType() {
        return "Pastry";
    }

    @Override
    public String toString() {
        return String.format("%-22s | %.2f", this.getItemName(), this.getItemPrice());
    }

}
