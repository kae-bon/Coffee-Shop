import java.math.BigDecimal;

public class Pastry extends MenuItem {
    public Pastry(String itemName, String itemPrice) {
        super(itemName, itemPrice);
    }

    public String getItemType() {
        return "Pastry";
    }

    @Override
    public String toString() {
        return String.format("%s | %.2f", this.getItemName(), this.getPrice());
    }

    @Override
    public BigDecimal getPrice() {
        return this.getItemPrice();
    }

}
