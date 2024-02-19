import java.awt.*;
import java.math.BigDecimal;

public abstract class MenuItem implements Purchasable {

    private String itemName;
    private BigDecimal itemPrice;
    private String itemType;

    public MenuItem(String itemName, String itemPrice, String itemType) {
        this.itemName = itemName;
        this.itemPrice = new BigDecimal(itemPrice);
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public String getItemType() {
        return itemType;
    }

}
