import java.math.BigDecimal;

public class EspressoDrink extends MenuItem implements HaveVariousSizes {

    private String size;
    public EspressoDrink(String itemName, String itemPrice, String size) {
        super(itemName, itemPrice);
        this.size = size;
    }

    public String getItemType() {
        return "EspressoDrink";
    }

    @Override
    public String getSize() {
        return this.size;
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
