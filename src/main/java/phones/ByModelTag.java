package phones;

public class ByModelTag extends Tag {
    private String model;

    public ByModelTag(String model) {
        this.model = model;
    }

    @Override
    public boolean find(Phone ph) {
        return ph.getModel().equalsIgnoreCase(model);
    }
}