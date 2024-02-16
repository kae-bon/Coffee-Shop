import java.awt.*;
import java.math.BigDecimal;

public abstract class MenuItem implements Purchasable{

    private String itemName;

    private BigDecimal itemPrice;
    private String itemType;
    private String itemSize;

    public MenuItem(String itemName, String itemPrice) {
        this.itemName = itemName;
        this.itemPrice = new BigDecimal(itemPrice);
    }

    public String getItemName() {
        return itemName;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public String getItemSize() {
        return itemSize;
    }

    @Override
    public abstract String toString();
    public abstract String getItemType();

}
