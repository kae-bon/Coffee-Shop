public class EspressoDrink extends MenuItem implements HaveVariousSizes {

    private String size;
    public EspressoDrink(String itemName, String itemPrice, String size) {
        super(itemName, itemPrice, "EspressoDrink");
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
    public String toString() {
        return String.format("%-13s | %-4s | %.2f", this.getItemName(), this.getSize(), this.getItemPrice());
    }
}
