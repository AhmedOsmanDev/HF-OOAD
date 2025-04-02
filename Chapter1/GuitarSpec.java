
public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public boolean equals(GuitarSpec anObject) {
        if (builder != anObject.builder)
            return false;
        if (model != null && !model.equals(anObject.model))
            return false;
        if (type != anObject.type)
            return false;
        if (numStrings != anObject.numStrings)
            return false;
        if (backWood != anObject.backWood)
            return false;
        if (topWood != anObject.topWood)
            return false;

        return true;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
