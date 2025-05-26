package phones;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

public class FindPhone {
    private List<Phone> data = new PhoneDB().getPhoneData();

    public List<Phone> findByTag(Tag tag) {
        List<Phone> find = new LinkedList<>();
        for (Phone ph : data) {
            if (tag.find(ph)) {
                find.add(ph);
            }
        }
        return find;
    }

    public List<Phone> byModelAndPriceLowAndColor(String mod, double price, Color color) {
        Tag modelTag = new ByModelTag(mod);
        Tag priceTag = new ByPriceLowTag(price);
        Tag colorTag = new ByColorTag(color);

        List<Phone> find = new LinkedList<>();
        for (Phone ph : data) {
            if (modelTag.find(ph) && priceTag.find(ph) && colorTag.find(ph)) {
                find.add(ph);
            }
        }
        return find;
    }
}
