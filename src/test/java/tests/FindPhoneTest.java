package tests;
import java.awt.Color;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import phones.ByModelTag;
import phones.FindPhone;
import phones.Phone;
import phones.Tag;

public class FindPhoneTest {

    @Test
    public void testFindByTag() {
        FindPhone findPhone = new FindPhone();
        Tag modelTag = new ByModelTag("nokii");
        List<Phone> phones = findPhone.findByTag(modelTag);
        for (Phone phone : phones) {
            System.out.println(phone.toString());
        }
    }

    @Test
    public void testByModelAndPriceLowAndColor() {
        FindPhone findPhone = new FindPhone();
        List<Phone> phones = findPhone.byModelAndPriceLowAndColor("nokii", 12000, Color.PINK);
        for (Phone phone : phones) {
            System.out.println(phone.toString());
        }
    }
}
