package phones;

public class ByPriceLowTag extends Tag {
    private double price;

    public ByPriceLowTag(double price) {
        this.price = price;
    }

    @Override
    public boolean find(Phone ph) {
        return ph.getPrice() < price;
    }
}