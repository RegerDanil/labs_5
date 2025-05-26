package phones;
import java.awt.Color;

public class ByColorTag extends Tag {
    private Color color;

    public ByColorTag(Color color) {
        this.color = color;
    }

    @Override
    public boolean find(Phone ph) {
        return ph.getColor() == color;
    }
}
